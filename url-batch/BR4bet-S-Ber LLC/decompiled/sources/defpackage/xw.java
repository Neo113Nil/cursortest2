package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class xw {
    public final Context a;
    public final mw b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public cx i;
    public vw j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final ww l = new ww(this);

    public xw(int i, int i2, mw mwVar, Context context, View view, boolean z) {
        this.a = context;
        this.b = mwVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final vw a() {
        vw w60Var;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                w60Var = new da(context2, this.f, this.d, this.e, this.c);
            } else {
                View view = this.f;
                w60Var = new w60(this.d, this.e, this.b, context2, view, this.c);
            }
            w60Var.l(this.b);
            w60Var.r(this.l);
            w60Var.n(this.f);
            w60Var.e(this.i);
            w60Var.o(this.h);
            w60Var.p(this.g);
            this.j = w60Var;
        }
        return this.j;
    }

    public final boolean b() {
        vw vwVar = this.j;
        return vwVar != null && vwVar.b();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        vw a = a();
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
