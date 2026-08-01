package t;

import s.C0293d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304i extends AbstractC0310o {
    @Override // t.InterfaceC0299d
    public final void a(InterfaceC0299d interfaceC0299d) {
        C0301f c0301f = this.h;
        if (c0301f.f3699c && !c0301f.f3703j) {
            c0301f.d((int) ((((C0301f) c0301f.f3705l.get(0)).f3702g * ((s.h) this.f3719b).f3656q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0310o
    public final void d() {
        C0293d c0293d = this.f3719b;
        s.h hVar = (s.h) c0293d;
        int i = hVar.f3657r0;
        int i2 = hVar.f3658s0;
        int i3 = hVar.f3660u0;
        C0301f c0301f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0301f.f3705l.add(c0293d.f3543T.d.h);
                this.f3719b.f3543T.d.h.f3704k.add(c0301f);
                c0301f.f3701f = i;
            } else if (i2 != -1) {
                c0301f.f3705l.add(c0293d.f3543T.d.i);
                this.f3719b.f3543T.d.i.f3704k.add(c0301f);
                c0301f.f3701f = -i2;
            } else {
                c0301f.f3698b = true;
                c0301f.f3705l.add(c0293d.f3543T.d.i);
                this.f3719b.f3543T.d.i.f3704k.add(c0301f);
            }
            m(this.f3719b.d.h);
            m(this.f3719b.d.i);
            return;
        }
        if (i != -1) {
            c0301f.f3705l.add(c0293d.f3543T.f3557e.h);
            this.f3719b.f3543T.f3557e.h.f3704k.add(c0301f);
            c0301f.f3701f = i;
        } else if (i2 != -1) {
            c0301f.f3705l.add(c0293d.f3543T.f3557e.i);
            this.f3719b.f3543T.f3557e.i.f3704k.add(c0301f);
            c0301f.f3701f = -i2;
        } else {
            c0301f.f3698b = true;
            c0301f.f3705l.add(c0293d.f3543T.f3557e.i);
            this.f3719b.f3543T.f3557e.i.f3704k.add(c0301f);
        }
        m(this.f3719b.f3557e.h);
        m(this.f3719b.f3557e.i);
    }

    @Override // t.AbstractC0310o
    public final void e() {
        C0293d c0293d = this.f3719b;
        int i = ((s.h) c0293d).f3660u0;
        C0301f c0301f = this.h;
        if (i == 1) {
            c0293d.f3548Y = c0301f.f3702g;
        } else {
            c0293d.f3549Z = c0301f.f3702g;
        }
    }

    @Override // t.AbstractC0310o
    public final void f() {
        this.h.c();
    }

    @Override // t.AbstractC0310o
    public final boolean k() {
        return false;
    }

    public final void m(C0301f c0301f) {
        C0301f c0301f2 = this.h;
        c0301f2.f3704k.add(c0301f);
        c0301f.f3705l.add(c0301f2);
    }
}
