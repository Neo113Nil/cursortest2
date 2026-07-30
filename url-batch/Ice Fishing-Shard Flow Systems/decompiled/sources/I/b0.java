package I;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class b0 extends h0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f1175c;

    public b0() {
        this.f1175c = B.d.h();
    }

    @Override // I.h0
    public v0 b() {
        WindowInsets build;
        a();
        build = this.f1175c.build();
        v0 c7 = v0.c(build, null);
        r0 r0Var = c7.f1239a;
        r0Var.t(null);
        r0Var.s(null);
        r0Var.x(this.f1192a);
        r0Var.y(this.f1193b);
        return c7;
    }

    @Override // I.h0
    public void d(B.c cVar) {
        this.f1175c.setStableInsets(cVar.c());
    }

    @Override // I.h0
    public void e(B.c cVar) {
        this.f1175c.setSystemWindowInsets(cVar.c());
    }

    public b0(v0 v0Var) {
        super(v0Var);
        WindowInsets.Builder h7;
        WindowInsets b7 = v0Var.b();
        if (b7 != null) {
            h7 = B.d.i(b7);
        } else {
            h7 = B.d.h();
        }
        this.f1175c = h7;
    }
}
