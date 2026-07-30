package com.crrepa.band.my.health.bloodpressure;

import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.BaseBandMeasureActivity;
import com.crrepa.band.my.health.base.e;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class BandBpStatisticsActivity extends BaseBandMeasureActivity {
    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getMeasureButtonResource() {
        return R.drawable.shape_blood_pressure_measure;
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected BaseFragement getRootFragment() {
        return BandBloodPressureStatisticsFragment.newInstance(-1L);
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getStartMeasureText() {
        return R.string.click_to_start_measure;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_blood_pressure);
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getStopMeasureText() {
        return R.string.click_to_stop_measure;
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void initView() {
        setTitleContent(R.string.blood_pressure);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        if (getTopFragment() instanceof BandBloodPressureStatisticsFragment) {
            finish();
        } else {
            setMenuVisible(true);
            super.onBackPressedSupport();
        }
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void onHistoryClick() {
        start(BandBloodPressureHistoryFragment.newInstance());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        s0.logPage(getClass(), "血压详情页");
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected void startMeasure() {
        e.startMeasureBp();
        s0.logEvent("点击测量血压");
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected void stopMeasure() {
        e.stopMeasureBp();
    }
}
