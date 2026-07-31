package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2699Vw extends N2 {
    public static byte[] A01;
    public final /* synthetic */ UK A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, Byte.MAX_VALUE, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 98, 63};
    }

    public C2699Vw(UK uk) {
        this.A00 = uk;
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0B(C3400ju c3400ju) {
        this.A00.A1d(c3400ju);
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0C() {
        InterfaceC2648Tv interfaceC2648Tv;
        InterfaceC2648Tv interfaceC2648Tv2;
        interfaceC2648Tv = this.A00.A0I;
        if (interfaceC2648Tv != null) {
            interfaceC2648Tv2 = this.A00.A0I;
            interfaceC2648Tv2.ACm();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0F(N1 n1) {
        C20887g c20887g;
        C20887g c20887g2;
        c20887g = this.A00.A0B;
        if (c20887g != null) {
            c20887g2 = this.A00.A0B;
            c20887g2.A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0G(C2690Vm c2690Vm) {
        long j;
        InterfaceC2648Tv interfaceC2648Tv;
        InterfaceC2648Tv interfaceC2648Tv2;
        InterfaceC2444Lt A0F = this.A00.A16().A0F();
        j = this.A00.A00;
        A0F.A3N(Y1.A01(j), c2690Vm.A03().getErrorCode(), c2690Vm.A04());
        interfaceC2648Tv = this.A00.A0I;
        if (interfaceC2648Tv != null) {
            interfaceC2648Tv2 = this.A00.A0I;
            interfaceC2648Tv2.ADp(c2690Vm);
        }
    }
}
