package g1;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1675a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f1676b;

    /* renamed from: c, reason: collision with root package name */
    public a1 f1677c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1678e;

    /* renamed from: f, reason: collision with root package name */
    public View f1679f;

    /* renamed from: g, reason: collision with root package name */
    public final k1 f1680g;
    public boolean h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f1681j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f1682k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f1683l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1684m;

    /* renamed from: n, reason: collision with root package name */
    public float f1685n;

    /* renamed from: o, reason: collision with root package name */
    public int f1686o;

    /* renamed from: p, reason: collision with root package name */
    public int f1687p;

    public h0(Context context) {
        k1 k1Var = new k1();
        k1Var.d = -1;
        k1Var.f1705f = false;
        k1Var.f1706g = 0;
        k1Var.f1701a = 0;
        k1Var.f1702b = 0;
        k1Var.f1703c = Integer.MIN_VALUE;
        k1Var.f1704e = null;
        this.f1680g = k1Var;
        this.i = new LinearInterpolator();
        this.f1681j = new DecelerateInterpolator();
        this.f1684m = false;
        this.f1686o = 0;
        this.f1687p = 0;
        this.f1683l = context.getResources().getDisplayMetrics();
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
        a1 a1Var = this.f1677c;
        if (a1Var == null || !a1Var.d()) {
            return 0;
        }
        b1 b1Var = (b1) view.getLayoutParams();
        return a((view.getLeft() - ((b1) view.getLayoutParams()).f1618b.left) - ((ViewGroup.MarginLayoutParams) b1Var).leftMargin, view.getRight() + ((b1) view.getLayoutParams()).f1618b.right + ((ViewGroup.MarginLayoutParams) b1Var).rightMargin, a1Var.D(), a1Var.f1607n - a1Var.E(), i);
    }

    public int c(View view, int i) {
        a1 a1Var = this.f1677c;
        if (a1Var == null || !a1Var.e()) {
            return 0;
        }
        b1 b1Var = (b1) view.getLayoutParams();
        return a((view.getTop() - ((b1) view.getLayoutParams()).f1618b.top) - ((ViewGroup.MarginLayoutParams) b1Var).topMargin, view.getBottom() + ((b1) view.getLayoutParams()).f1618b.bottom + ((ViewGroup.MarginLayoutParams) b1Var).bottomMargin, a1Var.F(), a1Var.f1608o - a1Var.C(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f1684m) {
            this.f1685n = d(this.f1683l);
            this.f1684m = true;
        }
        return (int) Math.ceil(abs * this.f1685n);
    }

    public PointF f(int i) {
        Object obj = this.f1677c;
        if (obj instanceof l1) {
            return ((l1) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + l1.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i4) {
        PointF f5;
        RecyclerView recyclerView = this.f1676b;
        if (this.f1675a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f1679f == null && this.f1677c != null && (f5 = f(this.f1675a)) != null) {
            float f6 = f5.x;
            if (f6 != 0.0f || f5.y != 0.0f) {
                recyclerView.f0((int) Math.signum(f6), (int) Math.signum(f5.y), null);
            }
        }
        this.d = false;
        View view = this.f1679f;
        k1 k1Var = this.f1680g;
        if (view != null) {
            this.f1676b.getClass();
            q1 M = RecyclerView.M(view);
            if ((M != null ? M.b() : -1) == this.f1675a) {
                View view2 = this.f1679f;
                m1 m1Var = recyclerView.f775l0;
                h(view2, k1Var);
                k1Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f1679f = null;
            }
        }
        if (this.f1678e) {
            m1 m1Var2 = recyclerView.f775l0;
            if (this.f1676b.f788s.v() == 0) {
                i();
            } else {
                int i5 = this.f1686o;
                int i6 = i5 - i;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f1686o = i6;
                int i7 = this.f1687p;
                int i8 = i7 - i4;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.f1687p = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF f7 = f(this.f1675a);
                    if (f7 != null) {
                        if (f7.x != 0.0f || f7.y != 0.0f) {
                            float f8 = f7.y;
                            float sqrt = (float) Math.sqrt((f8 * f8) + (r10 * r10));
                            float f9 = f7.x / sqrt;
                            f7.x = f9;
                            float f10 = f7.y / sqrt;
                            f7.y = f10;
                            this.f1682k = f7;
                            this.f1686o = (int) (f9 * 10000.0f);
                            this.f1687p = (int) (f10 * 10000.0f);
                            int e4 = e(10000);
                            k1Var.f1701a = (int) (this.f1686o * 1.2f);
                            k1Var.f1702b = (int) (this.f1687p * 1.2f);
                            k1Var.f1703c = (int) (e4 * 1.2f);
                            k1Var.f1704e = this.i;
                            k1Var.f1705f = true;
                        }
                    }
                    k1Var.d = this.f1675a;
                    i();
                }
            }
            boolean z4 = k1Var.d >= 0;
            k1Var.a(recyclerView);
            if (z4 && this.f1678e) {
                this.d = true;
                recyclerView.i0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, k1 k1Var) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f1682k;
        int i4 = 0;
        if (pointF2 != null) {
            float f5 = pointF2.x;
            if (f5 != 0.0f) {
                i = f5 > 0.0f ? 1 : -1;
                int b2 = b(view, i);
                pointF = this.f1682k;
                if (pointF != null) {
                    float f6 = pointF.y;
                    if (f6 != 0.0f) {
                        i4 = f6 > 0.0f ? 1 : -1;
                    }
                }
                int c5 = c(view, i4);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c5 * c5) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    k1Var.f1701a = -b2;
                    k1Var.f1702b = -c5;
                    k1Var.f1703c = ceil;
                    k1Var.f1704e = this.f1681j;
                    k1Var.f1705f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b22 = b(view, i);
        pointF = this.f1682k;
        if (pointF != null) {
        }
        int c52 = c(view, i4);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c52 * c52) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f1678e) {
            this.f1678e = false;
            this.f1687p = 0;
            this.f1686o = 0;
            this.f1682k = null;
            this.f1676b.f775l0.f1720a = -1;
            this.f1679f = null;
            this.f1675a = -1;
            this.d = false;
            a1 a1Var = this.f1677c;
            if (a1Var.f1600e == this) {
                a1Var.f1600e = null;
            }
            this.f1677c = null;
            this.f1676b = null;
        }
    }
}
