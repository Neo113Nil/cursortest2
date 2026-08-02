package kotlin.collections;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class AbstractList extends AbstractCollection implements List {
    public static final Companion Companion = new Companion(null);

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void checkBoundsIndexes$kotlin_stdlib(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                Path$$ExternalSyntheticBUOutline0.m(i3, Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "startIndex: ", ", endIndex: ", ", size: "));
            } else {
                if (i <= i2) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("startIndex: ", i, i2, " > endIndex: "));
            }
        }

        public static void checkElementIndex$kotlin_stdlib(int i, int i2) {
            if (i < 0 || i >= i2) {
                Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("index: ", i, i2, ", size: "));
            }
        }

        public static void checkPositionIndex$kotlin_stdlib(int i, int i2) {
            if (i < 0 || i > i2) {
                Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("index: ", i, i2, ", size: "));
            }
        }

        public static void checkRangeIndexes$kotlin_stdlib(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                Path$$ExternalSyntheticBUOutline0.m(i3, Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
            } else {
                if (i <= i2) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("fromIndex: ", i, i2, " > toIndex: "));
            }
        }

        public static int newCapacity$kotlin_stdlib(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }
    }

    /* loaded from: classes9.dex */
    public final class ListIteratorImpl extends ArrayIterator implements ListIterator {
        public ListIteratorImpl(int i) {
            super(AbstractList.this);
            Companion companion = AbstractList.Companion;
            int size = AbstractList.this.getSize();
            companion.getClass();
            Companion.checkPositionIndex$kotlin_stdlib(i, size);
            this.index = i;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            if (!hasPrevious()) {
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            int i = this.index - 1;
            this.index = i;
            return AbstractList.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        Companion.getClass();
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.areEqual(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Companion.getClass();
        Iterator<E> it = iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new ArrayIterator(this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.areEqual(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new ListIteratorImpl(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return new MovingSubList(this, i, i2);
    }

    public ListIterator listIterator(int i) {
        return new ListIteratorImpl(i);
    }
}
