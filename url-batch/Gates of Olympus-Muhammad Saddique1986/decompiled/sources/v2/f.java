package v2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q2.AbstractC0831s;
import q2.AbstractC0837y;
import q2.C0829p;
import q2.D;
import q2.O;
import q2.p0;

/* loaded from: classes.dex */
public final class f extends D implements X1.d, V1.d {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9794k = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0831s f9795g;

    /* renamed from: h, reason: collision with root package name */
    public final X1.c f9796h;

    /* renamed from: i, reason: collision with root package name */
    public Object f9797i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f9798j;

    public f(AbstractC0831s abstractC0831s, X1.c cVar) {
        super(-1);
        this.f9795g = abstractC0831s;
        this.f9796h = cVar;
        this.f9797i = a.f9783b;
        this.f9798j = a.m(cVar.t());
    }

    @Override // q2.D
    public final Object g() {
        Object obj = this.f9797i;
        this.f9797i = a.f9783b;
        return obj;
    }

    @Override // X1.d
    public final X1.d k() {
        return this.f9796h;
    }

    @Override // V1.d
    public final V1.i t() {
        return this.f9796h.t();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f9795g + ", " + AbstractC0837y.w(this.f9796h) + ']';
    }

    @Override // V1.d
    public final void u(Object obj) {
        Throwable a3 = R1.l.a(obj);
        Object c0829p = a3 == null ? obj : new C0829p(a3, false);
        X1.c cVar = this.f9796h;
        V1.i t3 = cVar.t();
        AbstractC0831s abstractC0831s = this.f9795g;
        if (abstractC0831s.F(t3)) {
            this.f9797i = c0829p;
            this.f7850f = 0;
            abstractC0831s.D(cVar.t(), this);
            return;
        }
        O a4 = p0.a();
        if (a4.L()) {
            this.f9797i = c0829p;
            this.f7850f = 0;
            a4.I(this);
            return;
        }
        a4.K(true);
        try {
            V1.i t4 = cVar.t();
            Object n3 = a.n(t4, this.f9798j);
            try {
                cVar.u(obj);
                while (a4.N()) {
                }
            } finally {
                a.i(t4, n3);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // q2.D
    public final V1.d c() {
        return this;
    }
}
