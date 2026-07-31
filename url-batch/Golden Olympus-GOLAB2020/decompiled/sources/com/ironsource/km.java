package com.ironsource;

import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public final class km {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f16943d = {Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    private b f16944a;

    /* renamed from: b, reason: collision with root package name */
    private b f16945b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f16946c = new int[16];

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f16947a;

        /* renamed from: b, reason: collision with root package name */
        private int[] f16948b;

        /* renamed from: c, reason: collision with root package name */
        private long f16949c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f16950d;

        private b() {
            this.f16947a = true;
            this.f16948b = new int[4];
            this.f16950d = new byte[64];
            a();
        }

        static /* synthetic */ long a(b bVar, long j4) {
            long j5 = bVar.f16949c + j4;
            bVar.f16949c = j5;
            return j5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(b bVar) {
            byte[] bArr = bVar.f16950d;
            byte[] bArr2 = this.f16950d;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int[] iArr = bVar.f16948b;
            int[] iArr2 = this.f16948b;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            this.f16947a = bVar.f16947a;
            this.f16949c = bVar.f16949c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            int[] iArr = this.f16948b;
            iArr[0] = 1732584193;
            iArr[1] = -271733879;
            iArr[2] = -1732584194;
            iArr[3] = 271733878;
            this.f16949c = 0L;
        }
    }

    km() {
        this.f16944a = new b();
        this.f16945b = new b();
        c();
    }

    private static int a(int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i4 + ((i6 & i5) | (i7 & (~i5))) + i8 + i10;
        return ((i11 >>> (32 - i9)) | (i11 << i9)) + i5;
    }

    private static int b(int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i4 + ((i6 & (~i7)) | (i5 & i7)) + i8 + i10;
        return ((i11 >>> (32 - i9)) | (i11 << i9)) + i5;
    }

    private static int c(int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i4 + ((i6 ^ i5) ^ i7) + i8 + i10;
        return ((i11 >>> (32 - i9)) | (i11 << i9)) + i5;
    }

    private static int d(int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i4 + (i6 ^ ((~i7) | i5)) + i8 + i10;
        return ((i11 >>> (32 - i9)) | (i11 << i9)) + i5;
    }

    public String toString() {
        return b();
    }

    public static String a(String str) {
        km kmVar = new km();
        kmVar.b(str);
        return kmVar.b();
    }

    public String b() {
        return a(a());
    }

    public void c() {
        this.f16944a.a();
        this.f16945b.f16947a = false;
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b4 : bArr) {
            int i4 = b4 & 255;
            if (i4 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i4));
        }
        return stringBuffer.toString();
    }

    public void b(String str) {
        b(str.getBytes());
    }

    public void a(byte b4) {
        a(new byte[]{b4}, 1);
    }

    public void b(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    private void a(b bVar, byte[] bArr, int i4, int i5) {
        int i6 = 0;
        this.f16945b.f16947a = false;
        if (i5 + i4 > bArr.length) {
            i5 = bArr.length - i4;
        }
        int i7 = ((int) (bVar.f16949c >>> 3)) & 63;
        b.a(bVar, i5 << 3);
        int i8 = 64 - i7;
        if (i5 >= i8) {
            System.arraycopy(bArr, i4, bVar.f16950d, i7, i8);
            a(bVar, a(bVar.f16950d, 64, 0));
            while (i8 + 63 < i5) {
                a(bVar, a(bArr, 64, i8));
                i8 += 64;
            }
            i7 = 0;
            i6 = i8;
        }
        if (i6 < i5) {
            for (int i9 = i6; i9 < i5; i9++) {
                bVar.f16950d[(i7 + i9) - i6] = bArr[i9 + i4];
            }
        }
    }

    public void b(byte[] bArr, int i4, int i5) {
        a(this.f16944a, bArr, i4, i5);
    }

    private static void a(b bVar, int[] iArr) {
        int i4 = bVar.f16948b[0];
        int i5 = bVar.f16948b[1];
        int i6 = bVar.f16948b[2];
        int i7 = bVar.f16948b[3];
        int a4 = a(i4, i5, i6, i7, iArr[0], 7, -680876936);
        int a5 = a(i7, a4, i5, i6, iArr[1], 12, -389564586);
        int a6 = a(i6, a5, a4, i5, iArr[2], 17, 606105819);
        int a7 = a(i5, a6, a5, a4, iArr[3], 22, -1044525330);
        int a8 = a(a4, a7, a6, a5, iArr[4], 7, -176418897);
        int a9 = a(a5, a8, a7, a6, iArr[5], 12, 1200080426);
        int a10 = a(a6, a9, a8, a7, iArr[6], 17, -1473231341);
        int a11 = a(a7, a10, a9, a8, iArr[7], 22, -45705983);
        int a12 = a(a8, a11, a10, a9, iArr[8], 7, 1770035416);
        int a13 = a(a9, a12, a11, a10, iArr[9], 12, -1958414417);
        int a14 = a(a10, a13, a12, a11, iArr[10], 17, -42063);
        int a15 = a(a11, a14, a13, a12, iArr[11], 22, -1990404162);
        int a16 = a(a12, a15, a14, a13, iArr[12], 7, 1804603682);
        int a17 = a(a13, a16, a15, a14, iArr[13], 12, -40341101);
        int a18 = a(a14, a17, a16, a15, iArr[14], 17, -1502002290);
        int a19 = a(a15, a18, a17, a16, iArr[15], 22, 1236535329);
        int b4 = b(a16, a19, a18, a17, iArr[1], 5, -165796510);
        int b5 = b(a17, b4, a19, a18, iArr[6], 9, -1069501632);
        int b6 = b(a18, b5, b4, a19, iArr[11], 14, 643717713);
        int b7 = b(a19, b6, b5, b4, iArr[0], 20, -373897302);
        int b8 = b(b4, b7, b6, b5, iArr[5], 5, -701558691);
        int b9 = b(b5, b8, b7, b6, iArr[10], 9, 38016083);
        int b10 = b(b6, b9, b8, b7, iArr[15], 14, -660478335);
        int b11 = b(b7, b10, b9, b8, iArr[4], 20, -405537848);
        int b12 = b(b8, b11, b10, b9, iArr[9], 5, 568446438);
        int b13 = b(b9, b12, b11, b10, iArr[14], 9, -1019803690);
        int b14 = b(b10, b13, b12, b11, iArr[3], 14, -187363961);
        int b15 = b(b11, b14, b13, b12, iArr[8], 20, 1163531501);
        int b16 = b(b12, b15, b14, b13, iArr[13], 5, -1444681467);
        int b17 = b(b13, b16, b15, b14, iArr[2], 9, -51403784);
        int b18 = b(b14, b17, b16, b15, iArr[7], 14, 1735328473);
        int b19 = b(b15, b18, b17, b16, iArr[12], 20, -1926607734);
        int c4 = c(b16, b19, b18, b17, iArr[5], 4, -378558);
        int c5 = c(b17, c4, b19, b18, iArr[8], 11, -2022574463);
        int c6 = c(b18, c5, c4, b19, iArr[11], 16, 1839030562);
        int c7 = c(b19, c6, c5, c4, iArr[14], 23, -35309556);
        int c8 = c(c4, c7, c6, c5, iArr[1], 4, -1530992060);
        int c9 = c(c5, c8, c7, c6, iArr[4], 11, 1272893353);
        int c10 = c(c6, c9, c8, c7, iArr[7], 16, -155497632);
        int c11 = c(c7, c10, c9, c8, iArr[10], 23, -1094730640);
        int c12 = c(c8, c11, c10, c9, iArr[13], 4, 681279174);
        int c13 = c(c9, c12, c11, c10, iArr[0], 11, -358537222);
        int c14 = c(c10, c13, c12, c11, iArr[3], 16, -722521979);
        int c15 = c(c11, c14, c13, c12, iArr[6], 23, 76029189);
        int c16 = c(c12, c15, c14, c13, iArr[9], 4, -640364487);
        int c17 = c(c13, c16, c15, c14, iArr[12], 11, -421815835);
        int c18 = c(c14, c17, c16, c15, iArr[15], 16, 530742520);
        int c19 = c(c15, c18, c17, c16, iArr[2], 23, -995338651);
        int d4 = d(c16, c19, c18, c17, iArr[0], 6, -198630844);
        int d5 = d(c17, d4, c19, c18, iArr[7], 10, 1126891415);
        int d6 = d(c18, d5, d4, c19, iArr[14], 15, -1416354905);
        int d7 = d(c19, d6, d5, d4, iArr[5], 21, -57434055);
        int d8 = d(d4, d7, d6, d5, iArr[12], 6, 1700485571);
        int d9 = d(d5, d8, d7, d6, iArr[3], 10, -1894986606);
        int d10 = d(d6, d9, d8, d7, iArr[10], 15, -1051523);
        int d11 = d(d7, d10, d9, d8, iArr[1], 21, -2054922799);
        int d12 = d(d8, d11, d10, d9, iArr[8], 6, 1873313359);
        int d13 = d(d9, d12, d11, d10, iArr[15], 10, -30611744);
        int d14 = d(d10, d13, d12, d11, iArr[6], 15, -1560198380);
        int d15 = d(d11, d14, d13, d12, iArr[13], 21, 1309151649);
        int d16 = d(d12, d15, d14, d13, iArr[4], 6, -145523070);
        int d17 = d(d13, d16, d15, d14, iArr[11], 10, -1120210379);
        int d18 = d(d14, d17, d16, d15, iArr[2], 15, 718787259);
        int d19 = d(d15, d18, d17, d16, iArr[9], 21, -343485551);
        int[] iArr2 = bVar.f16948b;
        iArr2[0] = iArr2[0] + d16;
        int[] iArr3 = bVar.f16948b;
        iArr3[1] = iArr3[1] + d19;
        int[] iArr4 = bVar.f16948b;
        iArr4[2] = iArr4[2] + d18;
        int[] iArr5 = bVar.f16948b;
        iArr5[3] = iArr5[3] + d17;
    }

    public void a(String str, String str2) {
        b(str.getBytes(str2));
    }

    public void a(byte[] bArr, int i4) {
        b(bArr, 0, i4);
    }

    public byte[] a() {
        if (!this.f16945b.f16947a) {
            this.f16945b.f(this.f16944a);
            long j4 = this.f16945b.f16949c;
            int i4 = (int) ((j4 >>> 3) & 63);
            a(this.f16945b, f16943d, 0, i4 < 56 ? 56 - i4 : 120 - i4);
            a(this.f16945b, a(j4), 0, 8);
            this.f16945b.f16947a = true;
        }
        return a(this.f16945b.f16948b, 16);
    }

    private static byte[] a(long j4) {
        return new byte[]{(byte) (j4 & 255), (byte) ((j4 >>> 8) & 255), (byte) ((j4 >>> 16) & 255), (byte) ((j4 >>> 24) & 255), (byte) ((j4 >>> 32) & 255), (byte) ((j4 >>> 40) & 255), (byte) ((j4 >>> 48) & 255), (byte) ((j4 >>> 56) & 255)};
    }

    private static byte[] a(int[] iArr, int i4) {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6 += 4) {
            int i7 = iArr[i5];
            bArr[i6] = (byte) (i7 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i6 + 1] = (byte) ((i7 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i6 + 2] = (byte) ((i7 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i6 + 3] = (byte) ((i7 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            i5++;
        }
        return bArr;
    }

    private int[] a(byte[] bArr, int i4, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7 += 4) {
            this.f16946c[i6] = (bArr[i7 + i5] & 255) | ((bArr[(i7 + 1) + i5] & 255) << 8) | ((bArr[(i7 + 2) + i5] & 255) << 16) | ((bArr[(i7 + 3) + i5] & 255) << 24);
            i6++;
        }
        return this.f16946c;
    }
}
