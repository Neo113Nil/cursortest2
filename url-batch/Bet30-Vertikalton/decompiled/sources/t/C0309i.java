package t;

import s.C0298d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309i extends AbstractC0315o {
    @Override // t.InterfaceC0304d
    public final void a(InterfaceC0304d interfaceC0304d) {
        C0306f c0306f = this.h;
        if (c0306f.f3775c && !c0306f.f3779j) {
            c0306f.d((int) ((((C0306f) c0306f.f3781l.get(0)).f3778g * ((s.h) this.f3795b).f3744q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0315o
    public final void d() {
        C0298d c0298d = this.f3795b;
        s.h hVar = (s.h) c0298d;
        int i = hVar.f3745r0;
        int i2 = hVar.f3746s0;
        int i3 = hVar.f3748u0;
        C0306f c0306f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0306f.f3781l.add(c0298d.f3631T.d.h);
                this.f3795b.f3631T.d.h.f3780k.add(c0306f);
                c0306f.f3777f = i;
            } else if (i2 != -1) {
                c0306f.f3781l.add(c0298d.f3631T.d.i);
                this.f3795b.f3631T.d.i.f3780k.add(c0306f);
                c0306f.f3777f = -i2;
            } else {
                c0306f.f3774b = true;
                c0306f.f3781l.add(c0298d.f3631T.d.i);
                this.f3795b.f3631T.d.i.f3780k.add(c0306f);
            }
            m(this.f3795b.d.h);
            m(this.f3795b.d.i);
            return;
        }
        if (i != -1) {
            c0306f.f3781l.add(c0298d.f3631T.f3645e.h);
            this.f3795b.f3631T.f3645e.h.f3780k.add(c0306f);
            c0306f.f3777f = i;
        } else if (i2 != -1) {
            c0306f.f3781l.add(c0298d.f3631T.f3645e.i);
            this.f3795b.f3631T.f3645e.i.f3780k.add(c0306f);
            c0306f.f3777f = -i2;
        } else {
            c0306f.f3774b = true;
            c0306f.f3781l.add(c0298d.f3631T.f3645e.i);
            this.f3795b.f3631T.f3645e.i.f3780k.add(c0306f);
        }
        m(this.f3795b.f3645e.h);
        m(this.f3795b.f3645e.i);
    }

    @Override // t.AbstractC0315o
    public final void e() {
        C0298d c0298d = this.f3795b;
        int i = ((s.h) c0298d).f3748u0;
        C0306f c0306f = this.h;
        if (i == 1) {
            c0298d.f3636Y = c0306f.f3778g;
        } else {
            c0298d.f3637Z = c0306f.f3778g;
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
        c0306f2.f3780k.add(c0306f);
        c0306f.f3781l.add(c0306f2);
    }
}
