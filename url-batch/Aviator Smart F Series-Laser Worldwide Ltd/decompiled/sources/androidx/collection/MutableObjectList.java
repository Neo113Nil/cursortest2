package androidx.collection;

import androidx.annotation.IntRange;
import f6.l;
import g6.e;
import g6.f;
import j6.m;
import j6.v;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    private static final class MutableObjectListIterator<T> implements ListIterator<T>, f {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> list, int i8) {
            s.checkNotNullParameter(list, "list");
            this.list = list;
            this.prevIndex = i8 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t7) {
            List<T> list = this.list;
            int i8 = this.prevIndex + 1;
            this.prevIndex = i8;
            list.add(i8, t7);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i8 = this.prevIndex + 1;
            this.prevIndex = i8;
            return list.get(i8);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i8 = this.prevIndex;
            this.prevIndex = i8 - 1;
            return list.get(i8);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T t7) {
            this.list.set(this.prevIndex, t7);
        }
    }

    private static final class ObjectListMutableList<T> implements List<T>, e {
        private final MutableObjectList<T> objectList;

        public ObjectListMutableList(MutableObjectList<T> objectList) {
            s.checkNotNullParameter(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t7) {
            return this.objectList.add(t7);
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection<? extends T> elements) {
            s.checkNotNullParameter(elements, "elements");
            return this.objectList.addAll(i8, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.objectList.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            s.checkNotNullParameter(elements, "elements");
            return this.objectList.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int i8) {
            ObjectListKt.checkIndex(this, i8);
            return this.objectList.get(i8);
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.objectList.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.objectList.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i8) {
            return removeAt(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            s.checkNotNullParameter(elements, "elements");
            return this.objectList.removeAll(elements);
        }

        public T removeAt(int i8) {
            ObjectListKt.checkIndex(this, i8);
            return this.objectList.removeAt(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            s.checkNotNullParameter(elements, "elements");
            return this.objectList.retainAll((Collection<? extends T>) elements);
        }

        @Override // java.util.List
        public T set(int i8, T t7) {
            ObjectListKt.checkIndex(this, i8);
            return this.objectList.set(i8, t7);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i8, int i9) {
            ObjectListKt.checkSubIndex(this, i8, i9);
            return new SubList(this, i8, i9);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return n.toArray(this);
        }

        @Override // java.util.List
        public void add(int i8, T t7) {
            this.objectList.add(i8, t7);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            s.checkNotNullParameter(elements, "elements");
            return this.objectList.addAll(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i8) {
            return new MutableObjectListIterator(this, i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.objectList.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            s.checkNotNullParameter(array, "array");
            return (T[]) n.toArray(this, array);
        }
    }

    private static final class SubList<T> implements List<T>, e {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i8, int i9) {
            s.checkNotNullParameter(list, "list");
            this.list = list;
            this.start = i8;
            this.end = i9;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t7) {
            List<T> list = this.list;
            int i8 = this.end;
            this.end = i8 + 1;
            list.add(i8, t7);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection<? extends T> elements) {
            s.checkNotNullParameter(elements, "elements");
            this.list.addAll(i8 + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i8 = this.end - 1;
            int i9 = this.start;
            if (i9 <= i8) {
                while (true) {
                    this.list.remove(i8);
                    if (i8 == i9) {
                        break;
                    } else {
                        i8--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i8 = this.end;
            for (int i9 = this.start; i9 < i8; i9++) {
                if (s.areEqual(this.list.get(i9), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            s.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i8) {
            ObjectListKt.checkIndex(this, i8);
            return this.list.get(i8 + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i8 = this.end;
            for (int i9 = this.start; i9 < i8; i9++) {
                if (s.areEqual(this.list.get(i9), obj)) {
                    return i9 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i8 = this.end - 1;
            int i9 = this.start;
            if (i9 > i8) {
                return -1;
            }
            while (!s.areEqual(this.list.get(i8), obj)) {
                if (i8 == i9) {
                    return -1;
                }
                i8--;
            }
            return i8 - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i8) {
            return removeAt(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            s.checkNotNullParameter(elements, "elements");
            int i8 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i8 != this.end;
        }

        public T removeAt(int i8) {
            ObjectListKt.checkIndex(this, i8);
            this.end--;
            return this.list.remove(i8 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            s.checkNotNullParameter(elements, "elements");
            int i8 = this.end;
            int i9 = i8 - 1;
            int i10 = this.start;
            if (i10 <= i9) {
                while (true) {
                    if (!elements.contains(this.list.get(i9))) {
                        this.list.remove(i9);
                        this.end--;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9--;
                }
            }
            return i8 != this.end;
        }

        @Override // java.util.List
        public T set(int i8, T t7) {
            ObjectListKt.checkIndex(this, i8);
            return this.list.set(i8 + this.start, t7);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i8, int i9) {
            ObjectListKt.checkSubIndex(this, i8, i9);
            return new SubList(this, i8, i9);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return n.toArray(this);
        }

        @Override // java.util.List
        public void add(int i8, T t7) {
            this.list.add(i8 + this.start, t7);
            this.end++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i8) {
            return new MutableObjectListIterator(this, i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i8 = this.end;
            for (int i9 = this.start; i9 < i8; i9++) {
                if (s.areEqual(this.list.get(i9), obj)) {
                    this.list.remove(i9);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            s.checkNotNullParameter(array, "array");
            return (T[]) n.toArray(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            s.checkNotNullParameter(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = mutableObjectList._size;
        }
        mutableObjectList.trim(i8);
    }

    public final boolean add(E e8) {
        ensureCapacity(this._size + 1);
        Object[] objArr = this.content;
        int i8 = this._size;
        objArr[i8] = e8;
        this._size = i8 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i8, E[] elements) {
        int i9;
        s.checkNotNullParameter(elements, "elements");
        if (i8 < 0 || i8 > (i9 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(i9 + elements.length);
        Object[] objArr = this.content;
        int i10 = this._size;
        if (i8 != i10) {
            k.copyInto(objArr, objArr, elements.length + i8, i8, i10);
        }
        k.copyInto$default(elements, objArr, i8, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    @Override // androidx.collection.ObjectList
    public List<E> asList() {
        return asMutableList();
    }

    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList<E> objectListMutableList2 = new ObjectListMutableList<>(this);
        this.list = objectListMutableList2;
        return objectListMutableList2;
    }

    public final void clear() {
        k.fill(this.content, (Object) null, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int i8) {
        Object[] objArr = this.content;
        if (objArr.length < i8) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i8, (objArr.length * 3) / 2));
            s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(E e8) {
        remove(e8);
    }

    public final void plusAssign(ObjectList<E> elements) {
        s.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements._size);
        k.copyInto(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    public final boolean remove(E e8) {
        int indexOf = indexOf(e8);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(E[] elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        for (E e8 : elements) {
            remove(e8);
        }
        return i8 != this._size;
    }

    public final E removeAt(@IntRange(from = 0) int i8) {
        int i9;
        if (i8 < 0 || i8 >= (i9 = this._size)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index ");
            sb.append(i8);
            sb.append(" must be in 0..");
            sb.append(this._size - 1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        Object[] objArr = this.content;
        E e8 = (E) objArr[i8];
        if (i8 != i9 - 1) {
            k.copyInto(objArr, objArr, i8, i8 + 1, i9);
        }
        int i10 = this._size - 1;
        this._size = i10;
        objArr[i10] = null;
        return e8;
    }

    public final void removeIf(l predicate) {
        m until;
        s.checkNotNullParameter(predicate, "predicate");
        int i8 = this._size;
        Object[] objArr = this.content;
        int i9 = 0;
        until = v.until(0, i8);
        int first = until.getFirst();
        int last = until.getLast();
        if (first <= last) {
            while (true) {
                objArr[first - i9] = objArr[first];
                if (((Boolean) predicate.invoke(objArr[first])).booleanValue()) {
                    i9++;
                }
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        k.fill(objArr, (Object) null, i8 - i9, i8);
        this._size -= i9;
    }

    public final void removeRange(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        int i10;
        if (i8 < 0 || i8 > (i10 = this._size) || i9 < 0 || i9 > i10) {
            throw new IndexOutOfBoundsException("Start (" + i8 + ") and end (" + i9 + ") must be in 0.." + this._size);
        }
        if (i9 < i8) {
            throw new IllegalArgumentException("Start (" + i8 + ") is more than end (" + i9 + ')');
        }
        if (i9 != i8) {
            if (i9 < i10) {
                Object[] objArr = this.content;
                k.copyInto(objArr, objArr, i8, i9, i10);
            }
            int i11 = this._size;
            int i12 = i11 - (i9 - i8);
            k.fill(this.content, (Object) null, i12, i11);
            this._size = i12;
        }
    }

    public final boolean retainAll(E[] elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        Object[] objArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (ArraysKt___ArraysKt.indexOf(elements, objArr[i9]) < 0) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final E set(@IntRange(from = 0) int i8, E e8) {
        if (i8 >= 0 && i8 < this._size) {
            Object[] objArr = this.content;
            E e9 = (E) objArr[i8];
            objArr[i8] = e8;
            return e9;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i8);
        sb.append(" must be between 0 .. ");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void trim(int i8) {
        int max = Math.max(i8, this._size);
        Object[] objArr = this.content;
        if (objArr.length > max) {
            Object[] copyOf = Arrays.copyOf(objArr, max);
            s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public /* synthetic */ MutableObjectList(int i8, int i9, o oVar) {
        this((i9 & 1) != 0 ? 16 : i8);
    }

    public final void minusAssign(List<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i8 = 0; i8 < size; i8++) {
            remove(elements.get(i8));
        }
    }

    public MutableObjectList(int i8) {
        super(i8, null);
    }

    public final void add(@IntRange(from = 0) int i8, E e8) {
        int i9;
        if (i8 >= 0 && i8 <= (i9 = this._size)) {
            ensureCapacity(i9 + 1);
            Object[] objArr = this.content;
            int i10 = this._size;
            if (i8 != i10) {
                k.copyInto(objArr, objArr, i8 + 1, i8, i10);
            }
            objArr[i8] = e8;
            this._size++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final boolean removeAll(ObjectList<E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        minusAssign((ObjectList) elements);
        return i8 != this._size;
    }

    public final boolean removeAll(ScatterSet<E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        minusAssign((ScatterSet) elements);
        return i8 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ObjectList<E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        Object[] objArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (!elements.contains(objArr[i9])) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final void minusAssign(E[] elements) {
        s.checkNotNullParameter(elements, "elements");
        for (E e8 : elements) {
            remove(e8);
        }
    }

    public final boolean removeAll(List<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        minusAssign((List) elements);
        return i8 != this._size;
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        minusAssign((Iterable) elements);
        return i8 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> elements) {
        s.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i8 = elements._size;
        for (int i9 = 0; i9 < i8; i9++) {
            remove(objArr[i9]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> elements) {
        s.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements.getSize());
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        add(objArr[(i8 << 3) + i10]);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final boolean removeAll(kotlin.sequences.m elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        minusAssign(elements);
        return i8 != this._size;
    }

    public final boolean retainAll(Collection<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        Object[] objArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (!elements.contains(objArr[i9])) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i8, Collection<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        if (i8 >= 0 && i8 <= this._size) {
            int i9 = 0;
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements.size());
            Object[] objArr = this.content;
            if (i8 != this._size) {
                k.copyInto(objArr, objArr, elements.size() + i8, i8, this._size);
            }
            for (Object obj : elements) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                objArr[i9 + i8] = obj;
                i9 = i10;
            }
            this._size += elements.size();
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final boolean retainAll(Iterable<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        Object[] objArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (!CollectionsKt___CollectionsKt.contains(elements, objArr[i9])) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> elements) {
        s.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        remove(objArr[(i8 << 3) + i10]);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final boolean retainAll(kotlin.sequences.m elements) {
        boolean contains;
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        Object[] objArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            contains = SequencesKt___SequencesKt.contains(elements, objArr[i9]);
            if (!contains) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final void plusAssign(E[] elements) {
        s.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        ensureCapacity(this._size + elements.length);
        k.copyInto$default(elements, this.content, this._size, 0, 0, 12, (Object) null);
        this._size += elements.length;
    }

    public final boolean addAll(@IntRange(from = 0) int i8, ObjectList<E> elements) {
        s.checkNotNullParameter(elements, "elements");
        if (i8 >= 0 && i8 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            Object[] objArr = this.content;
            int i9 = this._size;
            if (i8 != i9) {
                k.copyInto(objArr, objArr, elements._size + i8, i8, i9);
            }
            k.copyInto(elements.content, objArr, i8, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(kotlin.sequences.m elements) {
        s.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(List<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i8 = this._size;
        ensureCapacity(elements.size() + i8);
        Object[] objArr = this.content;
        int size = elements.size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9 + i8] = elements.get(i9);
        }
        this._size += elements.size();
    }

    public final void plusAssign(E e8) {
        add(e8);
    }

    public final void plusAssign(Iterable<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(ObjectList<E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        plusAssign((ObjectList) elements);
        return i8 != this._size;
    }

    public final boolean addAll(ScatterSet<E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        plusAssign((ScatterSet) elements);
        return i8 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(kotlin.sequences.m elements) {
        s.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(E[] elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        plusAssign((Object[]) elements);
        return i8 != this._size;
    }

    public final boolean addAll(List<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        plusAssign((List) elements);
        return i8 != this._size;
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        plusAssign((Iterable) elements);
        return i8 != this._size;
    }

    public final boolean addAll(kotlin.sequences.m elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        plusAssign(elements);
        return i8 != this._size;
    }
}
