package com.onevcat.uniwebview;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class g3 extends Lambda implements Function1 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(boolean z) {
        super(1);
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        b0 b0Var = it.p;
        boolean z = this.a;
        if (z) {
            i = 0;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        b0Var.setOverScrollMode(i);
        return Unit.INSTANCE;
    }
}
