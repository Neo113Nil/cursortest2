package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.neonpulse.gridlogic.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0170w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2722a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0160m f2723b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2724c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2725e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2727g;
    public InterfaceC0171x h;
    public AbstractC0168u i;

    /* renamed from: j, reason: collision with root package name */
    public C0169v f2728j;

    /* renamed from: f, reason: collision with root package name */
    public int f2726f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0169v f2729k = new C0169v(this);

    public C0170w(int i, Context context, View view, MenuC0160m menuC0160m, boolean z2) {
        this.f2722a = context;
        this.f2723b = menuC0160m;
        this.f2725e = view;
        this.f2724c = z2;
        this.d = i;
    }

    public final AbstractC0168u a() {
        AbstractC0168u viewOnKeyListenerC0146D;
        if (this.i == null) {
            Context context = this.f2722a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0146D = new ViewOnKeyListenerC0154g(context, this.f2725e, this.d, this.f2724c);
            } else {
                View view = this.f2725e;
                Context context2 = this.f2722a;
                boolean z2 = this.f2724c;
                viewOnKeyListenerC0146D = new ViewOnKeyListenerC0146D(this.d, context2, view, this.f2723b, z2);
            }
            viewOnKeyListenerC0146D.l(this.f2723b);
            viewOnKeyListenerC0146D.r(this.f2729k);
            viewOnKeyListenerC0146D.n(this.f2725e);
            viewOnKeyListenerC0146D.g(this.h);
            viewOnKeyListenerC0146D.o(this.f2727g);
            viewOnKeyListenerC0146D.p(this.f2726f);
            this.i = viewOnKeyListenerC0146D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0168u abstractC0168u = this.i;
        return abstractC0168u != null && abstractC0168u.a();
    }

    public void c() {
        this.i = null;
        C0169v c0169v = this.f2728j;
        if (c0169v != null) {
            c0169v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0168u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2726f, this.f2725e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2725e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2722a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2720a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
