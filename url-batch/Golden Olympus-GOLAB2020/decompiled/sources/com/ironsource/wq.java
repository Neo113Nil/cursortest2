package com.ironsource;

import com.ironsource.C1526o2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class wq extends o7<xq> {
    public wq(List<NetworkSettings> list, zq zqVar, String str, boolean z4, rk rkVar, IronSourceSegment ironSourceSegment) {
        super(new uq(str, list, zqVar, z4), rkVar, ironSourceSegment);
    }

    @Override // com.ironsource.n7
    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return ((AdapterSettingsInterface) adapterBaseInterface).getLoadWhileShowSupportedState(networkSettings);
    }

    protected xq b(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, int i4, String str, C1513m5 c1513m5) {
        return new xq(this, new C1509m1(IronSource.AD_UNIT.REWARDED_VIDEO, this.f18298o.o(), i4, this.f18290g, str, this.f18288e, this.f18289f, networkSettings, this.f18298o.n()), baseAdAdapter, c1513m5, this);
    }

    @Override // com.ironsource.n7
    protected AbstractC1503l2 g() {
        return new cr();
    }

    @Override // com.ironsource.n7
    protected String l() {
        return IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    @Override // com.ironsource.n7
    protected String o() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    @Override // com.ironsource.n7
    protected boolean q() {
        return this.f18298o.h().a() == C1526o2.a.MANUAL;
    }

    @Override // com.ironsource.n7
    protected boolean t() {
        return this.f18298o.h().a() == C1526o2.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    @Override // com.ironsource.n7
    protected /* bridge */ /* synthetic */ q7 a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i4, String str, C1513m5 c1513m5) {
        return b(networkSettings, (BaseAdAdapter<?, AdapterAdRewardListener>) baseAdAdapter, i4, str, c1513m5);
    }

    @Override // com.ironsource.n7
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }

    @Override // com.ironsource.n7
    protected void a(IronSourceError ironSourceError) {
        C1526o2.a a4 = this.f18298o.h().a();
        if (a4 == C1526o2.a.AUTOMATIC_LOAD_AFTER_CLOSE || a4 == C1526o2.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f18303t.a(false, (AdInfo) null);
        } else {
            super.a(ironSourceError);
        }
    }
}
