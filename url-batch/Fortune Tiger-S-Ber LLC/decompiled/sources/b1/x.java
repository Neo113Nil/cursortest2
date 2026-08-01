package b1;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public int f936a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f937b;
    public n0 c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f938d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f939e;

    /* renamed from: f, reason: collision with root package name */
    public View f940f;
    public final x0 g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f941i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f942j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f943k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f944l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f945m;

    /* renamed from: n, reason: collision with root package name */
    public float f946n;

    /* renamed from: o, reason: collision with root package name */
    public int f947o;

    /* renamed from: p, reason: collision with root package name */
    public int f948p;

    public x(Context context) {
        x0 x0Var = new x0();
        x0Var.f951d = -1;
        x0Var.f953f = false;
        x0Var.g = 0;
        x0Var.f949a = 0;
        x0Var.f950b = 0;
        x0Var.c = Integer.MIN_VALUE;
        x0Var.f952e = null;
        this.g = x0Var;
        this.f941i = new LinearInterpolator();
        this.f942j = new DecelerateInterpolator();
        this.f945m = false;
        this.f947o = 0;
        this.f948p = 0;
        this.f944l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == -1) {
            return i6 - i4;
        }
        if (i8 != 0) {
            if (i8 == 1) {
                return i7 - i5;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i9 = i6 - i4;
        if (i9 > 0) {
            return i9;
        }
        int i10 = i7 - i5;
        if (i10 < 0) {
            return i10;
        }
        return 0;
    }

    public int b(View view, int i4) {
        n0 n0Var = this.c;
        if (n0Var == null || !n0Var.d()) {
            return 0;
        }
        o0 o0Var = (o0) view.getLayoutParams();
        return a((view.getLeft() - ((o0) view.getLayoutParams()).f890b.left) - ((ViewGroup.MarginLayoutParams) o0Var).leftMargin, view.getRight() + ((o0) view.getLayoutParams()).f890b.right + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, n0Var.E(), n0Var.f884n - n0Var.F(), i4);
    }

    public int c(View view, int i4) {
        n0 n0Var = this.c;
        if (n0Var == null || !n0Var.e()) {
            return 0;
        }
        o0 o0Var = (o0) view.getLayoutParams();
        return a((view.getTop() - ((o0) view.getLayoutParams()).f890b.top) - ((ViewGroup.MarginLayoutParams) o0Var).topMargin, view.getBottom() + ((o0) view.getLayoutParams()).f890b.bottom + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin, n0Var.G(), n0Var.f885o - n0Var.D(), i4);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i4) {
        float abs = Math.abs(i4);
        if (!this.f945m) {
            this.f946n = d(this.f944l);
            this.f945m = true;
        }
        return (int) Math.ceil(abs * this.f946n);
    }

    public PointF f(int i4) {
        Object obj = this.c;
        if (obj instanceof y0) {
            return ((y0) obj).a(i4);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + y0.class.getCanonicalName());
        return null;
    }

    public final void g(int i4, int i5) {
        PointF f4;
        RecyclerView recyclerView = this.f937b;
        if (this.f936a == -1 || recyclerView == null) {
            i();
        }
        if (this.f938d && this.f940f == null && this.c != null && (f4 = f(this.f936a)) != null) {
            float f5 = f4.x;
            if (f5 != 0.0f || f4.y != 0.0f) {
                recyclerView.Y((int) Math.signum(f5), (int) Math.signum(f4.y), null);
            }
        }
        this.f938d = false;
        View view = this.f940f;
        x0 x0Var = this.g;
        if (view != null) {
            this.f937b.getClass();
            c1 I = RecyclerView.I(view);
            if ((I != null ? I.b() : -1) == this.f936a) {
                View view2 = this.f940f;
                z0 z0Var = recyclerView.f640k0;
                h(view2, x0Var);
                x0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f940f = null;
            }
        }
        if (this.f939e) {
            z0 z0Var2 = recyclerView.f640k0;
            if (this.f937b.f653r.v() == 0) {
                i();
            } else {
                int i6 = this.f947o;
                int i7 = i6 - i4;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.f947o = i7;
                int i8 = this.f948p;
                int i9 = i8 - i5;
                if (i8 * i9 <= 0) {
                    i9 = 0;
                }
                this.f948p = i9;
                if (i7 == 0 && i9 == 0) {
                    PointF f6 = f(this.f936a);
                    if (f6 != null) {
                        if (f6.x != 0.0f || f6.y != 0.0f) {
                            float f7 = f6.y;
                            float sqrt = (float) Math.sqrt((f7 * f7) + (r10 * r10));
                            float f8 = f6.x / sqrt;
                            f6.x = f8;
                            float f9 = f6.y / sqrt;
                            f6.y = f9;
                            this.f943k = f6;
                            this.f947o = (int) (f8 * 10000.0f);
                            this.f948p = (int) (f9 * 10000.0f);
                            int e4 = e(10000);
                            x0Var.f949a = (int) (this.f947o * 1.2f);
                            x0Var.f950b = (int) (this.f948p * 1.2f);
                            x0Var.c = (int) (e4 * 1.2f);
                            x0Var.f952e = this.f941i;
                            x0Var.f953f = true;
                        }
                    }
                    x0Var.f951d = this.f936a;
                    i();
                }
            }
            boolean z3 = x0Var.f951d >= 0;
            x0Var.a(recyclerView);
            if (z3 && this.f939e) {
                this.f938d = true;
                recyclerView.f634h0.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, x0 x0Var) {
        int i4;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f943k;
        int i5 = 0;
        if (pointF2 != null) {
            float f4 = pointF2.x;
            if (f4 != 0.0f) {
                i4 = f4 > 0.0f ? 1 : -1;
                int b2 = b(view, i4);
                pointF = this.f943k;
                if (pointF != null) {
                    float f5 = pointF.y;
                    if (f5 != 0.0f) {
                        i5 = f5 > 0.0f ? 1 : -1;
                    }
                }
                int c = c(view, i5);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c * c) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    x0Var.f949a = -b2;
                    x0Var.f950b = -c;
                    x0Var.c = ceil;
                    x0Var.f952e = this.f942j;
                    x0Var.f953f = true;
                    return;
                }
                return;
            }
        }
        i4 = 0;
        int b22 = b(view, i4);
        pointF = this.f943k;
        if (pointF != null) {
        }
        int c4 = c(view, i5);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c4 * c4) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f939e) {
            this.f939e = false;
            this.f948p = 0;
            this.f947o = 0;
            this.f943k = null;
            this.f937b.f640k0.f956a = -1;
            this.f940f = null;
            this.f936a = -1;
            this.f938d = false;
            n0 n0Var = this.c;
            if (n0Var.f877e == this) {
                n0Var.f877e = null;
            }
            this.c = null;
            this.f937b = null;
        }
    }
}
