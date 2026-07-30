package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class L1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Ref.IntRef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(String str, Ref.IntRef intRef) {
        super(0);
        this.a = str;
        this.b = intRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        B3 a = G.b.a(this.a);
        if (a != null) {
            int i = this.b.element;
            if (a.i) {
                B b = B.b;
                b.a(A.INFO, AbstractC0094p0.a(new StringBuilder("Safe browsing '"), a.b, "' already disposed. Skip setColorScheme", b, "message"));
            } else if (i > 2) {
                B b2 = B.b;
                b2.getClass();
                Intrinsics.checkNotNullParameter("Setting Color Scheme to an invalid value.", "message");
                b2.a(A.DEBUG, "Setting Color Scheme to an invalid value.");
            } else {
                a.k = Integer.valueOf(i);
            }
        }
        return Unit.INSTANCE;
    }
}
