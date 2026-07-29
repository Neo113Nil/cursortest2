package t;

import s.C0298d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309i extends AbstractC0315o {
    @Override // t.InterfaceC0304d
    public final void a(InterfaceC0304d interfaceC0304d) {
        C0306f c0306f = this.h;
        if (c0306f.f3754c && !c0306f.f3758j) {
            c0306f.d((int) ((((C0306f) c0306f.f3760l.get(0)).f3757g * ((s.h) this.f3774b).f3723q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0315o
    public final void d() {
        C0298d c0298d = this.f3774b;
        s.h hVar = (s.h) c0298d;
        int i = hVar.f3724r0;
        int i2 = hVar.f3725s0;
        int i3 = hVar.f3727u0;
        C0306f c0306f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0306f.f3760l.add(c0298d.f3610T.d.h);
                this.f3774b.f3610T.d.h.f3759k.add(c0306f);
                c0306f.f3756f = i;
            } else if (i2 != -1) {
                c0306f.f3760l.add(c0298d.f3610T.d.i);
                this.f3774b.f3610T.d.i.f3759k.add(c0306f);
                c0306f.f3756f = -i2;
            } else {
                c0306f.f3753b = true;
                c0306f.f3760l.add(c0298d.f3610T.d.i);
                this.f3774b.f3610T.d.i.f3759k.add(c0306f);
            }
            m(this.f3774b.d.h);
            m(this.f3774b.d.i);
            return;
        }
        if (i != -1) {
            c0306f.f3760l.add(c0298d.f3610T.f3624e.h);
            this.f3774b.f3610T.f3624e.h.f3759k.add(c0306f);
            c0306f.f3756f = i;
        } else if (i2 != -1) {
            c0306f.f3760l.add(c0298d.f3610T.f3624e.i);
            this.f3774b.f3610T.f3624e.i.f3759k.add(c0306f);
            c0306f.f3756f = -i2;
        } else {
            c0306f.f3753b = true;
            c0306f.f3760l.add(c0298d.f3610T.f3624e.i);
            this.f3774b.f3610T.f3624e.i.f3759k.add(c0306f);
        }
        m(this.f3774b.f3624e.h);
        m(this.f3774b.f3624e.i);
    }

    @Override // t.AbstractC0315o
    public final void e() {
        C0298d c0298d = this.f3774b;
        int i = ((s.h) c0298d).f3727u0;
        C0306f c0306f = this.h;
        if (i == 1) {
            c0298d.f3615Y = c0306f.f3757g;
        } else {
            c0298d.f3616Z = c0306f.f3757g;
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
        c0306f2.f3759k.add(c0306f);
        c0306f.f3760l.add(c0306f2);
    }
}
