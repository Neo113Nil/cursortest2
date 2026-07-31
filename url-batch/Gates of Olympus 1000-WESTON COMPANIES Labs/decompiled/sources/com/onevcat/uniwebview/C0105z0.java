package com.onevcat.uniwebview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0105z0 extends Lambda implements Function1 {
    public static final C0105z0 a = new C0105z0();

    public C0105z0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        N it = (N) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        it.a(true);
        return Unit.INSTANCE;
    }
}
