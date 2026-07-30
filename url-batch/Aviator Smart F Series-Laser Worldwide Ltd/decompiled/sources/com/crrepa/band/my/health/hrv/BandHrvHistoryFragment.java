package com.crrepa.band.my.health.hrv;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.crrepa.band.my.health.base.BaseListHistoryFragment;
import com.crrepa.band.my.health.hrv.adapter.HrvHistoryAdapter;
import com.crrepa.band.my.model.db.Hrv;
import com.crrepa.band.my.model.db.proxy.HrvDaoProxy;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class BandHrvHistoryFragment extends BaseListHistoryFragment {
    public static BaseListHistoryFragment newInstance() {
        return new BandHrvHistoryFragment();
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected BaseQuickAdapter getHistoryAdapter() {
        return new HrvHistoryAdapter(new HrvDaoProxy().getAll());
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected void onHistoryClicked(BaseQuickAdapter baseQuickAdapter, int i8) {
        start(BandHrvDetailFragment.newInstance(((Hrv) baseQuickAdapter.getData().get(i8)).getId().longValue()));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        s0.logPage(getClass(), "HRV_历史列表页");
    }
}
