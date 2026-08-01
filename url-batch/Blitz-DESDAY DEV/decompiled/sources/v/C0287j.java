package v;

import java.util.Iterator;
import u.C0272a;
import u.C0275d;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287j extends AbstractC0292o {
    @Override // v.InterfaceC0281d
    public final void a(InterfaceC0281d interfaceC0281d) {
        C0272a c0272a = (C0272a) this.f3836b;
        int i = c0272a.f3617s0;
        C0283f c0283f = this.h;
        Iterator it = c0283f.f3822l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0283f) it.next()).f3819g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0283f.d(i3 + c0272a.f3619u0);
        } else {
            c0283f.d(i2 + c0272a.f3619u0);
        }
    }

    @Override // v.AbstractC0292o
    public final void d() {
        C0275d c0275d = this.f3836b;
        if (c0275d instanceof C0272a) {
            C0283f c0283f = this.h;
            c0283f.f3815b = true;
            C0272a c0272a = (C0272a) c0275d;
            int i = c0272a.f3617s0;
            boolean z2 = c0272a.f3618t0;
            int i2 = 0;
            if (i == 0) {
                c0283f.f3817e = 4;
                while (i2 < c0272a.f3780r0) {
                    C0275d c0275d2 = c0272a.f3779q0[i2];
                    if (z2 || c0275d2.f3678g0 != 8) {
                        C0283f c0283f2 = c0275d2.d.h;
                        c0283f2.f3821k.add(c0283f);
                        c0283f.f3822l.add(c0283f2);
                    }
                    i2++;
                }
                m(this.f3836b.d.h);
                m(this.f3836b.d.i);
                return;
            }
            if (i == 1) {
                c0283f.f3817e = 5;
                while (i2 < c0272a.f3780r0) {
                    C0275d c0275d3 = c0272a.f3779q0[i2];
                    if (z2 || c0275d3.f3678g0 != 8) {
                        C0283f c0283f3 = c0275d3.d.i;
                        c0283f3.f3821k.add(c0283f);
                        c0283f.f3822l.add(c0283f3);
                    }
                    i2++;
                }
                m(this.f3836b.d.h);
                m(this.f3836b.d.i);
                return;
            }
            if (i == 2) {
                c0283f.f3817e = 6;
                while (i2 < c0272a.f3780r0) {
                    C0275d c0275d4 = c0272a.f3779q0[i2];
                    if (z2 || c0275d4.f3678g0 != 8) {
                        C0283f c0283f4 = c0275d4.f3673e.h;
                        c0283f4.f3821k.add(c0283f);
                        c0283f.f3822l.add(c0283f4);
                    }
                    i2++;
                }
                m(this.f3836b.f3673e.h);
                m(this.f3836b.f3673e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0283f.f3817e = 7;
            while (i2 < c0272a.f3780r0) {
                C0275d c0275d5 = c0272a.f3779q0[i2];
                if (z2 || c0275d5.f3678g0 != 8) {
                    C0283f c0283f5 = c0275d5.f3673e.i;
                    c0283f5.f3821k.add(c0283f);
                    c0283f.f3822l.add(c0283f5);
                }
                i2++;
            }
            m(this.f3836b.f3673e.h);
            m(this.f3836b.f3673e.i);
        }
    }

    @Override // v.AbstractC0292o
    public final void e() {
        C0275d c0275d = this.f3836b;
        if (c0275d instanceof C0272a) {
            int i = ((C0272a) c0275d).f3617s0;
            C0283f c0283f = this.h;
            if (i == 0 || i == 1) {
                c0275d.f3664Y = c0283f.f3819g;
            } else {
                c0275d.f3665Z = c0283f.f3819g;
            }
        }
    }

    @Override // v.AbstractC0292o
    public final void f() {
        this.f3837c = null;
        this.h.c();
    }

    @Override // v.AbstractC0292o
    public final boolean k() {
        return false;
    }

    public final void m(C0283f c0283f) {
        C0283f c0283f2 = this.h;
        c0283f2.f3821k.add(c0283f);
        c0283f.f3822l.add(c0283f2);
    }
}
