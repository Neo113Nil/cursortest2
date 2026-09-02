package o6;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f5623a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f5624b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(F5.a.f785a);
        i.d(bytes, "getBytes(...)");
        f5623a = bytes;
        f5624b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final String a(long j4, n6.f fVar) {
        if (j4 > 0) {
            long j7 = j4 - 1;
            if (fVar.e(j7) == 13) {
                String n7 = fVar.n(j7, F5.a.f785a);
                fVar.skip(2L);
                return n7;
            }
        }
        String n8 = fVar.n(j4, F5.a.f785a);
        fVar.skip(1L);
        return n8;
    }
}
