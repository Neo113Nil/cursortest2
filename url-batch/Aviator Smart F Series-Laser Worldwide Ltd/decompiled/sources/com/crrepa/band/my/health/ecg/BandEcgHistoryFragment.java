package com.crrepa.band.my.health.ecg;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.crrepa.band.my.health.base.BaseListHistoryFragment;
import com.crrepa.band.my.model.db.Ecg;
import com.crrepa.band.my.model.db.proxy.EcgDaoProxy;

/* loaded from: classes2.dex */
public class BandEcgHistoryFragment extends BaseListHistoryFragment {
    public static BaseListHistoryFragment newInstance() {
        return new BandEcgHistoryFragment();
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected BaseQuickAdapter getHistoryAdapter() {
        return new EcgHistoryAdapter(getContext(), new EcgDaoProxy().getAll());
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected void onHistoryClicked(BaseQuickAdapter baseQuickAdapter, int i8) {
        start(BandEcgStatisticsFragment.newInstance(((Ecg) baseQuickAdapter.getData().get(i8)).getId().longValue()));
    }
}
