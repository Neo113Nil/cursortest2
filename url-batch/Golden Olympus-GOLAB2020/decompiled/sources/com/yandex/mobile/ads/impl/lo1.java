package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lo1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f28690a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f28691b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC1848c9 f28692c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mp1 f28693d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final du1 f28694e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final jq f28695f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private h91 f28696g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ lo1(Context context, C2286v2 c2286v2, C2360y7 c2360y7, EnumC1848c9 enumC1848c9) {
        this(context, c2286v2, c2360y7, enumC1848c9, r7, ew1.a.a().a(context), new jq());
        c2286v2.p().f();
        e01 a4 = C1900ed.a(context, zm2.f35627a, c2286v2.p().b());
        int i4 = ew1.f25476l;
    }

    public final void a() {
        List listOf;
        jp1 a4 = this.f28695f.a(this.f28691b, this.f28690a);
        a4.b(ip1.a.f27312a, com.ironsource.ge.f16389B1);
        h91 h91Var = this.f28696g;
        if (h91Var != null) {
            a4.a((Map<String, ? extends Object>) h91Var.a());
        }
        vy1 q4 = this.f28690a.q();
        if (q4 != null) {
            a4.b(q4.a().a(), "size_type");
            a4.b(Integer.valueOf(q4.getWidth()), "width");
            a4.b(Integer.valueOf(q4.getHeight()), "height");
        }
        du1 du1Var = this.f28694e;
        if (du1Var != null) {
            a4.b(du1Var.k(), "banner_size_calculation_type");
        }
        int ordinal = this.f28692c.ordinal();
        if (ordinal == 0) {
            listOf = CollectionsKt.listOf((Object[]) new ip1.b[]{ip1.b.f27364w, ip1.b.f27363v});
        } else if (ordinal == 1) {
            listOf = CollectionsKt.listOf(ip1.b.f27364w);
        } else {
            if (ordinal != 2) {
                throw new W1.m();
            }
            listOf = CollectionsKt.listOf(ip1.b.f27363v);
        }
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            this.f28693d.a(new ip1((ip1.b) it.next(), (Map<String, ? extends Object>) a4.b(), a4.a()));
        }
    }

    public lo1(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull EnumC1848c9 adStructureType, @NotNull mp1 metricaReporter, @Nullable du1 du1Var, @NotNull jq commonReportDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        this.f28690a = adConfiguration;
        this.f28691b = adResponse;
        this.f28692c = adStructureType;
        this.f28693d = metricaReporter;
        this.f28694e = du1Var;
        this.f28695f = commonReportDataProvider;
    }

    public final void a(@Nullable h91 h91Var) {
        this.f28696g = h91Var;
    }
}
