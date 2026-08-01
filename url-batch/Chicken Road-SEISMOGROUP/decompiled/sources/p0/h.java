package p0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.AbstractC0055p;
import k0.AbstractC0058t;
import k0.AbstractC0062x;
import k0.C0050k;
import k0.C0051l;
import k0.D;
import k0.a0;

/* loaded from: classes.dex */
public final class h extends AbstractC0062x implements Y.c, W.d {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1147i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0055p f1148e;

    /* renamed from: f, reason: collision with root package name */
    public final Y.b f1149f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1150g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1151h;

    public h(AbstractC0055p abstractC0055p, Y.b bVar) {
        super(-1);
        this.f1148e = abstractC0055p;
        this.f1149f = bVar;
        this.f1150g = AbstractC0084a.f1136c;
        W.i iVar = bVar.f454c;
        e0.h.b(iVar);
        this.f1151h = AbstractC0084a.l(iVar);
    }

    @Override // k0.AbstractC0062x
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0051l) {
            ((C0051l) obj).f927b.h(cancellationException);
        }
    }

    @Override // W.d
    public final void d(Object obj) {
        Y.b bVar = this.f1149f;
        W.i iVar = bVar.f454c;
        e0.h.b(iVar);
        Throwable a2 = U.d.a(obj);
        Object c0050k = a2 == null ? obj : new C0050k(a2, false);
        AbstractC0055p abstractC0055p = this.f1148e;
        if (abstractC0055p.g()) {
            this.f1150g = c0050k;
            this.f949d = 0;
            abstractC0055p.d(iVar, this);
            return;
        }
        D a3 = a0.a();
        if (a3.f880d >= 4294967296L) {
            this.f1150g = c0050k;
            this.f949d = 0;
            V.c cVar = a3.f882f;
            if (cVar == null) {
                cVar = new V.c();
                a3.f882f = cVar;
            }
            cVar.addLast(this);
            return;
        }
        a3.j(true);
        try {
            W.i iVar2 = bVar.f454c;
            e0.h.b(iVar2);
            Object m2 = AbstractC0084a.m(iVar2, this.f1151h);
            try {
                bVar.d(obj);
                while (a3.l()) {
                }
            } finally {
                AbstractC0084a.h(iVar2, m2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // Y.c
    public final Y.c g() {
        Y.b bVar = this.f1149f;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // W.d
    public final W.i i() {
        W.i iVar = this.f1149f.f454c;
        e0.h.b(iVar);
        return iVar;
    }

    @Override // k0.AbstractC0062x
    public final Object j() {
        Object obj = this.f1150g;
        this.f1150g = AbstractC0084a.f1136c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1148e + ", " + AbstractC0058t.h(this.f1149f) + ']';
    }

    @Override // k0.AbstractC0062x
    public final W.d c() {
        return this;
    }
}
