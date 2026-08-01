package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.winfour.winrandom.R;

/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0179w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2878a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0169m f2879b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2880c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2881e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2883g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0180x f2884h;
    public AbstractC0177u i;

    /* renamed from: j, reason: collision with root package name */
    public C0178v f2885j;

    /* renamed from: f, reason: collision with root package name */
    public int f2882f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0178v f2886k = new C0178v(this);

    public C0179w(int i, Context context, View view, MenuC0169m menuC0169m, boolean z2) {
        this.f2878a = context;
        this.f2879b = menuC0169m;
        this.f2881e = view;
        this.f2880c = z2;
        this.d = i;
    }

    public final AbstractC0177u a() {
        AbstractC0177u viewOnKeyListenerC0155D;
        if (this.i == null) {
            Context context = this.f2878a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0155D = new ViewOnKeyListenerC0163g(context, this.f2881e, this.d, this.f2880c);
            } else {
                View view = this.f2881e;
                Context context2 = this.f2878a;
                boolean z2 = this.f2880c;
                viewOnKeyListenerC0155D = new ViewOnKeyListenerC0155D(this.d, context2, view, this.f2879b, z2);
            }
            viewOnKeyListenerC0155D.l(this.f2879b);
            viewOnKeyListenerC0155D.r(this.f2886k);
            viewOnKeyListenerC0155D.n(this.f2881e);
            viewOnKeyListenerC0155D.g(this.f2884h);
            viewOnKeyListenerC0155D.o(this.f2883g);
            viewOnKeyListenerC0155D.p(this.f2882f);
            this.i = viewOnKeyListenerC0155D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0177u abstractC0177u = this.i;
        return abstractC0177u != null && abstractC0177u.a();
    }

    public void c() {
        this.i = null;
        C0178v c0178v = this.f2885j;
        if (c0178v != null) {
            c0178v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0177u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2882f, this.f2881e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2881e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2878a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2876a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.j();
    }
}
