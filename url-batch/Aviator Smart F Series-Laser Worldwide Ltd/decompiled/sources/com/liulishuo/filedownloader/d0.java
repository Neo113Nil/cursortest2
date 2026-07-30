package com.liulishuo.filedownloader;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public class d0 implements Handler.Callback {
    private static final String MAKER_FILE_NAME = ".filedownloader_pause_all_marker.b";
    private static final Long PAUSE_ALL_CHECKER_PERIOD = 1000L;
    private static final int PAUSE_ALL_CHECKER_WHAT = 0;
    private static File markerFile;
    private HandlerThread pauseAllChecker;
    private Handler pauseAllHandler;
    private final com.liulishuo.filedownloader.i.b serviceHandler;

    public d0(com.liulishuo.filedownloader.i.b bVar) {
        this.serviceHandler = bVar;
    }

    public static void clearMarker() {
        File markerFile2 = markerFile();
        if (markerFile2.exists()) {
            com.liulishuo.filedownloader.util.d.d(d0.class, "delete marker file " + markerFile2.delete(), new Object[0]);
        }
    }

    public static void createMarker() {
        File markerFile2 = markerFile();
        if (!markerFile2.getParentFile().exists()) {
            markerFile2.getParentFile().mkdirs();
        }
        if (markerFile2.exists()) {
            com.liulishuo.filedownloader.util.d.w(d0.class, "marker file " + markerFile2.getAbsolutePath() + " exists", new Object[0]);
            return;
        }
        try {
            com.liulishuo.filedownloader.util.d.d(d0.class, "create marker file" + markerFile2.getAbsolutePath() + cn.hutool.core.text.l.SPACE + markerFile2.createNewFile(), new Object[0]);
        } catch (IOException e8) {
            com.liulishuo.filedownloader.util.d.e(d0.class, "create marker file failed", e8);
        }
    }

    private static boolean isMarked() {
        return markerFile().exists();
    }

    private static File markerFile() {
        if (markerFile == null) {
            markerFile = new File(com.liulishuo.filedownloader.util.c.getAppContext().getCacheDir() + File.separator + MAKER_FILE_NAME);
        }
        return markerFile;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            if (isMarked()) {
                try {
                    this.serviceHandler.pauseAllTasks();
                } catch (RemoteException e8) {
                    com.liulishuo.filedownloader.util.d.e(this, e8, "pause all failed", new Object[0]);
                }
            }
            this.pauseAllHandler.sendEmptyMessageDelayed(0, PAUSE_ALL_CHECKER_PERIOD.longValue());
            return true;
        } finally {
            clearMarker();
        }
    }

    public void startPauseAllLooperCheck() {
        HandlerThread handlerThread = new HandlerThread("PauseAllChecker");
        this.pauseAllChecker = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.pauseAllChecker.getLooper(), this);
        this.pauseAllHandler = handler;
        handler.sendEmptyMessageDelayed(0, PAUSE_ALL_CHECKER_PERIOD.longValue());
    }

    public void stopPauseAllLooperCheck() {
        this.pauseAllHandler.removeMessages(0);
        this.pauseAllChecker.quit();
    }
}
