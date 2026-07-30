package com.crrepa.band.my.training;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.BaseBandStatisticsActivity;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes3.dex */
public class BandTrainingStatisticsActivity extends BaseBandStatisticsActivity {
    public static final int DEFAULT_TRAINING_TYPE = -1;
    private static final String TRAINING_TYPE = "training_type";

    private long getStartTime() {
        return getIntent().getLongExtra("statistics_id", -1L);
    }

    public static Intent getStatisticsCallingIntent(Context context, long j8, int i8) {
        Intent intent = new Intent(context, (Class<?>) BandTrainingStatisticsActivity.class);
        intent.putExtra("statistics_id", j8);
        intent.putExtra("training_type", i8);
        return intent;
    }

    private int getTrainingType() {
        return getIntent().getIntExtra("training_type", -1);
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected BaseFragement getRootFragment() {
        return BandTrainingStatisticsFragment.newInstance(getStartTime(), getTrainingType());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_training);
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void initView() {
        setTitleContent(R.string.training);
        setMenuVisible(false);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        if (getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            finish();
        } else if (getTopFragment() instanceof BandTrainingStatisticsFragment) {
            finish();
        } else {
            setMenuVisible(true);
            super.onBackPressedSupport();
        }
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity
    protected void onHistoryClick() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "锻炼详情");
    }
}
