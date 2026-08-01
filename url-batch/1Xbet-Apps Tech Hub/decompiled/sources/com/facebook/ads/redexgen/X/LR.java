package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public final class LR {
    public static EnumC0746Pj A00(VideoStartReason videoStartReason) {
        switch (LQ.A00[videoStartReason.ordinal()]) {
            case 1:
                return EnumC0746Pj.A02;
            case 2:
                return EnumC0746Pj.A03;
            case 3:
                return EnumC0746Pj.A04;
            default:
                return EnumC0746Pj.A03;
        }
    }
}
