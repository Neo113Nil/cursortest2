package g1;

import a3.i;
import c2.c2;
import c2.u;
import c6.f;
import d1.k;
import kotlin.jvm.internal.Intrinsics;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends k implements c2, u {
    public e C;
    public e D;
    public long E;

    @Override // d1.k
    public final void B() {
        this.D = null;
        this.C = null;
    }

    public final boolean I() {
        e eVar = this.C;
        if (eVar != null) {
            return eVar.I();
        }
        e eVar2 = this.D;
        if (eVar2 != null) {
            return eVar2.I();
        }
        return false;
    }

    public final void J() {
        e eVar = this.D;
        if (eVar != null) {
            eVar.J();
            return;
        }
        e eVar2 = this.C;
        if (eVar2 != null) {
            eVar2.J();
        }
    }

    public final void K() {
        e eVar = this.D;
        if (eVar != null) {
            eVar.K();
        }
        e eVar2 = this.C;
        if (eVar2 != null) {
            eVar2.K();
        }
        this.C = null;
    }

    public final void L(d9.c cVar) {
        c2 c2Var;
        e eVar;
        e eVar2 = this.C;
        if (eVar2 == null || !f.e(eVar2, cf.c.y(cVar))) {
            if (this.f3305d.B) {
                b0 b0Var = new b0();
                c2.k.y(this, new i(b0Var, this, cVar, 1));
                c2Var = (c2) b0Var.f10141d;
            } else {
                c2Var = null;
            }
            eVar = (e) c2Var;
        } else {
            eVar = eVar2;
        }
        if (eVar != null && eVar2 == null) {
            eVar.J();
            eVar.L(cVar);
            e eVar3 = this.D;
            if (eVar3 != null) {
                eVar3.K();
            }
        } else if (eVar == null && eVar2 != null) {
            e eVar4 = this.D;
            if (eVar4 != null) {
                eVar4.J();
                eVar4.L(cVar);
            }
            eVar2.K();
        } else if (!Intrinsics.a(eVar, eVar2)) {
            if (eVar != null) {
                eVar.J();
                eVar.L(cVar);
            }
            if (eVar2 != null) {
                eVar2.K();
            }
        } else if (eVar != null) {
            eVar.L(cVar);
        } else {
            e eVar5 = this.D;
            if (eVar5 != null) {
                eVar5.L(cVar);
            }
        }
        this.C = eVar;
    }

    public final void M() {
        e eVar = this.D;
        if (eVar != null) {
            eVar.M();
            return;
        }
        e eVar2 = this.C;
        if (eVar2 != null) {
            eVar2.M();
        }
    }

    @Override // c2.c2
    public final Object d() {
        return d.f4229a;
    }

    @Override // c2.u
    public final void e(long j) {
        this.E = j;
    }
}
