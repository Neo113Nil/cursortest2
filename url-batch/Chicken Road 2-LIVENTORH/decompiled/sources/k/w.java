package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2119a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2120b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2121c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2122e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2124g;

    /* renamed from: h, reason: collision with root package name */
    public x f2125h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2126j;

    /* renamed from: f, reason: collision with root package name */
    public int f2123f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final v f2127k = new v(this);

    public w(Context context, m mVar, View view, boolean z3, int i, int i4) {
        this.f2119a = context;
        this.f2120b = mVar;
        this.f2122e = view;
        this.f2121c = z3;
        this.d = i;
    }

    public final u a() {
        u d0Var;
        if (this.i == null) {
            Context context = this.f2119a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                d0Var = new g(context, this.f2122e, this.d, this.f2121c);
            } else {
                d0Var = new d0(this.f2119a, this.f2120b, this.f2122e, this.d, this.f2121c);
            }
            d0Var.n(this.f2120b);
            d0Var.t(this.f2127k);
            d0Var.p(this.f2122e);
            d0Var.l(this.f2125h);
            d0Var.q(this.f2124g);
            d0Var.r(this.f2123f);
            this.i = d0Var;
        }
        return this.i;
    }

    public final boolean b() {
        u uVar = this.i;
        return uVar != null && uVar.b();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2126j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i4, boolean z3, boolean z4) {
        u a2 = a();
        a2.u(z4);
        if (z3) {
            if ((Gravity.getAbsoluteGravity(this.f2123f, this.f2122e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2122e.getWidth();
            }
            a2.s(i);
            a2.v(i4);
            int i5 = (int) ((this.f2119a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2117f = new Rect(i - i5, i4 - i5, i + i5, i4 + i5);
        }
        a2.f();
    }
}
