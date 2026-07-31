package com.ironsource;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class f8 implements ff {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f16225a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f16226b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final m8 f16227c;

    public f8(@Nullable Boolean bool, @Nullable Integer num, @Nullable m8 m8Var) {
        this.f16225a = bool;
        this.f16226b = num;
        this.f16227c = m8Var;
    }

    @Override // com.ironsource.ff
    @NotNull
    public Object a() {
        Exception exc;
        Object obj;
        Boolean bool = this.f16225a;
        if (bool != null) {
            if (bool.booleanValue()) {
                Integer num = this.f16226b;
                if (num == null || num.intValue() <= 0) {
                    Result.Companion companion = Result.Companion;
                    exc = new Exception("limit flag is not provided or invalid");
                } else if (this.f16227c == null) {
                    Result.Companion companion2 = Result.Companion;
                    exc = new Exception("unit flag is not provided or invalid");
                } else {
                    Result.Companion companion3 = Result.Companion;
                    obj = Boolean.TRUE;
                }
            } else {
                Result.Companion companion4 = Result.Companion;
                obj = Boolean.FALSE;
            }
            return Result.m243constructorimpl(obj);
        }
        Result.Companion companion5 = Result.Companion;
        exc = new Exception("enabled flag is not provided or invalid");
        obj = ResultKt.createFailure(exc);
        return Result.m243constructorimpl(obj);
    }
}
