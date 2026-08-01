package v;

import u.C0387d;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400i extends AbstractC0406o {
    @Override // v.InterfaceC0395d
    public final void a(InterfaceC0395d interfaceC0395d) {
        C0397f c0397f = this.f4442h;
        if (c0397f.f4417c && !c0397f.j) {
            c0397f.d((int) ((((C0397f) c0397f.f4423l.get(0)).f4420g * ((u.h) this.f4437b).f4361q0) + 0.5f));
        }
    }

    @Override // v.AbstractC0406o
    public final void d() {
        C0387d c0387d = this.f4437b;
        u.h hVar = (u.h) c0387d;
        int i = hVar.f4362r0;
        int i2 = hVar.s0;
        int i3 = hVar.f4364u0;
        C0397f c0397f = this.f4442h;
        if (i3 == 1) {
            if (i != -1) {
                c0397f.f4423l.add(c0387d.f4247T.f4260d.f4442h);
                this.f4437b.f4247T.f4260d.f4442h.f4422k.add(c0397f);
                c0397f.f4419f = i;
            } else if (i2 != -1) {
                c0397f.f4423l.add(c0387d.f4247T.f4260d.i);
                this.f4437b.f4247T.f4260d.i.f4422k.add(c0397f);
                c0397f.f4419f = -i2;
            } else {
                c0397f.f4416b = true;
                c0397f.f4423l.add(c0387d.f4247T.f4260d.i);
                this.f4437b.f4247T.f4260d.i.f4422k.add(c0397f);
            }
            m(this.f4437b.f4260d.f4442h);
            m(this.f4437b.f4260d.i);
            return;
        }
        if (i != -1) {
            c0397f.f4423l.add(c0387d.f4247T.e.f4442h);
            this.f4437b.f4247T.e.f4442h.f4422k.add(c0397f);
            c0397f.f4419f = i;
        } else if (i2 != -1) {
            c0397f.f4423l.add(c0387d.f4247T.e.i);
            this.f4437b.f4247T.e.i.f4422k.add(c0397f);
            c0397f.f4419f = -i2;
        } else {
            c0397f.f4416b = true;
            c0397f.f4423l.add(c0387d.f4247T.e.i);
            this.f4437b.f4247T.e.i.f4422k.add(c0397f);
        }
        m(this.f4437b.e.f4442h);
        m(this.f4437b.e.i);
    }

    @Override // v.AbstractC0406o
    public final void e() {
        C0387d c0387d = this.f4437b;
        int i = ((u.h) c0387d).f4364u0;
        C0397f c0397f = this.f4442h;
        if (i == 1) {
            c0387d.f4252Y = c0397f.f4420g;
        } else {
            c0387d.f4253Z = c0397f.f4420g;
        }
    }

    @Override // v.AbstractC0406o
    public final void f() {
        this.f4442h.c();
    }

    @Override // v.AbstractC0406o
    public final boolean k() {
        return false;
    }

    public final void m(C0397f c0397f) {
        C0397f c0397f2 = this.f4442h;
        c0397f2.f4422k.add(c0397f);
        c0397f.f4423l.add(c0397f2);
    }
}
