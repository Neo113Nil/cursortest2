package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class mr implements View.OnTouchListener {
    public static final int w = ViewConfiguration.getTapTimeout();
    public final m7 f;
    public final AccelerateInterpolator g;
    public final dg h;
    public n7 i;
    public final float[] j;
    public final float[] k;
    public final int l;
    public final int m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final dg v;

    public mr(dg dgVar) {
        m7 m7Var = new m7();
        m7Var.e = Long.MIN_VALUE;
        m7Var.g = -1L;
        m7Var.f = 0L;
        this.f = m7Var;
        this.g = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.p = fArr5;
        this.h = dgVar;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.l = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.m = w;
        m7Var.a = 500;
        m7Var.b = 500;
        this.v = dgVar;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f, float f2, float f3) {
        float f4;
        float interpolation;
        float b = b(this.j[i] * f2, 0.0f, this.k[i]);
        float c = c(f2 - f, b) - c(f, b);
        AccelerateInterpolator accelerateInterpolator = this.g;
        if (c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else {
            if (c <= 0.0f) {
                f4 = 0.0f;
                if (f4 != 0.0f) {
                    return 0.0f;
                }
                float f5 = this.n[i];
                float f6 = this.o[i];
                float f7 = this.p[i];
                float f8 = f5 * f3;
                return f4 > 0.0f ? b(f4 * f8, f6, f7) : -b((-f4) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(c);
        }
        f4 = b(interpolation, -1.0f, 1.0f);
        if (f4 != 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.l;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.t && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.r) {
            this.t = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        m7 m7Var = this.f;
        int i2 = (int) (currentAnimationTimeMillis - m7Var.e);
        int i3 = m7Var.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        m7Var.i = i;
        m7Var.h = m7Var.a(currentAnimationTimeMillis);
        m7Var.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        dg dgVar;
        int count;
        m7 m7Var = this.f;
        float f = m7Var.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(m7Var.c);
        if (abs != 0 && (count = (dgVar = this.v).getCount()) != 0) {
            int childCount = dgVar.getChildCount();
            int firstVisiblePosition = dgVar.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && dgVar.getChildAt(0).getTop() >= 0)) : !(i >= count && dgVar.getChildAt(childCount - 1).getBottom() <= dgVar.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        if (this.u) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.s = true;
            this.q = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            dg dgVar = this.h;
            float a = a(0, x, width, dgVar.getWidth());
            float a2 = a(1, motionEvent.getY(), view.getHeight(), dgVar.getHeight());
            m7 m7Var = this.f;
            m7Var.c = a;
            m7Var.d = a2;
            if (!this.t && e()) {
                if (this.i == null) {
                    this.i = new n7(i2, this);
                }
                this.t = true;
                this.r = true;
                if (this.q || (i = this.m) <= 0) {
                    this.i.run();
                } else {
                    n7 n7Var = this.i;
                    long j = i;
                    WeakHashMap weakHashMap = e90.a;
                    dgVar.postOnAnimationDelayed(n7Var, j);
                }
                this.q = true;
            }
        }
        return false;
    }
}
