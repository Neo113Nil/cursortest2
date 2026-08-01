package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class pm extends ka0 {
    @Override // defpackage.ff
    public final void a(ff ffVar) {
        hf hfVar = this.h;
        if (hfVar.c && !hfVar.j) {
            hfVar.d((int) ((((hf) hfVar.l.get(0)).g * ((om) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.ka0
    public final void d() {
        ad adVar = this.b;
        om omVar = (om) adVar;
        int i = omVar.r0;
        int i2 = omVar.s0;
        int i3 = omVar.u0;
        hf hfVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                hfVar.l.add(adVar.T.d.h);
                this.b.T.d.h.k.add(hfVar);
                hfVar.f = i;
            } else if (i2 != -1) {
                hfVar.l.add(adVar.T.d.i);
                this.b.T.d.i.k.add(hfVar);
                hfVar.f = -i2;
            } else {
                hfVar.b = true;
                hfVar.l.add(adVar.T.d.i);
                this.b.T.d.i.k.add(hfVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            hfVar.l.add(adVar.T.e.h);
            this.b.T.e.h.k.add(hfVar);
            hfVar.f = i;
        } else if (i2 != -1) {
            hfVar.l.add(adVar.T.e.i);
            this.b.T.e.i.k.add(hfVar);
            hfVar.f = -i2;
        } else {
            hfVar.b = true;
            hfVar.l.add(adVar.T.e.i);
            this.b.T.e.i.k.add(hfVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.ka0
    public final void e() {
        ad adVar = this.b;
        int i = ((om) adVar).u0;
        hf hfVar = this.h;
        if (i == 1) {
            adVar.Y = hfVar.g;
        } else {
            adVar.Z = hfVar.g;
        }
    }

    @Override // defpackage.ka0
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.ka0
    public final boolean k() {
        return false;
    }

    public final void m(hf hfVar) {
        hf hfVar2 = this.h;
        hfVar2.k.add(hfVar);
        hfVar.l.add(hfVar2);
    }
}
