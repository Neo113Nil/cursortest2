package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.ks, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3492ks implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32467a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32468b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32469c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32470d;

    /* renamed from: e, reason: collision with root package name */
    public final C2743Qj f32471e;

    /* renamed from: f, reason: collision with root package name */
    public final C3764pu f32472f;

    /* renamed from: g, reason: collision with root package name */
    public final C3226fu f32473g;

    /* renamed from: h, reason: collision with root package name */
    public final t2.E f32474h = p2.j.f39798C.f39808h.g();
    public final C3002bo i;

    /* renamed from: j, reason: collision with root package name */
    public final C2862Xj f32475j;

    public C3492ks(Context context, String str, String str2, C2743Qj c2743Qj, C3764pu c3764pu, C3226fu c3226fu, C3002bo c3002bo, C2862Xj c2862Xj, long j9) {
        this.f32467a = context;
        this.f32468b = str;
        this.f32469c = str2;
        this.f32471e = c2743Qj;
        this.f32472f = c3764pu;
        this.f32473g = c3226fu;
        this.i = c3002bo;
        this.f32475j = c2862Xj;
        this.f32470d = j9;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        Bundle bundle = new Bundle();
        C3002bo c3002bo = this.i;
        ConcurrentHashMap concurrentHashMap = c3002bo.f29588a;
        String str = this.f32468b;
        concurrentHashMap.put("seq_num", str);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31467J2)).booleanValue()) {
            p2.j.f39798C.f39810k.getClass();
            c3002bo.b("tsacc", String.valueOf(System.currentTimeMillis() - this.f32470d));
            c3002bo.b("foreground", true != t2.G.g(this.f32467a) ? "1" : "0");
        }
        C2743Qj c2743Qj = this.f32471e;
        C3226fu c3226fu = this.f32473g;
        q2.d1 d1Var = c3226fu.f30901d;
        C2824Vf c2824Vf = c2743Qj.f27205u;
        synchronized (c2824Vf.f28274d) {
            c2824Vf.f28271a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c2824Vf.f28279j = elapsedRealtime;
            C2994bg c2994bg = c2824Vf.f28272b;
            synchronized (c2994bg.f29527n) {
                c2994bg.f29530w.a(d1Var, elapsedRealtime);
            }
        }
        bundle.putAll(this.f32472f.b());
        return C3686oN.c(new C3546ls(this.f32467a, bundle, str, this.f32469c, this.f32474h, c3226fu.f30904g, this.f32475j));
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        return 12;
    }
}
