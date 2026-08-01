package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class FF extends AbstractC1075aw {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, Ascii.FS, 72, 83, Ascii.FS, 83, 76, 89, 82, Ascii.FS, 80, 85, 82, 87, Ascii.FS, 73, 78, 80, 6, Ascii.FS, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = FF.class.getSimpleName();
    }

    public FF(YA ya, InterfaceC0565If interfaceC0565If, String str, Uri uri, Map<String, String> mExtraData, C01420n c01420n, boolean z) {
        super(ya, interfaceC0565If, str, c01420n, z);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01360g
    public final EnumC01350f A0A() {
        try {
            KZ.A0B(new KZ(), ((AbstractC01360g) this).A00, C0611Kc.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC01360g) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC01350f.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1075aw
    public final void A0D() {
        EnumC01350f enumC01350f = null;
        if (((AbstractC1075aw) this).A02) {
            enumC01350f = A0A();
        }
        A0E(this.A01, enumC01350f);
    }
}
