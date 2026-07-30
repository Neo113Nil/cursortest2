package com.crrepa.band.my.health.bodytemperature;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.crrepa.band.my.health.base.BaseListHistoryFragment;
import com.crrepa.band.my.health.bodytemperature.adapter.OnceTempHistoryAdapter;
import com.crrepa.band.my.model.db.OnceTemp;
import com.crrepa.band.my.model.db.proxy.OnceTempDaoProxy;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class BandOnceTempHistoryFragment extends BaseListHistoryFragment {
    public static BandOnceTempHistoryFragment newInstance() {
        return new BandOnceTempHistoryFragment();
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected BaseQuickAdapter getHistoryAdapter() {
        return new OnceTempHistoryAdapter(getContext(), new OnceTempDaoProxy().getAll());
    }

    @Override // com.crrepa.band.my.health.base.BaseListHistoryFragment
    protected void onHistoryClicked(BaseQuickAdapter baseQuickAdapter, int i8) {
        start(BandOnceTempStatistticsFragment.newInstance(((OnceTemp) baseQuickAdapter.getData().get(i8)).getId().longValue()));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        s0.logPage(getClass(), "体温_单次历史记录");
    }
}
