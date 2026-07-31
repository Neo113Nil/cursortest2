package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LongObjectMap.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001b\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u0012\u0004\b\u001c\u0010\u0004R$\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010\u0004R\u001c\u0010!\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010\u0004R\u001c\u0010$\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b$\u0010\"\u0012\u0004\b%\u0010\u0004R\u0011\u0010'\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0010R\u0011\u0010)\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0010\u0082\u0001\u0001*¨\u0006+"}, d2 = {"Landroidx/collection/LongObjectMap;", "V", "", "<init>", "()V", "", "isEmpty", "()Z", "", "key", "get", "(J)Ljava/lang/Object;", "containsKey", "(J)Z", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "metadata", "[J", "getMetadata$annotations", "keys", "getKeys$annotations", "", "values", "[Ljava/lang/Object;", "getValues$annotations", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableLongObjectMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class LongObjectMap<V> {
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ LongObjectMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LongObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public int hashCode() {
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            long j2 = jArr[i6];
                            Object obj = objArr[i6];
                            i3 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
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

    public boolean equals(Object other) {
        int i;
        if (other == this) {
            return true;
        }
        if (!(other instanceof LongObjectMap)) {
            return false;
        }
        LongObjectMap longObjectMap = (LongObjectMap) other;
        if (longObjectMap.get_size() != get_size()) {
            return false;
        }
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            i = i5;
                            long j2 = jArr[i6];
                            Object obj = objArr[i6];
                            if (obj == null) {
                                if (longObjectMap.get(j2) != null || !longObjectMap.containsKey(j2)) {
                                    break loop0;
                                }
                            } else if (!Intrinsics.areEqual(obj, longObjectMap.get(j2))) {
                                return false;
                            }
                            i3 = 8;
                        } else {
                            i = i5;
                        }
                        j >>= i3;
                        i5 = i + 1;
                    }
                    if (i4 != i3) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
            return false;
        }
        return true;
    }

    public String toString() {
        int i;
        int i2;
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this._size) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsKey(long key) {
        int i;
        int hashCode = Long.hashCode(key) * (-862048943);
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
                if (this.keys[i] == key) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long key) {
        int i;
        int hashCode = Long.hashCode(key) * (-862048943);
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
                if (this.keys[i] == key) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            return this.values[i];
        }
        return null;
    }
}
