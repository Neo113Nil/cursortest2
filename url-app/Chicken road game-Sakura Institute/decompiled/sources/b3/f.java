package b3;

import W2.AbstractC0298u;
import W2.B;
import W2.C0294p;
import W2.H;
import W2.U;
import W2.u0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import y2.AbstractC1341p;

/* loaded from: classes.dex */
public final class f extends H implements E2.d, C2.a {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5654n = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0298u f5655j;

    /* renamed from: k, reason: collision with root package name */
    public final E2.c f5656k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5657l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f5658m;

    public f(AbstractC0298u abstractC0298u, E2.c cVar) {
        super(-1);
        this.f5655j = abstractC0298u;
        this.f5656k = cVar;
        this.f5657l = a.f5647b;
        this.f5658m = v.b(cVar.p());
    }

    @Override // W2.H
    public final C2.a d() {
        return this;
    }

    @Override // E2.d
    public final E2.d e() {
        return this.f5656k;
    }

    @Override // W2.H
    public final Object i() {
        Object obj = this.f5657l;
        this.f5657l = a.f5647b;
        return obj;
    }

    @Override // C2.a
    public final CoroutineContext p() {
        return this.f5656k.p();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f5655j + ", " + B.o(this.f5656k) + ']';
    }

    @Override // C2.a
    public final void u(Object obj) {
        Throwable a4 = AbstractC1341p.a(obj);
        Object c0294p = a4 == null ? obj : new C0294p(a4, false);
        E2.c cVar = this.f5656k;
        CoroutineContext p4 = cVar.p();
        AbstractC0298u abstractC0298u = this.f5655j;
        if (abstractC0298u.u(p4)) {
            this.f5657l = c0294p;
            this.f4224i = 0;
            abstractC0298u.t(cVar.p(), this);
            return;
        }
        U a5 = u0.a();
        if (a5.E()) {
            this.f5657l = c0294p;
            this.f4224i = 0;
            a5.B(this);
            return;
        }
        a5.D(true);
        try {
            CoroutineContext p5 = cVar.p();
            Object c4 = v.c(p5, this.f5658m);
            try {
                cVar.u(obj);
                Unit unit = Unit.f7487a;
                while (a5.G()) {
                }
            } finally {
                v.a(p5, c4);
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
