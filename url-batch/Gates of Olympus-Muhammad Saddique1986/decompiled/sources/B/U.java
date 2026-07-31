package B;

import android.os.Bundle;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0286o;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import i.C0512d;
import i.C0514f;
import j.AbstractC0522D;
import j.C0550x;
import java.util.Map;
import java.util.concurrent.CancellationException;
import n.z0;
import q2.AbstractC0837y;
import q2.m0;
import s2.EnumC0967a;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f318b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f319c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f320d;

    public U(y1.f fVar) {
        this.f317a = 3;
        this.f319c = fVar;
        this.f320d = new y1.e();
    }

    public static final void a(U u3) {
        ((C0550x) u3.f319c).a();
        int i3 = 0;
        u3.f318b = false;
        K.d dVar = (K.d) u3.f320d;
        int i4 = dVar.f3216f;
        if (i4 > 0) {
            Object[] objArr = dVar.f3214d;
            do {
                ((InterfaceC0422a) objArr[i3]).b();
                i3++;
            } while (i3 < i4);
        }
        dVar.h();
    }

    public static final void b(U u3) {
        C0550x c0550x = (C0550x) u3.f319c;
        Object[] objArr = c0550x.f6345b;
        long[] jArr = c0550x.f6344a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            Z.t tVar = (Z.t) objArr[(i3 << 3) + i5];
                            tVar.getClass();
                            Z.s sVar = (Z.s) ((C0550x) Z.d.F(tVar).f319c).e(tVar);
                            if (sVar == null) {
                                z0.p("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                            tVar.f4708s = sVar;
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
        c0550x.a();
        u3.f318b = false;
        ((K.d) u3.f320d).h();
    }

    public void c() {
        ((s2.g) this.f319c).k(new CancellationException("onBack cancelled"), true);
        ((m0) this.f320d).a(null);
    }

    public int d() {
        C0014o c0014o = (C0014o) this.f320d;
        int i3 = c0014o.f428b;
        int i4 = c0014o.f429c;
        if (i3 < i4) {
            return 2;
        }
        return i3 > i4 ? 1 : 3;
    }

    public void e() {
        y1.f fVar = (y1.f) this.f319c;
        C0294x e3 = fVar.e();
        if (e3.f5242d != EnumC0286o.f5227e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        e3.a(new y1.b(0, fVar));
        y1.e eVar = (y1.e) this.f320d;
        eVar.getClass();
        if (eVar.f10388b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        e3.a(new t1.j(1, eVar));
        eVar.f10388b = true;
        this.f318b = true;
    }

    public void f(Bundle bundle) {
        if (!this.f318b) {
            e();
        }
        C0294x e3 = ((y1.f) this.f319c).e();
        if (e3.f5242d.compareTo(EnumC0286o.f5229g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e3.f5242d).toString());
        }
        y1.e eVar = (y1.e) this.f320d;
        if (!eVar.f10388b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (eVar.f10390d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        eVar.f10389c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f10390d = true;
    }

    public void g(Bundle bundle) {
        f2.j.f(bundle, "outBundle");
        y1.e eVar = (y1.e) this.f320d;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = eVar.f10389c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0514f c0514f = eVar.f10387a;
        c0514f.getClass();
        C0512d c0512d = new C0512d(c0514f);
        c0514f.f6235f.put(c0512d, Boolean.FALSE);
        while (c0512d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0512d.next();
            bundle2.putBundle((String) entry.getKey(), ((y1.d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public String toString() {
        switch (this.f317a) {
            case 0:
                StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
                sb.append(this.f318b);
                sb.append(", crossed=");
                int d3 = d();
                sb.append(d3 != 1 ? d3 != 2 ? d3 != 3 ? "null" : "COLLAPSED" : "NOT_CROSSED" : "CROSSED");
                sb.append(", info=\n\t");
                sb.append((C0014o) this.f320d);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public U() {
        this.f317a = 1;
        long[] jArr = AbstractC0522D.f6254a;
        this.f319c = new C0550x();
        this.f320d = new K.d(new InterfaceC0422a[16]);
    }

    public U(v2.c cVar, boolean z3, InterfaceC0426e interfaceC0426e, c.f fVar) {
        this.f317a = 2;
        this.f318b = z3;
        this.f319c = n.r.a(-2, 4, EnumC0967a.f8359d);
        this.f320d = AbstractC0837y.r(cVar, null, null, new c.e(fVar, interfaceC0426e, this, null), 3);
    }

    public U(boolean z3, C0016q c0016q, C0014o c0014o) {
        this.f317a = 0;
        this.f318b = z3;
        this.f319c = c0016q;
        this.f320d = c0014o;
    }
}
