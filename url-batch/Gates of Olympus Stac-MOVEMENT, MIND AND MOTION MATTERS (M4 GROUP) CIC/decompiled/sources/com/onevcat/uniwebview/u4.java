package com.onevcat.uniwebview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class u4 extends Lambda implements Function1 {
    public static final u4 a = new u4();

    public u4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        it.c(true);
        return Unit.INSTANCE;
    }
}
