package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class vo1 extends yo1 {
    public final WindowInsets.Builder a;

    public vo1(ip1 ip1Var) {
        super(ip1Var);
        WindowInsets b = ip1Var.b();
        this.a = b != null ? new WindowInsets.Builder(b) : new WindowInsets.Builder();
    }

    @Override // defpackage.yo1
    public ip1 b() {
        a();
        ip1 c = ip1.c(null, this.a.build());
        c.a.r(null);
        return c;
    }

    @Override // defpackage.yo1
    public void c(c90 c90Var) {
        this.a.setStableInsets(c90Var.c());
    }

    @Override // defpackage.yo1
    public void d(c90 c90Var) {
        this.a.setSystemWindowInsets(c90Var.c());
    }

    public void e(ms msVar) {
        this.a.setDisplayCutout(msVar != null ? msVar.a : null);
    }

    public vo1() {
        this.a = new WindowInsets.Builder();
    }
}
