package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;

/* loaded from: classes2.dex */
public class xq extends p7<InterfaceC1579v2> implements RewardedVideoAdListener {
    public xq(up upVar, C1509m1 c1509m1, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C1513m5 c1513m5, InterfaceC1579v2 interfaceC1579v2) {
        super(upVar, c1509m1, baseAdAdapter, new C1441c3(c1509m1.g(), c1509m1.g().getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), c1513m5, interfaceC1579v2);
    }
}
