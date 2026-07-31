package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArraySet.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"E", "Landroidx/collection/ArraySet;", "", "hash", "binarySearchInternal", "(Landroidx/collection/ArraySet;I)I", "", "key", "indexOf", "(Landroidx/collection/ArraySet;Ljava/lang/Object;I)I", "indexOfNull", "(Landroidx/collection/ArraySet;)I", "size", "", "allocArrays", "(Landroidx/collection/ArraySet;I)V", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ArraySetKt {
    public static final int binarySearchInternal(ArraySet arraySet, int i) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        try {
            return ContainerHelpersKt.binarySearch(arraySet.getHashes(), arraySet.get_size$collection(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int indexOf(ArraySet arraySet, Object obj, int i) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int i2 = arraySet.get_size$collection();
        if (i2 == 0) {
            return -1;
        }
        int binarySearchInternal = binarySearchInternal(arraySet, i);
        if (binarySearchInternal < 0 || Intrinsics.areEqual(obj, arraySet.getArray()[binarySearchInternal])) {
            return binarySearchInternal;
        }
        int i3 = binarySearchInternal + 1;
        while (i3 < i2 && arraySet.getHashes()[i3] == i) {
            if (Intrinsics.areEqual(obj, arraySet.getArray()[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = binarySearchInternal - 1; i4 >= 0 && arraySet.getHashes()[i4] == i; i4--) {
            if (Intrinsics.areEqual(obj, arraySet.getArray()[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static final int indexOfNull(ArraySet arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return indexOf(arraySet, null, 0);
    }

    public static final void allocArrays(ArraySet arraySet, int i) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        arraySet.setHashes$collection(new int[i]);
        arraySet.setArray$collection(new Object[i]);
    }
}
