package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.p4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2151p4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30328a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f30329b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ug1 f30330c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2388zc f30331d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private eq1 f30332e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private cr1 f30333f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30334g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2151p4(Context context, C2286v2 c2286v2, C2105n4 c2105n4) {
        this(context, c2286v2, c2105n4, C1900ed.a(context, zm2.f35627a, c2286v2.p().b()), new C2128o4(c2105n4), new C2388zc(context));
        c2286v2.p().f();
    }

    public final void a(@NotNull Object... listeners) {
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        int length = listeners.length;
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            if (listeners[i4] != null) {
                z4 = true;
                break;
            }
            i4++;
        }
        this.f30334g = z4;
    }

    public final void a(@NotNull String failureReason) {
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        HashMap hashMap = new HashMap();
        hashMap.put("status", "error");
        hashMap.put("failure_reason", failureReason);
        hashMap.put("durations", this.f30330c.a());
        hashMap.put("load_listener_available", Boolean.valueOf(this.f30334g));
        a(hashMap);
    }

    public C2151p4(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull mp1 metricaReporter, @NotNull ug1 phasesParametersProvider, @NotNull C2388zc metricaLibraryEventReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(phasesParametersProvider, "phasesParametersProvider");
        Intrinsics.checkNotNullParameter(metricaLibraryEventReporter, "metricaLibraryEventReporter");
        this.f30328a = adConfiguration;
        this.f30329b = metricaReporter;
        this.f30330c = phasesParametersProvider;
        this.f30331d = metricaLibraryEventReporter;
    }

    private final void a(HashMap hashMap) {
        jp1 jp1Var = new jp1(hashMap, 2);
        eq1 eq1Var = this.f30332e;
        if (eq1Var != null) {
            jp1Var.a((Map<String, ? extends Object>) eq1Var.a());
        }
        cr1 cr1Var = this.f30333f;
        if (cr1Var != null) {
            jp1Var = kp1.a(jp1Var, cr1Var.a());
        }
        ip1.b bVar = ip1.b.f27341c;
        Map<String, Object> b4 = jp1Var.b();
        ip1 ip1Var = new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(jp1Var, bVar, "reportType", b4, "reportData"));
        this.f30329b.a(ip1Var);
        if (Intrinsics.areEqual(hashMap.get("status"), "success")) {
            C2388zc c2388zc = this.f30331d;
            Map<String, ? extends Object> b5 = ip1Var.b();
            String i4 = this.f30328a.i();
            if (i4 == null) {
                i4 = ip1.a.f27312a;
            }
            c2388zc.a(bVar, b5, i4, null);
        }
    }

    public final void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("status", "success");
        hashMap.put("durations", this.f30330c.a());
        hashMap.put("load_listener_available", Boolean.valueOf(this.f30334g));
        a(hashMap);
    }

    public final void a(@NotNull eq1 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f30332e = reportParameterManager;
    }

    public final void a(@NotNull cr1 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f30333f = reportParameterManager;
    }
}
