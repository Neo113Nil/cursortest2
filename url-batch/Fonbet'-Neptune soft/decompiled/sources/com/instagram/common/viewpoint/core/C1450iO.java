package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.iO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1450iO extends AbstractRunnableC0840Vt {
    public final /* synthetic */ C1449iN A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1450iO(C1449iN c1449iN, Map map, Map map2) {
        this.A00 = c1449iN;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        C1437iB c1437iB;
        C1153dL c1153dL;
        C1437iB c1437iB2;
        c1437iB = this.A00.A01;
        if (!TextUtils.isEmpty(c1437iB.A7G())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1153dL = this.A00.A0A;
            US A0A = c1153dL.A0A();
            c1437iB2 = this.A00.A01;
            A0A.ABT(c1437iB2.A7G(), hashMap);
        }
    }
}
