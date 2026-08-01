package v;

import java.util.Iterator;
import u.C0384a;
import u.C0387d;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401j extends AbstractC0406o {
    @Override // v.InterfaceC0395d
    public final void a(InterfaceC0395d interfaceC0395d) {
        C0384a c0384a = (C0384a) this.f4437b;
        int i = c0384a.s0;
        C0397f c0397f = this.f4442h;
        Iterator it = c0397f.f4423l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0397f) it.next()).f4420g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0397f.d(i3 + c0384a.f4206u0);
        } else {
            c0397f.d(i2 + c0384a.f4206u0);
        }
    }

    @Override // v.AbstractC0406o
    public final void d() {
        C0387d c0387d = this.f4437b;
        if (c0387d instanceof C0384a) {
            C0397f c0397f = this.f4442h;
            c0397f.f4416b = true;
            C0384a c0384a = (C0384a) c0387d;
            int i = c0384a.s0;
            boolean z2 = c0384a.f4205t0;
            int i2 = 0;
            if (i == 0) {
                c0397f.e = 4;
                while (i2 < c0384a.f4367r0) {
                    C0387d c0387d2 = c0384a.f4366q0[i2];
                    if (z2 || c0387d2.f4266g0 != 8) {
                        C0397f c0397f2 = c0387d2.f4260d.f4442h;
                        c0397f2.f4422k.add(c0397f);
                        c0397f.f4423l.add(c0397f2);
                    }
                    i2++;
                }
                m(this.f4437b.f4260d.f4442h);
                m(this.f4437b.f4260d.i);
                return;
            }
            if (i == 1) {
                c0397f.e = 5;
                while (i2 < c0384a.f4367r0) {
                    C0387d c0387d3 = c0384a.f4366q0[i2];
                    if (z2 || c0387d3.f4266g0 != 8) {
                        C0397f c0397f3 = c0387d3.f4260d.i;
                        c0397f3.f4422k.add(c0397f);
                        c0397f.f4423l.add(c0397f3);
                    }
                    i2++;
                }
                m(this.f4437b.f4260d.f4442h);
                m(this.f4437b.f4260d.i);
                return;
            }
            if (i == 2) {
                c0397f.e = 6;
                while (i2 < c0384a.f4367r0) {
                    C0387d c0387d4 = c0384a.f4366q0[i2];
                    if (z2 || c0387d4.f4266g0 != 8) {
                        C0397f c0397f4 = c0387d4.e.f4442h;
                        c0397f4.f4422k.add(c0397f);
                        c0397f.f4423l.add(c0397f4);
                    }
                    i2++;
                }
                m(this.f4437b.e.f4442h);
                m(this.f4437b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0397f.e = 7;
            while (i2 < c0384a.f4367r0) {
                C0387d c0387d5 = c0384a.f4366q0[i2];
                if (z2 || c0387d5.f4266g0 != 8) {
                    C0397f c0397f5 = c0387d5.e.i;
                    c0397f5.f4422k.add(c0397f);
                    c0397f.f4423l.add(c0397f5);
                }
                i2++;
            }
            m(this.f4437b.e.f4442h);
            m(this.f4437b.e.i);
        }
    }

    @Override // v.AbstractC0406o
    public final void e() {
        C0387d c0387d = this.f4437b;
        if (c0387d instanceof C0384a) {
            int i = ((C0384a) c0387d).s0;
            C0397f c0397f = this.f4442h;
            if (i == 0 || i == 1) {
                c0387d.f4252Y = c0397f.f4420g;
            } else {
                c0387d.f4253Z = c0397f.f4420g;
            }
        }
    }

    @Override // v.AbstractC0406o
    public final void f() {
        this.f4438c = null;
        this.f4442h.c();
    }

    @Override // v.AbstractC0406o
    public final boolean k() {
        return false;
    }

    public final void m(C0397f c0397f) {
        C0397f c0397f2 = this.f4442h;
        c0397f2.f4422k.add(c0397f);
        c0397f.f4423l.add(c0397f2);
    }
}
