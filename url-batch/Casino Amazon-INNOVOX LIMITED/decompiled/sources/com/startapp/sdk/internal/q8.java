package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class q8 {

    /* renamed from: a, reason: collision with root package name */
    public final double f388a;
    public final int b;
    public final int c;
    public final boolean d;
    public final long e;
    public final long f;
    public final List g;

    public q8(p8 p8Var) {
        this.f388a = p8Var.f376a;
        this.b = p8Var.b;
        this.c = p8Var.c;
        this.d = p8Var.d;
        this.e = Math.max(60000L, zh.e(p8Var.e));
        this.f = Math.max(0L, zh.e(p8Var.f));
        this.g = zh.a(p8Var.g);
    }

    public q8(q8 q8Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        long max;
        long max2;
        Double valueOf = Double.valueOf(q8Var.f388a);
        Double a2 = analyticsCategoryConfig.a();
        this.f388a = (a2 != null ? a2 : valueOf).doubleValue();
        Integer valueOf2 = Integer.valueOf(q8Var.b);
        Integer d = analyticsCategoryConfig.d();
        this.b = (d != null ? d : valueOf2).intValue();
        Integer valueOf3 = Integer.valueOf(q8Var.c);
        Integer e = analyticsCategoryConfig.e();
        this.c = (e != null ? e : valueOf3).intValue();
        Boolean valueOf4 = Boolean.valueOf(q8Var.d);
        Boolean f = analyticsCategoryConfig.f();
        this.d = (f != null ? f : valueOf4).booleanValue();
        if (analyticsCategoryConfig.g() == null) {
            max = q8Var.e;
        } else {
            max = Math.max(60000L, zh.e(analyticsCategoryConfig.g()));
        }
        this.e = max;
        if (analyticsCategoryConfig.c() == null) {
            max2 = q8Var.f;
        } else {
            max2 = Math.max(0L, zh.e(analyticsCategoryConfig.c()));
        }
        this.f = max2;
        List list = q8Var.g;
        List<AnalyticsCategoryFilterConfig> b = analyticsCategoryConfig.b();
        List list2 = null;
        if (b != null) {
            for (AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig : b) {
                if (analyticsCategoryFilterConfig != null) {
                    list2 = list2 == null ? new ArrayList(b.size()) : list2;
                    list2.add(new t8(analyticsCategoryFilterConfig));
                }
            }
            if (list2 != null) {
                WeakHashMap weakHashMap = zh.f528a;
                list2 = Collections.unmodifiableList(list2);
            }
        }
        this.g = list2 != null ? list2 : list;
    }
}
