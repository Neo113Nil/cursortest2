package com.crrepa.band.my.device.setting.periodchoose;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityPeriodChooceBinding;
import com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class PeriodChooceActivity extends BaseVBActivity<ActivityPeriodChooceBinding> implements h {
    private static final String PERIOD_TYPE = "period_type";
    private TimeSelectDialog endTimeDialog;
    private int endTimeHour;
    private int endTimeMinute;
    private final g periodChoocePresenter = new g();
    private TimeSelectDialog startTimeDialog;
    private int startTimeHour;
    private int startTimeMinute;

    private static Intent getCallingIntent(Context context, int i8) {
        Intent intent = new Intent(context, (Class<?>) PeriodChooceActivity.class);
        intent.putExtra(PERIOD_TYPE, i8);
        return intent;
    }

    public static Intent getDoNotDisturbCallingIntent(Context context) {
        return getCallingIntent(context, 1);
    }

    private int getPeriodType() {
        return getIntent().getIntExtra(PERIOD_TYPE, -1);
    }

    public static Intent getQuickViewCallingIntent(Context context) {
        return getCallingIntent(context, 2);
    }

    private void initTimeSelectDialog() {
        this.startTimeDialog = new TimeSelectDialog(this).setSelectedTimePosition(this.startTimeHour, this.startTimeMinute).setLimitDate(i3.a.getTimeDate(this.endTimeHour, this.endTimeMinute), false).setOnDoneClickListener(new TimeSelectDialog.a() { // from class: com.crrepa.band.my.device.setting.periodchoose.e
            @Override // com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog.a
            public final void onClick(int i8, int i9) {
                PeriodChooceActivity.this.lambda$initTimeSelectDialog$4(i8, i9);
            }
        });
        this.endTimeDialog = new TimeSelectDialog(this).setSelectedTimePosition(this.endTimeHour, this.endTimeMinute).setLimitDate(i3.a.getTimeDate(this.startTimeHour, this.startTimeMinute), true).setOnDoneClickListener(new TimeSelectDialog.a() { // from class: com.crrepa.band.my.device.setting.periodchoose.f
            @Override // com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog.a
            public final void onClick(int i8, int i9) {
                PeriodChooceActivity.this.lambda$initTimeSelectDialog$5(i8, i9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        this.periodChoocePresenter.sendBandPeriodTimeInfo(getPeriodType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        this.startTimeDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        this.endTimeDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTimeSelectDialog$4(int i8, int i9) {
        setPeriodTime(17, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTimeSelectDialog$5(int i8, int i9) {
        setPeriodTime(18, i8, i9);
    }

    private void loadPeriodTime(int i8) {
        this.periodChoocePresenter.loadPeriodTime(i8);
    }

    private void setPeriodTime(int i8, int i9, int i10) {
        if (i8 == 17) {
            this.periodChoocePresenter.setPeriodStartTime(i9, i10);
            renderStartTime(i9, i10);
        } else if (i8 == 18) {
            this.periodChoocePresenter.setPeriodEndTime(i9, i10);
            renderEndTime(i9, i10);
        }
    }

    private void setTitleBar(int i8) {
        if (i8 == 1) {
            ((ActivityPeriodChooceBinding) this.binding).tvTitle.setText(R.string.do_not_disturb);
        } else if (i8 == 2) {
            ((ActivityPeriodChooceBinding) this.binding).tvTitle.setText(R.string.quick_view_period);
        }
    }

    @Override // com.crrepa.band.my.device.setting.periodchoose.h
    public void hideDoNotDistrubHint() {
        ((ActivityPeriodChooceBinding) this.binding).tvDoNotDisturbHint.setVisibility(8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.periodChoocePresenter.setView(this);
        ((ActivityPeriodChooceBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.setting.periodchoose.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeriodChooceActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityPeriodChooceBinding) this.binding).tvSave.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.setting.periodchoose.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeriodChooceActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityPeriodChooceBinding) this.binding).startTime.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.setting.periodchoose.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeriodChooceActivity.this.lambda$initBinding$2(view);
            }
        });
        ((ActivityPeriodChooceBinding) this.binding).endTime.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.setting.periodchoose.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PeriodChooceActivity.this.lambda$initBinding$3(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        int periodType = getPeriodType();
        setTitleBar(periodType);
        loadPeriodTime(periodType);
        initTimeSelectDialog();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.periodChoocePresenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.periodChoocePresenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.periodChoocePresenter.resume();
        int periodType = getPeriodType();
        if (periodType == 1) {
            s0.logPage(getClass(), "勿扰模式");
        } else if (periodType == 2) {
            s0.logPage(getClass(), "翻腕量屏_生效时段");
        }
    }

    @Override // com.crrepa.band.my.device.setting.periodchoose.h
    public void quickViewPeriodCrossDays() {
        r0.showShort(this, getString(R.string.quick_view_cross_days));
    }

    @Override // com.crrepa.band.my.device.setting.periodchoose.h
    public void renderEndTime(int i8, int i9) {
        this.endTimeHour = i8;
        this.endTimeMinute = i9;
        ((ActivityPeriodChooceBinding) this.binding).tvEndTime.setText(m3.a.formatPeriodTime(this, i8, i9));
    }

    @Override // com.crrepa.band.my.device.setting.periodchoose.h
    public void renderStartTime(int i8, int i9) {
        this.startTimeHour = i8;
        this.startTimeMinute = i9;
        ((ActivityPeriodChooceBinding) this.binding).tvStartTime.setText(m3.a.formatPeriodTime(this, i8, i9));
    }

    @Override // com.crrepa.band.my.device.setting.periodchoose.h
    public void saveFail() {
        r0.showShort(this, getString(R.string.band_setting_send_fail));
    }

    @Override // com.crrepa.band.my.device.setting.periodchoose.h
    public void saveSuccess() {
        finish();
    }
}
