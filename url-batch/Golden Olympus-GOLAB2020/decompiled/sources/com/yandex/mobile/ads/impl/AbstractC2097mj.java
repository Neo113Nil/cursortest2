package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import com.yandex.mobile.ads.impl.e82;
import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.mj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2097mj<T> implements fq1<C2286v2, C2360y7<T>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2085m7 f29122a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1799a8<T> f29123b;

    /* renamed from: com.yandex.mobile.ads.impl.mj$a */
    public interface a<K> {
        @NotNull
        jp1 a(@Nullable qq1<C2360y7<K>> qq1Var, @NotNull C2286v2 c2286v2);
    }

    public AbstractC2097mj(@NotNull a<T> responseReportDataProvider) {
        Intrinsics.checkNotNullParameter(responseReportDataProvider, "responseReportDataProvider");
        this.f29122a = new C2085m7();
        this.f29123b = new C1799a8<>(responseReportDataProvider);
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(C2286v2 c2286v2) {
        C2286v2 adConfiguration = c2286v2;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 a4 = a(adConfiguration);
        ip1.b bVar = ip1.b.f27352k;
        Map<String, Object> b4 = a4.b();
        return new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData"));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @NotNull
    protected jp1 a(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 jp1Var = new jp1(new HashMap(), 2);
        C1918f7 a4 = adConfiguration.a();
        if (a4 != null) {
            jp1Var = kp1.a(jp1Var, this.f29122a.a(a4));
        }
        jp1Var.b(adConfiguration.c(), "block_id");
        jp1Var.b(adConfiguration.c(), "ad_unit_id");
        jp1Var.b(adConfiguration.b().b(), AdRevenueScheme.AD_TYPE);
        vy1 q4 = adConfiguration.q();
        if (q4 != null) {
            jp1Var.b(q4.a().a(), "size_type");
        }
        jp1Var.b(Boolean.valueOf(adConfiguration.s() == e82.a.f25147c), "is_passback");
        return jp1Var;
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(qq1 qq1Var, int i4, C2286v2 c2286v2) {
        C2286v2 adConfiguration = c2286v2;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 a4 = a(i4, adConfiguration, qq1Var);
        ip1.b bVar = ip1.b.f27353l;
        Map<String, Object> b4 = a4.b();
        return new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData"));
    }

    @NotNull
    protected jp1 a(int i4, @NotNull C2286v2 adConfiguration, @Nullable qq1 qq1Var) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return this.f29123b.a(i4, adConfiguration, qq1Var);
    }
}
