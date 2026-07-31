package c4;

import java.util.concurrent.atomic.AtomicReference;
import k4.f;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final v1<v> f1919a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<d0> f1920b = new AtomicReference<>();

    a0(v1<v> v1Var) {
        this.f1919a = v1Var;
    }

    public final void a(d0 d0Var) {
        this.f1920b.set(d0Var);
    }

    public final void b(f.b bVar, f.a aVar) {
        g1.a();
        d0 d0Var = this.f1920b.get();
        if (d0Var == null) {
            aVar.b(new e2(3, "No available form can be built.").a());
        } else {
            this.f1919a.zza().a(d0Var).zza().zza().f(bVar, aVar);
        }
    }

    public final boolean c() {
        return this.f1920b.get() != null;
    }
}
