package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.winworm.neongrid.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0176w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2774a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0166m f2775b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2776c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2777e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2779g;
    public InterfaceC0177x h;
    public AbstractC0174u i;

    /* renamed from: j, reason: collision with root package name */
    public C0175v f2780j;

    /* renamed from: f, reason: collision with root package name */
    public int f2778f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0175v f2781k = new C0175v(this);

    public C0176w(int i, Context context, View view, MenuC0166m menuC0166m, boolean z2) {
        this.f2774a = context;
        this.f2775b = menuC0166m;
        this.f2777e = view;
        this.f2776c = z2;
        this.d = i;
    }

    public final AbstractC0174u a() {
        AbstractC0174u viewOnKeyListenerC0152D;
        if (this.i == null) {
            Context context = this.f2774a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0152D = new ViewOnKeyListenerC0160g(context, this.f2777e, this.d, this.f2776c);
            } else {
                View view = this.f2777e;
                Context context2 = this.f2774a;
                boolean z2 = this.f2776c;
                viewOnKeyListenerC0152D = new ViewOnKeyListenerC0152D(this.d, context2, view, this.f2775b, z2);
            }
            viewOnKeyListenerC0152D.l(this.f2775b);
            viewOnKeyListenerC0152D.r(this.f2781k);
            viewOnKeyListenerC0152D.n(this.f2777e);
            viewOnKeyListenerC0152D.g(this.h);
            viewOnKeyListenerC0152D.o(this.f2779g);
            viewOnKeyListenerC0152D.p(this.f2778f);
            this.i = viewOnKeyListenerC0152D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0174u abstractC0174u = this.i;
        return abstractC0174u != null && abstractC0174u.a();
    }

    public void c() {
        this.i = null;
        C0175v c0175v = this.f2780j;
        if (c0175v != null) {
            c0175v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0174u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2778f, this.f2777e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2777e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2774a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2772a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
