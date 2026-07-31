package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tx1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f32725a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f32726b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32727c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ux1 f32728d;

    public tx1() {
        this(0);
    }

    public final long a() {
        return this.f32725a;
    }

    @NotNull
    public final ux1 b() {
        return this.f32728d;
    }

    @Nullable
    public final String c() {
        return this.f32726b;
    }

    public final int d() {
        return this.f32727c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx1)) {
            return false;
        }
        tx1 tx1Var = (tx1) obj;
        return this.f32725a == tx1Var.f32725a && Intrinsics.areEqual(this.f32726b, tx1Var.f32726b) && this.f32727c == tx1Var.f32727c && this.f32728d == tx1Var.f32728d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f32725a) * 31;
        String str = this.f32726b;
        return this.f32728d.hashCode() + sx1.a(this.f32727c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "ShowNotice(delay=" + this.f32725a + ", url=" + this.f32726b + ", visibilityPercent=" + this.f32727c + ", type=" + this.f32728d + ")";
    }

    public /* synthetic */ tx1(int i4) {
        this(0, 0L, ux1.f33444d, null);
    }

    public tx1(int i4, long j4, @NotNull ux1 type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f32725a = j4;
        this.f32726b = str;
        this.f32727c = i4;
        this.f32728d = type;
    }
}
