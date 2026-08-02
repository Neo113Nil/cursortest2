package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abe implements View.OnTouchListener {
    private static final int g = ViewConfiguration.getTapTimeout();
    public final abd a;
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ListView f;
    private final Interpolator h;
    private Runnable i;
    private final float[] j;
    private final float[] k;
    private final int l;
    private final float[] m;
    private final float[] n;
    private final float[] o;
    private boolean p;
    private boolean q;

    public abe(ListView listView) {
        abd abdVar = new abd();
        this.a = abdVar;
        this.h = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.m = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.n = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.o = fArr5;
        this.b = listView;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.density * 1575.0f;
        float f2 = displayMetrics.density * 315.0f;
        float f3 = ((int) (f + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) (f2 + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.l = g;
        abdVar.a = 500;
        abdVar.b = 500;
        this.f = listView;
    }

    static float a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float d(int i, float f, float f2, float f3) {
        float f4;
        float interpolation;
        float a = a(this.j[i] * f2, 0.0f, this.k[i]);
        float e = e(f2 - f, a) - e(f, a);
        if (e < 0.0f) {
            interpolation = -this.h.getInterpolation(-e);
        } else {
            if (e <= 0.0f) {
                f4 = 0.0f;
                if (f4 != 0.0f) {
                    return 0.0f;
                }
                float f5 = this.m[i];
                float f6 = this.n[i];
                float f7 = this.o[i];
                float f8 = f5 * f3;
                return f4 > 0.0f ? a(f4 * f8, f6, f7) : -a((-f4) * f8, f6, f7);
            }
            interpolation = this.h.getInterpolation(e);
        }
        f4 = a(interpolation, -1.0f, 1.0f);
        if (f4 != 0.0f) {
        }
    }

    private final float e(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private final void f() {
        int i = 0;
        if (this.c) {
            this.e = false;
            return;
        }
        abd abdVar = this.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - abdVar.e);
        int i3 = abdVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        abdVar.i = i;
        abdVar.h = abdVar.a(currentAnimationTimeMillis);
        abdVar.g = currentAnimationTimeMillis;
    }

    public final boolean b() {
        ListView listView;
        int count;
        abd abdVar = this.a;
        float f = abdVar.d;
        float abs = f / Math.abs(f);
        Math.abs(abdVar.c);
        int i = (int) abs;
        if (i != 0 && (count = (listView = this.f).getCount()) != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (i > 0) {
                if (i2 < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                    return true;
                }
            } else if (i < 0 && (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0)) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean z) {
        if (this.q && !z) {
            f();
        }
        this.q = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.q) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                f();
            } else {
                this.d = true;
                this.p = false;
            }
            float x = motionEvent.getX();
            float width = view.getWidth();
            View view2 = this.b;
            float d = d(0, x, width, view2.getWidth());
            float d2 = d(1, motionEvent.getY(), view.getHeight(), view2.getHeight());
            abd abdVar = this.a;
            abdVar.c = d;
            abdVar.d = d2;
            if (!this.e && b()) {
                if (this.i == null) {
                    this.i = new nc(this, 8, null);
                }
                this.e = true;
                this.c = true;
                if (this.p || (i = this.l) <= 0) {
                    this.i.run();
                } else {
                    Runnable runnable = this.i;
                    int i2 = yq.a;
                    view2.postOnAnimationDelayed(runnable, i);
                }
                this.p = true;
            }
        }
        return false;
    }
}
