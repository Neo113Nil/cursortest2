package A;

import android.view.WindowInsets;
import t.C0307c;

/* loaded from: classes.dex */
public class I extends K {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f11a = H.f();

    @Override // A.K
    public T b() {
        WindowInsets build;
        a();
        build = this.f11a.build();
        T a2 = T.a(build, null);
        a2.f24a.j(null);
        return a2;
    }

    @Override // A.K
    public void c(C0307c c0307c) {
        this.f11a.setStableInsets(c0307c.b());
    }

    @Override // A.K
    public void d(C0307c c0307c) {
        this.f11a.setSystemWindowInsets(c0307c.b());
    }
}
