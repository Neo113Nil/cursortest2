package t;

import s.C0281d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292i extends AbstractC0298o {
    @Override // t.InterfaceC0287d
    public final void a(InterfaceC0287d interfaceC0287d) {
        C0289f c0289f = this.h;
        if (c0289f.f3796c && !c0289f.f3800j) {
            c0289f.d((int) ((((C0289f) c0289f.f3802l.get(0)).f3799g * ((s.h) this.f3816b).f3732q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0298o
    public final void d() {
        C0281d c0281d = this.f3816b;
        s.h hVar = (s.h) c0281d;
        int i = hVar.f3733r0;
        int i2 = hVar.f3734s0;
        int i3 = hVar.f3736u0;
        C0289f c0289f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0289f.f3802l.add(c0281d.f3621T.d.h);
                this.f3816b.f3621T.d.h.f3801k.add(c0289f);
                c0289f.f3798f = i;
            } else if (i2 != -1) {
                c0289f.f3802l.add(c0281d.f3621T.d.i);
                this.f3816b.f3621T.d.i.f3801k.add(c0289f);
                c0289f.f3798f = -i2;
            } else {
                c0289f.f3795b = true;
                c0289f.f3802l.add(c0281d.f3621T.d.i);
                this.f3816b.f3621T.d.i.f3801k.add(c0289f);
            }
            m(this.f3816b.d.h);
            m(this.f3816b.d.i);
            return;
        }
        if (i != -1) {
            c0289f.f3802l.add(c0281d.f3621T.f3635e.h);
            this.f3816b.f3621T.f3635e.h.f3801k.add(c0289f);
            c0289f.f3798f = i;
        } else if (i2 != -1) {
            c0289f.f3802l.add(c0281d.f3621T.f3635e.i);
            this.f3816b.f3621T.f3635e.i.f3801k.add(c0289f);
            c0289f.f3798f = -i2;
        } else {
            c0289f.f3795b = true;
            c0289f.f3802l.add(c0281d.f3621T.f3635e.i);
            this.f3816b.f3621T.f3635e.i.f3801k.add(c0289f);
        }
        m(this.f3816b.f3635e.h);
        m(this.f3816b.f3635e.i);
    }

    @Override // t.AbstractC0298o
    public final void e() {
        C0281d c0281d = this.f3816b;
        int i = ((s.h) c0281d).f3736u0;
        C0289f c0289f = this.h;
        if (i == 1) {
            c0281d.f3626Y = c0289f.f3799g;
        } else {
            c0281d.f3627Z = c0289f.f3799g;
        }
    }

    @Override // t.AbstractC0298o
    public final void f() {
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
