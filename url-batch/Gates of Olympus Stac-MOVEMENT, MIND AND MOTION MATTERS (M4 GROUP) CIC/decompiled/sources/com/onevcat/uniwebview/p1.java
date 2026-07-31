package com.onevcat.uniwebview;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class p1 extends Lambda implements Function1 {
    public static final p1 a = new p1();

    public p1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        b0 b0Var = it.p;
        b0 b0Var2 = b0Var.d.i;
        return Boolean.valueOf((b0Var2 != null && b0Var2.canGoForward()) || b0Var.canGoForward());
    }
}
