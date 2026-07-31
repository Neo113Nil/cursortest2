package com.onevcat.uniwebview;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class l1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(String str, boolean z) {
        super(0);
        this.a = str;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        f fVar = f.b;
        String name = this.a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        f0 f0Var = (f0) fVar.a.get(name);
        if (f0Var != null) {
            f0Var.i = this.b;
        }
        return Unit.INSTANCE;
    }
}
