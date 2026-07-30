package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2022jv extends AbstractRunnableC1326Wc {
    public final /* synthetic */ C2021ju A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C2022jv(C2021ju c2021ju, Map map, Map map2) {
        this.A00 = c2021ju;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        C2009ji c2009ji;
        C1839gi c1839gi;
        C2009ji c2009ji2;
        c2009ji = this.A00.A01;
        if (!TextUtils.isEmpty(c2009ji.A7O())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1839gi = this.A00.A0A;
            VA A0A = c1839gi.A0A();
            c2009ji2 = this.A00.A01;
            A0A.AC3(c2009ji2.A7O(), hashMap);
        }
    }
}
