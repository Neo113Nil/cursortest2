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
public class C0104v {

    /* renamed from: a, reason: collision with root package name */
    public int f2166a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2167b;

    /* renamed from: c, reason: collision with root package name */
    public I f2168c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2169e;

    /* renamed from: f, reason: collision with root package name */
    public View f2170f;

    /* renamed from: g, reason: collision with root package name */
    public final S f2171g;
    public boolean h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f2172j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f2173k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2174l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2175m;

    /* renamed from: n, reason: collision with root package name */
    public float f2176n;

    /* renamed from: o, reason: collision with root package name */
    public int f2177o;

    /* renamed from: p, reason: collision with root package name */
    public int f2178p;

    public C0104v(Context context) {
        S s2 = new S();
        s2.d = -1;
        s2.f1987f = false;
        s2.f1988g = 0;
        s2.f1983a = 0;
        s2.f1984b = 0;
        s2.f1985c = Integer.MIN_VALUE;
        s2.f1986e = null;
        this.f2171g = s2;
        this.i = new LinearInterpolator();
        this.f2172j = new DecelerateInterpolator();
        this.f2175m = false;
        this.f2177o = 0;
        this.f2178p = 0;
        this.f2174l = context.getResources().getDisplayMetrics();
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
        I i2 = this.f2168c;
        if (i2 == null || !i2.d()) {
            return 0;
        }
        J j2 = (J) view.getLayoutParams();
        return a((view.getLeft() - ((J) view.getLayoutParams()).f1969b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin, view.getRight() + ((J) view.getLayoutParams()).f1969b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin, i2.E(), i2.f1966n - i2.F(), i);
    }

    public int c(View view, int i) {
        I i2 = this.f2168c;
        if (i2 == null || !i2.e()) {
            return 0;
        }
        J j2 = (J) view.getLayoutParams();
        return a((view.getTop() - ((J) view.getLayoutParams()).f1969b.top) - ((ViewGroup.MarginLayoutParams) j2).topMargin, view.getBottom() + ((J) view.getLayoutParams()).f1969b.bottom + ((ViewGroup.MarginLayoutParams) j2).bottomMargin, i2.G(), i2.f1967o - i2.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f2175m) {
            this.f2176n = d(this.f2174l);
            this.f2175m = true;
        }
        return (int) Math.ceil(abs * this.f2176n);
    }

    public PointF f(int i) {
        Object obj = this.f2168c;
        if (obj instanceof T) {
            return ((T) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + T.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f2;
        RecyclerView recyclerView = this.f2167b;
        if (this.f2166a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f2170f == null && this.f2168c != null && (f2 = f(this.f2166a)) != null) {
            float f3 = f2.x;
            if (f3 != 0.0f || f2.y != 0.0f) {
                recyclerView.X((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        this.d = false;
        View view = this.f2170f;
        S s2 = this.f2171g;
        if (view != null) {
            this.f2167b.getClass();
            X I2 = RecyclerView.I(view);
            if ((I2 != null ? I2.b() : -1) == this.f2166a) {
                View view2 = this.f2170f;
                U u2 = recyclerView.f1436c0;
                h(view2, s2);
                s2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2170f = null;
            }
        }
        if (this.f2169e) {
            U u3 = recyclerView.f1436c0;
            if (this.f2167b.f1449l.v() == 0) {
                i();
            } else {
                int i3 = this.f2177o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f2177o = i4;
                int i5 = this.f2178p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f2178p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f4 = f(this.f2166a);
                    if (f4 != null) {
                        if (f4.x != 0.0f || f4.y != 0.0f) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.f2173k = f4;
                            this.f2177o = (int) (f6 * 10000.0f);
                            this.f2178p = (int) (f7 * 10000.0f);
                            int e2 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            s2.f1983a = (int) (this.f2177o * 1.2f);
                            s2.f1984b = (int) (this.f2178p * 1.2f);
                            s2.f1985c = (int) (e2 * 1.2f);
                            s2.f1986e = linearInterpolator;
                            s2.f1987f = true;
                        }
                    }
                    s2.d = this.f2166a;
                    i();
                }
            }
            boolean z2 = s2.d >= 0;
            s2.a(recyclerView);
            if (z2 && this.f2169e) {
                this.d = true;
                recyclerView.f1430W.a();
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
        PointF pointF2 = this.f2173k;
        int i2 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != 0.0f) {
                i = f2 > 0.0f ? 1 : -1;
                int b2 = b(view, i);
                pointF = this.f2173k;
                if (pointF != null) {
                    float f3 = pointF.y;
                    if (f3 != 0.0f) {
                        i2 = f3 > 0.0f ? 1 : -1;
                    }
                }
                int c2 = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2172j;
                    s2.f1983a = -b2;
                    s2.f1984b = -c2;
                    s2.f1985c = ceil;
                    s2.f1986e = decelerateInterpolator;
                    s2.f1987f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b22 = b(view, i);
        pointF = this.f2173k;
        if (pointF != null) {
        }
        int c22 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c22 * c22) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f2169e) {
            this.f2169e = false;
            this.f2178p = 0;
            this.f2177o = 0;
            this.f2173k = null;
            this.f2167b.f1436c0.f1989a = -1;
            this.f2170f = null;
            this.f2166a = -1;
            this.d = false;
            I i = this.f2168c;
            if (i.f1959e == this) {
                i.f1959e = null;
            }
            this.f2168c = null;
            this.f2167b = null;
        }
    }
}
