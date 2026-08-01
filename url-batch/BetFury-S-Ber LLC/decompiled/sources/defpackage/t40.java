package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class t40 {
    public final u40 a;
    public boolean b;
    public wi c;
    public final dq d;
    public boolean e;

    public t40(dq dqVar, u40 u40Var) {
        dqVar.getClass();
        boolean z = dqVar.a;
        this.a = u40Var;
        this.b = z;
        this.d = dqVar;
        this.e = true;
    }

    public final void a() {
        wi wiVar = this.c;
        if (wiVar == null || !((LinkedHashSet) wiVar.h).remove(this)) {
            return;
        }
        j30 j30Var = (j30) wiVar.g;
        j30Var.getClass();
        if (this == j30Var.f) {
            if (j30Var.g == -1) {
                this.d.getClass();
            }
            j30Var.f = null;
            j30Var.g = 0;
            j30Var.h = null;
        }
        j30Var.d.remove(this);
        j30Var.e.remove(this);
        this.c = null;
        j30Var.b();
    }

    public final void b(boolean z) {
        j30 j30Var;
        this.e = z;
        boolean z2 = z && this.d.a;
        if (this.b == z2) {
            return;
        }
        this.b = z2;
        wi wiVar = this.c;
        if (wiVar == null || (j30Var = (j30) wiVar.g) == null) {
            return;
        }
        j30Var.b();
    }
}
