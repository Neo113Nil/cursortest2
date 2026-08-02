package j$.util.concurrent;

import j$.util.function.Predicate$CC;
import java.util.Collection;
import java.util.function.Predicate;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ t(Collection collection, int i) {
        this.a = i;
        this.b = collection;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Collection collection = this.b;
        switch (i) {
            case 0:
                j$.com.android.tools.r8.a aVar = ConcurrentLinkedQueue.a;
                return !collection.contains(obj);
            default:
                j$.com.android.tools.r8.a aVar2 = ConcurrentLinkedQueue.a;
                return collection.contains(obj);
        }
    }
}
