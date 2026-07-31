package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final e6 f45192a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final e7 f45193b;

    public wk(@NotNull e6 getPublicKeyUseCase, @NotNull e7 javaPublicKeyFactory) {
        Intrinsics.checkNotNullParameter(getPublicKeyUseCase, "getPublicKeyUseCase");
        Intrinsics.checkNotNullParameter(javaPublicKeyFactory, "javaPublicKeyFactory");
        this.f45192a = getPublicKeyUseCase;
        this.f45193b = javaPublicKeyFactory;
    }
}
