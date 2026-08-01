package v0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.emoji2.text.q;
import e1.g;
import java.util.ArrayList;
import o2.z;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: m, reason: collision with root package name */
    public static final c f3702m = new c(1);

    /* renamed from: n, reason: collision with root package name */
    public static final c f3703n = new c(2);

    /* renamed from: o, reason: collision with root package name */
    public static final c f3704o = new c(3);

    /* renamed from: p, reason: collision with root package name */
    public static final c f3705p = new c(4);

    /* renamed from: q, reason: collision with root package name */
    public static final c f3706q = new c(5);

    /* renamed from: r, reason: collision with root package name */
    public static final c f3707r = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public final z f3710c;
    public final r1.b d;

    /* renamed from: g, reason: collision with root package name */
    public final float f3713g;

    /* renamed from: j, reason: collision with root package name */
    public f f3714j;

    /* renamed from: k, reason: collision with root package name */
    public float f3715k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3716l;

    /* renamed from: a, reason: collision with root package name */
    public float f3708a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f3709b = Float.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3711e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f3712f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public e(z zVar, r1.b bVar) {
        this.f3710c = zVar;
        this.d = bVar;
        if (bVar == f3704o || bVar == f3705p || bVar == f3706q) {
            this.f3713g = 0.1f;
        } else if (bVar == f3707r) {
            this.f3713g = 0.00390625f;
        } else if (bVar == f3702m || bVar == f3703n) {
            this.f3713g = 0.002f;
        } else {
            this.f3713g = 1.0f;
        }
        this.f3714j = null;
        this.f3715k = Float.MAX_VALUE;
        this.f3716l = false;
    }

    public static b b() {
        ThreadLocal threadLocal = b.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new b(new q(19)));
        }
        return (b) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, v0.a] */
    public final void a(float f5) {
        float durationScale;
        if (this.f3711e) {
            this.f3715k = f5;
            return;
        }
        if (this.f3714j == null) {
            this.f3714j = new f(f5);
        }
        f fVar = this.f3714j;
        double d = f5;
        fVar.i = d;
        double d5 = (float) d;
        if (d5 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d5 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.f3713g * 0.75f);
        fVar.d = abs;
        fVar.f3720e = abs * 62.5d;
        q qVar = b().f3696e;
        qVar.getClass();
        if (Thread.currentThread() != ((Looper) qVar.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z4 = this.f3711e;
        if (z4 || z4) {
            return;
        }
        this.f3711e = true;
        float m4 = this.d.m(this.f3710c);
        this.f3709b = m4;
        if (m4 > Float.MAX_VALUE || m4 < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        b b2 = b();
        ArrayList arrayList = b2.f3694b;
        if (arrayList.size() == 0) {
            ((Choreographer) b2.f3696e.f466g).postFrameCallback(new g(b2.d));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                b2.f3698g = durationScale;
                if (b2.h == null) {
                    b2.h = new q(18, b2);
                }
                final q qVar2 = b2.h;
                if (((a) qVar2.f466g) == null) {
                    ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: v0.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f6) {
                            ((b) q.this.h).f3698g = f6;
                        }
                    };
                    qVar2.f466g = r12;
                    ValueAnimator.registerDurationScaleChangeListener(r12);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f5) {
        this.d.B(this.f3710c, f5);
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
        if (this.f3714j.f3718b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        q qVar = b().f3696e;
        qVar.getClass();
        if (Thread.currentThread() != ((Looper) qVar.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f3711e) {
            this.f3716l = true;
        }
    }
}
