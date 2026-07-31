package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.d7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1870d7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f24463a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f24464b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final yf0 f24465c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mp1 f24466d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ug1 f24467e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final du1 f24468f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1870d7(Context context, C2360y7 c2360y7, C2286v2 c2286v2, C2105n4 c2105n4, yf0 yf0Var) {
        this(context, c2360y7, c2286v2, c2105n4, yf0Var, r6, r7, ew1.a.a().a(context));
        c2286v2.p().f();
        e01 a4 = C1900ed.a(context, zm2.f35627a, c2286v2.p().b());
        C1846c7 c1846c7 = new C1846c7(c2105n4);
        int i4 = ew1.f25476l;
    }

    public final void a() {
        jp1 a4 = this.f24465c.a();
        a4.b(ip1.a.f27312a, com.ironsource.ge.f16389B1);
        a4.a(this.f24467e.a());
        vy1 q4 = this.f24464b.q();
        if (q4 != null) {
            a4.b(q4.a().a(), "size_type");
            a4.b(Integer.valueOf(q4.getWidth()), "width");
            a4.b(Integer.valueOf(q4.getHeight()), "height");
        }
        du1 du1Var = this.f24468f;
        if (du1Var != null) {
            a4.b(du1Var.k(), "banner_size_calculation_type");
        }
        a4.a(this.f24463a.a());
        ip1.b bVar = ip1.b.f27343d;
        Map<String, Object> b4 = a4.b();
        this.f24466d.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData")));
    }

    public C1870d7(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull yf0 reportParameterManager, @NotNull mp1 metricaReporter, @NotNull ug1 phasesParametersProvider, @Nullable du1 du1Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(phasesParametersProvider, "phasesParametersProvider");
        this.f24463a = adResponse;
        this.f24464b = adConfiguration;
        this.f24465c = reportParameterManager;
        this.f24466d = metricaReporter;
        this.f24467e = phasesParametersProvider;
        this.f24468f = du1Var;
    }
}
