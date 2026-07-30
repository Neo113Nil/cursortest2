package com.crrepa.band.my.health.water;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityWaterSettingBinding;
import com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker;
import com.crrepa.band.my.health.base.inputpage.TextInputActivity;
import com.crrepa.band.my.health.water.model.WaterGoalChangeEvent;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.health.widgets.dialog.k0;
import com.crrepa.band.my.health.widgets.dialog.p;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.u0;
import java.util.Arrays;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class WaterSettingActivity extends BaseRequestPermissionVBActivity<ActivityWaterSettingBinding> implements g3.c {
    private final e3.d presenter = new e3.d();
    private final int[] startTimeArray = new int[3];
    private int autoGoalMl = 0;
    private int handGoalMl = 0;
    private final ActivityResultLauncher<Intent> startActivityLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.crrepa.band.my.health.water.h
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            WaterSettingActivity.this.lambda$new$10((ActivityResult) obj);
        }
    });

    private int getHour(int i8) {
        if (!this.presenter.is12HourTime()) {
            return i8;
        }
        if (this.startTimeArray[0] > 0) {
            if (i8 == 11) {
                return 12;
            }
            return i8 + 13;
        }
        if (i8 == 11) {
            return 0;
        }
        return i8 + 1;
    }

    private int getHourPosition(int i8) {
        if (!this.presenter.is12HourTime()) {
            return i8;
        }
        int i9 = i8 == 0 ? 11 : i8 - 1;
        return i9 < 12 ? i9 : i9 - 12;
    }

    private int getMaxValidData(int i8, int i9, int i10, int i11, int i12) {
        if (i8 == 1) {
            return ((1439 - i10) - (i12 * i11)) / 60;
        }
        if (i8 == 2) {
            return (1439 - (i9 * 60)) - (i12 * i11);
        }
        if (i8 == 3) {
            return ((1439 - (i9 * 60)) - i10) / i12;
        }
        if (i8 != 4) {
            return 0;
        }
        return ((1439 - (i9 * 60)) - i10) / i11;
    }

    private int getValidData(int i8, int i9) {
        int hour = i8 == 1 ? i9 : getHour(((ActivityWaterSettingBinding) this.binding).mpStartTimeHour.getSelectedItemPosition());
        int selectedItemPosition = i8 == 2 ? i9 : ((ActivityWaterSettingBinding) this.binding).mpStartTimeMinute.getSelectedItemPosition();
        int selectedItemPosition2 = i8 == 3 ? i9 : ((ActivityWaterSettingBinding) this.binding).mpReminderTimes.getSelectedItemPosition();
        int selectedItemPosition3 = ((i8 == 4 ? i9 : ((ActivityWaterSettingBinding) this.binding).mpIntervalTimeMins.getSelectedItemPosition()) * 10) + 10;
        if (isValidData(hour, selectedItemPosition, selectedItemPosition2, selectedItemPosition3)) {
            updatePickerPosition(i8, i9);
            return i9;
        }
        Toast.makeText(this, getString(R.string.water_setting_failed_toast), 0).show();
        if (i8 == 0) {
            int maxValidData = getMaxValidData(1, hour, 0, selectedItemPosition2, selectedItemPosition3);
            updatePickerPosition(1, maxValidData);
            updatePickerPosition(2, getMaxValidData(2, maxValidData, selectedItemPosition, selectedItemPosition2, selectedItemPosition3));
            int i10 = maxValidData > 12 ? 1 : 0;
            updatePickerPosition(i8, i10);
            return i10;
        }
        if (i8 == 1) {
            int maxValidData2 = getMaxValidData(1, hour, 0, selectedItemPosition2, selectedItemPosition3);
            updatePickerPosition(i8, maxValidData2);
            updatePickerPosition(2, getMaxValidData(2, maxValidData2, selectedItemPosition, selectedItemPosition2, selectedItemPosition3));
            return maxValidData2;
        }
        if (i8 == 2) {
            int maxValidData3 = getMaxValidData(2, hour, selectedItemPosition, selectedItemPosition2, selectedItemPosition3);
            updatePickerPosition(i8, maxValidData3);
            return maxValidData3;
        }
        if (i8 == 3) {
            int maxValidData4 = getMaxValidData(3, hour, selectedItemPosition, selectedItemPosition2, selectedItemPosition3);
            updatePickerPosition(i8, maxValidData4);
            return maxValidData4;
        }
        if (i8 != 4) {
            return i9;
        }
        int maxValidData5 = (getMaxValidData(4, hour, selectedItemPosition, selectedItemPosition2, selectedItemPosition3) - 10) / 10;
        updatePickerPosition(i8, maxValidData5);
        return maxValidData5;
    }

    private void initActionBar() {
        setSupportActionBar(((ActivityWaterSettingBinding) this.binding).waterSettingBar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        ((ActivityWaterSettingBinding) this.binding).waterSettingBar.toolbar.setNavigationIcon(R.drawable.selector_title_back);
        ((ActivityWaterSettingBinding) this.binding).waterSettingBar.toolbar.setBackgroundResource(R.color.white);
        ((ActivityWaterSettingBinding) this.binding).waterSettingBar.tvToolbarTitle.setTextColor(ContextCompat.getColor(this, R.color.black));
        ((ActivityWaterSettingBinding) this.binding).waterSettingBar.tvToolbarTitle.setText(getString(R.string.water_setting));
    }

    private void initListener() {
        ((ActivityWaterSettingBinding) this.binding).sbtnWaterIntakeReminder.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.health.water.j
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                WaterSettingActivity.this.lambda$initListener$0(compoundButton, z7);
            }
        });
        ((ActivityWaterSettingBinding) this.binding).mpStartTimeUnit.setOnItemSelectedListener(new MyWheelPicker.a() { // from class: com.crrepa.band.my.health.water.k
            @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.a
            public final void onItemSelected(MyWheelPicker myWheelPicker, Object obj, int i8) {
                WaterSettingActivity.this.lambda$initListener$1(myWheelPicker, obj, i8);
            }
        });
        ((ActivityWaterSettingBinding) this.binding).mpStartTimeHour.setOnItemSelectedListener(new MyWheelPicker.a() { // from class: com.crrepa.band.my.health.water.l
            @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.a
            public final void onItemSelected(MyWheelPicker myWheelPicker, Object obj, int i8) {
                WaterSettingActivity.this.lambda$initListener$2(myWheelPicker, obj, i8);
            }
        });
        ((ActivityWaterSettingBinding) this.binding).mpStartTimeMinute.setOnItemSelectedListener(new MyWheelPicker.a() { // from class: com.crrepa.band.my.health.water.m
            @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.a
            public final void onItemSelected(MyWheelPicker myWheelPicker, Object obj, int i8) {
                WaterSettingActivity.this.lambda$initListener$3(myWheelPicker, obj, i8);
            }
        });
        ((ActivityWaterSettingBinding) this.binding).mpReminderTimes.setOnItemSelectedListener(new MyWheelPicker.a() { // from class: com.crrepa.band.my.health.water.n
            @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.a
            public final void onItemSelected(MyWheelPicker myWheelPicker, Object obj, int i8) {
                WaterSettingActivity.this.lambda$initListener$4(myWheelPicker, obj, i8);
            }
        });
        ((ActivityWaterSettingBinding) this.binding).mpIntervalTimeMins.setOnItemSelectedListener(new MyWheelPicker.a() { // from class: com.crrepa.band.my.health.water.o
            @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.a
            public final void onItemSelected(MyWheelPicker myWheelPicker, Object obj, int i8) {
                WaterSettingActivity.this.lambda$initListener$5(myWheelPicker, obj, i8);
            }
        });
        ((ActivityWaterSettingBinding) this.binding).rlPromptTip.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.water.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WaterSettingActivity.this.lambda$initListener$6(view);
            }
        });
        ((ActivityWaterSettingBinding) this.binding).rlHandIntakeGoal.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.water.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WaterSettingActivity.this.lambda$initListener$8(view);
            }
        });
        ((ActivityWaterSettingBinding) this.binding).sbtnWaterCalculation.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.health.water.g
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                WaterSettingActivity.this.lambda$initListener$9(compoundButton, z7);
            }
        });
    }

    private void initView() {
        initActionBar();
        this.presenter.getSettingData(this);
    }

    private boolean isValidData(int i8, int i9, int i10, int i11) {
        return ((i8 * 60) + i9) + (i11 * i10) < 1440;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(CompoundButton compoundButton, boolean z7) {
        showHideReminder(z7);
        this.presenter.setOpenWaterReminder(z7, this);
        if (z7) {
            showNotificationDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(MyWheelPicker myWheelPicker, Object obj, int i8) {
        this.startTimeArray[0] = i8;
        getValidData(0, i8);
        this.presenter.saveStartTime(this.startTimeArray, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(MyWheelPicker myWheelPicker, Object obj, int i8) {
        int validData = getValidData(1, getHour(i8));
        if (!this.presenter.is12HourTime()) {
            this.startTimeArray[0] = i3.a.getHourType(validData);
        }
        this.presenter.saveStartTime(this.startTimeArray, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$3(MyWheelPicker myWheelPicker, Object obj, int i8) {
        getValidData(2, i8);
        this.presenter.saveStartTime(this.startTimeArray, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$4(MyWheelPicker myWheelPicker, Object obj, int i8) {
        this.presenter.saveReminderTimes(getValidData(3, i8) + 1, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$5(MyWheelPicker myWheelPicker, Object obj, int i8) {
        this.presenter.saveIntervalTime((getValidData(4, i8) * 10) + 10, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$6(View view) {
        this.startActivityLauncher.launch(TextInputActivity.getCallingIntent(this, ((ActivityWaterSettingBinding) this.binding).tvPromptTip.getText().toString(), getString(R.string.water_app_prompt_settings)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initListener$7(int i8) {
        int max = Math.max(WaterProvider.getMinGoal(), i8);
        WaterProvider.saveSettingGoal(max);
        com.crrepa.band.my.health.water.util.a.getInstance().updateGoal(BandUnitSystemProvider.getUnitSystem() == 0, max, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$8(View view) {
        new k0(this).setDefaultNum(WaterProvider.getSettingGoal()).setOnInputConfirmListener(new k0.a() { // from class: com.crrepa.band.my.health.water.i
            @Override // com.crrepa.band.my.health.widgets.dialog.k0.a
            public final void onInput(int i8) {
                WaterSettingActivity.lambda$initListener$7(i8);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$9(CompoundButton compoundButton, boolean z7) {
        WaterProvider.saveCalculationSwitchStatus(z7);
        showHideAutoCalculate(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$10(ActivityResult activityResult) {
        Intent data;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        String stringExtra = data.getStringExtra("input_type_water_prompt");
        showAppPromptSettings(stringExtra);
        this.presenter.saveAppPromptTip(stringExtra, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotificationDialog$11(boolean z7) {
        if (z7) {
            c0.jumpAppDetailsSetting(this);
        }
    }

    private void showNotificationDialog() {
        if (this.presenter.isNotificationEnable()) {
            return;
        }
        new com.crrepa.band.my.health.widgets.dialog.p(this).setOnSelectDoneListener(new p.a() { // from class: com.crrepa.band.my.health.water.f
            @Override // com.crrepa.band.my.health.widgets.dialog.p.a
            public final void onSelect(boolean z7) {
                WaterSettingActivity.this.lambda$showNotificationDialog$11(z7);
            }
        }).show();
    }

    private void updatePickerPosition(int i8, int i9) {
        if (i8 == 0) {
            ((ActivityWaterSettingBinding) this.binding).mpStartTimeUnit.setSelectedItemPosition(i9);
            int[] iArr = this.startTimeArray;
            iArr[0] = i9;
            iArr[1] = getHour(((ActivityWaterSettingBinding) this.binding).mpStartTimeHour.getSelectedItemPosition());
            return;
        }
        if (i8 == 1) {
            ((ActivityWaterSettingBinding) this.binding).mpStartTimeHour.setSelectedItemPosition(getHourPosition(i9));
            this.startTimeArray[1] = getHour(((ActivityWaterSettingBinding) this.binding).mpStartTimeHour.getSelectedItemPosition());
        } else if (i8 == 2) {
            ((ActivityWaterSettingBinding) this.binding).mpStartTimeMinute.setSelectedItemPosition(i9);
            this.startTimeArray[2] = i9;
        } else if (i8 == 3) {
            ((ActivityWaterSettingBinding) this.binding).mpReminderTimes.setSelectedItemPosition(i9);
        } else {
            if (i8 != 4) {
                return;
            }
            ((ActivityWaterSettingBinding) this.binding).mpIntervalTimeMins.setSelectedItemPosition(i9);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        this.presenter.setView(this);
        initView();
        initListener();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.setNotificationEnable(NotificationManagerCompat.from(this).areNotificationsEnabled());
        if (this.presenter.isOpenWaterReminder()) {
            showNotificationDialog();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.setNotificationEnable(NotificationManagerCompat.from(this).areNotificationsEnabled());
        if (this.presenter.is12HourTime() != BandTimeSystemProvider.is12HourTime()) {
            this.presenter.updateStartTime(this.startTimeArray);
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onWaterGoalChangeEvent(WaterGoalChangeEvent waterGoalChangeEvent) {
        showIntakeGoal(waterGoalChangeEvent.isAuto(), waterGoalChangeEvent.getGoal());
    }

    @Override // g3.c
    public void showAppPromptSettings(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getString(R.string.water_reminder_tip);
        }
        ((ActivityWaterSettingBinding) this.binding).tvPromptTip.setText(str);
    }

    @Override // g3.c
    public void showHideAutoCalculate(boolean z7) {
        com.orhanobut.logger.f.d("water ==> showHideAutoCalculate: " + z7);
        ((ActivityWaterSettingBinding) this.binding).sbtnWaterCalculation.setChecked(z7);
        if (z7) {
            ((ActivityWaterSettingBinding) this.binding).rlHandIntakeGoal.setVisibility(8);
            ((ActivityWaterSettingBinding) this.binding).viewAutoCalculationLine.setVisibility(0);
            ((ActivityWaterSettingBinding) this.binding).tvAutoIntakeGoal.setVisibility(0);
        } else {
            ((ActivityWaterSettingBinding) this.binding).rlHandIntakeGoal.setVisibility(0);
            ((ActivityWaterSettingBinding) this.binding).viewAutoCalculationLine.setVisibility(8);
            ((ActivityWaterSettingBinding) this.binding).tvAutoIntakeGoal.setVisibility(8);
        }
        com.crrepa.band.my.health.water.util.a.getInstance().updateGoal(true, z7 ? this.autoGoalMl : this.handGoalMl, null);
    }

    @Override // g3.c
    public void showHideHourType(boolean z7) {
        ((ActivityWaterSettingBinding) this.binding).mpStartTimeUnit.setVisibility(z7 ? 0 : 8);
    }

    @Override // g3.c
    public void showHideReminder(boolean z7) {
        com.orhanobut.logger.f.d("water ==> showHideReminder: " + z7);
        ((ActivityWaterSettingBinding) this.binding).sbtnWaterIntakeReminder.setChecked(z7);
        ((ActivityWaterSettingBinding) this.binding).llWaterIntakeReminder.setVisibility(z7 ? 0 : 8);
    }

    @Override // g3.c
    public void showIntakeGoal(boolean z7, int i8) {
        boolean z8 = BandUnitSystemProvider.getUnitSystem() == 0;
        StringBuilder sb = new StringBuilder();
        sb.append(z8 ? i8 : u0.ml2Ozs(i8));
        sb.append(WaterProvider.getWaterUnit(this));
        String sb2 = sb.toString();
        if (z7) {
            this.autoGoalMl = i8;
            ((ActivityWaterSettingBinding) this.binding).tvAutoIntakeGoal.setText(sb2);
        } else {
            this.handGoalMl = i8;
            ((ActivityWaterSettingBinding) this.binding).tvHandIntakeGoal.setText(sb2);
        }
    }

    @Override // g3.c
    public void showIntervalTime(int i8) {
        ((ActivityWaterSettingBinding) this.binding).mpIntervalTimeMins.setData(10, 120, 10, (i8 - 10) / 10);
    }

    @Override // g3.c
    public void showReminderTimes(int i8) {
        ((ActivityWaterSettingBinding) this.binding).mpReminderTimes.setData(1, 32, 1, i8 - 1);
    }

    @Override // g3.c
    public void showStartingTime(int i8, int i9, int i10) {
        this.startTimeArray[0] = i8;
        ((ActivityWaterSettingBinding) this.binding).mpStartTimeUnit.setDataString(Arrays.asList(getString(R.string.water_am), getString(R.string.water_pm)), i8);
        this.startTimeArray[1] = i9;
        int i11 = this.presenter.is12HourTime() ? 12 : 23;
        ((ActivityWaterSettingBinding) this.binding).mpStartTimeHour.setData(this.presenter.is12HourTime() ? 1 : 0, i11, 1, getHourPosition(i9), "0");
        this.startTimeArray[2] = i10;
        ((ActivityWaterSettingBinding) this.binding).mpStartTimeMinute.setData(0, 59, 1, i10, "0");
    }
}
