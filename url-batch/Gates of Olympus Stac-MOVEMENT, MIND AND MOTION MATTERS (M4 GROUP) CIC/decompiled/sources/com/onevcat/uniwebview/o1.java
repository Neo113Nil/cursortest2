package com.onevcat.uniwebview;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class o1 extends Lambda implements Function1 {
    public static final o1 a = new o1();

    public o1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        b0 b0Var = it.p;
        return Boolean.valueOf(b0Var.d.i != null || b0Var.canGoBack());
    }
}
