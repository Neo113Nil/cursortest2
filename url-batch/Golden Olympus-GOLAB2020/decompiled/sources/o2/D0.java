package o2;

import W1.AbstractC1233c;
import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o2.InterfaceC3353s0;
import o2.InterfaceC3359v0;
import t2.AbstractC3445p;
import t2.r;
import w2.C3508b;
import w2.InterfaceC3507a;
import w2.InterfaceC3509c;

/* loaded from: classes3.dex */
public class D0 implements InterfaceC3359v0, InterfaceC3358v, L0 {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41966b = AtomicReferenceFieldUpdater.newUpdater(D0.class, Object.class, "_state$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41967c = AtomicReferenceFieldUpdater.newUpdater(D0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    private static final class a extends C3345o {

        /* renamed from: j, reason: collision with root package name */
        private final D0 f41968j;

        public a(kotlin.coroutines.d dVar, D0 d02) {
            super(dVar, 1);
            this.f41968j = d02;
        }

        @Override // o2.C3345o
        protected String K() {
            return "AwaitContinuation";
        }

        @Override // o2.C3345o
        public Throwable w(InterfaceC3359v0 interfaceC3359v0) {
            Throwable e4;
            Object c02 = this.f41968j.c0();
            return (!(c02 instanceof c) || (e4 = ((c) c02).e()) == null) ? c02 instanceof C3308B ? ((C3308B) c02).f41962a : interfaceC3359v0.getCancellationException() : e4;
        }
    }

    private static final class b extends C0 {

        /* renamed from: f, reason: collision with root package name */
        private final D0 f41969f;

        /* renamed from: g, reason: collision with root package name */
        private final c f41970g;

        /* renamed from: h, reason: collision with root package name */
        private final C3356u f41971h;

        /* renamed from: i, reason: collision with root package name */
        private final Object f41972i;

        public b(D0 d02, c cVar, C3356u c3356u, Object obj) {
            this.f41969f = d02;
            this.f41970g = cVar;
            this.f41971h = c3356u;
            this.f41972i = obj;
        }

        @Override // o2.InterfaceC3353s0
        public void a(Throwable th) {
            this.f41969f.P(this.f41970g, this.f41971h, this.f41972i);
        }
    }

    private static final class c implements InterfaceC3350q0 {

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f41973c = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f41974d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f41975e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: b, reason: collision with root package name */
        private final I0 f41976b;

        public c(I0 i02, boolean z4, Throwable th) {
            this.f41976b = i02;
            this._isCompleting$volatile = z4 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        private final ArrayList b() {
            return new ArrayList(4);
        }

        private final Object d() {
            return f41975e.get(this);
        }

        private final void n(Object obj) {
            f41975e.set(this, obj);
        }

        public final void a(Throwable th) {
            Throwable e4 = e();
            if (e4 == null) {
                o(th);
                return;
            }
            if (th == e4) {
                return;
            }
            Object d4 = d();
            if (d4 == null) {
                n(th);
                return;
            }
            if (d4 instanceof Throwable) {
                if (th == d4) {
                    return;
                }
                ArrayList b4 = b();
                b4.add(d4);
                b4.add(th);
                n(b4);
                return;
            }
            if (d4 instanceof ArrayList) {
                ((ArrayList) d4).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + d4).toString());
        }

        @Override // o2.InterfaceC3350q0
        public I0 c() {
            return this.f41976b;
        }

        public final Throwable e() {
            return (Throwable) f41974d.get(this);
        }

        public final boolean i() {
            return e() != null;
        }

        @Override // o2.InterfaceC3350q0
        public boolean isActive() {
            return e() == null;
        }

        public final boolean j() {
            return f41973c.get(this) != 0;
        }

        public final boolean k() {
            t2.G g4;
            Object d4 = d();
            g4 = E0.f41995e;
            return d4 == g4;
        }

        public final List l(Throwable th) {
            ArrayList arrayList;
            t2.G g4;
            Object d4 = d();
            if (d4 == null) {
                arrayList = b();
            } else if (d4 instanceof Throwable) {
                ArrayList b4 = b();
                b4.add(d4);
                arrayList = b4;
            } else {
                if (!(d4 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + d4).toString());
                }
                arrayList = (ArrayList) d4;
            }
            Throwable e4 = e();
            if (e4 != null) {
                arrayList.add(0, e4);
            }
            if (th != null && !Intrinsics.areEqual(th, e4)) {
                arrayList.add(th);
            }
            g4 = E0.f41995e;
            n(g4);
            return arrayList;
        }

        public final void m(boolean z4) {
            f41973c.set(this, z4 ? 1 : 0);
        }

        public final void o(Throwable th) {
            f41974d.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + i() + ", completing=" + j() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + c() + ']';
        }
    }

    private final class d extends C0 {

        /* renamed from: f, reason: collision with root package name */
        private final w2.g f41977f;

        public d(w2.g gVar) {
            this.f41977f = gVar;
        }

        @Override // o2.InterfaceC3353s0
        public void a(Throwable th) {
            Object c02 = D0.this.c0();
            if (!(c02 instanceof C3308B)) {
                c02 = E0.h(c02);
            }
            this.f41977f.b(D0.this, c02);
        }
    }

    private final class e extends C0 {

        /* renamed from: f, reason: collision with root package name */
        private final w2.g f41979f;

        public e(w2.g gVar) {
            this.f41979f = gVar;
        }

        @Override // o2.InterfaceC3353s0
        public void a(Throwable th) {
            this.f41979f.b(D0.this, Unit.f41027a);
        }
    }

    public static final class f extends r.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ D0 f41981d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f41982e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(t2.r rVar, D0 d02, Object obj) {
            super(rVar);
            this.f41981d = d02;
            this.f41982e = obj;
        }

        @Override // t2.AbstractC3431b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object e(t2.r rVar) {
            if (this.f41981d.c0() == this.f41982e) {
                return null;
            }
            return t2.q.a();
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* renamed from: m, reason: collision with root package name */
        Object f41983m;

        /* renamed from: n, reason: collision with root package name */
        Object f41984n;

        /* renamed from: o, reason: collision with root package name */
        int f41985o;

        /* renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f41986p;

        g(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.sequences.j jVar, kotlin.coroutines.d dVar) {
            return ((g) create(jVar, dVar)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            g gVar = D0.this.new g(dVar);
            gVar.f41986p = obj;
            return gVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
        
            if (r4.a(r6, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        
            if (r6.a(r1, r5) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006b -> B:6:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007e -> B:6:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            I0 c4;
            AbstractC3445p abstractC3445p;
            t2.r rVar;
            kotlin.sequences.j jVar;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f41985o;
            if (i4 == 0) {
                ResultKt.a(obj);
                kotlin.sequences.j jVar2 = (kotlin.sequences.j) this.f41986p;
                Object c02 = D0.this.c0();
                if (c02 instanceof C3356u) {
                    InterfaceC3358v interfaceC3358v = ((C3356u) c02).f42103f;
                    this.f41985o = 1;
                } else if ((c02 instanceof InterfaceC3350q0) && (c4 = ((InterfaceC3350q0) c02).c()) != null) {
                    Object j4 = c4.j();
                    Intrinsics.checkNotNull(j4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    t2.r rVar2 = (t2.r) j4;
                    abstractC3445p = c4;
                    rVar = rVar2;
                    jVar = jVar2;
                    if (!Intrinsics.areEqual(rVar, abstractC3445p)) {
                    }
                }
            } else if (i4 == 1) {
                ResultKt.a(obj);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (t2.r) this.f41984n;
                abstractC3445p = (AbstractC3445p) this.f41983m;
                jVar = (kotlin.sequences.j) this.f41986p;
                ResultKt.a(obj);
                rVar = rVar.k();
                if (!Intrinsics.areEqual(rVar, abstractC3445p)) {
                    if (rVar instanceof C3356u) {
                        InterfaceC3358v interfaceC3358v2 = ((C3356u) rVar).f42103f;
                        this.f41986p = jVar;
                        this.f41983m = abstractC3445p;
                        this.f41984n = rVar;
                        this.f41985o = 2;
                    }
                    rVar = rVar.k();
                    if (!Intrinsics.areEqual(rVar, abstractC3445p)) {
                    }
                }
            }
            return Unit.f41027a;
        }
    }

    /* synthetic */ class h extends kotlin.jvm.internal.p implements h2.n {

        /* renamed from: b, reason: collision with root package name */
        public static final h f41988b = new h();

        h() {
            super(3, D0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(D0 d02, w2.g gVar, Object obj) {
            d02.v0(gVar, obj);
        }

        @Override // h2.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((D0) obj, (w2.g) obj2, obj3);
            return Unit.f41027a;
        }
    }

    /* synthetic */ class i extends kotlin.jvm.internal.p implements h2.n {

        /* renamed from: b, reason: collision with root package name */
        public static final i f41989b = new i();

        i() {
            super(3, D0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // h2.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D0 d02, Object obj, Object obj2) {
            return d02.u0(obj, obj2);
        }
    }

    /* synthetic */ class j extends kotlin.jvm.internal.p implements h2.n {

        /* renamed from: b, reason: collision with root package name */
        public static final j f41990b = new j();

        j() {
            super(3, D0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(D0 d02, w2.g gVar, Object obj) {
            d02.B0(gVar, obj);
        }

        @Override // h2.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((D0) obj, (w2.g) obj2, obj3);
            return Unit.f41027a;
        }
    }

    public D0(boolean z4) {
        this._state$volatile = z4 ? E0.f41997g : E0.f41996f;
    }

    private final boolean A(Object obj, I0 i02, C0 c02) {
        int t4;
        f fVar = new f(c02, this, obj);
        do {
            t4 = i02.l().t(c02, i02, fVar);
            if (t4 == 1) {
                return true;
            }
        } while (t4 != 2);
        return false;
    }

    private final void A0(C0 c02) {
        c02.f(new I0());
        androidx.concurrent.futures.b.a(f41966b, this, c02, c02.k());
    }

    private final void B(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                AbstractC1233c.a(th, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(w2.g gVar, Object obj) {
        if (k0()) {
            gVar.c(B0.l(this, false, false, new e(gVar), 3, null));
        } else {
            gVar.e(Unit.f41027a);
        }
    }

    private final Object E(kotlin.coroutines.d dVar) {
        a aVar = new a(AbstractC1241b.c(dVar), this);
        aVar.E();
        AbstractC3349q.a(aVar, B0.l(this, false, false, new M0(aVar), 3, null));
        Object y4 = aVar.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    private final int E0(Object obj) {
        C3326e0 c3326e0;
        if (!(obj instanceof C3326e0)) {
            if (!(obj instanceof C3348p0)) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f41966b, this, obj, ((C3348p0) obj).c())) {
                return -1;
            }
            y0();
            return 1;
        }
        if (((C3326e0) obj).isActive()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41966b;
        c3326e0 = E0.f41997g;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, c3326e0)) {
            return -1;
        }
        y0();
        return 1;
    }

    private final String F0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC3350q0 ? ((InterfaceC3350q0) obj).isActive() ? "Active" : "New" : obj instanceof C3308B ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.i() ? "Cancelling" : cVar.j() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException H0(D0 d02, Throwable th, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i4 & 1) != 0) {
            str = null;
        }
        return d02.G0(th, str);
    }

    private final Object I(Object obj) {
        t2.G g4;
        Object L02;
        t2.G g5;
        do {
            Object c02 = c0();
            if (!(c02 instanceof InterfaceC3350q0) || ((c02 instanceof c) && ((c) c02).j())) {
                g4 = E0.f41991a;
                return g4;
            }
            L02 = L0(c02, new C3308B(R(obj), false, 2, null));
            g5 = E0.f41993c;
        } while (L02 == g5);
        return L02;
    }

    private final boolean J0(InterfaceC3350q0 interfaceC3350q0, Object obj) {
        if (!androidx.concurrent.futures.b.a(f41966b, this, interfaceC3350q0, E0.g(obj))) {
            return false;
        }
        w0(null);
        x0(obj);
        O(interfaceC3350q0, obj);
        return true;
    }

    private final boolean K(Throwable th) {
        if (j0()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        InterfaceC3354t b02 = b0();
        return (b02 == null || b02 == J0.f42008b) ? z4 : b02.b(th) || z4;
    }

    private final boolean K0(InterfaceC3350q0 interfaceC3350q0, Throwable th) {
        I0 a02 = a0(interfaceC3350q0);
        if (a02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f41966b, this, interfaceC3350q0, new c(a02, false, th))) {
            return false;
        }
        s0(a02, th);
        return true;
    }

    private final Object L0(Object obj, Object obj2) {
        t2.G g4;
        t2.G g5;
        if (!(obj instanceof InterfaceC3350q0)) {
            g5 = E0.f41991a;
            return g5;
        }
        if ((!(obj instanceof C3326e0) && !(obj instanceof C0)) || (obj instanceof C3356u) || (obj2 instanceof C3308B)) {
            return M0((InterfaceC3350q0) obj, obj2);
        }
        if (J0((InterfaceC3350q0) obj, obj2)) {
            return obj2;
        }
        g4 = E0.f41993c;
        return g4;
    }

    private final Object M0(InterfaceC3350q0 interfaceC3350q0, Object obj) {
        t2.G g4;
        t2.G g5;
        t2.G g6;
        I0 a02 = a0(interfaceC3350q0);
        if (a02 == null) {
            g6 = E0.f41993c;
            return g6;
        }
        c cVar = interfaceC3350q0 instanceof c ? (c) interfaceC3350q0 : null;
        if (cVar == null) {
            cVar = new c(a02, false, null);
        }
        kotlin.jvm.internal.G g7 = new kotlin.jvm.internal.G();
        synchronized (cVar) {
            if (cVar.j()) {
                g5 = E0.f41991a;
                return g5;
            }
            cVar.m(true);
            if (cVar != interfaceC3350q0 && !androidx.concurrent.futures.b.a(f41966b, this, interfaceC3350q0, cVar)) {
                g4 = E0.f41993c;
                return g4;
            }
            boolean i4 = cVar.i();
            C3308B c3308b = obj instanceof C3308B ? (C3308B) obj : null;
            if (c3308b != null) {
                cVar.a(c3308b.f41962a);
            }
            Throwable e4 = i4 ? null : cVar.e();
            g7.f41132b = e4;
            Unit unit = Unit.f41027a;
            if (e4 != null) {
                s0(a02, e4);
            }
            C3356u T3 = T(interfaceC3350q0);
            return (T3 == null || !N0(cVar, T3, obj)) ? S(cVar, obj) : E0.f41992b;
        }
    }

    private final boolean N0(c cVar, C3356u c3356u, Object obj) {
        while (B0.l(c3356u.f42103f, false, false, new b(this, cVar, c3356u, obj), 1, null) == J0.f42008b) {
            c3356u = r0(c3356u);
            if (c3356u == null) {
                return false;
            }
        }
        return true;
    }

    private final void O(InterfaceC3350q0 interfaceC3350q0, Object obj) {
        InterfaceC3354t b02 = b0();
        if (b02 != null) {
            b02.dispose();
            D0(J0.f42008b);
        }
        C3308B c3308b = obj instanceof C3308B ? (C3308B) obj : null;
        Throwable th = c3308b != null ? c3308b.f41962a : null;
        if (!(interfaceC3350q0 instanceof C0)) {
            I0 c4 = interfaceC3350q0.c();
            if (c4 != null) {
                t0(c4, th);
                return;
            }
            return;
        }
        try {
            ((C0) interfaceC3350q0).a(th);
        } catch (Throwable th2) {
            g0(new C3310D("Exception in completion handler " + interfaceC3350q0 + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(c cVar, C3356u c3356u, Object obj) {
        C3356u r02 = r0(c3356u);
        if (r02 == null || !N0(cVar, r02, obj)) {
            C(S(cVar, obj));
        }
    }

    private final Throwable R(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C3361w0(L(), null, this) : th;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((L0) obj).N();
    }

    private final Object S(c cVar, Object obj) {
        boolean i4;
        Throwable W3;
        C3308B c3308b = obj instanceof C3308B ? (C3308B) obj : null;
        Throwable th = c3308b != null ? c3308b.f41962a : null;
        synchronized (cVar) {
            i4 = cVar.i();
            List l4 = cVar.l(th);
            W3 = W(cVar, l4);
            if (W3 != null) {
                B(W3, l4);
            }
        }
        if (W3 != null && W3 != th) {
            obj = new C3308B(W3, false, 2, null);
        }
        if (W3 != null && (K(W3) || f0(W3))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C3308B) obj).c();
        }
        if (!i4) {
            w0(W3);
        }
        x0(obj);
        androidx.concurrent.futures.b.a(f41966b, this, cVar, E0.g(obj));
        O(cVar, obj);
        return obj;
    }

    private final C3356u T(InterfaceC3350q0 interfaceC3350q0) {
        C3356u c3356u = interfaceC3350q0 instanceof C3356u ? (C3356u) interfaceC3350q0 : null;
        if (c3356u != null) {
            return c3356u;
        }
        I0 c4 = interfaceC3350q0.c();
        if (c4 != null) {
            return r0(c4);
        }
        return null;
    }

    private final Throwable V(Object obj) {
        C3308B c3308b = obj instanceof C3308B ? (C3308B) obj : null;
        if (c3308b != null) {
            return c3308b.f41962a;
        }
        return null;
    }

    private final Throwable W(c cVar, List list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.i()) {
                return new C3361w0(L(), null, this);
            }
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof U0) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof U0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final I0 a0(InterfaceC3350q0 interfaceC3350q0) {
        I0 c4 = interfaceC3350q0.c();
        if (c4 != null) {
            return c4;
        }
        if (interfaceC3350q0 instanceof C3326e0) {
            return new I0();
        }
        if (interfaceC3350q0 instanceof C0) {
            A0((C0) interfaceC3350q0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC3350q0).toString());
    }

    private final boolean k0() {
        Object c02;
        do {
            c02 = c0();
            if (!(c02 instanceof InterfaceC3350q0)) {
                return false;
            }
        } while (E0(c02) < 0);
        return true;
    }

    private final Object l0(kotlin.coroutines.d dVar) {
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        AbstractC3349q.a(c3345o, B0.l(this, false, false, new N0(c3345o), 3, null));
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == AbstractC1241b.f() ? y4 : Unit.f41027a;
    }

    private final Object m0(Object obj) {
        t2.G g4;
        t2.G g5;
        t2.G g6;
        t2.G g7;
        t2.G g8;
        t2.G g9;
        Throwable th = null;
        while (true) {
            Object c02 = c0();
            if (c02 instanceof c) {
                synchronized (c02) {
                    if (((c) c02).k()) {
                        g5 = E0.f41994d;
                        return g5;
                    }
                    boolean i4 = ((c) c02).i();
                    if (obj != null || !i4) {
                        if (th == null) {
                            th = R(obj);
                        }
                        ((c) c02).a(th);
                    }
                    Throwable e4 = i4 ? null : ((c) c02).e();
                    if (e4 != null) {
                        s0(((c) c02).c(), e4);
                    }
                    g4 = E0.f41991a;
                    return g4;
                }
            }
            if (!(c02 instanceof InterfaceC3350q0)) {
                g6 = E0.f41994d;
                return g6;
            }
            if (th == null) {
                th = R(obj);
            }
            InterfaceC3350q0 interfaceC3350q0 = (InterfaceC3350q0) c02;
            if (!interfaceC3350q0.isActive()) {
                Object L02 = L0(c02, new C3308B(th, false, 2, null));
                g8 = E0.f41991a;
                if (L02 == g8) {
                    throw new IllegalStateException(("Cannot happen in " + c02).toString());
                }
                g9 = E0.f41993c;
                if (L02 != g9) {
                    return L02;
                }
            } else if (K0(interfaceC3350q0, th)) {
                g7 = E0.f41991a;
                return g7;
            }
        }
    }

    private final C0 p0(InterfaceC3353s0 interfaceC3353s0, boolean z4) {
        C0 c02;
        if (z4) {
            c02 = interfaceC3353s0 instanceof AbstractC3363x0 ? (AbstractC3363x0) interfaceC3353s0 : null;
            if (c02 == null) {
                c02 = new C3355t0(interfaceC3353s0);
            }
        } else {
            c02 = interfaceC3353s0 instanceof C0 ? (C0) interfaceC3353s0 : null;
            if (c02 == null) {
                c02 = new C3357u0(interfaceC3353s0);
            }
        }
        c02.v(this);
        return c02;
    }

    private final C3356u r0(t2.r rVar) {
        while (rVar.p()) {
            rVar = rVar.l();
        }
        while (true) {
            rVar = rVar.k();
            if (!rVar.p()) {
                if (rVar instanceof C3356u) {
                    return (C3356u) rVar;
                }
                if (rVar instanceof I0) {
                    return null;
                }
            }
        }
    }

    private final void s0(I0 i02, Throwable th) {
        w0(th);
        Object j4 = i02.j();
        Intrinsics.checkNotNull(j4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C3310D c3310d = null;
        for (t2.r rVar = (t2.r) j4; !Intrinsics.areEqual(rVar, i02); rVar = rVar.k()) {
            if (rVar instanceof AbstractC3363x0) {
                C0 c02 = (C0) rVar;
                try {
                    c02.a(th);
                } catch (Throwable th2) {
                    if (c3310d != null) {
                        AbstractC1233c.a(c3310d, th2);
                    } else {
                        c3310d = new C3310D("Exception in completion handler " + c02 + " for " + this, th2);
                        Unit unit = Unit.f41027a;
                    }
                }
            }
        }
        if (c3310d != null) {
            g0(c3310d);
        }
        K(th);
    }

    private final void t0(I0 i02, Throwable th) {
        Object j4 = i02.j();
        Intrinsics.checkNotNull(j4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C3310D c3310d = null;
        for (t2.r rVar = (t2.r) j4; !Intrinsics.areEqual(rVar, i02); rVar = rVar.k()) {
            if (rVar instanceof C0) {
                C0 c02 = (C0) rVar;
                try {
                    c02.a(th);
                } catch (Throwable th2) {
                    if (c3310d != null) {
                        AbstractC1233c.a(c3310d, th2);
                    } else {
                        c3310d = new C3310D("Exception in completion handler " + c02 + " for " + this, th2);
                        Unit unit = Unit.f41027a;
                    }
                }
            }
        }
        if (c3310d != null) {
            g0(c3310d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u0(Object obj, Object obj2) {
        if (obj2 instanceof C3308B) {
            throw ((C3308B) obj2).f41962a;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(w2.g gVar, Object obj) {
        Object c02;
        do {
            c02 = c0();
            if (!(c02 instanceof InterfaceC3350q0)) {
                if (!(c02 instanceof C3308B)) {
                    c02 = E0.h(c02);
                }
                gVar.e(c02);
                return;
            }
        } while (E0(c02) < 0);
        gVar.c(B0.l(this, false, false, new d(gVar), 3, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o2.p0] */
    private final void z0(C3326e0 c3326e0) {
        I0 i02 = new I0();
        if (!c3326e0.isActive()) {
            i02 = new C3348p0(i02);
        }
        androidx.concurrent.futures.b.a(f41966b, this, c3326e0, i02);
    }

    public final void C0(C0 c02) {
        Object c03;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3326e0 c3326e0;
        do {
            c03 = c0();
            if (!(c03 instanceof C0)) {
                if (!(c03 instanceof InterfaceC3350q0) || ((InterfaceC3350q0) c03).c() == null) {
                    return;
                }
                c02.q();
                return;
            }
            if (c03 != c02) {
                return;
            }
            atomicReferenceFieldUpdater = f41966b;
            c3326e0 = E0.f41997g;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c03, c3326e0));
    }

    protected final Object D(kotlin.coroutines.d dVar) {
        Object c02;
        do {
            c02 = c0();
            if (!(c02 instanceof InterfaceC3350q0)) {
                if (c02 instanceof C3308B) {
                    throw ((C3308B) c02).f41962a;
                }
                return E0.h(c02);
            }
        } while (E0(c02) < 0);
        return E(dVar);
    }

    public final void D0(InterfaceC3354t interfaceC3354t) {
        f41967c.set(this, interfaceC3354t);
    }

    public final boolean F(Throwable th) {
        return G(th);
    }

    public final boolean G(Object obj) {
        Object obj2;
        t2.G g4;
        t2.G g5;
        t2.G g6;
        obj2 = E0.f41991a;
        if (Z() && (obj2 = I(obj)) == E0.f41992b) {
            return true;
        }
        g4 = E0.f41991a;
        if (obj2 == g4) {
            obj2 = m0(obj);
        }
        g5 = E0.f41991a;
        if (obj2 == g5 || obj2 == E0.f41992b) {
            return true;
        }
        g6 = E0.f41994d;
        if (obj2 == g6) {
            return false;
        }
        C(obj2);
        return true;
    }

    protected final CancellationException G0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = L();
            }
            cancellationException = new C3361w0(str, th, this);
        }
        return cancellationException;
    }

    public void H(Throwable th) {
        G(th);
    }

    public final String I0() {
        return q0() + '{' + F0(c0()) + '}';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String L() {
        return "Job was cancelled";
    }

    public boolean M(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return G(th) && X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // o2.L0
    public CancellationException N() {
        CancellationException cancellationException;
        Object c02 = c0();
        if (c02 instanceof c) {
            cancellationException = ((c) c02).e();
        } else if (c02 instanceof C3308B) {
            cancellationException = ((C3308B) c02).f41962a;
        } else {
            if (c02 instanceof InterfaceC3350q0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + c02).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new C3361w0("Parent job is " + F0(c02), cancellationException, this);
    }

    public final Object U() {
        Object c02 = c0();
        if (c02 instanceof InterfaceC3350q0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (c02 instanceof C3308B) {
            throw ((C3308B) c02).f41962a;
        }
        return E0.h(c02);
    }

    public boolean X() {
        return true;
    }

    protected final InterfaceC3509c Y() {
        h hVar = h.f41988b;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        h2.n nVar = (h2.n) kotlin.jvm.internal.M.e(hVar, 3);
        i iVar = i.f41989b;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new w2.d(this, nVar, (h2.n) kotlin.jvm.internal.M.e(iVar, 3), null, 8, null);
    }

    public boolean Z() {
        return false;
    }

    @Override // o2.InterfaceC3359v0
    public final InterfaceC3354t attachChild(InterfaceC3358v interfaceC3358v) {
        InterfaceC3320b0 l4 = B0.l(this, true, false, new C3356u(interfaceC3358v), 2, null);
        Intrinsics.checkNotNull(l4, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC3354t) l4;
    }

    public final InterfaceC3354t b0() {
        return (InterfaceC3354t) f41967c.get(this);
    }

    @Override // o2.InterfaceC3358v
    public final void c(L0 l02) {
        G(l02);
    }

    public final Object c0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41966b;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof t2.z)) {
                return obj;
            }
            ((t2.z) obj).a(this);
        }
    }

    @Override // o2.InterfaceC3359v0
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    protected boolean f0(Throwable th) {
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return InterfaceC3359v0.a.c(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b bVar) {
        return InterfaceC3359v0.a.d(this, bVar);
    }

    @Override // o2.InterfaceC3359v0
    public final CancellationException getCancellationException() {
        Object c02 = c0();
        if (!(c02 instanceof c)) {
            if (c02 instanceof InterfaceC3350q0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (c02 instanceof C3308B) {
                return H0(this, ((C3308B) c02).f41962a, null, 1, null);
            }
            return new C3361w0(N.a(this) + " has completed normally", null, this);
        }
        Throwable e4 = ((c) c02).e();
        if (e4 != null) {
            CancellationException G02 = G0(e4, N.a(this) + " is cancelling");
            if (G02 != null) {
                return G02;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // o2.InterfaceC3359v0
    public final Sequence getChildren() {
        return kotlin.sequences.k.b(new g(null));
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object c02 = c0();
        if (c02 instanceof InterfaceC3350q0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return V(c02);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.b getKey() {
        return InterfaceC3359v0.f42105N2;
    }

    @Override // o2.InterfaceC3359v0
    public final InterfaceC3507a getOnJoin() {
        j jVar = j.f41990b;
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new C3508b(this, (h2.n) kotlin.jvm.internal.M.e(jVar, 3), null, 4, null);
    }

    @Override // o2.InterfaceC3359v0
    public InterfaceC3359v0 getParent() {
        InterfaceC3354t b02 = b0();
        if (b02 != null) {
            return b02.getParent();
        }
        return null;
    }

    protected final void h0(InterfaceC3359v0 interfaceC3359v0) {
        if (interfaceC3359v0 == null) {
            D0(J0.f42008b);
            return;
        }
        interfaceC3359v0.start();
        InterfaceC3354t attachChild = interfaceC3359v0.attachChild(this);
        D0(attachChild);
        if (isCompleted()) {
            attachChild.dispose();
            D0(J0.f42008b);
        }
    }

    public final InterfaceC3320b0 i0(boolean z4, boolean z5, InterfaceC3353s0 interfaceC3353s0) {
        C0 p02 = p0(interfaceC3353s0, z4);
        while (true) {
            Object c02 = c0();
            if (c02 instanceof C3326e0) {
                C3326e0 c3326e0 = (C3326e0) c02;
                if (!c3326e0.isActive()) {
                    z0(c3326e0);
                } else if (androidx.concurrent.futures.b.a(f41966b, this, c02, p02)) {
                    break;
                }
            } else {
                if (!(c02 instanceof InterfaceC3350q0)) {
                    if (z5) {
                        C3308B c3308b = c02 instanceof C3308B ? (C3308B) c02 : null;
                        interfaceC3353s0.a(c3308b != null ? c3308b.f41962a : null);
                    }
                    return J0.f42008b;
                }
                I0 c4 = ((InterfaceC3350q0) c02).c();
                if (c4 == null) {
                    Intrinsics.checkNotNull(c02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    A0((C0) c02);
                } else {
                    InterfaceC3320b0 interfaceC3320b0 = J0.f42008b;
                    if (z4 && (c02 instanceof c)) {
                        synchronized (c02) {
                            try {
                                r3 = ((c) c02).e();
                                if (r3 != null) {
                                    if ((interfaceC3353s0 instanceof C3356u) && !((c) c02).j()) {
                                    }
                                    Unit unit = Unit.f41027a;
                                }
                                if (A(c02, c4, p02)) {
                                    if (r3 == null) {
                                        return p02;
                                    }
                                    interfaceC3320b0 = p02;
                                    Unit unit2 = Unit.f41027a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (r3 != null) {
                        if (z5) {
                            interfaceC3353s0.a(r3);
                        }
                        return interfaceC3320b0;
                    }
                    if (A(c02, c4, p02)) {
                        break;
                    }
                }
            }
        }
        return p02;
    }

    @Override // o2.InterfaceC3359v0
    public final InterfaceC3320b0 invokeOnCompletion(Function1 function1) {
        return i0(false, true, new InterfaceC3353s0.a(function1));
    }

    @Override // o2.InterfaceC3359v0
    public boolean isActive() {
        Object c02 = c0();
        return (c02 instanceof InterfaceC3350q0) && ((InterfaceC3350q0) c02).isActive();
    }

    @Override // o2.InterfaceC3359v0
    public final boolean isCancelled() {
        Object c02 = c0();
        if (c02 instanceof C3308B) {
            return true;
        }
        return (c02 instanceof c) && ((c) c02).i();
    }

    @Override // o2.InterfaceC3359v0
    public final boolean isCompleted() {
        return !(c0() instanceof InterfaceC3350q0);
    }

    protected boolean j0() {
        return false;
    }

    @Override // o2.InterfaceC3359v0
    public final Object join(kotlin.coroutines.d dVar) {
        if (k0()) {
            Object l02 = l0(dVar);
            return l02 == AbstractC1241b.f() ? l02 : Unit.f41027a;
        }
        AbstractC3367z0.i(dVar.getContext());
        return Unit.f41027a;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return InterfaceC3359v0.a.e(this, bVar);
    }

    public final boolean n0(Object obj) {
        Object L02;
        t2.G g4;
        t2.G g5;
        do {
            L02 = L0(c0(), obj);
            g4 = E0.f41991a;
            if (L02 == g4) {
                return false;
            }
            if (L02 == E0.f41992b) {
                return true;
            }
            g5 = E0.f41993c;
        } while (L02 == g5);
        C(L02);
        return true;
    }

    public final Object o0(Object obj) {
        Object L02;
        t2.G g4;
        t2.G g5;
        do {
            L02 = L0(c0(), obj);
            g4 = E0.f41991a;
            if (L02 == g4) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, V(obj));
            }
            g5 = E0.f41993c;
        } while (L02 == g5);
        return L02;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return InterfaceC3359v0.a.f(this, coroutineContext);
    }

    public String q0() {
        return N.a(this);
    }

    @Override // o2.InterfaceC3359v0
    public final boolean start() {
        int E02;
        do {
            E02 = E0(c0());
            if (E02 == 0) {
                return false;
            }
        } while (E02 != 1);
        return true;
    }

    public String toString() {
        return I0() + '@' + N.b(this);
    }

    @Override // o2.InterfaceC3359v0
    public /* synthetic */ boolean cancel(Throwable th) {
        Throwable c3361w0;
        if (th == null || (c3361w0 = H0(this, th, null, 1, null)) == null) {
            c3361w0 = new C3361w0(L(), null, this);
        }
        H(c3361w0);
        return true;
    }

    @Override // o2.InterfaceC3359v0
    public InterfaceC3359v0 plus(InterfaceC3359v0 interfaceC3359v0) {
        return InterfaceC3359v0.a.g(this, interfaceC3359v0);
    }

    @Override // o2.InterfaceC3359v0
    public final InterfaceC3320b0 invokeOnCompletion(boolean z4, boolean z5, Function1 function1) {
        return i0(z4, z5, new InterfaceC3353s0.a(function1));
    }

    @Override // o2.InterfaceC3359v0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C3361w0(L(), null, this);
        }
        H(cancellationException);
    }

    protected void y0() {
    }

    protected void C(Object obj) {
    }

    public void g0(Throwable th) {
        throw th;
    }

    protected void w0(Throwable th) {
    }

    protected void x0(Object obj) {
    }
}
