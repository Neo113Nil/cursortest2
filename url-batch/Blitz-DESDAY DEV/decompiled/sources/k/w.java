package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.winfour.neondrop.R;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2826a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2827b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2828c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2829e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2831g;
    public x h;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public v f2832j;

    /* renamed from: f, reason: collision with root package name */
    public int f2830f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final v f2833k = new v(this);

    public w(int i, Context context, View view, m mVar, boolean z2) {
        this.f2826a = context;
        this.f2827b = mVar;
        this.f2829e = view;
        this.f2828c = z2;
        this.d = i;
    }

    public final u a() {
        u viewOnKeyListenerC0161D;
        if (this.i == null) {
            Context context = this.f2826a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0161D = new ViewOnKeyListenerC0169g(context, this.f2829e, this.d, this.f2828c);
            } else {
                View view = this.f2829e;
                Context context2 = this.f2826a;
                boolean z2 = this.f2828c;
                viewOnKeyListenerC0161D = new ViewOnKeyListenerC0161D(this.d, context2, view, this.f2827b, z2);
            }
            viewOnKeyListenerC0161D.l(this.f2827b);
            viewOnKeyListenerC0161D.r(this.f2833k);
            viewOnKeyListenerC0161D.n(this.f2829e);
            viewOnKeyListenerC0161D.g(this.h);
            viewOnKeyListenerC0161D.o(this.f2831g);
            viewOnKeyListenerC0161D.p(this.f2830f);
            this.i = viewOnKeyListenerC0161D;
        }
        return this.i;
    }

    public final boolean b() {
        u uVar = this.i;
        return uVar != null && uVar.a();
    }

    public void c() {
        this.i = null;
        v vVar = this.f2832j;
        if (vVar != null) {
            vVar.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2830f, this.f2829e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2829e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2826a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2824a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
