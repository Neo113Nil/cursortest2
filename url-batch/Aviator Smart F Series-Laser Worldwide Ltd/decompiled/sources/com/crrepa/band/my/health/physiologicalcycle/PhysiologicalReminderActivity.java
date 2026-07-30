package com.crrepa.band.my.health.physiologicalcycle;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityPhysiologcalReminderBinding;
import com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class PhysiologicalReminderActivity extends BaseVBActivity<ActivityPhysiologcalReminderBinding> implements b, CompoundButton.OnCheckedChangeListener {
    private boolean isShowReminderTime;
    private final com.crrepa.band.my.health.physiologicalcycle.a physiologcalReminderPresenter = new com.crrepa.band.my.health.physiologicalcycle.a();

    class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            ((ActivityPhysiologcalReminderBinding) ((BaseVBActivity) PhysiologicalReminderActivity.this).binding).sbtnMenstrualReminder.setChecked(z7);
            ((ActivityPhysiologcalReminderBinding) ((BaseVBActivity) PhysiologicalReminderActivity.this).binding).sbtnOvulationReminder.setChecked(z7);
            ((ActivityPhysiologcalReminderBinding) ((BaseVBActivity) PhysiologicalReminderActivity.this).binding).sbtnOvulationDayReminder.setChecked(z7);
            ((ActivityPhysiologcalReminderBinding) ((BaseVBActivity) PhysiologicalReminderActivity.this).binding).sbtnEndOfOvulation.setChecked(z7);
        }
    }

    public static Intent getCallingIntent(Context context, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) PhysiologicalReminderActivity.class);
        intent.putExtra("show_reminder_time", z7);
        return intent;
    }

    private void initEnableAll() {
        boolean isChecked = ((ActivityPhysiologcalReminderBinding) this.binding).sbtnMenstrualReminder.isChecked();
        boolean isChecked2 = ((ActivityPhysiologcalReminderBinding) this.binding).sbtnOvulationReminder.isChecked();
        boolean isChecked3 = ((ActivityPhysiologcalReminderBinding) this.binding).sbtnOvulationDayReminder.isChecked();
        boolean isChecked4 = ((ActivityPhysiologcalReminderBinding) this.binding).sbtnEndOfOvulation.isChecked();
        if (isChecked && isChecked2 && isChecked3 && isChecked4) {
            ((ActivityPhysiologcalReminderBinding) this.binding).sbtnAll.setChecked(true);
        }
    }

    private void initSwitch() {
        ((ActivityPhysiologcalReminderBinding) this.binding).sbtnAll.setOnCheckedChangeListener(new a());
        ((ActivityPhysiologcalReminderBinding) this.binding).sbtnMenstrualReminder.setOnCheckedChangeListener(this);
        ((ActivityPhysiologcalReminderBinding) this.binding).sbtnOvulationReminder.setOnCheckedChangeListener(this);
        ((ActivityPhysiologcalReminderBinding) this.binding).sbtnOvulationDayReminder.setOnCheckedChangeListener(this);
        ((ActivityPhysiologcalReminderBinding) this.binding).sbtnEndOfOvulation.setOnCheckedChangeListener(this);
    }

    private void initView() {
        boolean booleanExtra = getIntent().getBooleanExtra("show_reminder_time", true);
        this.isShowReminderTime = booleanExtra;
        if (booleanExtra) {
            ((ActivityPhysiologcalReminderBinding) this.binding).rlReminderTime.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    private void savePhysiologicalReminder() {
        this.physiologcalReminderPresenter.savePhysiologcalReminder(((ActivityPhysiologcalReminderBinding) this.binding).sbtnMenstrualReminder.isChecked(), ((ActivityPhysiologcalReminderBinding) this.binding).sbtnOvulationReminder.isChecked(), ((ActivityPhysiologcalReminderBinding) this.binding).sbtnOvulationDayReminder.isChecked(), ((ActivityPhysiologcalReminderBinding) this.binding).sbtnEndOfOvulation.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: savePhysiologicalReminderTime, reason: merged with bridge method [inline-methods] */
    public void lambda$renderReminderTimeDialog$1(int i8, int i9) {
        this.physiologcalReminderPresenter.savePhysiologicalReminderTime(i8, i9);
    }

    private void setHourMinuteTime(int i8, int i9, TextView textView) {
        Calendar calendar = com.moyoung.dafit.module.common.utils.k.getCalendar();
        calendar.set(11, i8);
        calendar.set(12, i9);
        textView.setText(BandTimeSystemProvider.is12HourTime() ? com.moyoung.dafit.module.common.utils.m.format(calendar.getTime(), getString(R.string.hour_minute_format_12)) : com.moyoung.dafit.module.common.utils.m.format(calendar.getTime(), getString(R.string.hour_minute_24_format)));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.color_physiological_title_bg));
        initView();
        initSwitch();
        this.physiologcalReminderPresenter.setView(this);
        this.physiologcalReminderPresenter.getPhysiologcalReminder();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityPhysiologcalReminderBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalReminderActivity.this.lambda$initOnClickListener$0(view);
            }
        });
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
        boolean isChecked = ((ActivityPhysiologcalReminderBinding) this.binding).sbtnMenstrualReminder.isChecked();
        boolean isChecked2 = ((ActivityPhysiologcalReminderBinding) this.binding).sbtnOvulationReminder.isChecked();
        boolean isChecked3 = ((ActivityPhysiologcalReminderBinding) this.binding).sbtnOvulationDayReminder.isChecked();
        boolean isChecked4 = ((ActivityPhysiologcalReminderBinding) this.binding).sbtnEndOfOvulation.isChecked();
        if (isChecked && isChecked2 && isChecked3 && isChecked4) {
            ((ActivityPhysiologcalReminderBinding) this.binding).sbtnAll.setChecked(true);
        } else {
            if (isChecked || isChecked2 || isChecked3 || isChecked4) {
                return;
            }
            ((ActivityPhysiologcalReminderBinding) this.binding).sbtnAll.setChecked(false);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        savePhysiologicalReminder();
        this.physiologcalReminderPresenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.physiologcalReminderPresenter.pause();
    }

    public void onReminderTimeClicked(View view) {
        this.physiologcalReminderPresenter.selectPhysiologicalReminderTime();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.physiologcalReminderPresenter.resume();
        initEnableAll();
        s0.logPage(getClass(), "生理周期-导航页");
    }

    @Override // com.crrepa.band.my.health.physiologicalcycle.b
    public void renderEndOfOvulatio(boolean z7) {
        ((ActivityPhysiologcalReminderBinding) this.binding).sbtnEndOfOvulation.setCheckedNoEvent(z7);
    }

    @Override // com.crrepa.band.my.health.physiologicalcycle.b
    public void renderMenstrualReminder(boolean z7) {
        ((ActivityPhysiologcalReminderBinding) this.binding).sbtnMenstrualReminder.setCheckedNoEvent(z7);
    }

    @Override // com.crrepa.band.my.health.physiologicalcycle.b
    public void renderOvulationDayReminder(boolean z7) {
        ((ActivityPhysiologcalReminderBinding) this.binding).sbtnOvulationDayReminder.setCheckedNoEvent(z7);
    }

    @Override // com.crrepa.band.my.health.physiologicalcycle.b
    public void renderOvulationReminder(boolean z7) {
        ((ActivityPhysiologcalReminderBinding) this.binding).sbtnOvulationReminder.setCheckedNoEvent(z7);
    }

    @Override // com.crrepa.band.my.health.physiologicalcycle.b
    public void renderReminderTime(int i8, int i9) {
        setHourMinuteTime(i8, i9, ((ActivityPhysiologcalReminderBinding) this.binding).tvReminderTime);
    }

    @Override // com.crrepa.band.my.health.physiologicalcycle.b
    public void renderReminderTimeDialog(int i8, int i9) {
        new TimeSelectDialog(this).setSelectedTimePosition(i8, i9).setOnDoneClickListener(new TimeSelectDialog.a() { // from class: com.crrepa.band.my.health.physiologicalcycle.p
            @Override // com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog.a
            public final void onClick(int i10, int i11) {
                PhysiologicalReminderActivity.this.lambda$renderReminderTimeDialog$1(i10, i11);
            }
        }).show();
    }
}
