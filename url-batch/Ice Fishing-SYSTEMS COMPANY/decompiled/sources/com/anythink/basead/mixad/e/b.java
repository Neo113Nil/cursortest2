package com.anythink.basead.mixad.e;

import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b extends x implements Serializable {
    public b(com.anythink.core.common.l.g.a aVar, n nVar, int i) {
        this.f14312a = nVar.x();
        this.f14313b = nVar.aI();
        this.f14314c = nVar.M();
        this.f14315d = nVar.aJ();
        this.f14317f = nVar.Y();
        this.f14318g = nVar.aF();
        this.f14319h = nVar.aG();
        this.i = nVar.Z();
        this.f14320j = i;
        this.f14321k = -1;
        this.f14322l = nVar.o();
        this.f14325o = new c(aVar);
    }

    public final String toString() {
        return "ThirdPartyAdRequestInfo{bidId='" + this.f14312a + "', placementId='" + this.f14313b + "', adsourceId='" + this.f14314c + "', requestId='" + this.f14315d + "', requestAdNum=" + this.f14316e + ", networkFirmId=" + this.f14317f + ", networkName='" + this.f14318g + "', trafficGroupId=" + this.f14319h + ", groupId=" + this.i + ", format=" + this.f14320j + ", tpBidId='" + this.f14322l + "', requestUrl='" + this.f14323m + "', bidResultOutDateTime=" + this.f14324n + ", baseAdSetting=" + this.f14325o + ", isTemplate=" + this.f14326p + ", isGetMainImageSizeSwitch=" + this.f14327q + '}';
    }
}
