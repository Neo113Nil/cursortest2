package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CloseButtonController.java */
/* loaded from: classes2.dex */
public class sUS implements qh, Runnable {
    private long Jd;
    private long NB;
    private final Activity icD;
    private boolean sUS;
    private boolean so;
    private final pvs yiw;
    private final AtomicBoolean Mxy = new AtomicBoolean(false);
    private final Handler vG = new Handler(Looper.getMainLooper());
    private View pvs = Jd();

    /* compiled from: CloseButtonController.java */
    public interface pvs {
        void icD();

        View pvs();
    }

    public static qh pvs(Activity activity, pvs pvsVar) {
        int RKd = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().RKd();
        if (RKd < 0) {
            return new qh() { // from class: com.bytedance.sdk.openadsdk.utils.sUS.1
                @Override // com.bytedance.sdk.openadsdk.utils.qh
                public void icD() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.qh
                public void pvs() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.qh
                public void pvs(long j) {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.qh
                public void vG() {
                }
            };
        }
        return new sUS(activity, Math.min(RKd, 50) * 1000, pvsVar);
    }

    private sUS(Activity activity, int i, pvs pvsVar) {
        this.yiw = pvsVar;
        this.icD = activity;
        this.Jd = i;
    }

    private View Jd() {
        pvs pvsVar = this.yiw;
        if (pvsVar != null) {
            return pvsVar.pvs();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.qh
    public void pvs(long j) {
        if (this.Mxy.compareAndSet(false, true)) {
            if (j < 0) {
                j = 0;
            }
            this.Jd += j;
            NB();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.qh
    public void pvs() {
        if (this.NB == 0 || !this.so) {
            return;
        }
        NB();
    }

    private void NB() {
        this.so = false;
        this.NB = SystemClock.elapsedRealtime();
        Handler handler = this.vG;
        if (handler != null) {
            handler.postDelayed(this, this.Jd);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.qh
    public void icD() {
        if (this.NB <= 0 || this.sUS) {
            return;
        }
        if (!this.so) {
            this.Jd -= SystemClock.elapsedRealtime() - this.NB;
        }
        this.so = true;
        if (this.Jd <= 0) {
            sUS();
            return;
        }
        Handler handler = this.vG;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        sUS();
    }

    private void sUS() {
        Activity activity;
        View childAt;
        if (this.sUS || (activity = this.icD) == null || activity.isFinishing() || this.icD.isDestroyed()) {
            return;
        }
        if (this.pvs == null) {
            this.pvs = Jd();
        }
        View view = this.pvs;
        if (view != null) {
            if (icD(view)) {
                pvs(this.pvs);
                View view2 = this.pvs;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.pvs).getChildAt(0)) != null && icD(childAt)) {
                    pvs(childAt);
                }
                pvs pvsVar = this.yiw;
                if (pvsVar != null) {
                    pvsVar.icD();
                }
            }
            yiw();
        }
        this.sUS = true;
    }

    private void yiw() {
        ViewParent parent = this.pvs.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).indexOfChild(this.pvs) != r0.getChildCount() - 1) {
                this.pvs.bringToFront();
            }
        }
    }

    private void pvs(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean icD(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.qh
    public void vG() {
        if (this.sUS) {
            return;
        }
        this.sUS = true;
        Handler handler = this.vG;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
            }
        }
    }
}
