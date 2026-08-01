package t;

import s.C0296d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307i extends AbstractC0313o {
    @Override // t.InterfaceC0302d
    public final void a(InterfaceC0302d interfaceC0302d) {
        C0304f c0304f = this.h;
        if (c0304f.f3719c && !c0304f.f3723j) {
            c0304f.d((int) ((((C0304f) c0304f.f3725l.get(0)).f3722g * ((s.h) this.f3739b).f3679q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0313o
    public final void d() {
        C0296d c0296d = this.f3739b;
        s.h hVar = (s.h) c0296d;
        int i = hVar.f3680r0;
        int i2 = hVar.f3681s0;
        int i3 = hVar.f3683u0;
        C0304f c0304f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0304f.f3725l.add(c0296d.f3567T.d.h);
                this.f3739b.f3567T.d.h.f3724k.add(c0304f);
                c0304f.f3721f = i;
            } else if (i2 != -1) {
                c0304f.f3725l.add(c0296d.f3567T.d.i);
                this.f3739b.f3567T.d.i.f3724k.add(c0304f);
                c0304f.f3721f = -i2;
            } else {
                c0304f.f3718b = true;
                c0304f.f3725l.add(c0296d.f3567T.d.i);
                this.f3739b.f3567T.d.i.f3724k.add(c0304f);
            }
            m(this.f3739b.d.h);
            m(this.f3739b.d.i);
            return;
        }
        if (i != -1) {
            c0304f.f3725l.add(c0296d.f3567T.f3581e.h);
            this.f3739b.f3567T.f3581e.h.f3724k.add(c0304f);
            c0304f.f3721f = i;
        } else if (i2 != -1) {
            c0304f.f3725l.add(c0296d.f3567T.f3581e.i);
            this.f3739b.f3567T.f3581e.i.f3724k.add(c0304f);
            c0304f.f3721f = -i2;
        } else {
            c0304f.f3718b = true;
            c0304f.f3725l.add(c0296d.f3567T.f3581e.i);
            this.f3739b.f3567T.f3581e.i.f3724k.add(c0304f);
        }
        m(this.f3739b.f3581e.h);
        m(this.f3739b.f3581e.i);
    }

    @Override // t.AbstractC0313o
    public final void e() {
        C0296d c0296d = this.f3739b;
        int i = ((s.h) c0296d).f3683u0;
        C0304f c0304f = this.h;
        if (i == 1) {
            c0296d.f3572Y = c0304f.f3722g;
        } else {
            c0296d.f3573Z = c0304f.f3722g;
        }
    }

    @Override // t.AbstractC0313o
    public final void f() {
        this.h.c();
    }

    @Override // t.AbstractC0313o
    public final boolean k() {
        return false;
    }

    public final void m(C0304f c0304f) {
        C0304f c0304f2 = this.h;
        c0304f2.f3724k.add(c0304f);
        c0304f.f3725l.add(c0304f2);
    }
}
