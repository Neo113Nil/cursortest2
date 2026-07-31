package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ii extends kotlin.jvm.internal.s implements Function1<Throwable, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public static final ii f44346a = new ii();

    public ii() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.FALSE;
    }
}
