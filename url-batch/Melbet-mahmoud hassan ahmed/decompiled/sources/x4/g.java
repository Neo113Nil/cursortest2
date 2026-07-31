package x4;

import e5.a;
import kotlin.jvm.internal.i;
import x4.a;

/* loaded from: classes.dex */
public final class g implements e5.a, a.c, f5.a {

    /* renamed from: f, reason: collision with root package name */
    private f f23195f;

    @Override // f5.a
    public void a(f5.c cVar) {
        i.d(cVar, "binding");
        b(cVar);
    }

    @Override // f5.a
    public void b(f5.c cVar) {
        i.d(cVar, "binding");
        f fVar = this.f23195f;
        if (fVar == null) {
            return;
        }
        fVar.c(cVar.d());
    }

    @Override // f5.a
    public void c() {
        f fVar = this.f23195f;
        if (fVar == null) {
            return;
        }
        fVar.c(null);
    }

    @Override // x4.a.c
    public a.C0154a d() {
        f fVar = this.f23195f;
        i.b(fVar);
        return fVar.b();
    }

    @Override // f5.a
    public void e() {
        c();
    }

    @Override // e5.a
    public void f(a.b bVar) {
        i.d(bVar, "flutterPluginBinding");
        d.f(bVar.b(), this);
        this.f23195f = new f();
    }

    @Override // x4.a.c
    public void g(a.b bVar) {
        f fVar = this.f23195f;
        i.b(fVar);
        i.b(bVar);
        fVar.d(bVar);
    }

    @Override // e5.a
    public void i(a.b bVar) {
        i.d(bVar, "binding");
        d.f(bVar.b(), null);
        this.f23195f = null;
    }
}
