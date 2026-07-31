package h;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.crane.slab.beam.R;
import java.lang.reflect.Field;
import y.x;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2057a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0143j f2058b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2059c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2060d;

    /* renamed from: e, reason: collision with root package name */
    public View f2061e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2063g;

    /* renamed from: h, reason: collision with root package name */
    public o f2064h;

    /* renamed from: i, reason: collision with root package name */
    public l f2065i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2066j;

    /* renamed from: f, reason: collision with root package name */
    public int f2062f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final m f2067k = new m(this);

    public n(Context context, MenuC0143j menuC0143j, View view, boolean z2, int i2, int i3) {
        this.f2057a = context;
        this.f2058b = menuC0143j;
        this.f2061e = view;
        this.f2059c = z2;
        this.f2060d = i2;
    }

    public final l a() {
        l sVar;
        if (this.f2065i == null) {
            Context context = this.f2057a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new ViewOnKeyListenerC0140g(context, this.f2061e, this.f2060d, this.f2059c);
            } else {
                sVar = new s(this.f2057a, this.f2058b, this.f2061e, this.f2060d, this.f2059c);
            }
            sVar.l(this.f2058b);
            sVar.r(this.f2067k);
            sVar.n(this.f2061e);
            sVar.b(this.f2064h);
            sVar.o(this.f2063g);
            sVar.p(this.f2062f);
            this.f2065i = sVar;
        }
        return this.f2065i;
    }

    public final boolean b() {
        l lVar = this.f2065i;
        return lVar != null && lVar.j();
    }

    public void c() {
        this.f2065i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2066j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        l a2 = a();
        a2.s(z3);
        if (z2) {
            int i4 = this.f2062f;
            View view = this.f2061e;
            Field field = x.f3160a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f2061e.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.f2057a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2055e = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.c();
    }
}
