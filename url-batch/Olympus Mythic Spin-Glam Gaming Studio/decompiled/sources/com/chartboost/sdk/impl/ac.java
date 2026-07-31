package com.chartboost.sdk.impl;

import android.content.Context;
import com.iab.omid.library.chartboost.adsession.Partner;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* loaded from: classes.dex */
public final class ac {
    public final Context a;
    public final he b;
    public final y2 c;
    public Long d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public String i;
    public String j;
    public String k;
    public Boolean l;
    public u m;
    public Long n;
    public Long o;
    public String p;
    public String q;
    public String r;
    public String s;
    public Long t;

    public ac(Context androidContext, he openMeasurementManager, y2 identity) {
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.a = androidContext;
        this.b = openMeasurementManager;
        this.c = identity;
    }

    public final void b(String str) {
        this.p = str;
    }

    public final void c(String str) {
        this.q = str;
    }

    public final void d(String str) {
        this.r = str;
    }

    public final zb a() {
        Long l = this.d;
        long longValue = l != null ? l.longValue() : System.currentTimeMillis();
        Integer num = this.e;
        int i = 0;
        int intValue = num != null ? num.intValue() : Random.Default.nextInt(0, 100000000);
        String str = this.i;
        if (str == null) {
            str = this.a.getPackageName();
        }
        String str2 = str;
        String str3 = this.j;
        if (str3 == null) {
            Partner c = this.b.c();
            if (c != null) {
                str3 = c.getName() + "/" + c.getVersion();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "unknown";
            }
        }
        String str4 = str3;
        Integer num2 = this.h;
        if (num2 != null) {
            i = num2.intValue();
        } else if (this.c.h().f() == xi.e) {
            i = 1;
        }
        String str5 = this.k;
        if (str5 == null) {
            str5 = cc.a(this.l, this.m, this.n, this.o);
        }
        Integer num3 = this.f;
        Integer num4 = this.g;
        Integer valueOf = Integer.valueOf(i);
        Intrinsics.checkNotNull(str2);
        return new zb(longValue, intValue, num3, num4, valueOf, str2, str4, str5, this.p, this.q, this.r, this.s, this.t);
    }

    public final void c(Long l) {
        this.n = l;
    }

    public final void b(Long l) {
        this.t = l;
    }

    public final void a(u uVar) {
        this.m = uVar;
    }

    public final void b(Integer num) {
        this.g = num;
    }

    public final void a(String str) {
        this.s = str;
    }

    public final void a(Long l) {
        this.o = l;
    }

    public final void a(Integer num) {
        this.f = num;
    }

    public final void a(Boolean bool) {
        this.l = bool;
    }
}
