package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class mj0 extends lj0 {
    public final /* synthetic */ g7 a;
    public final /* synthetic */ nj0 b;

    public mj0(nj0 nj0Var, g7 g7Var) {
        this.b = nj0Var;
        this.a = g7Var;
    }

    @Override // defpackage.hj0
    public final void d(kj0 kj0Var) {
        ((ArrayList) this.a.get(this.b.g)).remove(kj0Var);
        kj0Var.x(this);
    }
}
