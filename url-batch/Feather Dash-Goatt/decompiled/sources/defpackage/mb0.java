package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class mb0 extends pi0 implements rs, n70 {
    public qb0 k;

    @Override // defpackage.rs
    public final void a() {
        q().h0(this);
    }

    @Override // defpackage.n70
    public final boolean b() {
        return true;
    }

    @Override // defpackage.n70
    public final sp0 d() {
        return null;
    }

    public jb0 getParent() {
        return q();
    }

    public final qb0 q() {
        qb0 qb0Var = this.k;
        if (qb0Var != null) {
            return qb0Var;
        }
        Intrinsics.e("job");
        throw null;
    }

    public abstract boolean r();

    public abstract void s(Throwable th);

    @Override // defpackage.pi0
    public final String toString() {
        return getClass().getSimpleName() + '@' + op.y(this) + "[job@" + op.y(q()) + ']';
    }
}
