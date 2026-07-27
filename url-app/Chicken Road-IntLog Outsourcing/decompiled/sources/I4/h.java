package I4;

import D4.AbstractC0020u;
import D4.AbstractC0024y;
import D4.C0016p;
import D4.C0017q;
import D4.D;
import D4.O;
import D4.p0;
import f4.AbstractC0432i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class h extends D implements m4.d, InterfaceC1218d {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1293h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0020u f1294d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1295c f1295e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1296f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1297g;

    public h(AbstractC0020u abstractC0020u, AbstractC1295c abstractC1295c) {
        super(-1);
        this.f1294d = abstractC0020u;
        this.f1295e = abstractC1295c;
        this.f1296f = a.f1282c;
        this.f1297g = a.m(abstractC1295c.getContext());
    }

    @Override // D4.D
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0017q) {
            ((C0017q) obj).f529b.invoke(cancellationException);
        }
    }

    @Override // m4.d
    public final m4.d getCallerFrame() {
        AbstractC1295c abstractC1295c = this.f1295e;
        if (abstractC1295c != null) {
            return abstractC1295c;
        }
        return null;
    }

    @Override // k4.InterfaceC1218d
    public final InterfaceC1223i getContext() {
        return this.f1295e.getContext();
    }

    @Override // D4.D
    public final Object i() {
        Object obj = this.f1296f;
        this.f1296f = a.f1282c;
        return obj;
    }

    @Override // k4.InterfaceC1218d
    public final void resumeWith(Object obj) {
        AbstractC1295c abstractC1295c = this.f1295e;
        InterfaceC1223i context = abstractC1295c.getContext();
        Throwable a6 = AbstractC0432i.a(obj);
        Object c0016p = a6 == null ? obj : new C0016p(a6, false);
        AbstractC0020u abstractC0020u = this.f1294d;
        if (abstractC0020u.E()) {
            this.f1296f = c0016p;
            this.f458c = 0;
            abstractC0020u.C(context, this);
            return;
        }
        O a7 = p0.a();
        if (a7.J()) {
            this.f1296f = c0016p;
            this.f458c = 0;
            a7.G(this);
            return;
        }
        a7.I(true);
        try {
            InterfaceC1223i context2 = abstractC1295c.getContext();
            Object n6 = a.n(context2, this.f1297g);
            try {
                abstractC1295c.resumeWith(obj);
                while (a7.L()) {
                }
            } finally {
                a.h(context2, n6);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1294d + ", " + AbstractC0024y.t(this.f1295e) + ']';
    }

    @Override // D4.D
    public final InterfaceC1218d c() {
        return this;
    }
}
