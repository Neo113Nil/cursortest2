package com.crrepa.band.my.health.heartrate;

import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.BaseBandMeasureActivity;
import com.crrepa.band.my.health.base.e;
import com.crrepa.band.my.training.utils.p;
import com.moyoung.dafit.module.common.baseui.BaseFragement;

/* loaded from: classes2.dex */
public class BandActivieHeartRateActivity extends BaseBandMeasureActivity {
    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getMeasureButtonResource() {
        return R.drawable.shape_active_heart_rate_measure;
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected BaseFragement getRootFragment() {
        return BandActiveHeartRateStatisticsFragment.newInstance(-1L);
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getStartMeasureText() {
        return R.string.click_to_start_measure;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_training);
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getStopMeasureText() {
        return R.string.click_to_stop_measure;
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void initView() {
        setTitleContent(p.getTrainingHeartRateText());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        if (getTopFragment() instanceof BandActiveHeartRateStatisticsFragment) {
            finish();
        } else {
            setMenuVisible(true);
            super.onBackPressedSupport();
        }
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void onHistoryClick() {
        start(BandActiveHeartRateHistoryFragment.newInstance());
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected void startMeasure() {
        e.startMeasureActiveHeartRate();
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected void stopMeasure() {
        e.stopMeasureActiveHeartRate();
    }
}
