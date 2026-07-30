package com.liulishuo.filedownloader;

import android.app.Notification;

/* loaded from: classes4.dex */
public class i {

    class a implements Runnable {
        final /* synthetic */ int val$id;
        final /* synthetic */ Notification val$notification;

        a(int i8, Notification notification) {
            this.val$id = i8;
            this.val$notification = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.getImpl().startForeground(this.val$id, this.val$notification);
        }
    }

    public boolean startForeground(int i8, Notification notification) {
        if (s.getImpl().isServiceConnected()) {
            s.getImpl().startForeground(i8, notification);
            return true;
        }
        s.getImpl().bindService(new a(i8, notification));
        return false;
    }
}
