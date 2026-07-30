package h7;

import c7.a0;
import c7.f0;
import c7.p1;
import c7.q0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends f0 implements j6.d, h6.d {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4676m = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: i, reason: collision with root package name */
    public final c7.t f4677i;

    /* renamed from: j, reason: collision with root package name */
    public final j6.c f4678j;

    /* renamed from: k, reason: collision with root package name */
    public Object f4679k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4680l;

    public f(c7.t tVar, j6.c cVar) {
        super(-1);
        this.f4677i = tVar;
        this.f4678j = cVar;
        this.f4679k = a.f4665b;
        this.f4680l = a.k(cVar.getContext());
    }

    @Override // j6.d
    public final j6.d getCallerFrame() {
        return this.f4678j;
    }

    @Override // h6.d
    public final h6.i getContext() {
        return this.f4678j.getContext();
    }

    @Override // c7.f0
    public final Object h() {
        Object obj = this.f4679k;
        this.f4679k = a.f4665b;
        return obj;
    }

    @Override // h6.d
    public final void resumeWith(Object obj) {
        Throwable a3 = d6.m.a(obj);
        Object pVar = a3 == null ? obj : new c7.p(a3, false);
        j6.c cVar = this.f4678j;
        h6.i context = cVar.getContext();
        c7.t tVar = this.f4677i;
        if (tVar.X(context)) {
            this.f4679k = pVar;
            this.f1691h = 0;
            tVar.V(cVar.getContext(), this);
            return;
        }
        q0 a9 = p1.a();
        if (a9.f1732h >= 4294967296L) {
            this.f4679k = pVar;
            this.f1691h = 0;
            a9.a0(this);
            return;
        }
        a9.c0(true);
        try {
            h6.i context2 = cVar.getContext();
            Object l8 = a.l(context2, this.f4680l);
            try {
                cVar.resumeWith(obj);
                while (a9.e0()) {
                }
            } finally {
                a.g(context2, l8);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f4677i + ", " + a0.u(this.f4678j) + ']';
    }

    @Override // c7.f0
    public final h6.d c() {
        return this;
    }
}
