package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g9 {

    /* renamed from: a, reason: collision with root package name */
    public final double f6978a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6979b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6980c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6981d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6982e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6983f;

    /* renamed from: g, reason: collision with root package name */
    public final List f6984g;

    public g9(f9 f9Var) {
        this.f6978a = f9Var.f6902a;
        this.f6979b = f9Var.f6903b;
        this.f6980c = f9Var.f6904c;
        this.f6981d = f9Var.f6905d;
        this.f6982e = Math.max(60000L, si.f(f9Var.f6906e));
        this.f6983f = Math.max(0L, si.f(f9Var.f6907f));
        ArrayList arrayList = f9Var.f6908g;
        this.f6984g = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public g9(g9 g9Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        long max;
        long max2;
        Double valueOf = Double.valueOf(g9Var.f6978a);
        Double a3 = analyticsCategoryConfig.a();
        this.f6978a = (a3 != null ? a3 : valueOf).doubleValue();
        Integer valueOf2 = Integer.valueOf(g9Var.f6979b);
        Integer d4 = analyticsCategoryConfig.d();
        this.f6979b = (d4 != null ? d4 : valueOf2).intValue();
        Integer valueOf3 = Integer.valueOf(g9Var.f6980c);
        Integer e4 = analyticsCategoryConfig.e();
        this.f6980c = (e4 != null ? e4 : valueOf3).intValue();
        Boolean valueOf4 = Boolean.valueOf(g9Var.f6981d);
        Boolean f4 = analyticsCategoryConfig.f();
        this.f6981d = (f4 != null ? f4 : valueOf4).booleanValue();
        if (analyticsCategoryConfig.g() == null) {
            max = g9Var.f6982e;
        } else {
            max = Math.max(60000L, si.f(analyticsCategoryConfig.g()));
        }
        this.f6982e = max;
        if (analyticsCategoryConfig.c() == null) {
            max2 = g9Var.f6983f;
        } else {
            max2 = Math.max(0L, si.f(analyticsCategoryConfig.c()));
        }
        this.f6983f = max2;
        List list = g9Var.f6984g;
        List<AnalyticsCategoryFilterConfig> b4 = analyticsCategoryConfig.b();
        List list2 = null;
        if (b4 != null) {
            for (AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig : b4) {
                if (analyticsCategoryFilterConfig != null) {
                    list2 = list2 == null ? new ArrayList(b4.size()) : list2;
                    list2.add(new j9(analyticsCategoryFilterConfig));
                }
            }
            if (list2 != null) {
                WeakHashMap weakHashMap = si.f7575a;
                list2 = Collections.unmodifiableList(list2);
            }
        }
        this.f6984g = list2 != null ? list2 : list;
    }
}
