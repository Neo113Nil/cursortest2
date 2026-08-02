package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.iE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1440iE extends MR {
    public static byte[] A06;
    public static final String A07;
    public C1442iG A00;
    public V4 A01;
    public boolean A02;
    public final C1153dL A03;
    public final US A04;
    public final AbstractC0927Ze A05;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C1440iE.class.getSimpleName();
    }

    public C1440iE(C1153dL c1153dL, US us, AbstractC0927Ze abstractC0927Ze, C1226eX c1226eX, MS ms, V4 v4) {
        super(c1153dL, ms, c1226eX);
        this.A04 = us;
        this.A05 = abstractC0927Ze;
        this.A03 = c1153dL;
        this.A01 = v4;
    }

    @Override // com.instagram.common.viewpoint.core.MR
    public final void A08(Map<String, String> map) {
        String adPlacementType;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7G())) {
            this.A03.A0F().A3D();
            AbstractC0640Nw.A02(this.A00.A05(), X0.A00(A04(0, 6, 50)));
            this.A04.AB5(this.A00.A7G(), map);
            if (U7.A19(this.A03)) {
                if (this.A01 == V4.A09) {
                    adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    adPlacementType = AdPlacementType.BANNER.toString();
                }
                W2 A00 = W2.A00(this.A03);
                String placementType = this.A00.A7G();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                XJ.A00(new C1441iF(this));
            }
        }
    }

    public final void A0A(C1442iG c1442iG) {
        this.A00 = c1442iG;
    }
}
