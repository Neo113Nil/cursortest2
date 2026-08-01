package defpackage;

import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class l8 implements q40 {
    public final /* synthetic */ q8 f;

    public /* synthetic */ l8(q8 q8Var) {
        this.f = q8Var;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f.a(0);
    }

    @Override // defpackage.q40
    public dp0 i(View view, dp0 dp0Var) {
        int a = dp0Var.a();
        q8 q8Var = this.f;
        q8Var.m = a;
        q8Var.n = dp0Var.b();
        q8Var.o = dp0Var.c();
        q8Var.e();
        return dp0Var;
    }
}
