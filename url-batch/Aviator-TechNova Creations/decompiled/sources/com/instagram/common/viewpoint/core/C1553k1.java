package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.k1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1553k1 implements GX {
    public static String[] A03 = {"omX6mlrNbYq0LGa8KWDQoDOxuY4Jaqsm", "5vCbKZ7gcP1deFubK5J3aMrnVGjcBeMu", "ozZJ4UCdXiLAsxGuZMu8vrfsyQyOy2Qr", "457YRIf4cJgVa", "48ELt3GeP9QgscGCGAyy0GBjQnf8y1ot", "nP9Rki4V9hDzJun2MpMPW2v7tMuO22BO", "splStgYzXsMDywgFYcc1GmuRRae3j1Zq", "jQwA1XKYR4HrKvDtyQbVDHffCNmVjAZf"};
    public static final InterfaceC0445Gb A04 = new InterfaceC0445Gb() { // from class: com.facebook.ads.redexgen.X.k2
        @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
        public final GX[] A5F() {
            return C1553k1.A00();
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC0444Ga.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C1552k0 A02 = new C1552k0();
    public final C4J A01 = new C4J(2786);

    public static /* synthetic */ GX[] A00() {
        return new GX[]{new C1553k1()};
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AA4(GY gy) {
        this.A02.A5U(gy, new C0551Ke(0, 1));
        gy.A6G();
        gy.AIN(new C1620lI(-9223372036854775807L));
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final int AGb(InterfaceC1625lN interfaceC1625lN, C0463Gt c0463Gt) throws IOException {
        int read = interfaceC1625lN.read(this.A01.A0l(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(read);
        if (!this.A00) {
            this.A02.AG6(0L, 4);
            this.A00 = true;
        }
        this.A02.A52(this.A01);
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AGr() {
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AIM(long j, long j2) {
        this.A00 = false;
        this.A02.AIL();
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final boolean AJL(InterfaceC1625lN interfaceC1625lN) throws IOException {
        C4J c4j = new C4J(10);
        int i = 0;
        while (true) {
            interfaceC1625lN.AG9(c4j.A0l(), 0, 10);
            c4j.A0f(0);
            if (c4j.A0K() != 4801587) {
                interfaceC1625lN.AI1();
                interfaceC1625lN.A3z(i);
                int i2 = i;
                int startPosition = 0;
                while (true) {
                    interfaceC1625lN.AG9(c4j.A0l(), 0, 6);
                    c4j.A0f(0);
                    int headerPosition = c4j.A0M();
                    if (headerPosition != 2935) {
                        startPosition = 0;
                        interfaceC1625lN.AI1();
                        i2++;
                        int headerPosition2 = i2 - i;
                        if (headerPosition2 >= 8192) {
                            return false;
                        }
                        interfaceC1625lN.A3z(i2);
                    } else {
                        startPosition++;
                        if (startPosition >= 4) {
                            return true;
                        }
                        int headerPosition3 = GF.A05(c4j.A0l());
                        if (headerPosition3 == -1) {
                            return false;
                        }
                        interfaceC1625lN.A3z(headerPosition3 - 6);
                    }
                }
            } else {
                c4j.A0g(3);
                int length = c4j.A0H();
                i += length + 10;
                String[] strArr = A03;
                if (strArr[2].charAt(6) == strArr[0].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[2] = "eBRvK0YAHsHMNfInXbOwvDfd4dSG53RM";
                strArr2[0] = "womotRNroMOUij9xAXX8qTzQtzDZBBtc";
                interfaceC1625lN.A3z(length);
            }
        }
    }
}
