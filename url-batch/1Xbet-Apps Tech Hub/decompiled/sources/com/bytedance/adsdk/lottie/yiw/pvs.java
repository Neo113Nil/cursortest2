package com.bytedance.adsdk.lottie.yiw;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.lottie.sUS;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Keyframe.java */
/* loaded from: classes.dex */
public class pvs<T> {
    private int IP;
    public final Interpolator Jd;
    private int Ju;
    public PointF Mxy;
    public final Interpolator NB;
    private final sUS Wyp;
    private float bNS;
    public T icD;
    private float kj;
    private float mnm;
    public final T pvs;
    private float qh;
    public final float sUS;
    public PointF so;
    public final Interpolator vG;
    public Float yiw;

    public pvs(sUS sus, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.qh = -3987645.8f;
        this.kj = -3987645.8f;
        this.Ju = 784923401;
        this.IP = 784923401;
        this.bNS = Float.MIN_VALUE;
        this.mnm = Float.MIN_VALUE;
        this.so = null;
        this.Mxy = null;
        this.Wyp = sus;
        this.pvs = t;
        this.icD = t2;
        this.vG = interpolator;
        this.Jd = null;
        this.NB = null;
        this.sUS = f;
        this.yiw = f2;
    }

    public pvs(sUS sus, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.qh = -3987645.8f;
        this.kj = -3987645.8f;
        this.Ju = 784923401;
        this.IP = 784923401;
        this.bNS = Float.MIN_VALUE;
        this.mnm = Float.MIN_VALUE;
        this.so = null;
        this.Mxy = null;
        this.Wyp = sus;
        this.pvs = t;
        this.icD = t2;
        this.vG = null;
        this.Jd = interpolator;
        this.NB = interpolator2;
        this.sUS = f;
        this.yiw = f2;
    }

    protected pvs(sUS sus, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.qh = -3987645.8f;
        this.kj = -3987645.8f;
        this.Ju = 784923401;
        this.IP = 784923401;
        this.bNS = Float.MIN_VALUE;
        this.mnm = Float.MIN_VALUE;
        this.so = null;
        this.Mxy = null;
        this.Wyp = sus;
        this.pvs = t;
        this.icD = t2;
        this.vG = interpolator;
        this.Jd = interpolator2;
        this.NB = interpolator3;
        this.sUS = f;
        this.yiw = f2;
    }

    public pvs(T t) {
        this.qh = -3987645.8f;
        this.kj = -3987645.8f;
        this.Ju = 784923401;
        this.IP = 784923401;
        this.bNS = Float.MIN_VALUE;
        this.mnm = Float.MIN_VALUE;
        this.so = null;
        this.Mxy = null;
        this.Wyp = null;
        this.pvs = t;
        this.icD = t;
        this.vG = null;
        this.Jd = null;
        this.NB = null;
        this.sUS = Float.MIN_VALUE;
        this.yiw = Float.valueOf(Float.MAX_VALUE);
    }

    private pvs(T t, T t2) {
        this.qh = -3987645.8f;
        this.kj = -3987645.8f;
        this.Ju = 784923401;
        this.IP = 784923401;
        this.bNS = Float.MIN_VALUE;
        this.mnm = Float.MIN_VALUE;
        this.so = null;
        this.Mxy = null;
        this.Wyp = null;
        this.pvs = t;
        this.icD = t2;
        this.vG = null;
        this.Jd = null;
        this.NB = null;
        this.sUS = Float.MIN_VALUE;
        this.yiw = Float.valueOf(Float.MAX_VALUE);
    }

    public pvs<T> pvs(T t, T t2) {
        return new pvs<>(t, t2);
    }

    public float vG() {
        sUS sus = this.Wyp;
        if (sus == null) {
            return 0.0f;
        }
        if (this.bNS == Float.MIN_VALUE) {
            this.bNS = (this.sUS - sus.sUS()) / this.Wyp.Ju();
        }
        return this.bNS;
    }

    public float Jd() {
        if (this.Wyp == null) {
            return 1.0f;
        }
        if (this.mnm == Float.MIN_VALUE) {
            if (this.yiw == null) {
                this.mnm = 1.0f;
            } else {
                this.mnm = vG() + ((this.yiw.floatValue() - this.sUS) / this.Wyp.Ju());
            }
        }
        return this.mnm;
    }

    public boolean NB() {
        return this.vG == null && this.Jd == null && this.NB == null;
    }

    public boolean pvs(float f) {
        return f >= vG() && f < Jd();
    }

    public float sUS() {
        if (this.qh == -3987645.8f) {
            this.qh = ((Float) this.pvs).floatValue();
        }
        return this.qh;
    }

    public float yiw() {
        if (this.kj == -3987645.8f) {
            this.kj = ((Float) this.icD).floatValue();
        }
        return this.kj;
    }

    public int so() {
        if (this.Ju == 784923401) {
            this.Ju = ((Integer) this.pvs).intValue();
        }
        return this.Ju;
    }

    public int Mxy() {
        if (this.IP == 784923401) {
            this.IP = ((Integer) this.icD).intValue();
        }
        return this.IP;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.pvs + ", endValue=" + this.icD + ", startFrame=" + this.sUS + ", endFrame=" + this.yiw + ", interpolator=" + this.vG + AbstractJsonLexerKt.END_OBJ;
    }
}
