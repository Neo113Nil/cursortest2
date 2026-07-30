package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class tk1 {
    public final Context a;
    public final fk1 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public yk1 h;
    public rk1 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final sk1 k = new sk1(this);

    public tk1(Context context, fk1 fk1Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = fk1Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final rk1 a() {
        rk1 lo2Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                lo2Var = new at(context2, this.e, this.d, this.c);
            } else {
                lo2Var = new lo2(context2, this.b, this.e, this.d, this.c);
            }
            lo2Var.l(this.b);
            lo2Var.r(this.k);
            lo2Var.n(this.e);
            lo2Var.e(this.h);
            lo2Var.o(this.g);
            lo2Var.p(this.f);
            this.i = lo2Var;
        }
        return this.i;
    }

    public final boolean b() {
        rk1 rk1Var = this.i;
        return rk1Var != null && rk1Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        rk1 a = a();
        a.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a.q(i);
            a.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.m = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.c();
    }
}
