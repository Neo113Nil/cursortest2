package com.onevcat.uniwebview;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0061l0 extends Lambda implements Function1 {
    public static final C0061l0 a = new C0061l0();

    public C0061l0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        N it = (N) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0093w c0093w = it.p;
        C0093w c0093w2 = c0093w.d.i;
        return Boolean.valueOf((c0093w2 != null && c0093w2.canGoForward()) || c0093w.canGoForward());
    }
}
