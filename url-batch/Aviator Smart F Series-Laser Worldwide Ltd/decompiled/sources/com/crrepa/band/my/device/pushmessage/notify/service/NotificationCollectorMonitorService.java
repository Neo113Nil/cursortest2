package com.crrepa.band.my.device.pushmessage.notify.service;

import android.app.ActivityManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.Process;
import com.orhanobut.logger.f;
import java.util.List;

/* loaded from: classes2.dex */
public class NotificationCollectorMonitorService extends Service {
    private void ensureCollectorRunning() {
        ComponentName componentName = new ComponentName(this, (Class<?>) NotificationCollectorService.class);
        f.d("ensureCollectorRunning collectorComponent: " + componentName);
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null) {
            f.d("ensureCollectorRunning() runningServices is NULL");
            return;
        }
        boolean z7 = false;
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
            if (runningServiceInfo.service.equals(componentName)) {
                StringBuilder sb = new StringBuilder();
                sb.append("ensureCollectorRunning service - pid: ");
                sb.append(runningServiceInfo.pid);
                sb.append(", currentPID: ");
                sb.append(Process.myPid());
                sb.append(", clientPackage: ");
                sb.append(runningServiceInfo.clientPackage);
                sb.append(", clientCount: ");
                sb.append(runningServiceInfo.clientCount);
                sb.append(", clientLabel: ");
                sb.append(runningServiceInfo.clientLabel == 0 ? "0" : "(" + getResources().getString(runningServiceInfo.clientLabel) + ")");
                f.d(sb.toString());
                if (runningServiceInfo.pid == Process.myPid()) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            f.d("ensureCollectorRunning: collector is running");
        } else {
            f.d("ensureCollectorRunning: collector not running, reviving...");
            toggleNotificationListenerService();
        }
    }

    private void toggleNotificationListenerService() {
        f.d("toggleNotificationListenerService() called");
        ComponentName componentName = new ComponentName(this, (Class<?>) NotificationCollectorService.class);
        PackageManager packageManager = getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f.d("onCreate() called");
        ensureCollectorRunning();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        return 1;
    }
}
