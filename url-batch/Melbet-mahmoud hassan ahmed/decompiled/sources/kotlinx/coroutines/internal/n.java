package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class n {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f18355f = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f18356g = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_prev");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18357h = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends c<n> {

        /* renamed from: b, reason: collision with root package name */
        public final n f18358b;

        /* renamed from: c, reason: collision with root package name */
        public n f18359c;

        public a(n nVar) {
            this.f18358b = nVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(n nVar, Object obj) {
            boolean z6 = obj == null;
            n nVar2 = z6 ? this.f18358b : this.f18359c;
            if (nVar2 != null && androidx.work.impl.utils.futures.b.a(n.f18355f, nVar, this, nVar2) && z6) {
                n nVar3 = this.f18358b;
                n nVar4 = this.f18359c;
                kotlin.jvm.internal.i.b(nVar4);
                nVar3.n(nVar4);
            }
        }
    }

    public static final class b extends u {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (androidx.work.impl.utils.futures.b.a(kotlinx.coroutines.internal.n.f18355f, r3, r2, ((kotlinx.coroutines.internal.v) r4).f18379a) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final n l(u uVar) {
        while (true) {
            n nVar = (n) this._prev;
            n nVar2 = nVar;
            while (true) {
                n nVar3 = null;
                while (true) {
                    Object obj = nVar2._next;
                    if (obj == this) {
                        if (nVar == nVar2 || androidx.work.impl.utils.futures.b.a(f18356g, this, nVar, nVar2)) {
                            return nVar2;
                        }
                    } else {
                        if (t()) {
                            return null;
                        }
                        if (obj == uVar) {
                            return nVar2;
                        }
                        if (obj instanceof u) {
                            if (uVar != null && uVar.b((u) obj)) {
                                return null;
                            }
                            ((u) obj).c(nVar2);
                        } else if (!(obj instanceof v)) {
                            nVar3 = nVar2;
                            nVar2 = (n) obj;
                        } else {
                            if (nVar3 != null) {
                                break;
                            }
                            nVar2 = (n) nVar2._prev;
                        }
                    }
                }
                nVar2 = nVar3;
            }
        }
    }

    private final n m(n nVar) {
        while (nVar.t()) {
            nVar = (n) nVar._prev;
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(n nVar) {
        n nVar2;
        do {
            nVar2 = (n) nVar._prev;
            if (o() != nVar) {
                return;
            }
        } while (!androidx.work.impl.utils.futures.b.a(f18356g, nVar, nVar2, this));
        if (t()) {
            nVar.l(null);
        }
    }

    private final v w() {
        v vVar = (v) this._removedRef;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this);
        f18357h.lazySet(this, vVar2);
        return vVar2;
    }

    public final boolean j(n nVar, n nVar2) {
        f18356g.lazySet(nVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18355f;
        atomicReferenceFieldUpdater.lazySet(nVar, nVar2);
        if (!androidx.work.impl.utils.futures.b.a(atomicReferenceFieldUpdater, this, nVar2, nVar)) {
            return false;
        }
        nVar.n(nVar2);
        return true;
    }

    public final boolean k(n nVar) {
        f18356g.lazySet(nVar, this);
        f18355f.lazySet(nVar, this);
        while (o() == this) {
            if (androidx.work.impl.utils.futures.b.a(f18355f, this, this, nVar)) {
                nVar.n(this);
                return true;
            }
        }
        return false;
    }

    public final Object o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof u)) {
                return obj;
            }
            ((u) obj).c(this);
        }
    }

    public final n p() {
        return m.b(o());
    }

    public final n q() {
        n l7 = l(null);
        return l7 == null ? m((n) this._prev) : l7;
    }

    public final void r() {
        ((v) o()).f18379a.s();
    }

    public final void s() {
        n nVar = this;
        while (true) {
            Object o7 = nVar.o();
            if (!(o7 instanceof v)) {
                nVar.l(null);
                return;
            }
            nVar = ((v) o7).f18379a;
        }
    }

    public boolean t() {
        return o() instanceof v;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public boolean u() {
        return v() == null;
    }

    public final n v() {
        Object o7;
        n nVar;
        do {
            o7 = o();
            if (o7 instanceof v) {
                return ((v) o7).f18379a;
            }
            if (o7 == this) {
                return (n) o7;
            }
            nVar = (n) o7;
        } while (!androidx.work.impl.utils.futures.b.a(f18355f, this, o7, nVar.w()));
        nVar.l(null);
        return null;
    }

    public final int x(n nVar, n nVar2, a aVar) {
        f18356g.lazySet(nVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18355f;
        atomicReferenceFieldUpdater.lazySet(nVar, nVar2);
        aVar.f18359c = nVar2;
        if (androidx.work.impl.utils.futures.b.a(atomicReferenceFieldUpdater, this, nVar2, aVar)) {
            return aVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }
}
