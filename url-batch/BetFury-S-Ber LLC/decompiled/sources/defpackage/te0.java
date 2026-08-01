package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class te0 {
    public static final hl m = new hl(1);
    public static final hl n = new hl(2);
    public static final hl o = new hl(3);
    public static final hl p = new hl(4);
    public static final hl q = new hl(5);
    public static final hl r = new hl(0);
    public final rd0 c;
    public final mv d;
    public final float g;
    public ue0 j;
    public float k;
    public boolean l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean e = false;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public te0(rd0 rd0Var, mv mvVar) {
        this.c = rd0Var;
        this.d = mvVar;
        if (mvVar == o || mvVar == p || mvVar == q) {
            this.g = 0.1f;
        } else if (mvVar == r) {
            this.g = 0.00390625f;
        } else if (mvVar == m || mvVar == n) {
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
            threadLocal.set(new n3(new i5(2)));
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
            this.j = new ue0(f);
        }
        ue0 ue0Var = this.j;
        double d = f;
        ue0Var.i = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            s9.y("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < -3.4028234663852886E38d) {
            s9.y("Final position of the spring cannot be less than the min value.");
            return;
        }
        double abs = Math.abs(this.g * 0.75f);
        ue0Var.d = abs;
        ue0Var.e = abs * 62.5d;
        i5 i5Var = b().e;
        i5Var.getClass();
        if (Thread.currentThread() != ((Looper) i5Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.e;
        if (z || z) {
            return;
        }
        int i = 1;
        this.e = true;
        float y = this.d.y(this.c);
        this.b = y;
        if (y > Float.MAX_VALUE || y < -3.4028235E38f) {
            s9.k("Starting value need to be in between min value and max value");
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
                    b.h = new i5((Object) b, i, false);
                }
                final i5 i5Var2 = b.h;
                if (((l3) i5Var2.g) == null) {
                    ?? r0 = new ValueAnimator.DurationScaleChangeListener() { // from class: l3
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((n3) i5.this.h).g = f2;
                        }
                    };
                    i5Var2.g = r0;
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
        this.d.N(this.c, f);
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
                s9.c();
                return;
            }
            i++;
        }
    }

    public final void d() {
        if (this.j.b <= 0.0d) {
            s9.y("Spring animations can only come to an end when there is damping");
            return;
        }
        i5 i5Var = b().e;
        i5Var.getClass();
        if (Thread.currentThread() != ((Looper) i5Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.e) {
            this.l = true;
        }
    }
}
