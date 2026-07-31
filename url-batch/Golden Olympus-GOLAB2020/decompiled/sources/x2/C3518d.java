package x2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import o2.InterfaceC3343n;
import o2.a1;
import q2.i;
import t2.AbstractC3429D;
import t2.AbstractC3433d;
import t2.E;
import t2.G;
import w2.g;

/* renamed from: x2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3518d {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46693c = AtomicReferenceFieldUpdater.newUpdater(C3518d.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f46694d = AtomicLongFieldUpdater.newUpdater(C3518d.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46695e = AtomicReferenceFieldUpdater.newUpdater(C3518d.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f46696f = AtomicLongFieldUpdater.newUpdater(C3518d.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f46697g = AtomicIntegerFieldUpdater.newUpdater(C3518d.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f46698a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f46699b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* renamed from: x2.d$a */
    /* synthetic */ class a extends p implements Function2 {

        /* renamed from: b, reason: collision with root package name */
        public static final a f46700b = new a();

        a() {
            super(2, AbstractC3519e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final C3520f a(long j4, C3520f c3520f) {
            C3520f h4;
            h4 = AbstractC3519e.h(j4, c3520f);
            return h4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (C3520f) obj2);
        }
    }

    /* renamed from: x2.d$b */
    static final class b extends s implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f41027a;
        }

        public final void invoke(Throwable th) {
            C3518d.this.n();
        }
    }

    /* renamed from: x2.d$c */
    /* synthetic */ class c extends p implements Function2 {

        /* renamed from: b, reason: collision with root package name */
        public static final c f46702b = new c();

        c() {
            super(2, AbstractC3519e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final C3520f a(long j4, C3520f c3520f) {
            C3520f h4;
            h4 = AbstractC3519e.h(j4, c3520f);
            return h4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (C3520f) obj2);
        }
    }

    public C3518d(int i4, int i5) {
        this.f46698a = i4;
        if (i4 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i4).toString());
        }
        if (i5 < 0 || i5 > i4) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i4).toString());
        }
        C3520f c3520f = new C3520f(0L, null, 2);
        this.head$volatile = c3520f;
        this.tail$volatile = c3520f;
        this._availablePermits$volatile = i4 - i5;
        this.f46699b = new b();
    }

    private final boolean e(a1 a1Var) {
        int i4;
        Object c4;
        int i5;
        G g4;
        G g5;
        C3520f c3520f = (C3520f) f46695e.get(this);
        long andIncrement = f46696f.getAndIncrement(this);
        a aVar = a.f46700b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46695e;
        i4 = AbstractC3519e.f46708f;
        long j4 = andIncrement / i4;
        loop0: while (true) {
            c4 = AbstractC3433d.c(c3520f, j4, aVar);
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
        C3520f c3520f2 = (C3520f) E.b(c4);
        i5 = AbstractC3519e.f46708f;
        int i6 = (int) (andIncrement % i5);
        if (i.a(c3520f2.v(), i6, null, a1Var)) {
            a1Var.d(c3520f2, i6);
            return true;
        }
        g4 = AbstractC3519e.f46704b;
        g5 = AbstractC3519e.f46705c;
        if (!i.a(c3520f2.v(), i6, g4, g5)) {
            return false;
        }
        if (a1Var instanceof InterfaceC3343n) {
            Intrinsics.checkNotNull(a1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC3343n) a1Var).p(Unit.f41027a, this.f46699b);
        } else {
            if (!(a1Var instanceof g)) {
                throw new IllegalStateException(("unexpected: " + a1Var).toString());
            }
            ((g) a1Var).e(Unit.f41027a);
        }
        return true;
    }

    private final void f() {
        int i4;
        do {
            i4 = f46697g.get(this);
            if (i4 <= this.f46698a) {
                return;
            }
        } while (!f46697g.compareAndSet(this, i4, this.f46698a));
    }

    private final int g() {
        int andDecrement;
        do {
            andDecrement = f46697g.getAndDecrement(this);
        } while (andDecrement > this.f46698a);
        return andDecrement;
    }

    private final boolean p(Object obj) {
        if (!(obj instanceof InterfaceC3343n)) {
            if (obj instanceof g) {
                return ((g) obj).b(this, Unit.f41027a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC3343n interfaceC3343n = (InterfaceC3343n) obj;
        Object h4 = interfaceC3343n.h(Unit.f41027a, null, this.f46699b);
        if (h4 == null) {
            return false;
        }
        interfaceC3343n.u(h4);
        return true;
    }

    private final boolean q() {
        int i4;
        Object c4;
        int i5;
        G g4;
        G g5;
        int i6;
        G g6;
        G g7;
        G g8;
        C3520f c3520f = (C3520f) f46693c.get(this);
        long andIncrement = f46694d.getAndIncrement(this);
        i4 = AbstractC3519e.f46708f;
        long j4 = andIncrement / i4;
        c cVar = c.f46702b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46693c;
        loop0: while (true) {
            c4 = AbstractC3433d.c(c3520f, j4, cVar);
            if (E.c(c4)) {
                break;
            }
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
        }
        C3520f c3520f2 = (C3520f) E.b(c4);
        c3520f2.c();
        if (c3520f2.f46203d > j4) {
            return false;
        }
        i5 = AbstractC3519e.f46708f;
        int i7 = (int) (andIncrement % i5);
        g4 = AbstractC3519e.f46704b;
        Object andSet = c3520f2.v().getAndSet(i7, g4);
        if (andSet != null) {
            g5 = AbstractC3519e.f46707e;
            if (andSet == g5) {
                return false;
            }
            return p(andSet);
        }
        i6 = AbstractC3519e.f46703a;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = c3520f2.v().get(i7);
            g8 = AbstractC3519e.f46705c;
            if (obj == g8) {
                return true;
            }
        }
        g6 = AbstractC3519e.f46704b;
        g7 = AbstractC3519e.f46706d;
        return !i.a(c3520f2.v(), i7, g6, g7);
    }

    protected final void d(InterfaceC3343n interfaceC3343n) {
        while (g() <= 0) {
            Intrinsics.checkNotNull(interfaceC3343n, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (e((a1) interfaceC3343n)) {
                return;
            }
        }
        interfaceC3343n.p(Unit.f41027a, this.f46699b);
    }

    public int h() {
        return Math.max(f46697g.get(this), 0);
    }

    public void n() {
        do {
            int andIncrement = f46697g.getAndIncrement(this);
            if (andIncrement >= this.f46698a) {
                f();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f46698a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!q());
    }

    public boolean o() {
        while (true) {
            int i4 = f46697g.get(this);
            if (i4 > this.f46698a) {
                f();
            } else {
                if (i4 <= 0) {
                    return false;
                }
                if (f46697g.compareAndSet(this, i4, i4 - 1)) {
                    return true;
                }
            }
        }
    }
}
