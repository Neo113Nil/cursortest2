package com.crrepa.band.my.health.ecg;

import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.BaseBandStatisticsActivity;
import com.crrepa.band.my.model.db.Ecg;
import com.crrepa.band.my.model.db.proxy.EcgDaoProxy;
import com.moyoung.dafit.module.common.baseui.BaseFragement;

/* loaded from: classes2.dex */
public class BandEcgStatisticsActivity extends BaseBandStatisticsActivity {
    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected BaseFragement getRootFragment() {
        Ecg lastTimeEcg = new EcgDaoProxy().getLastTimeEcg();
        return lastTimeEcg == null ? BandEcgStartMeasureFragment.newInstance() : BandEcgStatisticsFragment.newInstance(lastTimeEcg.getId().longValue());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_ecg);
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void initView() {
        setTitleContent(R.string.ecg_measure);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        if (getTopFragment() instanceof BandEcgStatisticsFragment) {
            finish();
        } else {
            setMenuVisible(true);
            super.onBackPressedSupport();
        }
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void onHistoryClick() {
        start(BandEcgHistoryFragment.newInstance());
    }
}
