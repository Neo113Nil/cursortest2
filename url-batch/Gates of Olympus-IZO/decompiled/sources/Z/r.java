package Z;

import android.os.Bundle;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0230o;
import e2.AbstractC0381e;
import i.C0459d;
import i.C0461f;
import j.AbstractC0478D;
import j.C0506x;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k2.AbstractC0552y;
import k2.m0;
import m2.EnumC0626a;
import q1.C0786j;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3453a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3454b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3455c;

    public r(u1.f fVar) {
        this.f3454b = fVar;
        this.f3455c = new u1.e();
    }

    public static final void a(r rVar) {
        ((C0506x) rVar.f3454b).a();
        int i3 = 0;
        rVar.f3453a = false;
        K.d dVar = (K.d) rVar.f3455c;
        int i4 = dVar.f2642f;
        if (i4 > 0) {
            Object[] objArr = dVar.f2640d;
            do {
                ((Y1.a) objArr[i3]).b();
                i3++;
            } while (i3 < i4);
        }
        dVar.h();
    }

    public static final void b(r rVar) {
        C0506x c0506x = (C0506x) rVar.f3454b;
        Object[] objArr = c0506x.f5227b;
        long[] jArr = c0506x.f5226a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            q qVar = (q) objArr[(i3 << 3) + i5];
                            qVar.getClass();
                            p pVar = (p) ((C0506x) c.E(qVar).f3454b).e(qVar);
                            if (pVar == null) {
                                AbstractC0381e.O("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                            qVar.f3452s = pVar;
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        c0506x.a();
        rVar.f3453a = false;
        ((K.d) rVar.f3455c).h();
    }

    public void c() {
        ((m2.e) this.f3454b).k(new CancellationException("onBack cancelled"), true);
        ((m0) this.f3455c).a(null);
    }

    public void d() {
        u1.f fVar = (u1.f) this.f3454b;
        C0238x e3 = fVar.e();
        if (e3.f4041d != EnumC0230o.f4026e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        e3.a(new u1.b(0, fVar));
        u1.e eVar = (u1.e) this.f3455c;
        if (eVar.f8513b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        e3.a(new C0786j(1, eVar));
        eVar.f8513b = true;
        this.f3453a = true;
    }

    public void e(Bundle bundle) {
        if (!this.f3453a) {
            d();
        }
        C0238x e3 = ((u1.f) this.f3454b).e();
        if (e3.f4041d.compareTo(EnumC0230o.f4028g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e3.f4041d).toString());
        }
        u1.e eVar = (u1.e) this.f3455c;
        if (!eVar.f8513b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (eVar.f8515d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        eVar.f8514c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f8515d = true;
    }

    public void f(Bundle bundle) {
        Z1.i.f(bundle, "outBundle");
        u1.e eVar = (u1.e) this.f3455c;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = eVar.f8514c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0461f c0461f = eVar.f8512a;
        c0461f.getClass();
        C0459d c0459d = new C0459d(c0461f);
        c0461f.f5095f.put(c0459d, Boolean.FALSE);
        while (c0459d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0459d.next();
            bundle2.putBundle((String) entry.getKey(), ((u1.d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public r() {
        long[] jArr = AbstractC0478D.f5136a;
        this.f3454b = new C0506x();
        this.f3455c = new K.d(new Y1.a[16]);
    }

    public r(p2.c cVar, boolean z3, Y1.e eVar, c.f fVar) {
        this.f3453a = z3;
        this.f3454b = m2.l.a(-2, 4, EnumC0626a.f5929d);
        this.f3455c = AbstractC0552y.q(cVar, null, null, new c.e(fVar, eVar, this, null), 3);
    }
}
