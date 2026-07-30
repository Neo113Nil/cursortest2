package com.crrepa.band.my.ble.band.connect;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.my.common.receiver.BluetoothStateReceiver;
import com.crrepa.band.my.common.receiver.PhoneStateReceiver;
import com.crrepa.band.my.common.receiver.ScreenStatusReceiver;
import com.crrepa.band.my.common.receiver.TimeChangeReceiver;
import com.crrepa.band.my.common.receiver.VolumeChangeReceiver;
import com.crrepa.band.my.device.calendar.h;
import com.crrepa.band.my.device.calendar.model.CalendarPermissionChangeEvent;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class BandConnectService extends Service {
    private static Intent getConnectServiceIntent(Context context) {
        return new Intent(context, (Class<?>) BandConnectService.class);
    }

    private void makeServiceForeground() {
        if (26 <= Build.VERSION.SDK_INT) {
            Notification showStepsNotification = m1.a.showStepsNotification(this);
            com.orhanobut.logger.f.d("startForeground");
            startForeground(1, showStepsNotification);
        }
    }

    private void registerReceiver() {
        BluetoothStateReceiver.register(this);
        PhoneStateReceiver.register(this);
        com.crrepa.band.my.device.pushmessage.f.register(this);
        ScreenStatusReceiver.register(this);
        TimeChangeReceiver.register(this);
        VolumeChangeReceiver.register(this);
        h.register(this);
    }

    public static void start(Context context) {
        ContextCompat.startForegroundService(context, getConnectServiceIntent(context));
    }

    public static void stop(Context context) {
        context.stopService(getConnectServiceIntent(context));
    }

    private void unregisterReceiver() {
        BluetoothStateReceiver.unregister(this);
        PhoneStateReceiver.unregister(this);
        com.crrepa.band.my.device.pushmessage.f.unregister(this);
        ScreenStatusReceiver.unregister(this);
        TimeChangeReceiver.unregister(this);
        VolumeChangeReceiver.unregister(this);
        h.unregister(this);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.orhanobut.logger.f.d("onCreate");
        org.greenrobot.eventbus.c.getDefault().register(this);
        registerReceiver();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        m1.a.hideStepsNotification(this);
        unregisterReceiver();
    }

    @l
    public void onReadCalendarPermissionChangeEvent(CalendarPermissionChangeEvent calendarPermissionChangeEvent) {
        h.register(this);
    }

    @Override // android.app.Service
    @SuppressLint({"WrongConstant"})
    public int onStartCommand(Intent intent, int i8, int i9) {
        com.orhanobut.logger.f.d("onStartCommand: " + i9);
        makeServiceForeground();
        f.getInstance().establishConnection();
        return 1;
    }
}
