package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: IntList.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0007JA\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0007J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010 \u0082\u0001\u0001$¨\u0006%"}, d2 = {"Landroidx/collection/IntList;", "", "", "initialCapacity", "<init>", "(I)V", "first", "()I", "index", "get", "(I)I", "last", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "content", "[I", "getContent$annotations", "()V", "_size", "I", "get_size$annotations", "Landroidx/collection/MutableIntList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IntList {
    public int _size;
    public int[] content;

    public /* synthetic */ IntList(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    private IntList(int i) {
        int[] iArr;
        if (i == 0) {
            iArr = IntSetKt.getEmptyIntArray();
        } else {
            iArr = new int[i];
        }
        this.content = iArr;
    }

    public int hashCode() {
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final int get(int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final int first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[0];
    }

    public final int last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return intList.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == limit) {
                    sb.append(truncated);
                    break;
                }
                if (i2 != 0) {
                    sb.append(separator);
                }
                sb.append(i3);
                i2++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public boolean equals(Object other) {
        if (other instanceof IntList) {
            IntList intList = (IntList) other;
            int i = intList._size;
            int i2 = this._size;
            if (i == i2) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                IntRange until = RangesKt.until(0, i2);
                int first = until.getFirst();
                int last = until.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, X3.j.d, X3.j.e, 0, null, 25, null);
    }
}
