package com.instagram.common.viewpoint.core;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.kV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1577kV implements InterfaceC0511Iw {
    public static byte[] A0C;
    public static String[] A0D = {"jRj2ugi7SPR", "MNKsBNeD8MF1tCUmeU2P5Nj3hkdjoOc", "XMkmXaTlrOCX5lXmL6kh3TwHyWbdiNoj", "CqZnv6WT0ufq4g7hl2oSYE9w8", "bGEXSwT2dmCwLmvORXS7whQ8v", "55313totkqX4mBMXvHmYF6PzdsDv8MD", "C0ywJUyDCeWGQi9DxnjwsD3coqyGffR", "BhHq3twmKlbS1H4hpApJBSGHB"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C0510Iv A0A;
    public final AbstractC0514Iz A0B;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0C = new byte[]{-68, -35, -114, -35, -43, -43, -114, -34, -49, -43, -45, -114, -47, -49, -36, -114, -48, -45, -114, -44, -35, -29, -36, -46, -100};
    }

    static {
        A08();
    }

    public C1577kV(AbstractC0514Iz abstractC0514Iz, long j, long j2, long j3, long j4, boolean z) {
        C3M.A07(j >= 0 && j2 > j);
        this.A0B = abstractC0514Iz;
        this.A09 = j;
        this.A08 = j2;
        if (j3 == j2 - j || z) {
            this.A07 = j4;
            this.A00 = 4;
        } else {
            this.A00 = 0;
        }
        this.A0A = new C0510Iv();
    }

    private long A00(InterfaceC1619lN interfaceC1619lN) throws IOException {
        if (this.A04 == this.A01) {
            return -1L;
        }
        long A8f = interfaceC1619lN.A8f();
        if (!this.A0A.A04(interfaceC1619lN, this.A01)) {
            if (this.A04 != A8f) {
                return this.A04;
            }
            throw new IOException(A07(0, 25, 27));
        }
        this.A0A.A05(interfaceC1619lN, false);
        interfaceC1619lN.AI1();
        long currentPosition = this.A06 - this.A0A.A05;
        int i = this.A0A.A01 + this.A0A.A00;
        if (0 <= currentPosition && currentPosition < 72000) {
            return -1L;
        }
        if (currentPosition >= 0) {
            this.A04 = interfaceC1619lN.A8f() + i;
            this.A05 = this.A0A.A05;
        } else {
            this.A01 = A8f;
            C0510Iv c0510Iv = this.A0A;
            String[] strArr = A0D;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[3] = "rTnMeKP9Ntef56gYj2I82A9Og";
            strArr2[7] = "Ns8cmH2a0bzEbJPPC1zDKlbsv";
            this.A02 = c0510Iv.A05;
        }
        if (this.A01 - this.A04 < 100000) {
            this.A01 = this.A04;
            return this.A04;
        }
        long offset = i * (currentPosition <= 0 ? 2L : 1L);
        long A8f2 = interfaceC1619lN.A8f() - offset;
        long offset2 = this.A01;
        return AbstractC01424a.A0T(A8f2 + (((offset2 - this.A04) * currentPosition) / (this.A02 - this.A05)), this.A04, this.A01 - 1);
    }

    private final long A01(InterfaceC1619lN interfaceC1619lN) throws IOException {
        this.A0A.A02();
        if (this.A0A.A03(interfaceC1619lN)) {
            this.A0A.A05(interfaceC1619lN, false);
            interfaceC1619lN.AJJ(this.A0A.A01 + this.A0A.A00);
            C0510Iv c0510Iv = this.A0A;
            String[] strArr = A0D;
            if (strArr[0].length() != strArr[1].length()) {
                String[] strArr2 = A0D;
                strArr2[3] = "I2mhjjmoE8ZJ2Dg0LzbNmT9WC";
                strArr2[7] = "IEpLWq2gVTEx0SVSUh2piystZ";
                long j = c0510Iv.A05;
                while ((this.A0A.A04 & 4) != 4 && this.A0A.A03(interfaceC1619lN) && interfaceC1619lN.A8f() < this.A08) {
                    if (this.A0A.A05(interfaceC1619lN, true)) {
                        C0510Iv c0510Iv2 = this.A0A;
                        String[] strArr3 = A0D;
                        if (strArr3[6].length() == strArr3[5].length()) {
                            A0D[2] = "1J9QEDZvjIULKx6bD2w0xEMzJBfvilpU";
                            if (GZ.A02(interfaceC1619lN, c0510Iv2.A01 + this.A0A.A00)) {
                                j = this.A0A.A05;
                            }
                        }
                    }
                    return j;
                }
                return j;
            }
            throw new RuntimeException();
        }
        throw new EOFException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0511Iw
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C1578kW A5R() {
        C0508It c0508It = null;
        if (this.A07 != 0) {
            return new C1578kW(this);
        }
        return null;
    }

    private void A09(InterfaceC1619lN interfaceC1619lN) throws IOException {
        while (true) {
            this.A0A.A03(interfaceC1619lN);
            this.A0A.A05(interfaceC1619lN, false);
            if (this.A0A.A05 > this.A06) {
                interfaceC1619lN.AI1();
                return;
            } else {
                interfaceC1619lN.AJJ(this.A0A.A01 + this.A0A.A00);
                this.A04 = interfaceC1619lN.A8f();
                this.A05 = this.A0A.A05;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0511Iw
    public final long AGd(InterfaceC1619lN interfaceC1619lN) throws IOException {
        switch (this.A00) {
            case 0:
                this.A03 = interfaceC1619lN.A8f();
                this.A00 = 1;
                long j = this.A08 - 65307;
                if (j > this.A03) {
                    return j;
                }
            case 1:
                long lastPageSearchPosition = A01(interfaceC1619lN);
                this.A07 = lastPageSearchPosition;
                String[] strArr = A0D;
                if (strArr[6].length() != strArr[5].length()) {
                    A0D[4] = "Q";
                    this.A00 = 4;
                    return this.A03;
                }
                A0D[2] = "zPL0M1I0YHefEI7ePcrxVR039vnXiGQX";
                this.A00 = 4;
                return this.A03;
            case 2:
                long position = A00(interfaceC1619lN);
                if (A0D[2].charAt(28) != 'i') {
                    throw new RuntimeException();
                }
                A0D[4] = "EIP7mTXqLgr9aPVawFNgKKAemnhenv";
                if (position != -1) {
                    return position;
                }
                this.A00 = 3;
            case 3:
                A09(interfaceC1619lN);
                this.A00 = 4;
                return -(this.A05 + 2);
            case 4:
                return -1L;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0511Iw
    public final void AJR(long j) {
        this.A06 = AbstractC01424a.A0T(j, 0L, this.A07 - 1);
        this.A00 = 2;
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }
}
