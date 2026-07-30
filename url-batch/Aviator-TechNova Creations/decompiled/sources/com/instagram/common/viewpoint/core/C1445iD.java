package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.iD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1445iD extends MR {
    public static byte[] A02;

    @Nullable
    public final C1443iB A00;
    public final US A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C1445iD(C1159dL c1159dL, MS ms, C1232eX c1232eX, US us, C1443iB c1443iB) {
        super(c1159dL, ms, c1232eX);
        this.A01 = us;
        this.A00 = c1443iB;
    }

    @Override // com.instagram.common.viewpoint.core.MR
    public final void A08(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7G())) {
            this.A02.A0F().A3D();
            AbstractC0646Nw.A02(this.A00.A0X(), X0.A00(A01(0, 6, 62)));
            this.A01.AB5(this.A00.A7G(), map);
            if (U7.A19(this.A02)) {
                String adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                W2 A00 = W2.A00(this.A02);
                String placementType = this.A00.A7G();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }
}
