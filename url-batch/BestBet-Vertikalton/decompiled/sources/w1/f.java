package w1;

import d1.AbstractC0095c;
import d1.InterfaceC0096d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s1.AbstractC0332o;
import s1.AbstractC0335s;
import s1.AbstractC0340x;
import s1.C0327j;
import s1.C0328k;
import s1.D;
import s1.c0;

/* loaded from: classes.dex */
public final class f extends AbstractC0340x implements InterfaceC0096d, b1.d {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public final AbstractC0332o d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0095c f4496e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4497f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4498g;

    public f(AbstractC0332o abstractC0332o, AbstractC0095c abstractC0095c) {
        super(-1);
        this.d = abstractC0332o;
        this.f4496e = abstractC0095c;
        this.f4497f = a.f4489b;
        b1.j jVar = abstractC0095c.f2474b;
        k1.e.b(jVar);
        this.f4498g = a.f(jVar);
    }

    @Override // s1.AbstractC0340x
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0328k) {
            ((C0328k) obj).f4053b.g(cancellationException);
        }
    }

    @Override // b1.d
    public final void b(Object obj) {
        AbstractC0095c abstractC0095c = this.f4496e;
        b1.j jVar = abstractC0095c.f2474b;
        k1.e.b(jVar);
        Throwable a2 = X0.e.a(obj);
        Object c0327j = a2 == null ? obj : new C0327j(a2, false);
        AbstractC0332o abstractC0332o = this.d;
        if (abstractC0332o.s()) {
            this.f4497f = c0327j;
            this.f4071c = 0;
            abstractC0332o.r(jVar, this);
            return;
        }
        D a3 = c0.a();
        if (a3.f4011c >= 4294967296L) {
            this.f4497f = c0327j;
            this.f4071c = 0;
            Y0.h hVar = a3.f4012e;
            if (hVar == null) {
                hVar = new Y0.h();
                a3.f4012e = hVar;
            }
            hVar.addLast(this);
            return;
        }
        a3.v(true);
        try {
            b1.j jVar2 = abstractC0095c.f2474b;
            k1.e.b(jVar2);
            Object g2 = a.g(jVar2, this.f4498g);
            try {
                abstractC0095c.b(obj);
                while (a3.w()) {
                }
            } finally {
                a.b(jVar2, g2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // s1.AbstractC0340x
    public final b1.d c() {
        return this;
    }

    @Override // d1.InterfaceC0096d
    public final InterfaceC0096d e() {
        AbstractC0095c abstractC0095c = this.f4496e;
        if (abstractC0095c != null) {
            return abstractC0095c;
        }
        return null;
    }

    @Override // b1.d
    public final b1.j h() {
        b1.j jVar = this.f4496e.f2474b;
        k1.e.b(jVar);
        return jVar;
    }

    @Override // s1.AbstractC0340x
    public final Object i() {
        Object obj = this.f4497f;
        this.f4497f = a.f4489b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + AbstractC0335s.j(this.f4496e) + ']';
    }
}
