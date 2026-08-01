package v;

import u.C0275d;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286i extends AbstractC0292o {
    @Override // v.InterfaceC0281d
    public final void a(InterfaceC0281d interfaceC0281d) {
        C0283f c0283f = this.h;
        if (c0283f.f3816c && !c0283f.f3820j) {
            c0283f.d((int) ((((C0283f) c0283f.f3822l.get(0)).f3819g * ((u.h) this.f3836b).f3773q0) + 0.5f));
        }
    }

    @Override // v.AbstractC0292o
    public final void d() {
        C0275d c0275d = this.f3836b;
        u.h hVar = (u.h) c0275d;
        int i = hVar.f3774r0;
        int i2 = hVar.f3775s0;
        int i3 = hVar.f3777u0;
        C0283f c0283f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0283f.f3822l.add(c0275d.f3659T.d.h);
                this.f3836b.f3659T.d.h.f3821k.add(c0283f);
                c0283f.f3818f = i;
            } else if (i2 != -1) {
                c0283f.f3822l.add(c0275d.f3659T.d.i);
                this.f3836b.f3659T.d.i.f3821k.add(c0283f);
                c0283f.f3818f = -i2;
            } else {
                c0283f.f3815b = true;
                c0283f.f3822l.add(c0275d.f3659T.d.i);
                this.f3836b.f3659T.d.i.f3821k.add(c0283f);
            }
            m(this.f3836b.d.h);
            m(this.f3836b.d.i);
            return;
        }
        if (i != -1) {
            c0283f.f3822l.add(c0275d.f3659T.f3673e.h);
            this.f3836b.f3659T.f3673e.h.f3821k.add(c0283f);
            c0283f.f3818f = i;
        } else if (i2 != -1) {
            c0283f.f3822l.add(c0275d.f3659T.f3673e.i);
            this.f3836b.f3659T.f3673e.i.f3821k.add(c0283f);
            c0283f.f3818f = -i2;
        } else {
            c0283f.f3815b = true;
            c0283f.f3822l.add(c0275d.f3659T.f3673e.i);
            this.f3836b.f3659T.f3673e.i.f3821k.add(c0283f);
        }
        m(this.f3836b.f3673e.h);
        m(this.f3836b.f3673e.i);
    }

    @Override // v.AbstractC0292o
    public final void e() {
        C0275d c0275d = this.f3836b;
        int i = ((u.h) c0275d).f3777u0;
        C0283f c0283f = this.h;
        if (i == 1) {
            c0275d.f3664Y = c0283f.f3819g;
        } else {
            c0275d.f3665Z = c0283f.f3819g;
        }
    }

    @Override // v.AbstractC0292o
    public final void f() {
        this.h.c();
    }

    @Override // v.AbstractC0292o
    public final boolean k() {
        return false;
    }

    public final void m(C0283f c0283f) {
        C0283f c0283f2 = this.h;
        c0283f2.f3821k.add(c0283f);
        c0283f.f3822l.add(c0283f2);
    }
}
