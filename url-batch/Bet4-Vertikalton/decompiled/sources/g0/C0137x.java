package g0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0137x {

    /* renamed from: a, reason: collision with root package name */
    public int f2497a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2498b;

    /* renamed from: c, reason: collision with root package name */
    public L f2499c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2500e;

    /* renamed from: f, reason: collision with root package name */
    public View f2501f;

    /* renamed from: g, reason: collision with root package name */
    public final W f2502g;
    public boolean h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f2503j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f2504k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2505l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2506m;

    /* renamed from: n, reason: collision with root package name */
    public float f2507n;

    /* renamed from: o, reason: collision with root package name */
    public int f2508o;

    /* renamed from: p, reason: collision with root package name */
    public int f2509p;

    public C0137x(Context context) {
        W w2 = new W();
        w2.d = -1;
        w2.f2308f = false;
        w2.f2309g = 0;
        w2.f2304a = 0;
        w2.f2305b = 0;
        w2.f2306c = Integer.MIN_VALUE;
        w2.f2307e = null;
        this.f2502g = w2;
        this.i = new LinearInterpolator();
        this.f2503j = new DecelerateInterpolator();
        this.f2506m = false;
        this.f2508o = 0;
        this.f2509p = 0;
        this.f2505l = context.getResources().getDisplayMetrics();
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
        L l2 = this.f2499c;
        if (l2 == null || !l2.d()) {
            return 0;
        }
        M m2 = (M) view.getLayoutParams();
        return a((view.getLeft() - ((M) view.getLayoutParams()).f2288b.left) - ((ViewGroup.MarginLayoutParams) m2).leftMargin, view.getRight() + ((M) view.getLayoutParams()).f2288b.right + ((ViewGroup.MarginLayoutParams) m2).rightMargin, l2.E(), l2.f2285n - l2.F(), i);
    }

    public int c(View view, int i) {
        L l2 = this.f2499c;
        if (l2 == null || !l2.e()) {
            return 0;
        }
        M m2 = (M) view.getLayoutParams();
        return a((view.getTop() - ((M) view.getLayoutParams()).f2288b.top) - ((ViewGroup.MarginLayoutParams) m2).topMargin, view.getBottom() + ((M) view.getLayoutParams()).f2288b.bottom + ((ViewGroup.MarginLayoutParams) m2).bottomMargin, l2.G(), l2.f2286o - l2.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f2506m) {
            this.f2507n = d(this.f2505l);
            this.f2506m = true;
        }
        return (int) Math.ceil(abs * this.f2507n);
    }

    public PointF f(int i) {
        Object obj = this.f2499c;
        if (obj instanceof X) {
            return ((X) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + X.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f2;
        RecyclerView recyclerView = this.f2498b;
        if (this.f2497a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f2501f == null && this.f2499c != null && (f2 = f(this.f2497a)) != null) {
            float f3 = f2.x;
            if (f3 != RecyclerView.f1530C0 || f2.y != RecyclerView.f1530C0) {
                recyclerView.e0((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        this.d = false;
        View view = this.f2501f;
        W w2 = this.f2502g;
        if (view != null) {
            this.f2498b.getClass();
            c0 L2 = RecyclerView.L(view);
            if ((L2 != null ? L2.c() : -1) == this.f2497a) {
                View view2 = this.f2501f;
                Y y2 = recyclerView.f1570g0;
                h(view2, w2);
                w2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2501f = null;
            }
        }
        if (this.f2500e) {
            Y y3 = recyclerView.f1570g0;
            if (this.f2498b.f1580n.v() == 0) {
                i();
            } else {
                int i3 = this.f2508o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f2508o = i4;
                int i5 = this.f2509p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f2509p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f4 = f(this.f2497a);
                    if (f4 != null) {
                        if (f4.x != RecyclerView.f1530C0 || f4.y != RecyclerView.f1530C0) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.f2504k = f4;
                            this.f2508o = (int) (f6 * 10000.0f);
                            this.f2509p = (int) (f7 * 10000.0f);
                            int e2 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            w2.f2304a = (int) (this.f2508o * 1.2f);
                            w2.f2305b = (int) (this.f2509p * 1.2f);
                            w2.f2306c = (int) (e2 * 1.2f);
                            w2.f2307e = linearInterpolator;
                            w2.f2308f = true;
                        }
                    }
                    w2.d = this.f2497a;
                    i();
                }
            }
            boolean z2 = w2.d >= 0;
            w2.a(recyclerView);
            if (z2 && this.f2500e) {
                this.d = true;
                recyclerView.f1564d0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, W w2) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f2504k;
        int i2 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != RecyclerView.f1530C0) {
                i = f2 > RecyclerView.f1530C0 ? 1 : -1;
                int b2 = b(view, i);
                pointF = this.f2504k;
                if (pointF != null) {
                    float f3 = pointF.y;
                    if (f3 != RecyclerView.f1530C0) {
                        i2 = f3 > RecyclerView.f1530C0 ? 1 : -1;
                    }
                }
                int c2 = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2503j;
                    w2.f2304a = -b2;
                    w2.f2305b = -c2;
                    w2.f2306c = ceil;
                    w2.f2307e = decelerateInterpolator;
                    w2.f2308f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b22 = b(view, i);
        pointF = this.f2504k;
        if (pointF != null) {
        }
        int c22 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c22 * c22) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f2500e) {
            this.f2500e = false;
            this.f2509p = 0;
            this.f2508o = 0;
            this.f2504k = null;
            this.f2498b.f1570g0.f2310a = -1;
            this.f2501f = null;
            this.f2497a = -1;
            this.d = false;
            L l2 = this.f2499c;
            if (l2.f2278e == this) {
                l2.f2278e = null;
            }
            this.f2499c = null;
            this.f2498b = null;
        }
    }
}
