package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class b20 {
    public final Context a;
    public final r10 b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public g20 i;
    public z10 j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final a20 l = new a20(this);

    public b20(int i, int i2, r10 r10Var, Context context, View view, boolean z) {
        this.a = context;
        this.b = r10Var;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final z10 a() {
        z10 cf0Var;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                cf0Var = new wa(context2, this.f, this.d, this.e, this.c);
            } else {
                View view = this.f;
                cf0Var = new cf0(this.d, this.e, this.b, context2, view, this.c);
            }
            cf0Var.l(this.b);
            cf0Var.r(this.l);
            cf0Var.n(this.f);
            cf0Var.e(this.i);
            cf0Var.o(this.h);
            cf0Var.p(this.g);
            this.j = cf0Var;
        }
        return this.j;
    }

    public final boolean b() {
        z10 z10Var = this.j;
        return z10Var != null && z10Var.b();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        z10 a = a();
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
