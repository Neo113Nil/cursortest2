package com.crrepa.band.my.device.setting.other;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityBandOtherSettingBinding;
import com.crrepa.band.my.device.setting.citysearch.NetCitySearchActivity;
import com.crrepa.band.my.device.setting.periodchoose.PeriodChooceActivity;
import com.crrepa.band.my.device.setting.quickresponse.QuickResponseSettingActivity;
import com.crrepa.band.my.device.setting.sos.SosDetailsActivity;
import com.crrepa.band.my.health.physiologicalcycle.PhysiologicalCalendarActivity;
import com.crrepa.band.my.health.physiologicalcycle.PhysiologicalReminderActivity;
import com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog;
import com.crrepa.band.my.health.widgets.dialog.f;
import com.crrepa.band.my.health.widgets.dialog.v;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.crrepa.band.my.home.health.model.DailyQuotesStateChangeEvent;
import com.crrepa.band.my.model.band.provider.BandDisplayTimeProvider;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.band.provider.BandTimingBloodOxygenProvider;
import com.crrepa.band.my.model.band.provider.BandTimingHeartRateProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.band.provider.BtBluetoothProvider;
import com.crrepa.band.my.model.db.DrinkWater;
import com.crrepa.band.my.model.db.HandWashing;
import com.crrepa.band.my.model.db.HeartRateWarning;
import com.crrepa.band.my.model.user.provider.DailyQuotesProvider;
import com.crrepa.band.my.model.user.provider.HeartRateWarningProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class BandOtherSettingActivity extends BaseVBActivity<ActivityBandOtherSettingBinding> implements s1.a {
    private static final int REQUEST_CODE = 17;
    private final com.crrepa.band.my.device.setting.other.presenter.b presenter = new com.crrepa.band.my.device.setting.other.presenter.b();

    class a implements TimeSelectDialog.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog.a
        public void onClick(int i8, int i9) {
            BandOtherSettingActivity.this.saveDrinkWaterReminderTime(i8, i9);
        }
    }

    class b implements TimeSelectDialog.a {
        b() {
        }

        @Override // com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog.a
        public void onClick(int i8, int i9) {
            BandOtherSettingActivity.this.saveHandWashingReminderTime(i8, i9);
        }
    }

    class c implements v.a {
        c() {
        }

        @Override // com.crrepa.band.my.health.widgets.dialog.v.a
        public void onClick(int i8) {
            BandOtherSettingActivity.this.setHandWashingCount(i8);
            BandOtherSettingActivity.this.saveHandWashingCount(i8);
        }
    }

    class d implements v.a {
        d() {
        }

        @Override // com.crrepa.band.my.health.widgets.dialog.v.a
        public void onClick(int i8) {
            int i9 = i8 * 60;
            BandOtherSettingActivity.this.setHandWashingPeriod(i9);
            BandOtherSettingActivity.this.saveHandWashingPeriod(i9);
        }
    }

    class e implements PermissionDescriptionDialog.b {
        e() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("通知使用权限", true);
            q1.b.openNotificationAccess(BandOtherSettingActivity.this);
            r0.showLong(BandOtherSettingActivity.this, String.format(BandOtherSettingActivity.this.getString(R.string.notification_listener_tips), BandOtherSettingActivity.this.getString(R.string.app_name)));
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("通知使用权限", false);
            BandOtherSettingActivity.this.presenter.setRequestNotificationListener(false);
            BandOtherSettingActivity.this.renderMusicPlayer(false);
            BandOtherSettingActivity.this.presenter.saveMusicPlayerState(BandOtherSettingActivity.this, false);
        }
    }

    class f implements MaterialDialog.l {
        f() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            BandOtherSettingActivity.this.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
        }
    }

    class g implements MaterialDialog.j {
        g() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.j
        public boolean onSelection(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
            BandOtherSettingActivity.this.updateBandTimeSystem(i8);
            return true;
        }
    }

    class h implements MaterialDialog.j {
        h() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.j
        public boolean onSelection(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
            BandOtherSettingActivity.this.updateUnitSystem(i8, charSequence.toString());
            return true;
        }
    }

    class i implements MaterialDialog.j {
        i() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.j
        public boolean onSelection(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
            BandOtherSettingActivity.this.updateBandWeatherTempSystem(i8, charSequence.toString());
            return true;
        }
    }

    class j implements MaterialDialog.j {
        j() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.j
        public boolean onSelection(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
            int displayTime = BandDisplayTimeProvider.getDisplayTime(i8);
            BandOtherSettingActivity.this.setDisplayTime(displayTime);
            BandOtherSettingActivity.this.saveDisplayTime(displayTime);
            return true;
        }
    }

    class k implements MaterialDialog.l {
        k() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            materialDialog.dismiss();
            BandOtherSettingActivity.this.presenter.reset();
        }
    }

    class l implements MaterialDialog.j {
        l() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.j
        public boolean onSelection(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
            BandOtherSettingActivity.this.presenter.saveTimingHeartRateInterval(BandTimingHeartRateProvider.getInterval(i8));
            BandOtherSettingActivity.this.logSwitchFunctionEvent("开关_全天心率", i8 != 0);
            return true;
        }
    }

    class m implements MaterialDialog.l {
        final /* synthetic */ int val$mode;

        m(int i8) {
            this.val$mode = i8;
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            BandOtherSettingActivity.this.saveTimingBloodOxygenMode(this.val$mode);
        }
    }

    class n implements CompoundButton.OnCheckedChangeListener {
        n() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            BandOtherSettingActivity.this.presenter.saveBandReminderToMove(z7);
            BandOtherSettingActivity.this.logSwitchFunctionEvent("开关久坐提醒", z7);
        }
    }

    class o implements v.a {
        o() {
        }

        @Override // com.crrepa.band.my.health.widgets.dialog.v.a
        public void onClick(int i8) {
            BandOtherSettingActivity.this.savePhysiologicalCycle(i8);
        }
    }

    public static Intent getCallIntent(Context context) {
        return new Intent(context, (Class<?>) BandOtherSettingActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onTimingBloodOxygenModeClicked$1(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
        showTimingBloodOxygenDialog(i8);
        logSwitchFunctionEvent("开关_开启全天血氧", i8 == 2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$renderBandSupportLanguageList$9(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        updateBandDisplayLanguage(charSequence.toString());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderSelectedDrinkWaterReminderCount$13(int i8) {
        setDrinkWaterCount(i8);
        saveDrinkWaterCount(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderSelectedDrinkWaterReminderPeriod$14(int i8) {
        setDrinkWaterPeriod(i8);
        saveDrinkWaterPeriod(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderSelectedHeartRateWarning$15(int i8) {
        setMaxHeartRate(i8);
        saveMaxHeartRate(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scrollActivityDown$10() {
        ((ActivityBandOtherSettingBinding) this.binding).nsvContent.fullScroll(130);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBatterySavingListener$17(CompoundButton compoundButton, boolean z7) {
        this.presenter.saveBatterySaving(z7);
        logSwitchFunctionEvent("开关_省电模式", z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConnectMediaAudioListener$16(CompoundButton compoundButton, boolean z7) {
        this.presenter.saveA2DPConnectState(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDailyQuotesState$21(CompoundButton compoundButton, boolean z7) {
        DailyQuotesProvider.saveDailyQuotesState(z7);
        logSwitchFunctionEvent("开关_每日语录", z7);
        org.greenrobot.eventbus.c.getDefault().post(new DailyQuotesStateChangeEvent(z7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDrinkWaterReminderStateListener$7(CompoundButton compoundButton, boolean z7) {
        setDrinkWaterReminderState(z7);
        saveDrinkWaterReminderState(z7);
        logSwitchFunctionEvent("开关_喝水提醒", z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setHandWashingReminderStateListener$5(CompoundButton compoundButton, boolean z7) {
        setHandWashingReminderState(z7);
        saveHandWashingReminderState(z7);
        logSwitchFunctionEvent("开关_洗手提醒", z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setHeartRateWarningStateListener$8(CompoundButton compoundButton, boolean z7) {
        setHeartRateWarningState(z7);
        saveHeartRateWarningState(z7);
        logSwitchFunctionEvent("开关_心率预警", z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMusicPlayerStateListener$19(CompoundButton compoundButton, boolean z7) {
        this.presenter.saveMusicPlayerState(this, z7);
        logSwitchFunctionEvent("开关_手环控制手机音乐", z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPhysiologicalReminderStateListener$4(CompoundButton compoundButton, boolean z7) {
        savePhysiologicalReminderState(z7);
        setPhysiologcalPeriodContentVisibility(z7);
        scrollActivityDown();
        logSwitchFunctionEvent("开关_生理周期", z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setQuickViewStateListener$2(CompoundButton compoundButton, boolean z7) {
        this.presenter.saveBandQuickView(z7);
        logSwitchFunctionEvent("开关_翻腕亮屏", z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSendWeatherStateListener$3(CompoundButton compoundButton, boolean z7) {
        this.presenter.saveSendWeather(this, z7);
        logSwitchFunctionEvent("开关_天气信息", z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTapToWakeListener$18(CompoundButton compoundButton, boolean z7) {
        this.presenter.saveTapToWakeState(z7);
        logSwitchFunctionEvent("开关_屏幕轻触唤醒", z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTempTimingMeasureStateListener$6(CompoundButton compoundButton, boolean z7) {
        this.presenter.saveTempTimingMeasureState(z7);
        logSwitchFunctionEvent("开关_全天体温", z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTimingStressStateListener$20(CompoundButton compoundButton, boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnStressTimingMeasure.setCheckedNoEvent(z7);
        this.presenter.saveTimingStressState(z7);
        logSwitchFunctionEvent("开关_全天压力", z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTitle$0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logSwitchFunctionEvent(String str, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_open", z7);
        s0.logEvent(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveDisplayTime(int i8) {
        this.presenter.saveDisplayTime(i8);
    }

    private void saveDrinkWaterCount(int i8) {
        this.presenter.saveDrinkWaterCount(i8);
    }

    private void saveDrinkWaterPeriod(int i8) {
        this.presenter.saveDrinkWaterPeriod(i8);
    }

    private void saveDrinkWaterReminderState(boolean z7) {
        this.presenter.saveDrinkWaterReminderState(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveDrinkWaterReminderTime(int i8, int i9) {
        setHourMinuteTime(i8, i9, ((ActivityBandOtherSettingBinding) this.binding).tvDrinkWaterStartTime);
        this.presenter.saveDrinkWaterReminderStartTime(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveHandWashingCount(int i8) {
        this.presenter.saveHandWashingCount(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveHandWashingPeriod(int i8) {
        this.presenter.saveHandWashingPeriod(i8);
    }

    private void saveHandWashingReminderState(boolean z7) {
        this.presenter.saveHandWashingReminderState(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveHandWashingReminderTime(int i8, int i9) {
        setHourMinuteTime(i8, i9, ((ActivityBandOtherSettingBinding) this.binding).tvHandWashingStartTime);
        this.presenter.saveHandWashingReminderStartTime(i8, i9);
    }

    private void saveHeartRateWarningState(boolean z7) {
        this.presenter.saveHeartRateWarningState(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveLastMenstrualDate, reason: merged with bridge method [inline-methods] */
    public void lambda$renderSelectedLastMenstrualDate$11(Date date) {
        this.presenter.saveLastMenstrualDate(date);
    }

    private void saveMaxHeartRate(int i8) {
        this.presenter.saveMaxHeartRate(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveMenstrualPeriod(int i8) {
        this.presenter.saveMenstrualPeriod(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void savePhysiologicalCycle(int i8) {
        this.presenter.savePhysiologicalPeriod(i8);
    }

    private void savePhysiologicalReminderState(boolean z7) {
        this.presenter.savePhysiologicalReminderState(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: savePhysiologicalReminderTime, reason: merged with bridge method [inline-methods] */
    public void lambda$renderReminderTimeDialog$12(int i8, int i9) {
        this.presenter.savePhysiologicalReminderTime(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveTimingBloodOxygenMode(int i8) {
        this.presenter.saveTimingBloodOxygenMode(i8);
    }

    private void scrollActivityDown() {
        ((ActivityBandOtherSettingBinding) this.binding).nsvContent.post(new Runnable() { // from class: com.crrepa.band.my.device.setting.other.m
            @Override // java.lang.Runnable
            public final void run() {
                BandOtherSettingActivity.this.lambda$scrollActivityDown$10();
            }
        });
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityBandOtherSettingBinding) this.binding).includedTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityBandOtherSettingBinding) vb).includedTitle.tvTitle, ((ActivityBandOtherSettingBinding) vb).includedTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityBandOtherSettingBinding) this.binding).includedTitle.toolbar);
    }

    private void setBatterySavingListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnBatterySaving.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.v
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setBatterySavingListener$17(compoundButton, z7);
            }
        });
    }

    private void setConnectMediaAudioListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnConnectMediaAudio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.r
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setConnectMediaAudioListener$16(compoundButton, z7);
            }
        });
    }

    private void setDailyQuotesState() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnDailyQuotes.setCheckedNoEvent(DailyQuotesProvider.getDailyQuotesState());
        ((ActivityBandOtherSettingBinding) this.binding).sbtnDailyQuotes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setDailyQuotesState$21(compoundButton, z7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayTime(int i8) {
        if (30 < i8) {
            ((ActivityBandOtherSettingBinding) this.binding).tvDisplayTime.setText(getString(R.string.display_alway_on));
        } else {
            ((ActivityBandOtherSettingBinding) this.binding).tvDisplayTime.setText(getString(R.string.display_time_value, Integer.valueOf(i8)));
        }
    }

    private void setDrinkWaterCount(int i8) {
        if (i8 > 0) {
            ((ActivityBandOtherSettingBinding) this.binding).tvDrinkWaterCount.setText(String.valueOf(i8));
        }
    }

    private void setDrinkWaterPeriod(int i8) {
        if (i8 > 0) {
            ((ActivityBandOtherSettingBinding) this.binding).tvDrinkWaterPeriod.setText(getString(R.string.recommend_sleep_time, com.moyoung.dafit.module.common.utils.n.format(i8 / 60.0d, com.moyoung.dafit.module.common.utils.n.TWO_DECIMAL_PATTERN)));
        }
    }

    private void setDrinkWaterReminderState(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnDrinkWater.setCheckedNoEvent(z7);
        int i8 = z7 ? 0 : 8;
        ((ActivityBandOtherSettingBinding) this.binding).rlDrinkWaterStartTime.setVisibility(i8);
        ((ActivityBandOtherSettingBinding) this.binding).rlDrinkWaterCount.setVisibility(i8);
        ((ActivityBandOtherSettingBinding) this.binding).rlDrinkWaterPeriod.setVisibility(i8);
    }

    private void setDrinkWaterReminderStateListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnDrinkWater.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.h
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setDrinkWaterReminderStateListener$7(compoundButton, z7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHandWashingCount(int i8) {
        if (i8 > 0) {
            ((ActivityBandOtherSettingBinding) this.binding).tvHandWashingCount.setText(String.valueOf(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHandWashingPeriod(int i8) {
        if (i8 > 0) {
            ((ActivityBandOtherSettingBinding) this.binding).tvHandWashingPeriod.setText(getString(R.string.recommend_sleep_time, com.moyoung.dafit.module.common.utils.n.format(i8 / 60.0d, com.moyoung.dafit.module.common.utils.n.TWO_DECIMAL_PATTERN)));
        }
    }

    private void setHandWashingReminderState(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnHandWashing.setCheckedNoEvent(z7);
        int i8 = z7 ? 0 : 8;
        ((ActivityBandOtherSettingBinding) this.binding).rlHandWashingStartTime.setVisibility(i8);
        ((ActivityBandOtherSettingBinding) this.binding).rlHandWashingCount.setVisibility(i8);
        ((ActivityBandOtherSettingBinding) this.binding).rlHandWashingPeriod.setVisibility(i8);
    }

    private void setHandWashingReminderStateListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnHandWashing.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.t
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setHandWashingReminderStateListener$5(compoundButton, z7);
            }
        });
    }

    private void setHeartRateWarningState(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnHeartRateWarning.setCheckedNoEvent(z7);
        ((ActivityBandOtherSettingBinding) this.binding).rlMaxHeartRate.setVisibility(z7 ? 0 : 8);
    }

    private void setHeartRateWarningStateListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnHeartRateWarning.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.s
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setHeartRateWarningStateListener$8(compoundButton, z7);
            }
        });
    }

    private void setHourMinuteTime(int i8, int i9, TextView textView) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i8);
        calendar.set(12, i9);
        textView.setText(BandTimeSystemProvider.is12HourTime() ? com.moyoung.dafit.module.common.utils.m.format(calendar.getTime(), getString(R.string.hour_minute_format_12)) : com.moyoung.dafit.module.common.utils.m.format(calendar.getTime(), getString(R.string.hour_minute_24_format)));
    }

    private void setMaxHeartRate(int i8) {
        ((ActivityBandOtherSettingBinding) this.binding).tvMaxHeartRate.setText(i8 + getString(R.string.heart_rate_unit));
    }

    private void setMusicPlayerStateListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnMusicPlayer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.o
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setMusicPlayerStateListener$19(compoundButton, z7);
            }
        });
    }

    private void setPhysiologcalPeriodContentVisibility(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).llPhysiologicalPeriodContent.setVisibility(z7 ? 0 : 8);
    }

    private void setPhysiologicalReminderStateListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnPhysiologicalPeriod.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setPhysiologicalReminderStateListener$4(compoundButton, z7);
            }
        });
    }

    private void setQuickViewStateListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnQuickView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.g
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setQuickViewStateListener$2(compoundButton, z7);
            }
        });
    }

    private void setReminderToMoveStateListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnReminderToMove.setOnCheckedChangeListener(new n());
    }

    private void setSendWeatherStateListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnWeather.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setSendWeatherStateListener$3(compoundButton, z7);
            }
        });
    }

    private void setTapToWakeListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnTapToWake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.i
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setTapToWakeListener$18(compoundButton, z7);
            }
        });
    }

    private void setTempTimingMeasureStateListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnTempTimingMeasure.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.l
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setTempTimingMeasureStateListener$6(compoundButton, z7);
            }
        });
    }

    private void setTimingStressStateListener() {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnStressTimingMeasure.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.other.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                BandOtherSettingActivity.this.lambda$setTimingStressStateListener$20(compoundButton, z7);
            }
        });
    }

    private void setTimingTempMeasureState(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnTempTimingMeasure.setCheckedNoEvent(z7);
    }

    private void setTitle() {
        ((ActivityBandOtherSettingBinding) this.binding).includedTitle.tvTitle.setText(R.string.other_settings);
        ((ActivityBandOtherSettingBinding) this.binding).includedTitle.tvExpandedTitle.setText(R.string.other_settings);
        ((ActivityBandOtherSettingBinding) this.binding).includedTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityBandOtherSettingBinding) this.binding).includedTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.setting.other.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandOtherSettingActivity.this.lambda$setTitle$0(view);
            }
        });
    }

    private void showControlSetting() {
        int i8 = (((ActivityBandOtherSettingBinding) this.binding).rlMusicPlayer.getVisibility() == 0 || ((ActivityBandOtherSettingBinding) this.binding).rlQuickResponse.getVisibility() == 0) ? 0 : 8;
        ((ActivityBandOtherSettingBinding) this.binding).tvDeviceSettingControl.setVisibility(i8);
        ((ActivityBandOtherSettingBinding) this.binding).lineDeviceSettingControl.setVisibility(i8);
    }

    private void showPeriodDialog(List<Integer> list, int i8, v.a aVar) {
        new com.crrepa.band.my.health.widgets.dialog.v(this).setPeriodList(list).setSelectedPosition(i8).setOnDoneClickListener(aVar).show();
    }

    private void showSceneModeSetting() {
        int i8 = (((ActivityBandOtherSettingBinding) this.binding).rlDoNotDisturb.getVisibility() == 0 || ((ActivityBandOtherSettingBinding) this.binding).rlBatterySaving.getVisibility() == 0 || ((ActivityBandOtherSettingBinding) this.binding).rlConnectMediaAudio.getVisibility() == 0) ? 0 : 8;
        ((ActivityBandOtherSettingBinding) this.binding).tvDeviceSettingSceneMode.setVisibility(i8);
        ((ActivityBandOtherSettingBinding) this.binding).lineDeviceSettingSceneMode.setVisibility(i8);
    }

    private void showTimingBloodOxygenDialog(int i8) {
        if (i8 == 0) {
            saveTimingBloodOxygenMode(i8);
        } else {
            new MaterialDialog.e(this).title(R.string.timing_blodd_oxygen_title).content(R.string.timing_blodd_oxygen_content).negativeText(R.string.cancel).positiveText(R.string.done).onPositive(new m(i8)).show();
        }
    }

    private void updateBandDisplayLanguage(String str) {
        this.presenter.saveBandDisplayLanguage(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBandTimeSystem(int i8) {
        this.presenter.saveBandTimeSystem(this, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBandWeatherTempSystem(int i8, String str) {
        this.presenter.saveWeatherTempSystem(this, i8, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUnitSystem(int i8, String str) {
        this.presenter.saveUnitSystem(i8, str);
    }

    @Override // s1.a
    public void hideLocationCity() {
        ((ActivityBandOtherSettingBinding) this.binding).rlWeatherLocation.setVisibility(8);
    }

    @Override // s1.a
    public void hideWeatherContent() {
        ((ActivityBandOtherSettingBinding) this.binding).tvWeatherTitle.setVisibility(8);
        ((ActivityBandOtherSettingBinding) this.binding).rlWeather.setVisibility(8);
        ((ActivityBandOtherSettingBinding) this.binding).rlWeatherTempSystem.setVisibility(8);
        ((ActivityBandOtherSettingBinding) this.binding).rlWeatherLocation.setVisibility(8);
    }

    @Override // s1.a
    public void hideWeatherTempSystem() {
        ((ActivityBandOtherSettingBinding) this.binding).rlWeatherTempSystem.setVisibility(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (17 == i8 && i9 == -1) {
            this.presenter.saveLocationCity(this);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.setView(this);
        setActionBar();
        setTitle();
        this.presenter.getBandSetting(this);
        setReminderToMoveStateListener();
        setQuickViewStateListener();
        setSendWeatherStateListener();
        setPhysiologicalReminderStateListener();
        setTempTimingMeasureStateListener();
        setDrinkWaterReminderStateListener();
        setHeartRateWarningStateListener();
        setHandWashingReminderStateListener();
        setMusicPlayerStateListener();
        setBatterySavingListener();
        setTapToWakeListener();
        setConnectMediaAudioListener();
        setTimingStressStateListener();
        showControlSetting();
        showSceneModeSetting();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    public void onDeviceLanguageClicked(View view) {
        this.presenter.getSupportLanguageList();
    }

    public void onDisplayTimeClicked(View view) {
        int displayTime = BandDisplayTimeProvider.getDisplayTime();
        int displayTimePosition = BandDisplayTimeProvider.getDisplayTimePosition(displayTime);
        com.orhanobut.logger.f.d("onDisplayTimeClicked: " + displayTime + ", " + displayTimePosition);
        new MaterialDialog.e(this).title(R.string.display_time).items(BandDisplayTimeProvider.getDisplayTimeList(this)).itemsCallbackSingleChoice(displayTimePosition, new j()).positiveText(R.string.done).show();
    }

    public void onDoNotDistrubClicked(View view) {
        startActivity(PeriodChooceActivity.getDoNotDisturbCallingIntent(this));
    }

    public void onDrinkWaterCountClicked(View view) {
        this.presenter.selectDrinkWaterCount();
    }

    public void onDrinkWaterPeriodClicked(View view) {
        this.presenter.selectDrinkWaterPeriod();
    }

    public void onDrinkWaterStartTimeClicked(View view) {
        this.presenter.selectDrinkWaterReminderStartTime();
    }

    public void onHandWashingCountClicked(View view) {
        this.presenter.selectHandWashingCount();
    }

    public void onHandWashingPeriodClicked(View view) {
        this.presenter.selectHandWashingPeriod();
    }

    public void onHandWashingStartTimeClicked(View view) {
        this.presenter.selectHandWashingReminderStartTime();
    }

    public void onLastMenstrualDateClicked(View view) {
        this.presenter.selectLastMenstrualDate();
    }

    public void onLocationCityClicked(View view) {
        startActivityForResult(NetCitySearchActivity.getCallingIntent(this), 17);
    }

    public void onMaxHeartRateClicked(View view) {
        this.presenter.selectMaxHeartRate();
    }

    public void onMenstrualPeriodClicked(View view) {
        this.presenter.selectMenstrualPeriod();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    public void onPhysiologcalCalendarClicked(View view) {
        this.presenter.savePhysiologicalPeriod();
        startActivity(PhysiologicalCalendarActivity.getCallingIntent(this, false));
    }

    public void onPhysiologicalCycleClicked(View view) {
        this.presenter.selectPhysiologicalCycle();
    }

    public void onQuickResponseClicked(View view) {
        startActivity(QuickResponseSettingActivity.getCallingIntent(this));
    }

    public void onQuickViewTimeClicked(View view) {
        startActivity(PeriodChooceActivity.getQuickViewCallingIntent(this));
    }

    public void onReminderModeClicked(View view) {
        startActivity(PhysiologicalReminderActivity.getCallingIntent(this, false));
    }

    public void onReminderTimeClicked(View view) {
        this.presenter.selectPhysiologicalReminderTime();
    }

    public void onResetClicked(View view) {
        new MaterialDialog.e(this).title(R.string.reset_title).content(R.string.reset_content).onPositive(new k()).positiveText(R.string.confirm).negativeText(R.string.cancel).show();
        s0.logEvent("点击恢复出厂设置");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        s0.logPage(getClass(), "其他设置");
    }

    public void onSosClicked(View view) {
        startActivity(SosDetailsActivity.getCallIntent(this));
    }

    public void onTimeSystemClicked(View view) {
        new MaterialDialog.e(this).title(R.string.time_system).items(R.array.time_system_array).itemsCallbackSingleChoice(BandTimeSystemProvider.getTimeSystem(this), new g()).positiveText(R.string.done).show();
    }

    public void onTimingBloodOxygenModeClicked(View view) {
        new MaterialDialog.e(this).title(R.string.continuous_blood_oxygen_detection).items(com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon() ? R.array.timing_blood_oxygen_mode_array_for_hisilicon : R.array.timing_blood_oxygen_mode_array).itemsCallbackSingleChoice(BandTimingBloodOxygenProvider.getTimingBloodOxygenMode(), new MaterialDialog.j() { // from class: com.crrepa.band.my.device.setting.other.w
            @Override // com.afollestad.materialdialogs.MaterialDialog.j
            public final boolean onSelection(MaterialDialog materialDialog, View view2, int i8, CharSequence charSequence) {
                boolean lambda$onTimingBloodOxygenModeClicked$1;
                lambda$onTimingBloodOxygenModeClicked$1 = BandOtherSettingActivity.this.lambda$onTimingBloodOxygenModeClicked$1(materialDialog, view2, i8, charSequence);
                return lambda$onTimingBloodOxygenModeClicked$1;
            }
        }).positiveText(R.string.done).show();
    }

    public void onTimingHeartRateClicked(View view) {
        new MaterialDialog.e(this).title(R.string.continuous_heart_rate_detection).items(BandTimingHeartRateProvider.getIntervalList(this)).itemsCallbackSingleChoice(BandTimingHeartRateProvider.getIntervalIndex(), new l()).positiveText(R.string.done).show();
    }

    public void onUnitSystemClicked(View view) {
        new MaterialDialog.e(this).title(R.string.unit_system).items(R.array.unit_system_array).itemsCallbackSingleChoice(BandUnitSystemProvider.getUnitSystem(), new h()).positiveText(R.string.done).show();
    }

    public void onWeatherTempSystemClicked(View view) {
        new MaterialDialog.e(this).title(R.string.weather_temp_system).items(R.array.temp_system_array).itemsCallbackSingleChoice(BandTempSystemProvider.getTempSystem(), new i()).positiveText(R.string.done).show();
    }

    @Override // s1.a
    public void renderA2DPConnectState(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).rlConnectMediaAudio.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).sbtnConnectMediaAudio.setCheckedNoEvent(z7);
    }

    @Override // s1.a
    public void renderA2DPNotConnectHint() {
        new MaterialDialog.e(this).title(getString(R.string.connect_media_audio_hint, BtBluetoothProvider.getName())).positiveText(getString(R.string.confirm)).onPositive(new f()).show();
    }

    @Override // s1.a
    public void renderBandSupportLanguageList(String[] strArr, int i8) {
        new MaterialDialog.e(this).title(R.string.language).items(strArr).itemsCallbackSingleChoice(i8, new MaterialDialog.j() { // from class: com.crrepa.band.my.device.setting.other.p
            @Override // com.afollestad.materialdialogs.MaterialDialog.j
            public final boolean onSelection(MaterialDialog materialDialog, View view, int i9, CharSequence charSequence) {
                boolean lambda$renderBandSupportLanguageList$9;
                lambda$renderBandSupportLanguageList$9 = BandOtherSettingActivity.this.lambda$renderBandSupportLanguageList$9(materialDialog, view, i9, charSequence);
                return lambda$renderBandSupportLanguageList$9;
            }
        }).positiveText(R.string.done).show();
    }

    @Override // s1.a
    public void renderBatterySaving(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).rlBatterySaving.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).sbtnBatterySaving.setCheckedNoEvent(z7);
    }

    @Override // s1.a
    public void renderContinueHeartRateEnableHint() {
        r0.showLong(this, getString(R.string.continue_heart_rate_enable_hint));
    }

    @Override // s1.a
    public void renderDisableQuickView() {
        r0.showLong(this, getString(R.string.battery_saving_hint, getString(R.string.quick_view).toLowerCase()));
    }

    @Override // s1.a
    public void renderDislayLanguage(String str) {
        ((ActivityBandOtherSettingBinding) this.binding).rlDeviceLanguage.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((ActivityBandOtherSettingBinding) this.binding).tvDeviceLanguage.setText(str);
    }

    @Override // s1.a
    public void renderDisplayTime(int i8) {
        ((ActivityBandOtherSettingBinding) this.binding).rlDisplayTime.setVisibility(0);
        setDisplayTime(i8);
    }

    @Override // s1.a
    public void renderDoNotDisturbPeriod(String str) {
        ((ActivityBandOtherSettingBinding) this.binding).rlDoNotDisturb.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).tvDoNotDisturb.setText(str);
    }

    @Override // s1.a
    public void renderDrinkWaterReminder(DrinkWater drinkWater) {
        ((ActivityBandOtherSettingBinding) this.binding).rlDrinkWaterRemind.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).rlDrinkWaterStartTime.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).rlDrinkWaterCount.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).rlDrinkWaterPeriod.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).lineDrinkWaterRemind.setVisibility(0);
        setDrinkWaterReminderState(drinkWater.getEnable().booleanValue());
        setHourMinuteTime(drinkWater.getStartHour().intValue(), drinkWater.getStartMinute().intValue(), ((ActivityBandOtherSettingBinding) this.binding).tvDrinkWaterStartTime);
        setDrinkWaterCount(drinkWater.getCount().intValue());
        setDrinkWaterPeriod(drinkWater.getPeriod().intValue());
    }

    @Override // s1.a
    public void renderHandWashingReminder(HandWashing handWashing) {
        ((ActivityBandOtherSettingBinding) this.binding).rlHandWashingRemind.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).rlHandWashingPeriod.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).rlHandWashingCount.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).rlHandWashingStartTime.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).lineHandWashingRemind.setVisibility(0);
        setHandWashingReminderState(handWashing.getEnable().booleanValue());
        setHourMinuteTime(handWashing.getStartHour().intValue(), handWashing.getStartMinute().intValue(), ((ActivityBandOtherSettingBinding) this.binding).tvHandWashingStartTime);
        setHandWashingCount(handWashing.getCount().intValue());
        setHandWashingPeriod(handWashing.getPeriod().intValue());
    }

    @Override // s1.a
    public void renderHeartRateWarning(HeartRateWarning heartRateWarning) {
        ((ActivityBandOtherSettingBinding) this.binding).llHeartRateWarning.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).rlMaxHeartRate.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).lineHeartRateWarning.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).tvHeartRateWarningHint.setText(getString(R.string.default_heart_rate_warning_hint, Integer.valueOf(HeartRateWarningProvider.getWarningMaxHeartRate())));
        setHeartRateWarningState(heartRateWarning.getEnable().booleanValue());
        setMaxHeartRate(heartRateWarning.getHr().intValue());
    }

    @Override // s1.a
    public void renderLastMenstrualDate(Date date) {
        ((ActivityBandOtherSettingBinding) this.binding).tvLastMenstrualPeriodDate.setText(com.moyoung.dafit.module.common.utils.m.format(date, getString(R.string.year_month_day_format)));
    }

    @Override // s1.a
    public void renderLocationCity(String str) {
        ((ActivityBandOtherSettingBinding) this.binding).rlWeatherLocation.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        ((ActivityBandOtherSettingBinding) this.binding).tvLocation.setText(str);
    }

    @Override // s1.a
    public void renderMenstrualPeriod(String str) {
        ((ActivityBandOtherSettingBinding) this.binding).tvMenstrualPeriod.setText(str);
    }

    @Override // s1.a
    public void renderMusicPlayer(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).rlMusicPlayer.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).sbtnMusicPlayer.setCheckedNoEvent(z7);
    }

    @Override // s1.a
    public void renderNotificationListenerDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_notification).setTitle(R.string.permission_notification_title).setContent(R.string.permission_notification_music_content).setOnClickListener(new e()).build(this).show();
    }

    @Override // s1.a
    public void renderPhysiologicalCycle(String str) {
        ((ActivityBandOtherSettingBinding) this.binding).tvPhysiologicalCycle.setText(str);
    }

    @Override // s1.a
    public void renderPhysiologicalPeriodRemind() {
        ((ActivityBandOtherSettingBinding) this.binding).rlPhysiologicalPeriodRemind.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).linePhysiologicalPeriodRemind.setVisibility(0);
    }

    @Override // s1.a
    public void renderPhysiologicalReminder(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnPhysiologicalPeriod.setCheckedNoEvent(z7);
        setPhysiologcalPeriodContentVisibility(z7);
    }

    @Override // s1.a
    public void renderQuickResponseState(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).rlQuickResponse.setVisibility(0);
        if (z7) {
            ((ActivityBandOtherSettingBinding) this.binding).tvQuickResponseState.setText(R.string.call_rejection_function_state);
        } else {
            ((ActivityBandOtherSettingBinding) this.binding).tvQuickResponseState.setText("");
        }
    }

    @Override // s1.a
    public void renderQuickView(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnQuickView.setCheckedNoEvent(z7);
    }

    @Override // s1.a
    public void renderQuickViewEffectivePeriod(String str) {
        ((ActivityBandOtherSettingBinding) this.binding).tvQuickViewPeriod.setText(str);
    }

    @Override // s1.a
    public void renderQuickViewPeriodVisible(boolean z7) {
        if (z7) {
            ((ActivityBandOtherSettingBinding) this.binding).llQuickViewPeriod.setVisibility(0);
        } else {
            ((ActivityBandOtherSettingBinding) this.binding).llQuickViewPeriod.setVisibility(8);
        }
    }

    @Override // s1.a
    public void renderReminderTime(int i8, int i9) {
        setHourMinuteTime(i8, i9, ((ActivityBandOtherSettingBinding) this.binding).tvReminderTime);
    }

    @Override // s1.a
    public void renderReminderTimeDialog(int i8, int i9) {
        new TimeSelectDialog(this).setSelectedTimePosition(i8, i9).setOnDoneClickListener(new TimeSelectDialog.a() { // from class: com.crrepa.band.my.device.setting.other.a
            @Override // com.crrepa.band.my.health.widgets.dialog.TimeSelectDialog.a
            public final void onClick(int i10, int i11) {
                BandOtherSettingActivity.this.lambda$renderReminderTimeDialog$12(i10, i11);
            }
        }).show();
    }

    @Override // s1.a
    public void renderReminderToMove(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnReminderToMove.setCheckedNoEvent(z7);
    }

    @Override // s1.a
    public void renderResetView() {
        ((ActivityBandOtherSettingBinding) this.binding).btnReset.setVisibility(0);
    }

    @Override // s1.a
    public void renderSelectedDrinkWaterReminderCount(List<Integer> list, int i8) {
        showPeriodDialog(list, i8, new v.a() { // from class: com.crrepa.band.my.device.setting.other.c
            @Override // com.crrepa.band.my.health.widgets.dialog.v.a
            public final void onClick(int i9) {
                BandOtherSettingActivity.this.lambda$renderSelectedDrinkWaterReminderCount$13(i9);
            }
        });
    }

    @Override // s1.a
    public void renderSelectedDrinkWaterReminderPeriod(List<Integer> list, int i8) {
        showPeriodDialog(list, i8, new v.a() { // from class: com.crrepa.band.my.device.setting.other.k
            @Override // com.crrepa.band.my.health.widgets.dialog.v.a
            public final void onClick(int i9) {
                BandOtherSettingActivity.this.lambda$renderSelectedDrinkWaterReminderPeriod$14(i9);
            }
        });
    }

    @Override // s1.a
    public void renderSelectedDrinkWaterReminderTime(int i8, int i9) {
        new TimeSelectDialog(this).setSelectedTimePosition(i8, i9).setOnDoneClickListener(new a()).show();
    }

    @Override // s1.a
    public void renderSelectedHandWashingReminderCount(List<Integer> list, int i8) {
        showPeriodDialog(list, i8, new c());
    }

    @Override // s1.a
    public void renderSelectedHandWashingReminderPeriod(List<Integer> list, int i8) {
        showPeriodDialog(list, i8, new d());
    }

    @Override // s1.a
    public void renderSelectedHandWashingReminderTime(int i8, int i9) {
        new TimeSelectDialog(this).setSelectedTimePosition(i8, i9).setOnDoneClickListener(new b()).show();
    }

    @Override // s1.a
    public void renderSelectedHeartRateWarning(List<Integer> list, int i8) {
        showPeriodDialog(list, i8, new v.a() { // from class: com.crrepa.band.my.device.setting.other.e
            @Override // com.crrepa.band.my.health.widgets.dialog.v.a
            public final void onClick(int i9) {
                BandOtherSettingActivity.this.lambda$renderSelectedHeartRateWarning$15(i9);
            }
        });
    }

    @Override // s1.a
    public void renderSelectedLastMenstrualDate(Date date) {
        new com.crrepa.band.my.health.widgets.dialog.f(this).setSelectedDate(date).setOnDoneClickListener(new f.b() { // from class: com.crrepa.band.my.device.setting.other.f
            @Override // com.crrepa.band.my.health.widgets.dialog.f.b
            public final void onDoneClick(Date date2) {
                BandOtherSettingActivity.this.lambda$renderSelectedLastMenstrualDate$11(date2);
            }
        }).show();
    }

    @Override // s1.a
    public void renderSelectedMenstrualPeriod(List<Integer> list, int i8) {
        showPeriodDialog(list, i8, new v.a() { // from class: com.crrepa.band.my.device.setting.other.j
            @Override // com.crrepa.band.my.health.widgets.dialog.v.a
            public final void onClick(int i9) {
                BandOtherSettingActivity.this.saveMenstrualPeriod(i9);
            }
        });
    }

    @Override // s1.a
    public void renderSelectedPhysiologicalCycle(List<Integer> list, int i8) {
        showPeriodDialog(list, i8, new o());
    }

    @Override // s1.a
    public void renderSos() {
        ((ActivityBandOtherSettingBinding) this.binding).rlSos.setVisibility(0);
    }

    @Override // s1.a
    public void renderTapToWakeState(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).rlTapToWake.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).sbtnTapToWake.setCheckedNoEvent(z7);
    }

    @Override // s1.a
    public void renderTempTimingMeasureState(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnTempTimingMeasure.setCheckedNoEvent(z7);
    }

    @Override // s1.a
    public void renderTimeSystem(String str) {
        ((ActivityBandOtherSettingBinding) this.binding).tvTimeSystem.setText(str);
    }

    @Override // s1.a
    public void renderTimingBloodOxygen(int i8) {
        String[] stringArray = getResources().getStringArray(com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon() ? R.array.timing_blood_oxygen_mode_array_for_hisilicon : R.array.timing_blood_oxygen_mode_array);
        if (stringArray.length <= i8) {
            return;
        }
        ((ActivityBandOtherSettingBinding) this.binding).rlTimingBloodOxygen.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).tvTimingBloodOxygenMode.setText(stringArray[i8]);
    }

    @Override // s1.a
    public void renderTimingHeartRateTime(int i8) {
        String str;
        ((ActivityBandOtherSettingBinding) this.binding).rlTimingHeartRate.setVisibility(0);
        if (i8 == 0) {
            str = getString(R.string.close);
        } else {
            str = i8 + cn.hutool.core.text.l.SPACE + getString(R.string.minute_unit);
        }
        ((ActivityBandOtherSettingBinding) this.binding).tvTimingHeartRateTime.setText(str);
    }

    @Override // s1.a
    public void renderTimingStress(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).rlStressTimingMeasure.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).sbtnStressTimingMeasure.setCheckedNoEvent(z7);
    }

    @Override // s1.a
    public void renderTimingTemp(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).rlTempTimingMeasure.setVisibility(0);
        setTimingTempMeasureState(z7);
    }

    @Override // s1.a
    public void renderUnitSystem(String str) {
        ((ActivityBandOtherSettingBinding) this.binding).rlUnitSystem.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).tvUnitSystem.setText(str);
    }

    @Override // s1.a
    public void renderWeather(boolean z7) {
        ((ActivityBandOtherSettingBinding) this.binding).sbtnWeather.setCheckedNoEvent(z7);
    }

    @Override // s1.a
    public void renderWeatherTempSystem(String str) {
        ((ActivityBandOtherSettingBinding) this.binding).rlWeatherTempSystem.setVisibility(0);
        ((ActivityBandOtherSettingBinding) this.binding).tvWeatherTempSystem.setText(str);
    }
}
