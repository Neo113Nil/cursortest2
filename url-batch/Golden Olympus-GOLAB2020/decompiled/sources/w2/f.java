package w2;

import a2.AbstractC1241b;
import h2.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3349q;
import o2.C3345o;
import o2.InterfaceC3320b0;
import o2.InterfaceC3341m;
import o2.InterfaceC3343n;
import o2.a1;
import t2.AbstractC3429D;
import t2.G;

/* loaded from: classes3.dex */
public class f implements InterfaceC3341m, g, a1 {

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46642g = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "state$volatile");

    /* renamed from: b, reason: collision with root package name */
    private final CoroutineContext f46643b;

    /* renamed from: c, reason: collision with root package name */
    private List f46644c;

    /* renamed from: d, reason: collision with root package name */
    private Object f46645d;

    /* renamed from: e, reason: collision with root package name */
    private int f46646e;

    /* renamed from: f, reason: collision with root package name */
    private Object f46647f;
    private volatile /* synthetic */ Object state$volatile;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f46648a;

        /* renamed from: b, reason: collision with root package name */
        private final n f46649b;

        /* renamed from: c, reason: collision with root package name */
        private final n f46650c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f46651d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f46652e;

        /* renamed from: f, reason: collision with root package name */
        public final n f46653f;

        /* renamed from: g, reason: collision with root package name */
        public Object f46654g;

        /* renamed from: h, reason: collision with root package name */
        public int f46655h = -1;

        public a(Object obj, n nVar, n nVar2, Object obj2, Object obj3, n nVar3) {
            this.f46648a = obj;
            this.f46649b = nVar;
            this.f46650c = nVar2;
            this.f46651d = obj2;
            this.f46652e = obj3;
            this.f46653f = nVar3;
        }

        public final Function1 a(g gVar, Object obj) {
            n nVar = this.f46653f;
            if (nVar != null) {
                return (Function1) nVar.invoke(gVar, this.f46651d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f46654g;
            f fVar = f.this;
            if (obj instanceof AbstractC3429D) {
                ((AbstractC3429D) obj).s(this.f46655h, null, fVar.getContext());
                return;
            }
            InterfaceC3320b0 interfaceC3320b0 = obj instanceof InterfaceC3320b0 ? (InterfaceC3320b0) obj : null;
            if (interfaceC3320b0 != null) {
                interfaceC3320b0.dispose();
            }
        }

        public final Object c(Object obj, kotlin.coroutines.d dVar) {
            Object obj2 = this.f46652e;
            if (this.f46651d == h.i()) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1) obj2).invoke(dVar);
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2) obj2).invoke(obj, dVar);
        }

        public final Object d(Object obj) {
            return this.f46650c.invoke(this.f46648a, this.f46651d, obj);
        }

        public final boolean e(f fVar) {
            G g4;
            this.f46649b.invoke(this.f46648a, fVar, this.f46651d);
            Object obj = fVar.f46647f;
            g4 = h.f46665e;
            return obj == g4;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f46657l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f46658m;

        /* renamed from: o, reason: collision with root package name */
        int f46660o;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46658m = obj;
            this.f46660o |= Integer.MIN_VALUE;
            return f.this.o(this);
        }
    }

    public f(CoroutineContext coroutineContext) {
        G g4;
        G g5;
        this.f46643b = coroutineContext;
        g4 = h.f46662b;
        this.state$volatile = g4;
        this.f46644c = new ArrayList(2);
        this.f46646e = -1;
        g5 = h.f46665e;
        this.f46647f = g5;
    }

    private final void j(Object obj) {
        List list = this.f46644c;
        Intrinsics.checkNotNull(list);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f46648a == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    private final void k(a aVar) {
        G g4;
        G g5;
        List<a> list = this.f46644c;
        if (list == null) {
            return;
        }
        for (a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46642g;
        g4 = h.f46663c;
        atomicReferenceFieldUpdater.set(this, g4);
        g5 = h.f46665e;
        this.f46647f = g5;
        this.f46644c = null;
    }

    private final Object l(kotlin.coroutines.d dVar) {
        Object obj = f46642g.get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f46647f;
        k(aVar);
        return aVar.c(aVar.d(obj2), dVar);
    }

    static /* synthetic */ Object n(f fVar, kotlin.coroutines.d dVar) {
        return fVar.t() ? fVar.l(dVar) : fVar.o(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(kotlin.coroutines.d dVar) {
        b bVar;
        int i4;
        f fVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i5 = bVar.f46660o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.f46660o = i5 - Integer.MIN_VALUE;
                Object obj = bVar.f46658m;
                Object f4 = AbstractC1241b.f();
                i4 = bVar.f46660o;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    bVar.f46657l = this;
                    bVar.f46660o = 1;
                    if (z(bVar) != f4) {
                        fVar = this;
                    }
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return obj;
                }
                fVar = (f) bVar.f46657l;
                ResultKt.a(obj);
                bVar.f46657l = null;
                bVar.f46660o = 2;
                Object l4 = fVar.l(bVar);
                return l4 != f4 ? f4 : l4;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f46658m;
        Object f42 = AbstractC1241b.f();
        i4 = bVar.f46660o;
        if (i4 != 0) {
        }
        bVar.f46657l = null;
        bVar.f46660o = 2;
        Object l42 = fVar.l(bVar);
        if (l42 != f42) {
        }
    }

    private final a p(Object obj) {
        List list = this.f46644c;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f46648a == obj) {
                obj2 = next;
                break;
            }
        }
        a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final boolean t() {
        return f46642g.get(this) instanceof a;
    }

    public static /* synthetic */ void v(f fVar, a aVar, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        fVar.u(aVar, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(Object obj) {
        a p4 = p(obj);
        Intrinsics.checkNotNull(p4);
        p4.f46654g = null;
        p4.f46655h = -1;
        u(p4, true);
    }

    private final int y(Object obj, Object obj2) {
        boolean j4;
        G g4;
        G g5;
        G g6;
        G g7;
        while (true) {
            Object obj3 = f46642g.get(this);
            if (obj3 instanceof InterfaceC3343n) {
                a p4 = p(obj);
                if (p4 == null) {
                    continue;
                } else {
                    Function1 a4 = p4.a(this, obj2);
                    if (androidx.concurrent.futures.b.a(f46642g, this, obj3, p4)) {
                        this.f46647f = obj2;
                        j4 = h.j((InterfaceC3343n) obj3, a4);
                        if (j4) {
                            return 0;
                        }
                        g4 = h.f46665e;
                        this.f46647f = g4;
                        return 2;
                    }
                }
            } else {
                g5 = h.f46663c;
                if (Intrinsics.areEqual(obj3, g5) ? true : obj3 instanceof a) {
                    return 3;
                }
                g6 = h.f46664d;
                if (Intrinsics.areEqual(obj3, g6)) {
                    return 2;
                }
                g7 = h.f46662b;
                if (Intrinsics.areEqual(obj3, g7)) {
                    if (androidx.concurrent.futures.b.a(f46642g, this, obj3, CollectionsKt.listOf(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (androidx.concurrent.futures.b.a(f46642g, this, obj3, CollectionsKt.plus((Collection<? extends Object>) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r0 = r0.y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r0 != a2.AbstractC1241b.f()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        kotlin.coroutines.jvm.internal.h.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r0 != a2.AbstractC1241b.f()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        return kotlin.Unit.f41027a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object z(kotlin.coroutines.d dVar) {
        G g4;
        G g5;
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46642g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            g4 = h.f46662b;
            if (obj == g4) {
                if (androidx.concurrent.futures.b.a(f46642g, this, obj, c3345o)) {
                    AbstractC3349q.c(c3345o, this);
                    break;
                }
            } else if (obj instanceof List) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f46642g;
                g5 = h.f46662b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, obj, g5)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        w(it.next());
                    }
                }
            } else {
                if (!(obj instanceof a)) {
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                c3345o.p(Unit.f41027a, ((a) obj).a(this, this.f46647f));
            }
        }
    }

    @Override // o2.InterfaceC3341m
    public void a(Throwable th) {
        Object obj;
        G g4;
        G g5;
        G g6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46642g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            g4 = h.f46663c;
            if (obj == g4) {
                return;
            } else {
                g5 = h.f46664d;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, g5));
        List list = this.f46644c;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        g6 = h.f46665e;
        this.f46647f = g6;
        this.f46644c = null;
    }

    @Override // w2.g
    public boolean b(Object obj, Object obj2) {
        return y(obj, obj2) == 0;
    }

    @Override // w2.g
    public void c(InterfaceC3320b0 interfaceC3320b0) {
        this.f46645d = interfaceC3320b0;
    }

    @Override // o2.a1
    public void d(AbstractC3429D abstractC3429D, int i4) {
        this.f46645d = abstractC3429D;
        this.f46646e = i4;
    }

    @Override // w2.g
    public void e(Object obj) {
        this.f46647f = obj;
    }

    @Override // w2.g
    public CoroutineContext getContext() {
        return this.f46643b;
    }

    public Object m(kotlin.coroutines.d dVar) {
        return n(this, dVar);
    }

    public void r(InterfaceC3507a interfaceC3507a, Function1 function1) {
        v(this, new a(interfaceC3507a.b(), interfaceC3507a.a(), interfaceC3507a.d(), h.i(), function1, interfaceC3507a.c()), false, 1, null);
    }

    public void s(InterfaceC3509c interfaceC3509c, Function2 function2) {
        v(this, new a(interfaceC3509c.b(), interfaceC3509c.a(), interfaceC3509c.d(), null, function2, interfaceC3509c.c()), false, 1, null);
    }

    public final void u(a aVar, boolean z4) {
        if (f46642g.get(this) instanceof a) {
            return;
        }
        if (!z4) {
            j(aVar.f46648a);
        }
        if (!aVar.e(this)) {
            f46642g.set(this, aVar);
            return;
        }
        if (!z4) {
            List list = this.f46644c;
            Intrinsics.checkNotNull(list);
            list.add(aVar);
        }
        aVar.f46654g = this.f46645d;
        aVar.f46655h = this.f46646e;
        this.f46645d = null;
        this.f46646e = -1;
    }

    public final i x(Object obj, Object obj2) {
        i a4;
        a4 = h.a(y(obj, obj2));
        return a4;
    }
}
