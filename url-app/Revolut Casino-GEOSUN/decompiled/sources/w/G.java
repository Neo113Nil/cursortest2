package w;

import android.view.WindowInsets;
import p.C0217c;

/* loaded from: classes.dex */
public class G extends I {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f3027a = io.flutter.plugin.platform.i.c();

    @Override // w.I
    public S b() {
        WindowInsets build;
        a();
        build = this.f3027a.build();
        S a2 = S.a(build, null);
        a2.f3045a.n(null);
        return a2;
    }

    @Override // w.I
    public void c(C0217c c0217c) {
        this.f3027a.setStableInsets(c0217c.c());
    }

    @Override // w.I
    public void d(C0217c c0217c) {
        this.f3027a.setSystemWindowInsets(c0217c.c());
    }
}
