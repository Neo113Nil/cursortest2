package com.crrepa.band.my.profile.goalsetting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityGoalSettingBinding;
import com.crrepa.band.my.databinding.BandDataAppbarBinding;
import com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker;
import com.crrepa.band.my.model.NumberPickerModel;
import com.crrepa.band.my.model.db.GoalsSetting;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class GoalsSettingActivity extends BaseActivity implements i {
    private ActivityGoalSettingBinding binding;
    private final h presenter = new h();

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) GoalsSettingActivity.class);
    }

    private int getTrainingDays() {
        int pow = this.binding.cbSunday.isChecked() ? (int) (0 + Math.pow(2.0d, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON)) : 0;
        if (this.binding.cbMonday.isChecked()) {
            pow = (int) (pow + Math.pow(2.0d, 1.0d));
        }
        if (this.binding.cbTuesday.isChecked()) {
            pow = (int) (pow + Math.pow(2.0d, 2.0d));
        }
        if (this.binding.cbWednesday.isChecked()) {
            pow = (int) (pow + Math.pow(2.0d, 3.0d));
        }
        if (this.binding.cbThursday.isChecked()) {
            pow = (int) (pow + Math.pow(2.0d, 4.0d));
        }
        if (this.binding.cbFriday.isChecked()) {
            pow = (int) (pow + Math.pow(2.0d, 5.0d));
        }
        return this.binding.cbSaturday.isChecked() ? (int) (pow + Math.pow(2.0d, 6.0d)) : pow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrainingGoalsListener$1(CompoundButton compoundButton, boolean z7) {
        setTrainingDayLayoutVisible(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrainingGoalsListener$2(MyWheelPicker myWheelPicker, Object obj, int i8) {
        updateGoalTrainingMinute(Integer.parseInt(obj.toString()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrainingGoalsListener$3(MyWheelPicker myWheelPicker, Object obj, int i8) {
        updateGoalTrainingMinute(Integer.parseInt(obj.toString()), false);
    }

    private void saveGoalsSetting() {
        GoalsSetting goalsSetting = new GoalsSetting();
        goalsSetting.setDailySteps(Integer.valueOf(this.binding.viewDailyGoalsSetting.wpDailySteps.getSelectNumber()));
        goalsSetting.setDailyCalories(Integer.valueOf(this.binding.viewDailyGoalsSetting.wpDailyCalories.getSelectNumber()));
        goalsSetting.setDailyMinutes(Integer.valueOf((this.binding.viewDailyGoalsSetting.wpDailyTrainingHour.getSelectNumber() * 60) + this.binding.viewDailyGoalsSetting.wpDailyTrainingMin.getSelectNumber()));
        goalsSetting.setTrainingSteps(Integer.valueOf(this.binding.viewTrainingGoalsSetting.wpTrainingSteps.getSelectNumber()));
        goalsSetting.setTrainingCalories(Integer.valueOf(this.binding.viewTrainingGoalsSetting.wpTrainingCalories.getSelectNumber()));
        goalsSetting.setTrainingMinutes(Integer.valueOf((this.binding.viewTrainingGoalsSetting.wpTrainingHour.getSelectNumber() * 60) + this.binding.viewTrainingGoalsSetting.wpTrainingMin.getSelectNumber()));
        goalsSetting.setTrainingDayEnable(Boolean.valueOf(this.binding.sbtnTrainingDay.isChecked()));
        goalsSetting.setTrainingDays(Integer.valueOf(getTrainingDays()));
        this.presenter.saveDailyGoals(this, goalsSetting);
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(this.binding.titleBar.appbar);
        BandDataAppbarBinding bandDataAppbarBinding = this.binding.titleBar;
        bVar.addTitleScrollEvent(bandDataAppbarBinding.tvTitle, bandDataAppbarBinding.tvExpandedTitle);
        setSupportActionBar(this.binding.titleBar.toolbar);
    }

    private void setTitle() {
        this.binding.titleBar.tvTitle.setText(R.string.goal_setting_title);
        this.binding.titleBar.tvExpandedTitle.setText(R.string.goal_setting_title);
        this.binding.titleBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    private void setTrainingDayLayoutVisible(boolean z7) {
        if (z7) {
            this.binding.llTrainingDays.setVisibility(0);
        } else {
            this.binding.llTrainingDays.setVisibility(8);
        }
    }

    private void setTrainingGoalsListener() {
        this.binding.sbtnTrainingDay.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.profile.goalsetting.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                GoalsSettingActivity.this.lambda$setTrainingGoalsListener$1(compoundButton, z7);
            }
        });
        this.binding.viewDailyGoalsSetting.wpDailyTrainingHour.setOnItemSelectedListener(new MyWheelPicker.a() { // from class: com.crrepa.band.my.profile.goalsetting.f
            @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.a
            public final void onItemSelected(MyWheelPicker myWheelPicker, Object obj, int i8) {
                GoalsSettingActivity.this.lambda$setTrainingGoalsListener$2(myWheelPicker, obj, i8);
            }
        });
        this.binding.viewTrainingGoalsSetting.wpTrainingHour.setOnItemSelectedListener(new MyWheelPicker.a() { // from class: com.crrepa.band.my.profile.goalsetting.g
            @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.a
            public final void onItemSelected(MyWheelPicker myWheelPicker, Object obj, int i8) {
                GoalsSettingActivity.this.lambda$setTrainingGoalsListener$3(myWheelPicker, obj, i8);
            }
        });
    }

    private void updateGoalTrainingMinute(int i8, boolean z7) {
        this.presenter.updateGoalTrainingMinute(i8, z7 ? this.binding.viewDailyGoalsSetting.wpDailyTrainingMin.getSelectNumber() : this.binding.viewTrainingGoalsSetting.wpTrainingMin.getSelectNumber(), z7);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityGoalSettingBinding inflate = ActivityGoalSettingBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.presenter.setView(this);
        setActionBar();
        setTitle();
        setTrainingGoalsListener();
        this.presenter.getGoalsSettingList();
        this.binding.titleBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.goalsetting.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalsSettingActivity.this.lambda$onCreate$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        saveGoalsSetting();
        this.presenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        s0.logPage(getClass(), "目标设置");
    }

    @Override // com.crrepa.band.my.profile.goalsetting.i
    public void renderGoalCalories(NumberPickerModel numberPickerModel, int i8) {
        this.binding.viewDailyGoalsSetting.wpDailyCalories.setData(numberPickerModel.getMin(), numberPickerModel.getMax(), numberPickerModel.getUnit(), i8);
    }

    @Override // com.crrepa.band.my.profile.goalsetting.i
    public void renderGoalSteps(NumberPickerModel numberPickerModel, int i8) {
        this.binding.viewDailyGoalsSetting.wpDailySteps.setData(numberPickerModel.getMin(), numberPickerModel.getMax(), numberPickerModel.getUnit(), i8);
    }

    @Override // com.crrepa.band.my.profile.goalsetting.i
    public void renderGoalTrainingHour(NumberPickerModel numberPickerModel, int i8) {
        this.binding.viewDailyGoalsSetting.wpDailyTrainingHour.setData(numberPickerModel.getMin(), numberPickerModel.getMax(), numberPickerModel.getUnit(), i8);
    }

    @Override // com.crrepa.band.my.profile.goalsetting.i
    public void renderGoalTrainingMinute(NumberPickerModel numberPickerModel, int i8) {
        this.binding.viewDailyGoalsSetting.wpDailyTrainingMin.setData(numberPickerModel.getMin(), numberPickerModel.getMax(), numberPickerModel.getUnit(), i8);
    }

    @Override // com.crrepa.band.my.profile.goalsetting.i
    public void renderTrainingDay(boolean[] zArr) {
        for (int i8 = 0; i8 < zArr.length; i8++) {
            boolean z7 = zArr[i8];
            switch (i8) {
                case 0:
                    this.binding.cbSunday.setChecked(z7);
                    break;
                case 1:
                    this.binding.cbMonday.setChecked(z7);
                    break;
                case 2:
                    this.binding.cbTuesday.setChecked(z7);
                    break;
                case 3:
                    this.binding.cbWednesday.setChecked(z7);
                    break;
                case 4:
                    this.binding.cbThursday.setChecked(z7);
                    break;
                case 5:
                    this.binding.cbFriday.setChecked(z7);
                    break;
                case 6:
                    this.binding.cbSaturday.setChecked(z7);
                    break;
            }
        }
    }

    @Override // com.crrepa.band.my.profile.goalsetting.i
    public void renderTrainingGoalCalories(NumberPickerModel numberPickerModel, int i8) {
        this.binding.viewTrainingGoalsSetting.wpTrainingCalories.setData(numberPickerModel.getMin(), numberPickerModel.getMax(), numberPickerModel.getUnit(), i8);
    }

    @Override // com.crrepa.band.my.profile.goalsetting.i
    public void renderTrainingGoalSteps(NumberPickerModel numberPickerModel, int i8) {
        this.binding.viewTrainingGoalsSetting.wpTrainingSteps.setData(numberPickerModel.getMin(), numberPickerModel.getMax(), numberPickerModel.getUnit(), i8);
    }

    @Override // com.crrepa.band.my.profile.goalsetting.i
    public void renderTrainingGoalTrainingHour(NumberPickerModel numberPickerModel, int i8) {
        this.binding.viewTrainingGoalsSetting.wpTrainingHour.setData(numberPickerModel.getMin(), numberPickerModel.getMax(), numberPickerModel.getUnit(), i8);
    }

    @Override // com.crrepa.band.my.profile.goalsetting.i
    public void renderTrainingGoalTrainingMinute(NumberPickerModel numberPickerModel, int i8) {
        this.binding.viewTrainingGoalsSetting.wpTrainingMin.setData(numberPickerModel.getMin(), numberPickerModel.getMax(), numberPickerModel.getUnit(), i8);
    }

    @Override // com.crrepa.band.my.profile.goalsetting.i
    public void renderTrainingGoalsState(boolean z7) {
        this.binding.sbtnTrainingDay.setCheckedNoEvent(z7);
        setTrainingDayLayoutVisible(z7);
    }
}
