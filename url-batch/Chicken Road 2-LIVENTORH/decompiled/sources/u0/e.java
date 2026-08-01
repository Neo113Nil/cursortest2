package u0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.emoji2.text.q;
import d1.g;
import java.util.ArrayList;
import l2.y;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: m, reason: collision with root package name */
    public static final c f3324m = new c(1);

    /* renamed from: n, reason: collision with root package name */
    public static final c f3325n = new c(2);

    /* renamed from: o, reason: collision with root package name */
    public static final c f3326o = new c(3);

    /* renamed from: p, reason: collision with root package name */
    public static final c f3327p = new c(4);

    /* renamed from: q, reason: collision with root package name */
    public static final c f3328q = new c(5);

    /* renamed from: r, reason: collision with root package name */
    public static final c f3329r = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public final y f3332c;
    public final t0.d d;

    /* renamed from: g, reason: collision with root package name */
    public final float f3335g;

    /* renamed from: j, reason: collision with root package name */
    public f f3337j;

    /* renamed from: k, reason: collision with root package name */
    public float f3338k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3339l;

    /* renamed from: a, reason: collision with root package name */
    public float f3330a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f3331b = Float.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3333e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f3334f = 0;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3336h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public e(y yVar, t0.d dVar) {
        this.f3332c = yVar;
        this.d = dVar;
        if (dVar == f3326o || dVar == f3327p || dVar == f3328q) {
            this.f3335g = 0.1f;
        } else if (dVar == f3329r) {
            this.f3335g = 0.00390625f;
        } else if (dVar == f3324m || dVar == f3325n) {
            this.f3335g = 0.002f;
        } else {
            this.f3335g = 1.0f;
        }
        this.f3337j = null;
        this.f3338k = Float.MAX_VALUE;
        this.f3339l = false;
    }

    public static b b() {
        ThreadLocal threadLocal = b.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new b(new q(18)));
        }
        return (b) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, u0.a] */
    public final void a(float f2) {
        float durationScale;
        if (this.f3333e) {
            this.f3338k = f2;
            return;
        }
        if (this.f3337j == null) {
            this.f3337j = new f(f2);
        }
        f fVar = this.f3337j;
        double d = f2;
        fVar.i = d;
        double d3 = (float) d;
        if (d3 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d3 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.f3335g * 0.75f);
        fVar.d = abs;
        fVar.f3343e = abs * 62.5d;
        q qVar = b().f3317e;
        qVar.getClass();
        if (Thread.currentThread() != ((Looper) qVar.f347h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z3 = this.f3333e;
        if (z3 || z3) {
            return;
        }
        this.f3333e = true;
        float h4 = this.d.h(this.f3332c);
        this.f3331b = h4;
        if (h4 > Float.MAX_VALUE || h4 < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        b b4 = b();
        ArrayList arrayList = b4.f3315b;
        if (arrayList.size() == 0) {
            ((Choreographer) b4.f3317e.f346g).postFrameCallback(new g(b4.d));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                b4.f3319g = durationScale;
                if (b4.f3320h == null) {
                    b4.f3320h = new q(17, b4);
                }
                final q qVar2 = b4.f3320h;
                if (((a) qVar2.f346g) == null) {
                    ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: u0.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f4) {
                            ((b) q.this.f347h).f3319g = f4;
                        }
                    };
                    qVar2.f346g = r12;
                    ValueAnimator.registerDurationScaleChangeListener(r12);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f2) {
        this.d.t(this.f3332c, f2);
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
                throw new ClassCastException();
            }
            i++;
        }
    }

    public final void d() {
        if (this.f3337j.f3341b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        q qVar = b().f3317e;
        qVar.getClass();
        if (Thread.currentThread() != ((Looper) qVar.f347h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f3333e) {
            this.f3339l = true;
        }
    }
}
