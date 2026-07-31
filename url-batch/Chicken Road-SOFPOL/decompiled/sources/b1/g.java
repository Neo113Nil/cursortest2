package b1;

import q6.i;
import q6.s;
import w1.u;
import w1.x1;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends l implements x1, u {

    /* renamed from: r, reason: collision with root package name */
    public g f1058r;

    /* renamed from: s, reason: collision with root package name */
    public g f1059s;

    /* renamed from: t, reason: collision with root package name */
    public long f1060t;

    @Override // y0.l
    public final void k0() {
        this.f1059s = null;
        this.f1058r = null;
    }

    @Override // w1.x1
    public final Object m() {
        return d.f1051a;
    }

    @Override // w1.u
    public final void o(long j7) {
        this.f1060t = j7;
    }

    public final boolean r0(b bVar) {
        g gVar = this.f1058r;
        if (gVar != null) {
            return gVar.r0(bVar);
        }
        g gVar2 = this.f1059s;
        if (gVar2 != null) {
            return gVar2.r0(bVar);
        }
        return false;
    }

    public final void s0(b bVar) {
        g gVar = this.f1059s;
        if (gVar != null) {
            gVar.s0(bVar);
            return;
        }
        g gVar2 = this.f1058r;
        if (gVar2 != null) {
            gVar2.s0(bVar);
        }
    }

    public final void t0(b bVar) {
        g gVar = this.f1059s;
        if (gVar != null) {
            gVar.t0(bVar);
        }
        g gVar2 = this.f1058r;
        if (gVar2 != null) {
            gVar2.t0(bVar);
        }
        this.f1058r = null;
    }

    public final void u0(b bVar) {
        x1 x1Var;
        g gVar;
        g gVar2 = this.f1058r;
        if (gVar2 == null || !a.a.c(gVar2, s6.a.u(bVar))) {
            if (this.f8706d.f8718q) {
                s sVar = new s();
                w1.f.y(this, new f(sVar, this, bVar, 0));
                x1Var = (x1) sVar.f6205d;
            } else {
                x1Var = null;
            }
            gVar = (g) x1Var;
        } else {
            gVar = gVar2;
        }
        if (gVar != null && gVar2 == null) {
            gVar.s0(bVar);
            gVar.u0(bVar);
            g gVar3 = this.f1059s;
            if (gVar3 != null) {
                gVar3.t0(bVar);
            }
        } else if (gVar == null && gVar2 != null) {
            g gVar4 = this.f1059s;
            if (gVar4 != null) {
                gVar4.s0(bVar);
                gVar4.u0(bVar);
            }
            gVar2.t0(bVar);
        } else if (!i.a(gVar, gVar2)) {
            if (gVar != null) {
                gVar.s0(bVar);
                gVar.u0(bVar);
            }
            if (gVar2 != null) {
                gVar2.t0(bVar);
            }
        } else if (gVar != null) {
            gVar.u0(bVar);
        } else {
            g gVar5 = this.f1059s;
            if (gVar5 != null) {
                gVar5.u0(bVar);
            }
        }
        this.f1058r = gVar;
    }

    public final void v0(b bVar) {
        g gVar = this.f1059s;
        if (gVar != null) {
            gVar.v0(bVar);
            return;
        }
        g gVar2 = this.f1058r;
        if (gVar2 != null) {
            gVar2.v0(bVar);
        }
    }
}
