package kotlin.collections;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes4.dex */
class i {
    public static final <T> T[] arrayOfNulls(T[] reference, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i8);
        kotlin.jvm.internal.s.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    public static final <T> int contentDeepHashCode(T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    public static final void copyOfRangeToIndexCheck(int i8, int i9) {
        if (i8 <= i9) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is greater than size (" + i9 + ").");
    }

    public static final /* synthetic */ <T> T[] orEmpty(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        kotlin.jvm.internal.s.reifiedOperationMarker(0, "T?");
        return (T[]) new Object[0];
    }

    private static final String toString(byte[] bArr, Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] toTypedArray(Collection<? extends T> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.s.reifiedOperationMarker(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
