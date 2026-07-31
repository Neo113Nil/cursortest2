package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class bvs implements rt, Runnable {
    private long btk;
    private cn bvs;
    private final Activity fs;
    private boolean hhw;
    private final zmn nps;
    private boolean zg;
    private int fb = 5000;
    private final AtomicBoolean iv = new AtomicBoolean(false);
    private final Handler zn = new Handler(Looper.getMainLooper());
    private View zmn = btk();

    public interface zmn {
        void fs();

        View zmn();
    }

    public static rt zmn(Activity activity, zmn zmnVar) {
        return new bvs(activity, zmnVar);
    }

    private bvs(Activity activity, zmn zmnVar) {
        this.nps = zmnVar;
        this.fs = activity;
    }

    private View btk() {
        zmn zmnVar = this.nps;
        if (zmnVar != null) {
            return zmnVar.zmn();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rt
    public void zmn(long j) {
        this.iv.get();
        if (this.iv.compareAndSet(false, true)) {
            if (j < 0) {
                j = 0;
            }
            this.fb = (int) (this.fb + j);
            hhw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rt
    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, long j) {
        if (fsVar == null) {
            return;
        }
        if (j < 0) {
            j = 0;
        }
        int zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn(fsVar);
        if (zmn2 >= 0) {
            zmn(zmn2);
            zmn(j);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rt
    public void zmn() {
        if (this.btk == 0 || !this.zg) {
            return;
        }
        hhw();
    }

    private void hhw() {
        this.zg = false;
        this.btk = SystemClock.elapsedRealtime();
        Handler handler = this.zn;
        if (handler != null) {
            handler.postDelayed(this, this.fb);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rt
    public void fs() {
        if (this.btk <= 0 || this.hhw) {
            return;
        }
        if (!this.zg) {
            this.fb = (int) (this.fb - (SystemClock.elapsedRealtime() - this.btk));
        }
        this.zg = true;
        if (this.fb <= 0) {
            nps();
            return;
        }
        Handler handler = this.zn;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        nps();
    }

    private void nps() {
        Activity activity;
        View childAt;
        if (this.hhw || (activity = this.fs) == null || activity.isFinishing() || this.fs.isDestroyed()) {
            return;
        }
        if (this.zmn == null) {
            this.zmn = btk();
        }
        View view = this.zmn;
        if (view != null) {
            if (fs(view)) {
                zmn(this.zmn);
                View view2 = this.zmn;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.zmn).getChildAt(0)) != null && fs(childAt)) {
                    zmn(childAt);
                }
                zmn zmnVar = this.nps;
                if (zmnVar != null) {
                    zmnVar.fs();
                }
                cn cnVar = this.bvs;
                if (cnVar != null) {
                    cnVar.zmn();
                }
            }
            zg();
        }
        this.hhw = true;
    }

    private void zg() {
        ViewParent parent = this.zmn.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).indexOfChild(this.zmn) != r0.getChildCount() - 1) {
                this.zmn.bringToFront();
            }
        }
    }

    private void zmn(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean fs(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rt
    public void zn() {
        if (this.hhw) {
            return;
        }
        this.hhw = true;
        Handler handler = this.zn;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rt
    public void fb() {
        this.iv.set(false);
        this.zg = false;
        this.hhw = false;
        this.fb = 0;
        Handler handler = this.zn;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rt
    public void zmn(int i) {
        this.fb = i;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rt
    public void zmn(cn cnVar) {
        this.bvs = cnVar;
    }
}
