package j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2244a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2245b;
    public final boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2246d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2247e;

    /* renamed from: f, reason: collision with root package name */
    public View f2248f;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public x f2249i;

    /* renamed from: j, reason: collision with root package name */
    public u f2250j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2251k;
    public int g = 8388611;

    /* renamed from: l, reason: collision with root package name */
    public final v f2252l = new v(this);

    public w(int i4, int i5, Context context, View view, m mVar, boolean z3) {
        this.f2244a = context;
        this.f2245b = mVar;
        this.f2248f = view;
        this.c = z3;
        this.f2246d = i4;
        this.f2247e = i5;
    }

    public final u a() {
        u d0Var;
        if (this.f2250j == null) {
            Context context = this.f2244a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                d0Var = new g(this.f2244a, this.f2248f, this.f2246d, this.f2247e, this.c);
            } else {
                View view = this.f2248f;
                d0Var = new d0(this.f2246d, this.f2247e, this.f2244a, view, this.f2245b, this.c);
            }
            d0Var.l(this.f2245b);
            d0Var.r(this.f2252l);
            d0Var.n(this.f2248f);
            d0Var.j(this.f2249i);
            d0Var.o(this.h);
            d0Var.p(this.g);
            this.f2250j = d0Var;
        }
        return this.f2250j;
    }

    public final boolean b() {
        u uVar = this.f2250j;
        return uVar != null && uVar.b();
    }

    public void c() {
        this.f2250j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2251k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i4, int i5, boolean z3, boolean z4) {
        u a4 = a();
        a4.s(z4);
        if (z3) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f2248f.getLayoutDirection()) & 7) == 5) {
                i4 -= this.f2248f.getWidth();
            }
            a4.q(i4);
            a4.t(i5);
            int i6 = (int) ((this.f2244a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a4.f2242f = new Rect(i4 - i6, i5 - i6, i4 + i6, i5 + i6);
        }
        a4.c();
    }
}
