package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zo1 extends s53 implements q53 {
    public wd2 a;
    public ad1 b;

    @Override // defpackage.q53
    public final n53 a(Class cls) {
        ad1 ad1Var = this.b;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            lh.e("Local and anonymous classes can not be ViewModels");
            return null;
        }
        if (ad1Var == null) {
            ch2.h("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        wd2 wd2Var = this.a;
        wd2Var.getClass();
        ad1Var.getClass();
        qd2 t = ap.t(wd2Var, ad1Var, canonicalName, null);
        ap1 ap1Var = new ap1(t.n);
        ap1Var.a("androidx.lifecycle.savedstate.vm.tag", t);
        return ap1Var;
    }

    @Override // defpackage.q53
    public final n53 b(Class cls, wm1 wm1Var) {
        String str = (String) wm1Var.a.get(ar0.p);
        if (str == null) {
            lh.g("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        wd2 wd2Var = this.a;
        if (wd2Var == null) {
            return new ap1(z71.m(wm1Var));
        }
        wd2Var.getClass();
        ad1 ad1Var = this.b;
        ad1Var.getClass();
        qd2 t = ap.t(wd2Var, ad1Var, str, null);
        ap1 ap1Var = new ap1(t.n);
        ap1Var.a("androidx.lifecycle.savedstate.vm.tag", t);
        return ap1Var;
    }

    @Override // defpackage.s53
    public final void d(n53 n53Var) {
        wd2 wd2Var = this.a;
        if (wd2Var != null) {
            ad1 ad1Var = this.b;
            ad1Var.getClass();
            ap.q(n53Var, wd2Var, ad1Var);
        }
    }
}
