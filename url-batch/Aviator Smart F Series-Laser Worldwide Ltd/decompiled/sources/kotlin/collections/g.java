package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class g extends d {
    private static final int defaultMinCapacity = 10;
    private static final int maxArraySize = 2147483639;
    private Object[] elementData;
    private int head;
    private int size;
    public static final a Companion = new a(null);
    private static final Object[] emptyElementData = new Object[0];

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final int newCapacity$kotlin_stdlib(int i8, int i9) {
            int i10 = i8 + (i8 >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            if (i10 - g.maxArraySize <= 0) {
                return i10;
            }
            if (i9 > g.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return g.maxArraySize;
        }
    }

    public g(int i8) {
        Object[] objArr;
        if (i8 == 0) {
            objArr = emptyElementData;
        } else {
            if (i8 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i8);
            }
            objArr = new Object[i8];
        }
        this.elementData = objArr;
    }

    private final void copyCollectionElements(int i8, Collection<Object> collection) {
        Iterator<Object> it = collection.iterator();
        int length = this.elementData.length;
        while (i8 < length && it.hasNext()) {
            this.elementData[i8] = it.next();
            i8++;
        }
        int i9 = this.head;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.elementData[i10] = it.next();
        }
        this.size = size() + collection.size();
    }

    private final void copyElements(int i8) {
        Object[] objArr = new Object[i8];
        Object[] objArr2 = this.elementData;
        k.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i9 = this.head;
        k.copyInto(objArr3, objArr, length - i9, 0, i9);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int decremented(int i8) {
        return i8 == 0 ? ArraysKt___ArraysKt.getLastIndex(this.elementData) : i8 - 1;
    }

    private final void ensureCapacity(int i8) {
        int coerceAtLeast;
        if (i8 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (i8 <= objArr.length) {
            return;
        }
        if (objArr != emptyElementData) {
            copyElements(Companion.newCapacity$kotlin_stdlib(objArr.length, i8));
        } else {
            coerceAtLeast = j6.v.coerceAtLeast(i8, 10);
            this.elementData = new Object[coerceAtLeast];
        }
    }

    private final boolean filterInPlace(f6.l lVar) {
        int positiveMod;
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int positiveMod2 = positiveMod(this.head + size());
            int i8 = this.head;
            if (i8 < positiveMod2) {
                positiveMod = i8;
                while (i8 < positiveMod2) {
                    Object obj = this.elementData[i8];
                    if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                        this.elementData[positiveMod] = obj;
                        positiveMod++;
                    } else {
                        z7 = true;
                    }
                    i8++;
                }
                k.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
            } else {
                int length = this.elementData.length;
                int i9 = i8;
                boolean z8 = false;
                while (i8 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (((Boolean) lVar.invoke(obj2)).booleanValue()) {
                        this.elementData[i9] = obj2;
                        i9++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                positiveMod = positiveMod(i9);
                for (int i10 = 0; i10 < positiveMod2; i10++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (((Boolean) lVar.invoke(obj3)).booleanValue()) {
                        this.elementData[positiveMod] = obj3;
                        positiveMod = incremented(positiveMod);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                this.size = negativeMod(positiveMod - this.head);
            }
        }
        return z7;
    }

    private final int incremented(int i8) {
        if (i8 == ArraysKt___ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return i8 + 1;
    }

    private final Object internalGet(int i8) {
        return this.elementData[i8];
    }

    private final int internalIndex(int i8) {
        return positiveMod(this.head + i8);
    }

    private final int negativeMod(int i8) {
        return i8 < 0 ? i8 + this.elementData.length : i8;
    }

    private final int positiveMod(int i8) {
        Object[] objArr = this.elementData;
        return i8 >= objArr.length ? i8 - objArr.length : i8;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<Object> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(size() + elements.size());
        copyCollectionElements(positiveMod(this.head + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        ensureCapacity(size() + 1);
        int decremented = decremented(this.head);
        this.head = decremented;
        this.elementData[decremented] = obj;
        this.size = size() + 1;
    }

    public final void addLast(Object obj) {
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = obj;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int positiveMod = positiveMod(this.head + size());
        int i8 = this.head;
        if (i8 < positiveMod) {
            k.fill(this.elementData, (Object) null, i8, positiveMod);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            k.fill(objArr, (Object) null, this.head, objArr.length);
            k.fill(this.elementData, (Object) null, 0, positiveMod);
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.elementData[this.head];
    }

    public final Object firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        b.Companion.checkElementIndex$kotlin_stdlib(i8, size());
        return this.elementData[positiveMod(this.head + i8)];
    }

    @Override // kotlin.collections.d
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i8;
        int positiveMod = positiveMod(this.head + size());
        int i9 = this.head;
        if (i9 < positiveMod) {
            while (i9 < positiveMod) {
                if (kotlin.jvm.internal.s.areEqual(obj, this.elementData[i9])) {
                    i8 = this.head;
                } else {
                    i9++;
                }
            }
            return -1;
        }
        if (i9 < positiveMod) {
            return -1;
        }
        int length = this.elementData.length;
        while (true) {
            if (i9 >= length) {
                for (int i10 = 0; i10 < positiveMod; i10++) {
                    if (kotlin.jvm.internal.s.areEqual(obj, this.elementData[i10])) {
                        i9 = i10 + this.elementData.length;
                        i8 = this.head;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.s.areEqual(obj, this.elementData[i9])) {
                i8 = this.head;
                break;
            }
            i9++;
        }
        return i9 - i8;
    }

    public final void internalStructure$kotlin_stdlib(f6.p structure) {
        int i8;
        kotlin.jvm.internal.s.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i8 = this.head) < positiveMod(this.head + size())) ? this.head : i8 - this.elementData.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i8;
        int positiveMod = positiveMod(this.head + size());
        int i9 = this.head;
        if (i9 < positiveMod) {
            lastIndex = positiveMod - 1;
            if (i9 <= lastIndex) {
                while (!kotlin.jvm.internal.s.areEqual(obj, this.elementData[lastIndex])) {
                    if (lastIndex != i9) {
                        lastIndex--;
                    }
                }
                i8 = this.head;
                return lastIndex - i8;
            }
            return -1;
        }
        if (i9 > positiveMod) {
            int i10 = positiveMod - 1;
            while (true) {
                if (-1 >= i10) {
                    lastIndex = ArraysKt___ArraysKt.getLastIndex(this.elementData);
                    int i11 = this.head;
                    if (i11 <= lastIndex) {
                        while (!kotlin.jvm.internal.s.areEqual(obj, this.elementData[lastIndex])) {
                            if (lastIndex != i11) {
                                lastIndex--;
                            }
                        }
                        i8 = this.head;
                    }
                } else {
                    if (kotlin.jvm.internal.s.areEqual(obj, this.elementData[i10])) {
                        lastIndex = i10 + this.elementData.length;
                        i8 = this.head;
                        break;
                    }
                    i10--;
                }
            }
        }
        return -1;
    }

    public final Object lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int positiveMod;
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int positiveMod2 = positiveMod(this.head + size());
            int i8 = this.head;
            if (i8 < positiveMod2) {
                positiveMod = i8;
                while (i8 < positiveMod2) {
                    Object obj = this.elementData[i8];
                    if (!elements.contains(obj)) {
                        this.elementData[positiveMod] = obj;
                        positiveMod++;
                    } else {
                        z7 = true;
                    }
                    i8++;
                }
                k.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
            } else {
                int length = this.elementData.length;
                int i9 = i8;
                boolean z8 = false;
                while (i8 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (!elements.contains(obj2)) {
                        this.elementData[i9] = obj2;
                        i9++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                positiveMod = positiveMod(i9);
                for (int i10 = 0; i10 < positiveMod2; i10++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (!elements.contains(obj3)) {
                        this.elementData[positiveMod] = obj3;
                        positiveMod = incremented(positiveMod);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                this.size = negativeMod(positiveMod - this.head);
            }
        }
        return z7;
    }

    @Override // kotlin.collections.d
    public Object removeAt(int i8) {
        b.Companion.checkElementIndex$kotlin_stdlib(i8, size());
        if (i8 == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i8 == 0) {
            return removeFirst();
        }
        int positiveMod = positiveMod(this.head + i8);
        Object obj = this.elementData[positiveMod];
        if (i8 < (size() >> 1)) {
            int i9 = this.head;
            if (positiveMod >= i9) {
                Object[] objArr = this.elementData;
                k.copyInto(objArr, objArr, i9 + 1, i9, positiveMod);
            } else {
                Object[] objArr2 = this.elementData;
                k.copyInto(objArr2, objArr2, 1, 0, positiveMod);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i10 = this.head;
                k.copyInto(objArr3, objArr3, i10 + 1, i10, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i11 = this.head;
            objArr4[i11] = null;
            this.head = incremented(i11);
        } else {
            int positiveMod2 = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
            if (positiveMod <= positiveMod2) {
                Object[] objArr5 = this.elementData;
                k.copyInto(objArr5, objArr5, positiveMod, positiveMod + 1, positiveMod2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                k.copyInto(objArr6, objArr6, positiveMod, positiveMod + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                k.copyInto(objArr7, objArr7, 0, 1, positiveMod2 + 1);
            }
            this.elementData[positiveMod2] = null;
        }
        this.size = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.elementData;
        int i8 = this.head;
        Object obj = objArr[i8];
        objArr[i8] = null;
        this.head = incremented(i8);
        this.size = size() - 1;
        return obj;
    }

    public final Object removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int positiveMod = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
        Object[] objArr = this.elementData;
        Object obj = objArr[positiveMod];
        objArr[positiveMod] = null;
        this.size = size() - 1;
        return obj;
    }

    public final Object removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int positiveMod;
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int positiveMod2 = positiveMod(this.head + size());
            int i8 = this.head;
            if (i8 < positiveMod2) {
                positiveMod = i8;
                while (i8 < positiveMod2) {
                    Object obj = this.elementData[i8];
                    if (elements.contains(obj)) {
                        this.elementData[positiveMod] = obj;
                        positiveMod++;
                    } else {
                        z7 = true;
                    }
                    i8++;
                }
                k.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
            } else {
                int length = this.elementData.length;
                int i9 = i8;
                boolean z8 = false;
                while (i8 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i9] = obj2;
                        i9++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                positiveMod = positiveMod(i9);
                for (int i10 = 0; i10 < positiveMod2; i10++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[positiveMod] = obj3;
                        positiveMod = incremented(positiveMod);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                this.size = negativeMod(positiveMod - this.head);
            }
        }
        return z7;
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        b.Companion.checkElementIndex$kotlin_stdlib(i8, size());
        int positiveMod = positiveMod(this.head + i8);
        Object[] objArr = this.elementData;
        Object obj2 = objArr[positiveMod];
        objArr[positiveMod] = obj;
        return obj2;
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] array) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) i.arrayOfNulls(array, size());
        }
        int positiveMod = positiveMod(this.head + size());
        int i8 = this.head;
        if (i8 < positiveMod) {
            k.copyInto$default(this.elementData, array, 0, i8, positiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            k.copyInto(objArr, array, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            k.copyInto(objArr2, array, objArr2.length - this.head, 0, positiveMod);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        b.Companion.checkPositionIndex$kotlin_stdlib(i8, size());
        if (i8 == size()) {
            addLast(obj);
            return;
        }
        if (i8 == 0) {
            addFirst(obj);
            return;
        }
        ensureCapacity(size() + 1);
        int positiveMod = positiveMod(this.head + i8);
        if (i8 < ((size() + 1) >> 1)) {
            int decremented = decremented(positiveMod);
            int decremented2 = decremented(this.head);
            int i9 = this.head;
            if (decremented >= i9) {
                Object[] objArr = this.elementData;
                objArr[decremented2] = objArr[i9];
                k.copyInto(objArr, objArr, i9, i9 + 1, decremented + 1);
            } else {
                Object[] objArr2 = this.elementData;
                k.copyInto(objArr2, objArr2, i9 - 1, i9, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                k.copyInto(objArr3, objArr3, 0, 1, decremented + 1);
            }
            this.elementData[decremented] = obj;
            this.head = decremented2;
        } else {
            int positiveMod2 = positiveMod(this.head + size());
            if (positiveMod < positiveMod2) {
                Object[] objArr4 = this.elementData;
                k.copyInto(objArr4, objArr4, positiveMod + 1, positiveMod, positiveMod2);
            } else {
                Object[] objArr5 = this.elementData;
                k.copyInto(objArr5, objArr5, 1, 0, positiveMod2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                k.copyInto(objArr6, objArr6, positiveMod + 1, positiveMod, objArr6.length - 1);
            }
            this.elementData[positiveMod] = obj;
        }
        this.size = size() + 1;
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    public g() {
        this.elementData = emptyElementData;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection<Object> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        b.Companion.checkPositionIndex$kotlin_stdlib(i8, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i8 == size()) {
            return addAll(elements);
        }
        ensureCapacity(size() + elements.size());
        int positiveMod = positiveMod(this.head + size());
        int positiveMod2 = positiveMod(this.head + i8);
        int size = elements.size();
        if (i8 < ((size() + 1) >> 1)) {
            int i9 = this.head;
            int i10 = i9 - size;
            if (positiveMod2 < i9) {
                Object[] objArr = this.elementData;
                k.copyInto(objArr, objArr, i10, i9, objArr.length);
                if (size >= positiveMod2) {
                    Object[] objArr2 = this.elementData;
                    k.copyInto(objArr2, objArr2, objArr2.length - size, 0, positiveMod2);
                } else {
                    Object[] objArr3 = this.elementData;
                    k.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    k.copyInto(objArr4, objArr4, 0, size, positiveMod2);
                }
            } else if (i10 >= 0) {
                Object[] objArr5 = this.elementData;
                k.copyInto(objArr5, objArr5, i10, i9, positiveMod2);
            } else {
                Object[] objArr6 = this.elementData;
                i10 += objArr6.length;
                int i11 = positiveMod2 - i9;
                int length = objArr6.length - i10;
                if (length >= i11) {
                    k.copyInto(objArr6, objArr6, i10, i9, positiveMod2);
                } else {
                    k.copyInto(objArr6, objArr6, i10, i9, i9 + length);
                    Object[] objArr7 = this.elementData;
                    k.copyInto(objArr7, objArr7, 0, this.head + length, positiveMod2);
                }
            }
            this.head = i10;
            copyCollectionElements(negativeMod(positiveMod2 - size), elements);
        } else {
            int i12 = positiveMod2 + size;
            if (positiveMod2 >= positiveMod) {
                Object[] objArr8 = this.elementData;
                k.copyInto(objArr8, objArr8, size, 0, positiveMod);
                Object[] objArr9 = this.elementData;
                if (i12 >= objArr9.length) {
                    k.copyInto(objArr9, objArr9, i12 - objArr9.length, positiveMod2, objArr9.length);
                } else {
                    k.copyInto(objArr9, objArr9, 0, objArr9.length - size, objArr9.length);
                    Object[] objArr10 = this.elementData;
                    k.copyInto(objArr10, objArr10, i12, positiveMod2, objArr10.length - size);
                }
            } else {
                int i13 = size + positiveMod;
                Object[] objArr11 = this.elementData;
                if (i13 <= objArr11.length) {
                    k.copyInto(objArr11, objArr11, i12, positiveMod2, positiveMod);
                } else if (i12 >= objArr11.length) {
                    k.copyInto(objArr11, objArr11, i12 - objArr11.length, positiveMod2, positiveMod);
                } else {
                    int length2 = positiveMod - (i13 - objArr11.length);
                    k.copyInto(objArr11, objArr11, 0, length2, positiveMod);
                    Object[] objArr12 = this.elementData;
                    k.copyInto(objArr12, objArr12, i12, positiveMod2, length2);
                }
            }
            copyCollectionElements(positiveMod2, elements);
        }
        return true;
    }

    public g(Collection<Object> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
