package f1;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public int f1515a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f1516b;

    /* renamed from: c, reason: collision with root package name */
    public m0 f1517c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1518e;

    /* renamed from: f, reason: collision with root package name */
    public View f1519f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f1520g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1521h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f1522j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f1523k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f1524l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1525m;

    /* renamed from: n, reason: collision with root package name */
    public float f1526n;

    /* renamed from: o, reason: collision with root package name */
    public int f1527o;

    /* renamed from: p, reason: collision with root package name */
    public int f1528p;

    public w(Context context) {
        w0 w0Var = new w0();
        w0Var.d = -1;
        w0Var.f1533f = false;
        w0Var.f1534g = 0;
        w0Var.f1529a = 0;
        w0Var.f1530b = 0;
        w0Var.f1531c = Integer.MIN_VALUE;
        w0Var.f1532e = null;
        this.f1520g = w0Var;
        this.i = new LinearInterpolator();
        this.f1522j = new DecelerateInterpolator();
        this.f1525m = false;
        this.f1527o = 0;
        this.f1528p = 0;
        this.f1524l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i4, int i5, int i6, int i7) {
        if (i7 == -1) {
            return i5 - i;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                return i6 - i4;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i8 = i5 - i;
        if (i8 > 0) {
            return i8;
        }
        int i9 = i6 - i4;
        if (i9 < 0) {
            return i9;
        }
        return 0;
    }

    public int b(View view, int i) {
        m0 m0Var = this.f1517c;
        if (m0Var == null || !m0Var.d()) {
            return 0;
        }
        n0 n0Var = (n0) view.getLayoutParams();
        return a((view.getLeft() - ((n0) view.getLayoutParams()).f1461b.left) - ((ViewGroup.MarginLayoutParams) n0Var).leftMargin, view.getRight() + ((n0) view.getLayoutParams()).f1461b.right + ((ViewGroup.MarginLayoutParams) n0Var).rightMargin, m0Var.E(), m0Var.f1455n - m0Var.F(), i);
    }

    public int c(View view, int i) {
        m0 m0Var = this.f1517c;
        if (m0Var == null || !m0Var.e()) {
            return 0;
        }
        n0 n0Var = (n0) view.getLayoutParams();
        return a((view.getTop() - ((n0) view.getLayoutParams()).f1461b.top) - ((ViewGroup.MarginLayoutParams) n0Var).topMargin, view.getBottom() + ((n0) view.getLayoutParams()).f1461b.bottom + ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin, m0Var.G(), m0Var.f1456o - m0Var.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f1525m) {
            this.f1526n = d(this.f1524l);
            this.f1525m = true;
        }
        return (int) Math.ceil(abs * this.f1526n);
    }

    public PointF f(int i) {
        Object obj = this.f1517c;
        if (obj instanceof x0) {
            return ((x0) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + x0.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i4) {
        PointF f2;
        RecyclerView recyclerView = this.f1516b;
        if (this.f1515a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f1519f == null && this.f1517c != null && (f2 = f(this.f1515a)) != null) {
            float f4 = f2.x;
            if (f4 != 0.0f || f2.y != 0.0f) {
                recyclerView.Y((int) Math.signum(f4), (int) Math.signum(f2.y), null);
            }
        }
        this.d = false;
        View view = this.f1519f;
        w0 w0Var = this.f1520g;
        if (view != null) {
            this.f1516b.getClass();
            b1 I = RecyclerView.I(view);
            if ((I != null ? I.b() : -1) == this.f1515a) {
                View view2 = this.f1519f;
                y0 y0Var = recyclerView.f672k0;
                h(view2, w0Var);
                w0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f1519f = null;
            }
        }
        if (this.f1518e) {
            y0 y0Var2 = recyclerView.f672k0;
            if (this.f1516b.f685r.v() == 0) {
                i();
            } else {
                int i5 = this.f1527o;
                int i6 = i5 - i;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f1527o = i6;
                int i7 = this.f1528p;
                int i8 = i7 - i4;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.f1528p = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF f5 = f(this.f1515a);
                    if (f5 != null) {
                        if (f5.x != 0.0f || f5.y != 0.0f) {
                            float f6 = f5.y;
                            float sqrt = (float) Math.sqrt((f6 * f6) + (r10 * r10));
                            float f7 = f5.x / sqrt;
                            f5.x = f7;
                            float f8 = f5.y / sqrt;
                            f5.y = f8;
                            this.f1523k = f5;
                            this.f1527o = (int) (f7 * 10000.0f);
                            this.f1528p = (int) (f8 * 10000.0f);
                            int e4 = e(10000);
                            w0Var.f1529a = (int) (this.f1527o * 1.2f);
                            w0Var.f1530b = (int) (this.f1528p * 1.2f);
                            w0Var.f1531c = (int) (e4 * 1.2f);
                            w0Var.f1532e = this.i;
                            w0Var.f1533f = true;
                        }
                    }
                    w0Var.d = this.f1515a;
                    i();
                }
            }
            boolean z3 = w0Var.d >= 0;
            w0Var.a(recyclerView);
            if (z3 && this.f1518e) {
                this.d = true;
                recyclerView.f668h0.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, w0 w0Var) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f1523k;
        int i4 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != 0.0f) {
                i = f2 > 0.0f ? 1 : -1;
                int b4 = b(view, i);
                pointF = this.f1523k;
                if (pointF != null) {
                    float f4 = pointF.y;
                    if (f4 != 0.0f) {
                        i4 = f4 > 0.0f ? 1 : -1;
                    }
                }
                int c4 = c(view, i4);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c4 * c4) + (b4 * b4))) / 0.3356d);
                if (ceil <= 0) {
                    w0Var.f1529a = -b4;
                    w0Var.f1530b = -c4;
                    w0Var.f1531c = ceil;
                    w0Var.f1532e = this.f1522j;
                    w0Var.f1533f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b42 = b(view, i);
        pointF = this.f1523k;
        if (pointF != null) {
        }
        int c42 = c(view, i4);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c42 * c42) + (b42 * b42))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f1518e) {
            this.f1518e = false;
            this.f1528p = 0;
            this.f1527o = 0;
            this.f1523k = null;
            this.f1516b.f672k0.f1536a = -1;
            this.f1519f = null;
            this.f1515a = -1;
            this.d = false;
            m0 m0Var = this.f1517c;
            if (m0Var.f1447e == this) {
                m0Var.f1447e = null;
            }
            this.f1517c = null;
            this.f1516b = null;
        }
    }
}
