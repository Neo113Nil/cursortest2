package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class ZI implements InterfaceC02163k {
    public final /* synthetic */ EI A00;
    public final /* synthetic */ C02143i A01;

    public ZI(EI ei, C02143i c02143i) {
        this.A00 = ei;
        this.A01 = c02143i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02163k
    public final Object A4T(int i) {
        C02123g compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02163k
    public final List<Object> A5c(String str, int i) {
        List<C02123g> A03 = this.A01.A03(str, i);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i2 = 0; i2 < infoCount; i2++) {
            arrayList.add(A03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02163k
    public final boolean ADn(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
