package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.a;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zw0<T extends com.monetization.ads.mediation.base.a, L> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f35802a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2105n4 f35803b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final gx0<T, L> f35804c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qx0 f35805d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ax0<T> f35806e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ag1 f35807f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final lx0 f35808g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private yw0<T> f35809h;

    public /* synthetic */ zw0(C2286v2 c2286v2, C2105n4 c2105n4, gx0 gx0Var, qx0 qx0Var, ax0 ax0Var, ag1 ag1Var) {
        this(c2286v2, c2105n4, gx0Var, qx0Var, ax0Var, ag1Var, new lx0());
    }

    @Nullable
    public final yw0<T> a() {
        return this.f35809h;
    }

    public final void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        yw0<T> yw0Var = this.f35809h;
        if (yw0Var != null) {
            Map<String, ? extends Object> mapOf = MapsKt.mapOf(TuplesKt.to("status", "success"));
            this.f35805d.f(context, yw0Var.c(), mapOf, yw0Var.a().b().getNetworkName());
        }
    }

    public final void c(@NotNull Context context, @NotNull Map<String, ? extends Object> mediatedReportData) {
        xy0 c4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedReportData, "mediatedReportData");
        yw0<T> yw0Var = this.f35809h;
        List<String> d4 = (yw0Var == null || (c4 = yw0Var.c()) == null) ? null : c4.d();
        C1920f9 c1920f9 = new C1920f9(context, this.f35802a);
        if (d4 != null) {
            Iterator<T> it = d4.iterator();
            while (it.hasNext()) {
                c1920f9.a((String) it.next(), o62.f29922g);
            }
        }
        Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(mediatedReportData);
        mutableMap.put("status", "success");
        yw0<T> yw0Var2 = this.f35809h;
        if (yw0Var2 != null) {
            bx0 a4 = yw0Var2.a();
            this.f35808g.getClass();
            mutableMap.putAll(lx0.a(a4));
            this.f35805d.g(context, yw0Var2.c(), mutableMap, yw0Var2.a().b().getNetworkName());
        }
    }

    public final void d(@NotNull Context context, @NotNull Map<String, ? extends Object> additionalReportData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        yw0<T> yw0Var = this.f35809h;
        if (yw0Var != null) {
            this.f35805d.e(context, yw0Var.c(), additionalReportData, yw0Var.a().b().getNetworkName());
        }
    }

    public final void e(@NotNull Context context, @NotNull Map<String, ? extends Object> additionalReportData) {
        bx0 a4;
        MediatedAdapterInfo b4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        yw0<T> yw0Var = this.f35809h;
        String str = null;
        xy0 c4 = yw0Var != null ? yw0Var.c() : null;
        if (c4 != null) {
            qx0 qx0Var = this.f35805d;
            yw0<T> yw0Var2 = this.f35809h;
            if (yw0Var2 != null && (a4 = yw0Var2.a()) != null && (b4 = a4.b()) != null) {
                str = b4.getNetworkName();
            }
            qx0Var.b(context, c4, additionalReportData, str);
        }
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        yw0<T> yw0Var = this.f35809h;
        if (yw0Var != null) {
            try {
                this.f35804c.a(yw0Var.b());
            } catch (Throwable th) {
                xy0 c4 = yw0Var.c();
                String networkName = yw0Var.a().b().getNetworkName();
                ap0.c(new Object[0]);
                this.f35805d.a(context, c4, MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", th.toString())))), networkName);
            }
        }
    }

    public zw0(@NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull gx0<T, L> mediatedAdLoader, @NotNull qx0 mediatedAdapterReporter, @NotNull ax0<T> mediatedAdCreator, @NotNull ag1 passbackAdLoader, @NotNull lx0 mediatedAdapterInfoReportDataProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(mediatedAdLoader, "mediatedAdLoader");
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(mediatedAdCreator, "mediatedAdCreator");
        Intrinsics.checkNotNullParameter(passbackAdLoader, "passbackAdLoader");
        Intrinsics.checkNotNullParameter(mediatedAdapterInfoReportDataProvider, "mediatedAdapterInfoReportDataProvider");
        this.f35802a = adConfiguration;
        this.f35803b = adLoadingPhasesManager;
        this.f35804c = mediatedAdLoader;
        this.f35805d = mediatedAdapterReporter;
        this.f35806e = mediatedAdCreator;
        this.f35807f = passbackAdLoader;
        this.f35808g = mediatedAdapterInfoReportDataProvider;
    }

    public final void b(@NotNull Context context, @NotNull C1866d3 adFetchRequestError, L l4) {
        xy0 c4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
        yw0<T> yw0Var = this.f35809h;
        C1969ha parametersProvider = new C1969ha(ip1.c.f27370d, (yw0Var == null || (c4 = yw0Var.c()) == null) ? null : c4.e());
        C2105n4 c2105n4 = this.f35803b;
        EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28846c;
        c2105n4.getClass();
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
        c2105n4.a(adLoadingPhaseType, parametersProvider, null);
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to("error_code", Integer.valueOf(adFetchRequestError.b())), TuplesKt.to("error_description", adFetchRequestError.c()));
        yw0<T> yw0Var2 = this.f35809h;
        if (yw0Var2 != null) {
            bx0 a4 = yw0Var2.a();
            this.f35808g.getClass();
            mutableMapOf.putAll(lx0.a(a4));
            this.f35805d.g(context, yw0Var2.c(), mutableMapOf, yw0Var2.a().b().getNetworkName());
        }
        a(context);
        a(context, (Context) l4);
    }

    public final void a(@NotNull Context context, L l4) {
        Context context2;
        L l5;
        xy0 c4;
        Intrinsics.checkNotNullParameter(context, "context");
        yw0<T> a4 = this.f35806e.a(context);
        this.f35809h = a4;
        if (a4 != null) {
            this.f35802a.a(a4.c());
            this.f35802a.b(a4.a().b().getNetworkName());
            C2105n4 c2105n4 = this.f35803b;
            EnumC2082m4 enumC2082m4 = EnumC2082m4.f28846c;
            C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
            xy0 c5 = a4.c();
            String networkName = a4.a().b().getNetworkName();
            this.f35805d.b(context, c5, networkName);
            try {
                context2 = context;
                l5 = l4;
                try {
                    this.f35804c.a(context2, a4.b(), l5, a4.a(context), a4.d());
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    ap0.c(new Object[0]);
                    this.f35805d.a(context2, c5, MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", th2.toString())))), networkName);
                    yw0<T> yw0Var = this.f35809h;
                    C1969ha parametersProvider = new C1969ha(ip1.c.f27370d, (yw0Var == null || (c4 = yw0Var.c()) == null) ? null : c4.e());
                    C2105n4 c2105n42 = this.f35803b;
                    EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28846c;
                    c2105n42.getClass();
                    Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
                    Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
                    c2105n42.a(adLoadingPhaseType, parametersProvider, null);
                    a(context2, (Context) l5);
                }
            } catch (Throwable th3) {
                th = th3;
                context2 = context;
                l5 = l4;
            }
        } else {
            this.f35807f.a();
        }
    }

    public final void c(@NotNull Context context) {
        bx0 a4;
        MediatedAdapterInfo b4;
        Intrinsics.checkNotNullParameter(context, "context");
        yw0<T> yw0Var = this.f35809h;
        String str = null;
        xy0 c4 = yw0Var != null ? yw0Var.c() : null;
        if (c4 != null) {
            qx0 qx0Var = this.f35805d;
            yw0<T> yw0Var2 = this.f35809h;
            if (yw0Var2 != null && (a4 = yw0Var2.a()) != null && (b4 = a4.b()) != null) {
                str = b4.getNetworkName();
            }
            qx0Var.a(context, c4, str);
        }
    }

    public final void b(@NotNull Context context, @NotNull Map<String, ? extends Object> additionalReportData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        yw0<T> yw0Var = this.f35809h;
        if (yw0Var != null) {
            xy0 c4 = yw0Var.c();
            String networkName = yw0Var.a().b().getNetworkName();
            List<String> h4 = c4.h();
            if (h4 != null) {
                Iterator<String> it = h4.iterator();
                while (it.hasNext()) {
                    new C1920f9(context, this.f35802a).a(it.next(), o62.f29921f);
                }
            }
            this.f35805d.d(context, c4, additionalReportData, networkName);
        }
    }

    public final void a(@NotNull Context context, @NotNull Map<String, ? extends Object> additionalReportData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        yw0<T> yw0Var = this.f35809h;
        if (yw0Var != null) {
            xy0 c4 = yw0Var.c();
            String networkName = yw0Var.a().b().getNetworkName();
            List<String> g4 = c4.g();
            if (g4 != null) {
                Iterator<String> it = g4.iterator();
                while (it.hasNext()) {
                    new C1920f9(context, this.f35802a).a(it.next(), o62.f29919d);
                }
            }
            Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(additionalReportData);
            mutableMap.put("click_type", "default");
            this.f35805d.c(context, c4, mutableMap, networkName);
        }
    }

    public final boolean b() {
        bx0 a4;
        yw0<T> yw0Var = this.f35809h;
        if (yw0Var == null || (a4 = yw0Var.a()) == null) {
            return true;
        }
        return a4.c();
    }

    public final void a(@NotNull Context context, @NotNull C1866d3 adFetchRequestError, L l4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
        yw0<T> yw0Var = this.f35809h;
        if (yw0Var != null) {
            Map<String, ? extends Object> mapOf = MapsKt.mapOf(TuplesKt.to("status", "error"), TuplesKt.to("error_code", Integer.valueOf(adFetchRequestError.b())));
            this.f35805d.f(context, yw0Var.c(), mapOf, yw0Var.a().b().getNetworkName());
        }
        a(context);
        a(context, (Context) l4);
    }

    public final void a(@NotNull Context context, @Nullable C2360y7<String> c2360y7) {
        bx0 a4;
        MediatedAdapterInfo b4;
        Intrinsics.checkNotNullParameter(context, "context");
        yw0<T> yw0Var = this.f35809h;
        String str = null;
        xy0 c4 = yw0Var != null ? yw0Var.c() : null;
        if (c4 != null) {
            qx0 qx0Var = this.f35805d;
            yw0<T> yw0Var2 = this.f35809h;
            if (yw0Var2 != null && (a4 = yw0Var2.a()) != null && (b4 = a4.b()) != null) {
                str = b4.getNetworkName();
            }
            qx0Var.a(context, c4, c2360y7, str);
        }
    }
}
