package com.onevcat.uniwebview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class n1 extends Lambda implements Function1 {
    public static final n1 a = new n1();

    public n1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        it.e.bringToFront();
        return Unit.INSTANCE;
    }
}
