package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class QJ implements InterfaceC4108wE {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27137a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f27138b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f27139c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27140d;

    public QJ(InterfaceC4108wE interfaceC4108wE, byte[] bArr, byte[] bArr2) {
        this.f27140d = interfaceC4108wE;
        this.f27138b = bArr;
        this.f27139c = bArr2;
    }

    public static byte[] c(BG bg) {
        int ordinal = bg.f24016e.ordinal();
        Integer num = bg.f24017f;
        if (ordinal == 1) {
            return AbstractC3571mG.b(num.intValue()).b();
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return AbstractC3571mG.f32676a.b();
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return AbstractC3571mG.a(num.intValue()).b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4108wE
    public final void a(byte[] bArr, byte[] bArr2) {
        switch (this.f27137a) {
            case 0:
                byte[] bArr3 = this.f27138b;
                int length = bArr3.length;
                byte[] bArr4 = this.f27139c;
                InterfaceC4108wE interfaceC4108wE = (InterfaceC4108wE) this.f27140d;
                if (length == 0 && bArr4.length == 0) {
                    interfaceC4108wE.a(bArr, bArr2);
                    return;
                } else {
                    if (!IG.c(bArr3, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr4.length != 0) {
                        bArr2 = XC.f(bArr2, bArr4);
                    }
                    interfaceC4108wE.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
                    return;
                }
            default:
                byte[] bArr5 = this.f27139c;
                int length2 = bArr5.length;
                byte[] bArr6 = (byte[]) this.f27140d;
                if (length2 == 0 && bArr6.length == 0) {
                    b(bArr, bArr2);
                    return;
                } else {
                    if (!IG.c(bArr5, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr6.length != 0) {
                        bArr2 = XC.f(bArr2, bArr6);
                    }
                    b(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    public void b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        if (bArr3.length == 64) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i = 31;
            while (true) {
                if (i < 0) {
                    break;
                }
                int i4 = copyOfRange[i] & 255;
                int i9 = AbstractC2655Lg.f26179O[i] & 255;
                if (i4 == i9) {
                    i--;
                    bArr3 = bArr;
                } else if (i4 < i9) {
                    MessageDigest messageDigest = (MessageDigest) C3253gK.f30984e.f30987a.d("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    byte[] bArr4 = this.f27138b;
                    messageDigest.update(bArr4);
                    messageDigest.update(bArr2);
                    byte[] digest = messageDigest.digest();
                    long J = AbstractC2655Lg.J(0, digest) & 2097151;
                    long K8 = AbstractC2655Lg.K(2, digest) >> 5;
                    long J8 = AbstractC2655Lg.J(5, digest) >> 2;
                    long K9 = AbstractC2655Lg.K(7, digest) >> 7;
                    long K10 = AbstractC2655Lg.K(10, digest) >> 4;
                    long J9 = AbstractC2655Lg.J(13, digest) >> 1;
                    long K11 = AbstractC2655Lg.K(15, digest) >> 6;
                    long J10 = AbstractC2655Lg.J(18, digest) >> 3;
                    long J11 = AbstractC2655Lg.J(21, digest) & 2097151;
                    long K12 = AbstractC2655Lg.K(23, digest) >> 5;
                    long J12 = AbstractC2655Lg.J(26, digest) >> 2;
                    long K13 = AbstractC2655Lg.K(28, digest) >> 7;
                    long K14 = AbstractC2655Lg.K(31, digest) >> 4;
                    long J13 = AbstractC2655Lg.J(34, digest) >> 1;
                    long K15 = AbstractC2655Lg.K(36, digest) >> 6;
                    long J14 = AbstractC2655Lg.J(39, digest) >> 3;
                    long J15 = AbstractC2655Lg.J(42, digest) & 2097151;
                    long K16 = AbstractC2655Lg.K(44, digest) >> 5;
                    long J16 = (AbstractC2655Lg.J(47, digest) >> 2) & 2097151;
                    long K17 = (AbstractC2655Lg.K(49, digest) >> 7) & 2097151;
                    long K18 = (AbstractC2655Lg.K(52, digest) >> 4) & 2097151;
                    long J17 = (AbstractC2655Lg.J(55, digest) >> 1) & 2097151;
                    long K19 = (AbstractC2655Lg.K(57, digest) >> 6) & 2097151;
                    long K20 = AbstractC2655Lg.K(60, digest) >> 3;
                    long j9 = (K18 * 666643) + J11;
                    long j10 = (K17 * 666643) + J10;
                    long j11 = (J16 * 666643) + (K11 & 2097151);
                    long j12 = (j11 + 1048576) >> 21;
                    long j13 = j12 << 21;
                    long j14 = (J16 * 654183) + (K17 * 470296) + j9;
                    long j15 = (j14 + 1048576) >> 21;
                    long j16 = j15 << 21;
                    long j17 = (J16 * 136657) + (((K18 * 654183) + ((J17 * 470296) + ((K19 * 666643) + (J12 & 2097151)))) - (K17 * 997805));
                    long j18 = (j17 + 1048576) >> 21;
                    long j19 = j18 << 21;
                    long j20 = ((K18 * 136657) + (((K19 * 654183) + ((K20 * 470296) + (K14 & 2097151))) - (J17 * 997805))) - (K17 * 683901);
                    long j21 = (j20 + 1048576) >> 21;
                    long j22 = ((K19 * 136657) + ((K15 & 2097151) - (K20 * 997805))) - (J17 * 683901);
                    long j23 = (j22 + 1048576) >> 21;
                    long j24 = j23 << 21;
                    long j25 = J15 - (K20 * 683901);
                    long j26 = (j25 + 1048576) >> 21;
                    long j27 = (J16 * 470296) + j10 + j12;
                    long j28 = (j27 + 1048576) >> 21;
                    long j29 = j28 << 21;
                    long j30 = (((K17 * 654183) + ((K18 * 470296) + ((J17 * 666643) + (K12 & 2097151)))) - (J16 * 997805)) + j15;
                    long j31 = (j30 + 1048576) >> 21;
                    long j32 = j31 << 21;
                    long j33 = (((K17 * 136657) + (((J17 * 654183) + ((K19 * 470296) + ((K20 * 666643) + (K13 & 2097151)))) - (K18 * 997805))) - (J16 * 683901)) + j18;
                    long j34 = (j33 + 1048576) >> 21;
                    long j35 = j34 << 21;
                    long j36 = (((J17 * 136657) + (((K20 * 654183) + (J13 & 2097151)) - (K19 * 997805))) - (K18 * 683901)) + j21;
                    long j37 = (j36 + 1048576) >> 21;
                    long j38 = (((K20 * 136657) + J14) - (K19 * 683901)) + j23;
                    long j39 = (j38 + 1048576) >> 21;
                    long j40 = (j20 - (j21 << 21)) + j34;
                    long j41 = (j40 * 666643) + J;
                    long j42 = (j41 + 1048576) >> 21;
                    long j43 = j42 << 21;
                    long j44 = (j22 - j24) + j37;
                    long j45 = j36 - (j37 << 21);
                    long j46 = (j40 * 654183) + (j45 * 470296) + (j44 * 666643) + (J8 & 2097151);
                    long j47 = (j46 + 1048576) >> 21;
                    long j48 = j47 << 21;
                    long j49 = (j25 - (j26 << 21)) + j39;
                    long j50 = j38 - (j39 << 21);
                    long j51 = (j40 * 136657) + (((j44 * 654183) + ((j50 * 470296) + ((j49 * 666643) + (K10 & 2097151)))) - (j45 * 997805));
                    long j52 = (j51 + 1048576) >> 21;
                    long j53 = j52 << 21;
                    long j54 = (K16 & 2097151) + j26;
                    long j55 = ((j44 * 136657) + (((j49 * 654183) + ((j54 * 470296) + (j11 - j13))) - (j50 * 997805))) - (j45 * 683901);
                    long j56 = (j55 + 1048576) >> 21;
                    long j57 = j56 << 21;
                    long j58 = ((j49 * 136657) + (((j14 - j16) + j28) - (j54 * 997805))) - (j50 * 683901);
                    long j59 = (j58 + 1048576) >> 21;
                    long j60 = j59 << 21;
                    long j61 = ((j17 - j19) + j31) - (j54 * 683901);
                    long j62 = (j61 + 1048576) >> 21;
                    long j63 = j62 << 21;
                    long j64 = (j40 * 470296) + (j45 * 666643) + (K8 & 2097151) + j42;
                    long j65 = (j64 + 1048576) >> 21;
                    long j66 = (((j45 * 654183) + ((j44 * 470296) + ((j50 * 666643) + (K9 & 2097151)))) - (j40 * 997805)) + j47;
                    long j67 = (j66 + 1048576) >> 21;
                    long j68 = (((j45 * 136657) + (((j50 * 654183) + ((j49 * 470296) + ((j54 * 666643) + (J9 & 2097151)))) - (j44 * 997805))) - (j40 * 683901)) + j52;
                    long j69 = (j68 + 1048576) >> 21;
                    long j70 = (((j50 * 136657) + (((j54 * 654183) + (j27 - j29)) - (j49 * 997805))) - (j44 * 683901)) + j56;
                    long j71 = (j70 + 1048576) >> 21;
                    long j72 = (((j54 * 136657) + (j30 - j32)) - (j49 * 683901)) + j59;
                    long j73 = (j72 + 1048576) >> 21;
                    long j74 = (j33 - j35) + j62;
                    long j75 = (j74 + 1048576) >> 21;
                    long j76 = j75 << 21;
                    long j77 = (j75 * 666643) + (j41 - j43);
                    long j78 = j77 >> 21;
                    long j79 = j78 << 21;
                    long j80 = (j75 * 470296) + (j64 - (j65 << 21)) + j78;
                    long j81 = j80 >> 21;
                    long j82 = j81 << 21;
                    long j83 = (j75 * 654183) + (j46 - j48) + j65 + j81;
                    long j84 = j83 >> 21;
                    long j85 = j84 << 21;
                    long j86 = ((j66 - (j67 << 21)) - (j75 * 997805)) + j84;
                    long j87 = j86 >> 21;
                    long j88 = j87 << 21;
                    long j89 = (j75 * 136657) + (j51 - j53) + j67 + j87;
                    long j90 = j89 >> 21;
                    long j91 = j90 << 21;
                    long j92 = ((j68 - (j69 << 21)) - (j75 * 683901)) + j90;
                    long j93 = j92 >> 21;
                    long j94 = j93 << 21;
                    long j95 = (j55 - j57) + j69 + j93;
                    long j96 = j95 >> 21;
                    long j97 = j96 << 21;
                    long j98 = (j70 - (j71 << 21)) + j96;
                    long j99 = j98 >> 21;
                    long j100 = j99 << 21;
                    long j101 = (j58 - j60) + j71 + j99;
                    long j102 = j101 >> 21;
                    long j103 = j102 << 21;
                    long j104 = (j72 - (j73 << 21)) + j102;
                    long j105 = j104 >> 21;
                    long j106 = j105 << 21;
                    long j107 = (j61 - j63) + j73 + j105;
                    long j108 = j107 >> 21;
                    long j109 = j108 << 21;
                    long j110 = (j74 - j76) + j108;
                    long j111 = j110 >> 21;
                    long j112 = j111 << 21;
                    long j113 = (666643 * j111) + (j77 - j79);
                    long j114 = j113 >> 21;
                    long j115 = j114 << 21;
                    long j116 = (470296 * j111) + (j80 - j82) + j114;
                    long j117 = j116 >> 21;
                    long j118 = j117 << 21;
                    long j119 = (654183 * j111) + (j83 - j85) + j117;
                    long j120 = j119 >> 21;
                    long j121 = j120 << 21;
                    long j122 = ((j86 - j88) - (997805 * j111)) + j120;
                    long j123 = j122 >> 21;
                    long j124 = j123 << 21;
                    long j125 = (136657 * j111) + (j89 - j91) + j123;
                    long j126 = j125 >> 21;
                    long j127 = j126 << 21;
                    long j128 = ((j92 - j94) - (j111 * 683901)) + j126;
                    long j129 = j128 >> 21;
                    long j130 = j129 << 21;
                    long j131 = (j95 - j97) + j129;
                    long j132 = j131 >> 21;
                    long j133 = j132 << 21;
                    long j134 = (j98 - j100) + j132;
                    long j135 = j134 >> 21;
                    long j136 = j135 << 21;
                    long j137 = (j101 - j103) + j135;
                    long j138 = j137 >> 21;
                    long j139 = j138 << 21;
                    long j140 = (j104 - j106) + j138;
                    long j141 = j140 >> 21;
                    long j142 = j141 << 21;
                    long j143 = (j107 - j109) + j141;
                    long j144 = j143 >> 21;
                    digest[0] = (byte) (j113 - j115);
                    long j145 = j134 - j136;
                    long j146 = j131 - j133;
                    long j147 = j128 - j130;
                    long j148 = j125 - j127;
                    long j149 = j122 - j124;
                    long j150 = j119 - j121;
                    long j151 = j116 - j118;
                    digest[1] = (byte) (r13 >> 8);
                    digest[2] = (byte) ((r13 >> 16) | (j151 << 5));
                    digest[3] = (byte) (j151 >> 3);
                    digest[4] = (byte) (j151 >> 11);
                    digest[5] = (byte) ((j151 >> 19) | (j150 << 2));
                    digest[6] = (byte) (j150 >> 6);
                    digest[7] = (byte) ((j150 >> 14) | (j149 << 7));
                    digest[8] = (byte) (j149 >> 1);
                    digest[9] = (byte) (j149 >> 9);
                    digest[10] = (byte) ((j149 >> 17) | (j148 << 4));
                    digest[11] = (byte) (j148 >> 4);
                    digest[12] = (byte) (j148 >> 12);
                    digest[13] = (byte) ((j148 >> 20) | (j147 + j147));
                    digest[14] = (byte) (j147 >> 7);
                    digest[15] = (byte) ((j147 >> 15) | (j146 << 6));
                    digest[16] = (byte) (j146 >> 2);
                    digest[17] = (byte) (j146 >> 10);
                    digest[18] = (byte) ((j146 >> 18) | (j145 << 3));
                    long j152 = j143 - (j144 << 21);
                    long j153 = (j110 - j112) + j144;
                    long j154 = j140 - j142;
                    digest[19] = (byte) (j145 >> 5);
                    digest[20] = (byte) (j145 >> 13);
                    digest[21] = (byte) (j137 - j139);
                    digest[22] = (byte) (r9 >> 8);
                    digest[23] = (byte) ((r9 >> 16) | (j154 << 5));
                    digest[24] = (byte) (j154 >> 3);
                    digest[25] = (byte) (j154 >> 11);
                    digest[26] = (byte) ((j154 >> 19) | (j152 << 2));
                    digest[27] = (byte) (j152 >> 6);
                    digest[28] = (byte) ((j152 >> 14) | (j153 << 7));
                    digest[29] = (byte) (j153 >> 1);
                    digest[30] = (byte) (j153 >> 9);
                    digest[31] = (byte) (j153 >> 17);
                    long[] jArr = new long[10];
                    long[] b02 = AbstractC3217fl.b0(bArr4);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    AbstractC3217fl.Y(jArr4, b02);
                    AbstractC3217fl.U(jArr5, jArr4, NF.f26498a);
                    AbstractC3217fl.z(jArr4, jArr4, jArr2);
                    AbstractC3217fl.p(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    AbstractC3217fl.Y(jArr8, jArr5);
                    AbstractC3217fl.U(jArr8, jArr8, jArr5);
                    AbstractC3217fl.Y(jArr, jArr8);
                    AbstractC3217fl.U(jArr, jArr, jArr5);
                    AbstractC3217fl.U(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    AbstractC3217fl.Y(jArr9, jArr);
                    AbstractC3217fl.Y(jArr10, jArr9);
                    AbstractC3217fl.Y(jArr10, jArr10);
                    AbstractC3217fl.U(jArr10, jArr, jArr10);
                    AbstractC3217fl.U(jArr9, jArr9, jArr10);
                    AbstractC3217fl.Y(jArr9, jArr9);
                    AbstractC3217fl.U(jArr9, jArr10, jArr9);
                    AbstractC3217fl.Y(jArr10, jArr9);
                    for (int i10 = 1; i10 < 5; i10++) {
                        AbstractC3217fl.Y(jArr10, jArr10);
                    }
                    AbstractC3217fl.U(jArr9, jArr10, jArr9);
                    AbstractC3217fl.Y(jArr10, jArr9);
                    for (int i11 = 1; i11 < 10; i11++) {
                        AbstractC3217fl.Y(jArr10, jArr10);
                    }
                    AbstractC3217fl.U(jArr10, jArr10, jArr9);
                    AbstractC3217fl.Y(jArr11, jArr10);
                    for (int i12 = 1; i12 < 20; i12++) {
                        AbstractC3217fl.Y(jArr11, jArr11);
                    }
                    AbstractC3217fl.U(jArr10, jArr11, jArr10);
                    AbstractC3217fl.Y(jArr10, jArr10);
                    for (int i13 = 1; i13 < 10; i13++) {
                        AbstractC3217fl.Y(jArr10, jArr10);
                    }
                    AbstractC3217fl.U(jArr9, jArr10, jArr9);
                    AbstractC3217fl.Y(jArr10, jArr9);
                    for (int i14 = 1; i14 < 50; i14++) {
                        AbstractC3217fl.Y(jArr10, jArr10);
                    }
                    AbstractC3217fl.U(jArr10, jArr10, jArr9);
                    AbstractC3217fl.Y(jArr11, jArr10);
                    for (int i15 = 1; i15 < 100; i15++) {
                        AbstractC3217fl.Y(jArr11, jArr11);
                    }
                    AbstractC3217fl.U(jArr10, jArr11, jArr10);
                    AbstractC3217fl.Y(jArr10, jArr10);
                    for (int i16 = 1; i16 < 50; i16++) {
                        AbstractC3217fl.Y(jArr10, jArr10);
                    }
                    AbstractC3217fl.U(jArr9, jArr10, jArr9);
                    AbstractC3217fl.Y(jArr9, jArr9);
                    AbstractC3217fl.Y(jArr9, jArr9);
                    AbstractC3217fl.U(jArr, jArr9, jArr);
                    AbstractC3217fl.U(jArr, jArr, jArr8);
                    AbstractC3217fl.U(jArr, jArr, jArr4);
                    AbstractC3217fl.Y(jArr6, jArr);
                    AbstractC3217fl.U(jArr6, jArr6, jArr5);
                    AbstractC3217fl.z(jArr7, jArr6, jArr4);
                    if (AbstractC2655Lg.x(jArr7)) {
                        AbstractC3217fl.p(jArr7, jArr6, jArr4);
                        if (AbstractC2655Lg.x(jArr7)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        AbstractC3217fl.U(jArr, jArr, NF.f26500c);
                    }
                    if (!AbstractC2655Lg.x(jArr) && ((bArr4[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    if ((AbstractC3217fl.c0(jArr)[0] & 1) == ((bArr4[31] & 255) >> 7)) {
                        for (int i17 = 0; i17 < 10; i17++) {
                            jArr[i17] = -jArr[i17];
                        }
                    }
                    AbstractC3217fl.U(jArr3, jArr, b02);
                    C3602mu c3602mu = new C3602mu(jArr, b02, jArr2, 20);
                    LF[] lfArr = new LF[8];
                    lfArr[0] = new LF(new MF(c3602mu, jArr3));
                    MF mf = new MF(new C3602mu(20), new long[10]);
                    AbstractC2655Lg.F(c3602mu, mf);
                    MF mf2 = new MF(mf);
                    for (int i18 = 1; i18 < 8; i18++) {
                        AbstractC2655Lg.B(mf, mf2, lfArr[i18 - 1]);
                        lfArr[i18] = new LF(new MF(mf));
                    }
                    byte[] I2 = AbstractC2655Lg.I(digest);
                    byte[] I8 = AbstractC2655Lg.I(copyOfRange);
                    MF mf3 = new MF(0);
                    MF mf4 = new MF(1);
                    int i19 = 255;
                    while (i19 >= 0 && I2[i19] == 0 && I8[i19] == 0) {
                        i19--;
                    }
                    while (i19 >= 0) {
                        AbstractC2655Lg.F(new C3602mu(mf3), mf3);
                        byte b9 = I2[i19];
                        if (b9 > 0) {
                            MF.a(mf4, mf3);
                            AbstractC2655Lg.B(mf3, mf4, lfArr[I2[i19] / 2]);
                        } else if (b9 < 0) {
                            MF.a(mf4, mf3);
                            AbstractC2655Lg.D(mf3, mf4, lfArr[(-I2[i19]) / 2]);
                        }
                        byte b10 = I8[i19];
                        if (b10 > 0) {
                            MF.a(mf4, mf3);
                            AbstractC2655Lg.B(mf3, mf4, NF.f26502e[I8[i19] / 2]);
                        } else if (b10 < 0) {
                            MF.a(mf4, mf3);
                            AbstractC2655Lg.D(mf3, mf4, NF.f26502e[(-I8[i19]) / 2]);
                        }
                        i19--;
                    }
                    byte[] t9 = new C3602mu(mf3).t();
                    for (int i20 = 0; i20 < 32; i20++) {
                        if (t9[i20] == bArr[i20]) {
                        }
                    }
                    return;
                }
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }

    public QJ(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!XC.e(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f27138b = (byte[]) bArr.clone();
        this.f27139c = bArr2;
        this.f27140d = bArr3;
        if (NF.f26498a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }
}
