package w1;

import c1.AbstractC0106c;
import c1.InterfaceC0107d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r1.AbstractC0366p;
import r1.AbstractC0369t;
import r1.AbstractC0374y;
import r1.C0361k;
import r1.C0362l;
import r1.E;
import r1.d0;

/* loaded from: classes.dex */
public final class g extends AbstractC0374y implements InterfaceC0107d, a1.d {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4473h = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0366p f4474d;
    public final AbstractC0106c e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4475f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4476g;

    public g(AbstractC0366p abstractC0366p, AbstractC0106c abstractC0106c) {
        super(-1);
        this.f4474d = abstractC0366p;
        this.e = abstractC0106c;
        this.f4475f = a.f4464c;
        Object q2 = abstractC0106c.getContext().q(0, w.f4503c);
        j1.h.b(q2);
        this.f4476g = q2;
    }

    @Override // r1.AbstractC0374y
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0362l) {
            ((C0362l) obj).f4081b.g(cancellationException);
        }
    }

    @Override // r1.AbstractC0374y
    public final a1.d c() {
        return this;
    }

    @Override // r1.AbstractC0374y
    public final Object g() {
        Object obj = this.f4475f;
        this.f4475f = a.f4464c;
        return obj;
    }

    @Override // c1.InterfaceC0107d
    public final InterfaceC0107d getCallerFrame() {
        AbstractC0106c abstractC0106c = this.e;
        if (abstractC0106c != null) {
            return abstractC0106c;
        }
        return null;
    }

    @Override // a1.d
    public final a1.i getContext() {
        return this.e.getContext();
    }

    @Override // a1.d
    public final void resumeWith(Object obj) {
        AbstractC0106c abstractC0106c = this.e;
        a1.i context = abstractC0106c.getContext();
        Throwable a2 = W0.f.a(obj);
        Object c0361k = a2 == null ? obj : new C0361k(a2, false);
        AbstractC0366p abstractC0366p = this.f4474d;
        if (abstractC0366p.E()) {
            this.f4475f = c0361k;
            this.f4099c = 0;
            abstractC0366p.D(context, this);
            return;
        }
        E a3 = d0.a();
        if (a3.f4040c >= 4294967296L) {
            this.f4475f = c0361k;
            this.f4099c = 0;
            X0.i iVar = a3.e;
            if (iVar == null) {
                iVar = new X0.i();
                a3.e = iVar;
            }
            iVar.addLast(this);
            return;
        }
        a3.H(true);
        try {
            a1.i context2 = abstractC0106c.getContext();
            Object m2 = a.m(context2, this.f4476g);
            try {
                abstractC0106c.resumeWith(obj);
                while (a3.I()) {
                }
            } finally {
                a.h(context2, m2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f4474d + ", " + AbstractC0369t.k(this.e) + ']';
    }
}
