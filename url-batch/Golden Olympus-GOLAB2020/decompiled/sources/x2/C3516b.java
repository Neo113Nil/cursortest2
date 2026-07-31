package x2;

import a2.AbstractC1241b;
import h2.n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import o2.AbstractC3313G;
import o2.AbstractC3349q;
import o2.C3345o;
import o2.InterfaceC3343n;
import o2.N;
import o2.a1;
import t2.AbstractC3429D;
import t2.G;
import w2.g;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3516b extends C3518d implements InterfaceC3515a {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46679i = AtomicReferenceFieldUpdater.newUpdater(C3516b.class, Object.class, "owner$volatile");

    /* renamed from: h, reason: collision with root package name */
    private final n f46680h;
    private volatile /* synthetic */ Object owner$volatile;

    /* renamed from: x2.b$a */
    private final class a implements InterfaceC3343n, a1 {

        /* renamed from: b, reason: collision with root package name */
        public final C3345o f46681b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f46682c;

        /* renamed from: x2.b$a$a, reason: collision with other inner class name */
        static final class C0287a extends s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C3516b f46684i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ a f46685j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0287a(C3516b c3516b, a aVar) {
                super(1);
                this.f46684i = c3516b;
                this.f46685j = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f41027a;
            }

            public final void invoke(Throwable th) {
                this.f46684i.c(this.f46685j.f46682c);
            }
        }

        /* renamed from: x2.b$a$b, reason: collision with other inner class name */
        static final class C0288b extends s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C3516b f46686i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ a f46687j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0288b(C3516b c3516b, a aVar) {
                super(1);
                this.f46686i = c3516b;
                this.f46687j = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f41027a;
            }

            public final void invoke(Throwable th) {
                C3516b.s().set(this.f46686i, this.f46687j.f46682c);
                this.f46686i.c(this.f46687j.f46682c);
            }
        }

        public a(C3345o c3345o, Object obj) {
            this.f46681b = c3345o;
            this.f46682c = obj;
        }

        @Override // o2.InterfaceC3343n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void p(Unit unit, Function1 function1) {
            C3516b.s().set(C3516b.this, this.f46682c);
            this.f46681b.p(unit, new C0287a(C3516b.this, this));
        }

        @Override // o2.InterfaceC3343n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void k(AbstractC3313G abstractC3313G, Unit unit) {
            this.f46681b.k(abstractC3313G, unit);
        }

        @Override // o2.InterfaceC3343n
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Object h(Unit unit, Object obj, Function1 function1) {
            Object h4 = this.f46681b.h(unit, obj, new C0288b(C3516b.this, this));
            if (h4 != null) {
                C3516b.s().set(C3516b.this, this.f46682c);
            }
            return h4;
        }

        @Override // o2.a1
        public void d(AbstractC3429D abstractC3429D, int i4) {
            this.f46681b.d(abstractC3429D, i4);
        }

        @Override // o2.InterfaceC3343n
        public void f(Function1 function1) {
            this.f46681b.f(function1);
        }

        @Override // o2.InterfaceC3343n
        public Object g(Throwable th) {
            return this.f46681b.g(th);
        }

        @Override // kotlin.coroutines.d
        public CoroutineContext getContext() {
            return this.f46681b.getContext();
        }

        @Override // o2.InterfaceC3343n
        public boolean isActive() {
            return this.f46681b.isActive();
        }

        @Override // o2.InterfaceC3343n
        public boolean isCompleted() {
            return this.f46681b.isCompleted();
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(Object obj) {
            this.f46681b.resumeWith(obj);
        }

        @Override // o2.InterfaceC3343n
        public void u(Object obj) {
            this.f46681b.u(obj);
        }
    }

    /* renamed from: x2.b$b, reason: collision with other inner class name */
    static final class C0289b extends s implements n {

        /* renamed from: x2.b$b$a */
        static final class a extends s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C3516b f46689i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Object f46690j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3516b c3516b, Object obj) {
                super(1);
                this.f46689i = c3516b;
                this.f46690j = obj;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f41027a;
            }

            public final void invoke(Throwable th) {
                this.f46689i.c(this.f46690j);
            }
        }

        C0289b() {
            super(3);
        }

        @Override // h2.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function1 invoke(g gVar, Object obj, Object obj2) {
            return new a(C3516b.this, obj);
        }
    }

    public C3516b(boolean z4) {
        super(1, z4 ? 1 : 0);
        this.owner$volatile = z4 ? null : AbstractC3517c.f46691a;
        this.f46680h = new C0289b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater s() {
        return f46679i;
    }

    private final int t(Object obj) {
        G g4;
        while (u()) {
            Object obj2 = f46679i.get(this);
            g4 = AbstractC3517c.f46691a;
            if (obj2 != g4) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object v(C3516b c3516b, Object obj, kotlin.coroutines.d dVar) {
        if (c3516b.a(obj)) {
            return Unit.f41027a;
        }
        Object w4 = c3516b.w(obj, dVar);
        return w4 == AbstractC1241b.f() ? w4 : Unit.f41027a;
    }

    private final Object w(Object obj, kotlin.coroutines.d dVar) {
        C3345o b4 = AbstractC3349q.b(AbstractC1241b.c(dVar));
        try {
            d(new a(b4, obj));
            Object y4 = b4.y();
            if (y4 == AbstractC1241b.f()) {
                h.c(dVar);
            }
            return y4 == AbstractC1241b.f() ? y4 : Unit.f41027a;
        } catch (Throwable th) {
            b4.M();
            throw th;
        }
    }

    private final int x(Object obj) {
        while (!o()) {
            if (obj == null) {
                return 1;
            }
            int t4 = t(obj);
            if (t4 == 1) {
                return 2;
            }
            if (t4 == 2) {
                return 1;
            }
        }
        f46679i.set(this, obj);
        return 0;
    }

    @Override // x2.InterfaceC3515a
    public boolean a(Object obj) {
        int x4 = x(obj);
        if (x4 == 0) {
            return true;
        }
        if (x4 == 1) {
            return false;
        }
        if (x4 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // x2.InterfaceC3515a
    public Object b(Object obj, kotlin.coroutines.d dVar) {
        return v(this, obj, dVar);
    }

    @Override // x2.InterfaceC3515a
    public void c(Object obj) {
        G g4;
        G g5;
        while (u()) {
            Object obj2 = f46679i.get(this);
            g4 = AbstractC3517c.f46691a;
            if (obj2 != g4) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46679i;
                g5 = AbstractC3517c.f46691a;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, g5)) {
                    n();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + N.b(this) + "[isLocked=" + u() + ",owner=" + f46679i.get(this) + ']';
    }

    public boolean u() {
        return h() == 0;
    }
}
