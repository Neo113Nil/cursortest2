package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0005R$\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\u0005R$\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\"\u0010 \u0012\u0004\b#\u0010\u0005R\u0016\u0010$\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0011\u0010(\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0011\u0010*\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014\u0082\u0001\u0001+¨\u0006,"}, d2 = {"Landroidx/collection/ScatterMap;", "K", "V", "", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "contains", "(Ljava/lang/Object;)Z", "containsKey", "value", "containsValue", "", "hashCode", "()I", "other", "equals", "", "toString", "()Ljava/lang/String;", "", "metadata", "[J", "getMetadata$annotations", "", "keys", "[Ljava/lang/Object;", "getKeys$annotations", "values", "getValues$annotations", "_capacity", "I", "_size", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableScatterMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ScatterMap<K, V> {
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ ScatterMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ScatterMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        Object[] objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        this.keys = objArr;
        this.values = objArr;
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

    public final boolean isNotEmpty() {
        return this._size != 0;
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
                            Object obj2 = objArr2[i6];
                            i3 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean containsValue(Object value) {
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && Intrinsics.areEqual(value, objArr[(i << 3) + i3])) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ScatterMap)) {
            return false;
        }
        ScatterMap scatterMap = (ScatterMap) other;
        if (scatterMap.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            if (obj2 == null) {
                                if (scatterMap.get(obj) != null || !scatterMap.containsKey(obj)) {
                                    break loop0;
                                }
                            } else if (!Intrinsics.areEqual(obj2, scatterMap.get(obj))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i2++;
                            if (i2 < this._size) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object key) {
        int i;
        int hashCode = (key != null ? key.hashCode() : 0) * (-862048943);
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
                if (Intrinsics.areEqual(this.keys[i], key)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsKey(Object key) {
        int i;
        int hashCode = (key != null ? key.hashCode() : 0) * (-862048943);
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
                if (Intrinsics.areEqual(this.keys[i], key)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object key) {
        int i;
        int i2 = 0;
        int hashCode = (key != null ? key.hashCode() : 0) * (-862048943);
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
                if (Intrinsics.areEqual(this.keys[i], key)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return this.values[i];
        }
        return null;
    }
}
