package ru.rustore.sdk.pay.internal;

import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.core.exception.RuStoreConnectionTimeout;

/* loaded from: classes3.dex */
public final class c1 extends kotlin.jvm.internal.s implements Function1<Throwable, Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f43894a = new c1();

    public c1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        return error instanceof TimeoutException ? new RuStoreConnectionTimeout() : error;
    }
}
