package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mw0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final eu0 f29289a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final ab2 f29290b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final List<ej0> f29291c;

    public mw0(@Nullable eu0 eu0Var, @Nullable ab2 ab2Var, @Nullable List<ej0> list) {
        this.f29289a = eu0Var;
        this.f29290b = ab2Var;
        this.f29291c = list;
    }

    public static mw0 a(mw0 mw0Var, ab2 ab2Var) {
        return new mw0(mw0Var.f29289a, ab2Var, mw0Var.f29291c);
    }

    @Nullable
    public final eu0 b() {
        return this.f29289a;
    }

    @Nullable
    public final ab2 c() {
        return this.f29290b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw0)) {
            return false;
        }
        mw0 mw0Var = (mw0) obj;
        return Intrinsics.areEqual(this.f29289a, mw0Var.f29289a) && Intrinsics.areEqual(this.f29290b, mw0Var.f29290b) && Intrinsics.areEqual(this.f29291c, mw0Var.f29291c);
    }

    public final int hashCode() {
        eu0 eu0Var = this.f29289a;
        int hashCode = (eu0Var == null ? 0 : eu0Var.hashCode()) * 31;
        ab2 ab2Var = this.f29290b;
        int hashCode2 = (hashCode + (ab2Var == null ? 0 : ab2Var.hashCode())) * 31;
        List<ej0> list = this.f29291c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "MediaValue(media=" + this.f29289a + ", video=" + this.f29290b + ", imageValues=" + this.f29291c + ")";
    }

    @Nullable
    public final List<ej0> a() {
        return this.f29291c;
    }
}
