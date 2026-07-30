package com.pichillilorenzo.flutter_inappwebview_android;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import s4.n;
import s4.p;
import s4.q;
import u0.d;

/* loaded from: classes.dex */
public class WebViewFeatureManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "WebViewFeatureManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webviewfeature";
    public InAppWebViewFlutterPlugin plugin;

    public WebViewFeatureManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new q(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
        String str = nVar.f7767a;
        str.getClass();
        if (!str.equals("isStartupFeatureSupported")) {
            if (str.equals("isFeatureSupported")) {
                pVar.success(Boolean.valueOf(d.a((String) nVar.a("feature"))));
                return;
            } else {
                pVar.notImplemented();
                return;
            }
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
            return;
        }
        pVar.success(Boolean.valueOf(d.b(this.plugin.activity, (String) nVar.a("startupFeature"))));
    }
}
