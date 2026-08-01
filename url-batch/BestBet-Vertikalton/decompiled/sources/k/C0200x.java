package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.fortunequest.neontrack.R;

/* renamed from: k.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0200x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3225a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0189m f3226b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3227c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f3228e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3230g;
    public InterfaceC0201y h;
    public AbstractC0198v i;

    /* renamed from: j, reason: collision with root package name */
    public C0199w f3231j;

    /* renamed from: f, reason: collision with root package name */
    public int f3229f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0199w f3232k = new C0199w(this);

    public C0200x(int i, Context context, View view, MenuC0189m menuC0189m, boolean z2) {
        this.f3225a = context;
        this.f3226b = menuC0189m;
        this.f3228e = view;
        this.f3227c = z2;
        this.d = i;
    }

    public final AbstractC0198v a() {
        AbstractC0198v viewOnKeyListenerC0175E;
        if (this.i == null) {
            Context context = this.f3225a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0175E = new ViewOnKeyListenerC0183g(context, this.f3228e, this.d, this.f3227c);
            } else {
                View view = this.f3228e;
                Context context2 = this.f3225a;
                boolean z2 = this.f3227c;
                viewOnKeyListenerC0175E = new ViewOnKeyListenerC0175E(this.d, context2, view, this.f3226b, z2);
            }
            viewOnKeyListenerC0175E.l(this.f3226b);
            viewOnKeyListenerC0175E.r(this.f3232k);
            viewOnKeyListenerC0175E.n(this.f3228e);
            viewOnKeyListenerC0175E.g(this.h);
            viewOnKeyListenerC0175E.o(this.f3230g);
            viewOnKeyListenerC0175E.p(this.f3229f);
            this.i = viewOnKeyListenerC0175E;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0198v abstractC0198v = this.i;
        return abstractC0198v != null && abstractC0198v.a();
    }

    public void c() {
        this.i = null;
        C0199w c0199w = this.f3231j;
        if (c0199w != null) {
            c0199w.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0198v a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f3229f, this.f3228e.getLayoutDirection()) & 7) == 5) {
                i -= this.f3228e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f3225a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f3223a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
