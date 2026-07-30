package com.crrepa.band.my.health.heartrate;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.crrepa.band.my.health.base.BaseListHistoryFragment;
import com.crrepa.band.my.health.heartrate.adapter.OnceHeartRateHistoryAdapter;
import com.crrepa.band.my.model.db.OnceHeartRate;
import com.crrepa.band.my.model.db.proxy.OnceHeartRateDaoProxy;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class BandOnceHeartRateHistoryFragment extends BaseListHistoryFragment {
    public static BaseListHistoryFragment newInstance() {
        return new BandOnceHeartRateHistoryFragment();
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected BaseQuickAdapter getHistoryAdapter() {
        return new OnceHeartRateHistoryAdapter(getContext(), new OnceHeartRateDaoProxy().getAll());
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected void onHistoryClicked(BaseQuickAdapter baseQuickAdapter, int i8) {
        start(BandOnceHeartRateStatisticsFragment.newInstance(((OnceHeartRate) baseQuickAdapter.getData().get(i8)).getId().longValue()));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        s0.logPage(getClass(), "心率_单次历史记录");
    }
}
