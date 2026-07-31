package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.f80;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.of, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2139of {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f30011f = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f30012a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vu1 f30013b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ew1 f30014c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mp1 f30015d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final f80 f30016e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2139of(Context context, vu1 vu1Var) {
        this(context, vu1Var, ew1.a.a(), vu1Var.c(), f80.a.a(context));
        int i4 = ew1.f25476l;
    }

    public final void a() {
        du1 a4 = this.f30014c.a(this.f30012a);
        if (a4 == null || !a4.s0() || f30011f.getAndSet(true)) {
            return;
        }
        for (d80 d80Var : this.f30016e.b()) {
            if (d80Var.d() != null) {
                c80 d4 = d80Var.d();
                new j80(this.f30012a, new C2286v2(d80Var.c(), this.f30013b), d4).a(d4.c());
            }
            this.f30016e.a(d80Var.f());
            long currentTimeMillis = System.currentTimeMillis() - d80Var.f();
            Map reportData = MapsKt.toMutableMap(d80Var.e());
            reportData.put("interval", op0.a(currentTimeMillis));
            ip1.b reportType = ip1.b.f27325M;
            C1814b a5 = d80Var.a();
            Intrinsics.checkNotNullParameter(reportType, "reportType");
            Intrinsics.checkNotNullParameter(reportData, "reportData");
            this.f30015d.a(new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), a5));
        }
        this.f30016e.a();
    }

    public C2139of(@NotNull Context appContext, @NotNull vu1 sdkEnvironmentModule, @NotNull ew1 settings, @NotNull mp1 metricaReporter, @NotNull f80 falseClickDataStorage) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(falseClickDataStorage, "falseClickDataStorage");
        this.f30012a = appContext;
        this.f30013b = sdkEnvironmentModule;
        this.f30014c = settings;
        this.f30015d = metricaReporter;
        this.f30016e = falseClickDataStorage;
    }
}
