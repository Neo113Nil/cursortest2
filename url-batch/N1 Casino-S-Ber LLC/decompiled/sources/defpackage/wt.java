package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class wt {
    public final Context a;
    public final mt b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public bu i;
    public ut j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final vt l = new vt(this);

    public wt(int i, int i2, mt mtVar, Context context, View view, boolean z) {
        this.a = context;
        this.b = mtVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final ut a() {
        ut t30Var;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                t30Var = new q9(context2, this.f, this.d, this.e, this.c);
            } else {
                View view = this.f;
                t30Var = new t30(this.d, this.e, this.b, context2, view, this.c);
            }
            t30Var.l(this.b);
            t30Var.r(this.l);
            t30Var.n(this.f);
            t30Var.e(this.i);
            t30Var.o(this.h);
            t30Var.p(this.g);
            this.j = t30Var;
        }
        return this.j;
    }

    public final boolean b() {
        ut utVar = this.j;
        return utVar != null && utVar.b();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        ut a = a();
        a.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            a.q(i);
            a.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.d();
    }
}
