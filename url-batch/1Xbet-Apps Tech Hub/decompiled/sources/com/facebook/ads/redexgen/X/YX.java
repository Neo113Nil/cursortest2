package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class YX implements InterfaceC01761v {
    public static byte[] A03;
    public C02565a A00;
    public YA A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE};
    }

    public YX(C02565a c02565a, YA ya, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c02565a;
        this.A01 = ya;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01761v
    public final void ABH(JG jg) {
        C0608Jz.A00(new C0967Ya(this, jg));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01761v
    public final void ACD(List<C1060ah> list) {
        C6Q manager = new C6Q(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (C1060ah c1060ah : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = c1060ah.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1060ah.A0E().A0G() != null) {
                    manager.A0b(new C6O(c1060ah.A0E().A0G().getUrl(), c1060ah.A0E().A0G().getHeight(), c1060ah.A0E().A0G().getWidth(), c1060ah.A0G(), A02(0, 6, 2)));
                }
                if (c1060ah.A0E().A0F() != null) {
                    manager.A0b(new C6O(c1060ah.A0E().A0F().getUrl(), c1060ah.A0E().A0F().getHeight(), c1060ah.A0E().A0F().getWidth(), c1060ah.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c1060ah.A0E().A0d())) {
                    manager.A0a(new C6M(c1060ah.A0E().A0d(), c1060ah.A0G(), A02(0, 6, 2), c1060ah.A0E().A0A()));
                }
            }
        }
        manager.A0W(new YY(this, list), new C6J(firstRequestId, A02(0, 6, 2)));
    }
}
