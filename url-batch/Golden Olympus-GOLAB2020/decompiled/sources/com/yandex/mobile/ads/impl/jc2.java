package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ad2;
import com.yandex.mobile.ads.impl.ip1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jc2 implements ad2.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f27632a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f27633b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final w71 f27634c;

    public /* synthetic */ jc2(C2286v2 c2286v2, C2360y7 c2360y7) {
        this(c2286v2, c2360y7, new k71());
    }

    @Override // com.yandex.mobile.ads.impl.ad2.b
    @NotNull
    public final jp1 a() {
        Object I3 = this.f27633b.I();
        jp1 a4 = this.f27634c.a(this.f27633b, this.f27632a, I3 instanceof n61 ? (n61) I3 : null);
        a4.b(ip1.a.f27312a, com.ironsource.ge.f16389B1);
        a4.a(this.f27633b.a());
        return a4;
    }

    public jc2(@NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull w71 commonReportDataProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        this.f27632a = adConfiguration;
        this.f27633b = adResponse;
        this.f27634c = commonReportDataProvider;
    }
}
