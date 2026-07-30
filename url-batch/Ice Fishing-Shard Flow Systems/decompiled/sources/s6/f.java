package s6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import n6.AbstractC0767E;
import n6.AbstractC0786t;
import n6.AbstractC0792z;
import n6.C0784q;
import n6.P;
import n6.o0;

/* loaded from: classes.dex */
public final class f extends AbstractC0767E implements X5.d, V5.b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7826p = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0786t f7827l;

    /* renamed from: m, reason: collision with root package name */
    public final X5.c f7828m;

    /* renamed from: n, reason: collision with root package name */
    public Object f7829n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f7830o;

    public f(AbstractC0786t abstractC0786t, X5.c cVar) {
        super(-1);
        this.f7827l = abstractC0786t;
        this.f7828m = cVar;
        this.f7829n = AbstractC0898a.f7819b;
        this.f7830o = u.b(cVar.getContext());
    }

    @Override // X5.d
    public final X5.d getCallerFrame() {
        return this.f7828m;
    }

    @Override // V5.b
    public final CoroutineContext getContext() {
        return this.f7828m.getContext();
    }

    @Override // n6.AbstractC0767E
    public final Object i() {
        Object obj = this.f7829n;
        this.f7829n = AbstractC0898a.f7819b;
        return obj;
    }

    @Override // V5.b
    public final void resumeWith(Object obj) {
        Throwable a7 = R5.n.a(obj);
        Object c0784q = a7 == null ? obj : new C0784q(a7, false);
        X5.c cVar = this.f7828m;
        CoroutineContext context = cVar.getContext();
        AbstractC0786t abstractC0786t = this.f7827l;
        if (abstractC0786t.G(context)) {
            this.f7829n = c0784q;
            this.f7010i = 0;
            abstractC0786t.E(cVar.getContext(), this);
            return;
        }
        P a8 = o0.a();
        if (a8.f7027i >= 4294967296L) {
            this.f7829n = c0784q;
            this.f7010i = 0;
            a8.J(this);
            return;
        }
        a8.L(true);
        try {
            CoroutineContext context2 = cVar.getContext();
            Object c7 = u.c(context2, this.f7830o);
            try {
                cVar.resumeWith(obj);
                Unit unit = Unit.f6114a;
                while (a8.N()) {
                }
            } finally {
                u.a(context2, c7);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f7827l + ", " + AbstractC0792z.r(this.f7828m) + ']';
    }

    @Override // n6.AbstractC0767E
    public final V5.b d() {
        return this;
    }
}
