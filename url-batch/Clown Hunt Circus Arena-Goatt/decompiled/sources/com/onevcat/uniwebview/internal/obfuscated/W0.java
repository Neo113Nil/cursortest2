package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.WebBackForwardList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class W0 extends Lambda implements Function1 {
    public static final W0 a = new W0();

    public W0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        WebBackForwardList copyBackForwardList = it.v.copyBackForwardList();
        Intrinsics.checkNotNullExpressionValue(copyBackForwardList, "it.webView.copyBackForwardList()");
        return AbstractC0050f.a(copyBackForwardList);
    }
}
