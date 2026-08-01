package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class lu {
    public final Context a;
    public final au b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public qu i;
    public ju j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final ku l = new ku(this);

    public lu(int i, int i2, au auVar, Context context, View view, boolean z) {
        this.a = context;
        this.b = auVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final ju a() {
        ju c40Var;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                c40Var = new l9(context2, this.f, this.d, this.e, this.c);
            } else {
                View view = this.f;
                c40Var = new c40(this.d, this.e, this.b, context2, view, this.c);
            }
            c40Var.l(this.b);
            c40Var.r(this.l);
            c40Var.n(this.f);
            c40Var.e(this.i);
            c40Var.o(this.h);
            c40Var.p(this.g);
            this.j = c40Var;
        }
        return this.j;
    }

    public final boolean b() {
        ju juVar = this.j;
        return juVar != null && juVar.b();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        ju a = a();
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
