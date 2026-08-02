package kotlin.collections;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ArrayDeque extends AbstractMutableList {
    public static final Companion Companion = new Companion(null);
    public static final Object[] emptyElementData = new Object[0];
    public Object[] elementData;
    public int head;
    public int size;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ArrayDeque(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = emptyElementData;
        } else {
            if (i <= 0) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.elementData = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractList.Companion companion = AbstractList.Companion;
        int i3 = this.size;
        companion.getClass();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, i3);
        if (i == this.size) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        registerModification();
        ensureCapacity$1(this.size + 1);
        int positiveMod = positiveMod(this.head + i);
        int i4 = this.size;
        if (i < ((i4 + 1) >> 1)) {
            if (positiveMod == 0) {
                Object[] objArr = this.elementData;
                objArr.getClass();
                i2 = objArr.length - 1;
            } else {
                i2 = positiveMod - 1;
            }
            int i5 = this.head;
            if (i5 == 0) {
                Object[] objArr2 = this.elementData;
                objArr2.getClass();
                i5 = objArr2.length;
            }
            int i6 = i5 - 1;
            int i7 = this.head;
            Object[] objArr3 = this.elementData;
            if (i2 >= i7) {
                objArr3[i6] = objArr3[i7];
                ArraysKt___ArraysJvmKt.copyInto(i7, i7 + 1, i2 + 1, objArr3, objArr3);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(i7 - 1, i7, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.elementData;
                objArr4[objArr4.length - 1] = objArr4[0];
                ArraysKt___ArraysJvmKt.copyInto(0, 1, i2 + 1, objArr4, objArr4);
            }
            this.elementData[i2] = obj;
            this.head = i6;
        } else {
            int positiveMod2 = positiveMod(i4 + this.head);
            Object[] objArr5 = this.elementData;
            if (positiveMod < positiveMod2) {
                ArraysKt___ArraysJvmKt.copyInto(positiveMod + 1, positiveMod, positiveMod2, objArr5, objArr5);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(1, 0, positiveMod2, objArr5, objArr5);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt___ArraysJvmKt.copyInto(positiveMod + 1, positiveMod, objArr6.length - 1, objArr6, objArr6);
            }
            this.elementData[positiveMod] = obj;
        }
        this.size++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        AbstractList.Companion companion = AbstractList.Companion;
        int i2 = this.size;
        companion.getClass();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, i2);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.size) {
            return addAll(collection);
        }
        registerModification();
        ensureCapacity$1(collection.size() + this.size);
        int positiveMod = positiveMod(this.size + this.head);
        int positiveMod2 = positiveMod(this.head + i);
        int size = collection.size();
        if (i >= ((this.size + 1) >> 1)) {
            int i3 = positiveMod2 + size;
            Object[] objArr = this.elementData;
            if (positiveMod2 < positiveMod) {
                int i4 = size + positiveMod;
                if (i4 <= objArr.length) {
                    ArraysKt___ArraysJvmKt.copyInto(i3, positiveMod2, positiveMod, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    ArraysKt___ArraysJvmKt.copyInto(i3 - objArr.length, positiveMod2, positiveMod, objArr, objArr);
                } else {
                    int length = positiveMod - (i4 - objArr.length);
                    ArraysKt___ArraysJvmKt.copyInto(0, length, positiveMod, objArr, objArr);
                    Object[] objArr2 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(i3, positiveMod2, length, objArr2, objArr2);
                }
            } else {
                ArraysKt___ArraysJvmKt.copyInto(size, 0, positiveMod, objArr, objArr);
                Object[] objArr3 = this.elementData;
                if (i3 >= objArr3.length) {
                    ArraysKt___ArraysJvmKt.copyInto(i3 - objArr3.length, positiveMod2, objArr3.length, objArr3, objArr3);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(i3, positiveMod2, objArr4.length - size, objArr4, objArr4);
                }
            }
            copyCollectionElements(positiveMod2, collection);
            return true;
        }
        int i5 = this.head;
        int i6 = i5 - size;
        Object[] objArr5 = this.elementData;
        if (positiveMod2 < i5) {
            ArraysKt___ArraysJvmKt.copyInto(i6, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.elementData;
            if (size >= positiveMod2) {
                ArraysKt___ArraysJvmKt.copyInto(objArr6.length - size, 0, positiveMod2, objArr6, objArr6);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(0, size, positiveMod2, objArr7, objArr7);
            }
        } else if (i6 >= 0) {
            ArraysKt___ArraysJvmKt.copyInto(i6, i5, positiveMod2, objArr5, objArr5);
        } else {
            i6 += objArr5.length;
            int i7 = positiveMod2 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                ArraysKt___ArraysJvmKt.copyInto(i6, i5, positiveMod2, objArr5, objArr5);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(i6, i5, i5 + length2, objArr5, objArr5);
                Object[] objArr8 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(0, this.head + length2, positiveMod2, objArr8, objArr8);
            }
        }
        this.head = i6;
        copyCollectionElements(negativeMod(positiveMod2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        registerModification();
        ensureCapacity$1(this.size + 1);
        int i = this.head;
        if (i == 0) {
            Object[] objArr = this.elementData;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.head = i2;
        this.elementData[i2] = obj;
        this.size++;
    }

    public final void addLast(Object obj) {
        registerModification();
        ensureCapacity$1(getSize() + 1);
        this.elementData[positiveMod(getSize() + this.head)] = obj;
        this.size = getSize() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            registerModification();
            nullifyNonEmpty(this.head, positiveMod(getSize() + this.head));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void copyCollectionElements(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.elementData.length;
        while (i < length && it.hasNext()) {
            this.elementData[i] = it.next();
            i++;
        }
        int i2 = this.head;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.elementData[i3] = it.next();
        }
        this.size = collection.size() + this.size;
    }

    public final void ensureCapacity$1(int i) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Deque is too big.");
            return;
        }
        Object[] objArr = this.elementData;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            if (i < 10) {
                i = 10;
            }
            this.elementData = new Object[i];
            return;
        }
        AbstractList.Companion companion = AbstractList.Companion;
        int length = objArr.length;
        companion.getClass();
        Object[] objArr2 = new Object[AbstractList.Companion.newCapacity$kotlin_stdlib(length, i)];
        Object[] objArr3 = this.elementData;
        ArraysKt___ArraysJvmKt.copyInto(0, this.head, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.elementData;
        int length2 = objArr4.length;
        int i2 = this.head;
        ArraysKt___ArraysJvmKt.copyInto(length2 - i2, 0, i2, objArr4, objArr2);
        this.head = 0;
        this.elementData = objArr2;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.elementData[this.head];
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("ArrayDeque is empty.");
        return null;
    }

    public final Object firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractList.Companion companion = AbstractList.Companion;
        int i2 = this.size;
        companion.getClass();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i2);
        return this.elementData[positiveMod(this.head + i)];
    }

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        return this.size;
    }

    public final int incremented(int i) {
        this.elementData.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int positiveMod = positiveMod(getSize() + this.head);
        int i2 = this.head;
        if (i2 < positiveMod) {
            while (i2 < positiveMod) {
                if (Intrinsics.areEqual(obj, this.elementData[i2])) {
                    i = this.head;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.head) < positiveMod) {
            return -1;
        }
        int length = this.elementData.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < positiveMod; i3++) {
                    if (Intrinsics.areEqual(obj, this.elementData[i3])) {
                        i2 = i3 + this.elementData.length;
                        i = this.head;
                    }
                }
                return -1;
            }
            if (Intrinsics.areEqual(obj, this.elementData[i2])) {
                i = this.head;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            OptionalProvider$$ExternalSyntheticLambda0.m("ArrayDeque is empty.");
            return null;
        }
        return this.elementData[positiveMod((size() - 1) + this.head)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int positiveMod = positiveMod(this.size + this.head);
        int i2 = this.head;
        if (i2 < positiveMod) {
            length = positiveMod - 1;
            if (i2 <= length) {
                while (!Intrinsics.areEqual(obj, this.elementData[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.head;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.head >= positiveMod) {
            while (true) {
                positiveMod--;
                Object[] objArr = this.elementData;
                if (-1 >= positiveMod) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.head;
                    if (i3 <= length) {
                        while (!Intrinsics.areEqual(obj, this.elementData[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.head;
                    }
                } else if (Intrinsics.areEqual(obj, objArr[positiveMod])) {
                    length = positiveMod + this.elementData.length;
                    i = this.head;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    public final Object lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.elementData[positiveMod((size() - 1) + this.head)];
    }

    public final int negativeMod(int i) {
        return i < 0 ? i + this.elementData.length : i;
    }

    public final void nullifyNonEmpty(int i, int i2) {
        Object[] objArr = this.elementData;
        if (i < i2) {
            ArraysKt___ArraysJvmKt.fill(objArr, i, i2, null);
        } else {
            ArraysKt___ArraysJvmKt.fill(objArr, i, objArr.length, null);
            ArraysKt___ArraysJvmKt.fill(this.elementData, 0, i2, null);
        }
    }

    public final int positiveMod(int i) {
        Object[] objArr = this.elementData;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void registerModification() {
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int positiveMod;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int positiveMod2 = positiveMod(getSize() + this.head);
            int i = this.head;
            if (i < positiveMod2) {
                positiveMod = i;
                while (true) {
                    objArr = this.elementData;
                    if (i >= positiveMod2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.elementData[positiveMod] = obj;
                        positiveMod++;
                    }
                    i++;
                }
                ArraysKt___ArraysJvmKt.fill(objArr, positiveMod, positiveMod2, null);
            } else {
                int length = this.elementData.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.elementData;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.elementData[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                positiveMod = positiveMod(i2);
                for (int i3 = 0; i3 < positiveMod2; i3++) {
                    Object[] objArr3 = this.elementData;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.elementData[positiveMod] = obj3;
                        positiveMod = incremented(positiveMod);
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.size = negativeMod(positiveMod - this.head);
            }
        }
        return z;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object removeAt(int i) {
        AbstractList.Companion companion = AbstractList.Companion;
        int i2 = this.size;
        companion.getClass();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i2);
        if (i == getSize() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        registerModification();
        int positiveMod = positiveMod(this.head + i);
        Object[] objArr = this.elementData;
        Object obj = objArr[positiveMod];
        int i3 = this.size >> 1;
        int i4 = this.head;
        if (i < i3) {
            if (positiveMod >= i4) {
                ArraysKt___ArraysJvmKt.copyInto(i4 + 1, i4, positiveMod, objArr, objArr);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(1, 0, positiveMod, objArr, objArr);
                Object[] objArr2 = this.elementData;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.head;
                ArraysKt___ArraysJvmKt.copyInto(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.elementData;
            int i6 = this.head;
            objArr3[i6] = null;
            this.head = incremented(i6);
        } else {
            int positiveMod2 = positiveMod((getSize() - 1) + i4);
            Object[] objArr4 = this.elementData;
            if (positiveMod <= positiveMod2) {
                ArraysKt___ArraysJvmKt.copyInto(positiveMod, positiveMod + 1, positiveMod2 + 1, objArr4, objArr4);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(positiveMod, positiveMod + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.elementData;
                objArr5[objArr5.length - 1] = objArr5[0];
                ArraysKt___ArraysJvmKt.copyInto(0, 1, positiveMod2 + 1, objArr5, objArr5);
            }
            this.elementData[positiveMod2] = null;
        }
        this.size--;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            OptionalProvider$$ExternalSyntheticLambda0.m("ArrayDeque is empty.");
            return null;
        }
        registerModification();
        Object[] objArr = this.elementData;
        int i = this.head;
        Object obj = objArr[i];
        objArr[i] = null;
        this.head = incremented(i);
        this.size = getSize() - 1;
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
            OptionalProvider$$ExternalSyntheticLambda0.m("ArrayDeque is empty.");
            return null;
        }
        registerModification();
        int positiveMod = positiveMod((size() - 1) + this.head);
        Object[] objArr = this.elementData;
        Object obj = objArr[positiveMod];
        objArr[positiveMod] = null;
        this.size = getSize() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractList.Companion companion = AbstractList.Companion;
        int i3 = this.size;
        companion.getClass();
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, i3);
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.size) {
            clear();
            return;
        }
        if (i4 == 1) {
            removeAt(i);
            return;
        }
        registerModification();
        int i5 = this.size - i2;
        int i6 = this.head;
        if (i < i5) {
            int positiveMod = positiveMod((i - 1) + i6);
            int positiveMod2 = positiveMod(this.head + (i2 - 1));
            while (i > 0) {
                int i7 = positiveMod + 1;
                int min = Math.min(i, Math.min(i7, positiveMod2 + 1));
                Object[] objArr = this.elementData;
                int i8 = positiveMod2 - min;
                int i9 = positiveMod - min;
                ArraysKt___ArraysJvmKt.copyInto(i8 + 1, i9 + 1, i7, objArr, objArr);
                positiveMod = negativeMod(i9);
                positiveMod2 = negativeMod(i8);
                i -= min;
            }
            int positiveMod3 = positiveMod(this.head + i4);
            nullifyNonEmpty(this.head, positiveMod3);
            this.head = positiveMod3;
        } else {
            int positiveMod4 = positiveMod(i6 + i2);
            int positiveMod5 = positiveMod(this.head + i);
            int i10 = this.size;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.elementData;
                i2 = Math.min(i10, Math.min(objArr2.length - positiveMod4, objArr2.length - positiveMod5));
                Object[] objArr3 = this.elementData;
                int i11 = positiveMod4 + i2;
                ArraysKt___ArraysJvmKt.copyInto(positiveMod5, positiveMod4, i11, objArr3, objArr3);
                positiveMod4 = positiveMod(i11);
                positiveMod5 = positiveMod(positiveMod5 + i2);
            }
            int positiveMod6 = positiveMod(this.size + this.head);
            nullifyNonEmpty(negativeMod(positiveMod6 - i4), positiveMod6);
        }
        this.size -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int positiveMod;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int positiveMod2 = positiveMod(getSize() + this.head);
            int i = this.head;
            if (i < positiveMod2) {
                positiveMod = i;
                while (true) {
                    objArr = this.elementData;
                    if (i >= positiveMod2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.elementData[positiveMod] = obj;
                        positiveMod++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ArraysKt___ArraysJvmKt.fill(objArr, positiveMod, positiveMod2, null);
            } else {
                int length = this.elementData.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.elementData;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.elementData[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                positiveMod = positiveMod(i2);
                for (int i3 = 0; i3 < positiveMod2; i3++) {
                    Object[] objArr3 = this.elementData;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.elementData[positiveMod] = obj3;
                        positiveMod = incremented(positiveMod);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.size = negativeMod(positiveMod - this.head);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        AbstractList.Companion companion = AbstractList.Companion;
        int i2 = this.size;
        companion.getClass();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i2);
        int positiveMod = positiveMod(this.head + i);
        Object[] objArr = this.elementData;
        Object obj2 = objArr[positiveMod];
        objArr[positiveMod] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.size;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int positiveMod = positiveMod(this.size + this.head);
        int i2 = this.head;
        if (i2 < positiveMod) {
            ArraysKt___ArraysJvmKt.copyInto$default(i2, positiveMod, 2, this.elementData, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(0, this.head, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(objArr3.length - this.head, 0, positiveMod, objArr3, objArr);
        }
        int i3 = this.size;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(Collection collection) {
        collection.getClass();
        Object[] array2 = collection.toArray(new Object[0]);
        this.elementData = array2;
        this.size = array2.length;
        if (array2.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        registerModification();
        ensureCapacity$1(collection.size() + getSize());
        copyCollectionElements(positiveMod(getSize() + this.head), collection);
        return true;
    }
}
