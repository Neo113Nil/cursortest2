package com.bytedance.adsdk.lottie.sUS;

import android.view.Choreographer;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes.dex */
public class vG extends pvs implements Choreographer.FrameCallback {
    private com.bytedance.adsdk.lottie.sUS Wyp;
    private float icD = 1.0f;
    private boolean vG = false;
    private long Jd = 0;
    private float NB = 0.0f;
    private float sUS = 0.0f;
    private int yiw = 0;
    private float so = -2.1474836E9f;
    private float Mxy = 2.1474836E9f;
    protected boolean pvs = false;
    private boolean qh = false;

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(sUS());
    }

    public float sUS() {
        com.bytedance.adsdk.lottie.sUS sus = this.Wyp;
        if (sus == null) {
            return 0.0f;
        }
        return (this.sUS - sus.sUS()) / (this.Wyp.yiw() - this.Wyp.sUS());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float bNS;
        float mnm;
        float bNS2;
        if (this.Wyp == null) {
            return 0.0f;
        }
        if (uc()) {
            bNS = mnm() - this.sUS;
            mnm = mnm();
            bNS2 = bNS();
        } else {
            bNS = this.sUS - bNS();
            mnm = mnm();
            bNS2 = bNS();
        }
        return bNS / (mnm - bNS2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.bytedance.adsdk.lottie.sUS sus = this.Wyp;
        if (sus == null) {
            return 0L;
        }
        return (long) sus.NB();
    }

    public float yiw() {
        return this.sUS;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.pvs;
    }

    public void vG(boolean z) {
        this.qh = z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        vA();
        if (this.Wyp == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.lottie.NB.pvs("LottieValueAnimator#doFrame");
        float zM = (this.Jd != 0 ? j - r1 : 0L) / zM();
        float f = this.NB;
        if (uc()) {
            zM = -zM;
        }
        float f2 = f + zM;
        boolean z = !NB.vG(f2, bNS(), mnm());
        float f3 = this.NB;
        float icD = NB.icD(f2, bNS(), mnm());
        this.NB = icD;
        if (this.qh) {
            icD = (float) Math.floor(icD);
        }
        this.sUS = icD;
        this.Jd = j;
        if (!this.qh || this.NB != f3) {
            vG();
        }
        if (z) {
            if (getRepeatCount() != -1 && this.yiw >= getRepeatCount()) {
                float bNS = this.icD < 0.0f ? bNS() : mnm();
                this.NB = bNS;
                this.sUS = bNS;
                cR();
                icD(uc());
            } else {
                pvs();
                this.yiw++;
                if (getRepeatMode() == 2) {
                    this.vG = !this.vG;
                    Mxy();
                } else {
                    float mnm = uc() ? mnm() : bNS();
                    this.NB = mnm;
                    this.sUS = mnm;
                }
                this.Jd = j;
            }
        }
        rCZ();
        com.bytedance.adsdk.lottie.NB.icD("LottieValueAnimator#doFrame");
    }

    private float zM() {
        com.bytedance.adsdk.lottie.sUS sus = this.Wyp;
        if (sus == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / sus.so()) / Math.abs(this.icD);
    }

    public void so() {
        this.Wyp = null;
        this.so = -2.1474836E9f;
        this.Mxy = 2.1474836E9f;
    }

    public void pvs(com.bytedance.adsdk.lottie.sUS sus) {
        boolean z = this.Wyp == null;
        this.Wyp = sus;
        if (z) {
            pvs(Math.max(this.so, sus.sUS()), Math.min(this.Mxy, sus.yiw()));
        } else {
            pvs((int) sus.sUS(), (int) sus.yiw());
        }
        float f = this.sUS;
        this.sUS = 0.0f;
        this.NB = 0.0f;
        pvs((int) f);
        vG();
    }

    public void pvs(float f) {
        if (this.NB == f) {
            return;
        }
        float icD = NB.icD(f, bNS(), mnm());
        this.NB = icD;
        if (this.qh) {
            icD = (float) Math.floor(icD);
        }
        this.sUS = icD;
        this.Jd = 0L;
        vG();
    }

    public void pvs(int i) {
        pvs(i, (int) this.Mxy);
    }

    public void icD(float f) {
        pvs(this.so, f);
    }

    public void pvs(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        com.bytedance.adsdk.lottie.sUS sus = this.Wyp;
        float sUS = sus == null ? -3.4028235E38f : sus.sUS();
        com.bytedance.adsdk.lottie.sUS sus2 = this.Wyp;
        float yiw = sus2 == null ? Float.MAX_VALUE : sus2.yiw();
        float icD = NB.icD(f, sUS, yiw);
        float icD2 = NB.icD(f2, sUS, yiw);
        if (icD == this.so && icD2 == this.Mxy) {
            return;
        }
        this.so = icD;
        this.Mxy = icD2;
        pvs((int) NB.icD(this.sUS, icD, icD2));
    }

    public void Mxy() {
        vG(-Wyp());
    }

    public void vG(float f) {
        this.icD = f;
    }

    public float Wyp() {
        return this.icD;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.vG) {
            return;
        }
        this.vG = false;
        Mxy();
    }

    public void qh() {
        this.pvs = true;
        pvs(uc());
        pvs((int) (uc() ? mnm() : bNS()));
        this.Jd = 0L;
        this.yiw = 0;
        vA();
    }

    public void kj() {
        cR();
        icD(uc());
    }

    public void Ju() {
        cR();
        Jd();
    }

    public void IP() {
        this.pvs = true;
        vA();
        this.Jd = 0L;
        if (uc() && yiw() == bNS()) {
            pvs(mnm());
        } else if (!uc() && yiw() == mnm()) {
            pvs(bNS());
        }
        NB();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        icD();
        cR();
    }

    private boolean uc() {
        return Wyp() < 0.0f;
    }

    public float bNS() {
        com.bytedance.adsdk.lottie.sUS sus = this.Wyp;
        if (sus == null) {
            return 0.0f;
        }
        float f = this.so;
        return f == -2.1474836E9f ? sus.sUS() : f;
    }

    public float mnm() {
        com.bytedance.adsdk.lottie.sUS sus = this.Wyp;
        if (sus == null) {
            return 0.0f;
        }
        float f = this.Mxy;
        return f == 2.1474836E9f ? sus.yiw() : f;
    }

    @Override // com.bytedance.adsdk.lottie.sUS.pvs
    void icD() {
        super.icD();
        icD(uc());
    }

    protected void vA() {
        if (isRunning()) {
            Jd(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void cR() {
        Jd(true);
    }

    protected void Jd(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.pvs = false;
        }
    }

    private void rCZ() {
        if (this.Wyp == null) {
            return;
        }
        float f = this.sUS;
        if (f < this.so || f > this.Mxy) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.so), Float.valueOf(this.Mxy), Float.valueOf(this.sUS)));
        }
    }
}
