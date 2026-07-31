package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final wa f44853a;

    public qk(@NotNull wa repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f44853a = repository;
    }

    public final void a(@NotNull ua value) {
        Intrinsics.checkNotNullParameter(value, "paymentType");
        wa waVar = this.f44853a;
        waVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        va vaVar = waVar.f45161a;
        Intrinsics.checkNotNullParameter(value, "value");
        vaVar.f45124a = value;
    }
}
