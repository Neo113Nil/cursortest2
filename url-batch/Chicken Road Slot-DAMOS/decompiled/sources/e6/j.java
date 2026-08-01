package e6;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends h {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = h.f3947u;
        }
        if (!h.f3946t.i(this, null, obj)) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!h.f3946t.i(this, null, new b(th))) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean k(ListenableFuture listenableFuture) {
        b bVar;
        listenableFuture.getClass();
        Object obj = this.f3948d;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (h.f3946t.i(this, null, h.f(listenableFuture))) {
                    h.c(this);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, listenableFuture);
            if (h.f3946t.i(this, null, eVar)) {
                try {
                    listenableFuture.a(eVar, i.f3951d);
                    return true;
                } catch (Throwable th) {
                    try {
                        bVar = new b(th);
                    } catch (Throwable unused) {
                        bVar = b.f3928b;
                    }
                    h.f3946t.i(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f3948d;
        }
        if (obj instanceof a) {
            listenableFuture.cancel(((a) obj).f3926a);
        }
        return false;
    }
}
