package t;

/* loaded from: classes.dex */
public final class i extends o {
    @Override // t.InterfaceC0346d
    public final void a(InterfaceC0346d interfaceC0346d) {
        f fVar = this.h;
        if (fVar.f4091c && !fVar.f4095j) {
            fVar.d((int) ((((f) fVar.f4097l.get(0)).f4094g * ((s.h) this.f4111b).f4000q0) + 0.5f));
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f4111b;
        s.h hVar = (s.h) dVar;
        int i = hVar.f4001r0;
        int i2 = hVar.s0;
        int i3 = hVar.f4003u0;
        f fVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                fVar.f4097l.add(dVar.f3887T.d.h);
                this.f4111b.f3887T.d.h.f4096k.add(fVar);
                fVar.f4093f = i;
            } else if (i2 != -1) {
                fVar.f4097l.add(dVar.f3887T.d.i);
                this.f4111b.f3887T.d.i.f4096k.add(fVar);
                fVar.f4093f = -i2;
            } else {
                fVar.f4090b = true;
                fVar.f4097l.add(dVar.f3887T.d.i);
                this.f4111b.f3887T.d.i.f4096k.add(fVar);
            }
            m(this.f4111b.d.h);
            m(this.f4111b.d.i);
            return;
        }
        if (i != -1) {
            fVar.f4097l.add(dVar.f3887T.f3901e.h);
            this.f4111b.f3887T.f3901e.h.f4096k.add(fVar);
            fVar.f4093f = i;
        } else if (i2 != -1) {
            fVar.f4097l.add(dVar.f3887T.f3901e.i);
            this.f4111b.f3887T.f3901e.i.f4096k.add(fVar);
            fVar.f4093f = -i2;
        } else {
            fVar.f4090b = true;
            fVar.f4097l.add(dVar.f3887T.f3901e.i);
            this.f4111b.f3887T.f3901e.i.f4096k.add(fVar);
        }
        m(this.f4111b.f3901e.h);
        m(this.f4111b.f3901e.i);
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f4111b;
        int i = ((s.h) dVar).f4003u0;
        f fVar = this.h;
        if (i == 1) {
            dVar.f3892Y = fVar.f4094g;
        } else {
            dVar.f3893Z = fVar.f4094g;
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
        fVar2.f4096k.add(fVar);
        fVar.f4097l.add(fVar2);
    }
}
