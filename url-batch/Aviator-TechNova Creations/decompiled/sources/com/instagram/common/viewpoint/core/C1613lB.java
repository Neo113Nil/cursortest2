package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Metadata;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.lB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1613lB implements GX {
    public static String[] A0E = {"CA5tgyD1ft6jPQScHcEKxijdDn8CpaAj", "rrvFpoycxrr9C", "qEVAWkTuIpwlYdd7u09", "zGu", "r98", "bvJEUCblPMa4rVVBIUxYNVrIzXUNKtA9", "0YPJWJVAuNzanCV2KA", "Ww61LKXhC9Y0aL9N3LYwjUph3RiaOuui"};
    public static final InterfaceC0445Gb A0F = new InterfaceC0445Gb() { // from class: com.facebook.ads.redexgen.X.lC
        @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
        public final GX[] A5F() {
            return C1613lB.A09();
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC0444Ga.A01(this, uri, map);
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Metadata A05;
    public GY A06;
    public C0451Gh A07;
    public H1 A08;
    public C1615lD A09;
    public final C4J A0A;
    public final C0446Gc A0B;
    public final boolean A0C;
    public final byte[] A0D;

    public C1613lB() {
        this(0);
    }

    public C1613lB(int i) {
        this.A0D = new byte[42];
        this.A0A = new C4J(new byte[32768], 0);
        this.A0C = (i & 1) != 0;
        this.A0B = new C0446Gc();
        this.A03 = 0;
    }

    private int A00(InterfaceC1625lN interfaceC1625lN, C0463Gt c0463Gt) throws IOException {
        C3M.A01(this.A08);
        C3M.A01(this.A07);
        if (this.A09 != null && this.A09.A09()) {
            return this.A09.A06(interfaceC1625lN, c0463Gt);
        }
        long j = this.A04;
        if (A0E[2].length() == 19) {
            A0E[2] = "5vsaEOzV8f26KwvJg69";
            if (j == -1) {
                this.A04 = AbstractC0447Gd.A01(interfaceC1625lN, this.A07);
                return 0;
            }
            int A0A = this.A0A.A0A();
            String[] strArr = A0E;
            if (strArr[6].length() != strArr[1].length()) {
                String[] strArr2 = A0E;
                strArr2[6] = "dF6ALNUNBXQAeyaZgj";
                strArr2[1] = "WrJkmBjBZcK3S";
                boolean z = false;
                if (A0A < 32768) {
                    int currentLimit = 32768 - A0A;
                    int read = interfaceC1625lN.read(this.A0A.A0l(), A0A, currentLimit);
                    z = read == -1;
                    if (!z) {
                        this.A0A.A0e(A0A + read);
                    } else {
                        int currentLimit2 = this.A0A.A07();
                        if (currentLimit2 == 0) {
                            A03();
                            return -1;
                        }
                    }
                }
                int A09 = this.A0A.A09();
                int i = this.A00;
                int currentLimit3 = this.A02;
                if (i < currentLimit3) {
                    C4J c4j = this.A0A;
                    int i2 = this.A02;
                    int currentLimit4 = this.A00;
                    int i3 = i2 - currentLimit4;
                    int currentLimit5 = this.A0A.A07();
                    c4j.A0g(Math.min(i3, currentLimit5));
                }
                long A01 = A01(this.A0A, z);
                int A092 = this.A0A.A09() - A09;
                this.A0A.A0f(A09);
                this.A08.AI7(this.A0A, A092);
                int currentLimit6 = this.A00;
                this.A00 = currentLimit6 + A092;
                if (A01 != -1) {
                    A03();
                    String[] strArr3 = A0E;
                    String str = strArr3[6];
                    String str2 = strArr3[1];
                    int length = str.length();
                    int currentLimit7 = str2.length();
                    if (length != currentLimit7) {
                        String[] strArr4 = A0E;
                        strArr4[3] = "m1G";
                        strArr4[4] = "pgV";
                        this.A00 = 0;
                        this.A04 = A01;
                    }
                }
                if (this.A0A.A07() < 16) {
                    int A07 = this.A0A.A07();
                    System.arraycopy(this.A0A.A0l(), this.A0A.A09(), this.A0A.A0l(), 0, A07);
                    this.A0A.A0f(0);
                    this.A0A.A0e(A07);
                }
                return 0;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:14:0x0034 */
    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A01(C4J c4j, boolean z) {
        boolean z2;
        C3M.A01(this.A07);
        int A09 = c4j.A09();
        while (A09 <= frameOffset - 16) {
            c4j.A0f(A09);
            if (AbstractC0447Gd.A07(c4j, this.A07, this.A01, this.A0B)) {
                c4j.A0f(A09);
                return this.A0B.A00;
            }
            A09++;
        }
        if (z) {
            while (A09 <= r1 - frameOffset) {
                c4j.A0f(A09);
                try {
                    z2 = AbstractC0447Gd.A07(c4j, this.A07, this.A01, this.A0B);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                int A092 = c4j.A09();
                int frameOffset = c4j.A0A();
                if (A092 > frameOffset) {
                    z2 = false;
                }
                if (z2) {
                    c4j.A0f(A09);
                    return this.A0B.A00;
                }
                A09++;
            }
            int frameOffset2 = c4j.A0A();
            c4j.A0f(frameOffset2);
        } else {
            c4j.A0f(A09);
        }
        String[] strArr = A0E;
        String str = strArr[3];
        String str2 = strArr[4];
        int length = str.length();
        int frameOffset3 = str2.length();
        if (length != frameOffset3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[7] = "ocsB3wUrjHvCq2LiV7qRqPCVLxbY4c1N";
        strArr2[5] = "pwt2z55mSaXVkRisABTZleFgLF4gxvRK";
        return -1L;
    }

    private InterfaceC0466Gw A02(long j, long j2) {
        C3M.A01(this.A07);
        if (this.A07.A0A != null) {
            return new C1622lK(this.A07, j);
        }
        if (j2 != -1 && this.A07.A09 > 0) {
            this.A09 = new C1615lD(this.A07, this.A01, j, j2);
            return this.A09.A07();
        }
        return new C1620lI(this.A07.A06());
    }

    private void A03() {
        ((H1) AbstractC01484a.A0f(this.A08)).AIA((this.A04 * 1000000) / ((C0451Gh) AbstractC01484a.A0f(this.A07)).A07, 1, this.A00, 0, null);
    }

    private void A04(InterfaceC1625lN interfaceC1625lN) throws IOException {
        this.A01 = AbstractC0449Gf.A00(interfaceC1625lN);
        ((GY) AbstractC01484a.A0f(this.A06)).AIN(A02(interfaceC1625lN.A8f(), interfaceC1625lN.A8G()));
        this.A03 = 5;
    }

    private void A05(InterfaceC1625lN interfaceC1625lN) throws IOException {
        interfaceC1625lN.AG9(this.A0D, 0, this.A0D.length);
        interfaceC1625lN.AI1();
        this.A03 = 2;
    }

    private void A06(InterfaceC1625lN interfaceC1625lN) throws IOException {
        this.A05 = AbstractC0449Gf.A02(interfaceC1625lN, !this.A0C);
        this.A03 = 1;
    }

    private void A07(InterfaceC1625lN interfaceC1625lN) throws IOException {
        boolean z = false;
        C0448Ge metadataHolder = new C0448Ge(this.A07);
        while (!z) {
            z = AbstractC0449Gf.A0B(interfaceC1625lN, metadataHolder);
            this.A07 = (C0451Gh) AbstractC01484a.A0f(metadataHolder.A00);
        }
        C3M.A01(this.A07);
        this.A02 = Math.max(this.A07.A06, 6);
        ((H1) AbstractC01484a.A0f(this.A08)).A6W(this.A07.A08(this.A0D, this.A05));
        this.A03 = 4;
    }

    private void A08(InterfaceC1625lN interfaceC1625lN) throws IOException {
        AbstractC0449Gf.A09(interfaceC1625lN);
        this.A03 = 3;
    }

    public static /* synthetic */ GX[] A09() {
        return new GX[]{new C1613lB()};
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AA4(GY gy) {
        this.A06 = gy;
        this.A08 = gy.AJh(0, 1);
        gy.A6G();
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final int AGb(InterfaceC1625lN interfaceC1625lN, C0463Gt c0463Gt) throws IOException {
        switch (this.A03) {
            case 0:
                A06(interfaceC1625lN);
                return 0;
            case 1:
                A05(interfaceC1625lN);
                return 0;
            case 2:
                A08(interfaceC1625lN);
                return 0;
            case 3:
                A07(interfaceC1625lN);
                return 0;
            case 4:
                A04(interfaceC1625lN);
                return 0;
            case 5:
                return A00(interfaceC1625lN, c0463Gt);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AGr() {
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AIM(long j, long j2) {
        if (j == 0) {
            this.A03 = 0;
        } else {
            C1615lD c1615lD = this.A09;
            if (A0E[2].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[3] = "FHi";
            strArr[4] = "3pT";
            if (c1615lD != null) {
                this.A09.A08(j2);
            }
        }
        this.A04 = j2 != 0 ? -1L : 0L;
        this.A00 = 0;
        this.A0A.A0d(0);
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final boolean AJL(InterfaceC1625lN interfaceC1625lN) throws IOException {
        AbstractC0449Gf.A01(interfaceC1625lN, false);
        return AbstractC0449Gf.A0A(interfaceC1625lN);
    }
}
