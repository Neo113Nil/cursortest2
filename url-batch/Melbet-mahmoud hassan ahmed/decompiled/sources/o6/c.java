package o6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.y;
import m6.p0;
import m6.q0;
import o6.i;

/* loaded from: classes.dex */
public abstract class c<E> implements t<E> {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19905d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: b, reason: collision with root package name */
    protected final f6.l<E, v5.q> f19906b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.internal.l f19907c = new kotlinx.coroutines.internal.l();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class a<E> extends s {

        /* renamed from: i, reason: collision with root package name */
        public final E f19908i;

        public a(E e7) {
            this.f19908i = e7;
        }

        @Override // o6.s
        public y A(n.b bVar) {
            return m6.m.f19306a;
        }

        @Override // kotlinx.coroutines.internal.n
        public String toString() {
            return "SendBuffered@" + q0.b(this) + '(' + this.f19908i + ')';
        }

        @Override // o6.s
        public void y() {
        }

        @Override // o6.s
        public Object z() {
            return this.f19908i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(f6.l<? super E, v5.q> lVar) {
        this.f19906b = lVar;
    }

    private final int b() {
        kotlinx.coroutines.internal.l lVar = this.f19907c;
        int i7 = 0;
        for (kotlinx.coroutines.internal.n nVar = (kotlinx.coroutines.internal.n) lVar.o(); !kotlin.jvm.internal.i.a(nVar, lVar); nVar = nVar.p()) {
            if (nVar instanceof kotlinx.coroutines.internal.n) {
                i7++;
            }
        }
        return i7;
    }

    private final String f() {
        kotlinx.coroutines.internal.n p7 = this.f19907c.p();
        if (p7 == this.f19907c) {
            return "EmptyQueue";
        }
        String nVar = p7 instanceof j ? p7.toString() : p7 instanceof o ? "ReceiveQueued" : p7 instanceof s ? "SendQueued" : kotlin.jvm.internal.i.i("UNEXPECTED:", p7);
        kotlinx.coroutines.internal.n q7 = this.f19907c.q();
        if (q7 == p7) {
            return nVar;
        }
        String str = nVar + ",queueSize=" + b();
        if (!(q7 instanceof j)) {
            return str;
        }
        return str + ",closedForSend=" + q7;
    }

    private final void g(j<?> jVar) {
        Object b7 = kotlinx.coroutines.internal.k.b(null, 1, null);
        while (true) {
            kotlinx.coroutines.internal.n q7 = jVar.q();
            o oVar = q7 instanceof o ? (o) q7 : null;
            if (oVar == null) {
                break;
            } else if (oVar.u()) {
                b7 = kotlinx.coroutines.internal.k.c(b7, oVar);
            } else {
                oVar.r();
            }
        }
        if (b7 != null) {
            if (b7 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) b7;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i7 = size - 1;
                        ((o) arrayList.get(size)).z(jVar);
                        if (i7 < 0) {
                            break;
                        } else {
                            size = i7;
                        }
                    }
                }
            } else {
                ((o) b7).z(jVar);
            }
        }
        j(jVar);
    }

    private final Throwable h(j<?> jVar) {
        g(jVar);
        return jVar.F();
    }

    @Override // o6.t
    public final Object a(E e7) {
        i.b bVar;
        j<?> jVar;
        Object i7 = i(e7);
        if (i7 == b.f19900b) {
            return i.f19922a.c(v5.q.f22838a);
        }
        if (i7 == b.f19901c) {
            jVar = d();
            if (jVar == null) {
                return i.f19922a.b();
            }
            bVar = i.f19922a;
        } else {
            if (!(i7 instanceof j)) {
                throw new IllegalStateException(kotlin.jvm.internal.i.i("trySend returned ", i7).toString());
            }
            bVar = i.f19922a;
            jVar = (j) i7;
        }
        return bVar.a(h(jVar));
    }

    protected String c() {
        return "";
    }

    protected final j<?> d() {
        kotlinx.coroutines.internal.n q7 = this.f19907c.q();
        j<?> jVar = q7 instanceof j ? (j) q7 : null;
        if (jVar == null) {
            return null;
        }
        g(jVar);
        return jVar;
    }

    protected final kotlinx.coroutines.internal.l e() {
        return this.f19907c;
    }

    protected Object i(E e7) {
        q<E> l7;
        y f7;
        do {
            l7 = l();
            if (l7 == null) {
                return b.f19901c;
            }
            f7 = l7.f(e7, null);
        } while (f7 == null);
        if (p0.a()) {
            if (!(f7 == m6.m.f19306a)) {
                throw new AssertionError();
            }
        }
        l7.a(e7);
        return l7.e();
    }

    protected void j(kotlinx.coroutines.internal.n nVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final q<?> k(E e7) {
        kotlinx.coroutines.internal.n q7;
        kotlinx.coroutines.internal.l lVar = this.f19907c;
        a aVar = new a(e7);
        do {
            q7 = lVar.q();
            if (q7 instanceof q) {
                return (q) q7;
            }
        } while (!q7.j(aVar, lVar));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.n] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    protected q<E> l() {
        ?? r12;
        kotlinx.coroutines.internal.n v6;
        kotlinx.coroutines.internal.l lVar = this.f19907c;
        while (true) {
            r12 = (kotlinx.coroutines.internal.n) lVar.o();
            if (r12 != lVar && (r12 instanceof q)) {
                if (((((q) r12) instanceof j) && !r12.t()) || (v6 = r12.v()) == null) {
                    break;
                }
                v6.s();
            }
        }
        r12 = 0;
        return (q) r12;
    }

    protected final s m() {
        kotlinx.coroutines.internal.n nVar;
        kotlinx.coroutines.internal.n v6;
        kotlinx.coroutines.internal.l lVar = this.f19907c;
        while (true) {
            nVar = (kotlinx.coroutines.internal.n) lVar.o();
            if (nVar != lVar && (nVar instanceof s)) {
                if (((((s) nVar) instanceof j) && !nVar.t()) || (v6 = nVar.v()) == null) {
                    break;
                }
                v6.s();
            }
        }
        nVar = null;
        return (s) nVar;
    }

    public String toString() {
        return q0.a(this) + '@' + q0.b(this) + '{' + f() + '}' + c();
    }
}
