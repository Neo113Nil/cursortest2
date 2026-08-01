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

/* renamed from: h0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0140w {

    /* renamed from: a, reason: collision with root package name */
    public int f2625a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2626b;

    /* renamed from: c, reason: collision with root package name */
    public J f2627c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2628e;

    /* renamed from: f, reason: collision with root package name */
    public View f2629f;

    /* renamed from: g, reason: collision with root package name */
    public final U f2630g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2631h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f2632j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f2633k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2634l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2635m;

    /* renamed from: n, reason: collision with root package name */
    public float f2636n;

    /* renamed from: o, reason: collision with root package name */
    public int f2637o;

    /* renamed from: p, reason: collision with root package name */
    public int f2638p;

    public C0140w(Context context) {
        U u2 = new U();
        u2.d = -1;
        u2.f2431f = false;
        u2.f2432g = 0;
        u2.f2427a = 0;
        u2.f2428b = 0;
        u2.f2429c = Integer.MIN_VALUE;
        u2.f2430e = null;
        this.f2630g = u2;
        this.i = new LinearInterpolator();
        this.f2632j = new DecelerateInterpolator();
        this.f2635m = false;
        this.f2637o = 0;
        this.f2638p = 0;
        this.f2634l = context.getResources().getDisplayMetrics();
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
        J j2 = this.f2627c;
        if (j2 == null || !j2.d()) {
            return 0;
        }
        K k2 = (K) view.getLayoutParams();
        return a((view.getLeft() - ((K) view.getLayoutParams()).f2410b.left) - ((ViewGroup.MarginLayoutParams) k2).leftMargin, view.getRight() + ((K) view.getLayoutParams()).f2410b.right + ((ViewGroup.MarginLayoutParams) k2).rightMargin, j2.E(), j2.f2407n - j2.F(), i);
    }

    public int c(View view, int i) {
        J j2 = this.f2627c;
        if (j2 == null || !j2.e()) {
            return 0;
        }
        K k2 = (K) view.getLayoutParams();
        return a((view.getTop() - ((K) view.getLayoutParams()).f2410b.top) - ((ViewGroup.MarginLayoutParams) k2).topMargin, view.getBottom() + ((K) view.getLayoutParams()).f2410b.bottom + ((ViewGroup.MarginLayoutParams) k2).bottomMargin, j2.G(), j2.f2408o - j2.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f2635m) {
            this.f2636n = d(this.f2634l);
            this.f2635m = true;
        }
        return (int) Math.ceil(abs * this.f2636n);
    }

    public PointF f(int i) {
        Object obj = this.f2627c;
        if (obj instanceof V) {
            return ((V) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + V.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f2;
        RecyclerView recyclerView = this.f2626b;
        if (this.f2625a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f2629f == null && this.f2627c != null && (f2 = f(this.f2625a)) != null) {
            float f3 = f2.x;
            if (f3 != RecyclerView.A0 || f2.y != RecyclerView.A0) {
                recyclerView.d0((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        this.d = false;
        View view = this.f2629f;
        U u2 = this.f2630g;
        if (view != null) {
            this.f2626b.getClass();
            a0 L2 = RecyclerView.L(view);
            if ((L2 != null ? L2.b() : -1) == this.f2625a) {
                View view2 = this.f2629f;
                W w2 = recyclerView.f1659e0;
                h(view2, u2);
                u2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2629f = null;
            }
        }
        if (this.f2628e) {
            W w3 = recyclerView.f1659e0;
            if (this.f2626b.f1672m.v() == 0) {
                i();
            } else {
                int i3 = this.f2637o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f2637o = i4;
                int i5 = this.f2638p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f2638p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f4 = f(this.f2625a);
                    if (f4 != null) {
                        if (f4.x != RecyclerView.A0 || f4.y != RecyclerView.A0) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.f2633k = f4;
                            this.f2637o = (int) (f6 * 10000.0f);
                            this.f2638p = (int) (f7 * 10000.0f);
                            int e2 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            u2.f2427a = (int) (this.f2637o * 1.2f);
                            u2.f2428b = (int) (this.f2638p * 1.2f);
                            u2.f2429c = (int) (e2 * 1.2f);
                            u2.f2430e = linearInterpolator;
                            u2.f2431f = true;
                        }
                    }
                    u2.d = this.f2625a;
                    i();
                }
            }
            boolean z2 = u2.d >= 0;
            u2.a(recyclerView);
            if (z2 && this.f2628e) {
                this.d = true;
                recyclerView.f1654b0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, U u2) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f2633k;
        int i2 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != RecyclerView.A0) {
                i = f2 > RecyclerView.A0 ? 1 : -1;
                int b2 = b(view, i);
                pointF = this.f2633k;
                if (pointF != null) {
                    float f3 = pointF.y;
                    if (f3 != RecyclerView.A0) {
                        i2 = f3 > RecyclerView.A0 ? 1 : -1;
                    }
                }
                int c2 = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2632j;
                    u2.f2427a = -b2;
                    u2.f2428b = -c2;
                    u2.f2429c = ceil;
                    u2.f2430e = decelerateInterpolator;
                    u2.f2431f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b22 = b(view, i);
        pointF = this.f2633k;
        if (pointF != null) {
        }
        int c22 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c22 * c22) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f2628e) {
            this.f2628e = false;
            this.f2638p = 0;
            this.f2637o = 0;
            this.f2633k = null;
            this.f2626b.f1659e0.f2433a = -1;
            this.f2629f = null;
            this.f2625a = -1;
            this.d = false;
            J j2 = this.f2627c;
            if (j2.f2399e == this) {
                j2.f2399e = null;
            }
            this.f2627c = null;
            this.f2626b = null;
        }
    }
}
