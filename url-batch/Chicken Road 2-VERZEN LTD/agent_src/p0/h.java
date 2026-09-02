package p0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.AbstractC0057p;
import k0.AbstractC0060t;
import k0.AbstractC0064x;
import k0.C0052k;
import k0.C0053l;
import k0.D;
import k0.a0;

/* loaded from: classes.dex */
public final class h extends AbstractC0064x implements Y.c, W.d {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1139i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0057p f1140e;

    /* renamed from: f, reason: collision with root package name */
    public final Y.b f1141f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1142g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1143h;

    public h(AbstractC0057p abstractC0057p, Y.b bVar) {
        super(-1);
        this.f1140e = abstractC0057p;
        this.f1141f = bVar;
        this.f1142g = AbstractC0090a.f1128c;
        W.i iVar = bVar.f399c;
        e0.h.b(iVar);
        this.f1143h = AbstractC0090a.l(iVar);
    }

    @Override // k0.AbstractC0064x
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0053l) {
            ((C0053l) obj).f874b.h(cancellationException);
        }
    }

    @Override // W.d
    public final void d(Object obj) {
        Y.b bVar = this.f1141f;
        W.i iVar = bVar.f399c;
        e0.h.b(iVar);
        Throwable a2 = U.d.a(obj);
        Object c0052k = a2 == null ? obj : new C0052k(a2, false);
        AbstractC0057p abstractC0057p = this.f1140e;
        if (abstractC0057p.g()) {
            this.f1142g = c0052k;
            this.f896d = 0;
            abstractC0057p.d(iVar, this);
            return;
        }
        D a3 = a0.a();
        if (a3.f827d >= 4294967296L) {
            this.f1142g = c0052k;
            this.f896d = 0;
            V.c cVar = a3.f829f;
            if (cVar == null) {
                cVar = new V.c();
                a3.f829f = cVar;
            }
            cVar.addLast(this);
            return;
        }
        a3.j(true);
        try {
            W.i iVar2 = bVar.f399c;
            e0.h.b(iVar2);
            Object m2 = AbstractC0090a.m(iVar2, this.f1143h);
            try {
                bVar.d(obj);
                while (a3.l()) {
                }
            } finally {
                AbstractC0090a.h(iVar2, m2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // Y.c
    public final Y.c g() {
        Y.b bVar = this.f1141f;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // W.d
    public final W.i i() {
        W.i iVar = this.f1141f.f399c;
        e0.h.b(iVar);
        return iVar;
    }

    @Override // k0.AbstractC0064x
    public final Object j() {
        Object obj = this.f1142g;
        this.f1142g = AbstractC0090a.f1128c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1140e + ", " + AbstractC0060t.h(this.f1141f) + ']';
    }

    @Override // k0.AbstractC0064x
    public final W.d c() {
        return this;
    }
}
