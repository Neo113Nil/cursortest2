package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.fortuneink.neonpad.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0210w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3121a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0200m f3122b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3123c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3124d;

    /* renamed from: e, reason: collision with root package name */
    public View f3125e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3127g;
    public InterfaceC0211x h;
    public AbstractC0208u i;

    /* renamed from: j, reason: collision with root package name */
    public C0209v f3128j;

    /* renamed from: f, reason: collision with root package name */
    public int f3126f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0209v f3129k = new C0209v(this);

    public C0210w(int i, Context context, View view, MenuC0200m menuC0200m, boolean z2) {
        this.f3121a = context;
        this.f3122b = menuC0200m;
        this.f3125e = view;
        this.f3123c = z2;
        this.f3124d = i;
    }

    public final AbstractC0208u a() {
        AbstractC0208u viewOnKeyListenerC0186D;
        if (this.i == null) {
            Context context = this.f3121a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0186D = new ViewOnKeyListenerC0194g(context, this.f3125e, this.f3124d, this.f3123c);
            } else {
                View view = this.f3125e;
                Context context2 = this.f3121a;
                boolean z2 = this.f3123c;
                viewOnKeyListenerC0186D = new ViewOnKeyListenerC0186D(this.f3124d, context2, view, this.f3122b, z2);
            }
            viewOnKeyListenerC0186D.l(this.f3122b);
            viewOnKeyListenerC0186D.r(this.f3129k);
            viewOnKeyListenerC0186D.n(this.f3125e);
            viewOnKeyListenerC0186D.g(this.h);
            viewOnKeyListenerC0186D.o(this.f3127g);
            viewOnKeyListenerC0186D.p(this.f3126f);
            this.i = viewOnKeyListenerC0186D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0208u abstractC0208u = this.i;
        return abstractC0208u != null && abstractC0208u.a();
    }

    public void c() {
        this.i = null;
        C0209v c0209v = this.f3128j;
        if (c0209v != null) {
            c0209v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0208u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f3126f, this.f3125e.getLayoutDirection()) & 7) == 5) {
                i -= this.f3125e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f3121a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f3119a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
