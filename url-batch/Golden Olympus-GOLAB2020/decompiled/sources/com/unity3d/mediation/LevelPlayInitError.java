package com.unity3d.mediation;

import com.ironsource.nr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class LevelPlayInitError {

    /* renamed from: a, reason: collision with root package name */
    private final int f21964a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f21965b;

    public LevelPlayInitError(int i4, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f21964a = i4;
        this.f21965b = errorMessage;
    }

    public final int getErrorCode() {
        return this.f21964a;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.f21965b;
    }

    @NotNull
    public String toString() {
        return "LevelPlayError(errorCode=" + this.f21964a + ", errorMessage='" + this.f21965b + "')";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(@NotNull nr sdkError) {
        this(sdkError.c(), sdkError.d());
        Intrinsics.checkNotNullParameter(sdkError, "sdkError");
    }
}
