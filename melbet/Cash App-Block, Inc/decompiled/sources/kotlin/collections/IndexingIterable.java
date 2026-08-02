package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class IndexingIterable implements Iterable, KMappedMarker {
    public final /* synthetic */ int $r8$classId;
    public final Object iteratorFactory;

    public /* synthetic */ IndexingIterable(Object obj, int i) {
        this.$r8$classId = i;
        this.iteratorFactory = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.$r8$classId;
        Object obj = this.iteratorFactory;
        switch (i) {
            case 0:
                return new ArrayIterator((Iterator) ((Function0) obj).invoke());
            default:
                return ArrayIteratorKt.iterator((Object[]) obj);
        }
    }
}
