package com.bytedance.sdk.openadsdk.mnm.pvs;

import android.view.View;
import androidx.core.view.InputDeviceCompat;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.mnm.pvs.NB;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PAGBaseMrcTracker.java */
/* loaded from: classes2.dex */
public abstract class icD {
    private final AtomicLong Jd;
    private volatile boolean Mxy = false;
    private final AtomicBoolean NB;
    protected cR icD;
    protected WeakReference<View> pvs;
    private final NB.pvs sUS;
    private final Integer so;
    protected final AtomicBoolean vG;
    private final int yiw;

    protected abstract void icD(int i);

    public abstract int sUS();

    protected abstract boolean vG();

    public static icD pvs(boolean z, Integer num, View view, cR cRVar, NB.pvs pvsVar) {
        return z ? new so(num, view, cRVar, pvsVar) : new vG(num, view, cRVar, pvsVar);
    }

    public icD(Integer num, View view, cR cRVar, int i, NB.pvs pvsVar) {
        this.so = num;
        this.yiw = i;
        this.icD = cRVar;
        this.sUS = pvsVar;
        pvs(view);
        this.vG = new AtomicBoolean(false);
        this.Jd = new AtomicLong(-1L);
        this.NB = new AtomicBoolean(false);
    }

    public void pvs() {
        if (this.vG.compareAndSet(false, true)) {
            yiw.pvs(this);
        }
    }

    public int icD() {
        if (Mxy()) {
            return 1;
        }
        WeakReference<View> weakReference = this.pvs;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.Mxy) {
            return 3;
        }
        if (qh().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI))) {
            return qh().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI)) && vG() ? 1 : 2;
        }
        Wyp();
        NB.icD(qh());
        return 3;
    }

    protected void Jd() {
        if (this.NB.compareAndSet(false, true)) {
            Jd.pvs(this.icD, NB(), this.sUS);
        }
    }

    protected pvs NB() {
        WeakReference<View> weakReference = this.pvs;
        if (weakReference == null) {
            return new pvs(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        if (view == null) {
            return new pvs(0, 0, 0.0f);
        }
        return new pvs(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void yiw() {
        if (Mxy()) {
            return;
        }
        if (!this.vG.get()) {
            so();
        } else if (!this.Jd.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.Jd.get() >= this.yiw) {
            Jd();
        }
    }

    public void so() {
        this.Jd.set(-1L);
    }

    public boolean Mxy() {
        return this.NB.get();
    }

    public void Wyp() {
        this.Mxy = true;
        yiw.icD(this);
    }

    public void pvs(int i) {
        if (i == 4) {
            pvs();
            return;
        }
        if (i == 8) {
            Ju();
        } else if (i == 9) {
            Jd();
        } else {
            icD(i);
        }
    }

    public Integer qh() {
        return this.so;
    }

    public boolean kj() {
        return this.vG.get();
    }

    public void Ju() {
        this.vG.set(false);
        so();
    }

    public void pvs(View view) {
        if (view != null) {
            view.setTag(InputDeviceCompat.SOURCE_HDMI, qh());
        }
        this.pvs = new WeakReference<>(view);
    }
}
