package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class n60 {
    public static final ti m = new ti(1);
    public static final ti n = new ti(2);
    public static final ti o = new ti(3);
    public static final ti p = new ti(4);
    public static final ti q = new ti(5);
    public static final ti r = new ti(0);
    public final q50 c;
    public final b9 d;
    public final float g;
    public o60 j;
    public float k;
    public boolean l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean e = false;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public n60(q50 q50Var, b9 b9Var) {
        this.c = q50Var;
        this.d = b9Var;
        if (b9Var == o || b9Var == p || b9Var == q) {
            this.g = 0.1f;
        } else if (b9Var == r) {
            this.g = 0.00390625f;
        } else if (b9Var == m || b9Var == n) {
            this.g = 0.002f;
        } else {
            this.g = 1.0f;
        }
        this.j = null;
        this.k = Float.MAX_VALUE;
        this.l = false;
    }

    public static f3 b() {
        ThreadLocal threadLocal = f3.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new f3(new a5(3)));
        }
        return (f3) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [d3, java.lang.Object] */
    public final void a(float f) {
        float durationScale;
        if (this.e) {
            this.k = f;
            return;
        }
        if (this.j == null) {
            this.j = new o60(f);
        }
        o60 o60Var = this.j;
        double d = f;
        o60Var.i = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            g9.u("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < -3.4028234663852886E38d) {
            g9.u("Final position of the spring cannot be less than the min value.");
            return;
        }
        double abs = Math.abs(this.g * 0.75f);
        o60Var.d = abs;
        o60Var.e = abs * 62.5d;
        a5 a5Var = b().e;
        a5Var.getClass();
        if (Thread.currentThread() != ((Looper) a5Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.e;
        if (z || z) {
            return;
        }
        this.e = true;
        float s = this.d.s(this.c);
        this.b = s;
        if (s > Float.MAX_VALUE || s < -3.4028235E38f) {
            g9.i("Starting value need to be in between min value and max value");
            return;
        }
        f3 b = b();
        ArrayList arrayList = b.b;
        if (arrayList.size() == 0) {
            ((Choreographer) b.e.g).postFrameCallback(new e3(b.d));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                b.g = durationScale;
                if (b.h == null) {
                    b.h = new a5(2, b);
                }
                final a5 a5Var2 = b.h;
                if (((d3) a5Var2.g) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: d3
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((f3) a5.this.h).g = f2;
                        }
                    };
                    a5Var2.g = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f) {
        this.d.R(this.c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                g9.b();
                return;
            }
            i++;
        }
    }

    public final void d() {
        if (this.j.b <= 0.0d) {
            g9.u("Spring animations can only come to an end when there is damping");
            return;
        }
        a5 a5Var = b().e;
        a5Var.getClass();
        if (Thread.currentThread() != ((Looper) a5Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.e) {
            this.l = true;
        }
    }
}
