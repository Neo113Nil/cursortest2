package f0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0115v {

    /* renamed from: a, reason: collision with root package name */
    public int f2351a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2352b;

    /* renamed from: c, reason: collision with root package name */
    public H f2353c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2354e;

    /* renamed from: f, reason: collision with root package name */
    public View f2355f;

    /* renamed from: g, reason: collision with root package name */
    public final Q f2356g;
    public boolean h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f2357j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f2358k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2359l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2360m;

    /* renamed from: n, reason: collision with root package name */
    public float f2361n;

    /* renamed from: o, reason: collision with root package name */
    public int f2362o;

    /* renamed from: p, reason: collision with root package name */
    public int f2363p;

    public C0115v(Context context) {
        Q q2 = new Q();
        q2.d = -1;
        q2.f2173f = false;
        q2.f2174g = 0;
        q2.f2169a = 0;
        q2.f2170b = 0;
        q2.f2171c = Integer.MIN_VALUE;
        q2.f2172e = null;
        this.f2356g = q2;
        this.i = new LinearInterpolator();
        this.f2357j = new DecelerateInterpolator();
        this.f2360m = false;
        this.f2362o = 0;
        this.f2363p = 0;
        this.f2359l = context.getResources().getDisplayMetrics();
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
        H h = this.f2353c;
        if (h == null || !h.d()) {
            return 0;
        }
        I i2 = (I) view.getLayoutParams();
        return a((view.getLeft() - ((I) view.getLayoutParams()).f2155b.left) - ((ViewGroup.MarginLayoutParams) i2).leftMargin, view.getRight() + ((I) view.getLayoutParams()).f2155b.right + ((ViewGroup.MarginLayoutParams) i2).rightMargin, h.E(), h.f2152n - h.F(), i);
    }

    public int c(View view, int i) {
        H h = this.f2353c;
        if (h == null || !h.e()) {
            return 0;
        }
        I i2 = (I) view.getLayoutParams();
        return a((view.getTop() - ((I) view.getLayoutParams()).f2155b.top) - ((ViewGroup.MarginLayoutParams) i2).topMargin, view.getBottom() + ((I) view.getLayoutParams()).f2155b.bottom + ((ViewGroup.MarginLayoutParams) i2).bottomMargin, h.G(), h.f2153o - h.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f2360m) {
            this.f2361n = d(this.f2359l);
            this.f2360m = true;
        }
        return (int) Math.ceil(abs * this.f2361n);
    }

    public PointF f(int i) {
        Object obj = this.f2353c;
        if (obj instanceof S) {
            return ((S) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + S.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f2;
        RecyclerView recyclerView = this.f2352b;
        if (this.f2351a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f2355f == null && this.f2353c != null && (f2 = f(this.f2351a)) != null) {
            float f3 = f2.x;
            if (f3 != 0.0f || f2.y != 0.0f) {
                recyclerView.X((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        this.d = false;
        View view = this.f2355f;
        Q q2 = this.f2356g;
        if (view != null) {
            this.f2352b.getClass();
            W I2 = RecyclerView.I(view);
            if ((I2 != null ? I2.b() : -1) == this.f2351a) {
                View view2 = this.f2355f;
                T t2 = recyclerView.f1586c0;
                h(view2, q2);
                q2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2355f = null;
            }
        }
        if (this.f2354e) {
            T t3 = recyclerView.f1586c0;
            if (this.f2352b.f1600l.v() == 0) {
                i();
            } else {
                int i3 = this.f2362o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f2362o = i4;
                int i5 = this.f2363p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f2363p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f4 = f(this.f2351a);
                    if (f4 != null) {
                        if (f4.x != 0.0f || f4.y != 0.0f) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.f2358k = f4;
                            this.f2362o = (int) (f6 * 10000.0f);
                            this.f2363p = (int) (f7 * 10000.0f);
                            int e2 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            q2.f2169a = (int) (this.f2362o * 1.2f);
                            q2.f2170b = (int) (this.f2363p * 1.2f);
                            q2.f2171c = (int) (e2 * 1.2f);
                            q2.f2172e = linearInterpolator;
                            q2.f2173f = true;
                        }
                    }
                    q2.d = this.f2351a;
                    i();
                }
            }
            boolean z2 = q2.d >= 0;
            q2.a(recyclerView);
            if (z2 && this.f2354e) {
                this.d = true;
                recyclerView.f1580W.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, Q q2) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f2358k;
        int i2 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != 0.0f) {
                i = f2 > 0.0f ? 1 : -1;
                int b2 = b(view, i);
                pointF = this.f2358k;
                if (pointF != null) {
                    float f3 = pointF.y;
                    if (f3 != 0.0f) {
                        i2 = f3 > 0.0f ? 1 : -1;
                    }
                }
                int c2 = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2357j;
                    q2.f2169a = -b2;
                    q2.f2170b = -c2;
                    q2.f2171c = ceil;
                    q2.f2172e = decelerateInterpolator;
                    q2.f2173f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b22 = b(view, i);
        pointF = this.f2358k;
        if (pointF != null) {
        }
        int c22 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c22 * c22) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f2354e) {
            this.f2354e = false;
            this.f2363p = 0;
            this.f2362o = 0;
            this.f2358k = null;
            this.f2352b.f1586c0.f2175a = -1;
            this.f2355f = null;
            this.f2351a = -1;
            this.d = false;
            H h = this.f2353c;
            if (h.f2145e == this) {
                h.f2145e = null;
            }
            this.f2353c = null;
            this.f2352b = null;
        }
    }
}
