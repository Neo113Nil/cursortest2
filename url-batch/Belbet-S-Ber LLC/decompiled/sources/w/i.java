package w;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i extends o {
    @Override // w.d
    public final void a(d dVar) {
        f fVar = this.h;
        if (fVar.f3752c && !fVar.f3756j) {
            fVar.d((int) ((((f) fVar.f3758l.get(0)).f3755g * ((v.h) this.f3772b).f3683q0) + 0.5f));
        }
    }

    @Override // w.o
    public final void d() {
        v.d dVar = this.f3772b;
        v.h hVar = (v.h) dVar;
        int i = hVar.f3684r0;
        int i4 = hVar.f3685s0;
        int i5 = hVar.f3687u0;
        f fVar = this.h;
        if (i5 == 1) {
            if (i != -1) {
                fVar.f3758l.add(dVar.T.d.h);
                this.f3772b.T.d.h.f3757k.add(fVar);
                fVar.f3754f = i;
            } else if (i4 != -1) {
                fVar.f3758l.add(dVar.T.d.i);
                this.f3772b.T.d.i.f3757k.add(fVar);
                fVar.f3754f = -i4;
            } else {
                fVar.f3751b = true;
                fVar.f3758l.add(dVar.T.d.i);
                this.f3772b.T.d.i.f3757k.add(fVar);
            }
            m(this.f3772b.d.h);
            m(this.f3772b.d.i);
            return;
        }
        if (i != -1) {
            fVar.f3758l.add(dVar.T.f3617e.h);
            this.f3772b.T.f3617e.h.f3757k.add(fVar);
            fVar.f3754f = i;
        } else if (i4 != -1) {
            fVar.f3758l.add(dVar.T.f3617e.i);
            this.f3772b.T.f3617e.i.f3757k.add(fVar);
            fVar.f3754f = -i4;
        } else {
            fVar.f3751b = true;
            fVar.f3758l.add(dVar.T.f3617e.i);
            this.f3772b.T.f3617e.i.f3757k.add(fVar);
        }
        m(this.f3772b.f3617e.h);
        m(this.f3772b.f3617e.i);
    }

    @Override // w.o
    public final void e() {
        v.d dVar = this.f3772b;
        int i = ((v.h) dVar).f3687u0;
        f fVar = this.h;
        if (i == 1) {
            dVar.Y = fVar.f3755g;
        } else {
            dVar.Z = fVar.f3755g;
        }
    }

    @Override // w.o
    public final void f() {
        this.h.c();
    }

    @Override // w.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f3757k.add(fVar);
        fVar.f3758l.add(fVar2);
    }
}
