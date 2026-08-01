package r0;

import a2.s;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.fragment.app.w0;
import g2.z;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: m, reason: collision with root package name */
    public static final e f3152m = new e(1);

    /* renamed from: n, reason: collision with root package name */
    public static final e f3153n = new e(2);

    /* renamed from: o, reason: collision with root package name */
    public static final e f3154o = new e(3);

    /* renamed from: p, reason: collision with root package name */
    public static final e f3155p = new e(4);

    /* renamed from: q, reason: collision with root package name */
    public static final e f3156q = new e(5);

    /* renamed from: r, reason: collision with root package name */
    public static final e f3157r = new e(0);
    public final z c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.a f3160d;
    public final float g;

    /* renamed from: j, reason: collision with root package name */
    public h f3164j;

    /* renamed from: k, reason: collision with root package name */
    public float f3165k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3166l;

    /* renamed from: a, reason: collision with root package name */
    public float f3158a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f3159b = Float.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3161e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f3162f = 0;
    public final ArrayList h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3163i = new ArrayList();

    public g(z zVar, m0.a aVar) {
        this.c = zVar;
        this.f3160d = aVar;
        if (aVar == f3154o || aVar == f3155p || aVar == f3156q) {
            this.g = 0.1f;
        } else if (aVar == f3157r) {
            this.g = 0.00390625f;
        } else if (aVar == f3152m || aVar == f3153n) {
            this.g = 0.002f;
        } else {
            this.g = 1.0f;
        }
        this.f3164j = null;
        this.f3165k = Float.MAX_VALUE;
        this.f3166l = false;
    }

    public static d b() {
        ThreadLocal threadLocal = d.f3143i;
        if (threadLocal.get() == null) {
            threadLocal.set(new d(new s(18)));
        }
        return (d) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, r0.b] */
    public final void a(float f4) {
        float durationScale;
        if (this.f3161e) {
            this.f3165k = f4;
            return;
        }
        if (this.f3164j == null) {
            this.f3164j = new h(f4);
        }
        h hVar = this.f3164j;
        double d4 = f4;
        hVar.f3172i = d4;
        double d5 = (float) d4;
        if (d5 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d5 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.g * 0.75f);
        hVar.f3169d = abs;
        hVar.f3170e = abs * 62.5d;
        s sVar = b().f3147e;
        sVar.getClass();
        if (Thread.currentThread() != ((Looper) sVar.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z3 = this.f3161e;
        if (z3 || z3) {
            return;
        }
        this.f3161e = true;
        float m4 = this.f3160d.m(this.c);
        this.f3159b = m4;
        if (m4 > Float.MAX_VALUE || m4 < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        d b2 = b();
        ArrayList arrayList = b2.f3145b;
        if (arrayList.size() == 0) {
            ((Choreographer) b2.f3147e.g).postFrameCallback(new c(b2.f3146d));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                b2.g = durationScale;
                if (b2.h == null) {
                    b2.h = new s(17, b2);
                }
                final s sVar2 = b2.h;
                if (((b) sVar2.g) == null) {
                    ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: r0.b
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f5) {
                            ((d) s.this.h).g = f5;
                        }
                    };
                    sVar2.g = r12;
                    ValueAnimator.registerDurationScaleChangeListener(r12);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f4) {
        this.f3160d.A(this.c, f4);
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f3163i;
            if (i4 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i4) != null) {
                throw w0.d(arrayList, i4);
            }
            i4++;
        }
    }

    public final void d() {
        if (this.f3164j.f3168b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        s sVar = b().f3147e;
        sVar.getClass();
        if (Thread.currentThread() != ((Looper) sVar.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f3161e) {
            this.f3166l = true;
        }
    }
}
