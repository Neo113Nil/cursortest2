package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function1<j0, CharSequence> {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f43707a = new g0();

    public g0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j0 it = (j0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return "'" + it.f43716a + '\'';
    }
}
