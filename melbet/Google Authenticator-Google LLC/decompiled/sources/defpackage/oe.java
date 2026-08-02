package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oe {
    public final Object a;
    public final Object b;

    public oe(Runnable runnable) {
        this.a = runnable;
        this.b = new kop(new nb(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, koi] */
    public final nu a() {
        return (nu) this.b.a();
    }

    public final void b(aer aerVar, ns nsVar) {
        aerVar.getClass();
        nsVar.getClass();
        final ael L = aerVar.L();
        if (L.c == aek.a) {
            return;
        }
        nr nrVar = new nr(nsVar, new ahg(nsVar, aerVar));
        nsVar.b.add(nrVar);
        nrVar.d(false);
        cfz cfzVar = a().b;
        if (((qt) cfzVar.a).b(nrVar)) {
            Object obj = cfzVar.d;
            if (nrVar.f != null) {
                throw new IllegalArgumentException(a.ab(nrVar, "Handler '", "' is already registered with a dispatcher"));
            }
            ahi ahiVar = (ahi) obj;
            ahiVar.b.addFirst(nrVar);
            nrVar.f = cfzVar;
            ahiVar.b();
        }
        final nv nvVar = new nv(nrVar, L, 0);
        L.a(nvVar);
        nsVar.d.add(new AutoCloseable() { // from class: nt
            @Override // java.lang.AutoCloseable
            public final void close() {
                ael.this.c(nvVar);
            }
        });
    }

    public final void c() {
        a().b();
    }

    public final void d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a().b.c(new ahm(onBackInvokedDispatcher, 0), 1);
        a().b.c(new ahm(onBackInvokedDispatcher, 1000000), 0);
    }

    public final cfz e() {
        return a().b;
    }

    public oe(ob obVar, ok okVar) {
        this.a = obVar;
        this.b = okVar;
    }

    public oe() {
        this(null);
    }
}
