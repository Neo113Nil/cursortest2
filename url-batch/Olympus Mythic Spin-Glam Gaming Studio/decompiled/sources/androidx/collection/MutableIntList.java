package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.safedk.android.analytics.brandsafety.m;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntList.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "", "initialCapacity", "<init>", "(I)V", "element", "", m.l, "(I)Z", "capacity", "", "ensureCapacity", "index", "removeAt", "(I)I", "start", "end", "removeRange", "(II)V", "set", "(II)I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MutableIntList extends IntList {
    public MutableIntList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableIntList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final boolean add(int element) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i = this._size;
        iArr[i] = element;
        this._size = i + 1;
        return true;
    }

    public final void ensureCapacity(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.content = copyOf;
        }
    }

    public final int removeAt(int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        int i2 = this._size;
        if (index != i2 - 1) {
            ArraysKt.copyInto(iArr, iArr, index, index + 1, i2);
        }
        this._size--;
        return i;
    }

    public final void removeRange(int start, int end) {
        int i;
        if (start < 0 || start > (i = this._size) || end < 0 || end > i) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (end < start) {
            RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (end != start) {
            int i2 = this._size;
            if (end < i2) {
                int[] iArr = this.content;
                ArraysKt.copyInto(iArr, iArr, start, end, i2);
            }
            this._size -= end - start;
        }
    }

    public final int set(int index, int element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        iArr[index] = element;
        return i;
    }
}
