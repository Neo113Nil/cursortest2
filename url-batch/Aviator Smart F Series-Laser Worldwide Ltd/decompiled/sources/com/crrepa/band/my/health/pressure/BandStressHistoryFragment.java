package com.crrepa.band.my.health.pressure;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.crrepa.band.my.health.base.BaseListHistoryFragment;
import com.crrepa.band.my.health.pressure.adapter.StressHistoryAdapter;
import com.crrepa.band.my.model.db.Stress;
import com.crrepa.band.my.model.db.proxy.StressDaoProxy;

/* loaded from: classes2.dex */
public class BandStressHistoryFragment extends BaseListHistoryFragment {
    public static BaseListHistoryFragment newInstance() {
        return new BandStressHistoryFragment();
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected BaseQuickAdapter getHistoryAdapter() {
        return new StressHistoryAdapter(new StressDaoProxy().getAll());
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected void onHistoryClicked(BaseQuickAdapter baseQuickAdapter, int i8) {
        if (((Stress) baseQuickAdapter.getData().get(i8)) != null) {
            start(BandStressDetailFragment.newInstance(r1.getId().intValue()));
        }
    }
}
