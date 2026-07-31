package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: SieveCache.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0015\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001b\u0010\u001eJ\u001a\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u0001¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\bJ\u000f\u0010'\u001a\u00020\u0006H\u0000¢\u0006\u0004\b&\u0010\fJ\u000f\u0010)\u001a\u00020\u0006H\u0000¢\u0006\u0004\b(\u0010\fJ\u0017\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0004H\u0000¢\u0006\u0004\b+\u0010\bJ\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010\u000eJ\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R&\u00106\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u00109\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R4\u0010<\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00060;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010>\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010\fR$\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010\fR$\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bE\u0010C\u0012\u0004\bF\u0010\fR\u0016\u0010G\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010?R\u0016\u0010H\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010IR\u0016\u0010L\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010IR\u0016\u0010M\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010IR\u0016\u0010N\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010IR\u0016\u0010O\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010IR\u0016\u0010P\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010IR\u0011\u0010R\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bQ\u0010\u000eR\u001a\u0010U\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bT\u0010\f\u001a\u0004\bS\u0010\u000e¨\u0006V"}, d2 = {"Landroidx/collection/SieveCache;", "", "K", "V", "", "initialCapacity", "", "initializeStorage", "(I)V", "capacity", "initializeMetadata", "initializeGrowth", "()V", "findEvictionCandidate", "()I", "index", "removeValueAt", "(I)Ljava/lang/Object;", "key", "findKeyIndex", "(Ljava/lang/Object;)I", "findInsertIndex", "hash1", "findFirstAvailableSlot", "(I)I", "", "mapping", "fixupNodes", "([J)V", "", "([I)V", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", SDKConstants.PARAM_CONTEXT_MAX_SIZE, "trimToSize", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function2;", "sizeOf", "Lkotlin/jvm/functions/Function2;", "Lkotlin/Function1;", "createValueFromKey", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function4;", "onEntryRemoved", "Lkotlin/jvm/functions/Function4;", "metadata", "[J", "getMetadata$annotations", "", "keys", "[Ljava/lang/Object;", "getKeys$annotations", "values", "getValues$annotations", "nodes", "_capacity", "I", "growthLimit", "_count", "_maxSize", "_size", "head", "tail", "hand", "getSize", "size", "getCount", "getCount$annotations", "count", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SieveCache<K, V> {

    /* renamed from: _capacity, reason: from kotlin metadata and from toString */
    private int capacity;

    /* renamed from: _count, reason: from kotlin metadata and from toString */
    private int count;
    private int _maxSize;

    /* renamed from: _size, reason: from kotlin metadata and from toString */
    private int size;
    private final Function1 createValueFromKey;
    private int growthLimit;
    private int hand;
    private int head;
    public Object[] keys;
    public long[] metadata;
    private long[] nodes;
    private final Function4 onEntryRemoved;
    private final Function2 sizeOf;
    private int tail;
    public Object[] values;

    /* compiled from: SieveCache.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "K", "", "V", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.collection.SieveCache$2, reason: invalid class name */
    /* loaded from: classes14.dex */
    final class AnonymousClass2 extends Lambda implements Function1 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    /* compiled from: SieveCache.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "K", "", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.collection.SieveCache$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    final class AnonymousClass1 extends Lambda implements Function2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(obj2, "<anonymous parameter 1>");
            return 1;
        }
    }

    /* compiled from: SieveCache.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u00042\b\u0010\u0007\u001a\u0004\u0018\u0001H\u00042\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "K", "", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.collection.SieveCache$3, reason: invalid class name */
    /* loaded from: classes14.dex */
    final class AnonymousClass3 extends Lambda implements Function4 {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(4);
        }

        public final void invoke(Object obj, Object obj2, Object obj3, boolean z) {
            Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(obj2, "<anonymous parameter 1>");
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(obj, obj2, obj3, ((Boolean) obj4).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public final int getSize() {
        return this.size;
    }

    public final int getCount() {
        return this.count;
    }

    private final void initializeStorage(int initialCapacity) {
        long[] jArr;
        int max = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this.capacity = max;
        initializeMetadata(max);
        this.keys = max == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[max];
        this.values = max == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[max];
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
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            int i = capacity >> 3;
            long j = 255 << ((capacity & 7) << 3);
            jArr2[i] = (jArr2[i] & (~j)) | j;
            jArr = jArr2;
        }
        this.metadata = jArr;
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(this.capacity) - getCount();
    }

    public final Object get(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0) {
            Object invoke = this.createValueFromKey.invoke(key);
            if (invoke == null) {
                return null;
            }
            put(key, invoke);
            return invoke;
        }
        long[] jArr = this.nodes;
        jArr[findKeyIndex] = (jArr[findKeyIndex] & 4611686018427387903L) | 4611686018427387904L;
        return this.values[findKeyIndex];
    }

    public final Object put(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int findInsertIndex = findInsertIndex(key);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        Object[] objArr = this.values;
        Object obj = objArr[findInsertIndex];
        objArr[findInsertIndex] = value;
        this.keys[findInsertIndex] = key;
        int intValue = this.size + ((Number) this.sizeOf.invoke(key, value)).intValue();
        this.size = intValue;
        if (obj != null) {
            this.size = intValue - ((Number) this.sizeOf.invoke(key, obj)).intValue();
            this.onEntryRemoved.invoke(key, obj, value, Boolean.FALSE);
            trimToSize(this._maxSize);
            return obj;
        }
        trimToSize(this._maxSize);
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[findInsertIndex] = (i & 2147483647L) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = (jArr[i] & (-4611686016279904257L)) | ((2147483647L & findInsertIndex) << 31);
        }
        this.head = findInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = findInsertIndex;
        }
        return obj;
    }

    public final void trimToSize(int maxSize) {
        int findEvictionCandidate;
        while (this.size > maxSize && getCount() != 0 && (findEvictionCandidate = findEvictionCandidate()) != Integer.MAX_VALUE) {
            Object obj = this.keys[findEvictionCandidate];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
            Object removeValueAt = removeValueAt(findEvictionCandidate);
            if (removeValueAt != null) {
                this.size -= ((Number) this.sizeOf.invoke(obj, removeValueAt)).intValue();
                this.onEntryRemoved.invoke(obj, removeValueAt, null, Boolean.TRUE);
            }
        }
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            Object obj = objArr[i6];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                            Object obj2 = objArr2[i6];
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                            i3 += obj2.hashCode() ^ obj.hashCode();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    private final int findEvictionCandidate() {
        long[] jArr = this.nodes;
        int i = this.hand;
        if (i == Integer.MAX_VALUE) {
            i = this.tail;
        }
        while (i != Integer.MAX_VALUE) {
            long j = jArr[i];
            if (((int) ((j >> 62) & 1)) == 0) {
                break;
            }
            int i2 = (int) (2147483647L & (j >> 31));
            jArr[i] = 4611686018427387903L & j;
            i = i2 != Integer.MAX_VALUE ? i2 : this.tail;
        }
        int i3 = (int) (2147483647L & (jArr[i] >> 31));
        this.hand = i3 != Integer.MAX_VALUE ? i3 : Integer.MAX_VALUE;
        return i;
    }

    private final Object removeValueAt(int index) {
        this.count--;
        long[] jArr = this.metadata;
        int i = this.capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        this.keys[index] = null;
        Object[] objArr = this.values;
        Object obj = objArr[index];
        objArr[index] = null;
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
        if (this.hand == index) {
            this.hand = i4;
        }
        jArr2[index] = 4611686018427387903L;
        return obj;
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i = this.capacity;
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

    public final void adjustStorage$collection() {
        int compare;
        if (this.capacity > 8) {
            compare = Long.compare(ULong.m8077constructorimpl(ULong.m8077constructorimpl(getCount()) * 32) ^ Long.MIN_VALUE, ULong.m8077constructorimpl(ULong.m8077constructorimpl(this.capacity) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(ScatterMapKt.nextCapacity(this.capacity));
    }

    public final void dropDeletes$collection() {
        char c;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i = this.capacity;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i];
        int i2 = 0;
        ArraysKt.fill(jArr3, 9223372034707292159L, 0, i);
        int i3 = (i + 7) >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            long j = jArr[i4] & (-9187201950435737472L);
            jArr[i4] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i5 = lastIndex - 1;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i6 = 0;
        while (i6 != i) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j2 = (jArr[i7] >> i8) & 255;
            if (j2 != 128 && j2 == 254) {
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : i2) * (-862048943);
                int i9 = (hashCode ^ (hashCode << 16)) >>> 7;
                int findFirstAvailableSlot = findFirstAvailableSlot(i9);
                int i10 = i9 & i;
                if (((findFirstAvailableSlot - i10) & i) / 8 == ((i6 - i10) & i) / 8) {
                    Object[] objArr3 = objArr2;
                    long[] jArr4 = jArr2;
                    jArr[i7] = (jArr[i7] & (~(255 << i8))) | ((r12 & 127) << i8);
                    if (jArr3[i6] == 9223372034707292159L) {
                        long j3 = i6;
                        jArr3[i6] = j3 | (j3 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[0];
                    i6++;
                    objArr2 = objArr3;
                    jArr2 = jArr4;
                    i2 = 0;
                } else {
                    Object[] objArr4 = objArr2;
                    long[] jArr5 = jArr2;
                    int i11 = findFirstAvailableSlot >> 3;
                    long j4 = jArr[i11];
                    int i12 = (findFirstAvailableSlot & 7) << 3;
                    if (((j4 >> i12) & 255) == 128) {
                        jArr[i11] = ((r12 & 127) << i12) | (j4 & (~(255 << i12)));
                        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                        objArr[findFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = null;
                        objArr4[findFirstAvailableSlot] = objArr4[i6];
                        objArr4[i6] = null;
                        jArr5[findFirstAvailableSlot] = jArr5[i6];
                        jArr5[i6] = 4611686018427387903L;
                        int i13 = (int) ((jArr3[i6] >> 32) & 4294967295L);
                        if (i13 != Integer.MAX_VALUE) {
                            jArr3[i13] = (jArr3[i13] & (-4294967296L)) | findFirstAvailableSlot;
                            jArr3[i6] = (jArr3[i6] & 4294967295L) | (-4294967296L);
                            c = ' ';
                        } else {
                            c = ' ';
                            jArr3[i6] = (Integer.MAX_VALUE << 32) | findFirstAvailableSlot;
                        }
                        jArr3[findFirstAvailableSlot] = Integer.MAX_VALUE | (i6 << c);
                    } else {
                        jArr[i11] = ((r12 & 127) << i12) | (j4 & (~(255 << i12)));
                        Object obj2 = objArr[findFirstAvailableSlot];
                        objArr[findFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = obj2;
                        Object obj3 = objArr4[findFirstAvailableSlot];
                        objArr4[findFirstAvailableSlot] = objArr4[i6];
                        objArr4[i6] = obj3;
                        long j5 = jArr5[findFirstAvailableSlot];
                        jArr5[findFirstAvailableSlot] = jArr5[i6];
                        jArr5[i6] = j5;
                        int i14 = (int) ((jArr3[i6] >> 32) & 4294967295L);
                        if (i14 != Integer.MAX_VALUE) {
                            long j6 = findFirstAvailableSlot;
                            jArr3[i14] = (jArr3[i14] & (-4294967296L)) | j6;
                            jArr3[i6] = (jArr3[i6] & 4294967295L) | (j6 << 32);
                        } else {
                            long j7 = findFirstAvailableSlot;
                            jArr3[i6] = j7 | (j7 << 32);
                            i14 = i6;
                        }
                        jArr3[findFirstAvailableSlot] = (i14 << 32) | i6;
                        i6--;
                    }
                    jArr[jArr.length - 1] = jArr[0];
                    i6++;
                    i2 = 0;
                    objArr2 = objArr4;
                    jArr2 = jArr5;
                }
            } else {
                i6++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        Object[] objArr;
        int i;
        int[] iArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        long[] jArr3 = this.nodes;
        int i2 = this.capacity;
        int[] iArr2 = new int[i2];
        initializeStorage(newCapacity);
        long[] jArr4 = this.metadata;
        Object[] objArr4 = this.keys;
        Object[] objArr5 = this.values;
        long[] jArr5 = this.nodes;
        int i3 = this.capacity;
        int i4 = 0;
        while (i4 < i2) {
            if (((jArr2[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i4];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i5 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                jArr = jArr2;
                objArr = objArr2;
                long j = i5 & 127;
                int i6 = findFirstAvailableSlot >> 3;
                int i7 = (findFirstAvailableSlot & 7) << 3;
                i = i2;
                iArr = iArr2;
                long j2 = (j << i7) | (jArr4[i6] & (~(255 << i7)));
                jArr4[i6] = j2;
                jArr4[(((findFirstAvailableSlot - 7) & i3) + (i3 & 7)) >> 3] = j2;
                objArr4[findFirstAvailableSlot] = obj;
                objArr5[findFirstAvailableSlot] = objArr3[i4];
                jArr5[findFirstAvailableSlot] = jArr3[i4];
                iArr[i4] = findFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
                i = i2;
                iArr = iArr2;
            }
            i4++;
            jArr2 = jArr;
            objArr2 = objArr;
            i2 = i;
            iArr2 = iArr;
        }
        fixupNodes(iArr2);
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
        int i6 = this.hand;
        if (i6 != Integer.MAX_VALUE) {
            this.hand = (int) (mapping[i6] & 4294967295L);
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
        int i6 = this.hand;
        if (i6 != Integer.MAX_VALUE) {
            this.hand = mapping[i6];
        }
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SieveCache)) {
            return false;
        }
        SieveCache sieveCache = (SieveCache) other;
        if (sieveCache.getSize() != getSize() || sieveCache.count != this.count) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i4];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (!Intrinsics.areEqual(obj2, sieveCache.get(obj))) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public String toString() {
        return "SieveCache[maxSize=" + this._maxSize + ", size=" + this.size + ", capacity=" + this.capacity + ", count=" + this.count + ']';
    }

    private final int findInsertIndex(Object key) {
        int hashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.capacity;
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
                if (Intrinsics.areEqual(this.keys[numberOfTrailingZeros], key)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    findFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this.count++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = findFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this.capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((findFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return ~findFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    private final int findKeyIndex(Object key) {
        int i = 0;
        int hashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.capacity;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.areEqual(this.keys[numberOfTrailingZeros], key)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }
}
