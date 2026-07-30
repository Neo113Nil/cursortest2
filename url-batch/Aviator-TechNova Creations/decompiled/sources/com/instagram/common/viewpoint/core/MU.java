package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* loaded from: assets/audience_network.dex */
public final class MU {
    public static MP A00;

    public final MP A00(final C1159dL c1159dL, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (MT.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C7L();
            case 2:
                if (U7.A1N(c1159dL)) {
                    return new C7K();
                }
                return new C7L();
            case 3:
                return new C1460iS();
            case 4:
                return new C1455iN(c1159dL);
            case 5:
                return new C1455iN(c1159dL) { // from class: com.facebook.ads.redexgen.X.7F
                    @Override // com.instagram.common.viewpoint.core.C1455iN, com.instagram.common.viewpoint.core.MP
                    public final AdPlacementType A8c() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C7B();
            default:
                return null;
        }
    }
}
