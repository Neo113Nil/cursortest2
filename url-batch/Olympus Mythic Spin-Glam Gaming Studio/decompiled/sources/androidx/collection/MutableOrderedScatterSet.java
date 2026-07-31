package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import com.safedk.android.analytics.brandsafety.m;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderedScatterSet.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u000f\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0015\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b \u0010!J\u001e\u0010\u001c\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\"J\u0015\u0010#\u001a\u00020\u00192\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b#\u0010\u001bJ\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b$\u0010\u001dJ\u001b\u0010%\u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b%\u0010!J\u001e\u0010$\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\u0002¢\u0006\u0004\b$\u0010\"J\u001b\u0010'\u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0001¢\u0006\u0004\b*\u0010\u0006J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\fJ\u000f\u0010-\u001a\u00020\u0007H\u0000¢\u0006\u0004\b,\u0010\fJ\u000f\u0010/\u001a\u00020\u0007H\u0000¢\u0006\u0004\b.\u0010\fJ\u0017\u00102\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0003H\u0000¢\u0006\u0004\b1\u0010\u0006R\u0016\u00103\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Landroidx/collection/MutableOrderedScatterSet;", "E", "Landroidx/collection/OrderedScatterSet;", "", "initialCapacity", "<init>", "(I)V", "", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "element", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "hash1", "findFirstAvailableSlot", "(I)I", "", "mapping", "fixupNodes", "([J)V", "", "([I)V", "", m.l, "(Ljava/lang/Object;)Z", "plusAssign", "(Ljava/lang/Object;)V", "", "elements", "addAll", "(Ljava/lang/Iterable;)Z", "(Ljava/lang/Iterable;)V", "remove", "minusAssign", "removeAll", "", "retainAll", "(Ljava/util/Collection;)Z", "index", "removeElementAt", "clear", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "growthLimit", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {
    private int growthLimit;

    public MutableOrderedScatterSet(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    private final void initializeStorage(int initialCapacity) {
        long[] jArr;
        int max = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = max;
        initializeMetadata(max);
        this.elements = max == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[max];
        if (max == 0) {
            jArr = SieveCacheKt.getEmptyNodes();
        } else {
            jArr = new long[max];
            ArraysKt.fill$default(jArr, 4611686018427387903L, 0, 0, 6, (Object) null);
        }
        this.nodes = jArr;
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.metadata = jArr;
        int i = capacity >> 3;
        long j = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final boolean add(Object element) {
        int i = get_size();
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(element);
        this.elements[findAbsoluteInsertIndex] = element;
        long[] jArr = this.nodes;
        int i2 = this.head;
        jArr[findAbsoluteInsertIndex] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((findAbsoluteInsertIndex & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.head = findAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = findAbsoluteInsertIndex;
        }
        return get_size() != i;
    }

    public final void plusAssign(Object element) {
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(element);
        this.elements[findAbsoluteInsertIndex] = element;
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[findAbsoluteInsertIndex] = (i & 2147483647L) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((findAbsoluteInsertIndex & 2147483647L) << 31) | (jArr[i] & (-4611686016279904257L));
        }
        this.head = findAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = findAbsoluteInsertIndex;
        }
    }

    public final boolean addAll(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = get_size();
        plusAssign(elements);
        return i != get_size();
    }

    public final boolean removeAll(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = get_size();
        minusAssign(elements);
        return i != get_size();
    }

    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.contains(elements, objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this._size;
    }

    public final void removeElementAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        this.elements[index] = null;
        long[] jArr2 = this.nodes;
        long j2 = jArr2[index];
        int i4 = (int) ((j2 >> 31) & 2147483647L);
        int i5 = (int) (j2 & 2147483647L);
        if (i4 == Integer.MAX_VALUE) {
            this.head = i5;
        } else {
            jArr2[i4] = (jArr2[i4] & (-2147483648L)) | (i5 & 2147483647L);
        }
        if (i5 == Integer.MAX_VALUE) {
            this.tail = i4;
        } else {
            jArr2[i5] = ((i4 & 2147483647L) << 31) | (jArr2[i5] & (-4611686016279904257L));
        }
        jArr2[index] = 4611686018427387903L;
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.fill(this.elements, (Object) null, 0, this._capacity);
        ArraysKt.fill$default(this.nodes, 4611686018427387903L, 0, 0, 6, (Object) null);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        initializeGrowth();
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i = this._capacity;
        int i2 = hash1 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private final int findAbsoluteInsertIndex(Object element) {
        int hashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (Intrinsics.areEqual(this.elements[numberOfTrailingZeros], element)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    findFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = findFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((findFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return findFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void minusAssign(Object element) {
        int i;
        int i2 = 0;
        int hashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this._capacity;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.metadata;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (Intrinsics.areEqual(this.elements[i], element)) {
                    break loop0;
                } else {
                    j3 &= j3 - 1;
                }
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            removeElementAt(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object element) {
        int i;
        int hashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (Intrinsics.areEqual(this.elements[i], element)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = i >= 0;
        if (z) {
            removeElementAt(i);
        }
        return z;
    }

    public final void adjustStorage$collection() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare(ULong.m8077constructorimpl(ULong.m8077constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m8077constructorimpl(ULong.m8077constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
    }

    public final void dropDeletes$collection() {
        long[] jArr;
        long[] jArr2;
        char c;
        long[] jArr3 = this.metadata;
        if (jArr3 == null) {
            return;
        }
        int i = this._capacity;
        Object[] objArr = this.elements;
        long[] jArr4 = this.nodes;
        long[] jArr5 = new long[i];
        int i2 = 0;
        ArraysKt.fill(jArr5, 9223372034707292159L, 0, i);
        int i3 = (i + 7) >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            long j = jArr3[i4] & (-9187201950435737472L);
            jArr3[i4] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr3);
        int i5 = lastIndex - 1;
        jArr3[i5] = (jArr3[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr3[lastIndex] = jArr3[0];
        int i6 = 0;
        while (i6 != i) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j2 = (jArr3[i7] >> i8) & 255;
            if (j2 != 128 && j2 == 254) {
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : i2) * (-862048943);
                int i9 = (hashCode ^ (hashCode << 16)) >>> 7;
                int findFirstAvailableSlot = findFirstAvailableSlot(i9);
                int i10 = i9 & i;
                if (((findFirstAvailableSlot - i10) & i) / 8 == ((i6 - i10) & i) / 8) {
                    jArr3[i7] = ((r11 & 127) << i8) | (jArr3[i7] & (~(255 << i8)));
                    if (jArr5[i6] == 9223372034707292159L) {
                        long j3 = i6;
                        jArr5[i6] = j3 | (j3 << 32);
                    }
                    jArr3[jArr3.length - 1] = jArr3[0];
                    i6++;
                    i2 = 0;
                } else {
                    int i11 = findFirstAvailableSlot >> 3;
                    long j4 = jArr3[i11];
                    int i12 = (findFirstAvailableSlot & 7) << 3;
                    if (((j4 >> i12) & 255) == 128) {
                        jArr = jArr4;
                        jArr2 = jArr5;
                        jArr3[i11] = (j4 & (~(255 << i12))) | ((r11 & 127) << i12);
                        jArr3[i7] = (jArr3[i7] & (~(255 << i8))) | (128 << i8);
                        objArr[findFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = null;
                        jArr[findFirstAvailableSlot] = jArr[i6];
                        jArr[i6] = 4611686018427387903L;
                        int i13 = (int) ((jArr2[i6] >> 32) & 4294967295L);
                        if (i13 != Integer.MAX_VALUE) {
                            jArr2[i13] = (jArr2[i13] & (-4294967296L)) | findFirstAvailableSlot;
                            jArr2[i6] = (jArr2[i6] & 4294967295L) | (-4294967296L);
                            c = ' ';
                        } else {
                            c = ' ';
                            jArr2[i6] = (Integer.MAX_VALUE << 32) | findFirstAvailableSlot;
                        }
                        jArr2[findFirstAvailableSlot] = Integer.MAX_VALUE | (i6 << c);
                    } else {
                        jArr = jArr4;
                        jArr2 = jArr5;
                        jArr3[i11] = ((r11 & 127) << i12) | (j4 & (~(255 << i12)));
                        Object obj2 = objArr[findFirstAvailableSlot];
                        objArr[findFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = obj2;
                        long j5 = jArr[findFirstAvailableSlot];
                        jArr[findFirstAvailableSlot] = jArr[i6];
                        jArr[i6] = j5;
                        int i14 = (int) ((jArr2[i6] >> 32) & 4294967295L);
                        if (i14 != Integer.MAX_VALUE) {
                            long j6 = findFirstAvailableSlot;
                            jArr2[i14] = (jArr2[i14] & (-4294967296L)) | j6;
                            jArr2[i6] = (jArr2[i6] & 4294967295L) | (j6 << 32);
                        } else {
                            long j7 = findFirstAvailableSlot;
                            jArr2[i6] = j7 | (j7 << 32);
                            i14 = i6;
                        }
                        jArr2[findFirstAvailableSlot] = (i14 << 32) | i6;
                        i6--;
                    }
                    jArr3[jArr3.length - 1] = jArr3[0];
                    i6++;
                    i2 = 0;
                    jArr4 = jArr;
                    jArr5 = jArr2;
                }
            } else {
                i6++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr5);
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr3 = this.nodes;
        int i = this._capacity;
        int[] iArr = new int[i];
        initializeStorage(newCapacity);
        long[] jArr4 = this.metadata;
        Object[] objArr3 = this.elements;
        long[] jArr5 = this.nodes;
        int i2 = this._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i3];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i4 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i4 >>> 7);
                long j = i4 & 127;
                int i5 = findFirstAvailableSlot >> 3;
                int i6 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j2 = (jArr4[i5] & (~(255 << i6))) | (j << i6);
                jArr4[i5] = j2;
                jArr4[(((findFirstAvailableSlot - 7) & i2) + (i2 & 7)) >> 3] = j2;
                objArr3[findFirstAvailableSlot] = obj;
                jArr5[findFirstAvailableSlot] = jArr3[i3];
                iArr[i3] = findFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i3++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    private final void fixupNodes(long[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) (j & 2147483647L);
            long j2 = ((j & (-4611686018427387904L)) | (((int) ((j >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[r9] & 4294967295L))) << 31;
            if (i3 != Integer.MAX_VALUE) {
                i2 = (int) (4294967295L & mapping[i3]);
            }
            jArr[i] = i2 | j2;
            i++;
        }
        int i4 = this.head;
        if (i4 != Integer.MAX_VALUE) {
            this.head = (int) (mapping[i4] & 4294967295L);
        }
        int i5 = this.tail;
        if (i5 != Integer.MAX_VALUE) {
            this.tail = (int) (mapping[i5] & 4294967295L);
        }
    }

    private final void fixupNodes(int[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) (j & 2147483647L);
            long j2 = ((j & (-4611686018427387904L)) | (((int) ((j >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[r7])) << 31;
            if (i3 != Integer.MAX_VALUE) {
                i2 = mapping[i3];
            }
            jArr[i] = j2 | i2;
            i++;
        }
        int i4 = this.head;
        if (i4 != Integer.MAX_VALUE) {
            this.head = mapping[i4];
        }
        int i5 = this.tail;
        if (i5 != Integer.MAX_VALUE) {
            this.tail = mapping[i5];
        }
    }

    public final void minusAssign(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            minusAssign(it.next());
        }
    }

    public final void plusAssign(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            plusAssign(it.next());
        }
    }
}
