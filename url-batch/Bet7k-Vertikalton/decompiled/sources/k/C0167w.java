package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.shotwins.games.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0167w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2746a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0157m f2747b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2748c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2749e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2751g;
    public InterfaceC0168x h;
    public AbstractC0165u i;

    /* renamed from: j, reason: collision with root package name */
    public C0166v f2752j;

    /* renamed from: f, reason: collision with root package name */
    public int f2750f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0166v f2753k = new C0166v(this);

    public C0167w(int i, Context context, View view, MenuC0157m menuC0157m, boolean z2) {
        this.f2746a = context;
        this.f2747b = menuC0157m;
        this.f2749e = view;
        this.f2748c = z2;
        this.d = i;
    }

    public final AbstractC0165u a() {
        AbstractC0165u viewOnKeyListenerC0143D;
        if (this.i == null) {
            Context context = this.f2746a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0143D = new ViewOnKeyListenerC0151g(context, this.f2749e, this.d, this.f2748c);
            } else {
                View view = this.f2749e;
                Context context2 = this.f2746a;
                boolean z2 = this.f2748c;
                viewOnKeyListenerC0143D = new ViewOnKeyListenerC0143D(this.d, context2, view, this.f2747b, z2);
            }
            viewOnKeyListenerC0143D.l(this.f2747b);
            viewOnKeyListenerC0143D.r(this.f2753k);
            viewOnKeyListenerC0143D.n(this.f2749e);
            viewOnKeyListenerC0143D.g(this.h);
            viewOnKeyListenerC0143D.o(this.f2751g);
            viewOnKeyListenerC0143D.p(this.f2750f);
            this.i = viewOnKeyListenerC0143D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0165u abstractC0165u = this.i;
        return abstractC0165u != null && abstractC0165u.a();
    }

    public void c() {
        this.i = null;
        C0166v c0166v = this.f2752j;
        if (c0166v != null) {
            c0166v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0165u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2750f, this.f2749e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2749e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2746a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2744a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
