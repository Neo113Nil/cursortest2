package i;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: i.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0664E {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f6891a = {-9187201950435737345L, -1};

    static {
        new y(0);
    }

    public static final void a(long[] metadata, int i2) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i4 = (i2 + 7) >> 3;
        for (int i5 = 0; i5 < i4; i5++) {
            long j4 = metadata[i5] & (-9187201950435737472L);
            metadata[i5] = (-72340172838076674L) & ((~j4) + (j4 >>> 7));
        }
        Intrinsics.checkNotNullParameter(metadata, "<this>");
        int length = metadata.length;
        int i6 = length - 1;
        int i7 = length - 2;
        metadata[i7] = (metadata[i7] & 72057594037927935L) | (-72057594037927936L);
        metadata[i6] = metadata[0];
    }

    public static final int b(long[] metadata, int i2, int i4) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        while (i2 < i4) {
            if (((metadata[i2 >> 3] >> ((i2 & 7) << 3)) & 255) == 128) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final int c(int i2) {
        if (i2 == 7) {
            return 6;
        }
        return i2 - (i2 / 8);
    }

    public static final int d(int i2) {
        if (i2 == 0) {
            return 6;
        }
        return (i2 * 2) + 1;
    }

    public static final int e(int i2) {
        if (i2 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i2);
        }
        return 0;
    }

    public static final int f(int i2) {
        if (i2 == 7) {
            return 8;
        }
        return ((i2 - 1) / 7) + i2;
    }
}
