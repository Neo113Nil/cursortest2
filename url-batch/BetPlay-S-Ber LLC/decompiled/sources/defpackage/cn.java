package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class cn extends ra0 {
    @Override // defpackage.ef
    public final void a(ef efVar) {
        gf gfVar = this.h;
        if (gfVar.c && !gfVar.j) {
            gfVar.d((int) ((((gf) gfVar.l.get(0)).g * ((bn) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.ra0
    public final void d() {
        ed edVar = this.b;
        bn bnVar = (bn) edVar;
        int i = bnVar.r0;
        int i2 = bnVar.s0;
        int i3 = bnVar.u0;
        gf gfVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                gfVar.l.add(edVar.T.d.h);
                this.b.T.d.h.k.add(gfVar);
                gfVar.f = i;
            } else if (i2 != -1) {
                gfVar.l.add(edVar.T.d.i);
                this.b.T.d.i.k.add(gfVar);
                gfVar.f = -i2;
            } else {
                gfVar.b = true;
                gfVar.l.add(edVar.T.d.i);
                this.b.T.d.i.k.add(gfVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            gfVar.l.add(edVar.T.e.h);
            this.b.T.e.h.k.add(gfVar);
            gfVar.f = i;
        } else if (i2 != -1) {
            gfVar.l.add(edVar.T.e.i);
            this.b.T.e.i.k.add(gfVar);
            gfVar.f = -i2;
        } else {
            gfVar.b = true;
            gfVar.l.add(edVar.T.e.i);
            this.b.T.e.i.k.add(gfVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.ra0
    public final void e() {
        ed edVar = this.b;
        int i = ((bn) edVar).u0;
        gf gfVar = this.h;
        if (i == 1) {
            edVar.Y = gfVar.g;
        } else {
            edVar.Z = gfVar.g;
        }
    }

    @Override // defpackage.ra0
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.ra0
    public final boolean k() {
        return false;
    }

    public final void m(gf gfVar) {
        gf gfVar2 = this.h;
        gfVar2.k.add(gfVar);
        gfVar.l.add(gfVar2);
    }
}
