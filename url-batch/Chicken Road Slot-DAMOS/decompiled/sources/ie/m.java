package ie;

import a2.r;
import ge.b2;
import kotlin.Unit;
import kotlin.collections.i0;
import te.a1;
import wd.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: y, reason: collision with root package name */
    public final a f4754y;

    public m(int i3, a aVar) {
        super(i3);
        this.f4754y = aVar;
        if (aVar == a.f4712d) {
            a1.c(c0.a(c.class).c(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i3 >= 1) {
            return;
        }
        r.h(n0.l.f(i3, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    public final Object E(Object obj, boolean z10) {
        k kVar;
        m mVar;
        Object obj2;
        if (this.f4754y == a.f4714i) {
            Object b10 = super.b(obj);
            return (!(b10 instanceof i) || (b10 instanceof h)) ? b10 : Unit.f5554a;
        }
        j5.f fVar = e.f4733d;
        k kVar2 = (k) c.f4723t.get(this);
        while (true) {
            long andIncrement = c.f4719e.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean s3 = s(false, andIncrement);
            int i3 = e.f4731b;
            long j3 = i3;
            long j10 = j / j3;
            int i10 = (int) (j % j3);
            if (kVar2.f5999c != j10) {
                k d10 = c.d(this, j10, kVar2);
                if (d10 != null) {
                    kVar = d10;
                    obj2 = obj;
                    mVar = this;
                } else if (s3) {
                    return new h(p());
                }
            } else {
                kVar = kVar2;
                mVar = this;
                obj2 = obj;
            }
            int f3 = c.f(mVar, kVar, i10, obj2, j, fVar, s3);
            kVar2 = kVar;
            if (f3 == 0) {
                kVar2.a();
                return Unit.f5554a;
            }
            if (f3 == 1) {
                return Unit.f5554a;
            }
            if (f3 == 2) {
                if (s3) {
                    kVar2.h();
                    return new h(p());
                }
                b2 b2Var = fVar instanceof b2 ? (b2) fVar : null;
                if (b2Var != null) {
                    b2Var.a(kVar2, i10 + i3);
                }
                k((kVar2.f5999c * j3) + i10);
                return Unit.f5554a;
            }
            if (f3 == 3) {
                i0.l("unexpected");
                return null;
            }
            if (f3 == 4) {
                if (j < c.f4720i.get(this)) {
                    kVar2.a();
                }
                return new h(p());
            }
            if (f3 == 5) {
                kVar2.a();
            }
            obj = obj2;
        }
    }

    @Override // ie.c, ie.o
    public final Object b(Object obj) {
        return E(obj, false);
    }

    @Override // ie.c, ie.o
    public final Object i(Object obj, ld.a aVar) {
        if (E(obj, true) instanceof h) {
            throw p();
        }
        return Unit.f5554a;
    }

    @Override // ie.c
    public final boolean u() {
        return this.f4754y == a.f4713e;
    }
}
