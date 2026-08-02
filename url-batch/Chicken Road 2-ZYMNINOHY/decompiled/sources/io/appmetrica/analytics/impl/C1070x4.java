package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.x4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1070x4 implements Ea, Ql, Ga {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12999a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f13000b;

    /* renamed from: c, reason: collision with root package name */
    public final Am f13001c;

    /* renamed from: d, reason: collision with root package name */
    public final C1135zh f13002d;

    /* renamed from: e, reason: collision with root package name */
    public final E4 f13003e;

    /* renamed from: f, reason: collision with root package name */
    public final C0778ln f13004f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f13005g;

    /* renamed from: h, reason: collision with root package name */
    public final R4 f13006h;

    /* renamed from: i, reason: collision with root package name */
    public final C0771lg f13007i;

    /* renamed from: j, reason: collision with root package name */
    public final T3 f13008j;

    /* renamed from: k, reason: collision with root package name */
    public final C0901qg f13009k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f13010l;

    public C1070x4(Context context, Hl hl, Q4 q4, C0863p4 c0863p4, C0771lg c0771lg) {
        this(context, hl, q4, c0863p4, new C1135zh(c0863p4.f12559b), c0771lg, new R4(), new C1122z4(), new C0901qg());
    }

    public static void b(C0863p4 c0863p4) {
        C0817na.f12417I.c().b(!Boolean.FALSE.equals(c0863p4.f12559b.n));
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final void a(C0837o4 c0837o4) {
        C1135zh c1135zh = this.f13002d;
        c1135zh.f13106a = c1135zh.f13106a.mergeFrom(c0837o4);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    public final C0837o4 d() {
        return this.f13002d.f13106a;
    }

    public final C0771lg e() {
        return this.f13007i;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Context getContext() {
        return this.f12999a;
    }

    public C1070x4(Context context, Hl hl, Q4 q4, C0863p4 c0863p4, C1135zh c1135zh, C0771lg c0771lg, R4 r4, C1122z4 c1122z4, C0901qg c0901qg) {
        this.f13005g = new ArrayList();
        this.f13010l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f12999a = applicationContext;
        this.f13000b = q4;
        this.f13002d = c1135zh;
        this.f13006h = r4;
        this.f13003e = C1122z4.a(this);
        b(c0863p4);
        Am a3 = hl.a(applicationContext, q4, c0863p4.f12558a);
        this.f13001c = a3;
        this.f13008j = U3.a(a3, C0817na.k().c());
        this.f13004f = c1122z4.a(this, a3);
        this.f13007i = c0771lg;
        this.f13009k = c0901qg;
        hl.a(q4, this);
    }

    public final synchronized void a(C0992u4 c0992u4) {
        this.f13006h.f10870a.add(c0992u4);
        B6.a(c0992u4.f12802c, this.f13008j.a(Fm.a(this.f13001c.e().f11871l)));
    }

    public final synchronized void b(C0992u4 c0992u4) {
        this.f13006h.f10870a.remove(c0992u4);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Q4 b() {
        return this.f13000b;
    }

    public final void a(P5 p5, C0992u4 c0992u4) {
        E4 e4 = this.f13003e;
        e4.getClass();
        e4.a(p5, new D4(c0992u4));
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(Jl jl, C0622fm c0622fm) {
        synchronized (this.f13010l) {
            try {
                ArrayList arrayList = this.f13005g;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    Xa xa = (Xa) obj;
                    B6.a(xa.f11258a, jl, this.f13008j.a(xa.f11260c));
                }
                this.f13005g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(C0622fm c0622fm) {
        synchronized (this.f13010l) {
            try {
                Iterator it = this.f13006h.f10870a.iterator();
                while (it.hasNext()) {
                    C0992u4 c0992u4 = (C0992u4) it.next();
                    B6.a(c0992u4.f12802c, this.f13008j.a(Fm.a(c0622fm.f11871l)));
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = this.f13005g;
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    Xa xa = (Xa) obj;
                    if (AbstractC0545cm.a(c0622fm, xa.f11259b, xa.f11260c, new Va())) {
                        B6.a(xa.f11258a, this.f13008j.a(xa.f11260c));
                    } else {
                        arrayList.add(xa);
                    }
                }
                this.f13005g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f13004f.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Xa xa) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (xa != null) {
            list = xa.f11259b;
            resultReceiver = xa.f11258a;
            hashMap = xa.f11260c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a3 = this.f13001c.a(list, hashMap);
        if (!a3) {
            B6.a(resultReceiver, this.f13008j.a(hashMap));
        }
        if (!this.f13001c.g()) {
            if (a3) {
                B6.a(resultReceiver, this.f13008j.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.f13010l) {
            if (a3 && xa != null) {
                try {
                    this.f13005g.add(xa);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f13004f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.f13009k.a(new C1044w4(resultReceiver));
    }

    public final T3 a() {
        return this.f13008j;
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(C0863p4 c0863p4) {
        this.f13001c.a(c0863p4.f12558a);
        a(c0863p4.f12559b);
    }
}
