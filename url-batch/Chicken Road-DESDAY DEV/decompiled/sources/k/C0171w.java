package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.playgen.securelock.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0171w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2673a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0161m f2674b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2675c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2676e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2678g;
    public InterfaceC0172x h;
    public AbstractC0169u i;

    /* renamed from: j, reason: collision with root package name */
    public C0170v f2679j;

    /* renamed from: f, reason: collision with root package name */
    public int f2677f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0170v f2680k = new C0170v(this);

    public C0171w(int i, Context context, View view, MenuC0161m menuC0161m, boolean z2) {
        this.f2673a = context;
        this.f2674b = menuC0161m;
        this.f2676e = view;
        this.f2675c = z2;
        this.d = i;
    }

    public final AbstractC0169u a() {
        AbstractC0169u viewOnKeyListenerC0147D;
        if (this.i == null) {
            Context context = this.f2673a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0147D = new ViewOnKeyListenerC0155g(context, this.f2676e, this.d, this.f2675c);
            } else {
                View view = this.f2676e;
                Context context2 = this.f2673a;
                boolean z2 = this.f2675c;
                viewOnKeyListenerC0147D = new ViewOnKeyListenerC0147D(this.d, context2, view, this.f2674b, z2);
            }
            viewOnKeyListenerC0147D.l(this.f2674b);
            viewOnKeyListenerC0147D.r(this.f2680k);
            viewOnKeyListenerC0147D.n(this.f2676e);
            viewOnKeyListenerC0147D.g(this.h);
            viewOnKeyListenerC0147D.o(this.f2678g);
            viewOnKeyListenerC0147D.p(this.f2677f);
            this.i = viewOnKeyListenerC0147D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0169u abstractC0169u = this.i;
        return abstractC0169u != null && abstractC0169u.a();
    }

    public void c() {
        this.i = null;
        C0170v c0170v = this.f2679j;
        if (c0170v != null) {
            c0170v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0169u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2677f, this.f2676e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2676e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2673a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2671a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
