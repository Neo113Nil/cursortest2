package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AH implements InterfaceC3714pF {
    public static byte[] A03;
    public final int A00;
    public final AbstractC19833d A01;
    public final InterfaceC3714pF A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public AH(InterfaceC3714pF interfaceC3714pF, AbstractC19833d abstractC19833d, int i) {
        this.A02 = (InterfaceC3714pF) AbstractC20023y.A01(interfaceC3714pF);
        AbstractC20023y.A01(abstractC19833d);
        this.A01 = null;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public final void A43(InterfaceC20495t interfaceC20495t) {
        AbstractC20023y.A01(interfaceC20495t);
        this.A02.A43(interfaceC20495t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public final Map<String, List<String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public final Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public final long AGi(C20385i c20385i) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19582c
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }
}
