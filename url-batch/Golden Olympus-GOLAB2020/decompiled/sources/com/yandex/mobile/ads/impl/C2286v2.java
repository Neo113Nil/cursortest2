package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e82;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2286v2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gs f33467a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vu1 f33468b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final hq f33469c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2087m9 f33470d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final wy1 f33471e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private C1918f7 f33472f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private s91 f33473g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private p91 f33474h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private e82.a f33475i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private String f33476j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private String f33477k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private Integer f33478l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private xy0 f33479m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    private String f33480n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f33481o;

    /* renamed from: p, reason: collision with root package name */
    private int f33482p;

    /* renamed from: q, reason: collision with root package name */
    private int f33483q;

    public /* synthetic */ C2286v2(gs gsVar, vu1 vu1Var) {
        this(gsVar, vu1Var, new hq(), new C2087m9(), new wy1());
    }

    @Nullable
    public final C1918f7 a() {
        return this.f33472f;
    }

    @NotNull
    public final gs b() {
        return this.f33467a;
    }

    @Nullable
    public final String c() {
        return this.f33470d.a();
    }

    @Nullable
    public final Integer d() {
        return this.f33478l;
    }

    @NotNull
    public final C1803ac e() {
        return this.f33469c.a();
    }

    @NotNull
    public final hq f() {
        return this.f33469c;
    }

    public final int g() {
        return this.f33483q;
    }

    @Nullable
    public final xy0 h() {
        return this.f33479m;
    }

    @Nullable
    public final String i() {
        return this.f33480n;
    }

    @NotNull
    public final d50 j() {
        return this.f33469c.b();
    }

    @Nullable
    public final String k() {
        return this.f33476j;
    }

    @NotNull
    public final List<String> l() {
        return this.f33469c.c();
    }

    @Nullable
    public final String m() {
        return this.f33477k;
    }

    public final int n() {
        return this.f33482p;
    }

    @Nullable
    public final p91 o() {
        return this.f33474h;
    }

    @NotNull
    public final vu1 p() {
        return this.f33468b;
    }

    @Nullable
    public final vy1 q() {
        return this.f33471e.a();
    }

    @Nullable
    public final s91 r() {
        return this.f33473g;
    }

    @Nullable
    public final e82.a s() {
        return this.f33475i;
    }

    public final boolean t() {
        return this.f33481o;
    }

    public final void a(@Nullable C1918f7 c1918f7) {
        this.f33472f = c1918f7;
    }

    public final void b(@Nullable String str) {
        this.f33480n = str;
    }

    public final void c(@Nullable String str) {
        this.f33476j = str;
    }

    public final void d(@Nullable String str) {
        this.f33477k = str;
    }

    public final void a(@Nullable String str) {
        this.f33470d.a(str);
    }

    public final void a(@Nullable Integer num) {
        this.f33478l = num;
    }

    public C2286v2(@NotNull gs adType, @NotNull vu1 sdkEnvironmentModule, @NotNull hq commonAdRequestConfiguration, @NotNull C2087m9 adUnitIdConfigurator, @NotNull wy1 sizeInfoConfigurator) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(commonAdRequestConfiguration, "commonAdRequestConfiguration");
        Intrinsics.checkNotNullParameter(adUnitIdConfigurator, "adUnitIdConfigurator");
        Intrinsics.checkNotNullParameter(sizeInfoConfigurator, "sizeInfoConfigurator");
        this.f33467a = adType;
        this.f33468b = sdkEnvironmentModule;
        this.f33469c = commonAdRequestConfiguration;
        this.f33470d = adUnitIdConfigurator;
        this.f33471e = sizeInfoConfigurator;
        this.f33481o = true;
        this.f33483q = gh0.f26148b;
    }

    public final void a(@NotNull C1803ac configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f33469c.a(configuration);
    }

    public final void a(@Nullable xy0 xy0Var) {
        this.f33479m = xy0Var;
    }

    public final void a(@NotNull d50 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f33469c.a(configuration);
    }

    public final void a(int i4) {
        this.f33482p = i4;
    }

    public final void a(@Nullable p91 p91Var) {
        this.f33474h = p91Var;
    }

    public final void a(boolean z4) {
        this.f33481o = z4;
    }

    public final void a(@Nullable vy1 vy1Var) {
        this.f33471e.a(vy1Var);
    }

    public final void a(@Nullable s91 s91Var) {
        this.f33473g = s91Var;
    }

    public final void a(@Nullable e82.a aVar) {
        this.f33475i = aVar;
    }
}
