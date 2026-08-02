package kotlinx.collections.immutable.implementations.immutableList;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db2.contacts.AliasQueries$$ExternalSyntheticLambda11;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.ArrayIterator;
import kotlinx.collections.immutable.PersistentList$Builder;
import kotlinx.collections.immutable.internal.EndOfChain;
import okhttp3.Cache;
import okio.Utf8;

/* loaded from: classes9.dex */
public final class PersistentVectorBuilder extends AbstractMutableList implements PersistentList$Builder {
    public AbstractPersistentList builtVector;
    public EndOfChain ownership;
    public Object[] root;
    public int rootShift;
    public int size;
    public Object[] tail;

    public PersistentVectorBuilder(AbstractPersistentList abstractPersistentList, Object[] objArr, Object[] objArr2, int i) {
        objArr2.getClass();
        this.rootShift = i;
        this.builtVector = abstractPersistentList;
        this.ownership = new EndOfChain();
        this.root = objArr;
        this.tail = objArr2;
        this.size = abstractPersistentList.size();
    }

    public static void copyToBuffer$1(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Cache.Companion.checkPositionIndex$kotlinx_collections_immutable(i, getSize());
        if (i == getSize()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int rootSize$3 = rootSize$3();
        if (i >= rootSize$3) {
            insertIntoTail$1(this.root, obj, i - rootSize$3);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        objArr.getClass();
        insertIntoTail$1(insertIntoRoot(objArr, this.rootShift, i, obj, objectRef), objectRef.value, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] mutableBuffer$1;
        collection.getClass();
        Cache.Companion.checkPositionIndex$kotlinx_collections_immutable(i, this.size);
        if (i == this.size) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.size - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.tail;
            Object[] makeMutable$1 = makeMutable$1(objArr);
            ArraysKt___ArraysJvmKt.copyInto(size2 + 1, i3, tailSize$1(), objArr, makeMutable$1);
            copyToBuffer$1(makeMutable$1, i3, collection.iterator());
            setTail(makeMutable$1);
            this.size = collection.size() + this.size;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int tailSize$1 = tailSize$1();
        int size3 = collection.size() + this.size;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= rootSize$3()) {
            mutableBuffer$1 = mutableBuffer$1();
            collection2 = collection;
            splitToBuffers$1(collection2, i, this.tail, tailSize$1, objArr2, size, mutableBuffer$1);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.tail;
            if (size3 > tailSize$1) {
                int i4 = size3 - tailSize$1;
                Object[] makeMutableShiftingRight$1 = makeMutableShiftingRight$1(i4, objArr3);
                insertIntoRoot$1(collection2, i, i4, objArr2, size, makeMutableShiftingRight$1);
                objArr2 = objArr2;
                mutableBuffer$1 = makeMutableShiftingRight$1;
            } else {
                mutableBuffer$1 = mutableBuffer$1();
                int i5 = tailSize$1 - size3;
                ArraysKt___ArraysJvmKt.copyInto(0, i5, tailSize$1, objArr3, mutableBuffer$1);
                int i6 = 32 - i5;
                Object[] makeMutableShiftingRight$12 = makeMutableShiftingRight$1(i6, this.tail);
                int i7 = size - 1;
                objArr2[i7] = makeMutableShiftingRight$12;
                insertIntoRoot$1(collection2, i, i6, objArr2, i7, makeMutableShiftingRight$12);
                collection2 = collection2;
            }
        }
        setRoot(pushBuffersIncreasingHeightIfNeeded$1(this.root, i2, objArr2));
        setTail(mutableBuffer$1);
        this.size = collection2.size() + this.size;
        return true;
    }

    public final AbstractPersistentList build() {
        AbstractPersistentList abstractPersistentList = this.builtVector;
        if (abstractPersistentList == null) {
            Object[] objArr = this.root;
            Object[] objArr2 = this.tail;
            this.ownership = new EndOfChain();
            abstractPersistentList = objArr == null ? objArr2.length == 0 ? SmallPersistentVector.EMPTY : new SmallPersistentVector(Arrays.copyOf(objArr2, this.size)) : new PersistentVector(this.size, this.rootShift, objArr, objArr2);
            this.builtVector = abstractPersistentList;
        }
        return abstractPersistentList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        Cache.Companion.checkElementIndex$kotlinx_collections_immutable(i, getSize());
        if (rootSize$3() <= i) {
            objArr = this.tail;
        } else {
            Object[] objArr2 = this.root;
            objArr2.getClass();
            for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[Utf8.indexSegment(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final int getModCount$kotlinx_collections_immutable() {
        return ((AbstractList) this).modCount;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        return this.size;
    }

    public final Object[] insertIntoRoot(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        Object obj2;
        int indexSegment = Utf8.indexSegment(i2, i);
        if (i == 0) {
            objectRef.value = objArr[31];
            Object[] makeMutable$1 = makeMutable$1(objArr);
            ArraysKt___ArraysJvmKt.copyInto(indexSegment + 1, indexSegment, 31, objArr, makeMutable$1);
            makeMutable$1[indexSegment] = obj;
            return makeMutable$1;
        }
        Object[] makeMutable$12 = makeMutable$1(objArr);
        int i3 = i - 5;
        Object obj3 = makeMutable$12[indexSegment];
        obj3.getClass();
        makeMutable$12[indexSegment] = insertIntoRoot((Object[]) obj3, i3, i2, obj, objectRef);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || (obj2 = makeMutable$12[indexSegment]) == null) {
                break;
            }
            makeMutable$12[indexSegment] = insertIntoRoot((Object[]) obj2, i3, 0, objectRef.value, objectRef);
        }
        return makeMutable$12;
    }

    public final void insertIntoRoot$1(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.root == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        int i4 = i >> 5;
        AbstractListIterator leafBufferIterator$1 = leafBufferIterator$1(rootSize$3() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (leafBufferIterator$1.index - 1 != i4) {
            Object[] objArr4 = (Object[]) leafBufferIterator$1.previous();
            ArraysKt___ArraysJvmKt.copyInto(0, 32 - i2, 32, objArr4, objArr3);
            objArr3 = makeMutableShiftingRight$1(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) leafBufferIterator$1.previous();
        int rootSize$3 = i3 - (((rootSize$3() >> 5) - 1) - i4);
        if (rootSize$3 < i3) {
            objArr2 = objArr[rootSize$3];
            objArr2.getClass();
        }
        splitToBuffers$1(collection, i, objArr5, 32, objArr, rootSize$3, objArr2);
    }

    public final void insertIntoTail$1(Object[] objArr, Object obj, int i) {
        int tailSize$1 = tailSize$1();
        Object[] makeMutable$1 = makeMutable$1(this.tail);
        Object[] objArr2 = this.tail;
        if (tailSize$1 >= 32) {
            Object obj2 = objArr2[31];
            ArraysKt___ArraysJvmKt.copyInto(i + 1, i, 31, objArr2, makeMutable$1);
            makeMutable$1[i] = obj;
            pushFilledTail$1(objArr, makeMutable$1, mutableBufferWith$1(obj2));
            return;
        }
        ArraysKt___ArraysJvmKt.copyInto(i + 1, i, tailSize$1, objArr2, makeMutable$1);
        makeMutable$1[i] = obj;
        setRoot(objArr);
        setTail(makeMutable$1);
        this.size++;
    }

    public final boolean isMutable$1(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.ownership;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final AbstractListIterator leafBufferIterator$1(int i) {
        if (this.root == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return null;
        }
        int rootSize$3 = rootSize$3() >> 5;
        Cache.Companion.checkPositionIndex$kotlinx_collections_immutable(i, rootSize$3);
        int i2 = this.rootShift;
        Object[] objArr = this.root;
        if (i2 == 0) {
            objArr.getClass();
            return new SingleElementListIterator(objArr, i);
        }
        objArr.getClass();
        return new TrieIterator(objArr, i, rootSize$3, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        Cache.Companion.checkPositionIndex$kotlinx_collections_immutable(i, this.size);
        return new PersistentVectorMutableIterator(this, i);
    }

    public final Object[] makeMutable$1(Object[] objArr) {
        if (objArr == null) {
            return mutableBuffer$1();
        }
        if (isMutable$1(objArr)) {
            return objArr;
        }
        Object[] mutableBuffer$1 = mutableBuffer$1();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ArraysKt___ArraysJvmKt.copyInto$default(0, length, 6, objArr, mutableBuffer$1);
        return mutableBuffer$1;
    }

    public final Object[] makeMutableShiftingRight$1(int i, Object[] objArr) {
        if (isMutable$1(objArr)) {
            ArraysKt___ArraysJvmKt.copyInto(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] mutableBuffer$1 = mutableBuffer$1();
        ArraysKt___ArraysJvmKt.copyInto(i, 0, 32 - i, objArr, mutableBuffer$1);
        return mutableBuffer$1;
    }

    public final Object[] mutableBuffer$1() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    public final Object[] mutableBufferWith$1(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    public final Object[] nullifyAfter$1(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int indexSegment = Utf8.indexSegment(i, i2);
        Object obj = objArr[indexSegment];
        obj.getClass();
        Object nullifyAfter$1 = nullifyAfter$1(i, i2 - 5, (Object[]) obj);
        if (indexSegment < 31) {
            int i3 = indexSegment + 1;
            if (objArr[i3] != null) {
                if (isMutable$1(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] mutableBuffer$1 = mutableBuffer$1();
                ArraysKt___ArraysJvmKt.copyInto(0, 0, i3, objArr, mutableBuffer$1);
                objArr = mutableBuffer$1;
            }
        }
        if (nullifyAfter$1 == objArr[indexSegment]) {
            return objArr;
        }
        Object[] makeMutable$1 = makeMutable$1(objArr);
        makeMutable$1[indexSegment] = nullifyAfter$1;
        return makeMutable$1;
    }

    public final Object[] pullLastBuffer(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = Utf8.indexSegment(i2 - 1, i);
        if (i == 5) {
            objectRef.value = objArr[indexSegment];
            pullLastBuffer = null;
        } else {
            Object obj = objArr[indexSegment];
            obj.getClass();
            pullLastBuffer = pullLastBuffer((Object[]) obj, i - 5, i2, objectRef);
        }
        if (pullLastBuffer == null && indexSegment == 0) {
            return null;
        }
        Object[] makeMutable$1 = makeMutable$1(objArr);
        makeMutable$1[indexSegment] = pullLastBuffer;
        return makeMutable$1;
    }

    public final void pullLastBufferFromRoot$1(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            setRoot(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            setTail(objArr);
            this.size = i;
            this.rootShift = i2;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        objArr.getClass();
        Object[] pullLastBuffer = pullLastBuffer(objArr, i2, i, objectRef);
        pullLastBuffer.getClass();
        Object obj = objectRef.value;
        obj.getClass();
        setTail((Object[]) obj);
        this.size = i;
        if (pullLastBuffer[1] == null) {
            setRoot((Object[]) pullLastBuffer[0]);
            this.rootShift = i2 - 5;
        } else {
            setRoot(pullLastBuffer);
            this.rootShift = i2;
        }
    }

    public final Object[] pushBuffers$1(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return null;
        }
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] makeMutable$1 = makeMutable$1(objArr);
        int indexSegment = Utf8.indexSegment(i, i2);
        int i3 = i2 - 5;
        makeMutable$1[indexSegment] = pushBuffers$1((Object[]) makeMutable$1[indexSegment], i, i3, it);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || !it.hasNext()) {
                break;
            }
            makeMutable$1[indexSegment] = pushBuffers$1((Object[]) makeMutable$1[indexSegment], 0, i3, it);
        }
        return makeMutable$1;
    }

    public final Object[] pushBuffersIncreasingHeightIfNeeded$1(Object[] objArr, int i, Object[][] objArr2) {
        ArrayIterator arrayIterator = new ArrayIterator(objArr2);
        int i2 = i >> 5;
        int i3 = this.rootShift;
        Object[] pushBuffers$1 = i2 < (1 << i3) ? pushBuffers$1(objArr, i, i3, arrayIterator) : makeMutable$1(objArr);
        while (arrayIterator.hasNext()) {
            this.rootShift += 5;
            pushBuffers$1 = mutableBufferWith$1(pushBuffers$1);
            int i4 = this.rootShift;
            pushBuffers$1(pushBuffers$1, 1 << i4, i4, arrayIterator);
        }
        return pushBuffers$1;
    }

    public final void pushFilledTail$1(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.size >> 5;
        int i2 = this.rootShift;
        if (i > (1 << i2)) {
            setRoot(pushTail$1(mutableBufferWith$1(objArr), objArr2, this.rootShift + 5));
            setTail(objArr3);
            this.rootShift += 5;
            this.size++;
            return;
        }
        if (objArr == null) {
            setRoot(objArr2);
            setTail(objArr3);
            this.size++;
        } else {
            setRoot(pushTail$1(objArr, objArr2, i2));
            setTail(objArr3);
            this.size++;
        }
    }

    public final Object[] pushTail$1(Object[] objArr, Object[] objArr2, int i) {
        int indexSegment = Utf8.indexSegment(getSize() - 1, i);
        Object[] makeMutable$1 = makeMutable$1(objArr);
        if (i == 5) {
            makeMutable$1[indexSegment] = objArr2;
            return makeMutable$1;
        }
        makeMutable$1[indexSegment] = pushTail$1((Object[]) makeMutable$1[indexSegment], objArr2, i - 5);
        return makeMutable$1;
    }

    public final int recyclableRemoveAll(AliasQueries$$ExternalSyntheticLambda11 aliasQueries$$ExternalSyntheticLambda11, Object[] objArr, int i, int i2, ObjectRef objectRef, ArrayList arrayList, ArrayList arrayList2) {
        if (isMutable$1(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = objectRef.value;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) aliasQueries$$ExternalSyntheticLambda11.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : mutableBuffer$1();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        objectRef.value = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r0 != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (removeAllFromTail(r3, r15, r7) != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r2 = r14;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        collection.getClass();
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        AliasQueries$$ExternalSyntheticLambda11 aliasQueries$$ExternalSyntheticLambda11 = new AliasQueries$$ExternalSyntheticLambda11(4, collection);
        int tailSize$1 = tailSize$1();
        Object[] objArr = null;
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root != null) {
            AbstractListIterator leafBufferIterator$1 = leafBufferIterator$1(0);
            int i2 = 32;
            while (i2 == 32 && leafBufferIterator$1.hasNext()) {
                i2 = removeAll(aliasQueries$$ExternalSyntheticLambda11, (Object[]) leafBufferIterator$1.next(), 32, objectRef);
            }
            if (i2 != 32) {
                int i3 = (leafBufferIterator$1.index - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (leafBufferIterator$1.hasNext()) {
                    i4 = recyclableRemoveAll(aliasQueries$$ExternalSyntheticLambda11, (Object[]) leafBufferIterator$1.next(), 32, i4, objectRef, arrayList2, arrayList);
                }
                PersistentVectorBuilder persistentVectorBuilder = this;
                int recyclableRemoveAll = persistentVectorBuilder.recyclableRemoveAll(aliasQueries$$ExternalSyntheticLambda11, persistentVectorBuilder.tail, tailSize$1, i4, objectRef, arrayList2, arrayList);
                Object obj = objectRef.value;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, recyclableRemoveAll, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = persistentVectorBuilder.root;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = persistentVectorBuilder.pushBuffers$1(objArr3, i3, persistentVectorBuilder.rootShift, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    return false;
                }
                if (size == 0) {
                    persistentVectorBuilder.rootShift = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = persistentVectorBuilder.rootShift;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        persistentVectorBuilder.rootShift = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = persistentVectorBuilder.nullifyAfter$1(i5, i, objArr3);
                }
                persistentVectorBuilder.setRoot(objArr);
                persistentVectorBuilder.setTail(objArr2);
                persistentVectorBuilder.size = size + recyclableRemoveAll;
                z = true;
                if (z) {
                    ((AbstractList) persistentVectorBuilder).modCount++;
                }
                return z;
            }
            int removeAllFromTail = removeAllFromTail(aliasQueries$$ExternalSyntheticLambda11, tailSize$1, objectRef);
            if (removeAllFromTail == 0) {
                pullLastBufferFromRoot$1(this.size, this.rootShift, this.root);
            }
        }
    }

    public final int removeAllFromTail(AliasQueries$$ExternalSyntheticLambda11 aliasQueries$$ExternalSyntheticLambda11, int i, ObjectRef objectRef) {
        int removeAll = removeAll(aliasQueries$$ExternalSyntheticLambda11, this.tail, i, objectRef);
        Object obj = objectRef.value;
        if (removeAll == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, removeAll, i, (Object) null);
        setTail(objArr);
        this.size -= i - removeAll;
        return removeAll;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object removeAt(int i) {
        Cache.Companion.checkElementIndex$kotlinx_collections_immutable(i, getSize());
        ((AbstractList) this).modCount++;
        int rootSize$3 = rootSize$3();
        if (i >= rootSize$3) {
            return removeFromTailAt$1(this.root, rootSize$3, this.rootShift, i - rootSize$3);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        objArr.getClass();
        removeFromTailAt$1(removeFromRootAt(objArr, this.rootShift, i, objectRef), rootSize$3, this.rootShift, 0);
        return objectRef.value;
    }

    public final Object[] removeFromRootAt(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        int indexSegment = Utf8.indexSegment(i2, i);
        if (i == 0) {
            Object obj = objArr[indexSegment];
            Object[] makeMutable$1 = makeMutable$1(objArr);
            ArraysKt___ArraysJvmKt.copyInto(indexSegment, indexSegment + 1, 32, objArr, makeMutable$1);
            makeMutable$1[31] = objectRef.value;
            objectRef.value = obj;
            return makeMutable$1;
        }
        int indexSegment2 = objArr[31] == null ? Utf8.indexSegment(rootSize$3() - 1, i) : 31;
        Object[] makeMutable$12 = makeMutable$1(objArr);
        int i3 = i - 5;
        int i4 = indexSegment + 1;
        if (i4 <= indexSegment2) {
            while (true) {
                Object obj2 = makeMutable$12[indexSegment2];
                obj2.getClass();
                makeMutable$12[indexSegment2] = removeFromRootAt((Object[]) obj2, i3, 0, objectRef);
                if (indexSegment2 == i4) {
                    break;
                }
                indexSegment2--;
            }
        }
        Object obj3 = makeMutable$12[indexSegment];
        obj3.getClass();
        makeMutable$12[indexSegment] = removeFromRootAt((Object[]) obj3, i3, i2, objectRef);
        return makeMutable$12;
    }

    public final Object removeFromTailAt$1(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.size - i;
        Object[] objArr2 = this.tail;
        if (i4 == 1) {
            Object obj = objArr2[0];
            pullLastBufferFromRoot$1(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] makeMutable$1 = makeMutable$1(objArr2);
        ArraysKt___ArraysJvmKt.copyInto(i3, i3 + 1, i4, objArr2, makeMutable$1);
        makeMutable$1[i4 - 1] = null;
        setRoot(objArr);
        setTail(makeMutable$1);
        this.size = (i + i4) - 1;
        this.rootShift = i2;
        return obj2;
    }

    public final int rootSize$3() {
        int i = this.size;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Cache.Companion.checkElementIndex$kotlinx_collections_immutable(i, getSize());
        if (rootSize$3() > i) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.root;
            objArr.getClass();
            setRoot(setInRoot(objArr, this.rootShift, i, obj, objectRef));
            return objectRef.value;
        }
        Object[] makeMutable$1 = makeMutable$1(this.tail);
        if (makeMutable$1 != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = makeMutable$1[i2];
        makeMutable$1[i2] = obj;
        setTail(makeMutable$1);
        return obj2;
    }

    public final Object[] setInRoot(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        int indexSegment = Utf8.indexSegment(i2, i);
        Object[] makeMutable$1 = makeMutable$1(objArr);
        if (i != 0) {
            Object obj2 = makeMutable$1[indexSegment];
            obj2.getClass();
            makeMutable$1[indexSegment] = setInRoot((Object[]) obj2, i - 5, i2, obj, objectRef);
            return makeMutable$1;
        }
        if (makeMutable$1 != objArr) {
            ((AbstractList) this).modCount++;
        }
        objectRef.value = makeMutable$1[indexSegment];
        makeMutable$1[indexSegment] = obj;
        return makeMutable$1;
    }

    public final void setRoot(Object[] objArr) {
        if (objArr != this.root) {
            this.builtVector = null;
            this.root = objArr;
        }
    }

    public final void setTail(Object[] objArr) {
        if (objArr != this.tail) {
            this.builtVector = null;
            this.tail = objArr;
        }
    }

    public final void splitToBuffers$1(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] mutableBuffer$1;
        if (i3 < 1) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return;
        }
        Object[] makeMutable$1 = makeMutable$1(objArr);
        objArr2[0] = makeMutable$1;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ArraysKt___ArraysJvmKt.copyInto(size + 1, i4, i2, makeMutable$1, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                mutableBuffer$1 = makeMutable$1;
            } else {
                mutableBuffer$1 = mutableBuffer$1();
                i3--;
                objArr2[i3] = mutableBuffer$1;
            }
            int i7 = i2 - i6;
            ArraysKt___ArraysJvmKt.copyInto(0, i7, i2, makeMutable$1, objArr3);
            ArraysKt___ArraysJvmKt.copyInto(size + 1, i4, i7, makeMutable$1, mutableBuffer$1);
            objArr3 = mutableBuffer$1;
        }
        Iterator it = collection.iterator();
        copyToBuffer$1(makeMutable$1, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] mutableBuffer$12 = mutableBuffer$1();
            copyToBuffer$1(mutableBuffer$12, 0, it);
            objArr2[i8] = mutableBuffer$12;
        }
        copyToBuffer$1(objArr3, 0, it);
    }

    public final int tailSize$1() {
        int i = this.size;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int tailSize$1 = tailSize$1();
        if (tailSize$1 < 32) {
            Object[] makeMutable$1 = makeMutable$1(this.tail);
            makeMutable$1[tailSize$1] = obj;
            setTail(makeMutable$1);
            this.size = getSize() + 1;
        } else {
            pushFilledTail$1(this.root, this.tail, mutableBufferWith$1(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int tailSize$1 = tailSize$1();
        Iterator it = collection.iterator();
        if (32 - tailSize$1 >= collection.size()) {
            Object[] makeMutable$1 = makeMutable$1(this.tail);
            copyToBuffer$1(makeMutable$1, tailSize$1, it);
            setTail(makeMutable$1);
            this.size = collection.size() + this.size;
            return true;
        }
        int size = ((collection.size() + tailSize$1) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] makeMutable$12 = makeMutable$1(this.tail);
        copyToBuffer$1(makeMutable$12, tailSize$1, it);
        objArr[0] = makeMutable$12;
        for (int i = 1; i < size; i++) {
            Object[] mutableBuffer$1 = mutableBuffer$1();
            copyToBuffer$1(mutableBuffer$1, 0, it);
            objArr[i] = mutableBuffer$1;
        }
        setRoot(pushBuffersIncreasingHeightIfNeeded$1(this.root, rootSize$3(), objArr));
        Object[] mutableBuffer$12 = mutableBuffer$1();
        copyToBuffer$1(mutableBuffer$12, 0, it);
        setTail(mutableBuffer$12);
        this.size = collection.size() + this.size;
        return true;
    }

    public final int removeAll(AliasQueries$$ExternalSyntheticLambda11 aliasQueries$$ExternalSyntheticLambda11, Object[] objArr, int i, ObjectRef objectRef) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) aliasQueries$$ExternalSyntheticLambda11.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = makeMutable$1(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        objectRef.value = objArr2;
        return i2;
    }
}
