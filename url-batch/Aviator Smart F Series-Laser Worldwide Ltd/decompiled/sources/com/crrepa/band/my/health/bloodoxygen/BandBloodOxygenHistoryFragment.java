package com.crrepa.band.my.health.bloodoxygen;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.crrepa.band.my.health.base.BaseListHistoryFragment;
import com.crrepa.band.my.health.bloodoxygen.adapter.BloodOxygenHistoryAdapter;
import com.crrepa.band.my.model.db.BloodOxygen;
import com.crrepa.band.my.model.db.proxy.BloodOxygenDaoProxy;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class BandBloodOxygenHistoryFragment extends BaseListHistoryFragment {
    public static BaseListHistoryFragment newInstance() {
        return new BandBloodOxygenHistoryFragment();
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected BaseQuickAdapter getHistoryAdapter() {
        return new BloodOxygenHistoryAdapter(getContext(), new BloodOxygenDaoProxy().getAll());
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected void onHistoryClicked(BaseQuickAdapter baseQuickAdapter, int i8) {
        start(BandBloodOxygenStatisticsFragment.newInstance(((BloodOxygen) baseQuickAdapter.getItem(i8)).getId().longValue()));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        s0.logPage(getClass(), "血氧饱和度_单次历史记录");
    }
}
