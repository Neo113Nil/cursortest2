package t;

import java.util.Iterator;
import s.C0292a;
import s.C0295d;

/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307j extends AbstractC0312o {
    @Override // t.InterfaceC0301d
    public final void a(InterfaceC0301d interfaceC0301d) {
        C0292a c0292a = (C0292a) this.f3864b;
        int i = c0292a.f3639s0;
        C0303f c0303f = this.h;
        Iterator it = c0303f.f3850l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0303f) it.next()).f3847g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0303f.d(i3 + c0292a.f3641u0);
        } else {
            c0303f.d(i2 + c0292a.f3641u0);
        }
    }

    @Override // t.AbstractC0312o
    public final void d() {
        C0295d c0295d = this.f3864b;
        if (c0295d instanceof C0292a) {
            C0303f c0303f = this.h;
            c0303f.f3843b = true;
            C0292a c0292a = (C0292a) c0295d;
            int i = c0292a.f3639s0;
            boolean z2 = c0292a.f3640t0;
            int i2 = 0;
            if (i == 0) {
                c0303f.f3845e = 4;
                while (i2 < c0292a.f3799r0) {
                    C0295d c0295d2 = c0292a.f3798q0[i2];
                    if (z2 || c0295d2.f3700g0 != 8) {
                        C0303f c0303f2 = c0295d2.d.h;
                        c0303f2.f3849k.add(c0303f);
                        c0303f.f3850l.add(c0303f2);
                    }
                    i2++;
                }
                m(this.f3864b.d.h);
                m(this.f3864b.d.i);
                return;
            }
            if (i == 1) {
                c0303f.f3845e = 5;
                while (i2 < c0292a.f3799r0) {
                    C0295d c0295d3 = c0292a.f3798q0[i2];
                    if (z2 || c0295d3.f3700g0 != 8) {
                        C0303f c0303f3 = c0295d3.d.i;
                        c0303f3.f3849k.add(c0303f);
                        c0303f.f3850l.add(c0303f3);
                    }
                    i2++;
                }
                m(this.f3864b.d.h);
                m(this.f3864b.d.i);
                return;
            }
            if (i == 2) {
                c0303f.f3845e = 6;
                while (i2 < c0292a.f3799r0) {
                    C0295d c0295d4 = c0292a.f3798q0[i2];
                    if (z2 || c0295d4.f3700g0 != 8) {
                        C0303f c0303f4 = c0295d4.f3695e.h;
                        c0303f4.f3849k.add(c0303f);
                        c0303f.f3850l.add(c0303f4);
                    }
                    i2++;
                }
                m(this.f3864b.f3695e.h);
                m(this.f3864b.f3695e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0303f.f3845e = 7;
            while (i2 < c0292a.f3799r0) {
                C0295d c0295d5 = c0292a.f3798q0[i2];
                if (z2 || c0295d5.f3700g0 != 8) {
                    C0303f c0303f5 = c0295d5.f3695e.i;
                    c0303f5.f3849k.add(c0303f);
                    c0303f.f3850l.add(c0303f5);
                }
                i2++;
            }
            m(this.f3864b.f3695e.h);
            m(this.f3864b.f3695e.i);
        }
    }

    @Override // t.AbstractC0312o
    public final void e() {
        C0295d c0295d = this.f3864b;
        if (c0295d instanceof C0292a) {
            int i = ((C0292a) c0295d).f3639s0;
            C0303f c0303f = this.h;
            if (i == 0 || i == 1) {
                c0295d.f3686Y = c0303f.f3847g;
            } else {
                c0295d.f3687Z = c0303f.f3847g;
            }
        }
    }

    @Override // t.AbstractC0312o
    public final void f() {
        this.f3865c = null;
        this.h.c();
    }

    @Override // t.AbstractC0312o
    public final boolean k() {
        return false;
    }

    public final void m(C0303f c0303f) {
        C0303f c0303f2 = this.h;
        c0303f2.f3849k.add(c0303f);
        c0303f.f3850l.add(c0303f2);
    }
}
