package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class cb extends lj0 {
    public boolean a = false;
    public final ViewGroup b;

    public cb(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.lj0, defpackage.hj0
    public final void b() {
        zb0.m(this.b, false);
    }

    @Override // defpackage.lj0, defpackage.hj0
    public final void c() {
        zb0.m(this.b, true);
    }

    @Override // defpackage.hj0
    public final void d(kj0 kj0Var) {
        if (!this.a) {
            zb0.m(this.b, false);
        }
        kj0Var.x(this);
    }

    @Override // defpackage.lj0, defpackage.hj0
    public final void f(kj0 kj0Var) {
        zb0.m(this.b, false);
        this.a = true;
    }
}
