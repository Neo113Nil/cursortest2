package com.bytedance.adsdk.fs.hhw;

import android.view.Choreographer;
import com.bytedance.adsdk.fs.nps;

/* loaded from: classes14.dex */
public class zn extends zmn implements Choreographer.FrameCallback {
    private nps iv;
    private float fs = 1.0f;
    private boolean zn = false;
    private long fb = 0;
    private float btk = 0.0f;
    private float hhw = 0.0f;
    private int nps = 0;
    private float zg = -2.1474836E9f;
    private float bvs = 2.1474836E9f;
    protected boolean zmn = false;
    private boolean rc = false;

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(hhw());
    }

    public float hhw() {
        nps npsVar = this.iv;
        if (npsVar == null) {
            return 0.0f;
        }
        return (this.hhw - npsVar.hhw()) / (this.iv.nps() - this.iv.hhw());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float cn;
        float cyb;
        float cn2;
        if (this.iv == null) {
            return 0.0f;
        }
        if (iqz()) {
            cn = cyb() - this.hhw;
            cyb = cyb();
            cn2 = cn();
        } else {
            cn = this.hhw - cn();
            cyb = cyb();
            cn2 = cn();
        }
        return cn / (cyb - cn2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        nps npsVar = this.iv;
        if (npsVar == null) {
            return 0L;
        }
        return (long) npsVar.btk();
    }

    public float nps() {
        return this.hhw;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.zmn;
    }

    public void zn(boolean z) {
        this.rc = z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        olo();
        if (this.iv == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.fs.btk.zmn("LottieValueAnimator#doFrame");
        float kw = (this.fb != 0 ? j - r1 : 0L) / kw();
        float f = this.btk;
        if (iqz()) {
            kw = -kw;
        }
        float f2 = f + kw;
        boolean zn = btk.zn(f2, cn(), cyb());
        float f3 = this.btk;
        float fs = btk.fs(f2, cn(), cyb());
        this.btk = fs;
        if (this.rc) {
            fs = (float) Math.floor(fs);
        }
        this.hhw = fs;
        this.fb = j;
        if (!this.rc || this.btk != f3) {
            zn();
        }
        if (!zn) {
            if (getRepeatCount() != -1 && this.nps >= getRepeatCount()) {
                float cn = this.fs < 0.0f ? cn() : cyb();
                this.btk = cn;
                this.hhw = cn;
                kgc();
                fs(iqz());
            } else {
                zmn();
                this.nps++;
                if (getRepeatMode() == 2) {
                    this.zn = !this.zn;
                    bvs();
                } else {
                    float cyb = iqz() ? cyb() : cn();
                    this.btk = cyb;
                    this.hhw = cyb;
                }
                this.fb = j;
            }
        }
        phc();
        com.bytedance.adsdk.fs.btk.fs("LottieValueAnimator#doFrame");
    }

    private float kw() {
        nps npsVar = this.iv;
        if (npsVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / npsVar.klz()) / Math.abs(this.fs);
    }

    public void zg() {
        this.iv = null;
        this.zg = -2.1474836E9f;
        this.bvs = 2.1474836E9f;
    }

    public void zmn(nps npsVar) {
        boolean z = this.iv == null;
        this.iv = npsVar;
        if (z) {
            zmn(Math.max(this.zg, npsVar.hhw()), Math.min(this.bvs, npsVar.nps()));
        } else {
            zmn((int) npsVar.hhw(), (int) npsVar.nps());
        }
        float f = this.hhw;
        this.hhw = 0.0f;
        this.btk = 0.0f;
        zmn((int) f);
        zn();
    }

    public void zmn(float f) {
        if (this.btk == f) {
            return;
        }
        float fs = btk.fs(f, cn(), cyb());
        this.btk = fs;
        if (this.rc) {
            fs = (float) Math.floor(fs);
        }
        this.hhw = fs;
        this.fb = 0L;
        zn();
    }

    public void zmn(int i) {
        zmn(i, (int) this.bvs);
    }

    public void fs(float f) {
        zmn(this.zg, f);
    }

    public void zmn(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        nps npsVar = this.iv;
        float hhw = npsVar == null ? -3.4028235E38f : npsVar.hhw();
        nps npsVar2 = this.iv;
        float nps = npsVar2 == null ? Float.MAX_VALUE : npsVar2.nps();
        float fs = btk.fs(f, hhw, nps);
        float fs2 = btk.fs(f2, hhw, nps);
        if (fs == this.zg && fs2 == this.bvs) {
            return;
        }
        this.zg = fs;
        this.bvs = fs2;
        zmn((int) btk.fs(this.hhw, fs, fs2));
    }

    public void bvs() {
        zn(-iv());
    }

    public void zn(float f) {
        this.fs = f;
    }

    public float iv() {
        return this.fs;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.zn) {
            return;
        }
        this.zn = false;
        bvs();
    }

    public void rc() {
        this.zmn = true;
        zmn(iqz());
        zmn((int) (iqz() ? cyb() : cn()));
        this.fb = 0L;
        this.nps = 0;
        olo();
    }

    public void klz() {
        kgc();
        fs(iqz());
    }

    public void mw() {
        kgc();
        fb();
    }

    public void rt() {
        this.zmn = true;
        olo();
        this.fb = 0L;
        if (iqz() && nps() == cn()) {
            zmn(cyb());
        } else if (!iqz() && nps() == cyb()) {
            zmn(cn());
        }
        btk();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        fs();
        kgc();
    }

    private boolean iqz() {
        return iv() < 0.0f;
    }

    public float cn() {
        nps npsVar = this.iv;
        if (npsVar == null) {
            return 0.0f;
        }
        float f = this.zg;
        return f == -2.1474836E9f ? npsVar.hhw() : f;
    }

    public float cyb() {
        nps npsVar = this.iv;
        if (npsVar == null) {
            return 0.0f;
        }
        float f = this.bvs;
        return f == 2.1474836E9f ? npsVar.nps() : f;
    }

    @Override // com.bytedance.adsdk.fs.hhw.zmn
    void fs() {
        super.fs();
        fs(iqz());
    }

    protected void olo() {
        if (isRunning()) {
            fb(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void kgc() {
        fb(true);
    }

    protected void fb(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.zmn = false;
        }
    }

    private void phc() {
        if (this.iv == null) {
            return;
        }
        float f = this.hhw;
        if (f < this.zg || f > this.bvs) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.zg), Float.valueOf(this.bvs), Float.valueOf(this.hhw)));
        }
    }
}
