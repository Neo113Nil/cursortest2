package com.bytedance.adsdk.fs.nps;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.fs.nps;

/* loaded from: classes8.dex */
public class zmn<T> {
    public final Interpolator btk;
    public PointF bvs;
    private float cn;
    private float cyb;
    public final Interpolator fb;
    public T fs;
    public final float hhw;
    private final nps iv;
    private float klz;
    private int mw;
    public Float nps;
    private float rc;
    private int rt;
    public PointF zg;
    public final T zmn;
    public final Interpolator zn;

    public zmn(nps npsVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.rc = -3987645.8f;
        this.klz = -3987645.8f;
        this.mw = 784923401;
        this.rt = 784923401;
        this.cn = Float.MIN_VALUE;
        this.cyb = Float.MIN_VALUE;
        this.zg = null;
        this.bvs = null;
        this.iv = npsVar;
        this.zmn = t;
        this.fs = t2;
        this.zn = interpolator;
        this.fb = null;
        this.btk = null;
        this.hhw = f;
        this.nps = f2;
    }

    public zmn(nps npsVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.rc = -3987645.8f;
        this.klz = -3987645.8f;
        this.mw = 784923401;
        this.rt = 784923401;
        this.cn = Float.MIN_VALUE;
        this.cyb = Float.MIN_VALUE;
        this.zg = null;
        this.bvs = null;
        this.iv = npsVar;
        this.zmn = t;
        this.fs = t2;
        this.zn = null;
        this.fb = interpolator;
        this.btk = interpolator2;
        this.hhw = f;
        this.nps = f2;
    }

    protected zmn(nps npsVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.rc = -3987645.8f;
        this.klz = -3987645.8f;
        this.mw = 784923401;
        this.rt = 784923401;
        this.cn = Float.MIN_VALUE;
        this.cyb = Float.MIN_VALUE;
        this.zg = null;
        this.bvs = null;
        this.iv = npsVar;
        this.zmn = t;
        this.fs = t2;
        this.zn = interpolator;
        this.fb = interpolator2;
        this.btk = interpolator3;
        this.hhw = f;
        this.nps = f2;
    }

    public zmn(T t) {
        this.rc = -3987645.8f;
        this.klz = -3987645.8f;
        this.mw = 784923401;
        this.rt = 784923401;
        this.cn = Float.MIN_VALUE;
        this.cyb = Float.MIN_VALUE;
        this.zg = null;
        this.bvs = null;
        this.iv = null;
        this.zmn = t;
        this.fs = t;
        this.zn = null;
        this.fb = null;
        this.btk = null;
        this.hhw = Float.MIN_VALUE;
        this.nps = Float.valueOf(Float.MAX_VALUE);
    }

    private zmn(T t, T t2) {
        this.rc = -3987645.8f;
        this.klz = -3987645.8f;
        this.mw = 784923401;
        this.rt = 784923401;
        this.cn = Float.MIN_VALUE;
        this.cyb = Float.MIN_VALUE;
        this.zg = null;
        this.bvs = null;
        this.iv = null;
        this.zmn = t;
        this.fs = t2;
        this.zn = null;
        this.fb = null;
        this.btk = null;
        this.hhw = Float.MIN_VALUE;
        this.nps = Float.valueOf(Float.MAX_VALUE);
    }

    public zmn<T> zmn(T t, T t2) {
        return new zmn<>(t, t2);
    }

    public float zn() {
        nps npsVar = this.iv;
        if (npsVar == null) {
            return 0.0f;
        }
        if (this.cn == Float.MIN_VALUE) {
            this.cn = (this.hhw - npsVar.hhw()) / this.iv.olo();
        }
        return this.cn;
    }

    public float fb() {
        if (this.iv == null) {
            return 1.0f;
        }
        if (this.cyb == Float.MIN_VALUE) {
            if (this.nps == null) {
                this.cyb = 1.0f;
            } else {
                this.cyb = zn() + ((this.nps.floatValue() - this.hhw) / this.iv.olo());
            }
        }
        return this.cyb;
    }

    public boolean btk() {
        return this.zn == null && this.fb == null && this.btk == null;
    }

    public boolean zmn(float f) {
        return f >= zn() && f < fb();
    }

    public float hhw() {
        if (this.rc == -3987645.8f) {
            this.rc = ((Float) this.zmn).floatValue();
        }
        return this.rc;
    }

    public float nps() {
        if (this.klz == -3987645.8f) {
            this.klz = ((Float) this.fs).floatValue();
        }
        return this.klz;
    }

    public int zg() {
        if (this.mw == 784923401) {
            this.mw = ((Integer) this.zmn).intValue();
        }
        return this.mw;
    }

    public int bvs() {
        if (this.rt == 784923401) {
            this.rt = ((Integer) this.fs).intValue();
        }
        return this.rt;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.zmn + ", endValue=" + this.fs + ", startFrame=" + this.hhw + ", endFrame=" + this.nps + ", interpolator=" + this.zn + '}';
    }
}
