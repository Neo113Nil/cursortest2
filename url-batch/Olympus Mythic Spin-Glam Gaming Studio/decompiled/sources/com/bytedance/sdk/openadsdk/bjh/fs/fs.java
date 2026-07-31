package com.bytedance.sdk.openadsdk.bjh.fs;

import android.view.View;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes8.dex */
public abstract class fs {
    private final AtomicBoolean btk;
    private volatile boolean bvs = false;
    private final AtomicLong fb;
    protected nqi fs;
    private final btk.zmn hhw;
    private final int nps;
    private final Integer zg;
    protected WeakReference<View> zmn;
    protected final AtomicBoolean zn;

    protected abstract void fs(int i);

    public abstract int hhw();

    protected abstract boolean zn();

    public static fs zmn(boolean z, Integer num, View view, nqi nqiVar, btk.zmn zmnVar) {
        return z ? new zg(num, view, nqiVar, zmnVar) : new zn(num, view, nqiVar, zmnVar);
    }

    public fs(Integer num, View view, nqi nqiVar, int i, btk.zmn zmnVar) {
        this.zg = num;
        this.nps = i;
        this.fs = nqiVar;
        this.hhw = zmnVar;
        zmn(view);
        this.zn = new AtomicBoolean(false);
        this.fb = new AtomicLong(-1L);
        this.btk = new AtomicBoolean(false);
    }

    public void zmn() {
        if (this.zn.compareAndSet(false, true)) {
            nps.zmn(this);
        }
    }

    public int fs() {
        if (bvs()) {
            return 1;
        }
        WeakReference<View> weakReference = this.zmn;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.bvs) {
            return 3;
        }
        if (rc().equals(view.getTag(33554433))) {
            return (rc().equals(view.getTag(33554433)) && zn()) ? 1 : 2;
        }
        iv();
        btk.fs(rc());
        return 3;
    }

    protected void fb() {
        if (this.btk.compareAndSet(false, true)) {
            fb.zmn(this.fs, btk(), this.hhw);
        }
    }

    protected zmn btk() {
        WeakReference<View> weakReference = this.zmn;
        if (weakReference == null) {
            return new zmn(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        if (view == null) {
            return new zmn(0, 0, 0.0f);
        }
        return new zmn(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void nps() {
        if (bvs()) {
            return;
        }
        if (!this.zn.get()) {
            zg();
        } else if (!this.fb.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.fb.get() >= this.nps) {
            fb();
        }
    }

    public void zg() {
        this.fb.set(-1L);
    }

    public boolean bvs() {
        return this.btk.get();
    }

    public void iv() {
        this.bvs = true;
        nps.fs(this);
    }

    public void zmn(int i) {
        if (i == 4) {
            zmn();
            return;
        }
        if (i == 8) {
            mw();
        } else if (i == 9) {
            fb();
        } else {
            fs(i);
        }
    }

    public Integer rc() {
        return this.zg;
    }

    public boolean klz() {
        return this.zn.get();
    }

    public void mw() {
        this.zn.set(false);
        zg();
    }

    public void zmn(View view) {
        if (view != null) {
            view.setTag(33554433, rc());
        }
        this.zmn = new WeakReference<>(view);
    }
}
