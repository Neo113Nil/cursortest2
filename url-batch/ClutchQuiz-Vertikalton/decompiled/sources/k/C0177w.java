package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.clutchquizarena.app.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0177w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2807a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0167m f2808b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2809c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2810e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2812g;
    public InterfaceC0178x h;
    public AbstractC0175u i;

    /* renamed from: j, reason: collision with root package name */
    public C0176v f2813j;

    /* renamed from: f, reason: collision with root package name */
    public int f2811f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0176v f2814k = new C0176v(this);

    public C0177w(int i, Context context, View view, MenuC0167m menuC0167m, boolean z2) {
        this.f2807a = context;
        this.f2808b = menuC0167m;
        this.f2810e = view;
        this.f2809c = z2;
        this.d = i;
    }

    public final AbstractC0175u a() {
        AbstractC0175u viewOnKeyListenerC0153D;
        if (this.i == null) {
            Context context = this.f2807a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0153D = new ViewOnKeyListenerC0161g(context, this.f2810e, this.d, this.f2809c);
            } else {
                View view = this.f2810e;
                Context context2 = this.f2807a;
                boolean z2 = this.f2809c;
                viewOnKeyListenerC0153D = new ViewOnKeyListenerC0153D(this.d, context2, view, this.f2808b, z2);
            }
            viewOnKeyListenerC0153D.l(this.f2808b);
            viewOnKeyListenerC0153D.r(this.f2814k);
            viewOnKeyListenerC0153D.n(this.f2810e);
            viewOnKeyListenerC0153D.g(this.h);
            viewOnKeyListenerC0153D.o(this.f2812g);
            viewOnKeyListenerC0153D.p(this.f2811f);
            this.i = viewOnKeyListenerC0153D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0175u abstractC0175u = this.i;
        return abstractC0175u != null && abstractC0175u.a();
    }

    public void c() {
        this.i = null;
        C0176v c0176v = this.f2813j;
        if (c0176v != null) {
            c0176v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0175u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2811f, this.f2810e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2810e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2807a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2805a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
