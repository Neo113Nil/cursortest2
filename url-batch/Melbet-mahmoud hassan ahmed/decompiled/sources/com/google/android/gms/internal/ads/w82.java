package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class w82<AdT> implements xa3<ds2, AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final nw2 f13755a;

    /* renamed from: b, reason: collision with root package name */
    private final xa1 f13756b;

    /* renamed from: c, reason: collision with root package name */
    private final zx2 f13757c;

    /* renamed from: d, reason: collision with root package name */
    private final cy2 f13758d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f13759e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f13760f;

    /* renamed from: g, reason: collision with root package name */
    private final y61<AdT> f13761g;

    /* renamed from: h, reason: collision with root package name */
    private final r82 f13762h;

    /* renamed from: i, reason: collision with root package name */
    private final f52 f13763i;

    public w82(nw2 nw2Var, r82 r82Var, xa1 xa1Var, zx2 zx2Var, cy2 cy2Var, y61<AdT> y61Var, Executor executor, ScheduledExecutorService scheduledExecutorService, f52 f52Var) {
        this.f13755a = nw2Var;
        this.f13762h = r82Var;
        this.f13756b = xa1Var;
        this.f13757c = zx2Var;
        this.f13758d = cy2Var;
        this.f13761g = y61Var;
        this.f13759e = executor;
        this.f13760f = scheduledExecutorService;
        this.f13763i = f52Var;
    }

    final /* synthetic */ cc3 b(ds2 ds2Var, rr2 rr2Var, a52 a52Var, Throwable th) {
        r82 r82Var = this.f13762h;
        cc3 o7 = rb3.o(a52Var.a(ds2Var, rr2Var), rr2Var.O, TimeUnit.MILLISECONDS, this.f13760f);
        r82Var.e(ds2Var, rr2Var, o7, this.f13757c);
        return o7;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    @Override // com.google.android.gms.internal.ads.xa3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ cc3 c(ds2 ds2Var) {
        String str;
        tr2 tr2Var;
        int i7;
        final ds2 ds2Var2 = ds2Var;
        int i8 = ds2Var2.f4313b.f3934b.f12950e;
        if (i8 != 0) {
            if (i8 < 200 || i8 >= 300) {
                if (i8 < 300 || i8 >= 400) {
                    StringBuilder sb = new StringBuilder(46);
                    sb.append("Received error HTTP response code: ");
                    sb.append(i8);
                    str = sb.toString();
                } else {
                    str = "No location header to follow redirect or too many redirects.";
                }
            } else if (!((Boolean) sw.c().b(m10.U3)).booleanValue()) {
                str = "No fill.";
            }
            tr2Var = ds2Var2.f4313b.f3934b.f12954i;
            if (tr2Var != null) {
                str = tr2Var.a();
            }
            this.f13763i.e(ds2Var2.f4313b.f3934b);
            if (!((Boolean) sw.c().b(m10.f8183d6)).booleanValue() && (i7 = ds2Var2.f4313b.f3934b.f12950e) != 0 && (i7 < 200 || i7 >= 300)) {
                return rb3.h(new u82(3, str));
            }
            rv2 a7 = wv2.c(rb3.h(new u82(3, str)), gw2.RENDER_CONFIG_INIT, this.f13755a).a();
            this.f13756b.D0(new h21(ds2Var2, this.f13758d, this.f13757c), this.f13759e);
            if (((Boolean) sw.c().b(m10.f8191e6)).booleanValue()) {
                for (rr2 rr2Var : ds2Var2.f4313b.f3933a) {
                    this.f13763i.c(rr2Var);
                    Iterator<String> it = rr2Var.f11367a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            this.f13763i.d(rr2Var, 0L, dt2.d(1, null, null));
                            break;
                        }
                        a52<AdT> a8 = this.f13761g.a(rr2Var.f11369b, it.next());
                        if (a8 == null || !a8.b(ds2Var2, rr2Var)) {
                        }
                    }
                }
            }
            int i9 = 0;
            for (final rr2 rr2Var2 : ds2Var2.f4313b.f3933a) {
                Iterator<String> it2 = rr2Var2.f11367a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    final a52<AdT> a9 = this.f13761g.a(rr2Var2.f11369b, next);
                    if (a9 != null && a9.b(ds2Var2, rr2Var2)) {
                        dw2<I> b7 = this.f13755a.b(gw2.RENDER_CONFIG_WATERFALL, a7);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(next).length() + 26);
                        sb2.append("render-config-");
                        sb2.append(i9);
                        sb2.append("-");
                        sb2.append(next);
                        a7 = b7.h(sb2.toString()).c(Throwable.class, new xa3() { // from class: com.google.android.gms.internal.ads.v82
                            @Override // com.google.android.gms.internal.ads.xa3
                            public final cc3 c(Object obj) {
                                return w82.this.b(ds2Var2, rr2Var2, a9, (Throwable) obj);
                            }
                        }).a();
                        break;
                    }
                }
                i9++;
            }
            return a7;
        }
        str = "No ad config.";
        tr2Var = ds2Var2.f4313b.f3934b.f12954i;
        if (tr2Var != null) {
        }
        this.f13763i.e(ds2Var2.f4313b.f3934b);
        if (!((Boolean) sw.c().b(m10.f8183d6)).booleanValue()) {
        }
        rv2 a72 = wv2.c(rb3.h(new u82(3, str)), gw2.RENDER_CONFIG_INIT, this.f13755a).a();
        this.f13756b.D0(new h21(ds2Var2, this.f13758d, this.f13757c), this.f13759e);
        if (((Boolean) sw.c().b(m10.f8191e6)).booleanValue()) {
        }
        int i92 = 0;
        while (r1.hasNext()) {
        }
        return a72;
    }
}
