package t;

import s.C0325d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336i extends AbstractC0342o {
    @Override // t.InterfaceC0331d
    public final void a(InterfaceC0331d interfaceC0331d) {
        C0333f c0333f = this.h;
        if (c0333f.f4170c && !c0333f.f4175j) {
            c0333f.d((int) ((((C0333f) c0333f.f4177l.get(0)).f4174g * ((s.h) this.f4192b).f4136q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0342o
    public final void d() {
        C0325d c0325d = this.f4192b;
        s.h hVar = (s.h) c0325d;
        int i = hVar.f4137r0;
        int i2 = hVar.f4138s0;
        int i3 = hVar.f4140u0;
        C0333f c0333f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0333f.f4177l.add(c0325d.f4023T.f4036d.h);
                this.f4192b.f4023T.f4036d.h.f4176k.add(c0333f);
                c0333f.f4173f = i;
            } else if (i2 != -1) {
                c0333f.f4177l.add(c0325d.f4023T.f4036d.i);
                this.f4192b.f4023T.f4036d.i.f4176k.add(c0333f);
                c0333f.f4173f = -i2;
            } else {
                c0333f.f4169b = true;
                c0333f.f4177l.add(c0325d.f4023T.f4036d.i);
                this.f4192b.f4023T.f4036d.i.f4176k.add(c0333f);
            }
            m(this.f4192b.f4036d.h);
            m(this.f4192b.f4036d.i);
            return;
        }
        if (i != -1) {
            c0333f.f4177l.add(c0325d.f4023T.f4038e.h);
            this.f4192b.f4023T.f4038e.h.f4176k.add(c0333f);
            c0333f.f4173f = i;
        } else if (i2 != -1) {
            c0333f.f4177l.add(c0325d.f4023T.f4038e.i);
            this.f4192b.f4023T.f4038e.i.f4176k.add(c0333f);
            c0333f.f4173f = -i2;
        } else {
            c0333f.f4169b = true;
            c0333f.f4177l.add(c0325d.f4023T.f4038e.i);
            this.f4192b.f4023T.f4038e.i.f4176k.add(c0333f);
        }
        m(this.f4192b.f4038e.h);
        m(this.f4192b.f4038e.i);
    }

    @Override // t.AbstractC0342o
    public final void e() {
        C0325d c0325d = this.f4192b;
        int i = ((s.h) c0325d).f4140u0;
        C0333f c0333f = this.h;
        if (i == 1) {
            c0325d.f4028Y = c0333f.f4174g;
        } else {
            c0325d.f4029Z = c0333f.f4174g;
        }
    }

    @Override // t.AbstractC0342o
    public final void f() {
        this.h.c();
    }

    @Override // t.AbstractC0342o
    public final boolean k() {
        return false;
    }

    public final void m(C0333f c0333f) {
        C0333f c0333f2 = this.h;
        c0333f2.f4176k.add(c0333f);
        c0333f.f4177l.add(c0333f2);
    }
}
