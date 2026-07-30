package com.crrepa.band.my.health.heartrate;

import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.BaseBandMeasureActivity;
import com.crrepa.band.my.health.base.e;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class BandOnceHeartRateStatisticsActivity extends BaseBandMeasureActivity {
    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getMeasureButtonResource() {
        return R.drawable.shape_heart_rate_measure;
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected BaseFragement getRootFragment() {
        return BandOnceHeartRateStatisticsFragment.newInstance(getId());
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getStartMeasureText() {
        return R.string.click_to_start_measure;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_heart_rate);
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getStopMeasureText() {
        return R.string.click_to_stop_measure;
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void initView() {
        setTitleContent(R.string.heart_rate);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        if (getTopFragment() instanceof BandOnceHeartRateStatisticsFragment) {
            finish();
        } else {
            setMenuVisible(true);
            super.onBackPressedSupport();
        }
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void onHistoryClick() {
        start(BandOnceHeartRateHistoryFragment.newInstance());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "心率详情页");
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected void startMeasure() {
        e.startMeasureOnceHeartRate();
        s0.logEvent("点击测量心率");
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected void stopMeasure() {
        e.stopMeasureOnceHeartRate();
    }
}
