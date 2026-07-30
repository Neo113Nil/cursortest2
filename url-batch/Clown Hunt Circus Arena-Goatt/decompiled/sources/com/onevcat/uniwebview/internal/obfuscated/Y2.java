package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class Y2 extends Lambda implements Function1 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(boolean z) {
        super(1);
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z = this.a;
        if (it.k != z) {
            it.k = z;
            if (z) {
                it.d();
                it.e();
            } else {
                it.a(CollectionsKt.emptyList(), 1.0f);
            }
        }
        return Unit.INSTANCE;
    }
}
