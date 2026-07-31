package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class pr extends IllegalArgumentException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSourceError f18726a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr(@NotNull IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.f18726a = error;
        this.f18727b = error.getErrorCode();
    }

    @NotNull
    public final IronSourceError a() {
        return this.f18726a;
    }

    public final int b() {
        return this.f18727b;
    }
}
