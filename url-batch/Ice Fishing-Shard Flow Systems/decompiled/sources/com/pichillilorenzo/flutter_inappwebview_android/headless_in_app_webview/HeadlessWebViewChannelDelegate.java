package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import java.util.HashMap;
import java.util.Map;
import s4.n;
import s4.p;
import s4.q;

/* loaded from: classes.dex */
public class HeadlessWebViewChannelDelegate extends ChannelDelegateImpl {
    private HeadlessInAppWebView headlessWebView;

    public HeadlessWebViewChannelDelegate(HeadlessInAppWebView headlessInAppWebView, q qVar) {
        super(qVar);
        this.headlessWebView = headlessInAppWebView;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.headlessWebView = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
        String str = nVar.f7767a;
        str.getClass();
        switch (str) {
            case "getSize":
                HeadlessInAppWebView headlessInAppWebView = this.headlessWebView;
                if (headlessInAppWebView == null) {
                    pVar.success(null);
                    break;
                } else {
                    Size2D size = headlessInAppWebView.getSize();
                    pVar.success(size != null ? size.toMap() : null);
                    break;
                }
            case "dispose":
                HeadlessInAppWebView headlessInAppWebView2 = this.headlessWebView;
                if (headlessInAppWebView2 == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    headlessInAppWebView2.dispose();
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case "setSize":
                if (this.headlessWebView == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    Size2D fromMap = Size2D.fromMap((Map) nVar.a("size"));
                    if (fromMap != null) {
                        this.headlessWebView.setSize(fromMap);
                    }
                    pVar.success(Boolean.TRUE);
                    break;
                }
            default:
                pVar.notImplemented();
                break;
        }
    }

    public void onWebViewCreated() {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onWebViewCreated", new HashMap(), null);
    }
}
