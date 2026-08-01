package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class rn0 extends rv {
    public final uv b;
    public final WeakReference c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn0(uv uvVar, sa0 sa0Var) {
        super(sa0Var.a);
        sa0Var.getClass();
        this.b = uvVar;
        this.c = new WeakReference(sa0Var);
    }

    @Override // defpackage.rv
    public final void a(Set set) {
        set.getClass();
        rv rvVar = (rv) this.c.get();
        if (rvVar == null) {
            this.b.b(this);
        } else {
            rvVar.a(set);
        }
    }
}
