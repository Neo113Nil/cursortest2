package t;

import s.C0327d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338i extends AbstractC0344o {
    @Override // t.InterfaceC0333d
    public final void a(InterfaceC0333d interfaceC0333d) {
        C0335f c0335f = this.h;
        if (c0335f.f4174c && !c0335f.f4179j) {
            c0335f.d((int) ((((C0335f) c0335f.f4181l.get(0)).f4178g * ((s.h) this.f4196b).f4140q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0344o
    public final void d() {
        C0327d c0327d = this.f4196b;
        s.h hVar = (s.h) c0327d;
        int i = hVar.f4141r0;
        int i2 = hVar.f4142s0;
        int i3 = hVar.f4144u0;
        C0335f c0335f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0335f.f4181l.add(c0327d.f4027T.f4040d.h);
                this.f4196b.f4027T.f4040d.h.f4180k.add(c0335f);
                c0335f.f4177f = i;
            } else if (i2 != -1) {
                c0335f.f4181l.add(c0327d.f4027T.f4040d.i);
                this.f4196b.f4027T.f4040d.i.f4180k.add(c0335f);
                c0335f.f4177f = -i2;
            } else {
                c0335f.f4173b = true;
                c0335f.f4181l.add(c0327d.f4027T.f4040d.i);
                this.f4196b.f4027T.f4040d.i.f4180k.add(c0335f);
            }
            m(this.f4196b.f4040d.h);
            m(this.f4196b.f4040d.i);
            return;
        }
        if (i != -1) {
            c0335f.f4181l.add(c0327d.f4027T.f4042e.h);
            this.f4196b.f4027T.f4042e.h.f4180k.add(c0335f);
            c0335f.f4177f = i;
        } else if (i2 != -1) {
            c0335f.f4181l.add(c0327d.f4027T.f4042e.i);
            this.f4196b.f4027T.f4042e.i.f4180k.add(c0335f);
            c0335f.f4177f = -i2;
        } else {
            c0335f.f4173b = true;
            c0335f.f4181l.add(c0327d.f4027T.f4042e.i);
            this.f4196b.f4027T.f4042e.i.f4180k.add(c0335f);
        }
        m(this.f4196b.f4042e.h);
        m(this.f4196b.f4042e.i);
    }

    @Override // t.AbstractC0344o
    public final void e() {
        C0327d c0327d = this.f4196b;
        int i = ((s.h) c0327d).f4144u0;
        C0335f c0335f = this.h;
        if (i == 1) {
            c0327d.f4032Y = c0335f.f4178g;
        } else {
            c0327d.f4033Z = c0335f.f4178g;
        }
    }

    @Override // t.AbstractC0344o
    public final void f() {
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
