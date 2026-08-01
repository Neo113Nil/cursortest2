package t;

import java.util.Iterator;
import s.C0295a;
import s.C0298d;

/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310j extends AbstractC0315o {
    @Override // t.InterfaceC0304d
    public final void a(InterfaceC0304d interfaceC0304d) {
        C0295a c0295a = (C0295a) this.f3791b;
        int i = c0295a.f3585s0;
        C0306f c0306f = this.h;
        Iterator it = c0306f.f3777l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0306f) it.next()).f3774g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0306f.d(i3 + c0295a.f3587u0);
        } else {
            c0306f.d(i2 + c0295a.f3587u0);
        }
    }

    @Override // t.AbstractC0315o
    public final void d() {
        C0298d c0298d = this.f3791b;
        if (c0298d instanceof C0295a) {
            C0306f c0306f = this.h;
            c0306f.f3770b = true;
            C0295a c0295a = (C0295a) c0298d;
            int i = c0295a.f3585s0;
            boolean z2 = c0295a.f3586t0;
            int i2 = 0;
            if (i == 0) {
                c0306f.f3772e = 4;
                while (i2 < c0295a.f3747r0) {
                    C0298d c0298d2 = c0295a.f3746q0[i2];
                    if (z2 || c0298d2.f3646g0 != 8) {
                        C0306f c0306f2 = c0298d2.d.h;
                        c0306f2.f3776k.add(c0306f);
                        c0306f.f3777l.add(c0306f2);
                    }
                    i2++;
                }
                m(this.f3791b.d.h);
                m(this.f3791b.d.i);
                return;
            }
            if (i == 1) {
                c0306f.f3772e = 5;
                while (i2 < c0295a.f3747r0) {
                    C0298d c0298d3 = c0295a.f3746q0[i2];
                    if (z2 || c0298d3.f3646g0 != 8) {
                        C0306f c0306f3 = c0298d3.d.i;
                        c0306f3.f3776k.add(c0306f);
                        c0306f.f3777l.add(c0306f3);
                    }
                    i2++;
                }
                m(this.f3791b.d.h);
                m(this.f3791b.d.i);
                return;
            }
            if (i == 2) {
                c0306f.f3772e = 6;
                while (i2 < c0295a.f3747r0) {
                    C0298d c0298d4 = c0295a.f3746q0[i2];
                    if (z2 || c0298d4.f3646g0 != 8) {
                        C0306f c0306f4 = c0298d4.f3641e.h;
                        c0306f4.f3776k.add(c0306f);
                        c0306f.f3777l.add(c0306f4);
                    }
                    i2++;
                }
                m(this.f3791b.f3641e.h);
                m(this.f3791b.f3641e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0306f.f3772e = 7;
            while (i2 < c0295a.f3747r0) {
                C0298d c0298d5 = c0295a.f3746q0[i2];
                if (z2 || c0298d5.f3646g0 != 8) {
                    C0306f c0306f5 = c0298d5.f3641e.i;
                    c0306f5.f3776k.add(c0306f);
                    c0306f.f3777l.add(c0306f5);
                }
                i2++;
            }
            m(this.f3791b.f3641e.h);
            m(this.f3791b.f3641e.i);
        }
    }

    @Override // t.AbstractC0315o
    public final void e() {
        C0298d c0298d = this.f3791b;
        if (c0298d instanceof C0295a) {
            int i = ((C0295a) c0298d).f3585s0;
            C0306f c0306f = this.h;
            if (i == 0 || i == 1) {
                c0298d.f3632Y = c0306f.f3774g;
            } else {
                c0298d.f3633Z = c0306f.f3774g;
            }
        }
    }

    @Override // t.AbstractC0315o
    public final void f() {
        this.f3792c = null;
        this.h.c();
    }

    @Override // t.AbstractC0315o
    public final boolean k() {
        return false;
    }

    public final void m(C0306f c0306f) {
        C0306f c0306f2 = this.h;
        c0306f2.f3776k.add(c0306f);
        c0306f.f3777l.add(c0306f2);
    }
}
