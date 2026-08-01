package t;

import java.util.Iterator;
import s.C0290a;
import s.C0293d;

/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305j extends AbstractC0310o {
    @Override // t.InterfaceC0299d
    public final void a(InterfaceC0299d interfaceC0299d) {
        C0290a c0290a = (C0290a) this.f3719b;
        int i = c0290a.f3501s0;
        C0301f c0301f = this.h;
        Iterator it = c0301f.f3705l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0301f) it.next()).f3702g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0301f.d(i3 + c0290a.f3503u0);
        } else {
            c0301f.d(i2 + c0290a.f3503u0);
        }
    }

    @Override // t.AbstractC0310o
    public final void d() {
        C0293d c0293d = this.f3719b;
        if (c0293d instanceof C0290a) {
            C0301f c0301f = this.h;
            c0301f.f3698b = true;
            C0290a c0290a = (C0290a) c0293d;
            int i = c0290a.f3501s0;
            boolean z2 = c0290a.f3502t0;
            int i2 = 0;
            if (i == 0) {
                c0301f.f3700e = 4;
                while (i2 < c0290a.f3663r0) {
                    C0293d c0293d2 = c0290a.f3662q0[i2];
                    if (z2 || c0293d2.f3562g0 != 8) {
                        C0301f c0301f2 = c0293d2.d.h;
                        c0301f2.f3704k.add(c0301f);
                        c0301f.f3705l.add(c0301f2);
                    }
                    i2++;
                }
                m(this.f3719b.d.h);
                m(this.f3719b.d.i);
                return;
            }
            if (i == 1) {
                c0301f.f3700e = 5;
                while (i2 < c0290a.f3663r0) {
                    C0293d c0293d3 = c0290a.f3662q0[i2];
                    if (z2 || c0293d3.f3562g0 != 8) {
                        C0301f c0301f3 = c0293d3.d.i;
                        c0301f3.f3704k.add(c0301f);
                        c0301f.f3705l.add(c0301f3);
                    }
                    i2++;
                }
                m(this.f3719b.d.h);
                m(this.f3719b.d.i);
                return;
            }
            if (i == 2) {
                c0301f.f3700e = 6;
                while (i2 < c0290a.f3663r0) {
                    C0293d c0293d4 = c0290a.f3662q0[i2];
                    if (z2 || c0293d4.f3562g0 != 8) {
                        C0301f c0301f4 = c0293d4.f3557e.h;
                        c0301f4.f3704k.add(c0301f);
                        c0301f.f3705l.add(c0301f4);
                    }
                    i2++;
                }
                m(this.f3719b.f3557e.h);
                m(this.f3719b.f3557e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0301f.f3700e = 7;
            while (i2 < c0290a.f3663r0) {
                C0293d c0293d5 = c0290a.f3662q0[i2];
                if (z2 || c0293d5.f3562g0 != 8) {
                    C0301f c0301f5 = c0293d5.f3557e.i;
                    c0301f5.f3704k.add(c0301f);
                    c0301f.f3705l.add(c0301f5);
                }
                i2++;
            }
            m(this.f3719b.f3557e.h);
            m(this.f3719b.f3557e.i);
        }
    }

    @Override // t.AbstractC0310o
    public final void e() {
        C0293d c0293d = this.f3719b;
        if (c0293d instanceof C0290a) {
            int i = ((C0290a) c0293d).f3501s0;
            C0301f c0301f = this.h;
            if (i == 0 || i == 1) {
                c0293d.f3548Y = c0301f.f3702g;
            } else {
                c0293d.f3549Z = c0301f.f3702g;
            }
        }
    }

    @Override // t.AbstractC0310o
    public final void f() {
        this.f3720c = null;
        this.h.c();
    }

    @Override // t.AbstractC0310o
    public final boolean k() {
        return false;
    }

    public final void m(C0301f c0301f) {
        C0301f c0301f2 = this.h;
        c0301f2.f3704k.add(c0301f);
        c0301f.f3705l.add(c0301f2);
    }
}
