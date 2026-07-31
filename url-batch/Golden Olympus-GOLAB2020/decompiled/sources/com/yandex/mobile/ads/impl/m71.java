package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m71 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f28922a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f28923b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f28924c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final n61 f28925d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final w71 f28926e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private t71 f28927f;

    public m71(@NotNull C2286v2 adConfiguration, @NotNull String responseNativeType, @NotNull C2360y7<?> adResponse, @NotNull n61 nativeAdResponse, @NotNull w71 nativeCommonReportDataProvider, @Nullable t71 t71Var) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        Intrinsics.checkNotNullParameter(nativeCommonReportDataProvider, "nativeCommonReportDataProvider");
        this.f28922a = adConfiguration;
        this.f28923b = responseNativeType;
        this.f28924c = adResponse;
        this.f28925d = nativeAdResponse;
        this.f28926e = nativeCommonReportDataProvider;
        this.f28927f = t71Var;
    }

    @NotNull
    public final jp1 a() {
        jp1 a4 = this.f28926e.a(this.f28924c, this.f28922a, this.f28925d);
        t71 t71Var = this.f28927f;
        if (t71Var != null) {
            a4.b(t71Var.a(), "bind_type");
        }
        a4.a(this.f28923b, "native_ad_type");
        vy1 q4 = this.f28922a.q();
        if (q4 != null) {
            a4.b(q4.a().a(), "size_type");
            a4.b(Integer.valueOf(q4.getWidth()), "width");
            a4.b(Integer.valueOf(q4.getHeight()), "height");
        }
        a4.a(this.f28924c.a());
        return a4;
    }

    public final void a(@NotNull t71 bindType) {
        Intrinsics.checkNotNullParameter(bindType, "bindType");
        this.f28927f = bindType;
    }
}
