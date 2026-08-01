package t;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i extends o {
    @Override // t.d
    public final void a(d dVar) {
        f fVar = this.h;
        if (fVar.c && !fVar.f3339j) {
            fVar.d((int) ((((f) fVar.f3341l.get(0)).g * ((s.h) this.f3355b).f3305q0) + 0.5f));
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f3355b;
        s.h hVar = (s.h) dVar;
        int i4 = hVar.f3306r0;
        int i5 = hVar.f3307s0;
        int i6 = hVar.f3309u0;
        f fVar = this.h;
        if (i6 == 1) {
            if (i4 != -1) {
                fVar.f3341l.add(dVar.T.f3237d.h);
                this.f3355b.T.f3237d.h.f3340k.add(fVar);
                fVar.f3337f = i4;
            } else if (i5 != -1) {
                fVar.f3341l.add(dVar.T.f3237d.f3359i);
                this.f3355b.T.f3237d.f3359i.f3340k.add(fVar);
                fVar.f3337f = -i5;
            } else {
                fVar.f3334b = true;
                fVar.f3341l.add(dVar.T.f3237d.f3359i);
                this.f3355b.T.f3237d.f3359i.f3340k.add(fVar);
            }
            m(this.f3355b.f3237d.h);
            m(this.f3355b.f3237d.f3359i);
            return;
        }
        if (i4 != -1) {
            fVar.f3341l.add(dVar.T.f3239e.h);
            this.f3355b.T.f3239e.h.f3340k.add(fVar);
            fVar.f3337f = i4;
        } else if (i5 != -1) {
            fVar.f3341l.add(dVar.T.f3239e.f3359i);
            this.f3355b.T.f3239e.f3359i.f3340k.add(fVar);
            fVar.f3337f = -i5;
        } else {
            fVar.f3334b = true;
            fVar.f3341l.add(dVar.T.f3239e.f3359i);
            this.f3355b.T.f3239e.f3359i.f3340k.add(fVar);
        }
        m(this.f3355b.f3239e.h);
        m(this.f3355b.f3239e.f3359i);
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f3355b;
        int i4 = ((s.h) dVar).f3309u0;
        f fVar = this.h;
        if (i4 == 1) {
            dVar.Y = fVar.g;
        } else {
            dVar.Z = fVar.g;
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
        fVar2.f3340k.add(fVar);
        fVar.f3341l.add(fVar2);
    }
}
