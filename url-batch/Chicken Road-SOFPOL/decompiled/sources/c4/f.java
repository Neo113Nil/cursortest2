package c4;

import a0.a0;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import w5.y;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: m, reason: collision with root package name */
    public static final d f1626m = new d(1);

    /* renamed from: n, reason: collision with root package name */
    public static final d f1627n = new d(2);

    /* renamed from: o, reason: collision with root package name */
    public static final d f1628o = new d(3);

    /* renamed from: p, reason: collision with root package name */
    public static final d f1629p = new d(4);

    /* renamed from: q, reason: collision with root package name */
    public static final d f1630q = new d(5);

    /* renamed from: r, reason: collision with root package name */
    public static final d f1631r = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public final y f1634c;

    /* renamed from: d, reason: collision with root package name */
    public final s6.a f1635d;

    /* renamed from: g, reason: collision with root package name */
    public final float f1638g;

    /* renamed from: j, reason: collision with root package name */
    public g f1640j;

    /* renamed from: k, reason: collision with root package name */
    public float f1641k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1642l;

    /* renamed from: a, reason: collision with root package name */
    public float f1632a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f1633b = Float.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1636e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f1637f = 0;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1639h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public f(y yVar, s6.a aVar) {
        this.f1634c = yVar;
        this.f1635d = aVar;
        if (aVar == f1628o || aVar == f1629p || aVar == f1630q) {
            this.f1638g = 0.1f;
        } else if (aVar == f1631r) {
            this.f1638g = 0.00390625f;
        } else if (aVar == f1626m || aVar == f1627n) {
            this.f1638g = 0.002f;
        } else {
            this.f1638g = 1.0f;
        }
        this.f1640j = null;
        this.f1641k = Float.MAX_VALUE;
        this.f1642l = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new a0(4)));
        }
        return (c) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [c4.a, java.lang.Object] */
    public final void a(float f6) {
        float durationScale;
        if (this.f1636e) {
            this.f1641k = f6;
            return;
        }
        if (this.f1640j == null) {
            this.f1640j = new g(f6);
        }
        g gVar = this.f1640j;
        double d8 = f6;
        gVar.i = d8;
        double d9 = (float) d8;
        if (d9 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d9 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.f1638g * 0.75f);
        gVar.f1646d = abs;
        gVar.f1647e = abs * 62.5d;
        a0 a0Var = b().f1619e;
        a0Var.getClass();
        if (Thread.currentThread() != ((Looper) a0Var.f12f).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z3 = this.f1636e;
        if (z3 || z3) {
            return;
        }
        this.f1636e = true;
        float v7 = this.f1635d.v(this.f1634c);
        this.f1633b = v7;
        if (v7 > Float.MAX_VALUE || v7 < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        c b8 = b();
        ArrayList arrayList = b8.f1616b;
        if (arrayList.size() == 0) {
            ((Choreographer) b8.f1619e.f11e).postFrameCallback(new b(b8.f1618d));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                b8.f1621g = durationScale;
                if (b8.f1622h == null) {
                    b8.f1622h = new a0(3, b8);
                }
                final a0 a0Var2 = b8.f1622h;
                if (((a) a0Var2.f11e) == null) {
                    ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: c4.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f8) {
                            ((c) a0.this.f12f).f1621g = f8;
                        }
                    };
                    a0Var2.f11e = r12;
                    ValueAnimator.registerDurationScaleChangeListener(r12);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f6) {
        this.f1635d.G(this.f1634c, f6);
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
        if (this.f1640j.f1644b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        a0 a0Var = b().f1619e;
        a0Var.getClass();
        if (Thread.currentThread() != ((Looper) a0Var.f12f).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f1636e) {
            this.f1642l = true;
        }
    }
}
