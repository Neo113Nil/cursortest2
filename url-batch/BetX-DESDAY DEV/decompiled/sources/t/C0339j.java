package t;

import java.util.Iterator;
import s.C0324a;
import s.C0327d;

/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339j extends AbstractC0344o {
    @Override // t.InterfaceC0333d
    public final void a(InterfaceC0333d interfaceC0333d) {
        C0324a c0324a = (C0324a) this.f4196b;
        int i = c0324a.f3983s0;
        C0335f c0335f = this.h;
        Iterator it = c0335f.f4181l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0335f) it.next()).f4178g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0335f.d(i3 + c0324a.f3985u0);
        } else {
            c0335f.d(i2 + c0324a.f3985u0);
        }
    }

    @Override // t.AbstractC0344o
    public final void d() {
        C0327d c0327d = this.f4196b;
        if (c0327d instanceof C0324a) {
            C0335f c0335f = this.h;
            c0335f.f4173b = true;
            C0324a c0324a = (C0324a) c0327d;
            int i = c0324a.f3983s0;
            boolean z2 = c0324a.f3984t0;
            int i2 = 0;
            if (i == 0) {
                c0335f.f4176e = 4;
                while (i2 < c0324a.f4147r0) {
                    C0327d c0327d2 = c0324a.f4146q0[i2];
                    if (z2 || c0327d2.f4047g0 != 8) {
                        C0335f c0335f2 = c0327d2.f4040d.h;
                        c0335f2.f4180k.add(c0335f);
                        c0335f.f4181l.add(c0335f2);
                    }
                    i2++;
                }
                m(this.f4196b.f4040d.h);
                m(this.f4196b.f4040d.i);
                return;
            }
            if (i == 1) {
                c0335f.f4176e = 5;
                while (i2 < c0324a.f4147r0) {
                    C0327d c0327d3 = c0324a.f4146q0[i2];
                    if (z2 || c0327d3.f4047g0 != 8) {
                        C0335f c0335f3 = c0327d3.f4040d.i;
                        c0335f3.f4180k.add(c0335f);
                        c0335f.f4181l.add(c0335f3);
                    }
                    i2++;
                }
                m(this.f4196b.f4040d.h);
                m(this.f4196b.f4040d.i);
                return;
            }
            if (i == 2) {
                c0335f.f4176e = 6;
                while (i2 < c0324a.f4147r0) {
                    C0327d c0327d4 = c0324a.f4146q0[i2];
                    if (z2 || c0327d4.f4047g0 != 8) {
                        C0335f c0335f4 = c0327d4.f4042e.h;
                        c0335f4.f4180k.add(c0335f);
                        c0335f.f4181l.add(c0335f4);
                    }
                    i2++;
                }
                m(this.f4196b.f4042e.h);
                m(this.f4196b.f4042e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0335f.f4176e = 7;
            while (i2 < c0324a.f4147r0) {
                C0327d c0327d5 = c0324a.f4146q0[i2];
                if (z2 || c0327d5.f4047g0 != 8) {
                    C0335f c0335f5 = c0327d5.f4042e.i;
                    c0335f5.f4180k.add(c0335f);
                    c0335f.f4181l.add(c0335f5);
                }
                i2++;
            }
            m(this.f4196b.f4042e.h);
            m(this.f4196b.f4042e.i);
        }
    }

    @Override // t.AbstractC0344o
    public final void e() {
        C0327d c0327d = this.f4196b;
        if (c0327d instanceof C0324a) {
            int i = ((C0324a) c0327d).f3983s0;
            C0335f c0335f = this.h;
            if (i == 0 || i == 1) {
                c0327d.f4032Y = c0335f.f4178g;
            } else {
                c0327d.f4033Z = c0335f.f4178g;
            }
        }
    }

    @Override // t.AbstractC0344o
    public final void f() {
        this.f4197c = null;
        this.h.c();
    }

    @Override // t.AbstractC0344o
    public final boolean k() {
        return false;
    }

    public final void m(C0335f c0335f) {
        C0335f c0335f2 = this.h;
        c0335f2.f4180k.add(c0335f);
        c0335f.f4181l.add(c0335f2);
    }
}
