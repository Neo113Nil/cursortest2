package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final wk f43934a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final xk f43935b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final y7 f43936c;

    public cl(@NotNull wk signatureFactory, @NotNull xk signatureDeserializer, @NotNull y7 nonFatalExceptionLogger) {
        Intrinsics.checkNotNullParameter(signatureFactory, "signatureFactory");
        Intrinsics.checkNotNullParameter(signatureDeserializer, "signatureDeserializer");
        Intrinsics.checkNotNullParameter(nonFatalExceptionLogger, "nonFatalExceptionLogger");
        this.f43934a = signatureFactory;
        this.f43935b = signatureDeserializer;
        this.f43936c = nonFatalExceptionLogger;
    }
}
