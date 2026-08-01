package le;

import ge.a0;
import ge.i0;
import ge.p0;
import ge.u1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends i0 implements nd.d, ld.a {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5972v = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: r, reason: collision with root package name */
    public final ge.t f5973r;

    /* renamed from: s, reason: collision with root package name */
    public final nd.c f5974s;

    /* renamed from: t, reason: collision with root package name */
    public Object f5975t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f5976u;

    public g(ge.t tVar, nd.c cVar) {
        super(-1);
        this.f5973r = tVar;
        this.f5974s = cVar;
        this.f5975t = b.f5965b;
        this.f5976u = v.b(cVar.getContext());
    }

    @Override // nd.d
    public final nd.d getCallerFrame() {
        return this.f5974s;
    }

    @Override // ld.a
    public final CoroutineContext getContext() {
        return this.f5974s.getContext();
    }

    @Override // ge.i0
    public final Object j() {
        Object obj = this.f5975t;
        this.f5975t = b.f5965b;
        return obj;
    }

    @Override // ld.a
    public final void resumeWith(Object obj) {
        Throwable a9 = hd.n.a(obj);
        Object qVar = a9 == null ? obj : new ge.q(a9, false);
        nd.c cVar = this.f5974s;
        CoroutineContext context = cVar.getContext();
        ge.t tVar = this.f5973r;
        if (b.i(tVar, context)) {
            this.f5975t = qVar;
            this.f4361i = 0;
            b.h(tVar, cVar.getContext(), this);
            return;
        }
        p0 a10 = u1.a();
        if (a10.f4390i >= 4294967296L) {
            this.f5975t = qVar;
            this.f4361i = 0;
            a10.Q(this);
            return;
        }
        a10.R(true);
        try {
            CoroutineContext context2 = cVar.getContext();
            Object c10 = v.c(context2, this.f5976u);
            try {
                cVar.resumeWith(obj);
                while (a10.T()) {
                }
            } finally {
                v.a(context2, c10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f5973r + ", " + a0.z(this.f5974s) + ']';
    }

    @Override // ge.i0
    public final ld.a c() {
        return this;
    }
}
