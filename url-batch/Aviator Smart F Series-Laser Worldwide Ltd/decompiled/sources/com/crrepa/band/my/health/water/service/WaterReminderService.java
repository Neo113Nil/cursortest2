package com.crrepa.band.my.health.water.service;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.my.health.water.model.BandWaterReminderEvent;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.moyoung.dafit.module.common.utils.d;
import com.orhanobut.logger.f;
import java.util.Timer;
import java.util.TimerTask;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class WaterReminderService extends Service {
    public static boolean isStopService = true;
    public static boolean isUpdateReminderTime = false;
    private long[] reminderTimeArray;
    private Timer reminderTimer;
    private int nextPosition = -1;
    private long nextTime = 0;
    private boolean isTimerTiming = false;

    private class b extends TimerTask {
        private b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (WaterReminderService.isUpdateReminderTime) {
                WaterReminderService.isUpdateReminderTime = false;
                WaterReminderService.this.nextPosition = -1;
                WaterReminderService.this.updateReminderTime();
            }
            if (!WaterReminderService.this.isTimerTiming || System.currentTimeMillis() < WaterReminderService.this.nextTime) {
                return;
            }
            WaterReminderService.this.finishTimer();
        }
    }

    private void cancelTimer() {
        Timer timer = this.reminderTimer;
        if (timer != null) {
            timer.cancel();
        }
    }

    private void executeDrinkWaterTimer() {
        updateReminderTime();
        if (this.nextPosition > -1) {
            startTimer(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishTimer() {
        this.isTimerTiming = false;
        f.d("water ==> finishTimer...");
        cancelTimer();
        c.getDefault().post(new BandWaterReminderEvent());
        int i8 = this.nextPosition + 1;
        this.nextPosition = i8;
        long[] jArr = this.reminderTimeArray;
        if (i8 >= jArr.length) {
            stop(d.get());
        } else {
            this.nextTime = jArr[i8];
            startTimer(2);
        }
    }

    private static Intent getServiceIntent(Context context) {
        return new Intent(context, (Class<?>) WaterReminderService.class);
    }

    private void makeServiceForeground() {
        if (Build.VERSION.SDK_INT >= 26) {
            Notification showWaterNotification = m1.a.showWaterNotification(this);
            f.d("water ==> service-startForeground");
            startForeground(16, showWaterNotification);
        }
    }

    public static void start(Context context) {
        isStopService = false;
        ContextCompat.startForegroundService(context, getServiceIntent(context));
    }

    private void startTimer(int i8) {
        this.isTimerTiming = true;
        long currentTimeMillis = this.nextTime - System.currentTimeMillis();
        f.d("water ==> nextTime : " + i3.a.getTimeDate(this.nextTime) + " left : " + currentTimeMillis + " ms type - : " + i8);
        Timer timer = new Timer();
        this.reminderTimer = timer;
        timer.schedule(new b(), currentTimeMillis % 1000, 1000L);
    }

    public static void stop(Context context) {
        isStopService = true;
        context.stopService(getServiceIntent(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateReminderTime() {
        this.reminderTimeArray = WaterProvider.getReminderTimeArray();
        for (int i8 = 0; i8 < this.reminderTimeArray.length; i8++) {
            f.d("water ==> reminderTime " + i8 + " : " + this.reminderTimeArray[i8] + " date : " + i3.a.getTimeDate(this.reminderTimeArray[i8]));
            if (this.nextPosition == -1 && this.reminderTimeArray[i8] > System.currentTimeMillis()) {
                this.nextPosition = i8;
                this.nextTime = this.reminderTimeArray[i8];
            }
        }
        if (this.nextPosition == -1) {
            stop(d.get());
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        isStopService = true;
        f.d("water ==> service-onDestroy");
        cancelTimer();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        makeServiceForeground();
        executeDrinkWaterTimer();
        return 1;
    }
}
