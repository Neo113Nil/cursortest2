package com.ironsource;

import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.p7;

/* loaded from: classes2.dex */
public abstract class o7<Smash extends p7<?>> extends l7<Smash, AdapterAdRewardListener> implements InterfaceC1579v2 {
    public o7(C1571u0 c1571u0, rk rkVar, IronSourceSegment ironSourceSegment) {
        super(c1571u0, rkVar, ironSourceSegment);
    }

    @Override // com.ironsource.InterfaceC1579v2
    public void a(p7<?> p7Var, Placement placement) {
        IronLog.INTERNAL.verbose(b(p7Var.k()));
        this.f18303t.b(placement, p7Var.f());
    }
}
