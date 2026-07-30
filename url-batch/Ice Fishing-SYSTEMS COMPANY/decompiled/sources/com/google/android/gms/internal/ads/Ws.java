package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class Ws implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final t2.E f28483a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f28484b;

    /* renamed from: c, reason: collision with root package name */
    public final C3157eg f28485c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f28486d;

    /* renamed from: e, reason: collision with root package name */
    public final C3550lw f28487e;

    /* renamed from: f, reason: collision with root package name */
    public final C3226fu f28488f;

    /* renamed from: g, reason: collision with root package name */
    public final C5107a f28489g;

    public Ws(t2.E e6, Context context, C3157eg c3157eg, ScheduledExecutorService scheduledExecutorService, C3550lw c3550lw, C3226fu c3226fu, C5107a c5107a) {
        this.f28483a = e6;
        this.f28484b = context;
        this.f28485c = c3157eg;
        this.f28486d = scheduledExecutorService;
        this.f28487e = c3550lw;
        this.f28488f = c3226fu;
        this.f28489g = c5107a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r9.f28484b.getPackageName()) == false) goto L48;
     */
    @Override // com.google.android.gms.internal.ads.Rs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final J3.a a() {
        boolean z8;
        J3.a l9;
        C3151ea c3151ea = AbstractC3368ia.Ob;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            t2.E e6 = this.f28483a;
            e6.i();
            synchronized (e6.f40830a) {
                try {
                    SharedPreferences sharedPreferences = e6.f40835f;
                    if (sharedPreferences != null) {
                        if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) >= System.currentTimeMillis()) {
                            z8 = e6.f40835f.getBoolean("is_topics_ad_personalization_allowed", false) && !e6.f40839k;
                        }
                    }
                    z8 = false;
                } finally {
                }
            }
            if (z8) {
                if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.Sb)).booleanValue() || this.f28488f.f30901d.f40024R != 2) {
                    if (this.f28489g.f41219v >= ((Integer) rVar.f40119c.a(AbstractC3368ia.Mb)).intValue()) {
                        if (Build.VERSION.SDK_INT >= ((Integer) rVar.f40119c.a(AbstractC3368ia.Nb)).intValue()) {
                            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Kb)).booleanValue()) {
                                String str = (String) rVar.f40119c.a(AbstractC3368ia.Lb);
                                if (!TextUtils.isEmpty(str)) {
                                }
                            }
                            try {
                                l9 = C3686oN.w(this.f28487e.a(false), ((Integer) rVar.f40119c.a(AbstractC3368ia.Qb)).intValue(), TimeUnit.MILLISECONDS, this.f28486d);
                            } catch (Exception e9) {
                                l9 = C3686oN.l(e9);
                            }
                            C3157eg c3157eg = this.f28485c;
                            return C3686oN.w(C3686oN.v(C3686oN.y(JD.s(l9), C2538Ei.f24798k, c3157eg), Throwable.class, new C3907sc(9, this), c3157eg), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Qb)).intValue(), TimeUnit.MILLISECONDS, this.f28486d);
                        }
                    }
                }
            }
        }
        return C3686oN.c(new C3438js("", -1, 1));
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        return 56;
    }
}
