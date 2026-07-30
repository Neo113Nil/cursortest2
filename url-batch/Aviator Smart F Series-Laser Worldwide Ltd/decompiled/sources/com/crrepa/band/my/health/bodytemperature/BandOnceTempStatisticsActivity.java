package com.crrepa.band.my.health.bodytemperature;

import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.d;
import com.crrepa.band.my.health.base.BaseBandMeasureActivity;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class BandOnceTempStatisticsActivity extends BaseBandMeasureActivity {
    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getMeasureButtonResource() {
        return R.drawable.shape_once_temp_measure;
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected BaseFragement getRootFragment() {
        return BandOnceTempStatistticsFragment.newInstance(getId());
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getStartMeasureText() {
        return R.string.click_to_start_measure;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_temperature);
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getStopMeasureText() {
        return R.string.click_to_stop_measure;
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void initView() {
        setTitleContent(R.string.temperature);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        if (getTopFragment() instanceof BandOnceTempStatistticsFragment) {
            finish();
        } else {
            setMenuVisible(true);
            super.onBackPressedSupport();
        }
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void onHistoryClick() {
        start(BandOnceTempHistoryFragment.newInstance());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        s0.logPage(getClass(), "体温详情页");
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected void startMeasure() {
        d.getInstance().startMeasureTemp();
        s0.logEvent("点击测量体温");
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected void stopMeasure() {
        d.getInstance().stopMeasureTemp();
    }
}
