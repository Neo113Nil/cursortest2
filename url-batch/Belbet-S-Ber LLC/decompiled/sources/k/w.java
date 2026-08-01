package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2267a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2268b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2269c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2270e;

    /* renamed from: f, reason: collision with root package name */
    public View f2271f;
    public boolean h;
    public x i;

    /* renamed from: j, reason: collision with root package name */
    public u f2273j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2274k;

    /* renamed from: g, reason: collision with root package name */
    public int f2272g = 8388611;

    /* renamed from: l, reason: collision with root package name */
    public final v f2275l = new v(this);

    public w(int i, int i4, Context context, View view, m mVar, boolean z4) {
        this.f2267a = context;
        this.f2268b = mVar;
        this.f2271f = view;
        this.f2269c = z4;
        this.d = i;
        this.f2270e = i4;
    }

    public final u a() {
        u d0Var;
        if (this.f2273j == null) {
            Context context = this.f2267a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                d0Var = new g(this.f2267a, this.f2271f, this.d, this.f2270e, this.f2269c);
            } else {
                View view = this.f2271f;
                d0Var = new d0(this.d, this.f2270e, this.f2267a, view, this.f2268b, this.f2269c);
            }
            d0Var.l(this.f2268b);
            d0Var.r(this.f2275l);
            d0Var.n(this.f2271f);
            d0Var.i(this.i);
            d0Var.o(this.h);
            d0Var.p(this.f2272g);
            this.f2273j = d0Var;
        }
        return this.f2273j;
    }

    public final boolean b() {
        u uVar = this.f2273j;
        return uVar != null && uVar.b();
    }

    public void c() {
        this.f2273j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2274k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i4, boolean z4, boolean z5) {
        u a5 = a();
        a5.s(z5);
        if (z4) {
            if ((Gravity.getAbsoluteGravity(this.f2272g, this.f2271f.getLayoutDirection()) & 7) == 5) {
                i -= this.f2271f.getWidth();
            }
            a5.q(i);
            a5.t(i4);
            int i5 = (int) ((this.f2267a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a5.f2265f = new Rect(i - i5, i4 - i5, i + i5, i4 + i5);
        }
        a5.e();
    }
}
