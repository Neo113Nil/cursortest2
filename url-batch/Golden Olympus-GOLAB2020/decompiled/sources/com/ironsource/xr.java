package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class xr {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final nr f20337a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final tr f20338b;

    public xr(@NotNull nr error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f20337a = error;
        this.f20338b = null;
    }

    @Nullable
    public final nr a() {
        return this.f20337a;
    }

    @Nullable
    public final tr b() {
        return this.f20338b;
    }

    public final boolean c() {
        tr trVar;
        if (this.f20337a == null && (trVar = this.f20338b) != null) {
            return trVar.c().p();
        }
        return false;
    }

    public xr(@NotNull tr sdkInitResponse) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.f20338b = sdkInitResponse;
        this.f20337a = null;
    }
}
