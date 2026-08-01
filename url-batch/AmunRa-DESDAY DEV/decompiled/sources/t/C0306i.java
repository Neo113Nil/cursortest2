package t;

import s.C0295d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306i extends AbstractC0312o {
    @Override // t.InterfaceC0301d
    public final void a(InterfaceC0301d interfaceC0301d) {
        C0303f c0303f = this.h;
        if (c0303f.f3844c && !c0303f.f3848j) {
            c0303f.d((int) ((((C0303f) c0303f.f3850l.get(0)).f3847g * ((s.h) this.f3864b).f3792q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0312o
    public final void d() {
        C0295d c0295d = this.f3864b;
        s.h hVar = (s.h) c0295d;
        int i = hVar.f3793r0;
        int i2 = hVar.f3794s0;
        int i3 = hVar.f3796u0;
        C0303f c0303f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0303f.f3850l.add(c0295d.f3681T.d.h);
                this.f3864b.f3681T.d.h.f3849k.add(c0303f);
                c0303f.f3846f = i;
            } else if (i2 != -1) {
                c0303f.f3850l.add(c0295d.f3681T.d.i);
                this.f3864b.f3681T.d.i.f3849k.add(c0303f);
                c0303f.f3846f = -i2;
            } else {
                c0303f.f3843b = true;
                c0303f.f3850l.add(c0295d.f3681T.d.i);
                this.f3864b.f3681T.d.i.f3849k.add(c0303f);
            }
            m(this.f3864b.d.h);
            m(this.f3864b.d.i);
            return;
        }
        if (i != -1) {
            c0303f.f3850l.add(c0295d.f3681T.f3695e.h);
            this.f3864b.f3681T.f3695e.h.f3849k.add(c0303f);
            c0303f.f3846f = i;
        } else if (i2 != -1) {
            c0303f.f3850l.add(c0295d.f3681T.f3695e.i);
            this.f3864b.f3681T.f3695e.i.f3849k.add(c0303f);
            c0303f.f3846f = -i2;
        } else {
            c0303f.f3843b = true;
            c0303f.f3850l.add(c0295d.f3681T.f3695e.i);
            this.f3864b.f3681T.f3695e.i.f3849k.add(c0303f);
        }
        m(this.f3864b.f3695e.h);
        m(this.f3864b.f3695e.i);
    }

    @Override // t.AbstractC0312o
    public final void e() {
        C0295d c0295d = this.f3864b;
        int i = ((s.h) c0295d).f3796u0;
        C0303f c0303f = this.h;
        if (i == 1) {
            c0295d.f3686Y = c0303f.f3847g;
        } else {
            c0295d.f3687Z = c0303f.f3847g;
        }
    }

    @Override // t.AbstractC0312o
    public final void f() {
        this.h.c();
    }

    @Override // t.AbstractC0312o
    public final boolean k() {
        return false;
    }

    public final void m(C0303f c0303f) {
        C0303f c0303f2 = this.h;
        c0303f2.f3849k.add(c0303f);
        c0303f.f3850l.add(c0303f2);
    }
}
