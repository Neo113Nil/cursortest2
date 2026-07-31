package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yf0 implements cr1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jq f35091a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hz0 f35092b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private C2360y7<String> f35093c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private C2286v2 f35094d;

    public /* synthetic */ yf0() {
        this(new jq(), new hz0());
    }

    @Override // com.yandex.mobile.ads.impl.cr1
    @NotNull
    public final jp1 a() {
        jp1 jp1Var;
        jp1 jp1Var2 = new jp1(new HashMap(), 2);
        C2360y7<String> c2360y7 = this.f35093c;
        C2286v2 c2286v2 = this.f35094d;
        if (c2360y7 == null || c2286v2 == null) {
            return jp1Var2;
        }
        jp1 a4 = kp1.a(jp1Var2, this.f35091a.a(c2360y7, c2286v2));
        xy0 mediationNetwork = c2286v2.h();
        this.f35092b.getClass();
        if (mediationNetwork != null) {
            Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
            jp1Var = new jp1(new LinkedHashMap(), 2);
            jp1Var.b(mediationNetwork.e(), com.ironsource.ge.f16389B1);
            jp1Var.b(mediationNetwork.i(), "adapter_parameters");
        } else {
            jp1Var = new jp1(new LinkedHashMap(), 2);
            jp1Var.b(ip1.a.f27312a, com.ironsource.ge.f16389B1);
        }
        jp1 a5 = kp1.a(a4, jp1Var);
        a5.b(c2360y7.M().a().a(), "size_type");
        a5.b(Integer.valueOf(c2360y7.M().getWidth()), "width");
        a5.b(Integer.valueOf(c2360y7.M().getHeight()), "height");
        return a5;
    }

    public yf0(@NotNull jq commonReportDataProvider, @NotNull hz0 mediationReportDataProvider) {
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        Intrinsics.checkNotNullParameter(mediationReportDataProvider, "mediationReportDataProvider");
        this.f35091a = commonReportDataProvider;
        this.f35092b = mediationReportDataProvider;
    }

    public final void a(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f35094d = adConfiguration;
    }

    public final void a(@NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f35093c = adResponse;
    }
}
