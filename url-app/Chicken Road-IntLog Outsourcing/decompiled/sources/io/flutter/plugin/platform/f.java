package io.flutter.plugin.platform;

import E.c0;
import E.d0;
import E.e0;
import android.os.Build;
import android.view.Window;
import n2.AbstractC1341c;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC1515c f10215a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.e f10216b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC1515c f10217c;

    /* renamed from: d, reason: collision with root package name */
    public G2.d f10218d;

    /* renamed from: e, reason: collision with root package name */
    public int f10219e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10220f = false;

    public f(AbstractActivityC1515c abstractActivityC1515c, B0.e eVar, AbstractActivityC1515c abstractActivityC1515c2) {
        U.e eVar2 = new U.e(this);
        this.f10215a = abstractActivityC1515c;
        this.f10216b = eVar;
        eVar.f147c = eVar2;
        this.f10217c = abstractActivityC1515c2;
        this.f10219e = 1280;
    }

    public final void a(G2.d dVar) {
        Window window = this.f10215a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        AbstractC1341c e0Var = i2 >= 30 ? new e0(window) : i2 >= 26 ? new d0(window) : new c0(window);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i6 = dVar.f934a;
        if (i6 != 0) {
            int b6 = O.j.b(i6);
            if (b6 == 0) {
                e0Var.E(false);
            } else if (b6 == 1) {
                e0Var.E(true);
            }
        }
        Integer num = (Integer) dVar.f936c;
        if (num != null && i3 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) dVar.f939f;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i7 = dVar.f935b;
            if (i7 != 0) {
                int b7 = O.j.b(i7);
                if (b7 == 0) {
                    e0Var.D(false);
                } else if (b7 == 1) {
                    e0Var.D(true);
                }
            }
            Integer num2 = (Integer) dVar.f937d;
            if (num2 != null && i3 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) dVar.f938e;
        if (num3 != null && i3 >= 28 && i3 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) dVar.f940g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f10218d = dVar;
    }

    public final void b() {
        boolean z = this.f10220f;
        AbstractActivityC1515c abstractActivityC1515c = this.f10215a;
        if (z) {
            e5.g.w(abstractActivityC1515c.getWindow(), false);
        } else {
            abstractActivityC1515c.getWindow().getDecorView().setSystemUiVisibility(this.f10219e);
        }
        G2.d dVar = this.f10218d;
        if (dVar != null) {
            a(dVar);
        }
    }
}
