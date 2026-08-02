package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.gQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1341gQ implements PZ {
    public final /* synthetic */ C02046k A00;
    public final /* synthetic */ PU A01;

    public C1341gQ(C02046k c02046k, PU pu) {
        this.A00 = c02046k;
        this.A01 = pu;
    }

    @Override // com.instagram.common.viewpoint.core.PZ
    public final Object A58(int i) {
        PS compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.instagram.common.viewpoint.core.PZ
    public final List<Object> A6Q(String str, int i) {
        List<PS> A03 = this.A01.A03(str, i);
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

    @Override // com.instagram.common.viewpoint.core.PZ
    public final Object A6R(int i) {
        PS compatInfo = this.A01.A01(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.instagram.common.viewpoint.core.PZ
    public final boolean AGB(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
