package com.ironsource;

import com.ironsource.InterfaceC1579v2;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class p7<Listener extends InterfaceC1579v2> extends m7<Listener> implements AdapterAdRewardListener {

    /* renamed from: r, reason: collision with root package name */
    private ib f18610r;

    class a extends ir {
        a() {
        }

        @Override // com.ironsource.ir
        public void a() {
            p7.this.U();
        }
    }

    public p7(up upVar, C1509m1 c1509m1, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C1441c3 c1441c3, C1513m5 c1513m5, Listener listener) {
        super(upVar, c1509m1, baseAdAdapter, c1441c3, c1513m5, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.f18780g == null) {
            IronLog.INTERNAL.verbose(a("placement is null "));
            C1454e2 c1454e2 = this.f18777d;
            if (c1454e2 != null) {
                c1454e2.f15956k.g("mCurrentPlacement is null state = " + this.f18778e);
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(a("placement name = " + j()));
        if (this.f18777d != null) {
            HashMap hashMap = new HashMap();
            if (com.ironsource.mediationsdk.p.m().s() != null) {
                for (String str : com.ironsource.mediationsdk.p.m().s().keySet()) {
                    hashMap.put("custom_" + str, com.ironsource.mediationsdk.p.m().s().get(str));
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f18777d.f15955j.a(j(), this.f18780g.getRewardName(), this.f18780g.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, c()), ib.a(this.f18610r), hashMap, com.ironsource.mediationsdk.p.m().l());
        }
        ((InterfaceC1579v2) this.f18775b).a((p7<?>) this, this.f18780g);
    }

    @Override // com.ironsource.m7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.f18610r = new ib();
        super.onAdClosed();
    }

    @Override // com.ironsource.q7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.f18610r = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (u().c()) {
            u().a(new a());
        } else {
            U();
        }
    }
}
