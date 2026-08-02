package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class st extends sy {
    public st(sd sdVar) {
        super(sdVar);
        sdVar.h.d();
        sdVar.i.d();
        this.f = ((sh) sdVar).as;
    }

    private final void g(sq sqVar) {
        sq sqVar2 = this.h;
        sqVar2.j.add(sqVar);
        sqVar.k.add(sqVar2);
    }

    @Override // defpackage.sy
    public final void b() {
        sd sdVar = this.d;
        sh shVar = (sh) sdVar;
        int i = shVar.b;
        int i2 = shVar.c;
        float f = shVar.a;
        if (shVar.as == 1) {
            if (i != -1) {
                sq sqVar = this.h;
                sqVar.k.add(sdVar.V.h.h);
                this.d.V.h.h.j.add(sqVar);
                sqVar.e = i;
            } else if (i2 != -1) {
                sq sqVar2 = this.h;
                sqVar2.k.add(sdVar.V.h.i);
                this.d.V.h.i.j.add(sqVar2);
                sqVar2.e = -i2;
            } else {
                sq sqVar3 = this.h;
                sqVar3.b = true;
                sqVar3.k.add(sdVar.V.h.i);
                this.d.V.h.i.j.add(sqVar3);
            }
            g(this.d.h.h);
            g(this.d.h.i);
            return;
        }
        if (i != -1) {
            sq sqVar4 = this.h;
            sqVar4.k.add(sdVar.V.i.h);
            this.d.V.i.h.j.add(sqVar4);
            sqVar4.e = i;
        } else if (i2 != -1) {
            sq sqVar5 = this.h;
            sqVar5.k.add(sdVar.V.i.i);
            this.d.V.i.i.j.add(sqVar5);
            sqVar5.e = -i2;
        } else {
            sq sqVar6 = this.h;
            sqVar6.b = true;
            sqVar6.k.add(sdVar.V.i.i);
            this.d.V.i.i.j.add(sqVar6);
        }
        g(this.d.i.h);
        g(this.d.i.i);
    }

    @Override // defpackage.sy
    public final void c() {
        sd sdVar = this.d;
        if (((sh) sdVar).as == 1) {
            sdVar.aa = this.h.f;
        } else {
            sdVar.ab = this.h.f;
        }
    }

    @Override // defpackage.sy
    public final void d() {
        this.h.b();
    }

    @Override // defpackage.sy
    public final boolean e() {
        return false;
    }

    @Override // defpackage.sy, defpackage.so
    public final void f() {
        sq sqVar = this.h;
        if (sqVar.c && !sqVar.i) {
            sqVar.c((int) ((((sq) sqVar.k.get(0)).f * ((sh) this.d).a) + 0.5f));
        }
    }
}
