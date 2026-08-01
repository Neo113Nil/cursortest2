package t;

import java.util.Iterator;
import s.C0337a;
import s.C0340d;

/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352j extends AbstractC0358p {
    @Override // t.InterfaceC0346d
    public final void a(InterfaceC0346d interfaceC0346d) {
        C0337a c0337a = (C0337a) this.f3712b;
        int i = c0337a.f3473s0;
        C0348f c0348f = this.h;
        Iterator it = c0348f.f3698l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0348f) it.next()).f3695g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0348f.d(i3 + c0337a.f3475u0);
        } else {
            c0348f.d(i2 + c0337a.f3475u0);
        }
    }

    @Override // t.AbstractC0358p
    public final void d() {
        C0340d c0340d = this.f3712b;
        if (c0340d instanceof C0337a) {
            C0348f c0348f = this.h;
            c0348f.f3691b = true;
            C0337a c0337a = (C0337a) c0340d;
            int i = c0337a.f3473s0;
            boolean z2 = c0337a.f3474t0;
            int i2 = 0;
            if (i == 0) {
                c0348f.f3693e = 4;
                while (i2 < c0337a.f3633r0) {
                    C0340d c0340d2 = c0337a.q0[i2];
                    if (z2 || c0340d2.f3534g0 != 8) {
                        C0348f c0348f2 = c0340d2.d.h;
                        c0348f2.f3697k.add(c0348f);
                        c0348f.f3698l.add(c0348f2);
                    }
                    i2++;
                }
                m(this.f3712b.d.h);
                m(this.f3712b.d.i);
                return;
            }
            if (i == 1) {
                c0348f.f3693e = 5;
                while (i2 < c0337a.f3633r0) {
                    C0340d c0340d3 = c0337a.q0[i2];
                    if (z2 || c0340d3.f3534g0 != 8) {
                        C0348f c0348f3 = c0340d3.d.i;
                        c0348f3.f3697k.add(c0348f);
                        c0348f.f3698l.add(c0348f3);
                    }
                    i2++;
                }
                m(this.f3712b.d.h);
                m(this.f3712b.d.i);
                return;
            }
            if (i == 2) {
                c0348f.f3693e = 6;
                while (i2 < c0337a.f3633r0) {
                    C0340d c0340d4 = c0337a.q0[i2];
                    if (z2 || c0340d4.f3534g0 != 8) {
                        C0348f c0348f4 = c0340d4.f3529e.h;
                        c0348f4.f3697k.add(c0348f);
                        c0348f.f3698l.add(c0348f4);
                    }
                    i2++;
                }
                m(this.f3712b.f3529e.h);
                m(this.f3712b.f3529e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0348f.f3693e = 7;
            while (i2 < c0337a.f3633r0) {
                C0340d c0340d5 = c0337a.q0[i2];
                if (z2 || c0340d5.f3534g0 != 8) {
                    C0348f c0348f5 = c0340d5.f3529e.i;
                    c0348f5.f3697k.add(c0348f);
                    c0348f.f3698l.add(c0348f5);
                }
                i2++;
            }
            m(this.f3712b.f3529e.h);
            m(this.f3712b.f3529e.i);
        }
    }

    @Override // t.AbstractC0358p
    public final void e() {
        C0340d c0340d = this.f3712b;
        if (c0340d instanceof C0337a) {
            int i = ((C0337a) c0340d).f3473s0;
            C0348f c0348f = this.h;
            if (i == 0 || i == 1) {
                c0340d.f3520Y = c0348f.f3695g;
            } else {
                c0340d.f3521Z = c0348f.f3695g;
            }
        }
    }

    @Override // t.AbstractC0358p
    public final void f() {
        this.f3713c = null;
        this.h.c();
    }

    @Override // t.AbstractC0358p
    public final boolean k() {
        return false;
    }

    public final void m(C0348f c0348f) {
        C0348f c0348f2 = this.h;
        c0348f2.f3697k.add(c0348f);
        c0348f.f3698l.add(c0348f2);
    }
}
