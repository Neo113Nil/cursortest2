package u;

/* loaded from: classes.dex */
public final class i extends o {
    @Override // u.InterfaceC0303d
    public final void a(InterfaceC0303d interfaceC0303d) {
        f fVar = this.f3949h;
        if (fVar.f3923c && !fVar.f3928j) {
            fVar.d((int) ((((f) fVar.f3930l.get(0)).f3926g * ((t.h) this.f3944b).f3884q0) + 0.5f));
        }
    }

    @Override // u.o
    public final void d() {
        t.d dVar = this.f3944b;
        t.h hVar = (t.h) dVar;
        int i = hVar.f3885r0;
        int i2 = hVar.f3886s0;
        int i3 = hVar.f3888u0;
        f fVar = this.f3949h;
        if (i3 == 1) {
            if (i != -1) {
                fVar.f3930l.add(dVar.f3769T.d.f3949h);
                this.f3944b.f3769T.d.f3949h.f3929k.add(fVar);
                fVar.f3925f = i;
            } else if (i2 != -1) {
                fVar.f3930l.add(dVar.f3769T.d.i);
                this.f3944b.f3769T.d.i.f3929k.add(fVar);
                fVar.f3925f = -i2;
            } else {
                fVar.f3922b = true;
                fVar.f3930l.add(dVar.f3769T.d.i);
                this.f3944b.f3769T.d.i.f3929k.add(fVar);
            }
            m(this.f3944b.d.f3949h);
            m(this.f3944b.d.i);
            return;
        }
        if (i != -1) {
            fVar.f3930l.add(dVar.f3769T.f3783e.f3949h);
            this.f3944b.f3769T.f3783e.f3949h.f3929k.add(fVar);
            fVar.f3925f = i;
        } else if (i2 != -1) {
            fVar.f3930l.add(dVar.f3769T.f3783e.i);
            this.f3944b.f3769T.f3783e.i.f3929k.add(fVar);
            fVar.f3925f = -i2;
        } else {
            fVar.f3922b = true;
            fVar.f3930l.add(dVar.f3769T.f3783e.i);
            this.f3944b.f3769T.f3783e.i.f3929k.add(fVar);
        }
        m(this.f3944b.f3783e.f3949h);
        m(this.f3944b.f3783e.i);
    }

    @Override // u.o
    public final void e() {
        t.d dVar = this.f3944b;
        int i = ((t.h) dVar).f3888u0;
        f fVar = this.f3949h;
        if (i == 1) {
            dVar.f3774Y = fVar.f3926g;
        } else {
            dVar.f3775Z = fVar.f3926g;
        }
    }

    @Override // u.o
    public final void f() {
        this.f3949h.c();
    }

    @Override // u.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f3949h;
        fVar2.f3929k.add(fVar);
        fVar.f3930l.add(fVar2);
    }
}
