package com.liulishuo.filedownloader.services;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.blankj.utilcode.util.x;
import com.liulishuo.filedownloader.d0;
import java.lang.ref.WeakReference;

@SuppressLint({"Registered"})
/* loaded from: classes4.dex */
public class FileDownloadService extends Service {
    private l handler;
    private d0 pauseAllMarker;

    public static class SeparateProcessService extends FileDownloadService {
    }

    public static class SharedMainProcessService extends FileDownloadService {
    }

    private void inspectRunServiceForeground(Intent intent) {
        if (intent != null && intent.getBooleanExtra("is_foreground", false)) {
            k foregroundConfigInstance = com.liulishuo.filedownloader.download.b.getImpl().getForegroundConfigInstance();
            if (foregroundConfigInstance.isNeedRecreateChannelId() && Build.VERSION.SDK_INT >= 26) {
                com.google.android.exoplayer2.util.i.a();
                NotificationChannel a8 = x.a(foregroundConfigInstance.getNotificationChannelId(), foregroundConfigInstance.getNotificationChannelName(), 2);
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                if (notificationManager == null) {
                    return;
                } else {
                    notificationManager.createNotificationChannel(a8);
                }
            }
            startForeground(foregroundConfigInstance.getNotificationId(), foregroundConfigInstance.getNotification(this));
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "run service foreground with config: %s", foregroundConfigInstance);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.handler.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.liulishuo.filedownloader.util.c.holdContext(this);
        try {
            com.liulishuo.filedownloader.util.f.setMinProgressStep(com.liulishuo.filedownloader.util.e.getImpl().downloadMinProgressStep);
            com.liulishuo.filedownloader.util.f.setMinProgressTime(com.liulishuo.filedownloader.util.e.getImpl().downloadMinProgressTime);
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
        }
        g gVar = new g();
        if (com.liulishuo.filedownloader.util.e.getImpl().processNonSeparate) {
            this.handler = new e(new WeakReference(this), gVar);
        } else {
            this.handler = new d(new WeakReference(this), gVar);
        }
        d0.clearMarker();
        d0 d0Var = new d0((com.liulishuo.filedownloader.i.b) this.handler);
        this.pauseAllMarker = d0Var;
        d0Var.startPauseAllLooperCheck();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.pauseAllMarker.stopPauseAllLooperCheck();
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        this.handler.onStartCommand(intent, i8, i9);
        inspectRunServiceForeground(intent);
        return 1;
    }
}
