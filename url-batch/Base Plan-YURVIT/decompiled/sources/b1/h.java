package b1;

import W0.AbstractC0075o;
import W0.AbstractC0078s;
import W0.AbstractC0081v;
import W0.C0074n;
import W0.H;
import W0.h0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h extends W0.A implements I0.c, G0.d {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1748l = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0078s f1749h;

    /* renamed from: i, reason: collision with root package name */
    public final I0.b f1750i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1751j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1752k;

    public h(AbstractC0078s abstractC0078s, I0.b bVar) {
        super(-1);
        this.f1749h = abstractC0078s;
        this.f1750i = bVar;
        this.f1751j = AbstractC0115a.f1737c;
        this.f1752k = AbstractC0115a.k(bVar.e());
    }

    @Override // W0.A
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0075o) {
            ((AbstractC0075o) obj).getClass();
            throw null;
        }
    }

    @Override // I0.c
    public final I0.c d() {
        I0.b bVar = this.f1750i;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // G0.d
    public final G0.i e() {
        return this.f1750i.e();
    }

    @Override // G0.d
    public final void g(Object obj) {
        I0.b bVar = this.f1750i;
        G0.i e2 = bVar.e();
        Throwable a2 = D0.e.a(obj);
        Object c0074n = a2 == null ? obj : new C0074n(a2, false);
        AbstractC0078s abstractC0078s = this.f1749h;
        if (abstractC0078s.d()) {
            this.f1751j = c0074n;
            this.f904g = 0;
            abstractC0078s.c(e2, this);
            return;
        }
        H a3 = h0.a();
        if (a3.f913g >= 4294967296L) {
            this.f1751j = c0074n;
            this.f904g = 0;
            E0.d dVar = a3.f915i;
            if (dVar == null) {
                dVar = new E0.d();
                a3.f915i = dVar;
            }
            dVar.addLast(this);
            return;
        }
        a3.g(true);
        try {
            G0.i e3 = bVar.e();
            Object l2 = AbstractC0115a.l(e3, this.f1752k);
            try {
                bVar.g(obj);
                while (a3.l()) {
                }
            } finally {
                AbstractC0115a.f(e3, l2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // W0.A
    public final Object k() {
        Object obj = this.f1751j;
        this.f1751j = AbstractC0115a.f1737c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1749h + ", " + AbstractC0081v.j(this.f1750i) + ']';
    }

    @Override // W0.A
    public final G0.d c() {
        return this;
    }
}
