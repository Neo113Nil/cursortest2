package k1;

import X0.i;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import e1.c;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4628a {

    /* renamed from: a, reason: collision with root package name */
    public final i f38671a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38672b;

    /* renamed from: c, reason: collision with root package name */
    public Object f38673c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f38674d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f38675e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f38676f;

    /* renamed from: g, reason: collision with root package name */
    public final float f38677g;

    /* renamed from: h, reason: collision with root package name */
    public Float f38678h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f38679j;

    /* renamed from: k, reason: collision with root package name */
    public int f38680k;

    /* renamed from: l, reason: collision with root package name */
    public int f38681l;

    /* renamed from: m, reason: collision with root package name */
    public float f38682m;

    /* renamed from: n, reason: collision with root package name */
    public float f38683n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f38684o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f38685p;

    public C4628a(i iVar, Object obj, Object obj2, Interpolator interpolator, float f6, Float f9) {
        this.i = -3987645.8f;
        this.f38679j = -3987645.8f;
        this.f38680k = 784923401;
        this.f38681l = 784923401;
        this.f38682m = Float.MIN_VALUE;
        this.f38683n = Float.MIN_VALUE;
        this.f38684o = null;
        this.f38685p = null;
        this.f38671a = iVar;
        this.f38672b = obj;
        this.f38673c = obj2;
        this.f38674d = interpolator;
        this.f38675e = null;
        this.f38676f = null;
        this.f38677g = f6;
        this.f38678h = f9;
    }

    public final float a() {
        if (this.f38671a == null) {
            return 1.0f;
        }
        if (this.f38683n == Float.MIN_VALUE) {
            if (this.f38678h == null) {
                this.f38683n = 1.0f;
            } else {
                this.f38683n = (float) (b() + ((this.f38678h.floatValue() - this.f38677g) / (r1.f3680m - r1.f3679l)));
            }
        }
        return this.f38683n;
    }

    public final float b() {
        i iVar = this.f38671a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f38682m == Float.MIN_VALUE) {
            float f6 = iVar.f3679l;
            this.f38682m = (this.f38677g - f6) / (iVar.f3680m - f6);
        }
        return this.f38682m;
    }

    public final boolean c() {
        return this.f38674d == null && this.f38675e == null && this.f38676f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f38672b + ", endValue=" + this.f38673c + ", startFrame=" + this.f38677g + ", endFrame=" + this.f38678h + ", interpolator=" + this.f38674d + '}';
    }

    public C4628a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f6) {
        this.i = -3987645.8f;
        this.f38679j = -3987645.8f;
        this.f38680k = 784923401;
        this.f38681l = 784923401;
        this.f38682m = Float.MIN_VALUE;
        this.f38683n = Float.MIN_VALUE;
        this.f38684o = null;
        this.f38685p = null;
        this.f38671a = iVar;
        this.f38672b = obj;
        this.f38673c = obj2;
        this.f38674d = null;
        this.f38675e = interpolator;
        this.f38676f = interpolator2;
        this.f38677g = f6;
        this.f38678h = null;
    }

    public C4628a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f6, Float f9) {
        this.i = -3987645.8f;
        this.f38679j = -3987645.8f;
        this.f38680k = 784923401;
        this.f38681l = 784923401;
        this.f38682m = Float.MIN_VALUE;
        this.f38683n = Float.MIN_VALUE;
        this.f38684o = null;
        this.f38685p = null;
        this.f38671a = iVar;
        this.f38672b = obj;
        this.f38673c = obj2;
        this.f38674d = interpolator;
        this.f38675e = interpolator2;
        this.f38676f = interpolator3;
        this.f38677g = f6;
        this.f38678h = f9;
    }

    public C4628a(Object obj) {
        this.i = -3987645.8f;
        this.f38679j = -3987645.8f;
        this.f38680k = 784923401;
        this.f38681l = 784923401;
        this.f38682m = Float.MIN_VALUE;
        this.f38683n = Float.MIN_VALUE;
        this.f38684o = null;
        this.f38685p = null;
        this.f38671a = null;
        this.f38672b = obj;
        this.f38673c = obj;
        this.f38674d = null;
        this.f38675e = null;
        this.f38676f = null;
        this.f38677g = Float.MIN_VALUE;
        this.f38678h = Float.valueOf(Float.MAX_VALUE);
    }

    public C4628a(c cVar, c cVar2) {
        this.i = -3987645.8f;
        this.f38679j = -3987645.8f;
        this.f38680k = 784923401;
        this.f38681l = 784923401;
        this.f38682m = Float.MIN_VALUE;
        this.f38683n = Float.MIN_VALUE;
        this.f38684o = null;
        this.f38685p = null;
        this.f38671a = null;
        this.f38672b = cVar;
        this.f38673c = cVar2;
        this.f38674d = null;
        this.f38675e = null;
        this.f38676f = null;
        this.f38677g = Float.MIN_VALUE;
        this.f38678h = Float.valueOf(Float.MAX_VALUE);
    }
}
