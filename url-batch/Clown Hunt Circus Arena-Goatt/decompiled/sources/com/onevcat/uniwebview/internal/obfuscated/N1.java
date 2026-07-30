package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class N1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(String str, int i, int i2) {
        super(0);
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        B3 a = G.b.a(this.a);
        if (a != null) {
            int i = this.b;
            int i2 = this.c;
            if (a.i) {
                B b = B.b;
                b.a(A.INFO, AbstractC0094p0.a(new StringBuilder("Safe browsing '"), a.b, "' already disposed. Skip setInitialHeightPx", b, "message"));
            } else {
                a.A = Integer.valueOf(i);
                a.B = Integer.valueOf(i2);
            }
        }
        return Unit.INSTANCE;
    }
}
