package com.crrepa.band.my.health.bloodoxygen;

import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.base.BaseCalendarHistoryActivity;
import com.crrepa.band.my.health.base.h;
import com.crrepa.band.my.health.bloodoxygen.presenter.e;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.Date;

/* loaded from: classes2.dex */
public class BandTimingBloodOxygenHistoryActivity extends BaseCalendarHistoryActivity {
    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity
    protected int getActionBarBackground() {
        return R.color.color_blood_oxygen;
    }

    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity
    protected h getPresenter() {
        return new e();
    }

    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity
    protected void onDateClicked(Date date) {
        startActivity(BandTimingBloodOxygenActivity.getCallingIntent(this, date));
        finish();
    }

    @Override // com.crrepa.band.my.health.base.BaseCalendarHistoryActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        s0.logPage(getClass(), "血氧饱和度_日历列表页");
    }
}
