package t;

import java.util.Iterator;
import s.C0278a;
import s.C0281d;

/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293j extends AbstractC0298o {
    @Override // t.InterfaceC0287d
    public final void a(InterfaceC0287d interfaceC0287d) {
        C0278a c0278a = (C0278a) this.f3816b;
        int i = c0278a.f3579s0;
        C0289f c0289f = this.h;
        Iterator it = c0289f.f3802l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0289f) it.next()).f3799g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0289f.d(i3 + c0278a.f3581u0);
        } else {
            c0289f.d(i2 + c0278a.f3581u0);
        }
    }

    @Override // t.AbstractC0298o
    public final void d() {
        C0281d c0281d = this.f3816b;
        if (c0281d instanceof C0278a) {
            C0289f c0289f = this.h;
            c0289f.f3795b = true;
            C0278a c0278a = (C0278a) c0281d;
            int i = c0278a.f3579s0;
            boolean z2 = c0278a.f3580t0;
            int i2 = 0;
            if (i == 0) {
                c0289f.f3797e = 4;
                while (i2 < c0278a.f3739r0) {
                    C0281d c0281d2 = c0278a.f3738q0[i2];
                    if (z2 || c0281d2.f3640g0 != 8) {
                        C0289f c0289f2 = c0281d2.d.h;
                        c0289f2.f3801k.add(c0289f);
                        c0289f.f3802l.add(c0289f2);
                    }
                    i2++;
                }
                m(this.f3816b.d.h);
                m(this.f3816b.d.i);
                return;
            }
            if (i == 1) {
                c0289f.f3797e = 5;
                while (i2 < c0278a.f3739r0) {
                    C0281d c0281d3 = c0278a.f3738q0[i2];
                    if (z2 || c0281d3.f3640g0 != 8) {
                        C0289f c0289f3 = c0281d3.d.i;
                        c0289f3.f3801k.add(c0289f);
                        c0289f.f3802l.add(c0289f3);
                    }
                    i2++;
                }
                m(this.f3816b.d.h);
                m(this.f3816b.d.i);
                return;
            }
            if (i == 2) {
                c0289f.f3797e = 6;
                while (i2 < c0278a.f3739r0) {
                    C0281d c0281d4 = c0278a.f3738q0[i2];
                    if (z2 || c0281d4.f3640g0 != 8) {
                        C0289f c0289f4 = c0281d4.f3635e.h;
                        c0289f4.f3801k.add(c0289f);
                        c0289f.f3802l.add(c0289f4);
                    }
                    i2++;
                }
                m(this.f3816b.f3635e.h);
                m(this.f3816b.f3635e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0289f.f3797e = 7;
            while (i2 < c0278a.f3739r0) {
                C0281d c0281d5 = c0278a.f3738q0[i2];
                if (z2 || c0281d5.f3640g0 != 8) {
                    C0289f c0289f5 = c0281d5.f3635e.i;
                    c0289f5.f3801k.add(c0289f);
                    c0289f.f3802l.add(c0289f5);
                }
                i2++;
            }
            m(this.f3816b.f3635e.h);
            m(this.f3816b.f3635e.i);
        }
    }

    @Override // t.AbstractC0298o
    public final void e() {
        C0281d c0281d = this.f3816b;
        if (c0281d instanceof C0278a) {
            int i = ((C0278a) c0281d).f3579s0;
            C0289f c0289f = this.h;
            if (i == 0 || i == 1) {
                c0281d.f3626Y = c0289f.f3799g;
            } else {
                c0281d.f3627Z = c0289f.f3799g;
            }
        }
    }

    @Override // t.AbstractC0298o
    public final void f() {
        this.f3817c = null;
        this.h.c();
    }

    @Override // t.AbstractC0298o
    public final boolean k() {
        return false;
    }

    public final void m(C0289f c0289f) {
        C0289f c0289f2 = this.h;
        c0289f2.f3801k.add(c0289f);
        c0289f.f3802l.add(c0289f2);
    }
}
