package H2;

import kotlin.jvm.internal.Intrinsics;
import okio.y;

/* loaded from: classes3.dex */
public abstract class c {
    public static final int a(int[] iArr, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i4) {
                i5 = i8 + 1;
            } else {
                if (i9 <= i4) {
                    return i8;
                }
                i7 = i8 - 1;
            }
        }
        return (-i5) - 1;
    }

    public static final int b(y yVar, int i4) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        int a4 = a(yVar.A(), i4 + 1, 0, yVar.B().length);
        return a4 >= 0 ? a4 : ~a4;
    }
}
