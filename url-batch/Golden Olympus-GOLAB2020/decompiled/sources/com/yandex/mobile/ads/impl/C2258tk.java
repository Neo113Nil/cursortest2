package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2258tk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h41 f32461a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final aa1 f32462b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final tb1 f32463c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final rb1 f32464d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final h51 f32465e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final f81 f32466f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC1849ca f32467g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final vu1 f32468h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final u31 f32469i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final EnumC1848c9 f32470j;

    public C2258tk(@NotNull h41 nativeAdBlock, @NotNull aa1 nativeValidator, @NotNull tb1 nativeVisualBlock, @NotNull rb1 nativeViewRenderer, @NotNull h51 nativeAdFactoriesProvider, @NotNull f81 forceImpressionConfigurator, @NotNull b71 adViewRenderingValidator, @NotNull vu1 sdkEnvironmentModule, @Nullable u31 u31Var, @NotNull EnumC1848c9 adStructureType) {
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(nativeValidator, "nativeValidator");
        Intrinsics.checkNotNullParameter(nativeVisualBlock, "nativeVisualBlock");
        Intrinsics.checkNotNullParameter(nativeViewRenderer, "nativeViewRenderer");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(forceImpressionConfigurator, "forceImpressionConfigurator");
        Intrinsics.checkNotNullParameter(adViewRenderingValidator, "adViewRenderingValidator");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        this.f32461a = nativeAdBlock;
        this.f32462b = nativeValidator;
        this.f32463c = nativeVisualBlock;
        this.f32464d = nativeViewRenderer;
        this.f32465e = nativeAdFactoriesProvider;
        this.f32466f = forceImpressionConfigurator;
        this.f32467g = adViewRenderingValidator;
        this.f32468h = sdkEnvironmentModule;
        this.f32469i = u31Var;
        this.f32470j = adStructureType;
    }

    @NotNull
    public final EnumC1848c9 a() {
        return this.f32470j;
    }

    @NotNull
    public final InterfaceC1849ca b() {
        return this.f32467g;
    }

    @NotNull
    public final f81 c() {
        return this.f32466f;
    }

    @NotNull
    public final h41 d() {
        return this.f32461a;
    }

    @NotNull
    public final h51 e() {
        return this.f32465e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2258tk)) {
            return false;
        }
        C2258tk c2258tk = (C2258tk) obj;
        return Intrinsics.areEqual(this.f32461a, c2258tk.f32461a) && Intrinsics.areEqual(this.f32462b, c2258tk.f32462b) && Intrinsics.areEqual(this.f32463c, c2258tk.f32463c) && Intrinsics.areEqual(this.f32464d, c2258tk.f32464d) && Intrinsics.areEqual(this.f32465e, c2258tk.f32465e) && Intrinsics.areEqual(this.f32466f, c2258tk.f32466f) && Intrinsics.areEqual(this.f32467g, c2258tk.f32467g) && Intrinsics.areEqual(this.f32468h, c2258tk.f32468h) && Intrinsics.areEqual(this.f32469i, c2258tk.f32469i) && this.f32470j == c2258tk.f32470j;
    }

    @Nullable
    public final u31 f() {
        return this.f32469i;
    }

    @NotNull
    public final aa1 g() {
        return this.f32462b;
    }

    @NotNull
    public final rb1 h() {
        return this.f32464d;
    }

    public final int hashCode() {
        int hashCode = (this.f32468h.hashCode() + ((this.f32467g.hashCode() + ((this.f32466f.hashCode() + ((this.f32465e.hashCode() + ((this.f32464d.hashCode() + ((this.f32463c.hashCode() + ((this.f32462b.hashCode() + (this.f32461a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        u31 u31Var = this.f32469i;
        return this.f32470j.hashCode() + ((hashCode + (u31Var == null ? 0 : u31Var.hashCode())) * 31);
    }

    @NotNull
    public final tb1 i() {
        return this.f32463c;
    }

    @NotNull
    public final vu1 j() {
        return this.f32468h;
    }

    @NotNull
    public final String toString() {
        return "BinderConfiguration(nativeAdBlock=" + this.f32461a + ", nativeValidator=" + this.f32462b + ", nativeVisualBlock=" + this.f32463c + ", nativeViewRenderer=" + this.f32464d + ", nativeAdFactoriesProvider=" + this.f32465e + ", forceImpressionConfigurator=" + this.f32466f + ", adViewRenderingValidator=" + this.f32467g + ", sdkEnvironmentModule=" + this.f32468h + ", nativeData=" + this.f32469i + ", adStructureType=" + this.f32470j + ")";
    }
}
