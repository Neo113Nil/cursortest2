package com.crrepa.band.my.health.heartrate;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.crrepa.band.my.health.base.BaseListHistoryFragment;
import com.crrepa.band.my.health.heartrate.adapter.ActiveHeartRateHistoryAdapter;
import com.crrepa.band.my.model.db.ActiveHeartRate;
import com.crrepa.band.my.model.db.proxy.ActiveHeartRateDaoProxy;

/* loaded from: classes2.dex */
public class BandActiveHeartRateHistoryFragment extends BaseListHistoryFragment {
    public static BaseListHistoryFragment newInstance() {
        return new BandActiveHeartRateHistoryFragment();
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected BaseQuickAdapter getHistoryAdapter() {
        return new ActiveHeartRateHistoryAdapter(getContext(), new ActiveHeartRateDaoProxy().getAll());
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected void onHistoryClicked(BaseQuickAdapter baseQuickAdapter, int i8) {
        start(BandActiveHeartRateStatisticsFragment.newInstance(((ActiveHeartRate) baseQuickAdapter.getData().get(i8)).getId().longValue()));
    }
}
