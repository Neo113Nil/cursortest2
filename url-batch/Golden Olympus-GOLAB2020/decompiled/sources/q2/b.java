package q2;

import W1.AbstractC1233c;
import a2.AbstractC1241b;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o2.AbstractC3349q;
import o2.C3345o;
import o2.InterfaceC3343n;
import o2.a1;
import t2.AbstractC3429D;
import t2.AbstractC3433d;
import t2.AbstractC3434e;
import t2.AbstractC3442m;
import t2.E;
import t2.F;
import t2.G;
import t2.P;
import t2.y;

/* loaded from: classes3.dex */
public class b implements q2.d {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f43425e = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f43426f = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f43427g = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f43428h = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f43429i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f43430j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f43431k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f43432l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f43433m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: b, reason: collision with root package name */
    private final int f43434b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f43435c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: d, reason: collision with root package name */
    private final h2.n f43436d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    private final class a implements f, a1 {

        /* renamed from: b, reason: collision with root package name */
        private Object f43437b;

        /* renamed from: c, reason: collision with root package name */
        private C3345o f43438c;

        public a() {
            G g4;
            g4 = q2.c.f43469p;
            this.f43437b = g4;
        }

        private final Object f(j jVar, int i4, long j4, kotlin.coroutines.d dVar) {
            G g4;
            G g5;
            Boolean a4;
            j jVar2;
            G g6;
            G g7;
            G g8;
            b bVar = b.this;
            C3345o b4 = AbstractC3349q.b(AbstractC1241b.c(dVar));
            try {
                this.f43438c = b4;
                try {
                    Object Q02 = bVar.Q0(jVar, i4, j4, this);
                    g4 = q2.c.f43466m;
                    if (Q02 == g4) {
                        bVar.y0(this, jVar, i4);
                    } else {
                        g5 = q2.c.f43468o;
                        Function1 function1 = null;
                        if (Q02 == g5) {
                            if (j4 < bVar.Z()) {
                                jVar.c();
                            }
                            j jVar3 = (j) b.T().get(bVar);
                            while (true) {
                                if (bVar.h0()) {
                                    h();
                                    break;
                                }
                                long andIncrement = b.U().getAndIncrement(bVar);
                                int i5 = q2.c.f43455b;
                                long j5 = andIncrement / i5;
                                int i6 = (int) (andIncrement % i5);
                                if (jVar3.f46203d != j5) {
                                    jVar2 = bVar.K(j5, jVar3);
                                    if (jVar2 == null) {
                                    }
                                } else {
                                    jVar2 = jVar3;
                                }
                                Object Q03 = bVar.Q0(jVar2, i6, andIncrement, this);
                                g6 = q2.c.f43466m;
                                if (Q03 == g6) {
                                    bVar.y0(this, jVar2, i6);
                                    break;
                                }
                                g7 = q2.c.f43468o;
                                if (Q03 == g7) {
                                    if (andIncrement < bVar.Z()) {
                                        jVar2.c();
                                    }
                                    jVar3 = jVar2;
                                } else {
                                    g8 = q2.c.f43467n;
                                    if (Q03 == g8) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    jVar2.c();
                                    this.f43437b = Q03;
                                    this.f43438c = null;
                                    a4 = kotlin.coroutines.jvm.internal.b.a(true);
                                    Function1 function12 = bVar.f43435c;
                                    if (function12 != null) {
                                        function1 = y.a(function12, Q03, b4.getContext());
                                    }
                                }
                            }
                        } else {
                            jVar.c();
                            this.f43437b = Q02;
                            this.f43438c = null;
                            a4 = kotlin.coroutines.jvm.internal.b.a(true);
                            Function1 function13 = bVar.f43435c;
                            if (function13 != null) {
                                function1 = y.a(function13, Q02, b4.getContext());
                            }
                        }
                        b4.p(a4, function1);
                    }
                    Object y4 = b4.y();
                    if (y4 == AbstractC1241b.f()) {
                        kotlin.coroutines.jvm.internal.h.c(dVar);
                    }
                    return y4;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    b4.M();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private final boolean g() {
            this.f43437b = q2.c.z();
            Throwable P3 = b.this.P();
            if (P3 == null) {
                return false;
            }
            throw F.a(P3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            C3345o c3345o = this.f43438c;
            Intrinsics.checkNotNull(c3345o);
            this.f43438c = null;
            this.f43437b = q2.c.z();
            Throwable P3 = b.this.P();
            if (P3 == null) {
                Result.Companion companion = Result.Companion;
                c3345o.resumeWith(Result.m243constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.Companion;
                c3345o.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(P3)));
            }
        }

        @Override // q2.f
        public Object a(kotlin.coroutines.d dVar) {
            G g4;
            G g5;
            G g6;
            b bVar = b.this;
            j jVar = (j) b.T().get(bVar);
            while (!bVar.h0()) {
                long andIncrement = b.U().getAndIncrement(bVar);
                int i4 = q2.c.f43455b;
                long j4 = andIncrement / i4;
                int i5 = (int) (andIncrement % i4);
                if (jVar.f46203d != j4) {
                    j K3 = bVar.K(j4, jVar);
                    if (K3 == null) {
                        continue;
                    } else {
                        jVar = K3;
                    }
                }
                Object Q02 = bVar.Q0(jVar, i5, andIncrement, null);
                g4 = q2.c.f43466m;
                if (Q02 == g4) {
                    throw new IllegalStateException("unreachable");
                }
                g5 = q2.c.f43468o;
                if (Q02 != g5) {
                    g6 = q2.c.f43467n;
                    if (Q02 == g6) {
                        return f(jVar, i5, andIncrement, dVar);
                    }
                    jVar.c();
                    this.f43437b = Q02;
                    return kotlin.coroutines.jvm.internal.b.a(true);
                }
                if (andIncrement < bVar.Z()) {
                    jVar.c();
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(g());
        }

        @Override // o2.a1
        public void d(AbstractC3429D abstractC3429D, int i4) {
            C3345o c3345o = this.f43438c;
            if (c3345o != null) {
                c3345o.d(abstractC3429D, i4);
            }
        }

        public final boolean i(Object obj) {
            boolean B4;
            C3345o c3345o = this.f43438c;
            Intrinsics.checkNotNull(c3345o);
            this.f43438c = null;
            this.f43437b = obj;
            Boolean bool = Boolean.TRUE;
            Function1 function1 = b.this.f43435c;
            B4 = q2.c.B(c3345o, bool, function1 != null ? y.a(function1, obj, c3345o.getContext()) : null);
            return B4;
        }

        public final void j() {
            C3345o c3345o = this.f43438c;
            Intrinsics.checkNotNull(c3345o);
            this.f43438c = null;
            this.f43437b = q2.c.z();
            Throwable P3 = b.this.P();
            if (P3 == null) {
                Result.Companion companion = Result.Companion;
                c3345o.resumeWith(Result.m243constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.Companion;
                c3345o.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(P3)));
            }
        }

        @Override // q2.f
        public Object next() {
            G g4;
            G g5;
            Object obj = this.f43437b;
            g4 = q2.c.f43469p;
            if (obj == g4) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            g5 = q2.c.f43469p;
            this.f43437b = g5;
            if (obj != q2.c.z()) {
                return obj;
            }
            throw F.a(b.this.S());
        }
    }

    /* renamed from: q2.b$b, reason: collision with other inner class name */
    static final class C0247b extends kotlin.jvm.internal.s implements h2.n {

        /* renamed from: q2.b$b$a */
        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Object f43441i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ b f43442j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ w2.g f43443k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, b bVar, w2.g gVar) {
                super(1);
                this.f43441i = obj;
                this.f43442j = bVar;
                this.f43443k = gVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f41027a;
            }

            public final void invoke(Throwable th) {
                if (this.f43441i != q2.c.z()) {
                    y.b(this.f43442j.f43435c, this.f43441i, this.f43443k.getContext());
                }
            }
        }

        C0247b() {
            super(3);
        }

        @Override // h2.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function1 invoke(w2.g gVar, Object obj, Object obj2) {
            return new a(obj2, b.this, gVar);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f43444l;

        /* renamed from: n, reason: collision with root package name */
        int f43446n;

        c(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43444l = obj;
            this.f43446n |= Integer.MIN_VALUE;
            Object B02 = b.B0(b.this, this);
            return B02 == AbstractC1241b.f() ? B02 : h.b(B02);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f43447l;

        /* renamed from: m, reason: collision with root package name */
        Object f43448m;

        /* renamed from: n, reason: collision with root package name */
        int f43449n;

        /* renamed from: o, reason: collision with root package name */
        long f43450o;

        /* renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f43451p;

        /* renamed from: r, reason: collision with root package name */
        int f43453r;

        d(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43451p = obj;
            this.f43453r |= Integer.MIN_VALUE;
            Object C02 = b.this.C0(null, 0, 0L, this);
            return C02 == AbstractC1241b.f() ? C02 : h.b(C02);
        }
    }

    public b(int i4, Function1 function1) {
        long A4;
        G g4;
        this.f43434b = i4;
        this.f43435c = function1;
        if (i4 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i4 + ", should be >=0").toString());
        }
        A4 = q2.c.A(i4);
        this.bufferEnd$volatile = A4;
        this.completedExpandBuffersAndPauseFlag$volatile = N();
        j jVar = new j(0L, null, this, 3);
        this.sendSegment$volatile = jVar;
        this.receiveSegment$volatile = jVar;
        if (l0()) {
            jVar = q2.c.f43454a;
            Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = jVar;
        this.f43436d = function1 != null ? new C0247b() : null;
        g4 = q2.c.f43472s;
        this._closeCause$volatile = g4;
    }

    static /* synthetic */ Object A0(b bVar, kotlin.coroutines.d dVar) {
        j jVar;
        G g4;
        G g5;
        G g6;
        j jVar2 = (j) T().get(bVar);
        while (!bVar.h0()) {
            long andIncrement = U().getAndIncrement(bVar);
            int i4 = q2.c.f43455b;
            long j4 = andIncrement / i4;
            int i5 = (int) (andIncrement % i4);
            if (jVar2.f46203d != j4) {
                j K3 = bVar.K(j4, jVar2);
                if (K3 == null) {
                    continue;
                } else {
                    jVar = K3;
                }
            } else {
                jVar = jVar2;
            }
            b bVar2 = bVar;
            Object Q02 = bVar2.Q0(jVar, i5, andIncrement, null);
            g4 = q2.c.f43466m;
            if (Q02 == g4) {
                throw new IllegalStateException("unexpected");
            }
            g5 = q2.c.f43468o;
            if (Q02 != g5) {
                g6 = q2.c.f43467n;
                if (Q02 == g6) {
                    return bVar2.D0(jVar, i5, andIncrement, dVar);
                }
                jVar.c();
                return Q02;
            }
            if (andIncrement < bVar2.Z()) {
                jVar.c();
            }
            bVar = bVar2;
            jVar2 = jVar;
        }
        throw F.a(bVar.S());
    }

    private final void B(j jVar, long j4) {
        G g4;
        Object b4 = AbstractC3442m.b(null, 1, null);
        loop0: while (jVar != null) {
            for (int i4 = q2.c.f43455b - 1; -1 < i4; i4--) {
                if ((jVar.f46203d * q2.c.f43455b) + i4 < j4) {
                    break loop0;
                }
                while (true) {
                    Object B4 = jVar.B(i4);
                    if (B4 != null) {
                        g4 = q2.c.f43458e;
                        if (B4 != g4) {
                            if (!(B4 instanceof v)) {
                                if (!(B4 instanceof a1)) {
                                    break;
                                }
                                if (jVar.v(i4, B4, q2.c.z())) {
                                    b4 = AbstractC3442m.c(b4, B4);
                                    jVar.C(i4, true);
                                    break;
                                }
                            } else {
                                if (jVar.v(i4, B4, q2.c.z())) {
                                    b4 = AbstractC3442m.c(b4, ((v) B4).f43493a);
                                    jVar.C(i4, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (jVar.v(i4, B4, q2.c.z())) {
                        jVar.t();
                        break;
                    }
                }
            }
            jVar = (j) jVar.h();
        }
        if (b4 != null) {
            if (!(b4 instanceof ArrayList)) {
                F0((a1) b4);
                return;
            }
            Intrinsics.checkNotNull(b4, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) b4;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                F0((a1) arrayList.get(size));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object B0(b bVar, kotlin.coroutines.d dVar) {
        c cVar;
        int i4;
        j jVar;
        G g4;
        G g5;
        G g6;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i5 = cVar.f43446n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.f43446n = i5 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.f43444l;
                Object f4 = AbstractC1241b.f();
                i4 = cVar2.f43446n;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return ((h) obj).k();
                }
                ResultKt.a(obj);
                j jVar2 = (j) T().get(bVar);
                while (!bVar.h0()) {
                    long andIncrement = U().getAndIncrement(bVar);
                    int i6 = q2.c.f43455b;
                    long j4 = andIncrement / i6;
                    int i7 = (int) (andIncrement % i6);
                    if (jVar2.f46203d != j4) {
                        j K3 = bVar.K(j4, jVar2);
                        if (K3 == null) {
                            continue;
                        } else {
                            jVar = K3;
                        }
                    } else {
                        jVar = jVar2;
                    }
                    b bVar2 = bVar;
                    Object Q02 = bVar2.Q0(jVar, i7, andIncrement, null);
                    g4 = q2.c.f43466m;
                    if (Q02 == g4) {
                        throw new IllegalStateException("unexpected");
                    }
                    g5 = q2.c.f43468o;
                    if (Q02 != g5) {
                        g6 = q2.c.f43467n;
                        if (Q02 != g6) {
                            jVar.c();
                            return h.f43478b.c(Q02);
                        }
                        cVar2.f43446n = 1;
                        Object C02 = bVar2.C0(jVar, i7, andIncrement, cVar2);
                        return C02 == f4 ? f4 : C02;
                    }
                    if (andIncrement < bVar2.Z()) {
                        jVar.c();
                    }
                    bVar = bVar2;
                    jVar2 = jVar;
                }
                return h.f43478b.a(bVar.P());
            }
        }
        cVar = bVar.new c(dVar);
        c cVar22 = cVar;
        Object obj2 = cVar22.f43444l;
        Object f42 = AbstractC1241b.f();
        i4 = cVar22.f43446n;
        if (i4 == 0) {
        }
    }

    private final j C() {
        Object obj = f43431k.get(this);
        j jVar = (j) f43429i.get(this);
        if (jVar.f46203d > ((j) obj).f46203d) {
            obj = jVar;
        }
        j jVar2 = (j) f43430j.get(this);
        if (jVar2.f46203d > ((j) obj).f46203d) {
            obj = jVar2;
        }
        return (j) AbstractC3433d.b((AbstractC3434e) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C0(j jVar, int i4, long j4, kotlin.coroutines.d dVar) {
        d dVar2;
        int i5;
        s sVar;
        G g4;
        G g5;
        h b4;
        j jVar2;
        G g6;
        G g7;
        G g8;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i6 = dVar2.f43453r;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar2.f43453r = i6 - Integer.MIN_VALUE;
                Object obj = dVar2.f43451p;
                Object f4 = AbstractC1241b.f();
                i5 = dVar2.f43453r;
                if (i5 != 0) {
                    ResultKt.a(obj);
                    dVar2.f43447l = this;
                    dVar2.f43448m = jVar;
                    dVar2.f43449n = i4;
                    dVar2.f43450o = j4;
                    dVar2.f43453r = 1;
                    C3345o b5 = AbstractC3349q.b(AbstractC1241b.c(dVar2));
                    try {
                        Intrinsics.checkNotNull(b5, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>");
                        sVar = new s(b5);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        Object Q02 = Q0(jVar, i4, j4, sVar);
                        g4 = q2.c.f43466m;
                        if (Q02 == g4) {
                            y0(sVar, jVar, i4);
                        } else {
                            g5 = q2.c.f43468o;
                            Function1 function1 = null;
                            if (Q02 == g5) {
                                if (j4 < Z()) {
                                    jVar.c();
                                }
                                j jVar3 = (j) T().get(this);
                                while (true) {
                                    if (h0()) {
                                        s0(b5);
                                        break;
                                    }
                                    long andIncrement = U().getAndIncrement(this);
                                    int i7 = q2.c.f43455b;
                                    long j5 = andIncrement / i7;
                                    int i8 = (int) (andIncrement % i7);
                                    if (jVar3.f46203d != j5) {
                                        j K3 = K(j5, jVar3);
                                        if (K3 != null) {
                                            jVar2 = K3;
                                        }
                                    } else {
                                        jVar2 = jVar3;
                                    }
                                    Object Q03 = Q0(jVar2, i8, andIncrement, sVar);
                                    j jVar4 = jVar2;
                                    g6 = q2.c.f43466m;
                                    if (Q03 == g6) {
                                        y0(sVar, jVar4, i8);
                                        break;
                                    }
                                    g7 = q2.c.f43468o;
                                    if (Q03 == g7) {
                                        if (andIncrement < Z()) {
                                            jVar4.c();
                                        }
                                        jVar3 = jVar4;
                                    } else {
                                        g8 = q2.c.f43467n;
                                        if (Q03 == g8) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar4.c();
                                        b4 = h.b(h.f43478b.c(Q03));
                                        Function1 function12 = this.f43435c;
                                        if (function12 != null) {
                                            function1 = y.a(function12, Q03, b5.getContext());
                                        }
                                    }
                                }
                            } else {
                                jVar.c();
                                b4 = h.b(h.f43478b.c(Q02));
                                Function1 function13 = this.f43435c;
                                if (function13 != null) {
                                    function1 = y.a(function13, Q02, b5.getContext());
                                }
                            }
                            b5.p(b4, function1);
                        }
                        obj = b5.y();
                        if (obj == AbstractC1241b.f()) {
                            kotlin.coroutines.jvm.internal.h.c(dVar2);
                        }
                        if (obj == f4) {
                            return f4;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        b5.M();
                        throw th3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                return ((h) obj).k();
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.f43451p;
        Object f42 = AbstractC1241b.f();
        i5 = dVar2.f43453r;
        if (i5 != 0) {
        }
        return ((h) obj2).k();
    }

    private final Object D0(j jVar, int i4, long j4, kotlin.coroutines.d dVar) {
        G g4;
        G g5;
        j jVar2;
        G g6;
        G g7;
        G g8;
        C3345o b4 = AbstractC3349q.b(AbstractC1241b.c(dVar));
        try {
            Object Q02 = Q0(jVar, i4, j4, b4);
            g4 = q2.c.f43466m;
            if (Q02 == g4) {
                y0(b4, jVar, i4);
            } else {
                g5 = q2.c.f43468o;
                Function1 function1 = null;
                function1 = null;
                if (Q02 == g5) {
                    if (j4 < Z()) {
                        jVar.c();
                    }
                    j jVar3 = (j) T().get(this);
                    while (true) {
                        if (h0()) {
                            t0(b4);
                            break;
                        }
                        long andIncrement = U().getAndIncrement(this);
                        int i5 = q2.c.f43455b;
                        long j5 = andIncrement / i5;
                        int i6 = (int) (andIncrement % i5);
                        if (jVar3.f46203d != j5) {
                            j K3 = K(j5, jVar3);
                            if (K3 != null) {
                                jVar2 = K3;
                            }
                        } else {
                            jVar2 = jVar3;
                        }
                        Q02 = Q0(jVar2, i6, andIncrement, b4);
                        j jVar4 = jVar2;
                        g6 = q2.c.f43466m;
                        if (Q02 == g6) {
                            C3345o c3345o = b4 != null ? b4 : null;
                            if (c3345o != null) {
                                y0(c3345o, jVar4, i6);
                            }
                        } else {
                            g7 = q2.c.f43468o;
                            if (Q02 == g7) {
                                if (andIncrement < Z()) {
                                    jVar4.c();
                                }
                                jVar3 = jVar4;
                            } else {
                                g8 = q2.c.f43467n;
                                if (Q02 == g8) {
                                    throw new IllegalStateException("unexpected");
                                }
                                jVar4.c();
                                Function1 function12 = this.f43435c;
                                if (function12 != null) {
                                    function1 = y.a(function12, Q02, b4.getContext());
                                }
                            }
                        }
                    }
                } else {
                    jVar.c();
                    Function1 function13 = this.f43435c;
                    if (function13 != null) {
                        function1 = y.a(function13, Q02, b4.getContext());
                    }
                }
                b4.p(Q02, function1);
            }
            Object y4 = b4.y();
            if (y4 == AbstractC1241b.f()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4;
        } catch (Throwable th) {
            b4.M();
            throw th;
        }
    }

    private final void E(long j4) {
        E0(F(j4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (q2.j) r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void E0(j jVar) {
        G g4;
        G g5;
        G g6;
        G g7;
        G g8;
        Function1 function1 = this.f43435c;
        P p4 = null;
        Object b4 = AbstractC3442m.b(null, 1, null);
        loop0: do {
            int i4 = q2.c.f43455b - 1;
            while (true) {
                if (-1 >= i4) {
                    break;
                }
                long j4 = (jVar.f46203d * q2.c.f43455b) + i4;
                while (true) {
                    Object B4 = jVar.B(i4);
                    g4 = q2.c.f43462i;
                    if (B4 == g4) {
                        break loop0;
                    }
                    if (B4 != q2.c.f43457d) {
                        g5 = q2.c.f43458e;
                        if (B4 == g5 || B4 == null) {
                            if (jVar.v(i4, B4, q2.c.z())) {
                                jVar.t();
                                break;
                            }
                        } else if (!(B4 instanceof a1) && !(B4 instanceof v)) {
                            g6 = q2.c.f43460g;
                            if (B4 == g6) {
                                break loop0;
                            }
                            g7 = q2.c.f43459f;
                            if (B4 == g7) {
                                break loop0;
                            }
                            g8 = q2.c.f43460g;
                            if (B4 != g8) {
                                break;
                            }
                        } else {
                            if (j4 < V()) {
                                break loop0;
                            }
                            a1 a1Var = B4 instanceof v ? ((v) B4).f43493a : (a1) B4;
                            if (jVar.v(i4, B4, q2.c.z())) {
                                if (function1 != null) {
                                    p4 = y.c(function1, jVar.A(i4), p4);
                                }
                                b4 = AbstractC3442m.c(b4, a1Var);
                                jVar.w(i4);
                                jVar.t();
                            }
                        }
                    } else {
                        if (j4 < V()) {
                            break loop0;
                        }
                        if (jVar.v(i4, B4, q2.c.z())) {
                            if (function1 != null) {
                                p4 = y.c(function1, jVar.A(i4), p4);
                            }
                            jVar.w(i4);
                            jVar.t();
                        }
                    }
                }
                i4--;
            }
        } while (jVar != null);
        if (b4 != null) {
            if (b4 instanceof ArrayList) {
                Intrinsics.checkNotNull(b4, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ArrayList arrayList = (ArrayList) b4;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    G0((a1) arrayList.get(size));
                }
            } else {
                G0((a1) b4);
            }
        }
        if (p4 != null) {
            throw p4;
        }
    }

    private final j F(long j4) {
        j C4 = C();
        if (k0()) {
            long m02 = m0(C4);
            if (m02 != -1) {
                H(m02);
            }
        }
        B(C4, j4);
        return C4;
    }

    private final void F0(a1 a1Var) {
        H0(a1Var, true);
    }

    private final void G() {
        t();
    }

    private final void G0(a1 a1Var) {
        H0(a1Var, false);
    }

    private final void H0(a1 a1Var, boolean z4) {
        if (a1Var instanceof InterfaceC3343n) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) a1Var;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(z4 ? S() : W())));
        } else if (a1Var instanceof s) {
            C3345o c3345o = ((s) a1Var).f43492b;
            Result.Companion companion2 = Result.Companion;
            c3345o.resumeWith(Result.m243constructorimpl(h.b(h.f43478b.a(P()))));
        } else if (a1Var instanceof a) {
            ((a) a1Var).j();
        } else {
            if (a1Var instanceof w2.g) {
                ((w2.g) a1Var).b(this, q2.c.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + a1Var).toString());
        }
    }

    private final void I() {
        if (l0()) {
            return;
        }
        j jVar = (j) f43431k.get(this);
        while (true) {
            long andIncrement = f43427g.getAndIncrement(this);
            int i4 = q2.c.f43455b;
            long j4 = andIncrement / i4;
            if (Z() <= andIncrement) {
                if (jVar.f46203d < j4 && jVar.f() != null) {
                    q0(j4, jVar);
                }
                d0(this, 0L, 1, null);
                return;
            }
            if (jVar.f46203d != j4) {
                j J3 = J(j4, jVar, andIncrement);
                if (J3 == null) {
                    continue;
                } else {
                    jVar = J3;
                }
            }
            if (O0(jVar, (int) (andIncrement % i4), andIncrement)) {
                d0(this, 0L, 1, null);
                return;
            }
            d0(this, 0L, 1, null);
        }
    }

    static /* synthetic */ Object I0(b bVar, Object obj, kotlin.coroutines.d dVar) {
        j jVar;
        j jVar2 = (j) X().get(bVar);
        while (true) {
            long andIncrement = Y().getAndIncrement(bVar);
            long j4 = andIncrement & 1152921504606846975L;
            boolean j02 = bVar.j0(andIncrement);
            int i4 = q2.c.f43455b;
            long j5 = j4 / i4;
            int i5 = (int) (j4 % i4);
            if (jVar2.f46203d != j5) {
                j L3 = bVar.L(j5, jVar2);
                if (L3 != null) {
                    jVar = L3;
                } else if (j02) {
                    Object u02 = bVar.u0(obj, dVar);
                    if (u02 == AbstractC1241b.f()) {
                        return u02;
                    }
                }
            } else {
                jVar = jVar2;
            }
            b bVar2 = bVar;
            Object obj2 = obj;
            int S02 = bVar2.S0(jVar, i5, obj2, j4, null, j02);
            if (S02 == 0) {
                jVar.c();
                break;
            }
            if (S02 == 1) {
                break;
            }
            if (S02 != 2) {
                if (S02 == 3) {
                    Object J02 = bVar2.J0(jVar, i5, obj2, j4, dVar);
                    if (J02 == AbstractC1241b.f()) {
                        return J02;
                    }
                } else if (S02 != 4) {
                    if (S02 == 5) {
                        jVar.c();
                    }
                    bVar = bVar2;
                    jVar2 = jVar;
                    obj = obj2;
                } else {
                    if (j4 < bVar2.V()) {
                        jVar.c();
                    }
                    Object u03 = bVar2.u0(obj2, dVar);
                    if (u03 == AbstractC1241b.f()) {
                        return u03;
                    }
                }
            } else if (j02) {
                jVar.t();
                Object u04 = bVar2.u0(obj2, dVar);
                if (u04 == AbstractC1241b.f()) {
                    return u04;
                }
            }
        }
        return Unit.f41027a;
    }

    private final j J(long j4, j jVar, long j5) {
        Object c4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43431k;
        Function2 function2 = (Function2) q2.c.y();
        loop0: while (true) {
            c4 = AbstractC3433d.c(jVar, j4, function2);
            if (!E.c(c4)) {
                AbstractC3429D b4 = E.b(c4);
                while (true) {
                    AbstractC3429D abstractC3429D = (AbstractC3429D) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3429D.f46203d >= b4.f46203d) {
                        break loop0;
                    }
                    if (!b4.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC3429D, b4)) {
                        if (abstractC3429D.p()) {
                            abstractC3429D.n();
                        }
                    } else if (b4.p()) {
                        b4.n();
                    }
                }
            } else {
                break;
            }
        }
        if (E.c(c4)) {
            G();
            q0(j4, jVar);
            d0(this, 0L, 1, null);
            return null;
        }
        j jVar2 = (j) E.b(c4);
        if (jVar2.f46203d <= j4) {
            return jVar2;
        }
        long j6 = jVar2.f46203d;
        int i4 = q2.c.f43455b;
        if (f43427g.compareAndSet(this, j5 + 1, j6 * i4)) {
            c0((jVar2.f46203d * i4) - j5);
        } else {
            d0(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object J0(j jVar, int i4, Object obj, long j4, kotlin.coroutines.d dVar) {
        Object m243constructorimpl;
        Object y4;
        j jVar2;
        C3345o b4 = AbstractC3349q.b(AbstractC1241b.c(dVar));
        try {
            int S02 = S0(jVar, i4, obj, j4, b4, false);
            if (S02 == 0) {
                jVar.c();
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
            } else {
                if (S02 != 1) {
                    if (S02 != 2) {
                        if (S02 != 4) {
                            String str = "unexpected";
                            if (S02 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            jVar.c();
                            j jVar3 = (j) X().get(this);
                            while (true) {
                                long andIncrement = Y().getAndIncrement(this);
                                long j5 = 1152921504606846975L & andIncrement;
                                boolean j02 = j0(andIncrement);
                                int i5 = q2.c.f43455b;
                                long j6 = j5 / i5;
                                int i6 = (int) (j5 % i5);
                                String str2 = str;
                                if (jVar3.f46203d != j6) {
                                    jVar2 = L(j6, jVar3);
                                    if (jVar2 == null) {
                                        if (j02) {
                                            break;
                                        }
                                        str = str2;
                                    }
                                } else {
                                    jVar2 = jVar3;
                                }
                                int S03 = S0(jVar2, i6, obj, j5, b4, j02);
                                if (S03 == 0) {
                                    jVar2.c();
                                    Result.Companion companion2 = Result.Companion;
                                    m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
                                    break;
                                }
                                if (S03 == 1) {
                                    Result.Companion companion3 = Result.Companion;
                                    m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
                                    break;
                                }
                                if (S03 != 2) {
                                    if (S03 == 3) {
                                        throw new IllegalStateException(str2);
                                    }
                                    if (S03 != 4) {
                                        if (S03 == 5) {
                                            jVar2.c();
                                        }
                                        str = str2;
                                        jVar3 = jVar2;
                                    } else if (j5 < V()) {
                                        jVar2.c();
                                    }
                                } else if (j02) {
                                    jVar2.t();
                                } else {
                                    C3345o c3345o = b4 != null ? b4 : null;
                                    if (c3345o != null) {
                                        z0(c3345o, jVar2, i6);
                                    }
                                }
                            }
                        } else if (j4 < V()) {
                            jVar.c();
                        }
                        v0(obj, b4);
                    } else {
                        z0(b4, jVar, i4);
                    }
                    y4 = b4.y();
                    if (y4 == AbstractC1241b.f()) {
                        kotlin.coroutines.jvm.internal.h.c(dVar);
                    }
                    return y4 != AbstractC1241b.f() ? y4 : Unit.f41027a;
                }
                Result.Companion companion4 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
            }
            b4.resumeWith(m243constructorimpl);
            y4 = b4.y();
            if (y4 == AbstractC1241b.f()) {
            }
            if (y4 != AbstractC1241b.f()) {
            }
        } catch (Throwable th) {
            b4.M();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j K(long j4, j jVar) {
        Object c4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43430j;
        Function2 function2 = (Function2) q2.c.y();
        loop0: while (true) {
            c4 = AbstractC3433d.c(jVar, j4, function2);
            if (!E.c(c4)) {
                AbstractC3429D b4 = E.b(c4);
                while (true) {
                    AbstractC3429D abstractC3429D = (AbstractC3429D) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3429D.f46203d >= b4.f46203d) {
                        break loop0;
                    }
                    if (!b4.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC3429D, b4)) {
                        if (abstractC3429D.p()) {
                            abstractC3429D.n();
                        }
                    } else if (b4.p()) {
                        b4.n();
                    }
                }
            } else {
                break;
            }
        }
        if (E.c(c4)) {
            G();
            if (jVar.f46203d * q2.c.f43455b < Z()) {
                jVar.c();
            }
            return null;
        }
        j jVar2 = (j) E.b(c4);
        if (!l0() && j4 <= N() / q2.c.f43455b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43431k;
            while (true) {
                AbstractC3429D abstractC3429D2 = (AbstractC3429D) atomicReferenceFieldUpdater2.get(this);
                if (abstractC3429D2.f46203d >= jVar2.f46203d || !jVar2.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, abstractC3429D2, jVar2)) {
                    if (abstractC3429D2.p()) {
                        abstractC3429D2.n();
                    }
                } else if (jVar2.p()) {
                    jVar2.n();
                }
            }
        }
        long j5 = jVar2.f46203d;
        if (j5 <= j4) {
            return jVar2;
        }
        int i4 = q2.c.f43455b;
        U0(j5 * i4);
        if (jVar2.f46203d * i4 < Z()) {
            jVar2.c();
        }
        return null;
    }

    private final boolean K0(long j4) {
        if (j0(j4)) {
            return false;
        }
        return !z(j4 & 1152921504606846975L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j L(long j4, j jVar) {
        Object c4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43429i;
        Function2 function2 = (Function2) q2.c.y();
        loop0: while (true) {
            c4 = AbstractC3433d.c(jVar, j4, function2);
            if (!E.c(c4)) {
                AbstractC3429D b4 = E.b(c4);
                while (true) {
                    AbstractC3429D abstractC3429D = (AbstractC3429D) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3429D.f46203d >= b4.f46203d) {
                        break loop0;
                    }
                    if (!b4.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC3429D, b4)) {
                        if (abstractC3429D.p()) {
                            abstractC3429D.n();
                        }
                    } else if (b4.p()) {
                        b4.n();
                    }
                }
            } else {
                break;
            }
        }
        if (E.c(c4)) {
            G();
            if (jVar.f46203d * q2.c.f43455b < V()) {
                jVar.c();
            }
            return null;
        }
        j jVar2 = (j) E.b(c4);
        long j5 = jVar2.f46203d;
        if (j5 <= j4) {
            return jVar2;
        }
        int i4 = q2.c.f43455b;
        V0(j5 * i4);
        if (jVar2.f46203d * i4 < V()) {
            jVar2.c();
        }
        return null;
    }

    private final boolean L0(Object obj, Object obj2) {
        boolean B4;
        boolean B5;
        if (obj instanceof w2.g) {
            return ((w2.g) obj).b(this, obj2);
        }
        if (obj instanceof s) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            s sVar = (s) obj;
            C3345o c3345o = sVar.f43492b;
            h b4 = h.b(h.f43478b.c(obj2));
            Function1 function1 = this.f43435c;
            B5 = q2.c.B(c3345o, b4, function1 != null ? y.a(function1, obj2, sVar.f43492b.getContext()) : null);
            return B5;
        }
        if (obj instanceof a) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (!(obj instanceof InterfaceC3343n)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        InterfaceC3343n interfaceC3343n = (InterfaceC3343n) obj;
        Function1 function12 = this.f43435c;
        B4 = q2.c.B(interfaceC3343n, obj2, function12 != null ? y.a(function12, obj2, interfaceC3343n.getContext()) : null);
        return B4;
    }

    private final boolean M0(Object obj, j jVar, int i4) {
        if (obj instanceof InterfaceC3343n) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return q2.c.C((InterfaceC3343n) obj, Unit.f41027a, null, 2, null);
        }
        if (!(obj instanceof w2.g)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        w2.i x4 = ((w2.f) obj).x(this, Unit.f41027a);
        if (x4 == w2.i.f46669c) {
            jVar.w(i4);
        }
        return x4 == w2.i.f46668b;
    }

    private final long N() {
        return f43427g.get(this);
    }

    private final boolean O0(j jVar, int i4, long j4) {
        G g4;
        G g5;
        Object B4 = jVar.B(i4);
        if ((B4 instanceof a1) && j4 >= f43426f.get(this)) {
            g4 = q2.c.f43460g;
            if (jVar.v(i4, B4, g4)) {
                if (M0(B4, jVar, i4)) {
                    jVar.F(i4, q2.c.f43457d);
                    return true;
                }
                g5 = q2.c.f43463j;
                jVar.F(i4, g5);
                jVar.C(i4, false);
                return false;
            }
        }
        return P0(jVar, i4, j4);
    }

    private final boolean P0(j jVar, int i4, long j4) {
        G g4;
        G g5;
        G g6;
        G g7;
        G g8;
        G g9;
        G g10;
        G g11;
        while (true) {
            Object B4 = jVar.B(i4);
            if (!(B4 instanceof a1)) {
                g6 = q2.c.f43463j;
                if (B4 != g6) {
                    if (B4 != null) {
                        if (B4 != q2.c.f43457d) {
                            g8 = q2.c.f43461h;
                            if (B4 == g8) {
                                break;
                            }
                            g9 = q2.c.f43462i;
                            if (B4 == g9) {
                                break;
                            }
                            g10 = q2.c.f43464k;
                            if (B4 == g10 || B4 == q2.c.z()) {
                                return true;
                            }
                            g11 = q2.c.f43459f;
                            if (B4 != g11) {
                                throw new IllegalStateException(("Unexpected cell state: " + B4).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        g7 = q2.c.f43458e;
                        if (jVar.v(i4, B4, g7)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j4 >= f43426f.get(this)) {
                g4 = q2.c.f43460g;
                if (jVar.v(i4, B4, g4)) {
                    if (M0(B4, jVar, i4)) {
                        jVar.F(i4, q2.c.f43457d);
                        return true;
                    }
                    g5 = q2.c.f43463j;
                    jVar.F(i4, g5);
                    jVar.C(i4, false);
                    return false;
                }
            } else if (jVar.v(i4, B4, new v((a1) B4))) {
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Q0(j jVar, int i4, long j4, Object obj) {
        G g4;
        G g5;
        G g6;
        Object B4 = jVar.B(i4);
        if (B4 == null) {
            if (j4 >= (f43425e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    g6 = q2.c.f43467n;
                    return g6;
                }
                if (jVar.v(i4, B4, obj)) {
                    I();
                    g5 = q2.c.f43466m;
                    return g5;
                }
            }
        } else if (B4 == q2.c.f43457d) {
            g4 = q2.c.f43462i;
            if (jVar.v(i4, B4, g4)) {
                I();
                return jVar.D(i4);
            }
        }
        return R0(jVar, i4, j4, obj);
    }

    private final Object R0(j jVar, int i4, long j4, Object obj) {
        G g4;
        G g5;
        G g6;
        G g7;
        G g8;
        G g9;
        G g10;
        G g11;
        G g12;
        G g13;
        G g14;
        G g15;
        G g16;
        G g17;
        G g18;
        G g19;
        while (true) {
            Object B4 = jVar.B(i4);
            if (B4 != null) {
                g8 = q2.c.f43458e;
                if (B4 != g8) {
                    if (B4 == q2.c.f43457d) {
                        g9 = q2.c.f43462i;
                        if (jVar.v(i4, B4, g9)) {
                            I();
                            return jVar.D(i4);
                        }
                    } else {
                        g10 = q2.c.f43463j;
                        if (B4 == g10) {
                            g11 = q2.c.f43468o;
                            return g11;
                        }
                        g12 = q2.c.f43461h;
                        if (B4 == g12) {
                            g13 = q2.c.f43468o;
                            return g13;
                        }
                        if (B4 == q2.c.z()) {
                            I();
                            g14 = q2.c.f43468o;
                            return g14;
                        }
                        g15 = q2.c.f43460g;
                        if (B4 != g15) {
                            g16 = q2.c.f43459f;
                            if (jVar.v(i4, B4, g16)) {
                                boolean z4 = B4 instanceof v;
                                if (z4) {
                                    B4 = ((v) B4).f43493a;
                                }
                                if (M0(B4, jVar, i4)) {
                                    g19 = q2.c.f43462i;
                                    jVar.F(i4, g19);
                                    I();
                                    return jVar.D(i4);
                                }
                                g17 = q2.c.f43463j;
                                jVar.F(i4, g17);
                                jVar.C(i4, false);
                                if (z4) {
                                    I();
                                }
                                g18 = q2.c.f43468o;
                                return g18;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j4 < (f43425e.get(this) & 1152921504606846975L)) {
                g4 = q2.c.f43461h;
                if (jVar.v(i4, B4, g4)) {
                    I();
                    g5 = q2.c.f43468o;
                    return g5;
                }
            } else {
                if (obj == null) {
                    g6 = q2.c.f43467n;
                    return g6;
                }
                if (jVar.v(i4, B4, obj)) {
                    I();
                    g7 = q2.c.f43466m;
                    return g7;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable S() {
        Throwable P3 = P();
        return P3 == null ? new m("Channel was closed") : P3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S0(j jVar, int i4, Object obj, long j4, Object obj2, boolean z4) {
        G g4;
        G g5;
        G g6;
        jVar.G(i4, obj);
        if (z4) {
            return T0(jVar, i4, obj, j4, obj2, z4);
        }
        Object B4 = jVar.B(i4);
        if (B4 == null) {
            if (z(j4)) {
                if (jVar.v(i4, null, q2.c.f43457d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.v(i4, null, obj2)) {
                    return 2;
                }
            }
        } else if (B4 instanceof a1) {
            jVar.w(i4);
            if (L0(B4, obj)) {
                g6 = q2.c.f43462i;
                jVar.F(i4, g6);
                w0();
                return 0;
            }
            g4 = q2.c.f43464k;
            Object x4 = jVar.x(i4, g4);
            g5 = q2.c.f43464k;
            if (x4 == g5) {
                return 5;
            }
            jVar.C(i4, true);
            return 5;
        }
        return T0(jVar, i4, obj, j4, obj2, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater T() {
        return f43430j;
    }

    private final int T0(j jVar, int i4, Object obj, long j4, Object obj2, boolean z4) {
        G g4;
        G g5;
        G g6;
        G g7;
        G g8;
        G g9;
        G g10;
        while (true) {
            Object B4 = jVar.B(i4);
            if (B4 != null) {
                g5 = q2.c.f43458e;
                if (B4 != g5) {
                    g6 = q2.c.f43464k;
                    if (B4 == g6) {
                        jVar.w(i4);
                        return 5;
                    }
                    g7 = q2.c.f43461h;
                    if (B4 == g7) {
                        jVar.w(i4);
                        return 5;
                    }
                    if (B4 == q2.c.z()) {
                        jVar.w(i4);
                        G();
                        return 4;
                    }
                    jVar.w(i4);
                    if (B4 instanceof v) {
                        B4 = ((v) B4).f43493a;
                    }
                    if (L0(B4, obj)) {
                        g10 = q2.c.f43462i;
                        jVar.F(i4, g10);
                        w0();
                        return 0;
                    }
                    g8 = q2.c.f43464k;
                    Object x4 = jVar.x(i4, g8);
                    g9 = q2.c.f43464k;
                    if (x4 != g9) {
                        jVar.C(i4, true);
                    }
                    return 5;
                }
                if (jVar.v(i4, B4, q2.c.f43457d)) {
                    return 1;
                }
            } else if (!z(j4) || z4) {
                if (z4) {
                    g4 = q2.c.f43463j;
                    if (jVar.v(i4, null, g4)) {
                        jVar.C(i4, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (jVar.v(i4, null, obj2)) {
                        return 2;
                    }
                }
            } else if (jVar.v(i4, null, q2.c.f43457d)) {
                return 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater U() {
        return f43426f;
    }

    private final void U0(long j4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43426f;
        while (true) {
            long j5 = atomicLongFieldUpdater.get(this);
            if (j5 >= j4) {
                return;
            }
            long j6 = j4;
            if (f43426f.compareAndSet(this, j5, j6)) {
                return;
            } else {
                j4 = j6;
            }
        }
    }

    private final void V0(long j4) {
        long j5;
        long w4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43425e;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            long j6 = 1152921504606846975L & j5;
            if (j6 >= j4) {
                return;
            } else {
                w4 = q2.c.w(j6, (int) (j5 >> 60));
            }
        } while (!f43425e.compareAndSet(this, j5, w4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater X() {
        return f43429i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater Y() {
        return f43425e;
    }

    private final void c0(long j4) {
        if ((f43428h.addAndGet(this, j4) & 4611686018427387904L) != 0) {
            while ((f43428h.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void d0(b bVar, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i4 & 1) != 0) {
            j4 = 1;
        }
        bVar.c0(j4);
    }

    private final void e0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43433m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? q2.c.f43470q : q2.c.f43471r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(P());
    }

    private final boolean f0(j jVar, int i4, long j4) {
        Object B4;
        G g4;
        G g5;
        G g6;
        G g7;
        G g8;
        G g9;
        G g10;
        do {
            B4 = jVar.B(i4);
            if (B4 != null) {
                g5 = q2.c.f43458e;
                if (B4 != g5) {
                    if (B4 == q2.c.f43457d) {
                        return true;
                    }
                    g6 = q2.c.f43463j;
                    if (B4 == g6 || B4 == q2.c.z()) {
                        return false;
                    }
                    g7 = q2.c.f43462i;
                    if (B4 == g7) {
                        return false;
                    }
                    g8 = q2.c.f43461h;
                    if (B4 == g8) {
                        return false;
                    }
                    g9 = q2.c.f43460g;
                    if (B4 == g9) {
                        return true;
                    }
                    g10 = q2.c.f43459f;
                    return B4 != g10 && j4 == V();
                }
            }
            g4 = q2.c.f43461h;
        } while (!jVar.v(i4, B4, g4));
        I();
        return false;
    }

    private final boolean g0(long j4, boolean z4) {
        int i4 = (int) (j4 >> 60);
        if (i4 == 0 || i4 == 1) {
            return false;
        }
        if (i4 == 2) {
            F(j4 & 1152921504606846975L);
            return (z4 && b0()) ? false : true;
        }
        if (i4 == 3) {
            E(j4 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i4).toString());
    }

    private final boolean i0(long j4) {
        return g0(j4, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j0(long j4) {
        return g0(j4, false);
    }

    private final boolean l0() {
        long N3 = N();
        return N3 == 0 || N3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (q2.j) r8.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long m0(j jVar) {
        G g4;
        do {
            int i4 = q2.c.f43455b;
            while (true) {
                i4--;
                if (-1 >= i4) {
                    break;
                }
                long j4 = (jVar.f46203d * q2.c.f43455b) + i4;
                if (j4 < V()) {
                    return -1L;
                }
                while (true) {
                    Object B4 = jVar.B(i4);
                    if (B4 != null) {
                        g4 = q2.c.f43458e;
                        if (B4 != g4) {
                            if (B4 == q2.c.f43457d) {
                                return j4;
                            }
                        }
                    }
                    if (jVar.v(i4, B4, q2.c.z())) {
                        jVar.t();
                        break;
                    }
                }
            }
        } while (jVar != null);
        return -1L;
    }

    private final void n0() {
        long j4;
        long w4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43425e;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if (((int) (j4 >> 60)) != 0) {
                return;
            } else {
                w4 = q2.c.w(1152921504606846975L & j4, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, w4));
    }

    private final void o0() {
        long j4;
        long w4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43425e;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            w4 = q2.c.w(1152921504606846975L & j4, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, w4));
    }

    private final void p0() {
        long j4;
        long w4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43425e;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            int i4 = (int) (j4 >> 60);
            if (i4 == 0) {
                w4 = q2.c.w(1152921504606846975L & j4, 2);
            } else if (i4 != 1) {
                return;
            } else {
                w4 = q2.c.w(1152921504606846975L & j4, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, w4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void q0(long j4, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f46203d < j4 && (jVar3 = (j) jVar.f()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.k() || (jVar2 = (j) jVar.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43431k;
                while (true) {
                    AbstractC3429D abstractC3429D = (AbstractC3429D) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3429D.f46203d >= jVar.f46203d) {
                        return;
                    }
                    if (!jVar.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC3429D, jVar)) {
                        if (abstractC3429D.p()) {
                            abstractC3429D.n();
                            return;
                        }
                        return;
                    } else if (jVar.p()) {
                        jVar.n();
                    }
                }
            } else {
                jVar = jVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(InterfaceC3343n interfaceC3343n) {
        Result.Companion companion = Result.Companion;
        interfaceC3343n.resumeWith(Result.m243constructorimpl(h.b(h.f43478b.a(P()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(InterfaceC3343n interfaceC3343n) {
        Result.Companion companion = Result.Companion;
        interfaceC3343n.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(S())));
    }

    private final Object u0(Object obj, kotlin.coroutines.d dVar) {
        P d4;
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        Function1 function1 = this.f43435c;
        if (function1 == null || (d4 = y.d(function1, obj, null, 2, null)) == null) {
            Throwable W3 = W();
            Result.Companion companion = Result.Companion;
            c3345o.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(W3)));
        } else {
            AbstractC1233c.a(d4, W());
            Result.Companion companion2 = Result.Companion;
            c3345o.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(d4)));
        }
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == AbstractC1241b.f() ? y4 : Unit.f41027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(Object obj, InterfaceC3343n interfaceC3343n) {
        Function1 function1 = this.f43435c;
        if (function1 != null) {
            y.b(function1, obj, interfaceC3343n.getContext());
        }
        Throwable W3 = W();
        Result.Companion companion = Result.Companion;
        interfaceC3343n.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(W3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(a1 a1Var, j jVar, int i4) {
        x0();
        a1Var.d(jVar, i4);
    }

    private final boolean z(long j4) {
        return j4 < N() || j4 < V() + ((long) this.f43434b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(a1 a1Var, j jVar, int i4) {
        a1Var.d(jVar, i4 + q2.c.f43455b);
    }

    public boolean A(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return D(th, true);
    }

    protected boolean D(Throwable th, boolean z4) {
        G g4;
        if (z4) {
            n0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43432l;
        g4 = q2.c.f43472s;
        boolean a4 = androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, g4, th);
        if (z4) {
            o0();
        } else {
            p0();
        }
        G();
        r0();
        if (a4) {
            e0();
        }
        return a4;
    }

    protected final void H(long j4) {
        j jVar;
        G g4;
        P d4;
        j jVar2 = (j) f43430j.get(this);
        while (true) {
            long j5 = f43426f.get(this);
            if (j4 < Math.max(this.f43434b + j5, N())) {
                return;
            }
            if (f43426f.compareAndSet(this, j5, 1 + j5)) {
                int i4 = q2.c.f43455b;
                long j6 = j5 / i4;
                int i5 = (int) (j5 % i4);
                if (jVar2.f46203d != j6) {
                    jVar = K(j6, jVar2);
                    if (jVar == null) {
                        continue;
                    }
                } else {
                    jVar = jVar2;
                }
                Object Q02 = Q0(jVar, i5, j5, null);
                g4 = q2.c.f43468o;
                if (Q02 != g4) {
                    jVar.c();
                    Function1 function1 = this.f43435c;
                    if (function1 != null && (d4 = y.d(function1, Q02, null, 2, null)) != null) {
                        throw d4;
                    }
                } else if (j5 < Z()) {
                    jVar.c();
                }
                jVar2 = jVar;
            }
        }
    }

    protected final Object N0(Object obj) {
        j jVar;
        int i4;
        b bVar;
        Object obj2 = q2.c.f43457d;
        j jVar2 = (j) X().get(this);
        while (true) {
            long andIncrement = Y().getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean j02 = j0(andIncrement);
            int i5 = q2.c.f43455b;
            long j5 = j4 / i5;
            int i6 = (int) (j4 % i5);
            if (jVar2.f46203d != j5) {
                jVar = L(j5, jVar2);
                if (jVar != null) {
                    bVar = this;
                    i4 = i6;
                } else if (j02) {
                    return h.f43478b.a(W());
                }
            } else {
                jVar = jVar2;
                i4 = i6;
                bVar = this;
            }
            Object obj3 = obj;
            int S02 = bVar.S0(jVar, i4, obj3, j4, obj2, j02);
            jVar2 = jVar;
            if (S02 == 0) {
                jVar2.c();
                return h.f43478b.c(Unit.f41027a);
            }
            if (S02 == 1) {
                return h.f43478b.c(Unit.f41027a);
            }
            if (S02 == 2) {
                if (j02) {
                    jVar2.t();
                    return h.f43478b.a(W());
                }
                a1 a1Var = obj2 instanceof a1 ? (a1) obj2 : null;
                if (a1Var != null) {
                    z0(a1Var, jVar2, i4);
                }
                H((jVar2.f46203d * i5) + i4);
                return h.f43478b.c(Unit.f41027a);
            }
            if (S02 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (S02 == 4) {
                if (j4 < V()) {
                    jVar2.c();
                }
                return h.f43478b.a(W());
            }
            if (S02 == 5) {
                jVar2.c();
            }
            obj = obj3;
        }
    }

    protected final Throwable P() {
        return (Throwable) f43432l.get(this);
    }

    public final long V() {
        return f43426f.get(this);
    }

    protected final Throwable W() {
        Throwable P3 = P();
        return P3 == null ? new n("Channel was closed") : P3;
    }

    public final void W0(long j4) {
        int i4;
        long v4;
        long v5;
        long v6;
        b bVar = this;
        if (bVar.l0()) {
            return;
        }
        while (bVar.N() <= j4) {
            bVar = this;
        }
        i4 = q2.c.f43456c;
        for (int i5 = 0; i5 < i4; i5++) {
            long N3 = bVar.N();
            if (N3 == (4611686018427387903L & f43428h.get(bVar)) && N3 == bVar.N()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f43428h;
        while (true) {
            long j5 = atomicLongFieldUpdater.get(bVar);
            v4 = q2.c.v(j5 & 4611686018427387903L, true);
            if (atomicLongFieldUpdater.compareAndSet(bVar, j5, v4)) {
                break;
            } else {
                bVar = this;
            }
        }
        while (true) {
            long N4 = bVar.N();
            long j6 = f43428h.get(bVar);
            long j7 = j6 & 4611686018427387903L;
            boolean z4 = (4611686018427387904L & j6) != 0;
            if (N4 == j7 && N4 == bVar.N()) {
                break;
            }
            if (z4) {
                bVar = this;
            } else {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f43428h;
                v5 = q2.c.v(j7, true);
                bVar = this;
                atomicLongFieldUpdater2.compareAndSet(bVar, j6, v5);
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater3 = f43428h;
        while (true) {
            long j8 = atomicLongFieldUpdater3.get(bVar);
            v6 = q2.c.v(j8 & 4611686018427387903L, false);
            boolean compareAndSet = atomicLongFieldUpdater3.compareAndSet(bVar, j8, v6);
            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
            if (compareAndSet) {
                return;
            }
            atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
            bVar = this;
        }
    }

    public final long Z() {
        return f43425e.get(this) & 1152921504606846975L;
    }

    public final boolean b0() {
        while (true) {
            j jVar = (j) f43430j.get(this);
            long V3 = V();
            if (Z() <= V3) {
                return false;
            }
            int i4 = q2.c.f43455b;
            long j4 = V3 / i4;
            if (jVar.f46203d == j4 || (jVar = K(j4, jVar)) != null) {
                jVar.c();
                if (f0(jVar, (int) (V3 % i4), V3)) {
                    return true;
                }
                f43426f.compareAndSet(this, V3, 1 + V3);
            } else if (((j) f43430j.get(this)).f46203d < j4) {
                return false;
            }
        }
    }

    @Override // q2.t
    public final void cancel(CancellationException cancellationException) {
        A(cancellationException);
    }

    @Override // q2.t
    public Object d() {
        Object obj;
        j jVar;
        G g4;
        G g5;
        G g6;
        long j4 = f43426f.get(this);
        long j5 = f43425e.get(this);
        if (i0(j5)) {
            return h.f43478b.a(P());
        }
        if (j4 >= (j5 & 1152921504606846975L)) {
            return h.f43478b.b();
        }
        obj = q2.c.f43464k;
        j jVar2 = (j) T().get(this);
        while (!h0()) {
            long andIncrement = U().getAndIncrement(this);
            int i4 = q2.c.f43455b;
            long j6 = andIncrement / i4;
            int i5 = (int) (andIncrement % i4);
            if (jVar2.f46203d != j6) {
                jVar = K(j6, jVar2);
                if (jVar == null) {
                    continue;
                }
            } else {
                jVar = jVar2;
            }
            Object Q02 = Q0(jVar, i5, andIncrement, obj);
            g4 = q2.c.f43466m;
            if (Q02 == g4) {
                a1 a1Var = obj instanceof a1 ? (a1) obj : null;
                if (a1Var != null) {
                    y0(a1Var, jVar, i5);
                }
                W0(andIncrement);
                jVar.t();
                return h.f43478b.b();
            }
            g5 = q2.c.f43468o;
            if (Q02 != g5) {
                g6 = q2.c.f43467n;
                if (Q02 == g6) {
                    throw new IllegalStateException("unexpected");
                }
                jVar.c();
                return h.f43478b.c(Q02);
            }
            if (andIncrement < Z()) {
                jVar.c();
            }
            jVar2 = jVar;
        }
        return h.f43478b.a(P());
    }

    @Override // q2.t
    public Object e(kotlin.coroutines.d dVar) {
        return B0(this, dVar);
    }

    public boolean h0() {
        return i0(f43425e.get(this));
    }

    @Override // q2.t
    public Object i(kotlin.coroutines.d dVar) {
        return A0(this, dVar);
    }

    @Override // q2.t
    public f iterator() {
        return new a();
    }

    @Override // q2.u
    public boolean j(Throwable th) {
        return D(th, false);
    }

    protected boolean k0() {
        return false;
    }

    @Override // q2.u
    public void q(Function1 function1) {
        G g4;
        G g5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        G g6;
        G g7;
        if (androidx.concurrent.futures.b.a(f43433m, this, null, function1)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43433m;
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            g4 = q2.c.f43470q;
            if (obj != g4) {
                g5 = q2.c.f43471r;
                if (obj == g5) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f43433m;
            g6 = q2.c.f43470q;
            g7 = q2.c.f43471r;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, g6, g7));
        function1.invoke(P());
    }

    @Override // q2.u
    public Object r(Object obj) {
        Object obj2;
        Object obj3;
        int i4;
        j jVar;
        b bVar;
        if (K0(f43425e.get(this))) {
            return h.f43478b.b();
        }
        obj2 = q2.c.f43463j;
        j jVar2 = (j) X().get(this);
        while (true) {
            long andIncrement = Y().getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean j02 = j0(andIncrement);
            int i5 = q2.c.f43455b;
            long j5 = j4 / i5;
            int i6 = (int) (j4 % i5);
            if (jVar2.f46203d != j5) {
                j L3 = L(j5, jVar2);
                if (L3 != null) {
                    i4 = i6;
                    jVar = L3;
                    bVar = this;
                    obj3 = obj;
                } else if (j02) {
                    return h.f43478b.a(W());
                }
            } else {
                obj3 = obj;
                i4 = i6;
                jVar = jVar2;
                bVar = this;
            }
            int S02 = bVar.S0(jVar, i4, obj3, j4, obj2, j02);
            jVar2 = jVar;
            if (S02 == 0) {
                jVar2.c();
                return h.f43478b.c(Unit.f41027a);
            }
            if (S02 == 1) {
                return h.f43478b.c(Unit.f41027a);
            }
            if (S02 == 2) {
                if (j02) {
                    jVar2.t();
                    return h.f43478b.a(W());
                }
                a1 a1Var = obj2 instanceof a1 ? (a1) obj2 : null;
                if (a1Var != null) {
                    z0(a1Var, jVar2, i4);
                }
                jVar2.t();
                return h.f43478b.b();
            }
            if (S02 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (S02 == 4) {
                if (j4 < V()) {
                    jVar2.c();
                }
                return h.f43478b.a(W());
            }
            if (S02 == 5) {
                jVar2.c();
            }
            obj = obj3;
        }
    }

    @Override // q2.u
    public Object s(Object obj, kotlin.coroutines.d dVar) {
        return I0(this, obj, dVar);
    }

    @Override // q2.u
    public boolean t() {
        return j0(f43425e.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01eb, code lost:
    
        r16 = r7;
        r3 = (q2.j) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f4, code lost:
    
        if (r3 != null) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z4;
        G g4;
        G g5;
        boolean areEqual;
        G g6;
        boolean areEqual2;
        G g7;
        boolean areEqual3;
        G g8;
        boolean areEqual4;
        G g9;
        boolean areEqual5;
        G g10;
        boolean areEqual6;
        String obj;
        j jVar;
        StringBuilder sb = new StringBuilder();
        int i4 = (int) (f43425e.get(this) >> 60);
        if (i4 == 2) {
            sb.append("closed,");
        } else if (i4 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f43434b + ',');
        sb.append("data=[");
        int i5 = 0;
        boolean z5 = true;
        List listOf = CollectionsKt.listOf((Object[]) new j[]{f43430j.get(this), f43429i.get(this), f43431k.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listOf) {
            j jVar2 = (j) obj2;
            jVar = q2.c.f43454a;
            if (jVar2 != jVar) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j4 = ((j) next).f46203d;
            do {
                Object next2 = it.next();
                long j5 = ((j) next2).f46203d;
                if (j4 > j5) {
                    next = next2;
                    j4 = j5;
                }
            } while (it.hasNext());
        }
        j jVar3 = (j) next;
        long V3 = V();
        long Z3 = Z();
        loop2: while (true) {
            int i6 = q2.c.f43455b;
            int i7 = i5;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                long j6 = (jVar3.f46203d * q2.c.f43455b) + i7;
                if (j6 >= Z3 && j6 >= V3) {
                    break loop2;
                }
                Object B4 = jVar3.B(i7);
                Object A4 = jVar3.A(i7);
                boolean z6 = z5;
                if (B4 instanceof InterfaceC3343n) {
                    obj = (j6 >= V3 || j6 < Z3) ? (j6 >= Z3 || j6 < V3) ? "cont" : "send" : "receive";
                } else if (B4 instanceof w2.g) {
                    obj = (j6 >= V3 || j6 < Z3) ? (j6 >= Z3 || j6 < V3) ? "select" : "onSend" : "onReceive";
                } else if (B4 instanceof s) {
                    obj = "receiveCatching";
                } else if (B4 instanceof v) {
                    obj = "EB(" + B4 + ')';
                } else {
                    g4 = q2.c.f43459f;
                    if (Intrinsics.areEqual(B4, g4)) {
                        areEqual = z6;
                    } else {
                        g5 = q2.c.f43460g;
                        areEqual = Intrinsics.areEqual(B4, g5);
                    }
                    if (areEqual) {
                        obj = "resuming_sender";
                    } else {
                        if (B4 == null) {
                            areEqual2 = z6;
                        } else {
                            g6 = q2.c.f43458e;
                            areEqual2 = Intrinsics.areEqual(B4, g6);
                        }
                        if (areEqual2) {
                            areEqual3 = z6;
                        } else {
                            g7 = q2.c.f43462i;
                            areEqual3 = Intrinsics.areEqual(B4, g7);
                        }
                        if (areEqual3) {
                            areEqual4 = z6;
                        } else {
                            g8 = q2.c.f43461h;
                            areEqual4 = Intrinsics.areEqual(B4, g8);
                        }
                        if (areEqual4) {
                            areEqual5 = z6;
                        } else {
                            g9 = q2.c.f43464k;
                            areEqual5 = Intrinsics.areEqual(B4, g9);
                        }
                        if (areEqual5) {
                            areEqual6 = z6;
                        } else {
                            g10 = q2.c.f43463j;
                            areEqual6 = Intrinsics.areEqual(B4, g10);
                        }
                        if (areEqual6 ? z6 : Intrinsics.areEqual(B4, q2.c.z())) {
                            i7++;
                            z5 = z6;
                        } else {
                            obj = B4.toString();
                        }
                    }
                }
                if (A4 != null) {
                    sb.append('(' + obj + ',' + A4 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i7++;
                z5 = z6;
            }
            z5 = z4;
            i5 = 0;
        }
        if (StringsKt.d1(sb) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append(b9.i.f15552e);
        return sb.toString();
    }

    protected void r0() {
    }

    protected void w0() {
    }

    protected void x0() {
    }
}
