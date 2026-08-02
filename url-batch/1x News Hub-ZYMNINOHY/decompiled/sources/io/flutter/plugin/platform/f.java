package io.flutter.plugin.platform;

import E.X;
import E.Y;
import E.Z;
import E.a0;
import E1.AbstractActivityC0029e;
import a.AbstractC0129a;
import android.os.Build;
import android.view.Window;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0029e f9251a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.e f9252b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC0029e f9253c;

    /* renamed from: d, reason: collision with root package name */
    public O1.c f9254d;

    /* renamed from: e, reason: collision with root package name */
    public int f9255e;
    public boolean f = false;

    public f(AbstractActivityC0029e abstractActivityC0029e, V0.e eVar, AbstractActivityC0029e abstractActivityC0029e2) {
        o oVar = new o(1, this);
        this.f9251a = abstractActivityC0029e;
        this.f9252b = eVar;
        eVar.f1600c = oVar;
        this.f9253c = abstractActivityC0029e2;
        this.f9255e = 1280;
    }

    public final void a(O1.c cVar) {
        Window window = this.f9251a.getWindow();
        window.getDecorView();
        int i3 = Build.VERSION.SDK_INT;
        AbstractC0129a a0Var = i3 >= 35 ? new a0(window) : i3 >= 30 ? new Z(window) : i3 >= 26 ? new Y(window) : new X(window);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i5 = cVar.f1141a;
        if (i5 != 0) {
            int b3 = M.j.b(i5);
            if (b3 == 0) {
                a0Var.y(false);
            } else if (b3 == 1) {
                a0Var.y(true);
            }
        }
        Integer num = (Integer) cVar.f1143c;
        if (num != null && i4 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) cVar.f;
        if (bool != null && i4 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i4 >= 26) {
            int i6 = cVar.f1142b;
            if (i6 != 0) {
                int b4 = M.j.b(i6);
                if (b4 == 0) {
                    a0Var.x(false);
                } else if (b4 == 1) {
                    a0Var.x(true);
                }
            }
            Integer num2 = (Integer) cVar.f1144d;
            if (num2 != null && i4 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) cVar.f1145e;
        if (num3 != null && i4 >= 28 && i4 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) cVar.f1146g;
        if (bool2 != null && i4 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f9254d = cVar;
    }

    public final void b() {
        boolean z = this.f;
        AbstractActivityC0029e abstractActivityC0029e = this.f9251a;
        if (z) {
            C2.b.E(abstractActivityC0029e.getWindow(), false);
        } else {
            abstractActivityC0029e.getWindow().getDecorView().setSystemUiVisibility(this.f9255e);
        }
        O1.c cVar = this.f9254d;
        if (cVar != null) {
            a(cVar);
        }
    }
}
