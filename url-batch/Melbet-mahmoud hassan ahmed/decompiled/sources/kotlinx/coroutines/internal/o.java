package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class o<E> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18360a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public o(boolean z6) {
        this._cur = new p(8, z6);
    }

    public final boolean a(E e7) {
        while (true) {
            p pVar = (p) this._cur;
            int a7 = pVar.a(e7);
            if (a7 == 0) {
                return true;
            }
            if (a7 == 1) {
                androidx.work.impl.utils.futures.b.a(f18360a, this, pVar, pVar.i());
            } else if (a7 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            p pVar = (p) this._cur;
            if (pVar.d()) {
                return;
            } else {
                androidx.work.impl.utils.futures.b.a(f18360a, this, pVar, pVar.i());
            }
        }
    }

    public final int c() {
        return ((p) this._cur).f();
    }

    public final E d() {
        while (true) {
            p pVar = (p) this._cur;
            E e7 = (E) pVar.j();
            if (e7 != p.f18364h) {
                return e7;
            }
            androidx.work.impl.utils.futures.b.a(f18360a, this, pVar, pVar.i());
        }
    }
}
