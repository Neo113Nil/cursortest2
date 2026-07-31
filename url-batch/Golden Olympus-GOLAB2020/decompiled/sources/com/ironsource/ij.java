package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ij extends l7<kj, AdapterAdInteractionListener> {
    ij(yf yfVar, xf xfVar, List<NetworkSettings> list, nj njVar, String str, rk rkVar, IronSourceSegment ironSourceSegment) {
        super(yfVar, xfVar, new jj(str, list, njVar), rkVar, ironSourceSegment);
    }

    @Override // com.ironsource.n7
    protected /* bridge */ /* synthetic */ q7 a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i4, String str, C1513m5 c1513m5) {
        return b(networkSettings, (BaseAdAdapter<?, AdapterAdInteractionListener>) baseAdAdapter, i4, str, c1513m5);
    }

    protected kj b(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, int i4, String str, C1513m5 c1513m5) {
        return new kj(this, new C1509m1(IronSource.AD_UNIT.INTERSTITIAL, this.f18298o.o(), i4, this.f18290g, str, this.f18288e, this.f18289f, networkSettings, this.f18298o.n()), baseAdAdapter, c1513m5, this);
    }

    @Override // com.ironsource.n7
    protected AbstractC1503l2 g() {
        return new rj();
    }

    @Override // com.ironsource.n7
    protected String l() {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    @Override // com.ironsource.n7
    protected String o() {
        return IronSourceConstants.OPW_IS_MANAGER_NAME;
    }

    public ij(List<NetworkSettings> list, nj njVar, String str, rk rkVar, IronSourceSegment ironSourceSegment) {
        super(new jj(str, list, njVar), rkVar, ironSourceSegment);
    }

    @Override // com.ironsource.n7
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }
}
