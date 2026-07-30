package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.google.firebase.messaging.ServiceStarter;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class af1 implements View.OnTouchListener {
    public static final int D = ViewConfiguration.getTapTimeout();
    public boolean A;
    public boolean B;
    public final ne0 C;
    public final pl m;
    public final AccelerateInterpolator n;
    public final ne0 o;
    public r7 p;
    public final float[] q;
    public final float[] r;
    public final int s;
    public final int t;
    public final float[] u;
    public final float[] v;
    public final float[] w;
    public boolean x;
    public boolean y;
    public boolean z;

    public af1(ne0 ne0Var) {
        pl plVar = new pl();
        plVar.e = Long.MIN_VALUE;
        plVar.g = -1L;
        plVar.f = 0L;
        this.m = plVar;
        this.n = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.q = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.r = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.u = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.v = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.w = fArr5;
        this.o = ne0Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.s = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.t = D;
        plVar.a = ServiceStarter.ERROR_UNKNOWN;
        plVar.b = ServiceStarter.ERROR_UNKNOWN;
        this.C = ne0Var;
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
        float b = b(this.q[i] * f2, 0.0f, this.r[i]);
        float c = c(f2 - f, b) - c(f, b);
        AccelerateInterpolator accelerateInterpolator = this.n;
        if (c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else {
            if (c <= 0.0f) {
                f4 = 0.0f;
                if (f4 != 0.0f) {
                    return 0.0f;
                }
                float f5 = this.u[i];
                float f6 = this.v[i];
                float f7 = this.w[i];
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
            int i = this.s;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.A && i == 1) {
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
        if (this.y) {
            this.A = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        pl plVar = this.m;
        int i2 = (int) (currentAnimationTimeMillis - plVar.e);
        int i3 = plVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        plVar.i = i;
        plVar.h = plVar.a(currentAnimationTimeMillis);
        plVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        ne0 ne0Var;
        int count;
        pl plVar = this.m;
        float f = plVar.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(plVar.c);
        if (abs != 0 && (count = (ne0Var = this.C).getCount()) != 0) {
            int childCount = ne0Var.getChildCount();
            int firstVisiblePosition = ne0Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && ne0Var.getChildAt(0).getTop() >= 0)) : !(i >= count && ne0Var.getChildAt(childCount - 1).getBottom() <= ne0Var.getHeight())) {
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
        if (this.B) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.z = true;
            this.x = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            ne0 ne0Var = this.o;
            float a = a(0, x, width, ne0Var.getWidth());
            float a2 = a(1, motionEvent.getY(), view.getHeight(), ne0Var.getHeight());
            pl plVar = this.m;
            plVar.c = a;
            plVar.d = a2;
            if (!this.A && e()) {
                if (this.p == null) {
                    this.p = new r7(i2, this);
                }
                this.A = true;
                this.y = true;
                if (this.x || (i = this.t) <= 0) {
                    this.p.run();
                } else {
                    r7 r7Var = this.p;
                    long j = i;
                    WeakHashMap weakHashMap = e53.a;
                    ne0Var.postOnAnimationDelayed(r7Var, j);
                }
                this.x = true;
            }
        }
        return false;
    }
}
