package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gn {
    public View a;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final gd e;
    private final boolean f;
    private final int g;
    private boolean h;
    private go i;
    private gl j;
    public int b = 8388611;
    private final PopupWindow.OnDismissListener k = new gm(this);

    public gn(Context context, gd gdVar, View view, boolean z, int i) {
        this.d = context;
        this.e = gdVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }

    public final gl a() {
        gl glVar = this.j;
        if (glVar == null) {
            Context context = this.d;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            glVar = Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new fx(context, this.a, this.g, this.f) : new gv(context, this.e, this.a, this.g, this.f);
            glVar.l(this.e);
            glVar.s(this.k);
            glVar.o(this.a);
            glVar.e(this.i);
            glVar.p(this.h);
            glVar.q(this.b);
            this.j = glVar;
        }
        return glVar;
    }

    public final void b() {
        if (g()) {
            this.j.m();
        }
    }

    protected void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        gl glVar = this.j;
        if (glVar != null) {
            glVar.p(z);
        }
    }

    public final void e(go goVar) {
        this.i = goVar;
        gl glVar = this.j;
        if (glVar != null) {
            glVar.e(goVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        gl a = a();
        a.t(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            a.r(i);
            a.u(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            a.g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        a.v();
    }

    public final boolean g() {
        gl glVar = this.j;
        return glVar != null && glVar.x();
    }

    public final boolean h() {
        if (g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        f(0, 0, false, false);
        return true;
    }
}
