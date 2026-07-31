package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class S4 implements Za, Ql, InterfaceC2515bb {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38227a;

    /* renamed from: b, reason: collision with root package name */
    public final C2772l5 f38228b;

    /* renamed from: c, reason: collision with root package name */
    public final Bm f38229c;

    /* renamed from: d, reason: collision with root package name */
    public final Mh f38230d;

    /* renamed from: e, reason: collision with root package name */
    public final Z4 f38231e;

    /* renamed from: f, reason: collision with root package name */
    public final C2738jn f38232f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f38233g;

    /* renamed from: h, reason: collision with root package name */
    public final C2798m5 f38234h;

    /* renamed from: i, reason: collision with root package name */
    public final C3120yg f38235i;

    /* renamed from: j, reason: collision with root package name */
    public final C2875p4 f38236j;

    /* renamed from: k, reason: collision with root package name */
    public final Dg f38237k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f38238l;

    public S4(@NonNull Context context, @NonNull Hl hl, @NonNull C2772l5 c2772l5, @NonNull K4 k4, @NonNull C3120yg c3120yg) {
        this(context, hl, c2772l5, k4, new Mh(k4.f37862b), c3120yg, new C2798m5(), new U4(), new Dg());
    }

    public static void b(K4 k4) {
        Ia.f37730F.b().b(!Boolean.FALSE.equals(k4.f37862b.f37802n));
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final void a(@NonNull J4 j4) {
        Mh mh = this.f38230d;
        mh.f37978a = mh.f37978a.mergeFrom(j4);
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    @NonNull
    public final J4 d() {
        return this.f38230d.f37978a;
    }

    @NonNull
    public final C3120yg e() {
        return this.f38235i;
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NonNull
    public final Context getContext() {
        return this.f38227a;
    }

    public S4(Context context, Hl hl, C2772l5 c2772l5, K4 k4, Mh mh, C3120yg c3120yg, C2798m5 c2798m5, U4 u4, Dg dg) {
        this.f38233g = new ArrayList();
        this.f38238l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f38227a = applicationContext;
        this.f38228b = c2772l5;
        this.f38230d = mh;
        this.f38234h = c2798m5;
        this.f38231e = U4.a(this);
        b(k4);
        Bm a4 = hl.a(applicationContext, c2772l5, k4.f37861a);
        this.f38229c = a4;
        this.f38236j = AbstractC2901q4.a(a4, Ia.j().b());
        this.f38232f = u4.a(this, a4);
        this.f38235i = c3120yg;
        this.f38237k = dg;
        hl.a(c2772l5, this);
    }

    public final synchronized void a(@NonNull P4 p4) {
        this.f38234h.f39439a.add(p4);
        W6.a(p4.f38115c, this.f38236j.a(Gm.a(this.f38229c.e().f38990l)));
    }

    public final synchronized void b(@NonNull P4 p4) {
        this.f38234h.f39439a.remove(p4);
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NonNull
    public final C2772l5 b() {
        return this.f38228b;
    }

    public final void a(@NonNull C2773l6 c2773l6, @NonNull P4 p4) {
        Z4 z4 = this.f38231e;
        z4.getClass();
        z4.a(c2773l6, new Y4(p4));
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(@NonNull Jl jl, C2633fm c2633fm) {
        synchronized (this.f38238l) {
            try {
                ArrayList arrayList = this.f38233g;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    C2959sb c2959sb = (C2959sb) obj;
                    W6.a(c2959sb.f39791a, jl, this.f38236j.a(c2959sb.f39793c));
                }
                this.f38233g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(@NonNull C2633fm c2633fm) {
        synchronized (this.f38238l) {
            try {
                Iterator it = this.f38234h.f39439a.iterator();
                while (it.hasNext()) {
                    P4 p4 = (P4) it.next();
                    W6.a(p4.f38115c, this.f38236j.a(Gm.a(c2633fm.f38990l)));
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = this.f38233g;
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    C2959sb c2959sb = (C2959sb) obj;
                    if (AbstractC2553cm.a(c2633fm, c2959sb.f39792b, c2959sb.f39793c, new C2908qb())) {
                        W6.a(c2959sb.f39791a, this.f38236j.a(c2959sb.f39793c));
                    } else {
                        arrayList.add(c2959sb);
                    }
                }
                this.f38233g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f38232f.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(C2959sb c2959sb) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (c2959sb != null) {
            list = c2959sb.f39792b;
            resultReceiver = c2959sb.f39791a;
            hashMap = c2959sb.f39793c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a4 = this.f38229c.a(list, hashMap);
        if (!a4) {
            W6.a(resultReceiver, this.f38236j.a(hashMap));
        }
        if (!this.f38229c.g()) {
            if (a4) {
                W6.a(resultReceiver, this.f38236j.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.f38238l) {
            if (a4 && c2959sb != null) {
                try {
                    this.f38233g.add(c2959sb);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f38232f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.f38237k.a(new R4(resultReceiver));
    }

    @NonNull
    public final C2875p4 a() {
        return this.f38236j;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2515bb
    public final void a(@NonNull K4 k4) {
        this.f38229c.a(k4.f37861a);
        a(k4.f37862b);
    }
}
