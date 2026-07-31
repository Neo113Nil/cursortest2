package com.ironsource;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class na implements ff {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f18333a;

    public na(@Nullable Boolean bool) {
        this.f18333a = bool;
    }

    @Override // com.ironsource.ff
    @NotNull
    public Object a() {
        Boolean bool = this.f18333a;
        if (bool != null) {
            return Result.m243constructorimpl(bool);
        }
        Result.Companion companion = Result.Companion;
        return Result.m243constructorimpl(ResultKt.createFailure(new Exception("enabled flag is not provided or invalid")));
    }
}
