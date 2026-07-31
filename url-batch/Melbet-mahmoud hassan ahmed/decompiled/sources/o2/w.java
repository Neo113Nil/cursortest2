package o2;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f19796a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f19797b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f19798c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f19799d = new int[10];

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f19800a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19801b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19802c;

        /* renamed from: d, reason: collision with root package name */
        public final int f19803d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f19804e;

        /* renamed from: f, reason: collision with root package name */
        public final int f19805f;

        /* renamed from: g, reason: collision with root package name */
        public final int f19806g;

        /* renamed from: h, reason: collision with root package name */
        public final int f19807h;

        /* renamed from: i, reason: collision with root package name */
        public final int f19808i;

        /* renamed from: j, reason: collision with root package name */
        public final float f19809j;

        public a(int i7, boolean z6, int i8, int i9, int[] iArr, int i10, int i11, int i12, int i13, float f7) {
            this.f19800a = i7;
            this.f19801b = z6;
            this.f19802c = i8;
            this.f19803d = i9;
            this.f19804e = iArr;
            this.f19805f = i10;
            this.f19806g = i11;
            this.f19807h = i12;
            this.f19808i = i13;
            this.f19809j = f7;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f19810a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19811b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f19812c;

        public b(int i7, int i8, boolean z6) {
            this.f19810a = i7;
            this.f19811b = i8;
            this.f19812c = z6;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f19813a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19814b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19815c;

        /* renamed from: d, reason: collision with root package name */
        public final int f19816d;

        /* renamed from: e, reason: collision with root package name */
        public final int f19817e;

        /* renamed from: f, reason: collision with root package name */
        public final int f19818f;

        /* renamed from: g, reason: collision with root package name */
        public final int f19819g;

        /* renamed from: h, reason: collision with root package name */
        public final float f19820h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f19821i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f19822j;

        /* renamed from: k, reason: collision with root package name */
        public final int f19823k;

        /* renamed from: l, reason: collision with root package name */
        public final int f19824l;

        /* renamed from: m, reason: collision with root package name */
        public final int f19825m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f19826n;

        public c(int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f7, boolean z6, boolean z7, int i14, int i15, int i16, boolean z8) {
            this.f19813a = i7;
            this.f19814b = i8;
            this.f19815c = i9;
            this.f19816d = i10;
            this.f19817e = i11;
            this.f19818f = i12;
            this.f19819g = i13;
            this.f19820h = f7;
            this.f19821i = z6;
            this.f19822j = z7;
            this.f19823k = i14;
            this.f19824l = i15;
            this.f19825m = i16;
            this.f19826n = z8;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = i7 + 1;
            if (i9 >= position) {
                byteBuffer.clear();
                return;
            }
            int i10 = byteBuffer.get(i7) & 255;
            if (i8 == 3) {
                if (i10 == 1 && (byteBuffer.get(i9) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i7 - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i10 == 0) {
                i8++;
            }
            if (i10 != 0) {
                i8 = 0;
            }
            i7 = i9;
        }
    }

    public static int c(byte[] bArr, int i7, int i8, boolean[] zArr) {
        int i9 = i8 - i7;
        o2.a.f(i9 >= 0);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            a(zArr);
            return i7 - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            a(zArr);
            return i7 - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            a(zArr);
            return i7 - 1;
        }
        int i10 = i8 - 1;
        int i11 = i7 + 2;
        while (i11 < i10) {
            if ((bArr[i11] & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && bArr[i11] == 1) {
                    a(zArr);
                    return i12;
                }
                i11 -= 2;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i8 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i8 + (-3)] == 0 && bArr[i8 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i8 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i8;
    }

    private static int d(byte[] bArr, int i7, int i8) {
        while (i7 < i8 - 2) {
            if (bArr[i7] == 0 && bArr[i7 + 1] == 0 && bArr[i7 + 2] == 3) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static int e(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i7) {
        return bArr[i7 + 3] & 31;
    }

    public static boolean g(String str, byte b7) {
        if ("video/avc".equals(str) && (b7 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b7 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i7, int i8) {
        return i(bArr, i7 + 2, i8);
    }

    public static a i(byte[] bArr, int i7, int i8) {
        b0 b0Var = new b0(bArr, i7, i8);
        b0Var.l(4);
        int e7 = b0Var.e(3);
        b0Var.k();
        int e8 = b0Var.e(2);
        boolean d7 = b0Var.d();
        int e9 = b0Var.e(5);
        int i9 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            if (b0Var.d()) {
                i9 |= 1 << i10;
            }
        }
        int[] iArr = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            iArr[i11] = b0Var.e(8);
        }
        int e10 = b0Var.e(8);
        int i12 = 0;
        for (int i13 = 0; i13 < e7; i13++) {
            if (b0Var.d()) {
                i12 += 89;
            }
            if (b0Var.d()) {
                i12 += 8;
            }
        }
        b0Var.l(i12);
        if (e7 > 0) {
            b0Var.l((8 - e7) * 2);
        }
        int h7 = b0Var.h();
        int h8 = b0Var.h();
        if (h8 == 3) {
            b0Var.k();
        }
        int h9 = b0Var.h();
        int h10 = b0Var.h();
        if (b0Var.d()) {
            int h11 = b0Var.h();
            int h12 = b0Var.h();
            int h13 = b0Var.h();
            int h14 = b0Var.h();
            h9 -= ((h8 == 1 || h8 == 2) ? 2 : 1) * (h11 + h12);
            h10 -= (h8 == 1 ? 2 : 1) * (h13 + h14);
        }
        b0Var.h();
        b0Var.h();
        int h15 = b0Var.h();
        int i14 = b0Var.d() ? 0 : e7;
        while (true) {
            b0Var.h();
            b0Var.h();
            b0Var.h();
            if (i14 > e7) {
                break;
            }
            i14++;
        }
        b0Var.h();
        b0Var.h();
        b0Var.h();
        if (b0Var.d() && b0Var.d()) {
            n(b0Var);
        }
        b0Var.l(2);
        if (b0Var.d()) {
            b0Var.l(8);
            b0Var.h();
            b0Var.h();
            b0Var.k();
        }
        p(b0Var);
        if (b0Var.d()) {
            for (int i15 = 0; i15 < b0Var.h(); i15++) {
                b0Var.l(h15 + 4 + 1);
            }
        }
        b0Var.l(2);
        float f7 = 1.0f;
        if (b0Var.d()) {
            if (b0Var.d()) {
                int e11 = b0Var.e(8);
                if (e11 == 255) {
                    int e12 = b0Var.e(16);
                    int e13 = b0Var.e(16);
                    if (e12 != 0 && e13 != 0) {
                        f7 = e12 / e13;
                    }
                } else {
                    float[] fArr = f19797b;
                    if (e11 < fArr.length) {
                        f7 = fArr[e11];
                    } else {
                        r.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e11);
                    }
                }
            }
            if (b0Var.d()) {
                b0Var.k();
            }
            if (b0Var.d()) {
                b0Var.l(4);
                if (b0Var.d()) {
                    b0Var.l(24);
                }
            }
            if (b0Var.d()) {
                b0Var.h();
                b0Var.h();
            }
            b0Var.k();
            if (b0Var.d()) {
                h10 *= 2;
            }
        }
        return new a(e8, d7, e9, i9, iArr, e10, h7, h9, h10, f7);
    }

    public static b j(byte[] bArr, int i7, int i8) {
        return k(bArr, i7 + 1, i8);
    }

    public static b k(byte[] bArr, int i7, int i8) {
        b0 b0Var = new b0(bArr, i7, i8);
        int h7 = b0Var.h();
        int h8 = b0Var.h();
        b0Var.k();
        return new b(h7, h8, b0Var.d());
    }

    public static c l(byte[] bArr, int i7, int i8) {
        return m(bArr, i7 + 1, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c m(byte[] bArr, int i7, int i8) {
        int h7;
        boolean d7;
        int i9;
        boolean z6;
        boolean d8;
        float f7;
        int e7;
        int i10;
        int i11;
        int i12;
        b0 b0Var = new b0(bArr, i7, i8);
        int e8 = b0Var.e(8);
        int e9 = b0Var.e(8);
        int e10 = b0Var.e(8);
        int h8 = b0Var.h();
        int i13 = 1;
        if (e8 == 100 || e8 == 110 || e8 == 122 || e8 == 244 || e8 == 44 || e8 == 83 || e8 == 86 || e8 == 118 || e8 == 128 || e8 == 138) {
            h7 = b0Var.h();
            d7 = h7 == 3 ? b0Var.d() : false;
            b0Var.h();
            b0Var.h();
            b0Var.k();
            if (b0Var.d()) {
                int i14 = h7 != 3 ? 8 : 12;
                int i15 = 0;
                while (i15 < i14) {
                    if (b0Var.d()) {
                        o(b0Var, i15 < 6 ? 16 : 64);
                    }
                    i15++;
                }
            }
        } else {
            h7 = 1;
            d7 = false;
        }
        int h9 = b0Var.h() + 4;
        int h10 = b0Var.h();
        if (h10 == 0) {
            i9 = b0Var.h() + 4;
        } else {
            if (h10 == 1) {
                boolean d9 = b0Var.d();
                b0Var.g();
                b0Var.g();
                long h11 = b0Var.h();
                for (int i16 = 0; i16 < h11; i16++) {
                    b0Var.h();
                }
                z6 = d9;
                i9 = 0;
                int h12 = b0Var.h();
                b0Var.k();
                int h13 = b0Var.h() + 1;
                int h14 = b0Var.h() + 1;
                d8 = b0Var.d();
                int i17 = (2 - (d8 ? 1 : 0)) * h14;
                if (!d8) {
                    b0Var.k();
                }
                b0Var.k();
                int i18 = h13 * 16;
                int i19 = i17 * 16;
                if (b0Var.d()) {
                    int h15 = b0Var.h();
                    int h16 = b0Var.h();
                    int h17 = b0Var.h();
                    int h18 = b0Var.h();
                    if (h7 == 0) {
                        i12 = 2 - (d8 ? 1 : 0);
                    } else {
                        if (h7 == 3) {
                            i10 = 1;
                            i11 = 1;
                        } else {
                            i10 = 1;
                            i11 = 2;
                        }
                        if (h7 == i10) {
                            i10 = 2;
                        }
                        i12 = (2 - (d8 ? 1 : 0)) * i10;
                        i13 = i11;
                    }
                    i18 -= (h15 + h16) * i13;
                    i19 -= (h17 + h18) * i12;
                }
                int i20 = i19;
                int i21 = i18;
                float f8 = 1.0f;
                if (b0Var.d() && b0Var.d()) {
                    e7 = b0Var.e(8);
                    if (e7 != 255) {
                        int e11 = b0Var.e(16);
                        int e12 = b0Var.e(16);
                        if (e11 != 0 && e12 != 0) {
                            f8 = e11 / e12;
                        }
                        f7 = f8;
                    } else {
                        float[] fArr = f19797b;
                        if (e7 < fArr.length) {
                            f7 = fArr[e7];
                        } else {
                            r.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e7);
                        }
                    }
                    return new c(e8, e9, e10, h8, h12, i21, i20, f7, d7, d8, h9, h10, i9, z6);
                }
                f7 = 1.0f;
                return new c(e8, e9, e10, h8, h12, i21, i20, f7, d7, d8, h9, h10, i9, z6);
            }
            i9 = 0;
        }
        z6 = false;
        int h122 = b0Var.h();
        b0Var.k();
        int h132 = b0Var.h() + 1;
        int h142 = b0Var.h() + 1;
        d8 = b0Var.d();
        int i172 = (2 - (d8 ? 1 : 0)) * h142;
        if (!d8) {
        }
        b0Var.k();
        int i182 = h132 * 16;
        int i192 = i172 * 16;
        if (b0Var.d()) {
        }
        int i202 = i192;
        int i212 = i182;
        float f82 = 1.0f;
        if (b0Var.d()) {
            e7 = b0Var.e(8);
            if (e7 != 255) {
            }
            return new c(e8, e9, e10, h8, h122, i212, i202, f7, d7, d8, h9, h10, i9, z6);
        }
        f7 = 1.0f;
        return new c(e8, e9, e10, h8, h122, i212, i202, f7, d7, d8, h9, h10, i9, z6);
    }

    private static void n(b0 b0Var) {
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = 0;
            while (i8 < 6) {
                int i9 = 1;
                if (b0Var.d()) {
                    int min = Math.min(64, 1 << ((i7 << 1) + 4));
                    if (i7 > 1) {
                        b0Var.g();
                    }
                    for (int i10 = 0; i10 < min; i10++) {
                        b0Var.g();
                    }
                } else {
                    b0Var.h();
                }
                if (i7 == 3) {
                    i9 = 3;
                }
                i8 += i9;
            }
        }
    }

    private static void o(b0 b0Var, int i7) {
        int i8 = 8;
        int i9 = 8;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i8 != 0) {
                i8 = ((b0Var.g() + i9) + 256) % 256;
            }
            if (i8 != 0) {
                i9 = i8;
            }
        }
    }

    private static void p(b0 b0Var) {
        int h7 = b0Var.h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        while (i9 < h7) {
            if (i9 != 0 && b0Var.d()) {
                int i10 = i7 + i8;
                int h8 = (1 - ((b0Var.d() ? 1 : 0) * 2)) * (b0Var.h() + 1);
                int i11 = i10 + 1;
                boolean[] zArr = new boolean[i11];
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (b0Var.d()) {
                        zArr[i12] = true;
                    } else {
                        zArr[i12] = b0Var.d();
                    }
                }
                int[] iArr3 = new int[i11];
                int[] iArr4 = new int[i11];
                int i13 = 0;
                for (int i14 = i8 - 1; i14 >= 0; i14--) {
                    int i15 = iArr2[i14] + h8;
                    if (i15 < 0 && zArr[i7 + i14]) {
                        iArr3[i13] = i15;
                        i13++;
                    }
                }
                if (h8 < 0 && zArr[i10]) {
                    iArr3[i13] = h8;
                    i13++;
                }
                for (int i16 = 0; i16 < i7; i16++) {
                    int i17 = iArr[i16] + h8;
                    if (i17 < 0 && zArr[i16]) {
                        iArr3[i13] = i17;
                        i13++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr3, i13);
                int i18 = 0;
                for (int i19 = i7 - 1; i19 >= 0; i19--) {
                    int i20 = iArr[i19] + h8;
                    if (i20 > 0 && zArr[i19]) {
                        iArr4[i18] = i20;
                        i18++;
                    }
                }
                if (h8 > 0 && zArr[i10]) {
                    iArr4[i18] = h8;
                    i18++;
                }
                for (int i21 = 0; i21 < i8; i21++) {
                    int i22 = iArr2[i21] + h8;
                    if (i22 > 0 && zArr[i7 + i21]) {
                        iArr4[i18] = i22;
                        i18++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr4, i18);
                iArr = copyOf;
                i7 = i13;
                i8 = i18;
            } else {
                int h9 = b0Var.h();
                int h10 = b0Var.h();
                int[] iArr5 = new int[h9];
                for (int i23 = 0; i23 < h9; i23++) {
                    iArr5[i23] = b0Var.h() + 1;
                    b0Var.k();
                }
                int[] iArr6 = new int[h10];
                for (int i24 = 0; i24 < h10; i24++) {
                    iArr6[i24] = b0Var.h() + 1;
                    b0Var.k();
                }
                i7 = h9;
                iArr = iArr5;
                i8 = h10;
                iArr2 = iArr6;
            }
            i9++;
        }
    }

    public static int q(byte[] bArr, int i7) {
        int i8;
        synchronized (f19798c) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                try {
                    i9 = d(bArr, i9, i7);
                    if (i9 < i7) {
                        int[] iArr = f19799d;
                        if (iArr.length <= i10) {
                            f19799d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f19799d[i10] = i9;
                        i9 += 3;
                        i10++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i8 = i7 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = f19799d[i13] - i12;
                System.arraycopy(bArr, i12, bArr, i11, i14);
                int i15 = i11 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i11 = i16 + 1;
                bArr[i16] = 0;
                i12 += i14 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i11, i8 - i11);
        }
        return i8;
    }
}
