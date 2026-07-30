package p6;

import kotlin.Unit;
import kotlin.jvm.internal.E;
import n6.w0;

/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: s, reason: collision with root package name */
    public final EnumC0830a f7258s;

    public m(int i2, EnumC0830a enumC0830a) {
        super(i2);
        this.f7258s = enumC0830a;
        if (enumC0830a != EnumC0830a.f7215d) {
            if (i2 < 1) {
                throw new IllegalArgumentException(C4.p.h(i2, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + E.a(c.class).b() + " instead").toString());
        }
    }

    public final Object E(Object obj, boolean z7) {
        k kVar;
        m mVar;
        Object obj2;
        if (this.f7258s == EnumC0830a.f7217i) {
            Object i2 = super.i(obj);
            return (!(i2 instanceof i) || (i2 instanceof h)) ? i2 : Unit.f6114a;
        }
        l0.e eVar = e.f7236d;
        k kVar2 = (k) c.f7226n.get(this);
        while (true) {
            long andIncrement = c.f7222e.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean s7 = s(andIncrement, false);
            int i5 = e.f7234b;
            long j7 = i5;
            long j8 = j / j7;
            int i7 = (int) (j % j7);
            if (kVar2.f7854c != j8) {
                k a7 = c.a(this, j8, kVar2);
                if (a7 != null) {
                    kVar = a7;
                    obj2 = obj;
                    mVar = this;
                } else if (s7) {
                    return new h(p());
                }
            } else {
                kVar = kVar2;
                mVar = this;
                obj2 = obj;
            }
            int e7 = c.e(mVar, kVar, i7, obj2, j, eVar, s7);
            kVar2 = kVar;
            if (e7 == 0) {
                kVar2.a();
                return Unit.f6114a;
            }
            if (e7 == 1) {
                return Unit.f6114a;
            }
            if (e7 == 2) {
                if (s7) {
                    kVar2.h();
                    return new h(p());
                }
                w0 w0Var = eVar instanceof w0 ? (w0) eVar : null;
                if (w0Var != null) {
                    w0Var.a(kVar2, i7 + i5);
                }
                k((kVar2.f7854c * j7) + i7);
                return Unit.f6114a;
            }
            if (e7 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e7 == 4) {
                if (j < c.f7223i.get(this)) {
                    kVar2.a();
                }
                return new h(p());
            }
            if (e7 == 5) {
                kVar2.a();
            }
            obj = obj2;
        }
    }

    @Override // p6.c, p6.s
    public final Object f(V5.b bVar, Object obj) {
        if (E(obj, true) instanceof h) {
            throw p();
        }
        return Unit.f6114a;
    }

    @Override // p6.c, p6.s
    public final Object i(Object obj) {
        return E(obj, false);
    }

    @Override // p6.c
    public final boolean u() {
        return this.f7258s == EnumC0830a.f7216e;
    }
}
