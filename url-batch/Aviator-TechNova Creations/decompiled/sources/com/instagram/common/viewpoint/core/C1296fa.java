package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.fa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1296fa implements NX {
    public static byte[] A03;
    public static String[] A04 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};
    public RO A00;
    public C1159dL A01;
    public final NativeAdBase.MediaCacheFlag A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[6].length() == 1) {
                throw new RuntimeException();
            }
            A04[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
            i4++;
        }
    }

    public static void A03() {
        A03 = new byte[]{-26, -39, -20, -31, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    static {
        A03();
    }

    public C1296fa(RO ro, C1159dL c1159dL, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = ro;
        this.A01 = c1159dL;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.instagram.common.viewpoint.core.NX
    public final void ADB(V1 v1) {
        AbstractC0837Vk.A00(new C1299fd(this, v1));
    }

    @Override // com.instagram.common.viewpoint.core.NX
    public final void AEJ(List<C1455iN> list) {
        SF manager = new SF(this.A01);
        String firstRequestId = A02(6, 7, 23);
        for (C1455iN c1455iN : list) {
            if (A02(6, 7, 23).equals(firstRequestId)) {
                firstRequestId = c1455iN.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1455iN.A0E().A0F() != null) {
                    manager.A0c(new SD(c1455iN.A0E().A0F().getUrl(), c1455iN.A0E().A0F().getHeight(), c1455iN.A0E().A0F().getWidth(), c1455iN.A0G(), A02(0, 6, 32)));
                }
                if (c1455iN.A0E().A0E() != null) {
                    manager.A0c(new SD(c1455iN.A0E().A0E().getUrl(), c1455iN.A0E().A0E().getHeight(), c1455iN.A0E().A0E().getWidth(), c1455iN.A0G(), A02(0, 6, 32)));
                }
                if (!TextUtils.isEmpty(c1455iN.A0E().A0b())) {
                    manager.A0b(new SB(c1455iN.A0E().A0b(), c1455iN.A0G(), A02(0, 6, 32), c1455iN.A0E().A0A()));
                }
            }
        }
        manager.A0X(new C1297fb(this, list), new S8(firstRequestId, A02(0, 6, 32)));
    }
}
