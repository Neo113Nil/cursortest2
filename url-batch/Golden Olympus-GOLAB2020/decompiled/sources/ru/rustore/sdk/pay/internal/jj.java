package ru.rustore.sdk.pay.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jj extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {
    public jj(Map<String, String> map) {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f41027a;
    }
}
