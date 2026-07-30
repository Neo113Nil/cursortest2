package U6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2736a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f2737b;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f2736a = bytes;
        f2737b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final String a(long j, T6.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (j > 0) {
            long j7 = j - 1;
            if (fVar.g(j7) == 13) {
                String s7 = fVar.s(j7, Charsets.UTF_8);
                fVar.skip(2L);
                return s7;
            }
        }
        String s8 = fVar.s(j, Charsets.UTF_8);
        fVar.skip(1L);
        return s8;
    }
}
