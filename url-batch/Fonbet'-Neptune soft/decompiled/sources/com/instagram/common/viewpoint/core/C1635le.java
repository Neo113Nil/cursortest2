package com.instagram.common.viewpoint.core;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.le, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1635le implements InterfaceC0389Ed {
    public final int A00;

    public C1635le() {
        this(-1);
    }

    public C1635le(int i) {
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0389Ed
    public final int A8R(int i) {
        if (this.A00 == -1) {
            if (i == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0389Ed
    public final long A8m(C0388Ec c0388Ec) {
        IOException iOException = c0388Ec.A03;
        if ((iOException instanceof C00982i) || (iOException instanceof FileNotFoundException) || (iOException instanceof C02669h) || (iOException instanceof C0399En) || C01674z.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c0388Ec.A00 - 1) * 1000, 5000);
    }
}
