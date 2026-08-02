package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lbx implements kxj {
    public final kuk a;
    public final long b;
    private final kuk c;
    private final kui d;

    public lbx(long j, lbx lbxVar, int i) {
        kul kulVar = kul.a;
        this.a = new kuk(null, kulVar);
        this.c = new kuk(lbxVar, kulVar);
        this.b = j;
        this.d = new kui(i << 16, kulVar);
    }

    public abstract int a();

    public abstract void k(int i);

    public final Object l() {
        return this.a.a;
    }

    public final lbx m() {
        Object l = l();
        if (l == lbw.a) {
            return null;
        }
        return (lbx) l;
    }

    public final lbx n() {
        return (lbx) this.c.a;
    }

    public final void o() {
        this.c.b(null);
    }

    public final void p() {
        Object obj;
        lbx m;
        boolean z = kvo.a;
        if (q()) {
            return;
        }
        while (true) {
            lbx n = n();
            while (n != null && n.t()) {
                n = (lbx) n.c.a;
            }
            lbx m2 = m();
            m2.getClass();
            while (m2.t() && (m = m2.m()) != null) {
                m2 = m;
            }
            kuk kukVar = m2.c;
            do {
                obj = kukVar.a;
            } while (!kukVar.d(obj, ((lbx) obj) == null ? null : n));
            if (n != null) {
                n.a.c(m2);
            }
            if (!m2.t() || m2.q()) {
                if (n == null || !n.t()) {
                    return;
                }
            }
        }
    }

    public final boolean q() {
        return m() == null;
    }

    public final void r() {
        if (this.d.c() == a()) {
            p();
        }
    }

    public final boolean s() {
        return kui.a.addAndGet(this.d, -65536) == a() && !q();
    }

    public final boolean t() {
        return this.d.b == a() && !q();
    }

    public final boolean u() {
        kui kuiVar;
        int i;
        do {
            kuiVar = this.d;
            i = kuiVar.b;
            if (i == a() && !q()) {
                return false;
            }
        } while (!kuiVar.d(i, 65536 + i));
        return true;
    }
}
