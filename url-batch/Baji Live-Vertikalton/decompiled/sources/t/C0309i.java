package t;

import s.C0298d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309i extends AbstractC0315o {
    @Override // t.InterfaceC0304d
    public final void a(InterfaceC0304d interfaceC0304d) {
        C0306f c0306f = this.h;
        if (c0306f.f3753c && !c0306f.f3757j) {
            c0306f.d((int) ((((C0306f) c0306f.f3759l.get(0)).f3756g * ((s.h) this.f3773b).f3722q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0315o
    public final void d() {
        C0298d c0298d = this.f3773b;
        s.h hVar = (s.h) c0298d;
        int i = hVar.f3723r0;
        int i2 = hVar.f3724s0;
        int i3 = hVar.f3726u0;
        C0306f c0306f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0306f.f3759l.add(c0298d.f3609T.d.h);
                this.f3773b.f3609T.d.h.f3758k.add(c0306f);
                c0306f.f3755f = i;
            } else if (i2 != -1) {
                c0306f.f3759l.add(c0298d.f3609T.d.i);
                this.f3773b.f3609T.d.i.f3758k.add(c0306f);
                c0306f.f3755f = -i2;
            } else {
                c0306f.f3752b = true;
                c0306f.f3759l.add(c0298d.f3609T.d.i);
                this.f3773b.f3609T.d.i.f3758k.add(c0306f);
            }
            m(this.f3773b.d.h);
            m(this.f3773b.d.i);
            return;
        }
        if (i != -1) {
            c0306f.f3759l.add(c0298d.f3609T.f3623e.h);
            this.f3773b.f3609T.f3623e.h.f3758k.add(c0306f);
            c0306f.f3755f = i;
        } else if (i2 != -1) {
            c0306f.f3759l.add(c0298d.f3609T.f3623e.i);
            this.f3773b.f3609T.f3623e.i.f3758k.add(c0306f);
            c0306f.f3755f = -i2;
        } else {
            c0306f.f3752b = true;
            c0306f.f3759l.add(c0298d.f3609T.f3623e.i);
            this.f3773b.f3609T.f3623e.i.f3758k.add(c0306f);
        }
        m(this.f3773b.f3623e.h);
        m(this.f3773b.f3623e.i);
    }

    @Override // t.AbstractC0315o
    public final void e() {
        C0298d c0298d = this.f3773b;
        int i = ((s.h) c0298d).f3726u0;
        C0306f c0306f = this.h;
        if (i == 1) {
            c0298d.f3614Y = c0306f.f3756g;
        } else {
            c0298d.f3615Z = c0306f.f3756g;
        }
    }

    @Override // t.AbstractC0315o
    public final void f() {
        this.h.c();
    }

    @Override // t.AbstractC0315o
    public final boolean k() {
        return false;
    }

    public final void m(C0306f c0306f) {
        C0306f c0306f2 = this.h;
        c0306f2.f3758k.add(c0306f);
        c0306f.f3759l.add(c0306f2);
    }
}
