package t;

/* loaded from: classes.dex */
public final class i extends o {
    @Override // t.InterfaceC0301d
    public final void a(InterfaceC0301d interfaceC0301d) {
        f fVar = this.h;
        if (fVar.f3744c && !fVar.f3748j) {
            fVar.d((int) ((((f) fVar.f3750l.get(0)).f3747g * ((s.h) this.f3764b).f3707q0) + 0.5f));
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f3764b;
        s.h hVar = (s.h) dVar;
        int i = hVar.f3708r0;
        int i2 = hVar.f3709s0;
        int i3 = hVar.f3711u0;
        f fVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                fVar.f3750l.add(dVar.f3593T.d.h);
                this.f3764b.f3593T.d.h.f3749k.add(fVar);
                fVar.f3746f = i;
            } else if (i2 != -1) {
                fVar.f3750l.add(dVar.f3593T.d.i);
                this.f3764b.f3593T.d.i.f3749k.add(fVar);
                fVar.f3746f = -i2;
            } else {
                fVar.f3743b = true;
                fVar.f3750l.add(dVar.f3593T.d.i);
                this.f3764b.f3593T.d.i.f3749k.add(fVar);
            }
            m(this.f3764b.d.h);
            m(this.f3764b.d.i);
            return;
        }
        if (i != -1) {
            fVar.f3750l.add(dVar.f3593T.f3607e.h);
            this.f3764b.f3593T.f3607e.h.f3749k.add(fVar);
            fVar.f3746f = i;
        } else if (i2 != -1) {
            fVar.f3750l.add(dVar.f3593T.f3607e.i);
            this.f3764b.f3593T.f3607e.i.f3749k.add(fVar);
            fVar.f3746f = -i2;
        } else {
            fVar.f3743b = true;
            fVar.f3750l.add(dVar.f3593T.f3607e.i);
            this.f3764b.f3593T.f3607e.i.f3749k.add(fVar);
        }
        m(this.f3764b.f3607e.h);
        m(this.f3764b.f3607e.i);
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f3764b;
        int i = ((s.h) dVar).f3711u0;
        f fVar = this.h;
        if (i == 1) {
            dVar.f3598Y = fVar.f3747g;
        } else {
            dVar.f3599Z = fVar.f3747g;
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
        fVar2.f3749k.add(fVar);
        fVar.f3750l.add(fVar2);
    }
}
