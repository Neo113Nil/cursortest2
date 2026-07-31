package y;

import android.view.WindowInsets;
import r.C0224c;

/* renamed from: y.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0256F extends H {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f3112a = io.flutter.plugin.platform.j.e();

    @Override // y.H
    public Q b() {
        WindowInsets build;
        a();
        build = this.f3112a.build();
        Q a2 = Q.a(build, null);
        a2.f3130a.n(null);
        return a2;
    }

    @Override // y.H
    public void c(C0224c c0224c) {
        this.f3112a.setStableInsets(c0224c.c());
    }

    @Override // y.H
    public void d(C0224c c0224c) {
        this.f3112a.setSystemWindowInsets(c0224c.c());
    }
}
