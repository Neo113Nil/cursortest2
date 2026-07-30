package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.dr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3113dr implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final Ou f30238a;

    /* renamed from: b, reason: collision with root package name */
    public final C4077vk f30239b;

    /* renamed from: c, reason: collision with root package name */
    public final C4304zv f30240c;

    /* renamed from: d, reason: collision with root package name */
    public final Av f30241d;

    /* renamed from: e, reason: collision with root package name */
    public final SD f30242e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f30243f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2573Gj f30244g;

    /* renamed from: h, reason: collision with root package name */
    public final C2950ar f30245h;
    public final C3706oq i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f30246j;

    /* renamed from: k, reason: collision with root package name */
    public final Yu f30247k;

    /* renamed from: l, reason: collision with root package name */
    public final S0.q f30248l;

    /* renamed from: m, reason: collision with root package name */
    public final C3002bo f30249m;

    public C3113dr(Context context, Ou ou, C2950ar c2950ar, C4077vk c4077vk, C4304zv c4304zv, Av av, InterfaceC2573Gj interfaceC2573Gj, SD sd, ScheduledExecutorService scheduledExecutorService, C3706oq c3706oq, Yu yu, S0.q qVar, C3002bo c3002bo) {
        this.f30246j = context;
        this.f30238a = ou;
        this.f30245h = c2950ar;
        this.f30239b = c4077vk;
        this.f30240c = c4304zv;
        this.f30241d = av;
        this.f30244g = interfaceC2573Gj;
        this.f30242e = sd;
        this.f30243f = scheduledExecutorService;
        this.i = c3706oq;
        this.f30247k = yu;
        this.f30248l = qVar;
        this.f30249m = c3002bo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) r1.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31831x6)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(C2953au c2953au) {
        C3151ea c3151ea = AbstractC3368ia.y6;
        q2.r rVar = q2.r.f40116e;
        String str = "No fill.";
        String str2 = true != ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() ? "No ad config." : "No fill.";
        Wt wt = (Wt) c2953au.f29349b.f24454v;
        int i = wt.f28495f;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                str = (i < 300 || i >= 400) ? D.y.j(i, "Received error HTTP response code: ", new StringBuilder(String.valueOf(i).length() + 35)) : "No location header to follow redirect or too many redirects.";
            }
            GE ge = wt.f28498j;
            return ge == null ? ge.f25128b : str;
        }
        str = str2;
        GE ge2 = wt.f28498j;
        if (ge2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        J3.a r9;
        int i;
        Bundle bundle;
        C3113dr c3113dr = this;
        C2953au c2953au = (C2953au) obj;
        C3151ea c3151ea = AbstractC3368ia.f31467J2;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && (bundle = (Bundle) c2953au.f29349b.f24456x) != null) {
            C3002bo c3002bo = c3113dr.f30249m;
            synchronized (c3002bo) {
                c3002bo.f29592e.putAll(bundle);
            }
        }
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31476K2)).booleanValue()) {
            com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3113dr.f30249m, "rendering-start");
        }
        String a9 = a(c2953au);
        C3706oq c3706oq = c3113dr.i;
        C2518Df c2518Df = c2953au.f29349b;
        Wt wt = (Wt) c2518Df.f24454v;
        c3706oq.f33224d = wt;
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.x9)).booleanValue() && (i = wt.f28495f) != 0 && (i < 200 || i >= 300)) {
            return C3686oN.l(new C3059cr(3, a9));
        }
        String str = wt.f28505q;
        if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.f31811v4)).booleanValue() || TextUtils.isEmpty(str)) {
            for (Ut ut : (List) c2518Df.f24453u) {
                c3706oq.b(ut, c3706oq.f33221a.size());
                Iterator it = ut.f28139a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c3706oq.c(ut, 0L, AbstractC3217fl.M(1, null, null), false);
                        break;
                    }
                    InterfaceC3436jq a10 = c3113dr.f30244g.a(ut.f28141b, (String) it.next());
                    if (a10 == null || !a10.b(c2953au, ut)) {
                    }
                }
            }
        } else {
            List list = (List) c2518Df.f24453u;
            synchronized (c3706oq) {
                Map map = c3706oq.f33222b;
                if (map.containsKey(str)) {
                    q2.i1 i1Var = (q2.i1) map.get(str);
                    List list2 = c3706oq.f33221a;
                    int indexOf = list2.indexOf(i1Var);
                    try {
                        list2.remove(indexOf);
                    } catch (IndexOutOfBoundsException e6) {
                        p2.j.f39798C.f39808h.d("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e6);
                    }
                    c3706oq.f33222b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c3706oq.b((Ut) it2.next(), indexOf);
                        indexOf++;
                    }
                }
            }
        }
        C4077vk c4077vk = c3113dr.f30239b;
        C2708Oi c2708Oi = new C2708Oi(c2953au, c3113dr.f30241d, c3113dr.f30240c);
        SD sd = c3113dr.f30242e;
        c4077vk.s1(c2708Oi, sd);
        if (wt.f28506r > 1) {
            S0.q qVar = c3113dr.f30248l;
            synchronized (qVar) {
                try {
                    if (!((AtomicBoolean) qVar.i).getAndSet(true)) {
                        List list3 = (List) c2953au.f29349b.f24453u;
                        if (list3.isEmpty()) {
                            ((ZD) qVar.f2946h).e(new C3059cr(3, a(c2953au)));
                        } else {
                            qVar.f2948k = c2953au;
                            C2950ar c2950ar = (C2950ar) qVar.f2944f;
                            qVar.f2947j = new C2801Tq(c2953au, c2950ar, (ZD) qVar.f2946h);
                            c2950ar.a(list3);
                            for (Ut a11 = ((C2801Tq) qVar.f2947j).a(); a11 != null; a11 = ((C2801Tq) qVar.f2947j).a()) {
                                qVar.q(a11);
                            }
                        }
                    }
                    r9 = (ZD) qVar.f2946h;
                } finally {
                }
            }
        } else {
            String a12 = a(c2953au);
            Ou ou = c3113dr.f30238a;
            Lu lu = Lu.RENDER_CONFIG_INIT;
            Objects.requireNonNull(ou);
            r9 = new Q8(ou, lu, null, Ou.f26776d, Collections.EMPTY_LIST, C3686oN.l(new C3059cr(3, a12))).r();
            C2950ar c2950ar2 = c3113dr.f30245h;
            synchronized (c2950ar2) {
                c2950ar2.f29337a.getClass();
                c2950ar2.i = SystemClock.elapsedRealtime();
            }
            int i4 = 0;
            for (Ut ut2 : (List) c2518Df.f24453u) {
                Iterator it3 = ut2.f28139a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String str2 = (String) it3.next();
                    InterfaceC3436jq a13 = c3113dr.f30244g.a(ut2.f28141b, str2);
                    if (a13 != null && a13.b(c2953au, ut2)) {
                        Q8 a14 = ou.a(r9, Lu.RENDER_CONFIG_WATERFALL);
                        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 15 + String.valueOf(str2).length());
                        sb.append("render-config-");
                        sb.append(i4);
                        sb.append("-");
                        sb.append(str2);
                        String sb2 = sb.toString();
                        Ou ou2 = (Ou) a14.f27124y;
                        Object obj2 = a14.f27121v;
                        J3.a aVar = (J3.a) a14.f27120u;
                        List list4 = (List) a14.f27122w;
                        J3.a aVar2 = (J3.a) a14.f27123x;
                        Objects.requireNonNull(ou2);
                        r9 = new Q8(ou2, obj2, sb2, aVar, list4, C3686oN.v(aVar2, Throwable.class, new C2889Zc(c3113dr, ut2, c2953au, a13, 4), ou2.f26777a)).r();
                        break;
                    }
                    c3113dr = this;
                }
                i4++;
                c3113dr = this;
            }
            r9.c(new RunnableC3376ij(18, c2950ar2), sd);
        }
        return r9;
    }
}
