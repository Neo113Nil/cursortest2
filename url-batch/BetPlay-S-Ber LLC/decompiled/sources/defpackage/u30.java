package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class u30 {
    public static final kg m = new kg(1);
    public static final kg n = new kg(2);
    public static final kg o = new kg(3);
    public static final kg p = new kg(4);
    public static final kg q = new kg(5);
    public static final kg r = new kg(0);
    public final y20 c;
    public final op d;
    public final float g;
    public v30 j;
    public float k;
    public boolean l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean e = false;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public u30(y20 y20Var, op opVar) {
        this.c = y20Var;
        this.d = opVar;
        if (opVar == o || opVar == p || opVar == q) {
            this.g = 0.1f;
        } else if (opVar == r) {
            this.g = 0.00390625f;
        } else if (opVar == m || opVar == n) {
            this.g = 0.002f;
        } else {
            this.g = 1.0f;
        }
        this.j = null;
        this.k = Float.MAX_VALUE;
        this.l = false;
    }

    public static n3 b() {
        ThreadLocal threadLocal = n3.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new n3(new h5(2)));
        }
        return (n3) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, l3] */
    public final void a(float f) {
        float durationScale;
        if (this.e) {
            this.k = f;
            return;
        }
        if (this.j == null) {
            this.j = new v30(f);
        }
        v30 v30Var = this.j;
        double d = f;
        v30Var.i = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            o8.w("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < -3.4028234663852886E38d) {
            o8.w("Final position of the spring cannot be less than the min value.");
            return;
        }
        double abs = Math.abs(this.g * 0.75f);
        v30Var.d = abs;
        v30Var.e = abs * 62.5d;
        h5 h5Var = b().e;
        h5Var.getClass();
        if (Thread.currentThread() != ((Looper) h5Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.e;
        if (z || z) {
            return;
        }
        int i = 1;
        this.e = true;
        float C = this.d.C(this.c);
        this.b = C;
        if (C > Float.MAX_VALUE || C < -3.4028235E38f) {
            o8.j("Starting value need to be in between min value and max value");
            return;
        }
        n3 b = b();
        ArrayList arrayList = b.b;
        if (arrayList.size() == 0) {
            ((Choreographer) b.e.g).postFrameCallback(new m3(b.d));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                b.g = durationScale;
                if (b.h == null) {
                    b.h = new h5(i, b);
                }
                final h5 h5Var2 = b.h;
                if (((l3) h5Var2.g) == null) {
                    ?? r0 = new ValueAnimator.DurationScaleChangeListener() { // from class: l3
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((n3) h5.this.h).g = f2;
                        }
                    };
                    h5Var2.g = r0;
                    ValueAnimator.registerDurationScaleChangeListener(r0);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f) {
        this.d.Q(this.c, f);
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
                o8.c();
                return;
            }
            i++;
        }
    }

    public final void d() {
        if (this.j.b <= 0.0d) {
            o8.w("Spring animations can only come to an end when there is damping");
            return;
        }
        h5 h5Var = b().e;
        h5Var.getClass();
        if (Thread.currentThread() != ((Looper) h5Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.e) {
            this.l = true;
        }
    }
}
