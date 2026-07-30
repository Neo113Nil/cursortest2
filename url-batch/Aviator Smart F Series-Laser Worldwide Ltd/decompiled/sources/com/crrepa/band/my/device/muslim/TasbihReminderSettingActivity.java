package com.crrepa.band.my.device.muslim;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.view.View;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityTasbihReminderSettingBinding;
import com.crrepa.band.my.device.muslim.model.BandMuslimTasbihChangeEvent;
import com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog;
import com.crrepa.band.my.health.widgets.dialog.v;
import com.crrepa.ble.conn.bean.CRPMuslimTasbihSettingInfo;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class TasbihReminderSettingActivity extends BaseVBActivity<ActivityTasbihReminderSettingBinding> {
    private static final int HAlF_MINUTE_NUMBER = 30;
    private static final int MINUTE_NUMBER = 60;
    private TimeSelectDialog endTimeDialog;
    private int endTimeHour;
    private int endTimeMinute;
    private int intervalTime;
    private boolean isRenderWeekDateState;
    private TimeSelectDialog startTimeDialog;
    private int startTimeHour;
    private int startTimeMinute;
    private boolean[] weekDateStateArray;

    private void changeLayout(boolean z7) {
        ((ActivityTasbihReminderSettingBinding) this.binding).clTasbihSetting.setBackground(ContextCompat.getDrawable(this, z7 ? R.color.color_assist_3 : R.color.white));
        ((ActivityTasbihReminderSettingBinding) this.binding).viewSplit.setVisibility(z7 ? 8 : 0);
    }

    private CRPMuslimTasbihSettingInfo getCurrentTasbihSettingInfo() {
        CRPMuslimTasbihSettingInfo cRPMuslimTasbihSettingInfo = new CRPMuslimTasbihSettingInfo();
        cRPMuslimTasbihSettingInfo.setEnable(((ActivityTasbihReminderSettingBinding) this.binding).sbtnTasbihReminder.isChecked());
        cRPMuslimTasbihSettingInfo.setInterval((byte) this.intervalTime);
        cRPMuslimTasbihSettingInfo.setStartHour((byte) this.startTimeHour);
        cRPMuslimTasbihSettingInfo.setStartMinutes((byte) this.startTimeMinute);
        cRPMuslimTasbihSettingInfo.setEndHour((byte) this.endTimeHour);
        cRPMuslimTasbihSettingInfo.setEndMinutes((byte) this.endTimeMinute);
        cRPMuslimTasbihSettingInfo.setRepeatMode((byte) com.crrepa.band.my.device.muslim.utils.b.getInstance().getTasbihRepeatMode(getCurrentWeekDateStateArray()));
        return cRPMuslimTasbihSettingInfo;
    }

    private boolean[] getCurrentWeekDateStateArray() {
        return new boolean[]{((ActivityTasbihReminderSettingBinding) this.binding).cbSunday.isChecked(), ((ActivityTasbihReminderSettingBinding) this.binding).cbMonday.isChecked(), ((ActivityTasbihReminderSettingBinding) this.binding).cbTuesday.isChecked(), ((ActivityTasbihReminderSettingBinding) this.binding).cbWednesday.isChecked(), ((ActivityTasbihReminderSettingBinding) this.binding).cbThursday.isChecked(), ((ActivityTasbihReminderSettingBinding) this.binding).cbFriday.isChecked(), ((ActivityTasbihReminderSettingBinding) this.binding).cbSaturday.isChecked()};
    }

    private String getFormatTime(int i8) {
        if (i8 < 60) {
            return i8 + getString(R.string.muslim_tabih_interval_time_minute);
        }
        return (i8 / 60) + "hour";
    }

    private List<String> getTimeStringList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < 4; i8++) {
            if (i8 == 0) {
                arrayList.add(30 + getString(R.string.muslim_tabih_interval_time_minute));
            } else if (i8 == 1) {
                arrayList.add(i8 + getString(R.string.muslim_tabih_interval_time_hour));
            } else {
                arrayList.add(i8 + getString(R.string.muslim_tabih_interval_time_hours));
            }
        }
        return arrayList;
    }

    private void initListener() {
        ((ActivityTasbihReminderSettingBinding) this.binding).sbtnTasbihReminder.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.muslim.q0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                TasbihReminderSettingActivity.this.lambda$initListener$0(compoundButton, z7);
            }
        });
        ((ActivityTasbihReminderSettingBinding) this.binding).rlIntervalTime.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TasbihReminderSettingActivity.this.lambda$initListener$1(view);
            }
        });
        ((ActivityTasbihReminderSettingBinding) this.binding).rlReminderStartTime.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TasbihReminderSettingActivity.this.lambda$initListener$2(view);
            }
        });
        ((ActivityTasbihReminderSettingBinding) this.binding).rlReminderEndTime.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TasbihReminderSettingActivity.this.lambda$initListener$3(view);
            }
        });
        ((ActivityTasbihReminderSettingBinding) this.binding).cbMonday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.muslim.v0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                TasbihReminderSettingActivity.this.lambda$initListener$4(compoundButton, z7);
            }
        });
        ((ActivityTasbihReminderSettingBinding) this.binding).cbTuesday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.muslim.i0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                TasbihReminderSettingActivity.this.lambda$initListener$5(compoundButton, z7);
            }
        });
        ((ActivityTasbihReminderSettingBinding) this.binding).cbWednesday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.muslim.j0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                TasbihReminderSettingActivity.this.lambda$initListener$6(compoundButton, z7);
            }
        });
        ((ActivityTasbihReminderSettingBinding) this.binding).cbThursday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.muslim.k0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                TasbihReminderSettingActivity.this.lambda$initListener$7(compoundButton, z7);
            }
        });
        ((ActivityTasbihReminderSettingBinding) this.binding).cbFriday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.muslim.l0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                TasbihReminderSettingActivity.this.lambda$initListener$8(compoundButton, z7);
            }
        });
        ((ActivityTasbihReminderSettingBinding) this.binding).cbSaturday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.muslim.m0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                TasbihReminderSettingActivity.this.lambda$initListener$9(compoundButton, z7);
            }
        });
        ((ActivityTasbihReminderSettingBinding) this.binding).cbSunday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.muslim.r0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                TasbihReminderSettingActivity.this.lambda$initListener$10(compoundButton, z7);
            }
        });
    }

    private void initTimeSelectDialog() {
        this.startTimeDialog = new TimeSelectDialog(this).setSelectedTimePosition(this.startTimeHour, this.startTimeMinute).setLimitDate(i3.a.getTimeDate(this.endTimeHour, this.endTimeMinute), false).setOnDoneClickListener(new TimeSelectDialog.a() { // from class: com.crrepa.band.my.device.muslim.n0
            @Override // com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog.a
            public final void onClick(int i8, int i9) {
                TasbihReminderSettingActivity.this.lambda$initTimeSelectDialog$12(i8, i9);
            }
        });
        TimeSelectDialog onDoneClickListener = new TimeSelectDialog(this).setSelectedTimePosition(this.endTimeHour, this.endTimeMinute).setLimitDate(i3.a.getTimeDate(this.startTimeHour, this.startTimeMinute), true).setOnDoneClickListener(new TimeSelectDialog.a() { // from class: com.crrepa.band.my.device.muslim.o0
            @Override // com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog.a
            public final void onClick(int i8, int i9) {
                TasbihReminderSettingActivity.this.lambda$initTimeSelectDialog$13(i8, i9);
            }
        });
        this.endTimeDialog = onDoneClickListener;
        this.startTimeDialog.setOtherTimeSelectDialog(onDoneClickListener);
        this.endTimeDialog.setOtherTimeSelectDialog(this.startTimeDialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(CompoundButton compoundButton, boolean z7) {
        if (!z7) {
            this.weekDateStateArray = getCurrentWeekDateStateArray();
        }
        changeLayout(z7);
        renderReminderState(z7);
        com.crrepa.band.my.device.muslim.utils.b.getInstance().sendMuslimTasbihSetting(getCurrentTasbihSettingInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        showIntervalTimeChooseDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$10(CompoundButton compoundButton, boolean z7) {
        ((ActivityTasbihReminderSettingBinding) this.binding).cbSunday.setTypeface(z7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        updateWatchRepeatMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(View view) {
        this.startTimeDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$3(View view) {
        this.endTimeDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$4(CompoundButton compoundButton, boolean z7) {
        ((ActivityTasbihReminderSettingBinding) this.binding).cbMonday.setTypeface(z7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        updateWatchRepeatMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$5(CompoundButton compoundButton, boolean z7) {
        ((ActivityTasbihReminderSettingBinding) this.binding).cbTuesday.setTypeface(z7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        updateWatchRepeatMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$6(CompoundButton compoundButton, boolean z7) {
        ((ActivityTasbihReminderSettingBinding) this.binding).cbWednesday.setTypeface(z7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        updateWatchRepeatMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$7(CompoundButton compoundButton, boolean z7) {
        ((ActivityTasbihReminderSettingBinding) this.binding).cbThursday.setTypeface(z7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        updateWatchRepeatMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$8(CompoundButton compoundButton, boolean z7) {
        ((ActivityTasbihReminderSettingBinding) this.binding).cbFriday.setTypeface(z7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        updateWatchRepeatMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$9(CompoundButton compoundButton, boolean z7) {
        ((ActivityTasbihReminderSettingBinding) this.binding).cbSaturday.setTypeface(z7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        updateWatchRepeatMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTimeSelectDialog$12(int i8, int i9) {
        setPeriodTime(17, i8, i9);
        com.crrepa.band.my.device.muslim.utils.b.getInstance().sendMuslimTasbihSetting(getCurrentTasbihSettingInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTimeSelectDialog$13(int i8, int i9) {
        setPeriodTime(18, i8, i9);
        com.crrepa.band.my.device.muslim.utils.b.getInstance().sendMuslimTasbihSetting(getCurrentTasbihSettingInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSupportActionBar$11(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showIntervalTimeChooseDialog$14(int i8) {
        renderIntervalTime(i8 == 0 ? 30 : i8 * 60);
        com.crrepa.band.my.device.muslim.utils.b.getInstance().sendMuslimTasbihSetting(getCurrentTasbihSettingInfo());
    }

    @SuppressLint({"SetTextI18n"})
    private void renderIntervalTime(int i8) {
        this.intervalTime = i8;
        if (i8 < 60) {
            ((ActivityTasbihReminderSettingBinding) this.binding).tvIntervalTime.setText(i8 + getString(R.string.muslim_tabih_interval_time_minute));
            return;
        }
        if (i8 == 60) {
            ((ActivityTasbihReminderSettingBinding) this.binding).tvIntervalTime.setText(1 + getString(R.string.muslim_tabih_interval_time_hour));
            return;
        }
        ((ActivityTasbihReminderSettingBinding) this.binding).tvIntervalTime.setText((this.intervalTime / 60) + getString(R.string.muslim_tabih_interval_time_hours));
    }

    private void renderReminderState() {
        this.weekDateStateArray = com.crrepa.band.my.device.muslim.utils.c.getTasbihWeekDateStateArray(false);
        this.intervalTime = com.crrepa.band.my.device.muslim.utils.c.getTasbihIntervalTime();
        int[] tasbihStartTime = com.crrepa.band.my.device.muslim.utils.c.getTasbihStartTime();
        this.startTimeHour = tasbihStartTime[0];
        this.startTimeMinute = tasbihStartTime[1];
        int[] tasbihEndTime = com.crrepa.band.my.device.muslim.utils.c.getTasbihEndTime();
        this.endTimeHour = tasbihEndTime[0];
        this.endTimeMinute = tasbihEndTime[1];
        boolean tasbihSwitchState = com.crrepa.band.my.device.muslim.utils.c.getTasbihSwitchState();
        renderReminderState(tasbihSwitchState);
        ((ActivityTasbihReminderSettingBinding) this.binding).sbtnTasbihReminder.setCheckedNoEvent(tasbihSwitchState);
        changeLayout(tasbihSwitchState);
    }

    private void renderWeekDateState(boolean[] zArr) {
        this.isRenderWeekDateState = true;
        for (int i8 = 0; i8 < zArr.length; i8++) {
            boolean z7 = zArr[i8];
            switch (i8) {
                case 0:
                    ((ActivityTasbihReminderSettingBinding) this.binding).cbSunday.setChecked(z7);
                    break;
                case 1:
                    ((ActivityTasbihReminderSettingBinding) this.binding).cbMonday.setChecked(z7);
                    break;
                case 2:
                    ((ActivityTasbihReminderSettingBinding) this.binding).cbTuesday.setChecked(z7);
                    break;
                case 3:
                    ((ActivityTasbihReminderSettingBinding) this.binding).cbWednesday.setChecked(z7);
                    break;
                case 4:
                    ((ActivityTasbihReminderSettingBinding) this.binding).cbThursday.setChecked(z7);
                    break;
                case 5:
                    ((ActivityTasbihReminderSettingBinding) this.binding).cbFriday.setChecked(z7);
                    break;
                case 6:
                    ((ActivityTasbihReminderSettingBinding) this.binding).cbSaturday.setChecked(z7);
                    break;
            }
        }
        this.isRenderWeekDateState = false;
    }

    private void saveTasbihData() {
        com.crrepa.band.my.device.muslim.utils.c.saveTasbihSwitchState(((ActivityTasbihReminderSettingBinding) this.binding).sbtnTasbihReminder.isChecked());
        com.crrepa.band.my.device.muslim.utils.c.saveTasbihWeekDateStateArray(getCurrentWeekDateStateArray());
        com.crrepa.band.my.device.muslim.utils.c.saveTasbihIntervalTime(this.intervalTime);
        com.crrepa.band.my.device.muslim.utils.c.saveTasbihStartTime(this.startTimeHour, this.startTimeMinute);
        com.crrepa.band.my.device.muslim.utils.c.saveTasbihEndTime(this.endTimeHour, this.endTimeMinute);
    }

    private void setPeriodTime(int i8, int i9, int i10) {
        if (i8 == 17) {
            renderStartTime(i9, i10);
        } else if (i8 == 18) {
            renderEndTime(i9, i10);
        }
    }

    private void setSupportActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityTasbihReminderSettingBinding) this.binding).topBar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityTasbihReminderSettingBinding) vb).topBar.tvTitle, ((ActivityTasbihReminderSettingBinding) vb).topBar.tvExpandedTitle);
        setSupportActionBar(((ActivityTasbihReminderSettingBinding) this.binding).topBar.toolbar);
        ((ActivityTasbihReminderSettingBinding) this.binding).topBar.tvTitle.setText(R.string.muslim_tasbih_reminder_title);
        ((ActivityTasbihReminderSettingBinding) this.binding).topBar.tvExpandedTitle.setText(R.string.muslim_tasbih_reminder_title);
        ((ActivityTasbihReminderSettingBinding) this.binding).topBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityTasbihReminderSettingBinding) this.binding).topBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TasbihReminderSettingActivity.this.lambda$setSupportActionBar$11(view);
            }
        });
    }

    private void showIntervalTimeChooseDialog() {
        new com.crrepa.band.my.health.widgets.dialog.v(this).setPeriodStringList(getTimeStringList()).setSelectedPosition(this.intervalTime / 60).setCyclic(false).setOnDoneClickListener(new v.a() { // from class: com.crrepa.band.my.device.muslim.h0
            @Override // com.crrepa.band.my.health.widgets.dialog.v.a
            public final void onClick(int i8) {
                TasbihReminderSettingActivity.this.lambda$showIntervalTimeChooseDialog$14(i8);
            }
        }).show();
    }

    private void updateWatchRepeatMode() {
        if (this.isRenderWeekDateState) {
            return;
        }
        com.crrepa.band.my.device.muslim.utils.b.getInstance().sendMuslimTasbihSetting(getCurrentTasbihSettingInfo());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        com.moyoung.dafit.module.common.utils.k0.setColor(this, ContextCompat.getColor(this, R.color.white), 0);
        setSupportActionBar();
        initListener();
        renderReminderState();
        initTimeSelectDialog();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(BandMuslimTasbihChangeEvent bandMuslimTasbihChangeEvent) {
        renderReminderState();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        saveTasbihData();
        super.onPause();
    }

    public void renderEndTime(int i8, int i9) {
        this.endTimeHour = i8;
        this.endTimeMinute = i9;
        ((ActivityTasbihReminderSettingBinding) this.binding).tvEndTime.setText(com.moyoung.dafit.module.common.utils.m.formatTime(i8, i9, i3.a.getTimeFormat(this)));
    }

    public void renderStartTime(int i8, int i9) {
        this.startTimeHour = i8;
        this.startTimeMinute = i9;
        ((ActivityTasbihReminderSettingBinding) this.binding).tvStartTime.setText(com.moyoung.dafit.module.common.utils.m.formatTime(i8, i9, i3.a.getTimeFormat(this)));
    }

    private void renderReminderState(boolean z7) {
        if (z7) {
            ((ActivityTasbihReminderSettingBinding) this.binding).llConfigReminder.setVisibility(0);
            renderWeekDateState(this.weekDateStateArray);
            renderIntervalTime(this.intervalTime);
            renderStartTime(this.startTimeHour, this.startTimeMinute);
            renderEndTime(this.endTimeHour, this.endTimeMinute);
            return;
        }
        ((ActivityTasbihReminderSettingBinding) this.binding).llConfigReminder.setVisibility(8);
    }
}
