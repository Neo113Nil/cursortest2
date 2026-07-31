package m2;

import r0.g3;
import r0.r3;
import t1.x;
import t1.z0;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    private a f18985a;

    /* renamed from: b, reason: collision with root package name */
    private n2.f f18986b;

    public interface a {
        void d();
    }

    protected final n2.f a() {
        return (n2.f) o2.a.h(this.f18986b);
    }

    public void b(a aVar, n2.f fVar) {
        this.f18985a = aVar;
        this.f18986b = fVar;
    }

    protected final void c() {
        a aVar = this.f18985a;
        if (aVar != null) {
            aVar.d();
        }
    }

    public boolean d() {
        return false;
    }

    public abstract void e(Object obj);

    public void f() {
        this.f18985a = null;
        this.f18986b = null;
    }

    public abstract d0 g(g3[] g3VarArr, z0 z0Var, x.b bVar, r3 r3Var);

    public void h(t0.e eVar) {
    }
}
