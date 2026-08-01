package s1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o1.AbstractC0296o;
import o1.AbstractC0299s;
import o1.AbstractC0304x;
import o1.C0291j;
import o1.C0292k;
import o1.D;
import o1.c0;

/* loaded from: classes.dex */
public final class f extends AbstractC0304x implements Z0.b, X0.d {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public final AbstractC0296o d;

    /* renamed from: e, reason: collision with root package name */
    public final Z0.e f3647e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3648f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3649g;

    public f(AbstractC0296o abstractC0296o, Z0.e eVar) {
        super(-1);
        this.d = abstractC0296o;
        this.f3647e = eVar;
        this.f3648f = a.f3640b;
        X0.i iVar = eVar.f1173b;
        g1.f.b(iVar);
        this.f3649g = a.f(iVar);
    }

    @Override // o1.AbstractC0304x
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0292k) {
            ((C0292k) obj).f3350b.g(cancellationException);
        }
    }

    @Override // X0.d
    public final void b(Object obj) {
        Z0.e eVar = this.f3647e;
        X0.i iVar = eVar.f1173b;
        g1.f.b(iVar);
        Throwable a2 = U0.f.a(obj);
        Object c0291j = a2 == null ? obj : new C0291j(a2, false);
        AbstractC0296o abstractC0296o = this.d;
        if (abstractC0296o.z()) {
            this.f3648f = c0291j;
            this.f3368c = 0;
            abstractC0296o.y(iVar, this);
            return;
        }
        D a3 = c0.a();
        if (a3.f3308c >= 4294967296L) {
            this.f3648f = c0291j;
            this.f3368c = 0;
            V0.c cVar = a3.f3309e;
            if (cVar == null) {
                cVar = new V0.c();
                a3.f3309e = cVar;
            }
            cVar.addLast(this);
            return;
        }
        a3.C(true);
        try {
            X0.i iVar2 = eVar.f1173b;
            g1.f.b(iVar2);
            Object g2 = a.g(iVar2, this.f3649g);
            try {
                eVar.b(obj);
                while (a3.D()) {
                }
            } finally {
                a.b(iVar2, g2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // o1.AbstractC0304x
    public final X0.d c() {
        return this;
    }

    @Override // Z0.b
    public final Z0.b e() {
        Z0.e eVar = this.f3647e;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    @Override // X0.d
    public final X0.i h() {
        X0.i iVar = this.f3647e.f1173b;
        g1.f.b(iVar);
        return iVar;
    }

    @Override // o1.AbstractC0304x
    public final Object i() {
        Object obj = this.f3648f;
        this.f3648f = a.f3640b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + AbstractC0299s.k(this.f3647e) + ']';
    }
}
