package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087n1 extends Lambda implements Function1 {
    public static final C0087n1 a = new C0087n1();

    public C0087n1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        it.a(true);
        return Unit.INSTANCE;
    }
}
