package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s61 implements cr1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f31604a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final w71 f31605b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final hz0 f31606c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private C2360y7<n61> f31607d;

    public /* synthetic */ s61(C2286v2 c2286v2) {
        this(c2286v2, new k71(), new hz0());
    }

    @Override // com.yandex.mobile.ads.impl.cr1
    @NotNull
    public final jp1 a() {
        jp1 jp1Var;
        jp1 jp1Var2 = new jp1((Map) null, 3);
        C2360y7<n61> c2360y7 = this.f31607d;
        if (c2360y7 == null) {
            return jp1Var2;
        }
        jp1 a4 = kp1.a(jp1Var2, this.f31605b.a(c2360y7, this.f31604a, c2360y7.I()));
        xy0 mediationNetwork = this.f31604a.h();
        this.f31606c.getClass();
        if (mediationNetwork != null) {
            Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
            jp1Var = new jp1(new LinkedHashMap(), 2);
            jp1Var.b(mediationNetwork.e(), com.ironsource.ge.f16389B1);
            jp1Var.b(mediationNetwork.i(), "adapter_parameters");
        } else {
            jp1Var = new jp1(new LinkedHashMap(), 2);
            jp1Var.b(ip1.a.f27312a, com.ironsource.ge.f16389B1);
        }
        return kp1.a(a4, jp1Var);
    }

    public s61(@NotNull C2286v2 adConfiguration, @NotNull w71 commonReportDataProvider, @NotNull hz0 mediationNetworkReportDataProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        Intrinsics.checkNotNullParameter(mediationNetworkReportDataProvider, "mediationNetworkReportDataProvider");
        this.f31604a = adConfiguration;
        this.f31605b = commonReportDataProvider;
        this.f31606c = mediationNetworkReportDataProvider;
    }

    public final void a(@Nullable C2360y7<n61> c2360y7) {
        this.f31607d = c2360y7;
    }
}
