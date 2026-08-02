package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kuw extends kvy implements kuv, kqx, kyc {
    public final kqj a;
    public final kqn b;
    public final kui c;
    public final kuk d;
    private final kuk f;

    public kuw(kqj kqjVar, int i) {
        super(i);
        this.a = kqjVar;
        boolean z = kvo.a;
        this.b = kqjVar.bU();
        kul kulVar = kul.a;
        this.c = new kui(536870911, kulVar);
        this.d = new kuk(kun.a, kulVar);
        this.f = new kuk(null, kulVar);
    }

    private final kwc H() {
        kwu kwuVar = (kwu) this.b.get(kwu.d);
        if (kwuVar == null) {
            return null;
        }
        kwc g = ixi.g(kwuVar, true, new kuz(this));
        this.f.d(null, g);
        return g;
    }

    private final void I(int i) {
        kui kuiVar;
        int i2;
        do {
            kuiVar = this.c;
            i2 = kuiVar.b;
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = kvo.a;
                kqj s = s();
                boolean z2 = i == 4;
                if (z2 || !(s instanceof lcc) || ixh.e(i) != ixh.e(this.e)) {
                    ixh.d(this, s, z2);
                    return;
                }
                lcc lccVar = (lcc) s;
                kvj kvjVar = lccVar.a;
                kqn bU = lccVar.bU();
                if (lcd.c(kvjVar, bU)) {
                    lcd.b(kvjVar, bU, this);
                    return;
                }
                ThreadLocal threadLocal = kxv.a;
                kwf a = kxv.a();
                if (a.p()) {
                    a.n(this);
                    return;
                }
                a.o(true);
                try {
                    ixh.d(this, s(), true);
                    do {
                    } while (a.r());
                    return;
                } catch (Throwable th) {
                    try {
                        G(th);
                        return;
                    } finally {
                        a.m(true);
                    }
                }
            }
        } while (!kuiVar.d(i2, (536870911 & i2) + 1073741824));
    }

    private static final void J(Object obj, Object obj2) {
        throw new IllegalStateException(a.ae(obj2, obj, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    private static final Object K(kxj kxjVar, Object obj, int i, kry kryVar) {
        if (obj instanceof kve) {
            boolean z = kvo.a;
            return obj;
        }
        if (ixh.e(i)) {
            if (kryVar == null) {
                if (kxjVar instanceof kuu) {
                    kryVar = null;
                }
            }
            return new kvd(obj, kxjVar instanceof kuu ? (kuu) kxjVar : null, kryVar, null);
        }
        return obj;
    }

    private final void L(lbx lbxVar) {
        int i = this.c.b & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            lbxVar.k(i);
        } catch (Throwable th) {
            kqn kqnVar = this.b;
            toString();
            kvp.i(kqnVar, new kvf("Exception in invokeOnCancellation handler for ".concat(toString()), th));
        }
    }

    public final void A() {
        kqj kqjVar = this.a;
        Throwable th = null;
        lcc lccVar = kqjVar instanceof lcc ? (lcc) kqjVar : null;
        if (lccVar != null) {
            while (true) {
                kuk kukVar = lccVar.f;
                Object obj = kukVar.a;
                ldb ldbVar = lcd.b;
                if (obj == ldbVar) {
                    if (kukVar.d(ldbVar, this)) {
                        break;
                    }
                } else {
                    if (!(obj instanceof Throwable)) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
                    }
                    if (!kukVar.d(obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            w();
            j(th);
        }
    }

    public final void B(Object obj, int i, kry kryVar) {
        kuk kukVar;
        Object obj2;
        do {
            kukVar = this.d;
            obj2 = kukVar.a;
            if (!(obj2 instanceof kxj)) {
                if (obj2 instanceof kuy) {
                    kuy kuyVar = (kuy) obj2;
                    if (kuyVar.a.b()) {
                        if (kryVar != null) {
                            v(kryVar, kuyVar.b, obj);
                            return;
                        }
                        return;
                    }
                }
                Objects.toString(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!kukVar.d(obj2, K((kxj) obj2, obj, i, kryVar)));
        x();
        I(i);
    }

    public final boolean C() {
        return this.e == 2 && ((lcc) this.a).f.a != null;
    }

    @Override // defpackage.kyc
    public final void D(lbx lbxVar, int i) {
        kui kuiVar;
        int i2;
        do {
            kuiVar = this.c;
            i2 = kuiVar.b;
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!kuiVar.d(i2, ((i2 >> 29) << 29) + i));
        z(lbxVar);
    }

    @Override // defpackage.kvy
    public final void E(Throwable th) {
        while (true) {
            kuk kukVar = this.d;
            Object obj = kukVar.a;
            if (obj instanceof kxj) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof kve) {
                return;
            }
            if (obj instanceof kvd) {
                kvd kvdVar = (kvd) obj;
                if (kvdVar.a()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (kukVar.d(obj, kvd.b(kvdVar, null, th, 15))) {
                    kuu kuuVar = kvdVar.b;
                    if (kuuVar != null) {
                        u(kuuVar, th);
                    }
                    kry kryVar = kvdVar.c;
                    if (kryVar != null) {
                        v(kryVar, th, kvdVar.a);
                        return;
                    }
                    return;
                }
            } else if (kukVar.d(obj, new kvd(obj, null, null, th))) {
                return;
            }
        }
    }

    public final ldb F(Object obj, kry kryVar) {
        kuk kukVar;
        Object obj2;
        do {
            kukVar = this.d;
            obj2 = kukVar.a;
            if (!(obj2 instanceof kxj)) {
                return null;
            }
        } while (!kukVar.d(obj2, K((kxj) obj2, obj, this.e, kryVar)));
        x();
        return kux.a;
    }

    @Override // defpackage.kuv
    public final void a(Object obj) {
        boolean z = kvo.a;
        I(this.e);
    }

    @Override // defpackage.kuv
    public final void b(krt krtVar) {
        z(new kut(krtVar, 0));
    }

    @Override // defpackage.kqj
    public final kqn bU() {
        return this.b;
    }

    @Override // defpackage.kuv
    public final void c(kvj kvjVar, Object obj) {
        kqj kqjVar = this.a;
        lcc lccVar = kqjVar instanceof lcc ? (lcc) kqjVar : null;
        B(obj, (lccVar != null ? lccVar.a : null) == kvjVar ? 4 : this.e, null);
    }

    @Override // defpackage.kqj
    public final void ca(Object obj) {
        Throwable a = kon.a(obj);
        if (a != null) {
            if (kvo.b) {
                a = lda.a(a, this);
            }
            obj = new kve(a, false);
        }
        B(obj, this.e, null);
    }

    @Override // defpackage.kqx
    public final StackTraceElement f() {
        return null;
    }

    @Override // defpackage.kqx
    public final kqx g() {
        kqj kqjVar = this.a;
        if (kqjVar instanceof kqx) {
            return (kqx) kqjVar;
        }
        return null;
    }

    @Override // defpackage.kuv
    public final boolean h() {
        return !(m() instanceof kxj);
    }

    @Override // defpackage.kuv
    public final Object i(Object obj, kry kryVar) {
        return F(obj, kryVar);
    }

    @Override // defpackage.kuv
    public final void j(Throwable th) {
        kuk kukVar;
        Object obj;
        boolean z;
        do {
            kukVar = this.d;
            obj = kukVar.a;
            if (!(obj instanceof kxj)) {
                return;
            }
            z = true;
            if (!(obj instanceof kuu) && !(obj instanceof lbx)) {
                z = false;
            }
        } while (!kukVar.d(obj, new kuy(this, th, z)));
        kxj kxjVar = (kxj) obj;
        if (kxjVar instanceof kuu) {
            u((kuu) obj, th);
        } else if (kxjVar instanceof lbx) {
            L((lbx) obj);
        }
        x();
        I(this.e);
    }

    @Override // defpackage.kuv
    public final void k(Object obj) {
        B(obj, this.e, null);
    }

    public final Object l() {
        kui kuiVar;
        int i;
        kwu kwuVar;
        boolean C = C();
        do {
            kuiVar = this.c;
            i = kuiVar.b;
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (C) {
                    A();
                }
                Object m = m();
                if (m instanceof kve) {
                    Throwable th = ((kve) m).b;
                    if (kvo.b) {
                        throw lda.a(th, this);
                    }
                    throw th;
                }
                if (!ixh.e(this.e) || (kwuVar = (kwu) this.b.get(kwu.d)) == null || kwuVar.t()) {
                    return n(m);
                }
                CancellationException p = kwuVar.p();
                E(p);
                if (kvo.b) {
                    throw lda.a(p, this);
                }
                throw p;
            }
        } while (!kuiVar.d(i, (536870911 & i) + 536870912));
        if (t() == null) {
            H();
        }
        if (C) {
            A();
        }
        return kqp.a;
    }

    public final Object m() {
        return this.d.a;
    }

    @Override // defpackage.kvy
    public final Object n(Object obj) {
        return obj instanceof kvd ? ((kvd) obj).a : obj;
    }

    @Override // defpackage.kvy
    public final Object o() {
        return m();
    }

    protected String p() {
        return "CancellableContinuation";
    }

    public Throwable q(kwu kwuVar) {
        return kwuVar.p();
    }

    @Override // defpackage.kvy
    public final Throwable r(Object obj) {
        Throwable r = super.r(obj);
        if (r == null) {
            return null;
        }
        kqj kqjVar = this.a;
        return (kvo.b && (kqjVar instanceof kqx)) ? lda.a(r, (kqx) kqjVar) : r;
    }

    @Override // defpackage.kvy
    public final kqj s() {
        return this.a;
    }

    public final kwc t() {
        return (kwc) this.f.a;
    }

    public final String toString() {
        String c = kvp.c(this.a);
        Object m = m();
        String str = m instanceof kxj ? "Active" : m instanceof kuy ? "Cancelled" : "Completed";
        return p() + "(" + c + "){" + str + "}@" + kvp.b(this);
    }

    public final void u(kuu kuuVar, Throwable th) {
        try {
            kuuVar.b(th);
        } catch (Throwable th2) {
            kqn kqnVar = this.b;
            toString();
            kvp.i(kqnVar, new kvf("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void v(kry kryVar, Throwable th, Object obj) {
        try {
            kryVar.a(th, obj, this.b);
        } catch (Throwable th2) {
            kqn kqnVar = this.b;
            toString();
            kvp.i(kqnVar, new kvf("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void w() {
        kwc t = t();
        if (t == null) {
            return;
        }
        t.bQ();
        this.f.c(kxi.a);
    }

    public final void x() {
        if (C()) {
            return;
        }
        w();
    }

    public final void y() {
        kwc H = H();
        if (H != null && h()) {
            H.bQ();
            this.f.c(kxi.a);
        }
    }

    public final void z(Object obj) {
        boolean z = kvo.a;
        while (true) {
            kuk kukVar = this.d;
            Object obj2 = kukVar.a;
            if (obj2 instanceof kun) {
                if (kukVar.d(obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof kuu) || (obj2 instanceof lbx)) {
                J(obj, obj2);
            } else {
                if (obj2 instanceof kve) {
                    kve kveVar = (kve) obj2;
                    if (!kveVar.a()) {
                        J(obj, obj2);
                    }
                    if (obj2 instanceof kuy) {
                        Throwable th = kveVar != null ? kveVar.b : null;
                        if (obj instanceof kuu) {
                            u((kuu) obj, th);
                            return;
                        } else {
                            obj.getClass();
                            L((lbx) obj);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof kvd) {
                    kvd kvdVar = (kvd) obj2;
                    if (kvdVar.b != null) {
                        J(obj, obj2);
                    }
                    if (obj instanceof lbx) {
                        return;
                    }
                    obj.getClass();
                    kuu kuuVar = (kuu) obj;
                    if (kvdVar.a()) {
                        u(kuuVar, kvdVar.e);
                        return;
                    } else if (kukVar.d(obj2, kvd.b(kvdVar, kuuVar, null, 29))) {
                        return;
                    }
                } else {
                    if (obj instanceof lbx) {
                        return;
                    }
                    obj.getClass();
                    if (kukVar.d(obj2, new kvd(obj2, (kuu) obj, null, null))) {
                        return;
                    }
                }
            }
        }
    }
}
