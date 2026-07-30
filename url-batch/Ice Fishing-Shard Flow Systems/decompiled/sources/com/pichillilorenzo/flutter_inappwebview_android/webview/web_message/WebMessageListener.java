package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import C4.p;
import V6.a;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s4.f;
import s4.q;
import u0.AbstractC0942a;
import u0.d;
import u0.n;
import u0.x;
import v0.C0956A;
import v0.F;
import v0.r;

/* loaded from: classes.dex */
public class WebMessageListener implements Disposable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String LOG_TAG = "WebMessageListener";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_listener_";
    public Set<String> allowedOriginRules;
    public WebMessageListenerChannelDelegate channelDelegate;
    public String id;
    public String jsObjectName;
    public x listener;
    public AbstractC0942a replyProxy;
    public InAppWebViewInterface webView;

    public WebMessageListener(String str, InAppWebViewInterface inAppWebViewInterface, f fVar, String str2, Set<String> set) {
        this.id = str;
        this.webView = inAppWebViewInterface;
        this.jsObjectName = str2;
        this.allowedOriginRules = set;
        this.channelDelegate = new WebMessageListenerChannelDelegate(this, new q(fVar, METHOD_CHANNEL_NAME_PREFIX + this.id + "_" + this.jsObjectName));
        if (this.webView instanceof InAppWebView) {
            this.listener = new x() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener.1
                @Override // u0.x
                public void onPostMessage(WebView webView, n nVar, Uri uri, boolean z7, AbstractC0942a abstractC0942a) {
                    WebMessageListener webMessageListener = WebMessageListener.this;
                    webMessageListener.replyProxy = abstractC0942a;
                    WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = webMessageListener.channelDelegate;
                    if (webMessageListenerChannelDelegate != null) {
                        webMessageListenerChannelDelegate.onPostMessage(WebMessageCompatExt.fromMapWebMessageCompat(nVar), uri.toString().equals("null") ? null : uri.toString(), z7);
                    }
                }
            };
        }
    }

    public static WebMessageListener fromMap(InAppWebViewInterface inAppWebViewInterface, f fVar, Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessageListener((String) map.get("id"), inAppWebViewInterface, fVar, (String) map.get("jsObjectName"), new HashSet((List) map.get("allowedOriginRules")));
    }

    public void assertOriginRulesValid() {
        int i2 = 0;
        for (String str : this.allowedOriginRules) {
            if (str == null) {
                throw new Exception(p.h(i2, "allowedOriginRules[", "] is null"));
            }
            if (str.isEmpty()) {
                throw new Exception(p.h(i2, "allowedOriginRules[", "] is empty"));
            }
            if (!"*".equals(str)) {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                String path = parse.getPath();
                int port = parse.getPort();
                if (scheme == null) {
                    throw new Exception(r4.f.d("allowedOriginRules ", str, " is invalid"));
                }
                if (("http".equals(scheme) || "https".equals(scheme)) && (host == null || host.isEmpty())) {
                    throw new Exception(r4.f.d("allowedOriginRules ", str, " is invalid"));
                }
                if (!"http".equals(scheme) && !"https".equals(scheme) && (host != null || port != -1)) {
                    throw new Exception(r4.f.d("allowedOriginRules ", str, " is invalid"));
                }
                if ((host == null || host.isEmpty()) && port != -1) {
                    throw new Exception(r4.f.d("allowedOriginRules ", str, " is invalid"));
                }
                if (!path.isEmpty()) {
                    throw new Exception(r4.f.d("allowedOriginRules ", str, " is invalid"));
                }
                if (host != null) {
                    int indexOf = host.indexOf("*");
                    if (indexOf != 0 || (indexOf == 0 && !host.startsWith("*."))) {
                        throw new Exception(r4.f.d("allowedOriginRules ", str, " is invalid"));
                    }
                    if (host.startsWith("[")) {
                        if (!host.endsWith("]")) {
                            throw new Exception(r4.f.d("allowedOriginRules ", str, " is invalid"));
                        }
                        if (!Util.isIPv6(host.substring(1, host.length() - 1))) {
                            throw new Exception(r4.f.d("allowedOriginRules ", str, " is invalid"));
                        }
                    }
                }
                i2++;
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = this.channelDelegate;
        if (webMessageListenerChannelDelegate != null) {
            webMessageListenerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.listener = null;
        this.replyProxy = null;
        this.webView = null;
    }

    public void initJsInstance() {
        if (this.webView != null) {
            String replaceAll = Util.replaceAll(this.jsObjectName, "'", "\\'");
            ArrayList arrayList = new ArrayList();
            for (String str : this.allowedOriginRules) {
                if ("*".equals(str)) {
                    arrayList.add("'*'");
                } else {
                    Uri parse = Uri.parse(str);
                    String str2 = parse.getHost() != null ? "'" + Util.replaceAll(parse.getHost(), "'", "\\'") + "'" : "null";
                    StringBuilder sb = new StringBuilder("{scheme: '");
                    sb.append(parse.getScheme());
                    sb.append("', host: ");
                    sb.append(str2);
                    sb.append(", port: ");
                    sb.append(parse.getPort() != -1 ? Integer.valueOf(parse.getPort()) : "null");
                    sb.append("}");
                    arrayList.add(sb.toString());
                }
            }
            String join = TextUtils.join(", ", arrayList);
            StringBuilder sb2 = new StringBuilder("(function() {  var allowedOriginRules = [");
            sb2.append(join);
            sb2.append("];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window.flutter_inappwebview._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['");
            sb2.append(replaceAll);
            sb2.append("'] = new FlutterInAppWebViewWebMessageListener('");
            this.webView.getUserContentController().addPluginScript(new PluginScript("WebMessageListener-" + this.jsObjectName, r4.f.f(sb2, replaceAll, "');  }})();"), UserScriptInjectionTime.AT_DOCUMENT_START, null, false, null));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:17|(2:72|(1:74)(1:75))(1:21)|(2:69|(1:71))(1:24)|25|(8:29|30|31|32|33|(1:63)(1:48)|(1:50)|(2:56|57))|68|31|32|33|(1:35)|63|(0)|(1:62)(4:52|54|56|57)) */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isOriginAllowed(String str, String str2, int i2) {
        String str3;
        boolean equals;
        Iterator<String> it = this.allowedOriginRules.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            String next = it.next();
            if ("*".equals(next)) {
                return true;
            }
            if (str != null && !str.isEmpty() && (!str.isEmpty() || ((str2 != null && !str2.isEmpty()) || (i2 != 0 && i2 != -1)))) {
                Uri parse = Uri.parse(next);
                int i5 = 80;
                int port = (parse.getPort() == -1 || parse.getPort() == 0) ? "https".equals(parse.getScheme()) ? 443 : 80 : parse.getPort();
                if (i2 != 0 && i2 != -1) {
                    i5 = i2;
                } else if ("https".equals(str)) {
                    i5 = 443;
                }
                String str4 = null;
                if (parse.getHost() != null && parse.getHost().startsWith("[")) {
                    try {
                        str3 = Util.normalizeIPv6(parse.getHost().substring(1, parse.getHost().length() - 1));
                    } catch (Exception unused) {
                    }
                    str4 = Util.normalizeIPv6(str2);
                    equals = parse.getScheme().equals(str);
                    boolean z7 = parse.getHost() != null || parse.getHost().isEmpty() || parse.getHost().equals(str2) || (parse.getHost().startsWith("*") && str2 != null && str2.contains(parse.getHost().split("\\*")[1])) || !(str4 == null || str3 == null || !str4.equals(str3));
                    boolean z8 = port == i5;
                    if (equals && z7 && z8) {
                        return true;
                    }
                }
                str3 = null;
                str4 = Util.normalizeIPv6(str2);
                equals = parse.getScheme().equals(str);
                if (parse.getHost() != null) {
                }
                if (port == i5) {
                }
                if (equals) {
                    return true;
                }
                continue;
            }
        }
    }

    public void postMessageForInAppWebView(WebMessageCompatExt webMessageCompatExt, s4.p pVar) {
        Object data;
        if (this.replyProxy != null && d.a("WEB_MESSAGE_LISTENER") && (data = webMessageCompatExt.getData()) != null) {
            if (d.a("WEB_MESSAGE_ARRAY_BUFFER") && webMessageCompatExt.getType() == 1) {
                byte[] bArr = (byte[]) data;
                r rVar = (r) this.replyProxy;
                rVar.getClass();
                if (!F.f8170u.b()) {
                    throw F.a();
                }
                rVar.f8196a.postMessageWithPayload(new a(new C0956A(bArr)));
            } else {
                AbstractC0942a abstractC0942a = this.replyProxy;
                String obj = data.toString();
                r rVar2 = (r) abstractC0942a;
                rVar2.getClass();
                if (!F.f8144I.b()) {
                    throw F.a();
                }
                rVar2.f8196a.postMessage(obj);
            }
        }
        pVar.success(Boolean.TRUE);
    }
}
