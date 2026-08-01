package w;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i extends o {
    @Override // w.d
    public final void a(d dVar) {
        f fVar = this.f3555h;
        if (fVar.f3529c && !fVar.f3534j) {
            fVar.d((int) ((((f) fVar.f3536l.get(0)).f3532g * ((v.h) this.f3550b).f3465q0) + 0.5f));
        }
    }

    @Override // w.o
    public final void d() {
        v.d dVar = this.f3550b;
        v.h hVar = (v.h) dVar;
        int i = hVar.f3466r0;
        int i4 = hVar.f3467s0;
        int i5 = hVar.f3469u0;
        f fVar = this.f3555h;
        if (i5 == 1) {
            if (i != -1) {
                fVar.f3536l.add(dVar.T.d.f3555h);
                this.f3550b.T.d.f3555h.f3535k.add(fVar);
                fVar.f3531f = i;
            } else if (i4 != -1) {
                fVar.f3536l.add(dVar.T.d.i);
                this.f3550b.T.d.i.f3535k.add(fVar);
                fVar.f3531f = -i4;
            } else {
                fVar.f3528b = true;
                fVar.f3536l.add(dVar.T.d.i);
                this.f3550b.T.d.i.f3535k.add(fVar);
            }
            m(this.f3550b.d.f3555h);
            m(this.f3550b.d.i);
            return;
        }
        if (i != -1) {
            fVar.f3536l.add(dVar.T.f3397e.f3555h);
            this.f3550b.T.f3397e.f3555h.f3535k.add(fVar);
            fVar.f3531f = i;
        } else if (i4 != -1) {
            fVar.f3536l.add(dVar.T.f3397e.i);
            this.f3550b.T.f3397e.i.f3535k.add(fVar);
            fVar.f3531f = -i4;
        } else {
            fVar.f3528b = true;
            fVar.f3536l.add(dVar.T.f3397e.i);
            this.f3550b.T.f3397e.i.f3535k.add(fVar);
        }
        m(this.f3550b.f3397e.f3555h);
        m(this.f3550b.f3397e.i);
    }

    @Override // w.o
    public final void e() {
        v.d dVar = this.f3550b;
        int i = ((v.h) dVar).f3469u0;
        f fVar = this.f3555h;
        if (i == 1) {
            dVar.Y = fVar.f3532g;
        } else {
            dVar.Z = fVar.f3532g;
        }
    }

    @Override // w.o
    public final void f() {
        this.f3555h.c();
    }

    @Override // w.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f3555h;
        fVar2.f3535k.add(fVar);
        fVar.f3536l.add(fVar2);
    }
}
