package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class s9 extends z60 {
    public boolean a = false;
    public final ViewGroup b;

    public s9(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.z60, defpackage.v60
    public final void b() {
        op.S(this.b, false);
    }

    @Override // defpackage.z60, defpackage.v60
    public final void c() {
        op.S(this.b, true);
    }

    @Override // defpackage.v60
    public final void d(y60 y60Var) {
        if (!this.a) {
            op.S(this.b, false);
        }
        y60Var.y(this);
    }

    @Override // defpackage.z60, defpackage.v60
    public final void f(y60 y60Var) {
        op.S(this.b, false);
        this.a = true;
    }
}
