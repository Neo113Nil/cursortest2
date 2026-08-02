package i;

import A.z;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.neptunesoft.languesbacdz.R;
import java.lang.reflect.Field;

/* renamed from: i.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0215m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2457a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0211i f2458b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2459c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2460d;

    /* renamed from: e, reason: collision with root package name */
    public View f2461e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2463g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0216n f2464h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC0213k f2465i;

    /* renamed from: j, reason: collision with root package name */
    public C0214l f2466j;

    /* renamed from: f, reason: collision with root package name */
    public int f2462f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0214l f2467k = new C0214l(this);

    public C0215m(int i2, Context context, View view, MenuC0211i menuC0211i, boolean z2) {
        this.f2457a = context;
        this.f2458b = menuC0211i;
        this.f2461e = view;
        this.f2459c = z2;
        this.f2460d = i2;
    }

    public final AbstractC0213k a() {
        AbstractC0213k viewOnKeyListenerC0220r;
        if (this.f2465i == null) {
            Context context = this.f2457a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0220r = new ViewOnKeyListenerC0208f(context, this.f2461e, this.f2460d, this.f2459c);
            } else {
                View view = this.f2461e;
                Context context2 = this.f2457a;
                boolean z2 = this.f2459c;
                viewOnKeyListenerC0220r = new ViewOnKeyListenerC0220r(this.f2460d, context2, view, this.f2458b, z2);
            }
            viewOnKeyListenerC0220r.l(this.f2458b);
            viewOnKeyListenerC0220r.r(this.f2467k);
            viewOnKeyListenerC0220r.n(this.f2461e);
            viewOnKeyListenerC0220r.f(this.f2464h);
            viewOnKeyListenerC0220r.o(this.f2463g);
            viewOnKeyListenerC0220r.p(this.f2462f);
            this.f2465i = viewOnKeyListenerC0220r;
        }
        return this.f2465i;
    }

    public final boolean b() {
        AbstractC0213k abstractC0213k = this.f2465i;
        return abstractC0213k != null && abstractC0213k.i();
    }

    public void c() {
        this.f2465i = null;
        C0214l c0214l = this.f2466j;
        if (c0214l != null) {
            c0214l.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        AbstractC0213k a2 = a();
        a2.s(z3);
        if (z2) {
            int i4 = this.f2462f;
            View view = this.f2461e;
            Field field = z.f58a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f2461e.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.f2457a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2455e = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.c();
    }
}
