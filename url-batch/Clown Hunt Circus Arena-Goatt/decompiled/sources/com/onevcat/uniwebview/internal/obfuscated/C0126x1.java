package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126x1 extends Lambda implements Function1 {
    public static final C0126x1 a = new C0126x1();

    public C0126x1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.k) {
            it.e();
        } else {
            B b = B.b;
            b.a(A.DEBUG, AbstractC0094p0.a(new StringBuilder("Ignored transparency mask refresh for "), it.b, " because feature is disabled", b, "message"));
        }
        return Unit.INSTANCE;
    }
}
