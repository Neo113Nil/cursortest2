package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class wq {
    public int a = -1;
    public RecyclerView b;
    public nz c;
    public boolean d;
    public boolean e;
    public View f;
    public final xz g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public wq(Context context) {
        xz xzVar = new xz();
        xzVar.d = -1;
        xzVar.f = false;
        xzVar.g = 0;
        xzVar.a = 0;
        xzVar.b = 0;
        xzVar.c = Integer.MIN_VALUE;
        xzVar.e = null;
        this.g = xzVar;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            o8.j("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
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
        nz nzVar = this.c;
        if (nzVar == null || !nzVar.d()) {
            return 0;
        }
        oz ozVar = (oz) view.getLayoutParams();
        return a((view.getLeft() - ((oz) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ozVar).leftMargin, view.getRight() + ((oz) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ozVar).rightMargin, nzVar.E(), nzVar.n - nzVar.F(), i);
    }

    public int c(View view, int i) {
        nz nzVar = this.c;
        if (nzVar == null || !nzVar.e()) {
            return 0;
        }
        oz ozVar = (oz) view.getLayoutParams();
        return a((view.getTop() - ((oz) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ozVar).topMargin, view.getBottom() + ((oz) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ozVar).bottomMargin, nzVar.G(), nzVar.o - nzVar.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof yz) {
            return ((yz) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + yz.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f == null && this.c != null && (f = f(this.a)) != null) {
            float f2 = f.x;
            if (f2 != 0.0f || f.y != 0.0f) {
                recyclerView.Y((int) Math.signum(f2), (int) Math.signum(f.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        xz xzVar = this.g;
        if (view != null) {
            this.b.getClass();
            c00 I = RecyclerView.I(view);
            if ((I != null ? I.b() : -1) == this.a) {
                View view2 = this.f;
                zz zzVar = recyclerView.k0;
                h(view2, xzVar);
                xzVar.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            zz zzVar2 = recyclerView.k0;
            if (this.b.r.v() == 0) {
                i();
            } else {
                int i3 = this.o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.o = i4;
                int i5 = this.p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f3 = f(this.a);
                    if (f3 != null) {
                        if (f3.x != 0.0f || f3.y != 0.0f) {
                            float f4 = f3.y;
                            float sqrt = (float) Math.sqrt((f4 * f4) + (r10 * r10));
                            float f5 = f3.x / sqrt;
                            f3.x = f5;
                            float f6 = f3.y / sqrt;
                            f3.y = f6;
                            this.k = f3;
                            this.o = (int) (f5 * 10000.0f);
                            this.p = (int) (f6 * 10000.0f);
                            int e = e(10000);
                            xzVar.a = (int) (this.o * 1.2f);
                            xzVar.b = (int) (this.p * 1.2f);
                            xzVar.c = (int) (e * 1.2f);
                            xzVar.e = this.i;
                            xzVar.f = true;
                        }
                    }
                    xzVar.d = this.a;
                    i();
                }
            }
            boolean z = xzVar.d >= 0;
            xzVar.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.h0.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, xz xzVar) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.k;
        int i2 = 0;
        if (pointF2 != null) {
            float f = pointF2.x;
            if (f != 0.0f) {
                i = f > 0.0f ? 1 : -1;
                int b = b(view, i);
                pointF = this.k;
                if (pointF != null) {
                    float f2 = pointF.y;
                    if (f2 != 0.0f) {
                        i2 = f2 > 0.0f ? 1 : -1;
                    }
                }
                int c = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c * c) + (b * b))) / 0.3356d);
                if (ceil <= 0) {
                    xzVar.a = -b;
                    xzVar.b = -c;
                    xzVar.c = ceil;
                    xzVar.e = this.j;
                    xzVar.f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b2 = b(view, i);
        pointF = this.k;
        if (pointF != null) {
        }
        int c2 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.p = 0;
            this.o = 0;
            this.k = null;
            this.b.k0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            nz nzVar = this.c;
            if (nzVar.e == this) {
                nzVar.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
