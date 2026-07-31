package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.Collections;
import java.util.List;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class t8 {

    /* renamed from: a, reason: collision with root package name */
    public final List f436a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final long f;

    public t8(s8 s8Var) {
        this.f436a = zh.a(s8Var.f418a);
        this.b = zh.a(s8Var.b);
        List list = Collections.EMPTY_LIST;
        this.c = list;
        this.d = list;
        this.e = zh.a(s8Var.c);
        this.f = Math.max(0L, zh.e(s8Var.d));
    }

    public t8(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        this.f436a = zh.a(analyticsCategoryFilterConfig.e());
        this.b = zh.a(analyticsCategoryFilterConfig.b());
        this.c = zh.a(analyticsCategoryFilterConfig.d());
        this.d = zh.a(analyticsCategoryFilterConfig.a());
        this.e = zh.a(analyticsCategoryFilterConfig.c());
        this.f = Math.max(0L, zh.e(analyticsCategoryFilterConfig.f()));
    }
}
