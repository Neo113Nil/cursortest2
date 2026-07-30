package x;

import java.util.Iterator;
import w.C5141a;
import w.C5144d;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5193j extends AbstractC5199p {
    @Override // x.InterfaceC5187d
    public final void a(InterfaceC5187d interfaceC5187d) {
        C5141a c5141a = (C5141a) this.f41758b;
        int i = c5141a.f41386s0;
        C5189f c5189f = this.f41764h;
        Iterator it = c5189f.f41743l.iterator();
        int i4 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = ((C5189f) it.next()).f41739g;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i4 < i10) {
                i4 = i10;
            }
        }
        if (i == 0 || i == 2) {
            c5189f.d(i9 + c5141a.f41388u0);
        } else {
            c5189f.d(i4 + c5141a.f41388u0);
        }
    }

    @Override // x.AbstractC5199p
    public final void d() {
        C5144d c5144d = this.f41758b;
        if (c5144d instanceof C5141a) {
            C5189f c5189f = this.f41764h;
            c5189f.f41734b = true;
            C5141a c5141a = (C5141a) c5144d;
            int i = c5141a.f41386s0;
            boolean z8 = c5141a.f41387t0;
            int i4 = 0;
            if (i == 0) {
                c5189f.f41737e = 4;
                while (i4 < c5141a.f41558r0) {
                    C5144d c5144d2 = c5141a.f41557q0[i4];
                    if (z8 || c5144d2.f41451g0 != 8) {
                        C5189f c5189f2 = c5144d2.f41444d.f41764h;
                        c5189f2.f41742k.add(c5189f);
                        c5189f.f41743l.add(c5189f2);
                    }
                    i4++;
                }
                m(this.f41758b.f41444d.f41764h);
                m(this.f41758b.f41444d.i);
                return;
            }
            if (i == 1) {
                c5189f.f41737e = 5;
                while (i4 < c5141a.f41558r0) {
                    C5144d c5144d3 = c5141a.f41557q0[i4];
                    if (z8 || c5144d3.f41451g0 != 8) {
                        C5189f c5189f3 = c5144d3.f41444d.i;
                        c5189f3.f41742k.add(c5189f);
                        c5189f.f41743l.add(c5189f3);
                    }
                    i4++;
                }
                m(this.f41758b.f41444d.f41764h);
                m(this.f41758b.f41444d.i);
                return;
            }
            if (i == 2) {
                c5189f.f41737e = 6;
                while (i4 < c5141a.f41558r0) {
                    C5144d c5144d4 = c5141a.f41557q0[i4];
                    if (z8 || c5144d4.f41451g0 != 8) {
                        C5189f c5189f4 = c5144d4.f41446e.f41764h;
                        c5189f4.f41742k.add(c5189f);
                        c5189f.f41743l.add(c5189f4);
                    }
                    i4++;
                }
                m(this.f41758b.f41446e.f41764h);
                m(this.f41758b.f41446e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c5189f.f41737e = 7;
            while (i4 < c5141a.f41558r0) {
                C5144d c5144d5 = c5141a.f41557q0[i4];
                if (z8 || c5144d5.f41451g0 != 8) {
                    C5189f c5189f5 = c5144d5.f41446e.i;
                    c5189f5.f41742k.add(c5189f);
                    c5189f.f41743l.add(c5189f5);
                }
                i4++;
            }
            m(this.f41758b.f41446e.f41764h);
            m(this.f41758b.f41446e.i);
        }
    }

    @Override // x.AbstractC5199p
    public final void e() {
        C5144d c5144d = this.f41758b;
        if (c5144d instanceof C5141a) {
            int i = ((C5141a) c5144d).f41386s0;
            C5189f c5189f = this.f41764h;
            if (i == 0 || i == 1) {
                c5144d.Y = c5189f.f41739g;
            } else {
                c5144d.f41437Z = c5189f.f41739g;
            }
        }
    }

    @Override // x.AbstractC5199p
    public final void f() {
        this.f41759c = null;
        this.f41764h.c();
    }

    @Override // x.AbstractC5199p
    public final boolean k() {
        return false;
    }

    public final void m(C5189f c5189f) {
        C5189f c5189f2 = this.f41764h;
        c5189f2.f41742k.add(c5189f);
        c5189f.f41743l.add(c5189f2);
    }
}
