package h0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0170u {

    /* renamed from: a, reason: collision with root package name */
    public int f3117a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3118b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0141G f3119c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3120d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public View f3121f;

    /* renamed from: g, reason: collision with root package name */
    public final C0150P f3122g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3123h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f3124k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f3125l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3126m;

    /* renamed from: n, reason: collision with root package name */
    public float f3127n;

    /* renamed from: o, reason: collision with root package name */
    public int f3128o;

    /* renamed from: p, reason: collision with root package name */
    public int f3129p;

    public C0170u(Context context) {
        C0150P c0150p = new C0150P();
        c0150p.f2937d = -1;
        c0150p.f2938f = false;
        c0150p.f2939g = 0;
        c0150p.f2934a = 0;
        c0150p.f2935b = 0;
        c0150p.f2936c = Integer.MIN_VALUE;
        c0150p.e = null;
        this.f3122g = c0150p;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f3126m = false;
        this.f3128o = 0;
        this.f3129p = 0;
        this.f3125l = context.getResources().getDisplayMetrics();
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
        AbstractC0141G abstractC0141G = this.f3119c;
        if (abstractC0141G == null || !abstractC0141G.d()) {
            return 0;
        }
        C0142H c0142h = (C0142H) view.getLayoutParams();
        return a((view.getLeft() - ((C0142H) view.getLayoutParams()).f2917b.left) - ((ViewGroup.MarginLayoutParams) c0142h).leftMargin, view.getRight() + ((C0142H) view.getLayoutParams()).f2917b.right + ((ViewGroup.MarginLayoutParams) c0142h).rightMargin, abstractC0141G.E(), abstractC0141G.f2914n - abstractC0141G.F(), i);
    }

    public int c(View view, int i) {
        AbstractC0141G abstractC0141G = this.f3119c;
        if (abstractC0141G == null || !abstractC0141G.e()) {
            return 0;
        }
        C0142H c0142h = (C0142H) view.getLayoutParams();
        return a((view.getTop() - ((C0142H) view.getLayoutParams()).f2917b.top) - ((ViewGroup.MarginLayoutParams) c0142h).topMargin, view.getBottom() + ((C0142H) view.getLayoutParams()).f2917b.bottom + ((ViewGroup.MarginLayoutParams) c0142h).bottomMargin, abstractC0141G.G(), abstractC0141G.f2915o - abstractC0141G.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f3126m) {
            this.f3127n = d(this.f3125l);
            this.f3126m = true;
        }
        return (int) Math.ceil(abs * this.f3127n);
    }

    public PointF f(int i) {
        Object obj = this.f3119c;
        if (obj instanceof Q) {
            return ((Q) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + Q.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f2;
        RecyclerView recyclerView = this.f3118b;
        if (this.f3117a == -1 || recyclerView == null) {
            i();
        }
        if (this.f3120d && this.f3121f == null && this.f3119c != null && (f2 = f(this.f3117a)) != null) {
            float f3 = f2.x;
            if (f3 != 0.0f || f2.y != 0.0f) {
                recyclerView.X((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        this.f3120d = false;
        View view = this.f3121f;
        C0150P c0150p = this.f3122g;
        if (view != null) {
            this.f3118b.getClass();
            V I2 = RecyclerView.I(view);
            if ((I2 != null ? I2.b() : -1) == this.f3117a) {
                View view2 = this.f3121f;
                S s2 = recyclerView.f2017c0;
                h(view2, c0150p);
                c0150p.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f3121f = null;
            }
        }
        if (this.e) {
            S s3 = recyclerView.f2017c0;
            if (this.f3118b.f2031l.v() == 0) {
                i();
            } else {
                int i3 = this.f3128o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f3128o = i4;
                int i5 = this.f3129p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f3129p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f4 = f(this.f3117a);
                    if (f4 != null) {
                        if (f4.x != 0.0f || f4.y != 0.0f) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.f3124k = f4;
                            this.f3128o = (int) (f6 * 10000.0f);
                            this.f3129p = (int) (f7 * 10000.0f);
                            int e = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            c0150p.f2934a = (int) (this.f3128o * 1.2f);
                            c0150p.f2935b = (int) (this.f3129p * 1.2f);
                            c0150p.f2936c = (int) (e * 1.2f);
                            c0150p.e = linearInterpolator;
                            c0150p.f2938f = true;
                        }
                    }
                    c0150p.f2937d = this.f3117a;
                    i();
                }
            }
            boolean z2 = c0150p.f2937d >= 0;
            c0150p.a(recyclerView);
            if (z2 && this.e) {
                this.f3120d = true;
                recyclerView.f2011W.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, C0150P c0150p) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f3124k;
        int i2 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != 0.0f) {
                i = f2 > 0.0f ? 1 : -1;
                int b2 = b(view, i);
                pointF = this.f3124k;
                if (pointF != null) {
                    float f3 = pointF.y;
                    if (f3 != 0.0f) {
                        i2 = f3 > 0.0f ? 1 : -1;
                    }
                }
                int c2 = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.j;
                    c0150p.f2934a = -b2;
                    c0150p.f2935b = -c2;
                    c0150p.f2936c = ceil;
                    c0150p.e = decelerateInterpolator;
                    c0150p.f2938f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b22 = b(view, i);
        pointF = this.f3124k;
        if (pointF != null) {
        }
        int c22 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c22 * c22) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.f3129p = 0;
            this.f3128o = 0;
            this.f3124k = null;
            this.f3118b.f2017c0.f2940a = -1;
            this.f3121f = null;
            this.f3117a = -1;
            this.f3120d = false;
            AbstractC0141G abstractC0141G = this.f3119c;
            if (abstractC0141G.e == this) {
                abstractC0141G.e = null;
            }
            this.f3119c = null;
            this.f3118b = null;
        }
    }
}
