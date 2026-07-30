package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088n2 extends Lambda implements Function1 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088n2(boolean z) {
        super(1);
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.a aVar = it.v;
        boolean z = this.a;
        if (z) {
            i = 0;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        aVar.setOverScrollMode(i);
        return Unit.INSTANCE;
    }
}
