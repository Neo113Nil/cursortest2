package s5;

import android.util.Log;
import e5.a;

/* loaded from: classes.dex */
public final class c implements e5.a, f5.a {

    /* renamed from: f, reason: collision with root package name */
    private a f21651f;

    /* renamed from: g, reason: collision with root package name */
    private b f21652g;

    @Override // f5.a
    public void a(f5.c cVar) {
        b(cVar);
    }

    @Override // f5.a
    public void b(f5.c cVar) {
        if (this.f21651f == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f21652g.d(cVar.d());
        }
    }

    @Override // f5.a
    public void c() {
        if (this.f21651f == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f21652g.d(null);
        }
    }

    @Override // f5.a
    public void e() {
        c();
    }

    @Override // e5.a
    public void f(a.b bVar) {
        b bVar2 = new b(bVar.a(), null);
        this.f21652g = bVar2;
        a aVar = new a(bVar2);
        this.f21651f = aVar;
        aVar.e(bVar.b());
    }

    @Override // e5.a
    public void i(a.b bVar) {
        a aVar = this.f21651f;
        if (aVar == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        aVar.f();
        this.f21651f = null;
        this.f21652g = null;
    }
}
