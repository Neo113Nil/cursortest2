package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.iO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1456iO extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C1455iN A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1456iO(C1455iN c1455iN, Map map, Map map2) {
        this.A00 = c1455iN;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        C1443iB c1443iB;
        C1159dL c1159dL;
        C1443iB c1443iB2;
        c1443iB = this.A00.A01;
        if (!TextUtils.isEmpty(c1443iB.A7G())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1159dL = this.A00.A0A;
            US A0A = c1159dL.A0A();
            c1443iB2 = this.A00.A01;
            A0A.ABT(c1443iB2.A7G(), hashMap);
        }
    }
}
