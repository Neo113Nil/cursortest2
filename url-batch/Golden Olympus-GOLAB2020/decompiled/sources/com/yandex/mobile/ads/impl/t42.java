package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t42 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rl1 f32152a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2285v1 f32153b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bz f32154c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final xo f32155d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final np f32156e;

    public /* synthetic */ t42(rl1 rl1Var, InterfaceC2285v1 interfaceC2285v1, bz bzVar, xo xoVar) {
        this(rl1Var, interfaceC2285v1, bzVar, xoVar, new np());
    }

    @NotNull
    public final InterfaceC2285v1 a() {
        return this.f32153b;
    }

    @NotNull
    public final xo b() {
        return this.f32155d;
    }

    @NotNull
    public final np c() {
        return this.f32156e;
    }

    @NotNull
    public final bz d() {
        return this.f32154c;
    }

    @NotNull
    public final rl1 e() {
        return this.f32152a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t42)) {
            return false;
        }
        t42 t42Var = (t42) obj;
        return Intrinsics.areEqual(this.f32152a, t42Var.f32152a) && Intrinsics.areEqual(this.f32153b, t42Var.f32153b) && Intrinsics.areEqual(this.f32154c, t42Var.f32154c) && Intrinsics.areEqual(this.f32155d, t42Var.f32155d) && Intrinsics.areEqual(this.f32156e, t42Var.f32156e);
    }

    public final int hashCode() {
        return this.f32156e.hashCode() + ((this.f32155d.hashCode() + ((this.f32154c.hashCode() + ((this.f32153b.hashCode() + (this.f32152a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TimeProviderContainer(progressIncrementer=" + this.f32152a + ", adBlockDurationProvider=" + this.f32153b + ", defaultContentDelayProvider=" + this.f32154c + ", closableAdChecker=" + this.f32155d + ", closeTimerProgressIncrementer=" + this.f32156e + ")";
    }

    public t42(@NotNull rl1 progressIncrementer, @NotNull InterfaceC2285v1 adBlockDurationProvider, @NotNull bz defaultContentDelayProvider, @NotNull xo closableAdChecker, @NotNull np closeTimerProgressIncrementer) {
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        Intrinsics.checkNotNullParameter(adBlockDurationProvider, "adBlockDurationProvider");
        Intrinsics.checkNotNullParameter(defaultContentDelayProvider, "defaultContentDelayProvider");
        Intrinsics.checkNotNullParameter(closableAdChecker, "closableAdChecker");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        this.f32152a = progressIncrementer;
        this.f32153b = adBlockDurationProvider;
        this.f32154c = defaultContentDelayProvider;
        this.f32155d = closableAdChecker;
        this.f32156e = closeTimerProgressIncrementer;
    }
}
