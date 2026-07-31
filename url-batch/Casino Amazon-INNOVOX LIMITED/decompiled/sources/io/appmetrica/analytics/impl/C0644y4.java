package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0644y4 implements Fa, Rl, Ha {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1577a;
    public final R4 b;
    public final Bm c;
    public final Ah d;
    public final F4 e;
    public final C0364mn f;
    public ArrayList g;
    public final S4 h;
    public final C0357mg i;
    public final U3 j;
    public final C0481rg k;
    public final Object l;

    public C0644y4(Context context, Il il, R4 r4, C0445q4 c0445q4, C0357mg c0357mg) {
        this(context, il, r4, c0445q4, new Ah(c0445q4.b), c0357mg, new S4(), new A4(), new C0481rg());
    }

    public static void b(C0445q4 c0445q4) {
        C0401oa.I.c().b(!Boolean.FALSE.equals(c0445q4.b.n));
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(C0420p4 c0420p4) {
        Ah ah = this.d;
        ah.f764a = ah.f764a.mergeFrom(c0420p4);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    public final C0420p4 d() {
        return this.d.f764a;
    }

    public final C0357mg e() {
        return this.i;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final Context getContext() {
        return this.f1577a;
    }

    public C0644y4(Context context, Il il, R4 r4, C0445q4 c0445q4, Ah ah, C0357mg c0357mg, S4 s4, A4 a4, C0481rg c0481rg) {
        this.g = new ArrayList();
        this.l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f1577a = applicationContext;
        this.b = r4;
        this.d = ah;
        this.h = s4;
        this.e = A4.a(this);
        b(c0445q4);
        Bm a2 = il.a(applicationContext, r4, c0445q4.f1446a);
        this.c = a2;
        this.j = V3.a(a2, C0401oa.k().c());
        this.f = a4.a(this, a2);
        this.i = c0357mg;
        this.k = c0481rg;
        il.a(r4, this);
    }

    public final synchronized void a(C0569v4 c0569v4) {
        this.h.f1038a.add(c0569v4);
        C6.a(c0569v4.c, this.j.a(Gm.a(this.c.e().l)));
    }

    public final synchronized void b(C0569v4 c0569v4) {
        this.h.f1038a.remove(c0569v4);
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final R4 b() {
        return this.b;
    }

    public final void a(Q5 q5, C0569v4 c0569v4) {
        F4 f4 = this.e;
        f4.getClass();
        f4.a(q5, new E4(c0569v4));
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(Kl kl, C0209gm c0209gm) {
        synchronized (this.l) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                Ya ya = (Ya) it.next();
                C6.a(ya.f1129a, kl, this.j.a(ya.c));
            }
            this.g.clear();
        }
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(C0209gm c0209gm) {
        synchronized (this.l) {
            Iterator it = this.h.f1038a.iterator();
            while (it.hasNext()) {
                C0569v4 c0569v4 = (C0569v4) it.next();
                C6.a(c0569v4.c, this.j.a(Gm.a(c0209gm.l)));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.g.iterator();
            while (it2.hasNext()) {
                Ya ya = (Ya) it2.next();
                if (AbstractC0132dm.a(c0209gm, ya.b, ya.c, new Wa())) {
                    C6.a(ya.f1129a, this.j.a(ya.c));
                } else {
                    arrayList.add(ya);
                }
            }
            this.g = new ArrayList(arrayList);
            if (!arrayList.isEmpty()) {
                this.f.c();
            }
        }
    }

    public final void a(Ya ya) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (ya != null) {
            list = ya.b;
            resultReceiver = ya.f1129a;
            hashMap = ya.c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a2 = this.c.a(list, hashMap);
        if (!a2) {
            C6.a(resultReceiver, this.j.a(hashMap));
        }
        if (!this.c.g()) {
            if (a2) {
                C6.a(resultReceiver, this.j.a(hashMap));
            }
        } else {
            synchronized (this.l) {
                if (a2 && ya != null) {
                    this.g.add(ya);
                }
            }
            this.f.c();
        }
    }

    public final void a(ResultReceiver resultReceiver) {
        this.k.a(new C0619x4(resultReceiver));
    }

    public final U3 a() {
        return this.j;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void a(C0445q4 c0445q4) {
        this.c.a(c0445q4.f1446a);
        a(c0445q4.b);
    }
}
