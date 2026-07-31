package X1;

import com.ironsource.b9;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c {
    public static final Object[] d(int i4) {
        if (i4 >= 0) {
            return new Object[i4];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final Object[] e(Object[] objArr, int i4) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Object[] copyOf = Arrays.copyOf(objArr, i4);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static final void f(Object[] objArr, int i4) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        objArr[i4] = null;
    }

    public static final void g(Object[] objArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i4 < i5) {
            f(objArr, i4);
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Object[] objArr, int i4, int i5, List list) {
        if (i5 != list.size()) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!Intrinsics.areEqual(objArr[i4 + i6], list.get(i6))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(Object[] objArr, int i4, int i5) {
        int i6 = 1;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i4 + i7];
            i6 = (i6 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Object[] objArr, int i4, int i5, Collection collection) {
        StringBuilder sb = new StringBuilder((i5 * 3) + 2);
        sb.append(b9.i.f15550d);
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i4 + i6];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append(b9.i.f15552e);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
