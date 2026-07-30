package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.kR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1579kR implements GX {
    public static byte[] A03;
    public static String[] A04 = {"IFBRawCVF0AWJOiiVagp2bzm1iWWQKSj", "auHMqC8YUXWsvqiTg7", "x05hwyQceYKgfv4KdHsaZDzMFYGIFABO", "EiWauAjA92n8uYBsDF1eTop4V9uY", "nHLlm8XHOjaWHtwU5p4BIc0GM3UweWlu", "dBwF9hq9j3gGLabp", "n4a5QuSOEmxq5i2DA2", "Zy0ftHIbrTR5qGqkd"};
    public static final InterfaceC0445Gb A05;
    public GY A00;
    public AbstractC0520Iz A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[3].length() == 20) {
                throw new RuntimeException();
            }
            A04[3] = "IEdap1c7a0gADNuxefg";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
            i4++;
        }
    }

    public static void A02() {
        A03 = new byte[]{96, 71, 79, 74, 67, 66, 6, 82, 73, 6, 66, 67, 82, 67, 84, 75, 79, 72, 67, 6, 68, 79, 82, 85, 82, 84, 67, 71, 75, 6, 82, 95, 86, 67};
    }

    static {
        A02();
        A05 = new InterfaceC0445Gb() { // from class: com.facebook.ads.redexgen.X.kS
            @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
            public final GX[] A5F() {
                return C1579kR.A04();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC0444Ga.A01(this, uri, map);
            }
        };
    }

    public static C4J A00(C4J c4j) {
        c4j.A0f(0);
        return c4j;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean A03(InterfaceC1625lN interfaceC1625lN) throws IOException {
        C0516Iv c0516Iv = new C0516Iv();
        if (!c0516Iv.A05(interfaceC1625lN, true) || (c0516Iv.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c0516Iv.A00, 8);
        C4J c4j = new C4J(length);
        interfaceC1625lN.AG9(c4j.A0l(), 0, length);
        if (C1581kT.A01(A00(c4j))) {
            this.A01 = new C1581kT();
        } else if (C1576kO.A06(A00(c4j))) {
            this.A01 = new C1576kO();
        } else {
            if (!C1578kQ.A02(A00(c4j))) {
                return false;
            }
            this.A01 = new C1578kQ();
        }
        return true;
    }

    public static /* synthetic */ GX[] A04() {
        return new GX[]{new C1579kR()};
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AA4(GY gy) {
        this.A00 = gy;
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final int AGb(InterfaceC1625lN interfaceC1625lN, C0463Gt c0463Gt) throws IOException {
        C3M.A02(this.A00);
        if (this.A01 == null) {
            if (A03(interfaceC1625lN)) {
                interfaceC1625lN.AI1();
            } else {
                throw C01042i.A01(A01(0, 34, 2), null);
            }
        }
        boolean z = this.A02;
        if (A04[0].charAt(6) == 'U') {
            throw new RuntimeException();
        }
        A04[5] = "ISTJLhLpuA8o4P7J";
        if (!z) {
            H1 AJh = this.A00.AJh(0, 1);
            this.A00.A6G();
            this.A01.A08(this.A00, AJh);
            this.A02 = true;
        }
        return this.A01.A04(interfaceC1625lN, c0463Gt);
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AGr() {
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AIM(long j, long j2) {
        if (this.A01 != null) {
            this.A01.A07(j, j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final boolean AJL(InterfaceC1625lN interfaceC1625lN) throws IOException {
        try {
            return A03(interfaceC1625lN);
        } catch (C01042i unused) {
            return false;
        }
    }
}
