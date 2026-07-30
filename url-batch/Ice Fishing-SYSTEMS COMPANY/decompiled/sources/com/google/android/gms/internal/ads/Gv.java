package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k2.EnumC4631b;

/* loaded from: classes2.dex */
public final class Gv {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25242a;

    /* renamed from: b, reason: collision with root package name */
    public final Sv f25243b;

    /* renamed from: c, reason: collision with root package name */
    public final Mt f25244c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f25245d;

    /* renamed from: e, reason: collision with root package name */
    public volatile ConnectivityManager f25246e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f25247f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final S2.a f25248g;

    /* renamed from: h, reason: collision with root package name */
    public AtomicInteger f25249h;
    public final Ev i;

    /* renamed from: j, reason: collision with root package name */
    public final t2.E f25250j;

    public Gv(Sv sv, Mt mt, Context context, S2.a aVar, Ev ev, t2.E e6) {
        HashMap hashMap = new HashMap();
        this.f25242a = hashMap;
        hashMap.put(EnumC4631b.APP_OPEN_AD, new HashMap());
        hashMap.put(EnumC4631b.INTERSTITIAL, new HashMap());
        hashMap.put(EnumC4631b.REWARDED, new HashMap());
        this.f25243b = sv;
        this.f25244c = mt;
        this.f25245d = context;
        this.f25248g = aVar;
        this.i = ev;
        this.f25250j = e6;
    }

    public final void a(boolean z8) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.f25242a;
        synchronized (hashMap) {
            try {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(((Map) it.next()).values());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Hv hv = (Hv) arrayList.get(i);
            if (z8) {
                hv.n();
            } else {
                hv.f25452g.set(false);
            }
        }
    }

    public final Object b(Class cls, String str, EnumC4631b enumC4631b) {
        Mt mt = this.f25244c;
        this.f25248g.getClass();
        mt.y("poll_ad", "ppacwe_ts", System.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap hashMap = this.f25242a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(enumC4631b)) {
                    return null;
                }
                Hv hv = (Hv) ((Map) hashMap.get(enumC4631b)).get(str);
                if (hv != null && enumC4631b.equals(hv.q())) {
                    C3602mu c3602mu = new C3602mu(17, hv.r(), hv.q());
                    c3602mu.f32776w = str;
                    Nv nv = new Nv(c3602mu);
                    mt.y("poll_ad", "ppac_ts", System.currentTimeMillis(), hv.s(), hv.t(), null, nv, "2");
                    try {
                        String o9 = hv.o();
                        Object m8 = hv.m();
                        Object cast = m8 == null ? null : cls.cast(m8);
                        if (cast == null) {
                            return cast;
                        }
                        mt.v(System.currentTimeMillis(), hv.s(), hv.t(), o9, nv, "2");
                        return cast;
                    } catch (ClassCastException e6) {
                        p2.j.f39798C.f39808h.d("PreloadAdManager.pollAd", e6);
                        t2.C.l("Unable to cast ad to the requested type:".concat(cls.getName()), e6);
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public final boolean c(EnumC4631b enumC4631b) {
        HashMap hashMap = this.f25242a;
        int size = hashMap.containsKey(enumC4631b) ? ((Map) hashMap.get(enumC4631b)).size() : 0;
        int ordinal = enumC4631b.ordinal();
        return size < (ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 0 : Math.max(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31803u5)).intValue(), 1) : Math.max(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31793t5)).intValue(), 1) : Math.max(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31784s5)).intValue(), 1));
    }
}
