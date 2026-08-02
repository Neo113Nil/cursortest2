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
    public final Context f5934a;

    /* renamed from: b, reason: collision with root package name */
    public final X4 f5935b;

    /* renamed from: c, reason: collision with root package name */
    public final Em f5936c;

    /* renamed from: d, reason: collision with root package name */
    public final Eh f5937d;

    /* renamed from: e, reason: collision with root package name */
    public final L4 f5938e;
    public final C0734on f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f5939g;

    /* renamed from: h, reason: collision with root package name */
    public final Y4 f5940h;

    /* renamed from: i, reason: collision with root package name */
    public final C0779qg f5941i;

    /* renamed from: j, reason: collision with root package name */
    public final C0379b4 f5942j;

    /* renamed from: k, reason: collision with root package name */
    public final C0908vg f5943k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f5944l;

    public E4(Context context, Ll ll, X4 x4, C0922w4 c0922w4, C0779qg c0779qg) {
        this(context, ll, x4, c0922w4, new Eh(c0922w4.f8544b), c0779qg, new Y4(), new G4(), new C0908vg());
    }

    public static void b(C0922w4 c0922w4) {
        C0876ua.f8420H.c().b(!Boolean.FALSE.equals(c0922w4.f8544b.f8489n));
    }

    @Override // io.appmetrica.analytics.impl.La
    public final void a(C0896v4 c0896v4) {
        Eh eh = this.f5937d;
        eh.f5964a = eh.f5964a.mergeFrom(c0896v4);
    }

    @Override // io.appmetrica.analytics.impl.La
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    public final C0896v4 d() {
        return this.f5937d.f5964a;
    }

    public final C0779qg e() {
        return this.f5941i;
    }

    @Override // io.appmetrica.analytics.impl.La
    public final Context getContext() {
        return this.f5934a;
    }

    public E4(Context context, Ll ll, X4 x4, C0922w4 c0922w4, Eh eh, C0779qg c0779qg, Y4 y4, G4 g4, C0908vg c0908vg) {
        this.f5939g = new ArrayList();
        this.f5944l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f5934a = applicationContext;
        this.f5935b = x4;
        this.f5937d = eh;
        this.f5940h = y4;
        this.f5938e = G4.a(this);
        b(c0922w4);
        Em a3 = ll.a(applicationContext, x4, c0922w4.f8543a);
        this.f5936c = a3;
        this.f5942j = AbstractC0405c4.a(a3, C0876ua.k().c());
        this.f = g4.a(this, a3);
        this.f5941i = c0779qg;
        this.f5943k = c0908vg;
        ll.a(x4, this);
    }

    public final synchronized void a(B4 b4) {
        this.f5940h.f6886a.add(b4);
        I6.a(b4.f5804c, this.f5942j.a(Jm.a(this.f5936c.e().f7673l)));
    }

    public final synchronized void b(B4 b4) {
        this.f5940h.f6886a.remove(b4);
    }

    @Override // io.appmetrica.analytics.impl.La
    public final X4 b() {
        return this.f5935b;
    }

    public final void a(W5 w5, B4 b4) {
        L4 l4 = this.f5938e;
        l4.getClass();
        l4.a(w5, new K4(b4));
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(Nl nl, C0603jm c0603jm) {
        synchronized (this.f5944l) {
            try {
                Iterator it = this.f5939g.iterator();
                while (it.hasNext()) {
                    C0463eb c0463eb = (C0463eb) it.next();
                    I6.a(c0463eb.f7261a, nl, this.f5942j.a(c0463eb.f7263c));
                }
                this.f5939g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(C0603jm c0603jm) {
        synchronized (this.f5944l) {
            try {
                Iterator it = this.f5940h.f6886a.iterator();
                while (it.hasNext()) {
                    B4 b4 = (B4) it.next();
                    I6.a(b4.f5804c, this.f5942j.a(Jm.a(c0603jm.f7673l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f5939g.iterator();
                while (it2.hasNext()) {
                    C0463eb c0463eb = (C0463eb) it2.next();
                    if (AbstractC0526gm.a(c0603jm, c0463eb.f7262b, c0463eb.f7263c, new C0412cb())) {
                        I6.a(c0463eb.f7261a, this.f5942j.a(c0463eb.f7263c));
                    } else {
                        arrayList.add(c0463eb);
                    }
                }
                this.f5939g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(C0463eb c0463eb) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (c0463eb != null) {
            list = c0463eb.f7262b;
            resultReceiver = c0463eb.f7261a;
            hashMap = c0463eb.f7263c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a3 = this.f5936c.a(list, hashMap);
        if (!a3) {
            I6.a(resultReceiver, this.f5942j.a(hashMap));
        }
        if (!this.f5936c.g()) {
            if (a3) {
                I6.a(resultReceiver, this.f5942j.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.f5944l) {
            if (a3 && c0463eb != null) {
                try {
                    this.f5939g.add(c0463eb);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.f5943k.a(new D4(resultReceiver));
    }

    public final C0379b4 a() {
        return this.f5942j;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(C0922w4 c0922w4) {
        this.f5936c.a(c0922w4.f8543a);
        a(c0922w4.f8544b);
    }
}
