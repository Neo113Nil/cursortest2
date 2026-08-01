package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01480t {
    public static InterfaceC01430o A00;

    public final InterfaceC01430o A00(YA ya, AdPlacementType adPlacementType) {
        InterfaceC01430o interfaceC01430o = A00;
        if (interfaceC01430o != null) {
            return interfaceC01430o;
        }
        switch (C01470s.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C1063ak();
            case 2:
                return new C1062aj();
            case 3:
                return new C1060ah(ya);
            case 4:
                return new FD(ya);
            case 5:
                return new FA();
            default:
                return null;
        }
    }
}
