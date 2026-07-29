package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʻʼʾʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0043 implements InterfaceC0101 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f70 = 0;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static char[] f71 = {16, ':', 'S', 'O', 'C', '@', ']', 'd', 'Z', 'j', 'o', '_', 'd', 'l', 'd', 'l', 's', 151, 279, 250, 253, 265, 269, 244, 259, 298, 298, 300, 277, 274, 297, 292, 276, 5, '\'', '[', 'r', 'p', 'p', ']', '[', 'j', 'j', 'T'};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f72 = 1;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ EnumC0150 f73;

    C0043(EnumC0150 enumC0150) {
        this.f73 = enumC0150;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m101(boolean z, String str, int[] iArr) {
        byte[] bytes;
        char[] cArr;
        char[] cArr2;
        int i = f72 + 119;
        f70 = i % 128;
        if (i % 2 != 0) {
            bytes = str.getBytes("ISO-8859-1");
            Object obj = null;
            super.hashCode();
        } else {
            bytes = str.getBytes("ISO-8859-1");
        }
        int i2 = f70 + 121;
        f72 = i2 % 128;
        if (i2 % 2 == 0) {
        }
        byte[] bArr = bytes;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr3 = new char[i4];
        System.arraycopy(f71, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i7 = f70 + 117;
            f72 = i7 % 128;
            if (i7 % 2 == 0) {
            }
            cArr = new char[i4];
            int i8 = 0;
            char c2 = 0;
            while (true) {
                if (i8 >= i4) {
                    break;
                }
                int i9 = f72 + 47;
                f70 = i9 % 128;
                if ((i9 % 2 == 0) ? bArr[i8] != 1 : bArr[i8] != 1) {
                    cArr[i8] = (char) ((cArr3[i8] << 1) - c2);
                } else {
                    cArr[i8] = (char) (((cArr3[i8] << 1) + 1) - c2);
                }
                c2 = cArr[i8];
                i8++;
            }
        } else {
            cArr = cArr3;
        }
        if (i6 > 0) {
            int i10 = f72 + 73;
            f70 = i10 % 128;
            if (i10 % 2 != 0) {
                char[] cArr4 = new char[i4];
                System.arraycopy(cArr, 1, cArr4, 0, i4);
                int i11 = i4 >>> i6;
                System.arraycopy(cArr4, 1, cArr, i11, i6);
                System.arraycopy(cArr4, i6, cArr, 1, i11);
            } else {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr, 0, cArr5, 0, i4);
                int i12 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr, i12, i6);
                System.arraycopy(cArr5, i6, cArr, 0, i12);
            }
        }
        if (z) {
            cArr2 = new char[i4];
            for (int i13 = 0; i13 < i4; i13++) {
                cArr2[i13] = cArr[(i4 - i13) - 1];
            }
        } else {
            cArr2 = cArr;
        }
        if (i5 > 0) {
            int i14 = f72 + 53;
            f70 = i14 % 128;
            int i15 = i14 % 2;
            for (int i16 = 0; i16 < i4; i16++) {
                cArr2[i16] = (char) (cArr2[i16] - iArr[2]);
            }
        }
        return new String(cArr2);
    }

    @Override // com.aiming.mdt.a.InterfaceC0101
    /* renamed from: ʼ, reason: contains not printable characters */
    public final void mo102(C0184 c0184, C0157 c0157) {
        int i = f70 + 111;
        f72 = i % 128;
        int i2 = i % 2;
        m101(false, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", new int[]{0, 17, 0, 5}).intern();
        C0044.m104();
        C0031.m44(EnumC0150.m588(this.f73), c0157);
        EnumC0150.m583(this.f73);
        int i3 = f72 + 71;
        f70 = i3 % 128;
        if (!(i3 % 2 != 0)) {
        }
    }

    @Override // com.aiming.mdt.a.InterfaceC0101
    /* renamed from: ʽ, reason: contains not printable characters */
    public final void mo103(C0184 c0184, C0157 c0157) {
        int i = f70 + 95;
        f72 = i % 128;
        int i2 = i % 2;
        m101(true, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{17, 16, 186, 2}).intern();
        m101(false, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{33, 11, 0, 11}).intern();
        C0044.m104();
        C0031.m44(EnumC0150.m588(this.f73), c0157);
        EnumC0150.m583(this.f73);
        int i3 = f70 + 39;
        f72 = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }
}
