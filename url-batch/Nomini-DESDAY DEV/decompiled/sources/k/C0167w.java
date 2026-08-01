package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.pairspot.fortunetiles.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0167w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2724a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0157m f2725b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2726c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2727e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2729g;
    public InterfaceC0168x h;
    public AbstractC0165u i;

    /* renamed from: j, reason: collision with root package name */
    public C0166v f2730j;

    /* renamed from: f, reason: collision with root package name */
    public int f2728f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0166v f2731k = new C0166v(this);

    public C0167w(int i, Context context, View view, MenuC0157m menuC0157m, boolean z2) {
        this.f2724a = context;
        this.f2725b = menuC0157m;
        this.f2727e = view;
        this.f2726c = z2;
        this.d = i;
    }

    public final AbstractC0165u a() {
        AbstractC0165u viewOnKeyListenerC0143D;
        if (this.i == null) {
            Context context = this.f2724a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0143D = new ViewOnKeyListenerC0151g(context, this.f2727e, this.d, this.f2726c);
            } else {
                View view = this.f2727e;
                Context context2 = this.f2724a;
                boolean z2 = this.f2726c;
                viewOnKeyListenerC0143D = new ViewOnKeyListenerC0143D(this.d, context2, view, this.f2725b, z2);
            }
            viewOnKeyListenerC0143D.l(this.f2725b);
            viewOnKeyListenerC0143D.r(this.f2731k);
            viewOnKeyListenerC0143D.n(this.f2727e);
            viewOnKeyListenerC0143D.g(this.h);
            viewOnKeyListenerC0143D.o(this.f2729g);
            viewOnKeyListenerC0143D.p(this.f2728f);
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
        C0166v c0166v = this.f2730j;
        if (c0166v != null) {
            c0166v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0165u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2728f, this.f2727e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2727e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2724a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2722a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
