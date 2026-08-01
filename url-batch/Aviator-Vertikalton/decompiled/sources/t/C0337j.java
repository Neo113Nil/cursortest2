package t;

import java.util.Iterator;
import s.C0322a;
import s.C0325d;

/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337j extends AbstractC0342o {
    @Override // t.InterfaceC0331d
    public final void a(InterfaceC0331d interfaceC0331d) {
        C0322a c0322a = (C0322a) this.f4192b;
        int i = c0322a.f3979s0;
        C0333f c0333f = this.h;
        Iterator it = c0333f.f4177l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0333f) it.next()).f4174g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0333f.d(i3 + c0322a.f3981u0);
        } else {
            c0333f.d(i2 + c0322a.f3981u0);
        }
    }

    @Override // t.AbstractC0342o
    public final void d() {
        C0325d c0325d = this.f4192b;
        if (c0325d instanceof C0322a) {
            C0333f c0333f = this.h;
            c0333f.f4169b = true;
            C0322a c0322a = (C0322a) c0325d;
            int i = c0322a.f3979s0;
            boolean z2 = c0322a.f3980t0;
            int i2 = 0;
            if (i == 0) {
                c0333f.f4172e = 4;
                while (i2 < c0322a.f4143r0) {
                    C0325d c0325d2 = c0322a.f4142q0[i2];
                    if (z2 || c0325d2.f4043g0 != 8) {
                        C0333f c0333f2 = c0325d2.f4036d.h;
                        c0333f2.f4176k.add(c0333f);
                        c0333f.f4177l.add(c0333f2);
                    }
                    i2++;
                }
                m(this.f4192b.f4036d.h);
                m(this.f4192b.f4036d.i);
                return;
            }
            if (i == 1) {
                c0333f.f4172e = 5;
                while (i2 < c0322a.f4143r0) {
                    C0325d c0325d3 = c0322a.f4142q0[i2];
                    if (z2 || c0325d3.f4043g0 != 8) {
                        C0333f c0333f3 = c0325d3.f4036d.i;
                        c0333f3.f4176k.add(c0333f);
                        c0333f.f4177l.add(c0333f3);
                    }
                    i2++;
                }
                m(this.f4192b.f4036d.h);
                m(this.f4192b.f4036d.i);
                return;
            }
            if (i == 2) {
                c0333f.f4172e = 6;
                while (i2 < c0322a.f4143r0) {
                    C0325d c0325d4 = c0322a.f4142q0[i2];
                    if (z2 || c0325d4.f4043g0 != 8) {
                        C0333f c0333f4 = c0325d4.f4038e.h;
                        c0333f4.f4176k.add(c0333f);
                        c0333f.f4177l.add(c0333f4);
                    }
                    i2++;
                }
                m(this.f4192b.f4038e.h);
                m(this.f4192b.f4038e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0333f.f4172e = 7;
            while (i2 < c0322a.f4143r0) {
                C0325d c0325d5 = c0322a.f4142q0[i2];
                if (z2 || c0325d5.f4043g0 != 8) {
                    C0333f c0333f5 = c0325d5.f4038e.i;
                    c0333f5.f4176k.add(c0333f);
                    c0333f.f4177l.add(c0333f5);
                }
                i2++;
            }
            m(this.f4192b.f4038e.h);
            m(this.f4192b.f4038e.i);
        }
    }

    @Override // t.AbstractC0342o
    public final void e() {
        C0325d c0325d = this.f4192b;
        if (c0325d instanceof C0322a) {
            int i = ((C0322a) c0325d).f3979s0;
            C0333f c0333f = this.h;
            if (i == 0 || i == 1) {
                c0325d.f4028Y = c0333f.f4174g;
            } else {
                c0325d.f4029Z = c0333f.f4174g;
            }
        }
    }

    @Override // t.AbstractC0342o
    public final void f() {
        this.f4193c = null;
        this.h.c();
    }

    @Override // t.AbstractC0342o
    public final boolean k() {
        return false;
    }

    public final void m(C0333f c0333f) {
        C0333f c0333f2 = this.h;
        c0333f2.f4176k.add(c0333f);
        c0333f.f4177l.add(c0333f2);
    }
}
