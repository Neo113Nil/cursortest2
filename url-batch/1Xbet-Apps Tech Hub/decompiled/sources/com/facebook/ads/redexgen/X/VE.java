package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VE implements InterfaceC0512Gc {
    public static byte[] A00;
    public static final InterfaceC0511Gb A01;
    public static final VE A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{51, 2, Ascii.SUB, Ascii.SUB, Ascii.SO, 87, 4, Ascii.CAN, 2, 5, Ascii.DC4, Ascii.DC2};
    }

    static {
        A01();
        A02 = new VE();
        A01 = new VF();
    }

    public VE() {
    }

    public /* synthetic */ VE(VF vf) {
        this();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final Uri A85() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final long ADb(C0516Gg c0516Gg) throws IOException {
        throw new IOException(A00(0, 12, 28));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException();
    }
}
