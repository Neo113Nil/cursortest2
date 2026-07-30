package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private static final int ENDPOINT = -2;
    private final boolean accessOrder;
    private transient int firstEntry;
    private transient int lastEntry;

    @VisibleForTesting
    @CheckForNull
    transient long[] links;

    CompactLinkedHashMap() {
        this(3);
    }

    public static <K, V> CompactLinkedHashMap<K, V> create() {
        return new CompactLinkedHashMap<>();
    }

    public static <K, V> CompactLinkedHashMap<K, V> createWithExpectedSize(int i8) {
        return new CompactLinkedHashMap<>(i8);
    }

    private int getPredecessor(int i8) {
        return ((int) (link(i8) >>> 32)) - 1;
    }

    private long link(int i8) {
        return requireLinks()[i8];
    }

    private long[] requireLinks() {
        long[] jArr = this.links;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    private void setLink(int i8, long j8) {
        requireLinks()[i8] = j8;
    }

    private void setPredecessor(int i8, int i9) {
        setLink(i8, (link(i8) & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | ((i9 + 1) << 32));
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
        setLink(i8, (link(i8) & (-4294967296L)) | ((i9 + 1) & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    @Override // com.google.common.collect.CompactHashMap
    void accessEntry(int i8) {
        if (this.accessOrder) {
            setSucceeds(getPredecessor(i8), getSuccessor(i8));
            setSucceeds(this.lastEntry, i8);
            setSucceeds(i8, -2);
            incrementModCount();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    int adjustAfterRemove(int i8, int i9) {
        return i8 >= size() ? i9 : i8;
    }

    @Override // com.google.common.collect.CompactHashMap
    int allocArrays() {
        int allocArrays = super.allocArrays();
        this.links = new long[allocArrays];
        return allocArrays;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = this.links;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    @CanIgnoreReturnValue
    Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> convertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return convertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.CompactHashMap
    Map<K, V> createHashFloodingResistantDelegate(int i8) {
        return new LinkedHashMap(i8, 1.0f, this.accessOrder);
    }

    @Override // com.google.common.collect.CompactHashMap
    int firstEntryIndex() {
        return this.firstEntry;
    }

    @Override // com.google.common.collect.CompactHashMap
    int getSuccessor(int i8) {
        return ((int) link(i8)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    void init(int i8) {
        super.init(i8);
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    void insertEntry(int i8, @ParametricNullness K k8, @ParametricNullness V v7, int i9, int i10) {
        super.insertEntry(i8, k8, v7, i9, i10);
        setSucceeds(this.lastEntry, i8);
        setSucceeds(i8, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    void moveLastEntry(int i8, int i9) {
        int size = size() - 1;
        super.moveLastEntry(i8, i9);
        setSucceeds(getPredecessor(i8), getSuccessor(i8));
        if (i8 < size) {
            setSucceeds(getPredecessor(size), i8);
            setSucceeds(i8, getSuccessor(size));
        }
        setLink(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    void resizeEntries(int i8) {
        super.resizeEntries(i8);
        this.links = Arrays.copyOf(requireLinks(), i8);
    }

    CompactLinkedHashMap(int i8) {
        this(i8, false);
    }

    CompactLinkedHashMap(int i8, boolean z7) {
        super(i8);
        this.accessOrder = z7;
    }
}
