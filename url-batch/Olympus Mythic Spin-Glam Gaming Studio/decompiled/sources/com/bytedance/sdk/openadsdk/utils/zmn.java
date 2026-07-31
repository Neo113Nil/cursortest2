package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class zmn implements Application.ActivityLifecycleCallbacks {
    public static long fs;
    public static boolean zmn;
    public static long zn;
    private final fb bvs;
    private volatile WeakReference<Activity> rt;
    private final fb zg;
    private final AtomicBoolean fb = new AtomicBoolean(false);
    private final RunnableC0209zmn btk = new RunnableC0209zmn();
    private final hhw hhw = new hhw();
    private final btk nps = new btk();
    private int iv = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.zmn>> rc = new CopyOnWriteArrayList<>();
    private HandlerThread klz = null;
    private Handler mw = null;
    private final LinkedList<Activity> cn = new LinkedList<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public zmn() {
        this.zg = new fs();
        this.bvs = new zn();
        zn();
    }

    private void zn() {
        this.klz = com.bytedance.sdk.component.utils.zg.zmn("lifecycle", 10);
        this.mw = new Handler(this.klz.getLooper());
    }

    private void zmn(Runnable runnable) {
        if (!this.klz.isAlive()) {
            zn();
        }
        this.mw.postDelayed(runnable, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.cn.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (jy.fs() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                if (decorView.isAttachedToWindow()) {
                    if (jy.fb(activity)) {
                        jy.zmn(true);
                    }
                } else {
                    decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.zmn.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(@NonNull View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                            if (jy.fb(activity)) {
                                jy.zmn(true);
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(@NonNull View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn("TTAD.ActivityLifecycle", th);
        }
        this.iv++;
        if (this.fb.get()) {
            this.mw.removeCallbacks(this.bvs);
            this.mw.removeCallbacks(this.zg);
            zmn(this.bvs);
        }
        this.fb.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        zmn(this.hhw);
        if (!zmn) {
            fs = System.currentTimeMillis();
            zmn = true;
        }
        this.rt = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = this.iv - 1;
        this.iv = i;
        if (i < 0) {
            this.iv = 0;
        }
        if (ApmHelper.isIsInit()) {
            zmn(this.nps);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.zmn$zmn, reason: collision with other inner class name */
    static class RunnableC0209zmn implements Runnable {
        RunnableC0209zmn() {
        }

        @Override // java.lang.Runnable
        public void run() {
            nu.fs(new com.bytedance.sdk.component.zg.fs.zn("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.zmn.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    class hhw implements Runnable {
        hhw() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.cn.fs().removeMessages(1001);
            com.bytedance.sdk.openadsdk.core.kgc.zmn();
        }
    }

    class btk implements Runnable {
        btk() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler fs = com.bytedance.sdk.openadsdk.core.cn.fs();
                Message obtain = Message.obtain(fs, zmn.this.btk);
                obtain.what = 1001;
                fs.sendMessageDelayed(obtain, 30000L);
            }
        }
    }

    private static class fb implements Runnable {
        private fb() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.fb.zmn.iv wq = com.bytedance.sdk.openadsdk.core.settings.rc.fs().wq();
            if (wq == null || wq.zmn() || !com.bytedance.sdk.component.utils.kgc.zg(com.bytedance.sdk.openadsdk.core.kgc.zmn())) {
                return;
            }
            com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(com.bytedance.sdk.openadsdk.core.mw.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()));
        }
    }

    private static class zn extends fb {
        private zn() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.zmn.fb, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.utils.btk.zmn();
        }
    }

    private static class fs extends fb {
        private fs() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.zmn.fb, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.hhw.fs.zmn().fs();
            com.bytedance.sdk.openadsdk.utils.btk.fs();
            com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.iv <= 0) {
            this.fb.set(true);
        }
        if (zmn()) {
            zmn = false;
            com.bytedance.sdk.openadsdk.core.cn.fs.set(false);
            zn = System.currentTimeMillis();
            this.mw.removeCallbacks(this.bvs);
            this.mw.removeCallbacks(this.zg);
            zmn(this.zg);
        }
        zmn(new nps(fs, zn, zmn()));
    }

    public class nps implements Runnable {
        private boolean fb;
        private long fs;
        private long zn;

        public nps(long j, long j2, boolean z) {
            this.fs = j;
            this.zn = j2;
            this.fb = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.fb) {
                com.bytedance.sdk.openadsdk.cyb.fb.zmn().zmn(this.fs / 1000, this.zn / 1000);
            }
        }
    }

    public void zmn(com.bytedance.sdk.component.adexpress.zmn zmnVar) {
        this.rc.add(new WeakReference<>(zmnVar));
    }

    public boolean fs(com.bytedance.sdk.component.adexpress.zmn zmnVar) {
        return this.rc.remove(new WeakReference(zmnVar));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.rc != null && this.rc.size() > 0) {
            Iterator<WeakReference<com.bytedance.sdk.component.adexpress.zmn>> it = this.rc.iterator();
            while (it.hasNext()) {
                WeakReference<com.bytedance.sdk.component.adexpress.zmn> next = it.next();
                if (next != null && next.get() != null) {
                    try {
                        next.get().zmn(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.rt != null && this.rt.get() == activity) {
            this.rt = null;
        }
        this.cn.remove(activity);
    }

    public boolean zmn() {
        return this.fb.get();
    }

    public boolean zmn(boolean z) {
        Window window;
        if (this.rt == null) {
            return z;
        }
        try {
            Activity activity = this.rt.get();
            return (activity == null || (window = activity.getWindow()) == null) ? z : window.getDecorView().hasWindowFocus();
        } catch (Throwable unused) {
            return z;
        }
    }

    public Activity fs() {
        if (this.cn.isEmpty()) {
            return null;
        }
        return this.cn.getFirst();
    }
}
