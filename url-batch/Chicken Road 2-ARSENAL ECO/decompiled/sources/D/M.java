package D;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class M extends O {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f253a;

    public M() {
        this.f253a = L.f();
    }

    @Override // D.O
    public Y b() {
        WindowInsets build;
        a();
        build = this.f253a.build();
        Y c7 = Y.c(build, null);
        c7.f272a.o(null);
        return c7;
    }

    @Override // D.O
    public void c(w.c cVar) {
        this.f253a.setStableInsets(cVar.c());
    }

    @Override // D.O
    public void d(w.c cVar) {
        this.f253a.setSystemWindowInsets(cVar.c());
    }

    public M(Y y) {
        super(y);
        WindowInsets.Builder f7;
        WindowInsets b7 = y.b();
        if (b7 != null) {
            f7 = L.g(b7);
        } else {
            f7 = L.f();
        }
        this.f253a = f7;
    }
}
