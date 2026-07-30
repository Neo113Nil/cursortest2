package com.instagram.common.viewpoint.core;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.le, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1641le implements InterfaceC0395Ed {
    public final int A00;

    public C1641le() {
        this(-1);
    }

    public C1641le(int i) {
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0395Ed
    public final int A8R(int i) {
        if (this.A00 == -1) {
            if (i == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0395Ed
    public final long A8m(C0394Ec c0394Ec) {
        IOException iOException = c0394Ec.A03;
        if ((iOException instanceof C01042i) || (iOException instanceof FileNotFoundException) || (iOException instanceof C02729h) || (iOException instanceof C0405En) || C01734z.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c0394Ec.A00 - 1) * 1000, 5000);
    }
}
