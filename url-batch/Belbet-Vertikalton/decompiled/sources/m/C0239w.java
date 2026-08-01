package m;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.winpower.neonfit.R;

/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0239w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3410a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0229m f3411b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3412c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3413d;
    public View e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3415g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0240x f3416h;
    public AbstractC0237u i;
    public C0238v j;

    /* renamed from: f, reason: collision with root package name */
    public int f3414f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0238v f3417k = new C0238v(this);

    public C0239w(int i, Context context, View view, MenuC0229m menuC0229m, boolean z2) {
        this.f3410a = context;
        this.f3411b = menuC0229m;
        this.e = view;
        this.f3412c = z2;
        this.f3413d = i;
    }

    public final AbstractC0237u a() {
        AbstractC0237u viewOnKeyListenerC0215D;
        if (this.i == null) {
            Context context = this.f3410a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0215D = new ViewOnKeyListenerC0223g(context, this.e, this.f3413d, this.f3412c);
            } else {
                View view = this.e;
                Context context2 = this.f3410a;
                boolean z2 = this.f3412c;
                viewOnKeyListenerC0215D = new ViewOnKeyListenerC0215D(this.f3413d, context2, view, this.f3411b, z2);
            }
            viewOnKeyListenerC0215D.l(this.f3411b);
            viewOnKeyListenerC0215D.r(this.f3417k);
            viewOnKeyListenerC0215D.n(this.e);
            viewOnKeyListenerC0215D.i(this.f3416h);
            viewOnKeyListenerC0215D.o(this.f3415g);
            viewOnKeyListenerC0215D.p(this.f3414f);
            this.i = viewOnKeyListenerC0215D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0237u abstractC0237u = this.i;
        return abstractC0237u != null && abstractC0237u.a();
    }

    public void c() {
        this.i = null;
        C0238v c0238v = this.j;
        if (c0238v != null) {
            c0238v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0237u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f3414f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f3410a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f3408a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.h();
    }
}
