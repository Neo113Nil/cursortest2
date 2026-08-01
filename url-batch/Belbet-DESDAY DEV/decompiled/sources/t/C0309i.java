package t;

import s.C0298d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309i extends AbstractC0315o {
    @Override // t.InterfaceC0304d
    public final void a(InterfaceC0304d interfaceC0304d) {
        C0306f c0306f = this.h;
        if (c0306f.f3776c && !c0306f.f3780j) {
            c0306f.d((int) ((((C0306f) c0306f.f3782l.get(0)).f3779g * ((s.h) this.f3796b).f3745q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0315o
    public final void d() {
        C0298d c0298d = this.f3796b;
        s.h hVar = (s.h) c0298d;
        int i = hVar.f3746r0;
        int i2 = hVar.f3747s0;
        int i3 = hVar.f3749u0;
        C0306f c0306f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0306f.f3782l.add(c0298d.f3632T.d.h);
                this.f3796b.f3632T.d.h.f3781k.add(c0306f);
                c0306f.f3778f = i;
            } else if (i2 != -1) {
                c0306f.f3782l.add(c0298d.f3632T.d.i);
                this.f3796b.f3632T.d.i.f3781k.add(c0306f);
                c0306f.f3778f = -i2;
            } else {
                c0306f.f3775b = true;
                c0306f.f3782l.add(c0298d.f3632T.d.i);
                this.f3796b.f3632T.d.i.f3781k.add(c0306f);
            }
            m(this.f3796b.d.h);
            m(this.f3796b.d.i);
            return;
        }
        if (i != -1) {
            c0306f.f3782l.add(c0298d.f3632T.f3646e.h);
            this.f3796b.f3632T.f3646e.h.f3781k.add(c0306f);
            c0306f.f3778f = i;
        } else if (i2 != -1) {
            c0306f.f3782l.add(c0298d.f3632T.f3646e.i);
            this.f3796b.f3632T.f3646e.i.f3781k.add(c0306f);
            c0306f.f3778f = -i2;
        } else {
            c0306f.f3775b = true;
            c0306f.f3782l.add(c0298d.f3632T.f3646e.i);
            this.f3796b.f3632T.f3646e.i.f3781k.add(c0306f);
        }
        m(this.f3796b.f3646e.h);
        m(this.f3796b.f3646e.i);
    }

    @Override // t.AbstractC0315o
    public final void e() {
        C0298d c0298d = this.f3796b;
        int i = ((s.h) c0298d).f3749u0;
        C0306f c0306f = this.h;
        if (i == 1) {
            c0298d.f3637Y = c0306f.f3779g;
        } else {
            c0298d.f3638Z = c0306f.f3779g;
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
        c0306f2.f3781k.add(c0306f);
        c0306f.f3782l.add(c0306f2);
    }
}
