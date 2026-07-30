package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class X1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1(String str, int i) {
        super(0);
        this.a = str;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        B3 a = G.b.a(this.a);
        if (a != null) {
            int i = this.b;
            if (a.i) {
                B b = B.b;
                b.a(A.INFO, AbstractC0094p0.a(new StringBuilder("Safe browsing '"), a.b, "' already disposed. Skip setToolbarCornerRadiusDp", b, "message"));
            } else {
                a.z = Integer.valueOf(i);
            }
        }
        return Unit.INSTANCE;
    }
}
