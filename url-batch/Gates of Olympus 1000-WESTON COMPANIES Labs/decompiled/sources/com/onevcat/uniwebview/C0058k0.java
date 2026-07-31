package com.onevcat.uniwebview;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0058k0 extends Lambda implements Function1 {
    public static final C0058k0 a = new C0058k0();

    public C0058k0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        N it = (N) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0093w c0093w = it.p;
        return Boolean.valueOf(c0093w.d.i != null || c0093w.canGoBack());
    }
}
