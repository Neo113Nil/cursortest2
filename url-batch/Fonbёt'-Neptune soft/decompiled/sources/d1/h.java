package d1;

import Y0.AbstractC0124s;
import Y0.AbstractC0127v;
import Y0.C0120n;
import Y0.C0121o;
import Y0.H;
import Y0.h0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h extends Y0.A implements J0.c, H0.d {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2075l = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0124s f2076h;

    /* renamed from: i, reason: collision with root package name */
    public final J0.b f2077i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2078j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f2079k;

    public h(AbstractC0124s abstractC0124s, J0.b bVar) {
        super(-1);
        this.f2076h = abstractC0124s;
        this.f2077i = bVar;
        this.f2078j = AbstractC0184a.f2064c;
        this.f2079k = AbstractC0184a.l(bVar.f());
    }

    @Override // Y0.A
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0121o) {
            ((C0121o) obj).f1221b.i(cancellationException);
        }
    }

    @Override // J0.c
    public final J0.c e() {
        J0.b bVar = this.f2077i;
        if (bVar instanceof J0.c) {
            return bVar;
        }
        return null;
    }

    @Override // H0.d
    public final H0.i f() {
        return this.f2077i.f();
    }

    @Override // H0.d
    public final void j(Object obj) {
        J0.b bVar = this.f2077i;
        H0.i f2 = bVar.f();
        Throwable a2 = F0.e.a(obj);
        Object c0120n = a2 == null ? obj : new C0120n(a2, false);
        AbstractC0124s abstractC0124s = this.f2076h;
        if (abstractC0124s.e()) {
            this.f2078j = c0120n;
            this.f1158g = 0;
            abstractC0124s.c(f2, this);
            return;
        }
        H a3 = h0.a();
        if (a3.f1167g >= 4294967296L) {
            this.f2078j = c0120n;
            this.f1158g = 0;
            G0.b bVar2 = a3.f1169i;
            if (bVar2 == null) {
                bVar2 = new G0.b();
                a3.f1169i = bVar2;
            }
            bVar2.addLast(this);
            return;
        }
        a3.h(true);
        try {
            H0.i f3 = bVar.f();
            Object m2 = AbstractC0184a.m(f3, this.f2079k);
            try {
                bVar.j(obj);
                while (a3.l()) {
                }
            } finally {
                AbstractC0184a.g(f3, m2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // Y0.A
    public final Object k() {
        Object obj = this.f2078j;
        this.f2078j = AbstractC0184a.f2064c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f2076h + ", " + AbstractC0127v.k(this.f2077i) + ']';
    }

    @Override // Y0.A
    public final H0.d d() {
        return this;
    }
}
