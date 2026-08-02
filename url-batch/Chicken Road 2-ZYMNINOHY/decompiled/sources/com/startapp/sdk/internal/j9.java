package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f7135a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7136b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7137c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7138d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7139e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7140f;

    public j9(i9 i9Var) {
        ArrayList arrayList = i9Var.f7088a;
        WeakHashMap weakHashMap = si.f7575a;
        this.f7135a = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
        ArrayList arrayList2 = i9Var.f7089b;
        this.f7136b = arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.EMPTY_LIST;
        List list = Collections.EMPTY_LIST;
        this.f7137c = list;
        this.f7138d = list;
        ArrayList arrayList3 = i9Var.f7090c;
        this.f7139e = arrayList3 != null ? Collections.unmodifiableList(arrayList3) : list;
        this.f7140f = Math.max(0L, si.f(i9Var.f7091d));
    }

    public j9(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        List e4 = analyticsCategoryFilterConfig.e();
        WeakHashMap weakHashMap = si.f7575a;
        this.f7135a = e4 != null ? Collections.unmodifiableList(e4) : Collections.EMPTY_LIST;
        List b4 = analyticsCategoryFilterConfig.b();
        this.f7136b = b4 != null ? Collections.unmodifiableList(b4) : Collections.EMPTY_LIST;
        List d4 = analyticsCategoryFilterConfig.d();
        this.f7137c = d4 != null ? Collections.unmodifiableList(d4) : Collections.EMPTY_LIST;
        List a3 = analyticsCategoryFilterConfig.a();
        this.f7138d = a3 != null ? Collections.unmodifiableList(a3) : Collections.EMPTY_LIST;
        List c4 = analyticsCategoryFilterConfig.c();
        this.f7139e = c4 != null ? Collections.unmodifiableList(c4) : Collections.EMPTY_LIST;
        this.f7140f = Math.max(0L, si.f(analyticsCategoryFilterConfig.f()));
    }
}
