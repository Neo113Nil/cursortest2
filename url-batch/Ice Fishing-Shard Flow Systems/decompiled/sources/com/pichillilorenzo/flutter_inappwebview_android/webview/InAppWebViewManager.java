package com.pichillilorenzo.flutter_inappwebview_android.webview;

import S.j;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s4.n;
import s4.p;
import s4.q;
import u0.d;
import u0.y;
import v0.AbstractC0966j;
import v0.C0958b;
import v0.F;
import v0.H;

/* loaded from: classes.dex */
public class InAppWebViewManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "InAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
    public final Map<String, FlutterWebView> keepAliveWebViews;
    public InAppWebViewFlutterPlugin plugin;
    public int windowAutoincrementId;
    public final Map<Integer, Message> windowWebViewMessages;

    public InAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new q(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.keepAliveWebViews = new HashMap();
        this.windowWebViewMessages = new HashMap();
        this.windowAutoincrementId = 0;
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void clearAllCache(Context context, boolean z7) {
        WebView webView = new WebView(context);
        webView.clearCache(z7);
        webView.destroy();
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("versionName", packageInfo.versionName);
        hashMap.put("packageName", packageInfo.packageName);
        return hashMap;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        Iterator<FlutterWebView> it = this.keepAliveWebViews.values().iterator();
        while (it.hasNext()) {
            String str = it.next().keepAliveId;
            if (str != null) {
                disposeKeepAlive(str);
            }
        }
        this.keepAliveWebViews.clear();
        this.windowWebViewMessages.clear();
        this.plugin = null;
    }

    public void disposeKeepAlive(String str) {
        ViewGroup viewGroup;
        FlutterWebView flutterWebView = this.keepAliveWebViews.get(str);
        if (flutterWebView != null) {
            flutterWebView.keepAliveId = null;
            View view = flutterWebView.getView();
            if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                viewGroup.removeView(view);
            }
            flutterWebView.dispose();
        }
        if (this.keepAliveWebViews.containsKey(str)) {
            this.keepAliveWebViews.put(str, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, final p pVar) {
        Uri safeBrowsingPrivacyPolicyUrl;
        Context context;
        String str = nVar.f7767a;
        str.getClass();
        char c7 = 65535;
        switch (str.hashCode()) {
            case -1496477679:
                if (str.equals("disableWebView")) {
                    c7 = 0;
                    break;
                }
                break;
            case -910403233:
                if (str.equals("setWebContentsDebuggingEnabled")) {
                    c7 = 1;
                    break;
                }
                break;
            case -633518365:
                if (str.equals("getVariationsHeader")) {
                    c7 = 2;
                    break;
                }
                break;
            case -436220260:
                if (str.equals("clearClientCertPreferences")) {
                    c7 = 3;
                    break;
                }
                break;
            case 258673215:
                if (str.equals("getSafeBrowsingPrivacyPolicyUrl")) {
                    c7 = 4;
                    break;
                }
                break;
            case 426229521:
                if (str.equals("setSafeBrowsingAllowlist")) {
                    c7 = 5;
                    break;
                }
                break;
            case 643643439:
                if (str.equals("getDefaultUserAgent")) {
                    c7 = 6;
                    break;
                }
                break;
            case 1033609166:
                if (str.equals("clearAllCache")) {
                    c7 = 7;
                    break;
                }
                break;
            case 1586319888:
                if (str.equals("getCurrentWebViewPackage")) {
                    c7 = '\b';
                    break;
                }
                break;
            case 1667434977:
                if (str.equals("isMultiProcessEnabled")) {
                    c7 = '\t';
                    break;
                }
                break;
            case 1867011305:
                if (str.equals("disposeKeepAlive")) {
                    c7 = '\n';
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 28) {
                    WebView.disableWebView();
                }
                pVar.success(Boolean.TRUE);
                return;
            case 1:
                WebView.setWebContentsDebuggingEnabled(((Boolean) nVar.a("debuggingEnabled")).booleanValue());
                pVar.success(Boolean.TRUE);
                return;
            case 2:
                if (!d.a("GET_VARIATIONS_HEADER")) {
                    pVar.success(null);
                    return;
                }
                Uri uri = y.f8069a;
                if (!F.f8147L.b()) {
                    throw F.a();
                }
                pVar.success(H.f8177a.getStatics().getVariationsHeader());
                return;
            case 3:
                WebView.clearClientCertPreferences(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        pVar.success(Boolean.TRUE);
                    }
                });
                return;
            case 4:
                if (!d.a("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                    pVar.success(null);
                    return;
                }
                Uri uri2 = y.f8069a;
                C0958b c0958b = F.f8157g;
                if (c0958b.a()) {
                    safeBrowsingPrivacyPolicyUrl = AbstractC0966j.b();
                } else {
                    if (!c0958b.b()) {
                        throw F.a();
                    }
                    safeBrowsingPrivacyPolicyUrl = H.f8177a.getStatics().getSafeBrowsingPrivacyPolicyUrl();
                }
                pVar.success(safeBrowsingPrivacyPolicyUrl.toString());
                return;
            case 5:
                if (d.a("SAFE_BROWSING_ALLOWLIST")) {
                    y.f(new HashSet((List) nVar.a("hosts")), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.2
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            pVar.success(bool);
                        }
                    });
                    return;
                }
                if (!d.a("SAFE_BROWSING_WHITELIST")) {
                    pVar.success(Boolean.FALSE);
                    return;
                }
                List list = (List) nVar.a("hosts");
                ValueCallback<Boolean> valueCallback = new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.3
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(Boolean bool) {
                        pVar.success(bool);
                    }
                };
                Uri uri3 = y.f8069a;
                y.f(new HashSet(list), valueCallback);
                return;
            case 6:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null) {
                    pVar.success(WebSettings.getDefaultUserAgent(inAppWebViewFlutterPlugin.applicationContext));
                    return;
                } else {
                    pVar.success(null);
                    return;
                }
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null) {
                    Context context2 = inAppWebViewFlutterPlugin2.activity;
                    if (context2 == null) {
                        context2 = inAppWebViewFlutterPlugin2.applicationContext;
                    }
                    if (context2 != null) {
                        clearAllCache(context2, ((Boolean) nVar.a("includeDiskFiles")).booleanValue());
                    }
                }
                pVar.success(Boolean.TRUE);
                return;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null) {
                    context = inAppWebViewFlutterPlugin3.activity;
                    if (context == null) {
                        context = inAppWebViewFlutterPlugin3.applicationContext;
                    }
                } else {
                    context = null;
                }
                PackageInfo b7 = context != null ? y.b(context) : null;
                pVar.success(b7 != null ? convertWebViewPackageToMap(b7) : null);
                return;
            case '\t':
                if (!d.a("MULTI_PROCESS")) {
                    pVar.success(Boolean.FALSE);
                    return;
                }
                Uri uri4 = y.f8069a;
                if (!F.f8141F.b()) {
                    throw F.a();
                }
                pVar.success(Boolean.valueOf(H.f8177a.getStatics().isMultiProcessEnabled()));
                return;
            case '\n':
                String str2 = (String) nVar.a("keepAliveId");
                if (str2 != null) {
                    disposeKeepAlive(str2);
                }
                pVar.success(Boolean.TRUE);
                return;
            default:
                pVar.notImplemented();
                return;
        }
    }
}
