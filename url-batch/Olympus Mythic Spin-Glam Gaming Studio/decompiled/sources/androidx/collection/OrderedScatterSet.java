package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderedScatterSet.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJY\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010\u0004R$\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010\u0004R\u001c\u0010%\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b%\u0010\u001f\u0012\u0004\b&\u0010\u0004R\u001c\u0010'\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0004R\u001c\u0010*\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b*\u0010(\u0012\u0004\b+\u0010\u0004R\u0016\u0010,\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b,\u0010(R\u0016\u0010-\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b-\u0010(R\u0011\u0010/\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0011\u00101\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b0\u0010\u0018\u0082\u0001\u00012¨\u00063"}, d2 = {"Landroidx/collection/OrderedScatterSet;", "E", "", "<init>", "()V", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "hashCode", "()I", "other", "equals", "toString", "()Ljava/lang/String;", "", "metadata", "[J", "getMetadata$annotations", "", "elements", "[Ljava/lang/Object;", "getElements$annotations", "nodes", "getNodes$annotations", "head", "I", "getHead$annotations", "tail", "getTail$annotations", "_capacity", "_size", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableOrderedScatterSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class OrderedScatterSet<E> {
    public int _capacity;
    public int _size;
    public Object[] elements;
    public int head;
    public long[] metadata;
    public long[] nodes;
    public int tail;

    public /* synthetic */ OrderedScatterSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OrderedScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
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

    public static /* synthetic */ String joinToString$default(OrderedScatterSet orderedScatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return orderedScatterSet.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1 transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i = this.tail;
        int i2 = 0;
        while (true) {
            if (i != Integer.MAX_VALUE) {
                int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
                Object obj = objArr[i];
                if (i2 == limit) {
                    sb.append(truncated);
                    break;
                }
                if (i2 != 0) {
                    sb.append(separator);
                }
                if (transform == null) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) transform.invoke(obj));
                }
                i2++;
                i = i3;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public int hashCode() {
        int i = (this._capacity * 31) + this._size;
        Object[] objArr = this.elements;
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
                            Object obj = objArr[(i2 << 3) + i4];
                            if (!Intrinsics.areEqual(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
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
        return i;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderedScatterSet)) {
            return false;
        }
        OrderedScatterSet orderedScatterSet = (OrderedScatterSet) other;
        if (orderedScatterSet.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !orderedScatterSet.contains(objArr[(i << 3) + i3])) {
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
        return joinToString$default(this, null, X3.j.d, X3.j.e, 0, null, new Function1(this) { // from class: androidx.collection.OrderedScatterSet$toString$1
            final /* synthetic */ OrderedScatterSet<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((OrderedScatterSet$toString$1) obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(E e) {
                if (e == this.this$0) {
                    return "(this)";
                }
                return String.valueOf(e);
            }
        }, 25, null);
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
    public final boolean contains(Object element) {
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
        return i >= 0;
    }
}
