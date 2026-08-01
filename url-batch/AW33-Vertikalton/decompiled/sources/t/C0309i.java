package t;

import s.C0298d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309i extends AbstractC0315o {
    @Override // t.InterfaceC0304d
    public final void a(InterfaceC0304d interfaceC0304d) {
        C0306f c0306f = this.h;
        if (c0306f.f3771c && !c0306f.f3775j) {
            c0306f.d((int) ((((C0306f) c0306f.f3777l.get(0)).f3774g * ((s.h) this.f3791b).f3740q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0315o
    public final void d() {
        C0298d c0298d = this.f3791b;
        s.h hVar = (s.h) c0298d;
        int i = hVar.f3741r0;
        int i2 = hVar.f3742s0;
        int i3 = hVar.f3744u0;
        C0306f c0306f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0306f.f3777l.add(c0298d.f3627T.d.h);
                this.f3791b.f3627T.d.h.f3776k.add(c0306f);
                c0306f.f3773f = i;
            } else if (i2 != -1) {
                c0306f.f3777l.add(c0298d.f3627T.d.i);
                this.f3791b.f3627T.d.i.f3776k.add(c0306f);
                c0306f.f3773f = -i2;
            } else {
                c0306f.f3770b = true;
                c0306f.f3777l.add(c0298d.f3627T.d.i);
                this.f3791b.f3627T.d.i.f3776k.add(c0306f);
            }
            m(this.f3791b.d.h);
            m(this.f3791b.d.i);
            return;
        }
        if (i != -1) {
            c0306f.f3777l.add(c0298d.f3627T.f3641e.h);
            this.f3791b.f3627T.f3641e.h.f3776k.add(c0306f);
            c0306f.f3773f = i;
        } else if (i2 != -1) {
            c0306f.f3777l.add(c0298d.f3627T.f3641e.i);
            this.f3791b.f3627T.f3641e.i.f3776k.add(c0306f);
            c0306f.f3773f = -i2;
        } else {
            c0306f.f3770b = true;
            c0306f.f3777l.add(c0298d.f3627T.f3641e.i);
            this.f3791b.f3627T.f3641e.i.f3776k.add(c0306f);
        }
        m(this.f3791b.f3641e.h);
        m(this.f3791b.f3641e.i);
    }

    @Override // t.AbstractC0315o
    public final void e() {
        C0298d c0298d = this.f3791b;
        int i = ((s.h) c0298d).f3744u0;
        C0306f c0306f = this.h;
        if (i == 1) {
            c0298d.f3632Y = c0306f.f3774g;
        } else {
            c0298d.f3633Z = c0306f.f3774g;
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
        c0306f2.f3776k.add(c0306f);
        c0306f.f3777l.add(c0306f2);
    }
}
