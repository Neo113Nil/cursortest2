package com.crrepa.band.my.common.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.setting.other.model.BandTimeSystemChangeEvent;
import com.crrepa.band.my.home.health.model.SystemDateChangeEvent;
import com.crrepa.band.my.model.db.proxy.GoalsSettingDaoProxy;
import com.crrepa.band.my.model.user.provider.UserGoalsSettingProvider;
import com.crrepa.band.my.profile.goalsetting.model.UserGoalStepsChengeEvent;
import com.orhanobut.logger.f;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class TimeChangeReceiver extends BroadcastReceiver {
    private static final TimeChangeReceiver timeChangeReceiver = new TimeChangeReceiver();

    public static void register(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(timeChangeReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(timeChangeReceiver, intentFilter);
        }
    }

    public static void unregister(Context context) {
        context.unregisterReceiver(timeChangeReceiver);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        f.d("TimeChangeReceiver onReceive: " + action);
        if (!TextUtils.equals(action, "android.intent.action.TIME_TICK")) {
            org.greenrobot.eventbus.c.getDefault().post(new SystemDateChangeEvent());
            org.greenrobot.eventbus.c.getDefault().post(new BandTimeSystemChangeEvent());
        } else if (Calendar.getInstance().get(12) % 15 != 0) {
            return;
        }
        f.d("TimeChangeReceiver onReceive: update data");
        i4.getInstance().sendCurrentTime();
        com.crrepa.band.my.ble.band.cmd.d.getInstance().refreshBandData();
        if (UserGoalsSettingProvider.isNewGoalsSetting()) {
            org.greenrobot.eventbus.c.getDefault().post(new UserGoalStepsChengeEvent(GoalsSettingDaoProxy.getInstance().getTodayGoalSteps()));
            m1.a.showStepsNotification(context);
        }
        new com.crrepa.band.my.device.cricket.notify.c().sendTodayGameReminder();
        e2.b.checkSavedWorldClockTimeZone();
    }
}
