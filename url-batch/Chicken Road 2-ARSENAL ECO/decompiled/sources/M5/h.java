package M5;

import H5.AbstractC0157q;
import H5.AbstractC0161v;
import H5.AbstractC0165z;
import H5.C0156p;
import H5.E;
import H5.P;
import H5.p0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k5.AbstractC0479i;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class h extends E implements q5.d, InterfaceC0564d {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1595m = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0161v f1596i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0607c f1597j;

    /* renamed from: k, reason: collision with root package name */
    public Object f1598k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1599l;

    public h(AbstractC0161v abstractC0161v, AbstractC0607c abstractC0607c) {
        super(-1);
        this.f1596i = abstractC0161v;
        this.f1597j = abstractC0607c;
        this.f1598k = a.f1584c;
        this.f1599l = a.l(abstractC0607c.getContext());
    }

    @Override // H5.E
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0157q) {
            ((AbstractC0157q) obj).getClass();
            throw null;
        }
    }

    @Override // q5.d
    public final q5.d getCallerFrame() {
        AbstractC0607c abstractC0607c = this.f1597j;
        if (abstractC0607c != null) {
            return abstractC0607c;
        }
        return null;
    }

    @Override // o5.InterfaceC0564d
    public final InterfaceC0569i getContext() {
        return this.f1597j.getContext();
    }

    @Override // H5.E
    public final Object h() {
        Object obj = this.f1598k;
        this.f1598k = a.f1584c;
        return obj;
    }

    @Override // o5.InterfaceC0564d
    public final void resumeWith(Object obj) {
        AbstractC0607c abstractC0607c = this.f1597j;
        InterfaceC0569i context = abstractC0607c.getContext();
        Throwable a7 = AbstractC0479i.a(obj);
        Object c0156p = a7 == null ? obj : new C0156p(a7, false);
        AbstractC0161v abstractC0161v = this.f1596i;
        if (abstractC0161v.H()) {
            this.f1598k = c0156p;
            this.f1026h = 0;
            abstractC0161v.F(context, this);
            return;
        }
        P a8 = p0.a();
        if (a8.f1044h >= 4294967296L) {
            this.f1598k = c0156p;
            this.f1026h = 0;
            a8.J(this);
            return;
        }
        a8.L(true);
        try {
            InterfaceC0569i context2 = abstractC0607c.getContext();
            Object m4 = a.m(context2, this.f1599l);
            try {
                abstractC0607c.resumeWith(obj);
                while (a8.N()) {
                }
            } finally {
                a.g(context2, m4);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1596i + ", " + AbstractC0165z.q(this.f1597j) + ']';
    }

    @Override // H5.E
    public final InterfaceC0564d c() {
        return this;
    }
}
