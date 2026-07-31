package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;

/* loaded from: classes2.dex */
public class kj extends m7<InterfaceC1489j2> implements InterstitialAdListener {
    public kj(up upVar, C1509m1 c1509m1, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, C1513m5 c1513m5, InterfaceC1489j2 interfaceC1489j2) {
        super(upVar, c1509m1, baseAdAdapter, new C1441c3(c1509m1.g(), c1509m1.g().getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), c1513m5, interfaceC1489j2);
    }
}
