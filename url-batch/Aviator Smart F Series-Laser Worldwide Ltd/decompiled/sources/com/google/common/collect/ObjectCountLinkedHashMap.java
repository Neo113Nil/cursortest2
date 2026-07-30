package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;

    @VisibleForTesting
    transient long[] links;

    ObjectCountLinkedHashMap() {
        this(3);
    }

    static <K> ObjectCountLinkedHashMap<K> create() {
        return new ObjectCountLinkedHashMap<>();
    }

    static <K> ObjectCountLinkedHashMap<K> createWithExpectedSize(int i8) {
        return new ObjectCountLinkedHashMap<>(i8);
    }

    private int getPredecessor(int i8) {
        return (int) (this.links[i8] >>> 32);
    }

    private int getSuccessor(int i8) {
        return (int) this.links[i8];
    }

    private void setPredecessor(int i8, int i9) {
        long[] jArr = this.links;
        jArr[i8] = (jArr[i8] & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (i9 << 32);
    }

    private void setSucceeds(int i8, int i9) {
        if (i8 == -2) {
            this.firstEntry = i9;
        } else {
            setSuccessor(i8, i9);
        }
        if (i9 == -2) {
            this.lastEntry = i8;
        } else {
            setPredecessor(i9, i8);
        }
    }

    private void setSuccessor(int i8, int i9) {
        long[] jArr = this.links;
        jArr[i8] = (jArr[i8] & (-4294967296L)) | (i9 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
        super.clear();
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int firstIndex() {
        int i8 = this.firstEntry;
        if (i8 == -2) {
            return -1;
        }
        return i8;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void init(int i8, float f8) {
        super.init(i8, f8);
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = new long[i8];
        this.links = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void insertEntry(int i8, @ParametricNullness K k8, int i9, int i10) {
        super.insertEntry(i8, k8, i9, i10);
        setSucceeds(this.lastEntry, i8);
        setSucceeds(i8, -2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void moveLastEntry(int i8) {
        int size = size() - 1;
        setSucceeds(getPredecessor(i8), getSuccessor(i8));
        if (i8 < size) {
            setSucceeds(getPredecessor(size), i8);
            setSucceeds(i8, getSuccessor(size));
        }
        super.moveLastEntry(i8);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int nextIndex(int i8) {
        int successor = getSuccessor(i8);
        if (successor == -2) {
            return -1;
        }
        return successor;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int nextIndexAfterRemove(int i8, int i9) {
        return i8 == size() ? i9 : i8;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void resizeEntries(int i8) {
        super.resizeEntries(i8);
        long[] jArr = this.links;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i8);
        this.links = copyOf;
        Arrays.fill(copyOf, length, i8, -1L);
    }

    ObjectCountLinkedHashMap(int i8) {
        this(i8, 1.0f);
    }

    ObjectCountLinkedHashMap(int i8, float f8) {
        super(i8, f8);
    }

    ObjectCountLinkedHashMap(ObjectCountHashMap<K> objectCountHashMap) {
        init(objectCountHashMap.size(), 1.0f);
        int firstIndex = objectCountHashMap.firstIndex();
        while (firstIndex != -1) {
            put(objectCountHashMap.getKey(firstIndex), objectCountHashMap.getValue(firstIndex));
            firstIndex = objectCountHashMap.nextIndex(firstIndex);
        }
    }
}
