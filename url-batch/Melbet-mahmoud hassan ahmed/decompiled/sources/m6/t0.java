package m6;

import v5.k;

/* loaded from: classes.dex */
public abstract class t0<T> extends kotlinx.coroutines.scheduling.i {

    /* renamed from: h, reason: collision with root package name */
    public int f19331h;

    public t0(int i7) {
        this.f19331h = i7;
    }

    public void b(Object obj, Throwable th) {
    }

    public abstract y5.d<T> c();

    public Throwable f(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar == null) {
            return null;
        }
        return yVar.f19365a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(Object obj) {
        return obj;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            v5.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.i.b(th);
        h0.a(c().getContext(), new o0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object l();

    @Override // java.lang.Runnable
    public final void run() {
        Object a7;
        Object a8;
        Object a9;
        if (p0.a()) {
            if (!(this.f19331h != -1)) {
                throw new AssertionError();
            }
        }
        kotlinx.coroutines.scheduling.j jVar = this.f18428g;
        try {
            kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) c();
            y5.d<T> dVar = fVar.f18333j;
            Object obj = fVar.f18335l;
            y5.g context = dVar.getContext();
            Object c7 = kotlinx.coroutines.internal.c0.c(context, obj);
            h2<?> e7 = c7 != kotlinx.coroutines.internal.c0.f18321a ? e0.e(dVar, context, c7) : null;
            try {
                y5.g context2 = dVar.getContext();
                Object l7 = l();
                Throwable f7 = f(l7);
                o1 o1Var = (f7 == null && u0.b(this.f19331h)) ? (o1) context2.get(o1.f19317c) : null;
                if (o1Var != null && !o1Var.b()) {
                    Throwable x6 = o1Var.x();
                    b(l7, x6);
                    k.a aVar = v5.k.f22832f;
                    if (p0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) {
                        x6 = kotlinx.coroutines.internal.x.j(x6, (kotlin.coroutines.jvm.internal.e) dVar);
                    }
                    a8 = v5.k.a(v5.l.a(x6));
                } else if (f7 != null) {
                    k.a aVar2 = v5.k.f22832f;
                    a8 = v5.k.a(v5.l.a(f7));
                } else {
                    T h7 = h(l7);
                    k.a aVar3 = v5.k.f22832f;
                    a8 = v5.k.a(h7);
                }
                dVar.resumeWith(a8);
                v5.q qVar = v5.q.f22838a;
                try {
                    k.a aVar4 = v5.k.f22832f;
                    jVar.u();
                    a9 = v5.k.a(qVar);
                } catch (Throwable th) {
                    k.a aVar5 = v5.k.f22832f;
                    a9 = v5.k.a(v5.l.a(th));
                }
                i(null, v5.k.b(a9));
            } finally {
                if (e7 == null || e7.y0()) {
                    kotlinx.coroutines.internal.c0.a(context, c7);
                }
            }
        } catch (Throwable th2) {
            try {
                k.a aVar6 = v5.k.f22832f;
                jVar.u();
                a7 = v5.k.a(v5.q.f22838a);
            } catch (Throwable th3) {
                k.a aVar7 = v5.k.f22832f;
                a7 = v5.k.a(v5.l.a(th3));
            }
            i(th2, v5.k.b(a7));
        }
    }
}
