package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class n3 extends Lambda implements Function1 {
    public final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(long j) {
        super(1);
        this.a = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        it.a(this.a);
        return Unit.INSTANCE;
    }
}
