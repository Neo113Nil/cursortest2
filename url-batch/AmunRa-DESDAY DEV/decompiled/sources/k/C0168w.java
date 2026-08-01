package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.visualfortune.eyerest.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0168w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2663a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0158m f2664b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2665c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2666e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2668g;
    public InterfaceC0169x h;
    public AbstractC0166u i;

    /* renamed from: j, reason: collision with root package name */
    public C0167v f2669j;

    /* renamed from: f, reason: collision with root package name */
    public int f2667f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0167v f2670k = new C0167v(this);

    public C0168w(int i, Context context, View view, MenuC0158m menuC0158m, boolean z2) {
        this.f2663a = context;
        this.f2664b = menuC0158m;
        this.f2666e = view;
        this.f2665c = z2;
        this.d = i;
    }

    public final AbstractC0166u a() {
        AbstractC0166u viewOnKeyListenerC0144D;
        if (this.i == null) {
            Context context = this.f2663a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0144D = new ViewOnKeyListenerC0152g(context, this.f2666e, this.d, this.f2665c);
            } else {
                View view = this.f2666e;
                Context context2 = this.f2663a;
                boolean z2 = this.f2665c;
                viewOnKeyListenerC0144D = new ViewOnKeyListenerC0144D(this.d, context2, view, this.f2664b, z2);
            }
            viewOnKeyListenerC0144D.l(this.f2664b);
            viewOnKeyListenerC0144D.r(this.f2670k);
            viewOnKeyListenerC0144D.n(this.f2666e);
            viewOnKeyListenerC0144D.g(this.h);
            viewOnKeyListenerC0144D.o(this.f2668g);
            viewOnKeyListenerC0144D.p(this.f2667f);
            this.i = viewOnKeyListenerC0144D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0166u abstractC0166u = this.i;
        return abstractC0166u != null && abstractC0166u.a();
    }

    public void c() {
        this.i = null;
        C0167v c0167v = this.f2669j;
        if (c0167v != null) {
            c0167v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0166u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2667f, this.f2666e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2666e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2663a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2661a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
