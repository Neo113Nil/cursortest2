package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class me2 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final nf2 f29034a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29035b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29036c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final Double f29037d;

    public me2(@Nullable nf2 nf2Var, boolean z4, boolean z5, @Nullable Double d4) {
        this.f29034a = nf2Var;
        this.f29035b = z4;
        this.f29036c = z5;
        this.f29037d = d4;
    }

    @Nullable
    public final Double a() {
        return this.f29037d;
    }

    public final boolean b() {
        return this.f29036c;
    }

    @Nullable
    public final nf2 c() {
        return this.f29034a;
    }

    public final boolean d() {
        return this.f29035b;
    }

    public final boolean e() {
        return Intrinsics.areEqual(this.f29037d, 0.0d) || this.f29037d == null;
    }
}
