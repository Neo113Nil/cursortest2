package z2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends o {
    @Override // z2.d
    public final void a(d dVar) {
        f fVar = this.f9168h;
        if (fVar.f9139c && !fVar.f9145j) {
            fVar.d((int) ((((f) fVar.f9147l.get(0)).f9143g * ((y2.h) this.f9162b).f8825q0) + 0.5f));
        }
    }

    @Override // z2.o
    public final void d() {
        y2.d dVar = this.f9162b;
        y2.h hVar = (y2.h) dVar;
        int i = hVar.f8826r0;
        int i8 = hVar.f8827s0;
        int i9 = hVar.f8829u0;
        f fVar = this.f9168h;
        if (i9 == 1) {
            if (i != -1) {
                fVar.f9147l.add(dVar.T.f8753d.f9168h);
                this.f9162b.T.f8753d.f9168h.f9146k.add(fVar);
                fVar.f9142f = i;
            } else if (i8 != -1) {
                fVar.f9147l.add(dVar.T.f8753d.i);
                this.f9162b.T.f8753d.i.f9146k.add(fVar);
                fVar.f9142f = -i8;
            } else {
                fVar.f9138b = true;
                fVar.f9147l.add(dVar.T.f8753d.i);
                this.f9162b.T.f8753d.i.f9146k.add(fVar);
            }
            m(this.f9162b.f8753d.f9168h);
            m(this.f9162b.f8753d.i);
            return;
        }
        if (i != -1) {
            fVar.f9147l.add(dVar.T.f8755e.f9168h);
            this.f9162b.T.f8755e.f9168h.f9146k.add(fVar);
            fVar.f9142f = i;
        } else if (i8 != -1) {
            fVar.f9147l.add(dVar.T.f8755e.i);
            this.f9162b.T.f8755e.i.f9146k.add(fVar);
            fVar.f9142f = -i8;
        } else {
            fVar.f9138b = true;
            fVar.f9147l.add(dVar.T.f8755e.i);
            this.f9162b.T.f8755e.i.f9146k.add(fVar);
        }
        m(this.f9162b.f8755e.f9168h);
        m(this.f9162b.f8755e.i);
    }

    @Override // z2.o
    public final void e() {
        y2.d dVar = this.f9162b;
        int i = ((y2.h) dVar).f8829u0;
        f fVar = this.f9168h;
        if (i == 1) {
            dVar.Y = fVar.f9143g;
        } else {
            dVar.Z = fVar.f9143g;
        }
    }

    @Override // z2.o
    public final void f() {
        this.f9168h.c();
    }

    @Override // z2.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f9168h;
        fVar2.f9146k.add(fVar);
        fVar.f9147l.add(fVar2);
    }
}
