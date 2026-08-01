package t;

import s.C0299d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310i extends AbstractC0316o {
    @Override // t.InterfaceC0305d
    public final void a(InterfaceC0305d interfaceC0305d) {
        C0307f c0307f = this.h;
        if (c0307f.f3759c && !c0307f.f3763j) {
            c0307f.d((int) ((((C0307f) c0307f.f3765l.get(0)).f3762g * ((s.h) this.f3779b).f3728q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0316o
    public final void d() {
        C0299d c0299d = this.f3779b;
        s.h hVar = (s.h) c0299d;
        int i = hVar.f3729r0;
        int i2 = hVar.f3730s0;
        int i3 = hVar.f3732u0;
        C0307f c0307f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0307f.f3765l.add(c0299d.f3615T.d.h);
                this.f3779b.f3615T.d.h.f3764k.add(c0307f);
                c0307f.f3761f = i;
            } else if (i2 != -1) {
                c0307f.f3765l.add(c0299d.f3615T.d.i);
                this.f3779b.f3615T.d.i.f3764k.add(c0307f);
                c0307f.f3761f = -i2;
            } else {
                c0307f.f3758b = true;
                c0307f.f3765l.add(c0299d.f3615T.d.i);
                this.f3779b.f3615T.d.i.f3764k.add(c0307f);
            }
            m(this.f3779b.d.h);
            m(this.f3779b.d.i);
            return;
        }
        if (i != -1) {
            c0307f.f3765l.add(c0299d.f3615T.f3629e.h);
            this.f3779b.f3615T.f3629e.h.f3764k.add(c0307f);
            c0307f.f3761f = i;
        } else if (i2 != -1) {
            c0307f.f3765l.add(c0299d.f3615T.f3629e.i);
            this.f3779b.f3615T.f3629e.i.f3764k.add(c0307f);
            c0307f.f3761f = -i2;
        } else {
            c0307f.f3758b = true;
            c0307f.f3765l.add(c0299d.f3615T.f3629e.i);
            this.f3779b.f3615T.f3629e.i.f3764k.add(c0307f);
        }
        m(this.f3779b.f3629e.h);
        m(this.f3779b.f3629e.i);
    }

    @Override // t.AbstractC0316o
    public final void e() {
        C0299d c0299d = this.f3779b;
        int i = ((s.h) c0299d).f3732u0;
        C0307f c0307f = this.h;
        if (i == 1) {
            c0299d.f3620Y = c0307f.f3762g;
        } else {
            c0299d.f3621Z = c0307f.f3762g;
        }
    }

    @Override // t.AbstractC0316o
    public final void f() {
        this.h.c();
    }

    @Override // t.AbstractC0316o
    public final boolean k() {
        return false;
    }

    public final void m(C0307f c0307f) {
        C0307f c0307f2 = this.h;
        c0307f2.f3764k.add(c0307f);
        c0307f.f3765l.add(c0307f2);
    }
}
