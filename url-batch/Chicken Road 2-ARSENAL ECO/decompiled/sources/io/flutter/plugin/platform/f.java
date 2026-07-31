package io.flutter.plugin.platform;

import D.Z;
import D.a0;
import D.b0;
import D3.AbstractActivityC0117e;
import D3.InterfaceC0120h;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import u0.AbstractC0676f;
import u0.C0682l;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f4555a;

    /* renamed from: b, reason: collision with root package name */
    public final C0682l f4556b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0120h f4557c;

    /* renamed from: d, reason: collision with root package name */
    public N3.e f4558d;

    /* renamed from: e, reason: collision with root package name */
    public int f4559e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4560f = false;

    public f(AbstractActivityC0117e abstractActivityC0117e, C0682l c0682l, AbstractActivityC0117e abstractActivityC0117e2) {
        V5.g gVar = new V5.g(8, this);
        this.f4555a = abstractActivityC0117e;
        this.f4556b = c0682l;
        c0682l.f5990g = gVar;
        this.f4557c = abstractActivityC0117e2;
        this.f4559e = 1280;
    }

    public final void a(N3.e eVar) {
        Window window = this.f4555a.getWindow();
        window.getDecorView();
        int i7 = Build.VERSION.SDK_INT;
        A3.c b0Var = i7 >= 30 ? new b0(window) : i7 >= 26 ? new a0(window) : new Z(window);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i9 = eVar.f1687a;
        if (i9 != 0) {
            int c7 = N.p.c(i9);
            if (c7 == 0) {
                b0Var.d0(false);
            } else if (c7 == 1) {
                b0Var.d0(true);
            }
        }
        Integer num = (Integer) eVar.f1689c;
        if (num != null && i8 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) eVar.f1692f;
        if (bool != null && i8 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i8 >= 26) {
            int i10 = eVar.f1688b;
            if (i10 != 0) {
                int c8 = N.p.c(i10);
                if (c8 == 0) {
                    b0Var.c0(false);
                } else if (c8 == 1) {
                    b0Var.c0(true);
                }
            }
            Integer num2 = (Integer) eVar.f1690d;
            if (num2 != null && i8 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) eVar.f1691e;
        if (num3 != null && i8 >= 28 && i8 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) eVar.f1693g;
        if (bool2 != null && i8 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f4558d = eVar;
    }

    public final void b() {
        boolean z5 = this.f4560f;
        Activity activity = this.f4555a;
        if (z5) {
            AbstractC0676f.s(activity.getWindow(), false);
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(this.f4559e);
        }
        N3.e eVar = this.f4558d;
        if (eVar != null) {
            a(eVar);
        }
    }
}
