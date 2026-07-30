package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class X2 extends Lambda implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(float f, float f2, float f3) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        it.a(this.a, this.b, this.c);
        return Unit.INSTANCE;
    }
}
