package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class s extends r {

    public static final class a implements Iterator, g6.a {
        final /* synthetic */ Enumeration<T> $this_iterator;

        a(Enumeration<T> enumeration) {
            this.$this_iterator = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.$this_iterator.hasMoreElements();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            return this.$this_iterator.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static <T> Iterator<T> iterator(Enumeration<T> enumeration) {
        kotlin.jvm.internal.s.checkNotNullParameter(enumeration, "<this>");
        return new a(enumeration);
    }
}
