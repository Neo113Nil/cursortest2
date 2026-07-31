package com.yandex.mobile.ads.impl;

import android.content.Context;
import b2.AbstractC1372b;
import com.appsflyer.AdRevenueScheme;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.f80;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2030k0 {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f27943m = {C1873da.a(C2030k0.class, "activityInteractionEventListener", "getActivityInteractionEventListener()Lcom/monetization/ads/base/tracker/interaction/ActivityInteractionEventListener;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f27944a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C2360y7<?> f27945b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final c80 f27946c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2085m7 f27947d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final mp1 f27948e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final j80 f27949f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final f80 f27950g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f27951h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ao1 f27952i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private a f27953j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private m71 f27954k;

    /* renamed from: l, reason: collision with root package name */
    private long f27955l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.k0$a */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f27956c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f27957d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f27958e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f27959f;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f27960b;

        static {
            a aVar = new a(0, "BROWSER", "browser");
            f27956c = aVar;
            a aVar2 = new a(1, "WEBVIEW", b9.h.f15449K);
            f27957d = aVar2;
            a aVar3 = new a(2, com.ironsource.mediationsdk.l.f17632f, "custom");
            f27958e = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f27959f = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str, String str2) {
            this.f27960b = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f27959f.clone();
        }

        @NotNull
        public final String a() {
            return this.f27960b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r0.s0() == true) goto L11;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2030k0(Context context, C2286v2 c2286v2, C2360y7 c2360y7, InterfaceC2006j0 interfaceC2006j0, c80 c80Var) {
        this(context, c2286v2, c2360y7, interfaceC2006j0, c80Var, r6, r7, r8, r9, r1);
        C2085m7 c2085m7 = new C2085m7();
        c2286v2.p().f();
        e01 a4 = C1900ed.a(context, zm2.f35627a, c2286v2.p().b());
        j80 j80Var = c80Var != null ? new j80(context, c2286v2, c80Var) : null;
        f80 a5 = f80.a.a(context);
        int i4 = ew1.f25476l;
        du1 a6 = ew1.a.a().a(context);
        boolean z4 = a6 != null;
    }

    private final ip1 a(a aVar, String str) {
        jp1 a4 = this.f27947d.a(this.f27944a.a());
        a4.b(aVar.a(), "type");
        a4.b(this.f27944a.b().b(), AdRevenueScheme.AD_TYPE);
        a4.b(this.f27944a.c(), "block_id");
        a4.b(this.f27944a.c(), "ad_unit_id");
        a4.b(str, "interval");
        m71 m71Var = this.f27954k;
        if (m71Var != null) {
            a4 = kp1.a(a4, m71Var.a());
        }
        ip1.b reportType = ip1.b.f27325M;
        Map<String, Object> reportData = a4.b();
        C2360y7<?> c2360y7 = this.f27945b;
        C1814b a5 = c2360y7 != null ? c2360y7.a() : null;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), a5);
    }

    public final void b(@NotNull a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Objects.toString(type);
        ap0.a(new Object[0]);
        this.f27955l = System.currentTimeMillis();
        this.f27953j = type;
        if (type == a.f27956c && this.f27951h) {
            Map<String, Object> b4 = a(type, null).b();
            C2360y7<?> c2360y7 = this.f27945b;
            this.f27950g.a(new d80(this.f27944a.b(), this.f27955l, type, this.f27946c, b4, c2360y7 != null ? c2360y7.a() : null));
        }
    }

    public C2030k0(@NotNull Context context, @NotNull C2286v2 adConfiguration, @Nullable C2360y7 c2360y7, @NotNull InterfaceC2006j0 activityInteractionEventListener, @Nullable c80 c80Var, @NotNull C2085m7 adRequestReportDataProvider, @NotNull mp1 metricaReporter, @Nullable j80 j80Var, @NotNull f80 falseClickDataStorage, boolean z4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(activityInteractionEventListener, "activityInteractionEventListener");
        Intrinsics.checkNotNullParameter(adRequestReportDataProvider, "adRequestReportDataProvider");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(falseClickDataStorage, "falseClickDataStorage");
        this.f27944a = adConfiguration;
        this.f27945b = c2360y7;
        this.f27946c = c80Var;
        this.f27947d = adRequestReportDataProvider;
        this.f27948e = metricaReporter;
        this.f27949f = j80Var;
        this.f27950g = falseClickDataStorage;
        this.f27951h = z4;
        this.f27952i = bo1.a(activityInteractionEventListener);
    }

    public final void a(@NotNull a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Objects.toString(type);
        ap0.a(new Object[0]);
        if (this.f27955l == 0 || this.f27953j != type) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f27955l;
        String interval = op0.a(currentTimeMillis);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f27948e.a(a(type, interval));
        ap0.d(type.a(), interval);
        InterfaceC2006j0 interfaceC2006j0 = (InterfaceC2006j0) this.f27952i.getValue(this, f27943m[0]);
        if (interfaceC2006j0 != null) {
            interfaceC2006j0.onReturnedToApplication();
        }
        j80 j80Var = this.f27949f;
        if (j80Var != null) {
            j80Var.a(currentTimeMillis);
            if (this.f27951h) {
                this.f27950g.a(this.f27955l);
            }
        }
        this.f27955l = 0L;
        this.f27953j = null;
    }

    public final void a(@Nullable m71 m71Var) {
        this.f27954k = m71Var;
    }
}
