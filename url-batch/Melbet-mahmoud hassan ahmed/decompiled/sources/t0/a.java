package t0;

import r0.n2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f21665a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f21666b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f21667a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21668b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21669c;

        private b(int i7, int i8, String str) {
            this.f21667a = i7;
            this.f21668b = i8;
            this.f21669c = str;
        }
    }

    public static byte[] a(int i7, int i8) {
        int i9 = 0;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            int[] iArr = f21665a;
            if (i10 >= iArr.length) {
                break;
            }
            if (i7 == iArr[i10]) {
                i11 = i10;
            }
            i10++;
        }
        int i12 = -1;
        while (true) {
            int[] iArr2 = f21666b;
            if (i9 >= iArr2.length) {
                break;
            }
            if (i8 == iArr2[i9]) {
                i12 = i9;
            }
            i9++;
        }
        if (i7 != -1 && i12 != -1) {
            return b(2, i11, i12);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i7 + ", " + i8);
    }

    public static byte[] b(int i7, int i8, int i9) {
        return new byte[]{(byte) (((i7 << 3) & 248) | ((i8 >> 1) & 7)), (byte) (((i8 << 7) & 128) | ((i9 << 3) & 120))};
    }

    private static int c(o2.z zVar) {
        int h7 = zVar.h(5);
        return h7 == 31 ? zVar.h(6) + 32 : h7;
    }

    private static int d(o2.z zVar) {
        int h7 = zVar.h(4);
        if (h7 == 15) {
            return zVar.h(24);
        }
        if (h7 < 13) {
            return f21665a[h7];
        }
        throw n2.a(null, null);
    }

    public static b e(o2.z zVar, boolean z6) {
        int c7 = c(zVar);
        int d7 = d(zVar);
        int h7 = zVar.h(4);
        String str = "mp4a.40." + c7;
        if (c7 == 5 || c7 == 29) {
            d7 = d(zVar);
            c7 = c(zVar);
            if (c7 == 22) {
                h7 = zVar.h(4);
            }
        }
        if (z6) {
            if (c7 != 1 && c7 != 2 && c7 != 3 && c7 != 4 && c7 != 6 && c7 != 7 && c7 != 17) {
                switch (c7) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw n2.d("Unsupported audio object type: " + c7);
                }
            }
            g(zVar, c7, h7);
            switch (c7) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h8 = zVar.h(2);
                    if (h8 == 2 || h8 == 3) {
                        throw n2.d("Unsupported epConfig: " + h8);
                    }
            }
        }
        int i7 = f21666b[h7];
        if (i7 != -1) {
            return new b(d7, i7, str);
        }
        throw n2.a(null, null);
    }

    public static b f(byte[] bArr) {
        return e(new o2.z(bArr), false);
    }

    private static void g(o2.z zVar, int i7, int i8) {
        if (zVar.g()) {
            o2.r.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (zVar.g()) {
            zVar.r(14);
        }
        boolean g7 = zVar.g();
        if (i8 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i7 == 6 || i7 == 20) {
            zVar.r(3);
        }
        if (g7) {
            if (i7 == 22) {
                zVar.r(16);
            }
            if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                zVar.r(3);
            }
            zVar.r(1);
        }
    }
}
