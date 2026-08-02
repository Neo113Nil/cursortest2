package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f4009a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4010b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4011c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4012d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4013e;
    public final long f;

    public j9(i9 i9Var) {
        ArrayList arrayList = i9Var.f3962a;
        WeakHashMap weakHashMap = si.f4438a;
        this.f4009a = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
        ArrayList arrayList2 = i9Var.f3963b;
        this.f4010b = arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.EMPTY_LIST;
        List list = Collections.EMPTY_LIST;
        this.f4011c = list;
        this.f4012d = list;
        ArrayList arrayList3 = i9Var.f3964c;
        this.f4013e = arrayList3 != null ? Collections.unmodifiableList(arrayList3) : list;
        this.f = Math.max(0L, si.f(i9Var.f3965d));
    }

    public j9(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        List e3 = analyticsCategoryFilterConfig.e();
        WeakHashMap weakHashMap = si.f4438a;
        this.f4009a = e3 != null ? Collections.unmodifiableList(e3) : Collections.EMPTY_LIST;
        List b3 = analyticsCategoryFilterConfig.b();
        this.f4010b = b3 != null ? Collections.unmodifiableList(b3) : Collections.EMPTY_LIST;
        List d3 = analyticsCategoryFilterConfig.d();
        this.f4011c = d3 != null ? Collections.unmodifiableList(d3) : Collections.EMPTY_LIST;
        List a3 = analyticsCategoryFilterConfig.a();
        this.f4012d = a3 != null ? Collections.unmodifiableList(a3) : Collections.EMPTY_LIST;
        List c3 = analyticsCategoryFilterConfig.c();
        this.f4013e = c3 != null ? Collections.unmodifiableList(c3) : Collections.EMPTY_LIST;
        this.f = Math.max(0L, si.f(analyticsCategoryFilterConfig.f()));
    }
}
