package com.instagram.common.viewpoint.core;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0343Cj {
    public static String[] A07 = {"1TUPUvqjuckMieKxy618dXqeho2I2nXO", "1tw", "Rv8BHxt03y9lIrpcW4kHhbfWsqmFKBVK", "r8Px", "D2vXeeTjlCXB4Odv", "hN", "uuD40", "TpLNmCJV5wG1YwTXf3toM93vl9iWeWk7"};
    public long A00;
    public C1672mG A01;
    public C1672mG A02;
    public C1672mG A03;
    public final int A04;
    public final C4J A05 = new C4J(32);
    public final EO A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1672mG A04(C1672mG c1672mG, C1752nY c1752nY, C0345Cl c0345Cl, C4J c4j) {
        int i;
        long j = c0345Cl.A01;
        c4j.A0d(1);
        C1672mG A03 = A03(c1672mG, j, c4j.A0l(), 1);
        long j2 = j + 1;
        byte b = c4j.A0l()[0];
        boolean z = (b & 128) != 0;
        int i2 = b & Byte.MAX_VALUE;
        C5N c5n = c1752nY.A05;
        if (c5n.A04 == null) {
            c5n.A04 = new byte[16];
        } else {
            Arrays.fill(c5n.A04, (byte) 0);
        }
        C1672mG A032 = A03(A03, j2, c5n.A04, i2);
        long j3 = j2 + i2;
        if (z) {
            c4j.A0d(2);
            A032 = A03(A032, j3, c4j.A0l(), 2);
            j3 += 2;
            i = c4j.A0M();
        } else {
            i = 1;
            if (A07[7].charAt(5) == 'i') {
                throw new RuntimeException();
            }
            A07[7] = "Hpyz1f8ALnZx1iP9R6alck8MxH3P54oK";
        }
        int[] iArr = c5n.A06;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = c5n.A07;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
        }
        if (z) {
            int i3 = i * 6;
            c4j.A0d(i3);
            A032 = A03(A032, j3, c4j.A0l(), i3);
            j3 += i3;
            c4j.A0f(0);
            for (int i4 = 0; i4 < i; i4++) {
                iArr[i4] = c4j.A0M();
                iArr2[i4] = c4j.A0L();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = c0345Cl.A00 - ((int) (j3 - c0345Cl.A01));
        }
        C0463Gz c0463Gz = (C0463Gz) AbstractC01424a.A0f(c0345Cl.A02);
        c5n.A02(i, iArr, iArr2, c0463Gz.A03, c5n.A04, c0463Gz.A01, c0463Gz.A02, c0463Gz.A00);
        int i5 = (int) (j3 - c0345Cl.A01);
        c0345Cl.A01 += i5;
        if (A07[0].charAt(1) == 'T') {
            A07[0] = "nTpP9ibfF3cbwjVbkTA4UIhNPpZui5fl";
            c0345Cl.A00 -= i5;
            return A032;
        }
        String[] strArr = A07;
        strArr[3] = "b8i1";
        strArr[6] = "bRWrT";
        c0345Cl.A00 -= i5;
        return A032;
    }

    public C0343Cj(EO eo) {
        this.A06 = eo;
        this.A04 = eo.A8A();
        this.A01 = new C1672mG(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
    }

    private int A00(int i) {
        if (this.A03.A03 == null) {
            this.A03.A03(this.A06.A41(), new C1672mG(this.A03.A00, this.A04));
        }
        return Math.min(i, (int) (this.A03.A00 - this.A00));
    }

    public static C1672mG A01(C1672mG c1672mG, long j) {
        while (j >= c1672mG.A00) {
            c1672mG = c1672mG.A02;
        }
        return c1672mG;
    }

    public static C1672mG A02(C1672mG c1672mG, long j, ByteBuffer byteBuffer, int i) {
        C1672mG A01 = A01(c1672mG, j);
        while (i > 0) {
            int remaining = (int) (A01.A00 - j);
            int min = Math.min(i, remaining);
            byte[] bArr = A01.A03.A01;
            int remaining2 = A01.A00(j);
            byteBuffer.put(bArr, remaining2, min);
            i -= min;
            j += min;
            if (j == A01.A00) {
                A01 = A01.A02;
            }
        }
        return A01;
    }

    public static C1672mG A03(C1672mG c1672mG, long j, byte[] bArr, int i) {
        C1672mG A01 = A01(c1672mG, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (A01.A00 - j));
            byte[] bArr2 = A01.A03.A01;
            int toCopy = A01.A00(j);
            int remaining = i - i2;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i2 -= min;
            j += min;
            if (j == A01.A00) {
                A01 = A01.A02;
            }
        }
        return A01;
    }

    public static C1672mG A05(C1672mG c1672mG, C1752nY c1752nY, C0345Cl c0345Cl, C4J c4j) {
        if (c1752nY.A0E()) {
            c1672mG = A04(c1672mG, c1752nY, c0345Cl, c4j);
        }
        if (c1752nY.A03()) {
            c4j.A0d(4);
            C1672mG A03 = A03(c1672mG, c0345Cl.A01, c4j.A0l(), 4);
            int A0L = c4j.A0L();
            c0345Cl.A01 += 4;
            c0345Cl.A00 -= 4;
            c1752nY.A0C(A0L);
            C1672mG A02 = A02(A03, c0345Cl.A01, c1752nY.A02, A0L);
            c0345Cl.A01 += A0L;
            c0345Cl.A00 -= A0L;
            c1752nY.A0D(c0345Cl.A00);
            return A02(A02, c0345Cl.A01, c1752nY.A03, c0345Cl.A00);
        }
        c1752nY.A0C(c0345Cl.A00);
        return A02(c1672mG, c0345Cl.A01, c1752nY.A02, c0345Cl.A00);
    }

    private void A06(int i) {
        this.A00 += i;
        if (this.A00 == this.A03.A00) {
            this.A03 = this.A03.A02;
        }
    }

    private void A07(C1672mG c1672mG) {
        if (c1672mG.A03 == null) {
            return;
        }
        this.A06.AGu(c1672mG);
        c1672mG.A01();
    }

    public final int A08(AnonymousClass20 anonymousClass20, int i, boolean z) throws IOException {
        int read = anonymousClass20.read(this.A03.A03.A01, this.A03.A00(this.A00), A00(i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A06(read);
        return read;
    }

    public final long A09() {
        return this.A00;
    }

    public final void A0A() {
        A07(this.A01);
        this.A01.A02(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
        this.A00 = 0L;
        this.A06.AJi();
    }

    public final void A0B() {
        this.A02 = this.A01;
    }

    public final void A0C(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A01.A00) {
            this.A06.AGt(this.A01.A03);
            this.A01 = this.A01.A01();
        }
        long j2 = this.A02.A01;
        long j3 = this.A01.A01;
        String[] strArr = A07;
        if (strArr[3].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[3] = "kTcq";
        strArr2[6] = "Dj6YZ";
        if (j2 < j3) {
            this.A02 = this.A01;
        }
    }

    public final void A0D(C4J c4j, int i) {
        while (i > 0) {
            int A00 = A00(i);
            byte[] bArr = this.A03.A03.A01;
            int bytesAppended = this.A03.A00(this.A00);
            c4j.A0k(bArr, bytesAppended, A00);
            i -= A00;
            A06(A00);
        }
    }

    public final void A0E(C1752nY c1752nY, C0345Cl c0345Cl) {
        A05(this.A02, c1752nY, c0345Cl, this.A05);
    }

    public final void A0F(C1752nY c1752nY, C0345Cl c0345Cl) {
        this.A02 = A05(this.A02, c1752nY, c0345Cl, this.A05);
    }
}
