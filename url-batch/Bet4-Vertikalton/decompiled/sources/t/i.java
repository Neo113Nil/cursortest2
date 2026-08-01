package t;

/* loaded from: classes.dex */
public final class i extends o {
    @Override // t.InterfaceC0300d
    public final void a(InterfaceC0300d interfaceC0300d) {
        f fVar = this.h;
        if (fVar.f3776c && !fVar.f3780j) {
            fVar.d((int) ((((f) fVar.f3782l.get(0)).f3779g * ((s.h) this.f3796b).f3678q0) + 0.5f));
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f3796b;
        s.h hVar = (s.h) dVar;
        int i = hVar.f3679r0;
        int i2 = hVar.f3680s0;
        int i3 = hVar.f3682u0;
        f fVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                fVar.f3782l.add(dVar.f3567T.d.h);
                this.f3796b.f3567T.d.h.f3781k.add(fVar);
                fVar.f3778f = i;
            } else if (i2 != -1) {
                fVar.f3782l.add(dVar.f3567T.d.i);
                this.f3796b.f3567T.d.i.f3781k.add(fVar);
                fVar.f3778f = -i2;
            } else {
                fVar.f3775b = true;
                fVar.f3782l.add(dVar.f3567T.d.i);
                this.f3796b.f3567T.d.i.f3781k.add(fVar);
            }
            m(this.f3796b.d.h);
            m(this.f3796b.d.i);
            return;
        }
        if (i != -1) {
            fVar.f3782l.add(dVar.f3567T.f3581e.h);
            this.f3796b.f3567T.f3581e.h.f3781k.add(fVar);
            fVar.f3778f = i;
        } else if (i2 != -1) {
            fVar.f3782l.add(dVar.f3567T.f3581e.i);
            this.f3796b.f3567T.f3581e.i.f3781k.add(fVar);
            fVar.f3778f = -i2;
        } else {
            fVar.f3775b = true;
            fVar.f3782l.add(dVar.f3567T.f3581e.i);
            this.f3796b.f3567T.f3581e.i.f3781k.add(fVar);
        }
        m(this.f3796b.f3581e.h);
        m(this.f3796b.f3581e.i);
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f3796b;
        int i = ((s.h) dVar).f3682u0;
        f fVar = this.h;
        if (i == 1) {
            dVar.f3572Y = fVar.f3779g;
        } else {
            dVar.f3573Z = fVar.f3779g;
        }
    }

    @Override // t.o
    public final void f() {
        this.h.c();
    }

    @Override // t.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f3781k.add(fVar);
        fVar.f3782l.add(fVar2);
    }
}
