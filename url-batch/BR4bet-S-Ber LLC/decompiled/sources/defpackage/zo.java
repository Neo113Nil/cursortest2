package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class zo extends rd0 {
    @Override // defpackage.dh
    public final void a(dh dhVar) {
        fh fhVar = this.h;
        if (fhVar.c && !fhVar.j) {
            fhVar.d((int) ((((fh) fhVar.l.get(0)).g * ((yo) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.rd0
    public final void d() {
        ae aeVar = this.b;
        yo yoVar = (yo) aeVar;
        int i = yoVar.r0;
        int i2 = yoVar.s0;
        int i3 = yoVar.u0;
        fh fhVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                fhVar.l.add(aeVar.T.d.h);
                this.b.T.d.h.k.add(fhVar);
                fhVar.f = i;
            } else if (i2 != -1) {
                fhVar.l.add(aeVar.T.d.i);
                this.b.T.d.i.k.add(fhVar);
                fhVar.f = -i2;
            } else {
                fhVar.b = true;
                fhVar.l.add(aeVar.T.d.i);
                this.b.T.d.i.k.add(fhVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            fhVar.l.add(aeVar.T.e.h);
            this.b.T.e.h.k.add(fhVar);
            fhVar.f = i;
        } else if (i2 != -1) {
            fhVar.l.add(aeVar.T.e.i);
            this.b.T.e.i.k.add(fhVar);
            fhVar.f = -i2;
        } else {
            fhVar.b = true;
            fhVar.l.add(aeVar.T.e.i);
            this.b.T.e.i.k.add(fhVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.rd0
    public final void e() {
        ae aeVar = this.b;
        int i = ((yo) aeVar).u0;
        fh fhVar = this.h;
        if (i == 1) {
            aeVar.Y = fhVar.g;
        } else {
            aeVar.Z = fhVar.g;
        }
    }

    @Override // defpackage.rd0
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.rd0
    public final boolean k() {
        return false;
    }

    public final void m(fh fhVar) {
        fh fhVar2 = this.h;
        fhVar2.k.add(fhVar);
        fhVar.l.add(fhVar2);
    }
}
