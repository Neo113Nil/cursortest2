package com.crrepa.band.my.health.hrv;

import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.d;
import com.crrepa.band.my.health.base.BaseBandMeasureActivity;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class BandHrvStatisticsActivity extends BaseBandMeasureActivity {
    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getMeasureButtonResource() {
        return R.drawable.shape_hrv_measure_bg;
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected BaseFragement getRootFragment() {
        return BandHrvDetailFragment.newInstance(getId());
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getStartMeasureText() {
        return R.string.click_to_start_measure;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_hrv);
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected int getStopMeasureText() {
        return R.string.click_to_stop_measure;
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void initView() {
        setTitleContent(R.string.hrv_title);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        if (getTopFragment() instanceof BandHrvDetailFragment) {
            finish();
        } else {
            setMenuVisible(true);
            super.onBackPressedSupport();
        }
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void onHistoryClick() {
        start(BandHrvHistoryFragment.newInstance());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        s0.logPage(getClass(), "HRV详情页");
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected void startMeasure() {
        d.getInstance().startMeasureHrv();
        s0.logEvent("点击测量心率变异性");
    }

    @Override // com.crrepa.band.my.health.base.BaseBandMeasureActivity
    protected void stopMeasure() {
        d.getInstance().stopMeasureHrv();
    }
}
