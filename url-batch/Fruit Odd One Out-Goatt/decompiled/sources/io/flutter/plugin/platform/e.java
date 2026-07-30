package io.flutter.plugin.platform;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import l.s;
import l.t;
import l.v;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f494a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.a f495b;

    /* renamed from: c, reason: collision with root package name */
    public final e0.f f496c;

    /* renamed from: d, reason: collision with root package name */
    public m0.e f497d;

    /* renamed from: e, reason: collision with root package name */
    public int f498e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f499f = false;

    public e(e0.f fVar, c0.a aVar, e0.f fVar2) {
        androidx.lifecycle.n nVar = new androidx.lifecycle.n(7, this);
        this.f494a = fVar;
        this.f495b = aVar;
        aVar.f67d = nVar;
        this.f496c = fVar2;
        this.f498e = 1280;
    }

    public final void a(m0.e eVar) {
        Window window = this.f494a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        a.a vVar = i2 >= 30 ? new v(window) : i2 >= 26 ? new t(window) : new s(window);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i4 = eVar.f775b;
        if (i4 != 0) {
            int a2 = o.d.a(i4);
            if (a2 == 0) {
                vVar.z(false);
            } else if (a2 == 1) {
                vVar.z(true);
            }
        }
        Integer num = eVar.f774a;
        if (num != null && i3 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = eVar.f776c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = eVar.f778e;
            if (i5 != 0) {
                int a3 = o.d.a(i5);
                if (a3 == 0) {
                    vVar.y(false);
                } else if (a3 == 1) {
                    vVar.y(true);
                }
            }
            Integer num2 = eVar.f777d;
            if (num2 != null && i3 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = eVar.f779f;
        if (num3 != null && i3 >= 28 && i3 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = eVar.f780g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f497d = eVar;
    }

    public final void b() {
        boolean z2 = this.f499f;
        Activity activity = this.f494a;
        if (z2) {
            a.a.A(activity.getWindow(), false);
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(this.f498e);
        }
        m0.e eVar = this.f497d;
        if (eVar != null) {
            a(eVar);
        }
    }
}
