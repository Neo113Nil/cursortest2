package io.flutter.plugin.platform;

import A.U;
import A.V;
import A.W;
import A.X;
import P.O;
import a.AbstractC0132a;
import android.os.Build;
import android.view.Window;
import h0.C0201i;
import m0.AbstractActivityC0264d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0264d f2629a;

    /* renamed from: b, reason: collision with root package name */
    public final O f2630b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC0264d f2631c;

    /* renamed from: d, reason: collision with root package name */
    public C0201i f2632d;

    /* renamed from: e, reason: collision with root package name */
    public int f2633e;

    public f(AbstractActivityC0264d abstractActivityC0264d, O o2, AbstractActivityC0264d abstractActivityC0264d2) {
        n nVar = new n(this);
        this.f2629a = abstractActivityC0264d;
        this.f2630b = o2;
        o2.f876g = nVar;
        this.f2631c = abstractActivityC0264d2;
        this.f2633e = 1280;
    }

    public final void a(C0201i c0201i) {
        Window window = this.f2629a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        AbstractC0132a x2 = i2 >= 30 ? new X(window) : i2 >= 26 ? new W(window) : i2 >= 23 ? new V(window) : new U(window);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i3 >= 23) {
            int i4 = c0201i.f2311a;
            if (i4 != 0) {
                int b2 = K.j.b(i4);
                if (b2 == 0) {
                    x2.E(false);
                } else if (b2 == 1) {
                    x2.E(true);
                }
            }
            Integer num = (Integer) c0201i.f2313c;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = (Boolean) c0201i.f2314d;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = c0201i.f2312b;
            if (i5 != 0) {
                int b3 = K.j.b(i5);
                if (b3 == 0) {
                    x2.D(false);
                } else if (b3 == 1) {
                    x2.D(true);
                }
            }
            Integer num2 = (Integer) c0201i.f2315e;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) c0201i.f2316f;
        if (num3 != null && i3 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) c0201i.f2317g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f2632d = c0201i;
    }

    public final void b() {
        this.f2629a.getWindow().getDecorView().setSystemUiVisibility(this.f2633e);
        C0201i c0201i = this.f2632d;
        if (c0201i != null) {
            a(c0201i);
        }
    }
}
