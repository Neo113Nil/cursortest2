package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import V6.a;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r4.f;
import s4.q;
import u0.d;
import u0.n;
import u0.o;
import u0.p;
import u0.y;
import v0.AbstractC0962f;
import v0.B;
import v0.F;
import v0.J;

/* loaded from: classes.dex */
public class WebMessageChannel implements Disposable {
    protected static final String LOG_TAG = "WebMessageChannel";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_channel_";
    public WebMessageChannelChannelDelegate channelDelegate;
    public final List<p> compatPorts;
    public String id;
    public final List<WebMessagePort> ports;
    public InAppWebViewInterface webView;

    public WebMessageChannel(String str, InAppWebViewInterface inAppWebViewInterface) {
        p[] pVarArr;
        this.id = str;
        this.channelDelegate = new WebMessageChannelChannelDelegate(this, new q(inAppWebViewInterface.getPlugin().messenger, f.i(METHOD_CHANNEL_NAME_PREFIX, str)));
        if (inAppWebViewInterface instanceof InAppWebView) {
            Uri uri = y.f8069a;
            F.f8172w.getClass();
            android.webkit.WebMessagePort[] c7 = AbstractC0962f.c((InAppWebView) inAppWebViewInterface);
            if (c7 == null) {
                pVarArr = null;
            } else {
                p[] pVarArr2 = new p[c7.length];
                for (int i2 = 0; i2 < c7.length; i2++) {
                    pVarArr2[i2] = new B(c7[i2]);
                }
                pVarArr = pVarArr2;
            }
            this.compatPorts = new ArrayList(Arrays.asList(pVarArr));
            this.ports = new ArrayList();
        } else {
            this.ports = Arrays.asList(new WebMessagePort("port1", this), new WebMessagePort("port2", this));
            this.compatPorts = new ArrayList();
        }
        this.webView = inAppWebViewInterface;
    }

    public void closeForInAppWebView(Integer num, s4.p pVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !d.a("WEB_MESSAGE_PORT_CLOSE")) {
            pVar.success(Boolean.TRUE);
            return;
        }
        try {
            B b7 = (B) this.compatPorts.get(num.intValue());
            b7.getClass();
            F.f8169t.getClass();
            AbstractC0962f.a(b7.c());
            pVar.success(Boolean.TRUE);
        } catch (Exception e7) {
            pVar.error(LOG_TAG, e7.getMessage(), null);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        if (d.a("WEB_MESSAGE_PORT_CLOSE")) {
            Iterator<p> it = this.compatPorts.iterator();
            while (it.hasNext()) {
                try {
                    B b7 = (B) it.next();
                    b7.getClass();
                    F.f8169t.getClass();
                    AbstractC0962f.a(b7.c());
                } catch (Exception unused) {
                }
            }
        }
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.compatPorts.clear();
        this.webView = null;
    }

    public void initJsInstance(InAppWebViewInterface inAppWebViewInterface, final ValueCallback<WebMessageChannel> valueCallback) {
        if (inAppWebViewInterface != null) {
            inAppWebViewInterface.evaluateJavascript(f.f(new StringBuilder("(function() {window.flutter_inappwebview._webMessageChannels['"), this.id, "'] = new MessageChannel();})();"), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    valueCallback.onReceiveValue(this);
                }
            });
        } else {
            valueCallback.onReceiveValue(this);
        }
    }

    public void onMessage(int i2, WebMessageCompatExt webMessageCompatExt) {
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.onMessage(i2, webMessageCompatExt);
        }
    }

    public void postMessageForInAppWebView(Integer num, WebMessageCompatExt webMessageCompatExt, s4.p pVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !d.a("WEB_MESSAGE_PORT_POST_MESSAGE")) {
            pVar.success(Boolean.TRUE);
            return;
        }
        p pVar2 = this.compatPorts.get(num.intValue());
        ArrayList arrayList = new ArrayList();
        List<WebMessagePortCompatExt> ports = webMessageCompatExt.getPorts();
        if (ports != null) {
            for (WebMessagePortCompatExt webMessagePortCompatExt : ports) {
                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(webMessagePortCompatExt.getWebMessageChannelId());
                if (webMessageChannel != null) {
                    arrayList.add(webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                }
            }
        }
        Object data = webMessageCompatExt.getData();
        try {
            if (d.a("WEB_MESSAGE_ARRAY_BUFFER") && data != null && webMessageCompatExt.getType() == 1) {
                pVar2.a(new n((byte[]) data, (p[]) arrayList.toArray(new p[0])));
            } else {
                pVar2.a(new n(data != null ? data.toString() : null, (p[]) arrayList.toArray(new p[0])));
            }
            pVar.success(Boolean.TRUE);
        } catch (Exception e7) {
            pVar.error(LOG_TAG, e7.getMessage(), null);
        }
    }

    public void setWebMessageCallbackForInAppWebView(final int i2, s4.p pVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !d.a("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
            pVar.success(Boolean.TRUE);
            return;
        }
        p pVar2 = this.compatPorts.get(i2);
        try {
            o oVar = new o() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.2
                @Override // u0.o
                public void onMessage(p pVar3, n nVar) {
                    this.onMessage(i2, nVar != null ? WebMessageCompatExt.fromMapWebMessageCompat(nVar) : null);
                }
            };
            B b7 = (B) pVar2;
            b7.getClass();
            if (F.f8171v.b()) {
                b7.b().setWebMessageCallback(new a(new J(2, oVar)));
            } else {
                AbstractC0962f.l(b7.c(), oVar);
            }
            pVar.success(Boolean.TRUE);
        } catch (Exception e7) {
            pVar.error(LOG_TAG, e7.getMessage(), null);
        }
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.id);
        return hashMap;
    }
}
