package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class eoe implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ eoe(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        if (i == 0) {
            eoc eocVar = ((eof) obj).a;
            throw null;
        }
        if (i != 1) {
            return i != 2 ? ((String) obj).startsWith(":") : (((lhf) obj).b & 2048) != 0;
        }
        return true;
    }
}
