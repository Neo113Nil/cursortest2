package t2;

import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class J {
    public static final int a(String str, int i4, int i5, int i6) {
        return (int) H.c(str, i4, i5, i6);
    }

    public static final long b(String str, long j4, long j5, long j6) {
        String d4 = H.d(str);
        if (d4 == null) {
            return j4;
        }
        Long n4 = StringsKt.n(d4);
        if (n4 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d4 + '\'').toString());
        }
        long longValue = n4.longValue();
        if (j5 <= longValue && longValue <= j6) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j6 + ", but is '" + longValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String d4 = H.d(str);
        return d4 == null ? str2 : d4;
    }

    public static final boolean d(String str, boolean z4) {
        String d4 = H.d(str);
        return d4 != null ? Boolean.parseBoolean(d4) : z4;
    }

    public static /* synthetic */ int e(String str, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return H.b(str, i4, i5, i6);
    }

    public static /* synthetic */ long f(String str, long j4, long j5, long j6, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j5 = 1;
        }
        long j7 = j5;
        if ((i4 & 8) != 0) {
            j6 = Long.MAX_VALUE;
        }
        return H.c(str, j4, j7, j6);
    }
}
