package defpackage;

import j$.time.Instant;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gqj implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gqj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        int i = this.b;
        return i != 0 ? i != 1 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Instant c;
        int i = this.b;
        if (i == 0) {
            return !((gqn) this.a).m((Map.Entry) obj);
        }
        if (i != 1) {
            int i2 = idn.b;
            return !((hfm) this.a).contains(((ido) ((Map.Entry) obj).getKey()).a);
        }
        lgx lgxVar = (lgx) obj;
        int i3 = lgxVar.c;
        if (i3 == 1) {
            jmh jmhVar = ((lfs) lgxVar.d).g;
            if (jmhVar == null) {
                jmhVar = jmh.a;
            }
            c = imk.c(jmhVar);
        } else {
            jmh jmhVar2 = (i3 == 3 ? (lhg) lgxVar.d : lhg.a).e;
            if (jmhVar2 == null) {
                jmhVar2 = jmh.a;
            }
            c = imk.c(jmhVar2);
        }
        return c.isAfter((Instant) this.a);
    }
}
