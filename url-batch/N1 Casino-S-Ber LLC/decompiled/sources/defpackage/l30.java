package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class l30 {
    public static final sg m = new sg(1);
    public static final sg n = new sg(2);
    public static final sg o = new sg(3);
    public static final sg p = new sg(4);
    public static final sg q = new sg(5);
    public static final sg r = new sg(0);
    public final o20 c;
    public final jw d;
    public final float g;
    public m30 j;
    public float k;
    public boolean l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean e = false;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public l30(o20 o20Var, jw jwVar) {
        this.c = o20Var;
        this.d = jwVar;
        if (jwVar == o || jwVar == p || jwVar == q) {
            this.g = 0.1f;
        } else if (jwVar == r) {
            this.g = 0.00390625f;
        } else if (jwVar == m || jwVar == n) {
            this.g = 0.002f;
        } else {
            this.g = 1.0f;
        }
        this.j = null;
        this.k = Float.MAX_VALUE;
        this.l = false;
    }

    public static v2 b() {
        ThreadLocal threadLocal = v2.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new v2(new q4(3)));
        }
        return (v2) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, t2] */
    public final void a(float f) {
        float durationScale;
        if (this.e) {
            this.k = f;
            return;
        }
        if (this.j == null) {
            this.j = new m30(f);
        }
        m30 m30Var = this.j;
        double d = f;
        m30Var.i = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            t8.w("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < -3.4028234663852886E38d) {
            t8.w("Final position of the spring cannot be less than the min value.");
            return;
        }
        double abs = Math.abs(this.g * 0.75f);
        m30Var.d = abs;
        m30Var.e = abs * 62.5d;
        q4 q4Var = b().e;
        q4Var.getClass();
        if (Thread.currentThread() != ((Looper) q4Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.e;
        if (z || z) {
            return;
        }
        this.e = true;
        float C = this.d.C(this.c);
        this.b = C;
        if (C > Float.MAX_VALUE || C < -3.4028235E38f) {
            t8.k("Starting value need to be in between min value and max value");
            return;
        }
        v2 b = b();
        ArrayList arrayList = b.b;
        if (arrayList.size() == 0) {
            ((Choreographer) b.e.g).postFrameCallback(new u2(b.d));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                b.g = durationScale;
                if (b.h == null) {
                    b.h = new q4(2, b);
                }
                final q4 q4Var2 = b.h;
                if (((t2) q4Var2.g) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: t2
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((v2) q4.this.h).g = f2;
                        }
                    };
                    q4Var2.g = r1;
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
        this.d.d0(this.c, f);
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
                t8.c();
                return;
            }
            i++;
        }
    }

    public final void d() {
        if (this.j.b <= 0.0d) {
            t8.w("Spring animations can only come to an end when there is damping");
            return;
        }
        q4 q4Var = b().e;
        q4Var.getClass();
        if (Thread.currentThread() != ((Looper) q4Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.e) {
            this.l = true;
        }
    }
}
