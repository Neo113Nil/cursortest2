package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m6.f2;
import m6.p0;
import m6.q0;
import m6.t0;
import m6.z0;

/* loaded from: classes.dex */
public final class f<T> extends t0<T> implements kotlin.coroutines.jvm.internal.e, y5.d<T> {

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18331m = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: i, reason: collision with root package name */
    public final m6.f0 f18332i;

    /* renamed from: j, reason: collision with root package name */
    public final y5.d<T> f18333j;

    /* renamed from: k, reason: collision with root package name */
    public Object f18334k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f18335l;

    /* JADX WARN: Multi-variable type inference failed */
    public f(m6.f0 f0Var, y5.d<? super T> dVar) {
        super(-1);
        y yVar;
        this.f18332i = f0Var;
        this.f18333j = dVar;
        yVar = g.f18340a;
        this.f18334k = yVar;
        this.f18335l = c0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    private final m6.l<?> o() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof m6.l) {
            return (m6.l) obj;
        }
        return null;
    }

    @Override // m6.t0
    public void b(Object obj, Throwable th) {
        if (obj instanceof m6.z) {
            ((m6.z) obj).f19368b.invoke(th);
        }
    }

    @Override // m6.t0
    public y5.d<T> c() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        y5.d<T> dVar = this.f18333j;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // y5.d
    public y5.g getContext() {
        return this.f18333j.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // m6.t0
    public Object l() {
        y yVar;
        y yVar2;
        Object obj = this.f18334k;
        if (p0.a()) {
            yVar2 = g.f18340a;
            if (!(obj != yVar2)) {
                throw new AssertionError();
            }
        }
        yVar = g.f18340a;
        this.f18334k = yVar;
        return obj;
    }

    public final void m() {
        while (this._reusableCancellableContinuation == g.f18341b) {
        }
    }

    public final m6.l<T> n() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = g.f18341b;
                return null;
            }
            if (obj instanceof m6.l) {
                if (androidx.work.impl.utils.futures.b.a(f18331m, this, obj, g.f18341b)) {
                    return (m6.l) obj;
                }
            } else if (obj != g.f18341b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(kotlin.jvm.internal.i.i("Inconsistent state ", obj).toString());
            }
        }
    }

    public final boolean p() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean q(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            y yVar = g.f18341b;
            if (kotlin.jvm.internal.i.a(obj, yVar)) {
                if (androidx.work.impl.utils.futures.b.a(f18331m, this, yVar, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.work.impl.utils.futures.b.a(f18331m, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        m();
        m6.l<?> o7 = o();
        if (o7 == null) {
            return;
        }
        o7.s();
    }

    @Override // y5.d
    public void resumeWith(Object obj) {
        y5.g context = this.f18333j.getContext();
        Object d7 = m6.c0.d(obj, null, 1, null);
        if (this.f18332i.Q(context)) {
            this.f18334k = d7;
            this.f19331h = 0;
            this.f18332i.P(context, this);
            return;
        }
        p0.a();
        z0 a7 = f2.f19284a.a();
        if (a7.X()) {
            this.f18334k = d7;
            this.f19331h = 0;
            a7.T(this);
            return;
        }
        a7.V(true);
        try {
            y5.g context2 = getContext();
            Object c7 = c0.c(context2, this.f18335l);
            try {
                this.f18333j.resumeWith(obj);
                v5.q qVar = v5.q.f22838a;
                while (a7.Z()) {
                }
            } finally {
                c0.a(context2, c7);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final Throwable s(m6.k<?> kVar) {
        y yVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            yVar = g.f18341b;
            if (obj != yVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(kotlin.jvm.internal.i.i("Inconsistent state ", obj).toString());
                }
                if (androidx.work.impl.utils.futures.b.a(f18331m, this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!androidx.work.impl.utils.futures.b.a(f18331m, this, yVar, kVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f18332i + ", " + q0.c(this.f18333j) + ']';
    }
}
