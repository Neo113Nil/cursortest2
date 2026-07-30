package z5;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class b {
    public static final <E> E[] arrayOfUninitializedElements(int i8) {
        if (i8 >= 0) {
            return (E[]) new Object[i8];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final <T> T[] copyOfUninitializedElements(T[] tArr, int i8) {
        s.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i8);
        s.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    public static final <E> void resetAt(E[] eArr, int i8) {
        s.checkNotNullParameter(eArr, "<this>");
        eArr[i8] = null;
    }

    public static final <E> void resetRange(E[] eArr, int i8, int i9) {
        s.checkNotNullParameter(eArr, "<this>");
        while (i8 < i9) {
            resetAt(eArr, i8);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean subarrayContentEquals(T[] tArr, int i8, int i9, List<?> list) {
        if (i9 != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!s.areEqual(tArr[i8 + i10], list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int subarrayContentHashCode(T[] tArr, int i8, int i9) {
        int i10 = 1;
        for (int i11 = 0; i11 < i9; i11++) {
            T t7 = tArr[i8 + i11];
            i10 = (i10 * 31) + (t7 != null ? t7.hashCode() : 0);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String subarrayContentToString(T[] tArr, int i8, int i9) {
        StringBuilder sb = new StringBuilder((i9 * 3) + 2);
        sb.append("[");
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(tArr[i8 + i10]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
