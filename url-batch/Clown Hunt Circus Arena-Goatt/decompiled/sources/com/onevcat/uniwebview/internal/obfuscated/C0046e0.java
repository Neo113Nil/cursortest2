package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.JavascriptInterface;
import com.onevcat.uniwebview.UniWebViewInterface;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046e0 {
    public final com.onevcat.uniwebview.a a;

    public C0046e0(com.onevcat.uniwebview.a webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = webView;
    }

    @JavascriptInterface
    public final String call(String messageJson) {
        Intrinsics.checkNotNullParameter(messageJson, "messageJson");
        B b = B.b;
        b.a("Received sync channel message: %s", messageJson);
        try {
            C0051f0 c0051f0 = new C0051f0(this.a.getName(), messageJson);
            UniWebViewInterface.Companion.getClass();
            C0078l0 a = p3.a(c0051f0);
            C0036c0 messageProvider = new C0036c0(a);
            Intrinsics.checkNotNullParameter(messageProvider, "messageProvider");
            b.a(A.DEBUG, messageProvider);
            if (a == null) {
                return null;
            }
            return a.a;
        } catch (Exception e) {
            B b2 = B.b;
            C0041d0 messageProvider2 = new C0041d0(e);
            b2.getClass();
            Intrinsics.checkNotNullParameter(messageProvider2, "messageProvider");
            b2.a(A.CRITICAL, messageProvider2);
            return "{\"error\": \"Failed to process message: " + e.getMessage() + "\"}";
        }
    }
}
