package Y2;

import A.AbstractC0017m;
import M2.F;
import W2.C0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y2.C1331f;

/* loaded from: classes.dex */
public final class o extends e {

    /* renamed from: r, reason: collision with root package name */
    public final a f4446r;

    public o(int i2, a aVar, Function1 function1) {
        super(i2, function1);
        this.f4446r = aVar;
        if (aVar != a.f4398d) {
            if (i2 < 1) {
                throw new IllegalArgumentException(AbstractC0017m.h(i2, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + F.a(e.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return kotlin.Unit.f7487a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(Object obj, boolean z4) {
        m mVar;
        j jVar;
        Function1 function1;
        I1.b b4;
        if (this.f4446r == a.f4400i) {
            Object o4 = super.o(obj);
            if (!(o4 instanceof k) || (o4 instanceof j)) {
                return o4;
            }
            if (!z4 || (function1 = this.f4418e) == null || (b4 = b3.a.b(function1, obj, null)) == null) {
                return Unit.f7487a;
            }
            throw b4;
        }
        k1.l lVar = g.f4423d;
        m mVar2 = (m) e.f4412m.get(this);
        while (true) {
            long andIncrement = e.f4408i.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean v4 = v(andIncrement, false);
            int i2 = g.f4421b;
            long j5 = i2;
            long j6 = j4 / j5;
            int i4 = (int) (j4 % j5);
            if (mVar2.f5686c != j6) {
                m b5 = e.b(this, j6, mVar2);
                if (b5 != null) {
                    mVar = b5;
                } else if (v4) {
                    jVar = new j(r());
                    break;
                }
            } else {
                mVar = mVar2;
            }
            int d4 = e.d(this, mVar, i4, obj, j4, lVar, v4);
            if (d4 == 0) {
                mVar.a();
                break;
            }
            if (d4 == 1) {
                break;
            }
            if (d4 != 2) {
                if (d4 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (d4 != 4) {
                    if (d4 == 5) {
                        mVar.a();
                    }
                    mVar2 = mVar;
                } else {
                    if (j4 < e.f4409j.get(this)) {
                        mVar.a();
                    }
                    jVar = new j(r());
                }
            } else {
                if (!v4) {
                    C0 c02 = lVar instanceof C0 ? (C0) lVar : null;
                    if (c02 != null) {
                        c02.a(mVar, i4 + i2);
                    }
                    j((mVar.f5686c * j5) + i4);
                    return Unit.f7487a;
                }
                mVar.h();
                jVar = new j(r());
            }
        }
        return jVar;
    }

    @Override // Y2.e, Y2.s
    public final Object o(Object obj) {
        return G(obj, false);
    }

    @Override // Y2.e, Y2.s
    public final Object t(C2.a aVar, Object obj) {
        I1.b b4;
        if (!(G(obj, true) instanceof j)) {
            return Unit.f7487a;
        }
        Function1 function1 = this.f4418e;
        if (function1 == null || (b4 = b3.a.b(function1, obj, null)) == null) {
            throw r();
        }
        C1331f.a(b4, r());
        throw b4;
    }

    @Override // Y2.e
    public final boolean w() {
        return this.f4446r == a.f4399e;
    }
}
