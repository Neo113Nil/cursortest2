package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.iE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1446iE extends MR {
    public static byte[] A06;
    public static final String A07;
    public C1448iG A00;
    public V4 A01;
    public boolean A02;
    public final C1159dL A03;
    public final US A04;
    public final AbstractC0933Ze A05;

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
        A07 = C1446iE.class.getSimpleName();
    }

    public C1446iE(C1159dL c1159dL, US us, AbstractC0933Ze abstractC0933Ze, C1232eX c1232eX, MS ms, V4 v4) {
        super(c1159dL, ms, c1232eX);
        this.A04 = us;
        this.A05 = abstractC0933Ze;
        this.A03 = c1159dL;
        this.A01 = v4;
    }

    @Override // com.instagram.common.viewpoint.core.MR
    public final void A08(Map<String, String> map) {
        String adPlacementType;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7G())) {
            this.A03.A0F().A3D();
            AbstractC0646Nw.A02(this.A00.A05(), X0.A00(A04(0, 6, 50)));
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
                XJ.A00(new C1447iF(this));
            }
        }
    }

    public final void A0A(C1448iG c1448iG) {
        this.A00 = c1448iG;
    }
}
