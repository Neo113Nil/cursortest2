package p2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.AbstractC0546s;
import k2.AbstractC0552y;
import k2.C0544p;
import k2.D;
import k2.O;
import k2.p0;

/* loaded from: classes.dex */
public final class f extends D implements R1.d, P1.d {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6773k = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0546s f6774g;

    /* renamed from: h, reason: collision with root package name */
    public final R1.c f6775h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6776i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f6777j;

    public f(AbstractC0546s abstractC0546s, R1.c cVar) {
        super(-1);
        this.f6774g = abstractC0546s;
        this.f6775h = cVar;
        this.f6776i = a.f6762b;
        this.f6777j = a.m(cVar.getContext());
    }

    @Override // k2.D
    public final Object g() {
        Object obj = this.f6776i;
        this.f6776i = a.f6762b;
        return obj;
    }

    @Override // R1.d
    public final R1.d getCallerFrame() {
        return this.f6775h;
    }

    @Override // P1.d
    public final P1.i getContext() {
        return this.f6775h.getContext();
    }

    @Override // P1.d
    public final void resumeWith(Object obj) {
        Throwable a3 = L1.m.a(obj);
        Object c0544p = a3 == null ? obj : new C0544p(a3, false);
        R1.c cVar = this.f6775h;
        P1.i context = cVar.getContext();
        AbstractC0546s abstractC0546s = this.f6774g;
        if (abstractC0546s.Q(context)) {
            this.f6776i = c0544p;
            this.f5311f = 0;
            abstractC0546s.P(cVar.getContext(), this);
            return;
        }
        O a4 = p0.a();
        if (a4.W()) {
            this.f6776i = c0544p;
            this.f5311f = 0;
            a4.T(this);
            return;
        }
        a4.V(true);
        try {
            P1.i context2 = cVar.getContext();
            Object n3 = a.n(context2, this.f6777j);
            try {
                cVar.resumeWith(obj);
                while (a4.Y()) {
                }
            } finally {
                a.i(context2, n3);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f6774g + ", " + AbstractC0552y.v(this.f6775h) + ']';
    }

    @Override // k2.D
    public final P1.d c() {
        return this;
    }
}
