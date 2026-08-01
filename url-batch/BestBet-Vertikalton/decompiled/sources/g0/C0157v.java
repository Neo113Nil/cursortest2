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

/* renamed from: g0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0157v {

    /* renamed from: a, reason: collision with root package name */
    public int f2938a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2939b;

    /* renamed from: c, reason: collision with root package name */
    public H f2940c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2941e;

    /* renamed from: f, reason: collision with root package name */
    public View f2942f;

    /* renamed from: g, reason: collision with root package name */
    public final S f2943g;
    public boolean h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f2944j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f2945k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2946l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2947m;

    /* renamed from: n, reason: collision with root package name */
    public float f2948n;

    /* renamed from: o, reason: collision with root package name */
    public int f2949o;

    /* renamed from: p, reason: collision with root package name */
    public int f2950p;

    public C0157v(Context context) {
        S s2 = new S();
        s2.d = -1;
        s2.f2757f = false;
        s2.f2758g = 0;
        s2.f2753a = 0;
        s2.f2754b = 0;
        s2.f2755c = Integer.MIN_VALUE;
        s2.f2756e = null;
        this.f2943g = s2;
        this.i = new LinearInterpolator();
        this.f2944j = new DecelerateInterpolator();
        this.f2947m = false;
        this.f2949o = 0;
        this.f2950p = 0;
        this.f2946l = context.getResources().getDisplayMetrics();
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
        H h = this.f2940c;
        if (h == null || !h.d()) {
            return 0;
        }
        I i2 = (I) view.getLayoutParams();
        return a((view.getLeft() - ((I) view.getLayoutParams()).f2737b.left) - ((ViewGroup.MarginLayoutParams) i2).leftMargin, view.getRight() + ((I) view.getLayoutParams()).f2737b.right + ((ViewGroup.MarginLayoutParams) i2).rightMargin, h.E(), h.f2734n - h.F(), i);
    }

    public int c(View view, int i) {
        H h = this.f2940c;
        if (h == null || !h.e()) {
            return 0;
        }
        I i2 = (I) view.getLayoutParams();
        return a((view.getTop() - ((I) view.getLayoutParams()).f2737b.top) - ((ViewGroup.MarginLayoutParams) i2).topMargin, view.getBottom() + ((I) view.getLayoutParams()).f2737b.bottom + ((ViewGroup.MarginLayoutParams) i2).bottomMargin, h.G(), h.f2735o - h.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f2947m) {
            this.f2948n = d(this.f2946l);
            this.f2947m = true;
        }
        return (int) Math.ceil(abs * this.f2948n);
    }

    public PointF f(int i) {
        Object obj = this.f2940c;
        if (obj instanceof T) {
            return ((T) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + T.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f2;
        RecyclerView recyclerView = this.f2939b;
        if (this.f2938a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f2942f == null && this.f2940c != null && (f2 = f(this.f2938a)) != null) {
            float f3 = f2.x;
            if (f3 != RecyclerView.f1937A0 || f2.y != RecyclerView.f1937A0) {
                recyclerView.d0((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        this.d = false;
        View view = this.f2942f;
        S s2 = this.f2943g;
        if (view != null) {
            this.f2939b.getClass();
            Y L2 = RecyclerView.L(view);
            if ((L2 != null ? L2.b() : -1) == this.f2938a) {
                View view2 = this.f2942f;
                U u2 = recyclerView.f1976e0;
                h(view2, s2);
                s2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2942f = null;
            }
        }
        if (this.f2941e) {
            U u3 = recyclerView.f1976e0;
            if (this.f2939b.f1989m.v() == 0) {
                i();
            } else {
                int i3 = this.f2949o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f2949o = i4;
                int i5 = this.f2950p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f2950p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f4 = f(this.f2938a);
                    if (f4 != null) {
                        if (f4.x != RecyclerView.f1937A0 || f4.y != RecyclerView.f1937A0) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.f2945k = f4;
                            this.f2949o = (int) (f6 * 10000.0f);
                            this.f2950p = (int) (f7 * 10000.0f);
                            int e2 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            s2.f2753a = (int) (this.f2949o * 1.2f);
                            s2.f2754b = (int) (this.f2950p * 1.2f);
                            s2.f2755c = (int) (e2 * 1.2f);
                            s2.f2756e = linearInterpolator;
                            s2.f2757f = true;
                        }
                    }
                    s2.d = this.f2938a;
                    i();
                }
            }
            boolean z2 = s2.d >= 0;
            s2.a(recyclerView);
            if (z2 && this.f2941e) {
                this.d = true;
                recyclerView.f1971b0.b();
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
        PointF pointF2 = this.f2945k;
        int i2 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != RecyclerView.f1937A0) {
                i = f2 > RecyclerView.f1937A0 ? 1 : -1;
                int b2 = b(view, i);
                pointF = this.f2945k;
                if (pointF != null) {
                    float f3 = pointF.y;
                    if (f3 != RecyclerView.f1937A0) {
                        i2 = f3 > RecyclerView.f1937A0 ? 1 : -1;
                    }
                }
                int c2 = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2944j;
                    s2.f2753a = -b2;
                    s2.f2754b = -c2;
                    s2.f2755c = ceil;
                    s2.f2756e = decelerateInterpolator;
                    s2.f2757f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b22 = b(view, i);
        pointF = this.f2945k;
        if (pointF != null) {
        }
        int c22 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c22 * c22) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f2941e) {
            this.f2941e = false;
            this.f2950p = 0;
            this.f2949o = 0;
            this.f2945k = null;
            this.f2939b.f1976e0.f2759a = -1;
            this.f2942f = null;
            this.f2938a = -1;
            this.d = false;
            H h = this.f2940c;
            if (h.f2727e == this) {
                h.f2727e = null;
            }
            this.f2940c = null;
            this.f2939b = null;
        }
    }
}
