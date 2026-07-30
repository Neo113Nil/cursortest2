package com.crrepa.band.my.training.map;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.training.model.PhoneStepsChangeEvent;
import com.moyoung.dafit.module.common.utils.r0;
import h5.a;

/* loaded from: classes3.dex */
public class GPSTrainingService extends Service {
    private h5.a stepsCounter;

    private static Intent getServiceIntent(Context context) {
        return new Intent(context, (Class<?>) GPSTrainingService.class);
    }

    private void initPhoneStepsCounter(Context context) {
        h5.a create = h5.a.create(context);
        this.stepsCounter = create;
        if (create == null) {
            r0.showShort(context, R.string.gps_training_no_steps_counter_tips);
        } else {
            create.setOnStepsChangeListener(new a.InterfaceC0353a() { // from class: com.crrepa.band.my.training.map.w
                @Override // h5.a.InterfaceC0353a
                public final void onStepsChange(int i8) {
                    GPSTrainingService.lambda$initPhoneStepsCounter$0(i8);
                }
            });
            this.stepsCounter.startCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initPhoneStepsCounter$0(int i8) {
        org.greenrobot.eventbus.c.getDefault().post(new PhoneStepsChangeEvent(i8));
    }

    private void makeServiceForeground() {
        if (Build.VERSION.SDK_INT >= 26) {
            Notification showGPSNotification = m1.a.showGPSNotification(this);
            com.orhanobut.logger.f.d("startForeground");
            startForeground(6, showGPSNotification);
        }
    }

    public static void start(Context context, boolean z7) {
        Intent serviceIntent = getServiceIntent(context);
        serviceIntent.putExtra("isPhoneStepsCounter", z7);
        ContextCompat.startForegroundService(context, serviceIntent);
    }

    public static void stop(Context context) {
        context.stopService(getServiceIntent(context));
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
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        m1.a.hideGPSNotification(this);
        h5.a aVar = this.stepsCounter;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // android.app.Service
    @SuppressLint({"WrongConstant"})
    public int onStartCommand(Intent intent, int i8, int i9) {
        com.orhanobut.logger.f.d("onStartCommand: " + i9);
        makeServiceForeground();
        if (intent == null || !intent.getBooleanExtra("isPhoneStepsCounter", false)) {
            return 1;
        }
        initPhoneStepsCounter(this);
        return 1;
    }
}
