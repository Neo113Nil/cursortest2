package com.crrepa.band.my.device.alarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityBandAlarmEditBinding;
import com.crrepa.band.my.model.db.Alarm;
import com.crrepa.band.my.model.db.proxy.BandAlarmDaoProxy;
import com.crrepa.ble.conn.bean.CRPAlarmInfo;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class BandAlarmEditActivity extends BaseActivity {
    private static final String ALARM_ID = "alarm_id";
    private static final int DEFAULT_ALARM_ID = -1;
    private static final boolean DEFAULT_NEW_ALARM = false;
    private static final int HOUR_NUMBER = 24;
    private static final String MAX_ALARM_COUNT = "max_alarm_count";
    private static final int MINUTE_NUMBER = 60;
    private static final String NEW_ALARM = "new_alarm";
    private BandAlarmDaoProxy alarmDaoProxy = new BandAlarmDaoProxy();
    private ActivityBandAlarmEditBinding binding;

    private Alarm createNullAlarm() {
        Alarm alarm = new Alarm();
        alarm.setHour(0);
        alarm.setMinute(0);
        alarm.setRepeat(0);
        return alarm;
    }

    public static Intent getAddCallingIntent(Context context, int i8) {
        Intent intent = new Intent(context, (Class<?>) BandAlarmEditActivity.class);
        intent.putExtra(MAX_ALARM_COUNT, i8);
        intent.putExtra(NEW_ALARM, true);
        return intent;
    }

    private int getAlarmId() {
        return getIntent().getIntExtra(ALARM_ID, -1);
    }

    private int getAlarmRepaat() {
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

    public static Intent getEditCallingIntent(Context context, int i8, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) BandAlarmEditActivity.class);
        intent.putExtra(ALARM_ID, i8);
        intent.putExtra(NEW_ALARM, z7);
        return intent;
    }

    @NonNull
    private List<Integer> getTimeList(int i8) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add(Integer.valueOf(i9));
        }
        return arrayList;
    }

    private boolean isNewAlarm() {
        return getIntent().getBooleanExtra(NEW_ALARM, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        saveAlarm();
    }

    private void setAlarmRepeat(boolean[] zArr) {
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

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityBandAlarmEditBinding inflate = ActivityBandAlarmEditBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.wpTimeHour.setData(getTimeList(24));
        this.binding.wpTimeMinute.setData(getTimeList(60));
        int alarmId = getAlarmId();
        Alarm createNullAlarm = alarmId == -1 ? createNullAlarm() : this.alarmDaoProxy.getAlarm(alarmId);
        int intValue = createNullAlarm.getHour().intValue();
        int intValue2 = createNullAlarm.getMinute().intValue();
        this.binding.wpTimeHour.setSelectedItemPosition(intValue);
        this.binding.wpTimeMinute.setSelectedItemPosition(intValue2);
        setAlarmRepeat(v0.b.toRepeatArray(createNullAlarm.getRepeat() == null ? 0 : createNullAlarm.getRepeat().intValue()));
        this.binding.tvAlarmEditBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.alarm.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandAlarmEditActivity.this.lambda$onCreate$0(view);
            }
        });
        this.binding.tvAlarmEditSave.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.alarm.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandAlarmEditActivity.this.lambda$onCreate$1(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "日常闹钟_设置闹钟");
    }

    public void saveAlarm() {
        int currentItemPosition = this.binding.wpTimeHour.getCurrentItemPosition();
        int currentItemPosition2 = this.binding.wpTimeMinute.getCurrentItemPosition();
        int alarmRepaat = getAlarmRepaat();
        int pow = (int) Math.pow(2.0d, m.getDayOfWeek(new Date()) - 1);
        Date date = new Date();
        if (alarmRepaat <= 0 || (pow & alarmRepaat) > 0) {
            int minuteOfDay = ((currentItemPosition * 60) + currentItemPosition2) - m.getMinuteOfDay(new Date());
            if (minuteOfDay < 0) {
                date = m.getDateOfOffsetDay(date, 1);
            } else if (minuteOfDay <= 2) {
                r0.showShort(this, getString(R.string.alarm_time_error_hint));
                return;
            }
        }
        int alarmId = getAlarmId();
        if (alarmId == -1) {
            alarmId = this.alarmDaoProxy.getNextAlarmId(getIntent().getIntExtra(MAX_ALARM_COUNT, -1));
        }
        com.orhanobut.logger.f.d("saved id: " + alarmId);
        if (alarmId >= 0) {
            CRPAlarmInfo cRPAlarmInfo = new CRPAlarmInfo();
            cRPAlarmInfo.setId(alarmId);
            cRPAlarmInfo.setHour(currentItemPosition);
            cRPAlarmInfo.setMinute(currentItemPosition2);
            cRPAlarmInfo.setRepeatMode(alarmRepaat);
            cRPAlarmInfo.setEnable(true);
            cRPAlarmInfo.setDate(date);
            if (isNewAlarm() ? i4.getInstance().sendNewAlarm(cRPAlarmInfo) : i4.getInstance().sendAlarm(cRPAlarmInfo)) {
                this.alarmDaoProxy.save(v0.a.convertAlarm(cRPAlarmInfo));
                setResult(-1);
            } else {
                r0.showLong(this, getString(R.string.band_setting_send_fail));
            }
        }
        finish();
    }
}
