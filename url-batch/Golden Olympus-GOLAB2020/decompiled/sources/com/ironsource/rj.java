package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

/* loaded from: classes2.dex */
public class rj extends AbstractC1503l2 {
    @Override // com.ironsource.AbstractC1503l2
    public void a(AdInfo adInfo) {
        tg.a().c(adInfo);
    }

    @Override // com.ironsource.AbstractC1503l2
    public void c(AdInfo adInfo) {
        tg.a().e(adInfo);
    }

    @Override // com.ironsource.AbstractC1503l2
    public void d(AdInfo adInfo) {
        tg.a().d(adInfo);
    }

    @Override // com.ironsource.AbstractC1503l2
    public void g(AdInfo adInfo) {
        tg.a().f(adInfo);
    }

    @Override // com.ironsource.AbstractC1503l2
    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        tg.a().a(ironSourceError, adInfo);
    }

    @Override // com.ironsource.AbstractC1503l2
    public void a(Placement placement, AdInfo adInfo) {
        tg.a().b(adInfo);
    }
}
