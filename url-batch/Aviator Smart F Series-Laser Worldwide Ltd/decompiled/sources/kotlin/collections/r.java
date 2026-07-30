package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class r extends CollectionsKt__CollectionsKt {

    public static final class a implements Iterable, g6.a {
        final /* synthetic */ f6.a $iterator;

        public a(f6.a aVar) {
            this.$iterator = aVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return (Iterator) this.$iterator.invoke();
        }
    }

    private static final <T> Iterable<T> Iterable(f6.a iterator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterator, "iterator");
        return new a(iterator);
    }

    public static <T> int collectionSizeOrDefault(Iterable<? extends T> iterable, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i8;
    }

    public static final <T> Integer collectionSizeOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static <T> List<T> flatten(Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            v.addAll(arrayList, it.next());
        }
        return arrayList;
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        int collectionSizeOrDefault = collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Pair<? extends T, ? extends R> pair : iterable) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return y5.h.to(arrayList, arrayList2);
    }
}
