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
    public final double f3858a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3859b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3860c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3861d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3862e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final List f3863g;

    public g9(f9 f9Var) {
        this.f3858a = f9Var.f3785a;
        this.f3859b = f9Var.f3786b;
        this.f3860c = f9Var.f3787c;
        this.f3861d = f9Var.f3788d;
        this.f3862e = Math.max(60000L, si.f(f9Var.f3789e));
        this.f = Math.max(0L, si.f(f9Var.f));
        ArrayList arrayList = f9Var.f3790g;
        this.f3863g = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public g9(g9 g9Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        long max;
        long max2;
        Double valueOf = Double.valueOf(g9Var.f3858a);
        Double a3 = analyticsCategoryConfig.a();
        this.f3858a = (a3 != null ? a3 : valueOf).doubleValue();
        Integer valueOf2 = Integer.valueOf(g9Var.f3859b);
        Integer d3 = analyticsCategoryConfig.d();
        this.f3859b = (d3 != null ? d3 : valueOf2).intValue();
        Integer valueOf3 = Integer.valueOf(g9Var.f3860c);
        Integer e3 = analyticsCategoryConfig.e();
        this.f3860c = (e3 != null ? e3 : valueOf3).intValue();
        Boolean valueOf4 = Boolean.valueOf(g9Var.f3861d);
        Boolean f = analyticsCategoryConfig.f();
        this.f3861d = (f != null ? f : valueOf4).booleanValue();
        if (analyticsCategoryConfig.g() == null) {
            max = g9Var.f3862e;
        } else {
            max = Math.max(60000L, si.f(analyticsCategoryConfig.g()));
        }
        this.f3862e = max;
        if (analyticsCategoryConfig.c() == null) {
            max2 = g9Var.f;
        } else {
            max2 = Math.max(0L, si.f(analyticsCategoryConfig.c()));
        }
        this.f = max2;
        List list = g9Var.f3863g;
        List<AnalyticsCategoryFilterConfig> b3 = analyticsCategoryConfig.b();
        List list2 = null;
        if (b3 != null) {
            for (AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig : b3) {
                if (analyticsCategoryFilterConfig != null) {
                    list2 = list2 == null ? new ArrayList(b3.size()) : list2;
                    list2.add(new j9(analyticsCategoryFilterConfig));
                }
            }
            if (list2 != null) {
                WeakHashMap weakHashMap = si.f4438a;
                list2 = Collections.unmodifiableList(list2);
            }
        }
        this.f3863g = list2 != null ? list2 : list;
    }
}
