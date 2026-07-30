package com.crrepa.band.my.health.bloodpressure;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.crrepa.band.my.health.base.BaseListHistoryFragment;
import com.crrepa.band.my.health.bloodpressure.adapter.BloodPressureHistoryAdapter;
import com.crrepa.band.my.model.db.BloodPressure;
import com.crrepa.band.my.model.db.proxy.BloodPressureDaoProxy;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class BandBloodPressureHistoryFragment extends BaseListHistoryFragment {
    public static BandBloodPressureHistoryFragment newInstance() {
        return new BandBloodPressureHistoryFragment();
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected BaseQuickAdapter getHistoryAdapter() {
        return new BloodPressureHistoryAdapter(getContext(), new BloodPressureDaoProxy().getAll());
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected void onHistoryClicked(BaseQuickAdapter baseQuickAdapter, int i8) {
        start(BandBloodPressureStatisticsFragment.newInstance(((BloodPressure) baseQuickAdapter.getData().get(i8)).getId().longValue()));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        s0.logPage(getClass(), "血压_单次历史记录");
    }
}
