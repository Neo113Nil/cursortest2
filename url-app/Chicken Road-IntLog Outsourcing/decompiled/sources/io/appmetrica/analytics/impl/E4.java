package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class E4 implements La, Ul, Na {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6722a;

    /* renamed from: b, reason: collision with root package name */
    public final X4 f6723b;

    /* renamed from: c, reason: collision with root package name */
    public final Em f6724c;

    /* renamed from: d, reason: collision with root package name */
    public final Eh f6725d;

    /* renamed from: e, reason: collision with root package name */
    public final L4 f6726e;

    /* renamed from: f, reason: collision with root package name */
    public final C0885on f6727f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f6728g;

    /* renamed from: h, reason: collision with root package name */
    public final Y4 f6729h;

    /* renamed from: i, reason: collision with root package name */
    public final C0930qg f6730i;

    /* renamed from: j, reason: collision with root package name */
    public final C0530b4 f6731j;

    /* renamed from: k, reason: collision with root package name */
    public final C1059vg f6732k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f6733l;

    public E4(Context context, Ll ll, X4 x42, C1073w4 c1073w4, C0930qg c0930qg) {
        this(context, ll, x42, c1073w4, new Eh(c1073w4.f9498b), c0930qg, new Y4(), new G4(), new C1059vg());
    }

    public static void b(C1073w4 c1073w4) {
        C1027ua.f9366H.c().b(!Boolean.FALSE.equals(c1073w4.f9498b.f9439n));
    }

    @Override // io.appmetrica.analytics.impl.La
    public final void a(C1047v4 c1047v4) {
        Eh eh = this.f6725d;
        eh.f6753a = eh.f6753a.mergeFrom(c1047v4);
    }

    @Override // io.appmetrica.analytics.impl.La
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    public final C1047v4 d() {
        return this.f6725d.f6753a;
    }

    public final C0930qg e() {
        return this.f6730i;
    }

    @Override // io.appmetrica.analytics.impl.La
    public final Context getContext() {
        return this.f6722a;
    }

    public E4(Context context, Ll ll, X4 x42, C1073w4 c1073w4, Eh eh, C0930qg c0930qg, Y4 y42, G4 g42, C1059vg c1059vg) {
        this.f6728g = new ArrayList();
        this.f6733l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f6722a = applicationContext;
        this.f6723b = x42;
        this.f6725d = eh;
        this.f6729h = y42;
        this.f6726e = G4.a(this);
        b(c1073w4);
        Em a6 = ll.a(applicationContext, x42, c1073w4.f9497a);
        this.f6724c = a6;
        this.f6731j = AbstractC0556c4.a(a6, C1027ua.k().c());
        this.f6727f = g42.a(this, a6);
        this.f6730i = c0930qg;
        this.f6732k = c1059vg;
        ll.a(x42, this);
    }

    public final synchronized void a(B4 b42) {
        this.f6729h.f7724a.add(b42);
        I6.a(b42.f6584c, this.f6731j.a(Jm.a(this.f6724c.e().f8570l)));
    }

    public final synchronized void b(B4 b42) {
        this.f6729h.f7724a.remove(b42);
    }

    @Override // io.appmetrica.analytics.impl.La
    public final X4 b() {
        return this.f6723b;
    }

    public final void a(W5 w5, B4 b42) {
        L4 l42 = this.f6726e;
        l42.getClass();
        l42.a(w5, new K4(b42));
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(Nl nl, C0754jm c0754jm) {
        synchronized (this.f6733l) {
            try {
                Iterator it = this.f6728g.iterator();
                while (it.hasNext()) {
                    C0614eb c0614eb = (C0614eb) it.next();
                    I6.a(c0614eb.f8126a, nl, this.f6731j.a(c0614eb.f8128c));
                }
                this.f6728g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(C0754jm c0754jm) {
        synchronized (this.f6733l) {
            try {
                Iterator it = this.f6729h.f7724a.iterator();
                while (it.hasNext()) {
                    B4 b42 = (B4) it.next();
                    I6.a(b42.f6584c, this.f6731j.a(Jm.a(c0754jm.f8570l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f6728g.iterator();
                while (it2.hasNext()) {
                    C0614eb c0614eb = (C0614eb) it2.next();
                    if (AbstractC0677gm.a(c0754jm, c0614eb.f8127b, c0614eb.f8128c, new C0563cb())) {
                        I6.a(c0614eb.f8126a, this.f6731j.a(c0614eb.f8128c));
                    } else {
                        arrayList.add(c0614eb);
                    }
                }
                this.f6728g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f6727f.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(C0614eb c0614eb) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (c0614eb != null) {
            list = c0614eb.f8127b;
            resultReceiver = c0614eb.f8126a;
            hashMap = c0614eb.f8128c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a6 = this.f6724c.a(list, hashMap);
        if (!a6) {
            I6.a(resultReceiver, this.f6731j.a(hashMap));
        }
        if (!this.f6724c.g()) {
            if (a6) {
                I6.a(resultReceiver, this.f6731j.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.f6733l) {
            if (a6 && c0614eb != null) {
                try {
                    this.f6728g.add(c0614eb);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f6727f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.f6732k.a(new D4(resultReceiver));
    }

    public final C0530b4 a() {
        return this.f6731j;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(C1073w4 c1073w4) {
        this.f6724c.a(c1073w4.f9497a);
        a(c1073w4.f9498b);
    }
}
