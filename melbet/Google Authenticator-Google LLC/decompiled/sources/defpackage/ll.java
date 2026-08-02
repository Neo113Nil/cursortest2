package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ll {
    public RecyclerView c;
    public ky d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;
    protected PointF k;
    private final DisplayMetrics n;
    private float p;
    public int b = -1;
    private final lj a = new lj();
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    private boolean o = false;
    protected int l = 0;
    protected int m = 0;

    public ll(Context context) {
        this.n = context.getResources().getDisplayMetrics();
    }

    public static int h(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
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

    public static final int i(View view) {
        lp h = RecyclerView.h(view);
        if (h != null) {
            return h.b();
        }
        return -1;
    }

    private static int j(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int b(int i) {
        float abs = Math.abs(i);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) Math.ceil(abs * this.p);
    }

    protected void c(View view, lj ljVar) {
        int i;
        PointF pointF = this.k;
        int i2 = 1;
        int i3 = 0;
        int i4 = (pointF == null || pointF.x == 0.0f) ? 0 : this.k.x > 0.0f ? 1 : -1;
        ky kyVar = this.d;
        if (kyVar == null || !kyVar.ad()) {
            i = 0;
        } else {
            kz kzVar = (kz) view.getLayoutParams();
            i = h(ky.bw(view) - kzVar.leftMargin, ky.bx(view) + kzVar.rightMargin, kyVar.aA(), kyVar.C - kyVar.aB(), i4);
        }
        PointF pointF2 = this.k;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i2 = 0;
        } else if (this.k.y <= 0.0f) {
            i2 = -1;
        }
        ky kyVar2 = this.d;
        if (kyVar2 != null && kyVar2.ae()) {
            kz kzVar2 = (kz) view.getLayoutParams();
            i3 = h(ky.by(view) - kzVar2.topMargin, ky.bv(view) + kzVar2.bottomMargin, kyVar2.aC(), kyVar2.D - kyVar2.az(), i2);
        }
        int g = g((int) Math.sqrt((i * i) + (i3 * i3)));
        if (g > 0) {
            ljVar.b(-i, -i3, g, this.j);
        }
    }

    public final PointF d(int i) {
        Object obj = this.d;
        if (obj instanceof lk) {
            return ((lk) obj).M(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(lk.class.getCanonicalName())));
        return null;
    }

    final void e(int i, int i2) {
        PointF d;
        RecyclerView recyclerView = this.c;
        if (this.b == -1 || recyclerView == null) {
            f();
        }
        if (this.e && this.g == null && this.d != null && (d = d(this.b)) != null && (d.x != 0.0f || d.y != 0.0f)) {
            recyclerView.U((int) Math.signum(d.x), (int) Math.signum(d.y), null);
        }
        this.e = false;
        View view = this.g;
        if (view != null) {
            if (i(view) == this.b) {
                View view2 = this.g;
                lm lmVar = recyclerView.M;
                lj ljVar = this.a;
                c(view2, ljVar);
                ljVar.a(recyclerView);
                f();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            lm lmVar2 = recyclerView.M;
            lj ljVar2 = this.a;
            if (this.c.m.at() == 0) {
                f();
            } else {
                int j = j(this.l, i);
                this.l = j;
                int j2 = j(this.m, i2);
                this.m = j2;
                if (j == 0 && j2 == 0) {
                    PointF d2 = d(this.b);
                    if (d2 == null || (d2.x == 0.0f && d2.y == 0.0f)) {
                        ljVar2.a = this.b;
                        f();
                    } else {
                        float sqrt = (float) Math.sqrt((d2.x * d2.x) + (d2.y * d2.y));
                        d2.x /= sqrt;
                        d2.y /= sqrt;
                        this.k = d2;
                        this.l = (int) (d2.x * 10000.0f);
                        this.m = (int) (d2.y * 10000.0f);
                        ljVar2.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (b(10000) * 1.2f), this.i);
                    }
                }
            }
            int i3 = ljVar2.a;
            ljVar2.a(recyclerView);
            if (i3 < 0 || !this.f) {
                return;
            }
            this.e = true;
            recyclerView.J.b();
        }
    }

    public final void f() {
        if (this.f) {
            this.f = false;
            this.m = 0;
            this.l = 0;
            this.k = null;
            this.c.M.a = -1;
            this.g = null;
            this.b = -1;
            this.e = false;
            ky kyVar = this.d;
            if (kyVar.t == this) {
                kyVar.t = null;
            }
            this.d = null;
            this.c = null;
        }
    }

    protected final int g(int i) {
        return (int) Math.ceil(b(i) / 0.3356d);
    }
}
