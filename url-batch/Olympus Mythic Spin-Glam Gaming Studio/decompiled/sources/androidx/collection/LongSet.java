package androidx.collection;

import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LongSet.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0003R\u001c\u0010\u001e\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u0012\u0004\b\u001f\u0010\u0003R\u0016\u0010 \u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0011\u0010$\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b#\u0010\u0014\u0082\u0001\u0001%¨\u0006&"}, d2 = {"Landroidx/collection/LongSet;", "", "<init>", "()V", "", "element", "", "contains", "(J)Z", "", "separator", "prefix", "postfix", "", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "metadata", "[J", "getMetadata$annotations", "elements", "getElements$annotations", "_capacity", "I", "_size", "getCapacity", "capacity", "Landroidx/collection/MutableLongSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LongSet {
    public int _capacity;
    public int _size;
    public long[] elements;
    public long[] metadata;

    public /* synthetic */ LongSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LongSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = LongSetKt.getEmptyLongArray();
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public int hashCode() {
        long[] jArr = this.elements;
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
                            i3 += Long.hashCode(jArr[(i2 << 3) + i5]);
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

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        return longSet.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            i2 = i3;
                            long j2 = jArr[(i3 << 3) + i7];
                            if (i4 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(separator);
                            }
                            sb.append(j2);
                            i4++;
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i7++;
                        i5 = 8;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i6 != i5) {
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
        sb.append(postfix);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LongSet)) {
            return false;
        }
        LongSet longSet = (LongSet) other;
        if (longSet._size != this._size) {
            return false;
        }
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !longSet.contains(jArr[(i << 3) + i3])) {
                            return false;
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
        return true;
    }

    public String toString() {
        return joinToString$default(this, null, X3.j.d, X3.j.e, 0, null, 25, null);
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
    public final boolean contains(long element) {
        int i;
        int hashCode = Long.hashCode(element) * (-862048943);
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
                if (this.elements[i] == element) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }
}
