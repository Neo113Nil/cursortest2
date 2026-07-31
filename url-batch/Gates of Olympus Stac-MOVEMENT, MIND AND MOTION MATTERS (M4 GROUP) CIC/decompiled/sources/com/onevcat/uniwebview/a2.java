package com.onevcat.uniwebview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class a2 extends Lambda implements Function1 {
    public static final a2 a = new a2();

    public a2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        b0 b0Var = it.p;
        b0 b0Var2 = b0Var.d.i;
        if (b0Var2 != null) {
            if (b0Var2.canGoForward()) {
                b0Var2.goForward();
            }
        } else if (b0Var.canGoForward()) {
            b0Var.goForward();
        }
        return Unit.INSTANCE;
    }
}
