package t2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import o2.AbstractC3313G;
import o2.AbstractC3315I;
import o2.InterfaceC3320b0;
import o2.InterfaceC3343n;
import o2.T;

/* renamed from: t2.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3443n extends AbstractC3313G implements T {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f46238i = AtomicIntegerFieldUpdater.newUpdater(C3443n.class, "runningWorkers$volatile");

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3313G f46239d;

    /* renamed from: e, reason: collision with root package name */
    private final int f46240e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ T f46241f;

    /* renamed from: g, reason: collision with root package name */
    private final s f46242g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f46243h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: t2.n$a */
    private final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private Runnable f46244b;

        public a(Runnable runnable) {
            this.f46244b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4 = 0;
            while (true) {
                try {
                    this.f46244b.run();
                } catch (Throwable th) {
                    AbstractC3315I.a(kotlin.coroutines.g.f41113b, th);
                }
                Runnable V3 = C3443n.this.V();
                if (V3 == null) {
                    return;
                }
                this.f46244b = V3;
                i4++;
                if (i4 >= 16 && C3443n.this.f46239d.i(C3443n.this)) {
                    C3443n.this.f46239d.g(C3443n.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3443n(AbstractC3313G abstractC3313G, int i4) {
        this.f46239d = abstractC3313G;
        this.f46240e = i4;
        T t4 = abstractC3313G instanceof T ? (T) abstractC3313G : null;
        this.f46241f = t4 == null ? o2.P.a() : t4;
        this.f46242g = new s(false);
        this.f46243h = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable V() {
        while (true) {
            Runnable runnable = (Runnable) this.f46242g.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f46243h) {
                f46238i.decrementAndGet(this);
                if (this.f46242g.c() == 0) {
                    return null;
                }
                f46238i.incrementAndGet(this);
            }
        }
    }

    private final boolean W() {
        synchronized (this.f46243h) {
            if (f46238i.get(this) >= this.f46240e) {
                return false;
            }
            f46238i.incrementAndGet(this);
            return true;
        }
    }

    @Override // o2.T
    public void e(long j4, InterfaceC3343n interfaceC3343n) {
        this.f46241f.e(j4, interfaceC3343n);
    }

    @Override // o2.T
    public InterfaceC3320b0 f(long j4, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f46241f.f(j4, runnable, coroutineContext);
    }

    @Override // o2.AbstractC3313G
    public void g(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable V3;
        this.f46242g.a(runnable);
        if (f46238i.get(this) >= this.f46240e || !W() || (V3 = V()) == null) {
            return;
        }
        this.f46239d.g(this, new a(V3));
    }

    @Override // o2.AbstractC3313G
    public void h(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable V3;
        this.f46242g.a(runnable);
        if (f46238i.get(this) >= this.f46240e || !W() || (V3 = V()) == null) {
            return;
        }
        this.f46239d.h(this, new a(V3));
    }
}
