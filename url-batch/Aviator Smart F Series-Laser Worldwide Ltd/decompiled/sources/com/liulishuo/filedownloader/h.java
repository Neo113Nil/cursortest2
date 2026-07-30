package com.liulishuo.filedownloader;

import android.app.Notification;
import android.os.Looper;
import java.io.File;

/* loaded from: classes4.dex */
public class h {

    class a implements f {
        final /* synthetic */ int val$id;
        final /* synthetic */ Notification val$notification;

        a(int i8, Notification notification) {
            this.val$id = i8;
            this.val$notification = notification;
        }

        @Override // com.liulishuo.filedownloader.h.f
        public void connected() {
            s.getImpl().startForeground(this.val$id, this.val$notification);
        }

        @Override // com.liulishuo.filedownloader.h.f
        public Object getValue() {
            return null;
        }
    }

    class b implements f {
        private long mValue;
        final /* synthetic */ int val$id;

        b(int i8) {
            this.val$id = i8;
        }

        @Override // com.liulishuo.filedownloader.h.f
        public void connected() {
            this.mValue = s.getImpl().getSoFar(this.val$id);
        }

        @Override // com.liulishuo.filedownloader.h.f
        public Object getValue() {
            return Long.valueOf(this.mValue);
        }
    }

    class c implements f {
        private long mValue;
        final /* synthetic */ int val$id;

        c(int i8) {
            this.val$id = i8;
        }

        @Override // com.liulishuo.filedownloader.h.f
        public void connected() {
            this.mValue = s.getImpl().getTotal(this.val$id);
        }

        @Override // com.liulishuo.filedownloader.h.f
        public Object getValue() {
            return Long.valueOf(this.mValue);
        }
    }

    class d implements f {
        private byte mValue;
        final /* synthetic */ int val$id;
        final /* synthetic */ String val$path;

        d(int i8, String str) {
            this.val$id = i8;
            this.val$path = str;
        }

        @Override // com.liulishuo.filedownloader.h.f
        public void connected() {
            this.mValue = s.getImpl().getStatus(this.val$id, this.val$path);
        }

        @Override // com.liulishuo.filedownloader.h.f
        public Object getValue() {
            return Byte.valueOf(this.mValue);
        }
    }

    static class e implements Runnable {
        private boolean mIsFinished = false;
        private final f mSubscriber;

        e(f fVar) {
            this.mSubscriber = fVar;
        }

        public boolean isFinished() {
            return this.mIsFinished;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                this.mSubscriber.connected();
                this.mIsFinished = true;
                notifyAll();
            }
        }
    }

    interface f {
        void connected();

        Object getValue();
    }

    private void wait(f fVar) {
        e eVar = new e(fVar);
        synchronized (eVar) {
            s.getImpl().bindService(eVar);
            if (!eVar.isFinished()) {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    throw new IllegalThreadStateException("Sorry, FileDownloader can not block the main thread, because the system is also  callbacks ServiceConnection#onServiceConnected method in the main thread.");
                }
                try {
                    eVar.wait(200000L);
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
        }
    }

    public long getSoFar(int i8) {
        if (s.getImpl().isServiceConnected()) {
            return s.getImpl().getSoFar(i8);
        }
        b bVar = new b(i8);
        wait(bVar);
        return ((Long) bVar.getValue()).longValue();
    }

    public byte getStatus(int i8, String str) {
        if (s.getImpl().isServiceConnected()) {
            return s.getImpl().getStatus(i8, str);
        }
        if (str != null && new File(str).exists()) {
            return (byte) -3;
        }
        d dVar = new d(i8, str);
        wait(dVar);
        return ((Byte) dVar.getValue()).byteValue();
    }

    public long getTotal(int i8) {
        if (s.getImpl().isServiceConnected()) {
            return s.getImpl().getTotal(i8);
        }
        c cVar = new c(i8);
        wait(cVar);
        return ((Long) cVar.getValue()).longValue();
    }

    public void startForeground(int i8, Notification notification) {
        if (s.getImpl().isServiceConnected()) {
            s.getImpl().startForeground(i8, notification);
        } else {
            wait(new a(i8, notification));
        }
    }
}
