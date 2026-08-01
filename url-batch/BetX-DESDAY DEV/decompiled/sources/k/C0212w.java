package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.luckyarcade.spinthrow.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0212w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3125a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0202m f3126b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3127c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3128d;

    /* renamed from: e, reason: collision with root package name */
    public View f3129e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3131g;
    public InterfaceC0213x h;
    public AbstractC0210u i;

    /* renamed from: j, reason: collision with root package name */
    public C0211v f3132j;

    /* renamed from: f, reason: collision with root package name */
    public int f3130f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0211v f3133k = new C0211v(this);

    public C0212w(int i, Context context, View view, MenuC0202m menuC0202m, boolean z2) {
        this.f3125a = context;
        this.f3126b = menuC0202m;
        this.f3129e = view;
        this.f3127c = z2;
        this.f3128d = i;
    }

    public final AbstractC0210u a() {
        AbstractC0210u viewOnKeyListenerC0188D;
        if (this.i == null) {
            Context context = this.f3125a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0188D = new ViewOnKeyListenerC0196g(context, this.f3129e, this.f3128d, this.f3127c);
            } else {
                View view = this.f3129e;
                Context context2 = this.f3125a;
                boolean z2 = this.f3127c;
                viewOnKeyListenerC0188D = new ViewOnKeyListenerC0188D(this.f3128d, context2, view, this.f3126b, z2);
            }
            viewOnKeyListenerC0188D.l(this.f3126b);
            viewOnKeyListenerC0188D.r(this.f3133k);
            viewOnKeyListenerC0188D.n(this.f3129e);
            viewOnKeyListenerC0188D.g(this.h);
            viewOnKeyListenerC0188D.o(this.f3131g);
            viewOnKeyListenerC0188D.p(this.f3130f);
            this.i = viewOnKeyListenerC0188D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0210u abstractC0210u = this.i;
        return abstractC0210u != null && abstractC0210u.a();
    }

    public void c() {
        this.i = null;
        C0211v c0211v = this.f3132j;
        if (c0211v != null) {
            c0211v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0210u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f3130f, this.f3129e.getLayoutDirection()) & 7) == 5) {
                i -= this.f3129e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f3125a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f3123a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
