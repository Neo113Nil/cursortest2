package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gv0 extends ad1 {
    public static final gv0 a = new gv0();
    public static final fv0 b = new fv0();

    @Override // defpackage.ad1
    public final void a(hd1 hd1Var) {
        if (!(hd1Var instanceof l80)) {
            throw new IllegalArgumentException((hd1Var + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        l80 l80Var = (l80) hd1Var;
        fv0 fv0Var = b;
        fv0Var.getClass();
        l80Var.f(fv0Var);
        l80Var.n(fv0Var);
    }

    @Override // defpackage.ad1
    public final zc1 b() {
        return zc1.q;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // defpackage.ad1
    public final void c(hd1 hd1Var) {
    }
}
