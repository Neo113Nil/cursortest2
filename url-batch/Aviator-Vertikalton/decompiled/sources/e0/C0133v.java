package e0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0133v {

    /* renamed from: a, reason: collision with root package name */
    public int f2349a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2350b;

    /* renamed from: c, reason: collision with root package name */
    public I f2351c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2352d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2353e;

    /* renamed from: f, reason: collision with root package name */
    public View f2354f;

    /* renamed from: g, reason: collision with root package name */
    public final S f2355g;
    public boolean h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f2356j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f2357k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2358l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2359m;

    /* renamed from: n, reason: collision with root package name */
    public float f2360n;

    /* renamed from: o, reason: collision with root package name */
    public int f2361o;

    /* renamed from: p, reason: collision with root package name */
    public int f2362p;

    public C0133v(Context context) {
        S s2 = new S();
        s2.f2144d = -1;
        s2.f2146f = false;
        s2.f2147g = 0;
        s2.f2141a = 0;
        s2.f2142b = 0;
        s2.f2143c = Integer.MIN_VALUE;
        s2.f2145e = null;
        this.f2355g = s2;
        this.i = new LinearInterpolator();
        this.f2356j = new DecelerateInterpolator();
        this.f2359m = false;
        this.f2361o = 0;
        this.f2362p = 0;
        this.f2358l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        I i2 = this.f2351c;
        if (i2 == null || !i2.d()) {
            return 0;
        }
        J j2 = (J) view.getLayoutParams();
        return a((view.getLeft() - ((J) view.getLayoutParams()).f2124b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin, view.getRight() + ((J) view.getLayoutParams()).f2124b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin, i2.E(), i2.f2121n - i2.F(), i);
    }

    public int c(View view, int i) {
        I i2 = this.f2351c;
        if (i2 == null || !i2.e()) {
            return 0;
        }
        J j2 = (J) view.getLayoutParams();
        return a((view.getTop() - ((J) view.getLayoutParams()).f2124b.top) - ((ViewGroup.MarginLayoutParams) j2).topMargin, view.getBottom() + ((J) view.getLayoutParams()).f2124b.bottom + ((ViewGroup.MarginLayoutParams) j2).bottomMargin, i2.G(), i2.f2122o - i2.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f2359m) {
            this.f2360n = d(this.f2358l);
            this.f2359m = true;
        }
        return (int) Math.ceil(abs * this.f2360n);
    }

    public PointF f(int i) {
        Object obj = this.f2351c;
        if (obj instanceof T) {
            return ((T) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + T.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f2;
        RecyclerView recyclerView = this.f2350b;
        if (this.f2349a == -1 || recyclerView == null) {
            i();
        }
        if (this.f2352d && this.f2354f == null && this.f2351c != null && (f2 = f(this.f2349a)) != null) {
            float f3 = f2.x;
            if (f3 != 0.0f || f2.y != 0.0f) {
                recyclerView.X((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        this.f2352d = false;
        View view = this.f2354f;
        S s2 = this.f2355g;
        if (view != null) {
            this.f2350b.getClass();
            X I2 = RecyclerView.I(view);
            if ((I2 != null ? I2.b() : -1) == this.f2349a) {
                View view2 = this.f2354f;
                U u2 = recyclerView.f1570c0;
                h(view2, s2);
                s2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2354f = null;
            }
        }
        if (this.f2353e) {
            U u3 = recyclerView.f1570c0;
            if (this.f2350b.f1584l.v() == 0) {
                i();
            } else {
                int i3 = this.f2361o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f2361o = i4;
                int i5 = this.f2362p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f2362p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f4 = f(this.f2349a);
                    if (f4 != null) {
                        if (f4.x != 0.0f || f4.y != 0.0f) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.f2357k = f4;
                            this.f2361o = (int) (f6 * 10000.0f);
                            this.f2362p = (int) (f7 * 10000.0f);
                            int e2 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            s2.f2141a = (int) (this.f2361o * 1.2f);
                            s2.f2142b = (int) (this.f2362p * 1.2f);
                            s2.f2143c = (int) (e2 * 1.2f);
                            s2.f2145e = linearInterpolator;
                            s2.f2146f = true;
                        }
                    }
                    s2.f2144d = this.f2349a;
                    i();
                }
            }
            boolean z2 = s2.f2144d >= 0;
            s2.a(recyclerView);
            if (z2 && this.f2353e) {
                this.f2352d = true;
                recyclerView.f1564W.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, S s2) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f2357k;
        int i2 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != 0.0f) {
                i = f2 > 0.0f ? 1 : -1;
                int b2 = b(view, i);
                pointF = this.f2357k;
                if (pointF != null) {
                    float f3 = pointF.y;
                    if (f3 != 0.0f) {
                        i2 = f3 > 0.0f ? 1 : -1;
                    }
                }
                int c2 = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2356j;
                    s2.f2141a = -b2;
                    s2.f2142b = -c2;
                    s2.f2143c = ceil;
                    s2.f2145e = decelerateInterpolator;
                    s2.f2146f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b22 = b(view, i);
        pointF = this.f2357k;
        if (pointF != null) {
        }
        int c22 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c22 * c22) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f2353e) {
            this.f2353e = false;
            this.f2362p = 0;
            this.f2361o = 0;
            this.f2357k = null;
            this.f2350b.f1570c0.f2148a = -1;
            this.f2354f = null;
            this.f2349a = -1;
            this.f2352d = false;
            I i = this.f2351c;
            if (i.f2114e == this) {
                i.f2114e = null;
            }
            this.f2351c = null;
            this.f2350b = null;
        }
    }
}
