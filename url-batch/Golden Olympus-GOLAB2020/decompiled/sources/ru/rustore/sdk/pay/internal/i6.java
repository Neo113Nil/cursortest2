package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final xi f44312a;

    public i6(@NotNull xi repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f44312a = repository;
    }

    @NotNull
    public final wi a() {
        ak akVar = this.f44312a.f45232a.f43878d.f44190a.get();
        return new wi(akVar != null ? akVar.b() : false);
    }
}
