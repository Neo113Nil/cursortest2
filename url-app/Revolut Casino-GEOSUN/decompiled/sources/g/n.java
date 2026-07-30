package g;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import java.lang.reflect.Field;
import w.x;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2024a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2025b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2026c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2027d;

    /* renamed from: e, reason: collision with root package name */
    public View f2028e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2030g;

    /* renamed from: h, reason: collision with root package name */
    public o f2031h;

    /* renamed from: i, reason: collision with root package name */
    public l f2032i;

    /* renamed from: j, reason: collision with root package name */
    public m f2033j;

    /* renamed from: f, reason: collision with root package name */
    public int f2029f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final m f2034k = new m(this);

    public n(int i2, Context context, View view, j jVar, boolean z2) {
        this.f2024a = context;
        this.f2025b = jVar;
        this.f2028e = view;
        this.f2026c = z2;
        this.f2027d = i2;
    }

    public final l a() {
        l sVar;
        if (this.f2032i == null) {
            Context context = this.f2024a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new ViewOnKeyListenerC0135g(context, this.f2028e, this.f2027d, this.f2026c);
            } else {
                View view = this.f2028e;
                Context context2 = this.f2024a;
                boolean z2 = this.f2026c;
                sVar = new s(this.f2027d, context2, view, this.f2025b, z2);
            }
            sVar.l(this.f2025b);
            sVar.r(this.f2034k);
            sVar.n(this.f2028e);
            sVar.f(this.f2031h);
            sVar.o(this.f2030g);
            sVar.p(this.f2029f);
            this.f2032i = sVar;
        }
        return this.f2032i;
    }

    public final boolean b() {
        l lVar = this.f2032i;
        return lVar != null && lVar.c();
    }

    public void c() {
        this.f2032i = null;
        m mVar = this.f2033j;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        l a2 = a();
        a2.s(z3);
        if (z2) {
            int i4 = this.f2029f;
            View view = this.f2028e;
            Field field = x.f3075a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f2028e.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.f2024a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2022e = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.g();
    }
}
