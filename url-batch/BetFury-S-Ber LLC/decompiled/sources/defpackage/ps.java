package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ps extends vn0 {
    @Override // defpackage.jj
    public final void a(jj jjVar) {
        mj mjVar = this.h;
        if (mjVar.c && !mjVar.j) {
            mjVar.d((int) ((((mj) mjVar.l.get(0)).g * ((os) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.vn0
    public final void d() {
        rf rfVar = this.b;
        os osVar = (os) rfVar;
        int i = osVar.r0;
        int i2 = osVar.s0;
        int i3 = osVar.u0;
        mj mjVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                mjVar.l.add(rfVar.U.d.h);
                this.b.U.d.h.k.add(mjVar);
                mjVar.f = i;
            } else if (i2 != -1) {
                mjVar.l.add(rfVar.U.d.i);
                this.b.U.d.i.k.add(mjVar);
                mjVar.f = -i2;
            } else {
                mjVar.b = true;
                mjVar.l.add(rfVar.U.d.i);
                this.b.U.d.i.k.add(mjVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            mjVar.l.add(rfVar.U.e.h);
            this.b.U.e.h.k.add(mjVar);
            mjVar.f = i;
        } else if (i2 != -1) {
            mjVar.l.add(rfVar.U.e.i);
            this.b.U.e.i.k.add(mjVar);
            mjVar.f = -i2;
        } else {
            mjVar.b = true;
            mjVar.l.add(rfVar.U.e.i);
            this.b.U.e.i.k.add(mjVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.vn0
    public final void e() {
        rf rfVar = this.b;
        int i = ((os) rfVar).u0;
        mj mjVar = this.h;
        if (i == 1) {
            rfVar.Z = mjVar.g;
        } else {
            rfVar.a0 = mjVar.g;
        }
    }

    @Override // defpackage.vn0
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.vn0
    public final boolean k() {
        return false;
    }

    public final void m(mj mjVar) {
        mj mjVar2 = this.h;
        mjVar2.k.add(mjVar);
        mjVar.l.add(mjVar2);
    }
}
