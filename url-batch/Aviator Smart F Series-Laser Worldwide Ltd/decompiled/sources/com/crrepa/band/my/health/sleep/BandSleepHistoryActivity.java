package com.crrepa.band.my.health.sleep;

import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.BaseCalendarHistoryActivity;
import com.crrepa.band.my.health.base.h;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.Date;

/* loaded from: classes2.dex */
public class BandSleepHistoryActivity extends BaseCalendarHistoryActivity {
    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity
    protected int getActionBarBackground() {
        return R.color.color_sleep;
    }

    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity
    protected h getPresenter() {
        return new com.crrepa.band.my.health.sleep.presenter.c();
    }

    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity
    protected void onDateClicked(Date date) {
        startActivity(BandSleepStatisticsActivity.getCallingIntent(this, date));
        finish();
    }

    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        s0.logPage(getClass(), "睡眠_日历列表页");
    }
}
