package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.JavascriptInterface;
import com.onevcat.uniwebview.UniWebViewInterface;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031b0 {
    public final com.onevcat.uniwebview.a a;

    public C0031b0(com.onevcat.uniwebview.a webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = webView;
    }

    @JavascriptInterface
    public final void postMessage(String messageJson) {
        Intrinsics.checkNotNullParameter(messageJson, "messageJson");
        B b = B.b;
        b.a("Received channel message: %s", messageJson);
        try {
            C0051f0 c0051f0 = new C0051f0(this.a.getName(), messageJson);
            UniWebViewInterface.Companion.getClass();
            Z messageProvider = new Z(p3.a(c0051f0));
            Intrinsics.checkNotNullParameter(messageProvider, "messageProvider");
            b.a(A.DEBUG, messageProvider);
        } catch (Exception e) {
            B b2 = B.b;
            C0026a0 messageProvider2 = new C0026a0(e);
            b2.getClass();
            Intrinsics.checkNotNullParameter(messageProvider2, "messageProvider");
            b2.a(A.CRITICAL, messageProvider2);
        }
    }
}
