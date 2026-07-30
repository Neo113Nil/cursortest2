package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E3 {
    public final com.onevcat.uniwebview.d a;

    public E3(com.onevcat.uniwebview.d container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.a = container;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        this.a.b(str);
    }
}
