package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Window;
import androidx.work.WorkRequest;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ActivityLifecycleListener.java */
/* loaded from: classes2.dex */
public class pvs implements Application.ActivityLifecycleCallbacks {
    public static long icD = 0;
    public static boolean pvs = false;
    public static long vG;
    private volatile WeakReference<Activity> Ju;
    private final AtomicBoolean Jd = new AtomicBoolean(false);
    private final RunnableC0095pvs NB = new RunnableC0095pvs();
    private final Jd sUS = new Jd();
    private final vG yiw = new vG();
    private final icD so = new icD();
    private int Mxy = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.pvs>> Wyp = new CopyOnWriteArrayList<>();
    private HandlerThread qh = null;
    private Handler kj = null;
    private final LinkedList<Activity> IP = new LinkedList<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public pvs() {
        vG();
    }

    private void vG() {
        HandlerThread handlerThread = new HandlerThread("lifecycle", 10);
        this.qh = handlerThread;
        handlerThread.start();
        this.kj = new Handler(this.qh.getLooper());
    }

    private void pvs(Runnable runnable) {
        if (!this.qh.isAlive()) {
            vG();
        }
        this.kj.postDelayed(runnable, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.IP.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.Mxy++;
        this.kj.removeCallbacks(this.so);
        if (this.Jd.get()) {
            pvs(this.so);
        }
        this.Jd.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        pvs(this.sUS);
        if (!pvs) {
            icD = System.currentTimeMillis();
            pvs = true;
        }
        this.Ju = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = this.Mxy - 1;
        this.Mxy = i;
        if (i < 0) {
            this.Mxy = 0;
        }
        if (ApmHelper.isIsInit()) {
            pvs(this.yiw);
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.pvs$pvs, reason: collision with other inner class name */
    static class RunnableC0095pvs implements Runnable {
        RunnableC0095pvs() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ae.vG(new com.bytedance.sdk.component.so.so("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.pvs.pvs.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    class Jd implements Runnable {
        Jd() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.Ju.icD().removeMessages(1001);
            if (com.bytedance.sdk.openadsdk.core.mnm.pvs() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.sUS.pvs.icD();
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    class vG implements Runnable {
        vG() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler icD = com.bytedance.sdk.openadsdk.core.Ju.icD();
                Message obtain = Message.obtain(icD, pvs.this.NB);
                obtain.what = 1001;
                icD.sendMessageDelayed(obtain, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            }
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    private static class icD implements Runnable {
        private icD() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().sR().pvs() || !com.bytedance.sdk.component.utils.mnm.so(com.bytedance.sdk.openadsdk.core.mnm.pvs())) {
                return;
            }
            com.bytedance.sdk.openadsdk.icD.pvs.Jd.pvs(com.bytedance.sdk.openadsdk.core.qh.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.Mxy <= 0) {
            this.Jd.set(true);
        }
        if (pvs()) {
            pvs = false;
            com.bytedance.sdk.openadsdk.core.Ju.icD.set(false);
            vG = System.currentTimeMillis();
            pvs(this.so);
        }
        pvs(new NB(icD, vG, pvs()));
    }

    /* compiled from: ActivityLifecycleListener.java */
    public class NB implements Runnable {
        private boolean Jd;
        private long icD;
        private long vG;

        public NB(long j, long j2, boolean z) {
            this.icD = j;
            this.vG = j2;
            this.Jd = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.Jd) {
                com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs(this.icD / 1000, this.vG / 1000);
            }
            pvs.this.Jd();
        }
    }

    public void pvs(com.bytedance.sdk.component.adexpress.pvs pvsVar) {
        this.Wyp.add(new WeakReference<>(pvsVar));
    }

    public boolean icD(com.bytedance.sdk.component.adexpress.pvs pvsVar) {
        return this.Wyp.remove(new WeakReference(pvsVar));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.Wyp != null && this.Wyp.size() > 0) {
            Iterator<WeakReference<com.bytedance.sdk.component.adexpress.pvs>> it = this.Wyp.iterator();
            while (it.hasNext()) {
                WeakReference<com.bytedance.sdk.component.adexpress.pvs> next = it.next();
                if (next != null && next.get() != null) {
                    try {
                        next.get().pvs(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.Ju != null && this.Ju.get() == activity) {
            this.Ju = null;
        }
        this.IP.remove(activity);
    }

    public boolean pvs() {
        return this.Jd.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jd() {
        com.bytedance.sdk.openadsdk.icD.pvs.pvs.pvs();
    }

    public boolean pvs(boolean z) {
        Activity activity;
        Window window;
        return (this.Ju == null || (activity = this.Ju.get()) == null || (window = activity.getWindow()) == null) ? z : window.getDecorView().hasWindowFocus();
    }

    public Activity icD() {
        if (this.IP.isEmpty()) {
            return null;
        }
        return this.IP.getFirst();
    }
}
