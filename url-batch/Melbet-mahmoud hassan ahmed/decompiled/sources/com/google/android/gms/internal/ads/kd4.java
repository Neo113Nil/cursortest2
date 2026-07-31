package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kd4 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f7472a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7473b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f7474c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f7475d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f7476e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f7477f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f7478g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int b(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!m(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = f7473b[i11];
        if (i8 == 2) {
            i12 /= 2;
        } else if (i8 == 0) {
            i12 /= 4;
        }
        int i13 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            return ((((i8 == 3 ? f7474c[i10 - 1] : f7475d[i10 - 1]) * 12) / i12) + i13) * 4;
        }
        int i14 = i8 == 3 ? i9 == 2 ? f7476e[i10 - 1] : f7477f[i10 - 1] : f7478g[i10 - 1];
        if (i8 == 3) {
            return ((i14 * 144) / i12) + i13;
        }
        return (((i9 == 1 ? 72 : 144) * i14) / i12) + i13;
    }

    public static int c(int i7) {
        int i8;
        int i9;
        if (!m(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = (i7 >>> 12) & 15;
        int i11 = (i7 >>> 10) & 3;
        if (i10 == 0 || i10 == 15 || i11 == 3) {
            return -1;
        }
        return l(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i7, int i8) {
        return i8 != 1 ? i8 != 2 ? 384 : 1152 : i7 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(int i7) {
        return (i7 & (-2097152)) == -2097152;
    }
}
