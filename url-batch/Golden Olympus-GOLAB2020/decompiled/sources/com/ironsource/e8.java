package com.ironsource;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class e8 implements ef {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f15982a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f15983b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final m8 f15984c;

    public e8(@Nullable Boolean bool, @Nullable Integer num, @Nullable m8 m8Var) {
        this.f15982a = bool;
        this.f15983b = num;
        this.f15984c = m8Var;
    }

    @Override // com.ironsource.ef
    @NotNull
    public Object a() {
        Throwable d4 = Result.d(new na(this.f15982a).a());
        if (d4 != null) {
            return Result.m243constructorimpl(ResultKt.createFailure(d4));
        }
        Boolean bool = this.f15982a;
        return Result.m243constructorimpl(bool != null ? new ma(bool.booleanValue()) : null);
    }

    @Override // com.ironsource.ef
    @NotNull
    public Object b() {
        Integer num;
        m8 m8Var = m8.Second;
        Throwable d4 = Result.d(a(m8Var));
        if (d4 != null) {
            return Result.m243constructorimpl(ResultKt.createFailure(d4));
        }
        return Result.m243constructorimpl((!Intrinsics.areEqual(this.f15982a, Boolean.TRUE) || (num = this.f15983b) == null) ? null : new zo(m8Var.a(num), null, 2, null));
    }

    @Override // com.ironsource.ef
    @NotNull
    public Object c() {
        kt ktVar;
        Integer num;
        Throwable d4 = Result.d(a(this.f15984c));
        if (d4 != null) {
            return Result.m243constructorimpl(ResultKt.createFailure(d4));
        }
        if (Intrinsics.areEqual(this.f15982a, Boolean.TRUE) && (num = this.f15983b) != null) {
            int intValue = num.intValue();
            m8 m8Var = this.f15984c;
            if (m8Var != null) {
                ktVar = new kt(intValue, m8Var);
                return Result.m243constructorimpl(ktVar);
            }
        }
        ktVar = null;
        return Result.m243constructorimpl(ktVar);
    }

    @Nullable
    public final Boolean d() {
        return this.f15982a;
    }

    @Nullable
    public final Integer e() {
        return this.f15983b;
    }

    @Nullable
    public final m8 f() {
        return this.f15984c;
    }

    public /* synthetic */ e8(Boolean bool, Integer num, m8 m8Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? null : m8Var);
    }

    private final Object a(m8 m8Var) {
        return new f8(this.f15982a, this.f15983b, m8Var).a();
    }
}
