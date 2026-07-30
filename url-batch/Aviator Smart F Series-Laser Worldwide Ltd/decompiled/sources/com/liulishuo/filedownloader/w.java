package com.liulishuo.filedownloader;

import android.app.Notification;
import android.content.Context;
import com.liulishuo.filedownloader.model.FileDownloadHeader;

/* loaded from: classes4.dex */
public interface w {
    void bindStartByContext(Context context);

    void bindStartByContext(Context context, Runnable runnable);

    void clearAllTaskData();

    boolean clearTaskData(int i8);

    long getSofar(int i8);

    byte getStatus(int i8);

    long getTotal(int i8);

    boolean isConnected();

    boolean isDownloading(String str, String str2);

    boolean isIdle();

    boolean isRunServiceForeground();

    boolean pause(int i8);

    void pauseAllTasks();

    boolean setMaxNetworkThreadCount(int i8);

    boolean start(String str, String str2, boolean z7, int i8, int i9, int i10, boolean z8, FileDownloadHeader fileDownloadHeader, boolean z9);

    void startForeground(int i8, Notification notification);

    void stopForeground(boolean z7);

    void unbindByContext(Context context);
}
