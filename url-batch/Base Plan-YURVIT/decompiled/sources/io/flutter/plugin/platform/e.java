package io.flutter.plugin.platform;

import B0.E;
import N.P;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.datastore.preferences.protobuf.k0;
import k0.AbstractActivityC0187d;
import k0.InterfaceC0189f;
import u0.C0234f;
import y.S;
import y.T;
import y.V;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f2462a;

    /* renamed from: b, reason: collision with root package name */
    public final P f2463b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0189f f2464c;

    /* renamed from: d, reason: collision with root package name */
    public C0234f f2465d;

    /* renamed from: e, reason: collision with root package name */
    public int f2466e;

    public e(AbstractActivityC0187d abstractActivityC0187d, P p2, AbstractActivityC0187d abstractActivityC0187d2) {
        E e2 = new E(23, this);
        this.f2462a = abstractActivityC0187d;
        this.f2463b = p2;
        p2.f699g = e2;
        this.f2464c = abstractActivityC0187d2;
        this.f2466e = 1280;
    }

    public final void a(C0234f c0234f) {
        Window window = this.f2462a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        k0 v2 = i2 >= 30 ? new V(window) : i2 >= 26 ? new T(window) : new S(window);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i4 = c0234f.f2995b;
        if (i4 != 0) {
            int a2 = H.j.a(i4);
            if (a2 == 0) {
                v2.E(false);
            } else if (a2 == 1) {
                v2.E(true);
            }
        }
        Integer num = c0234f.f2994a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = c0234f.f2996c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = c0234f.f2998e;
            if (i5 != 0) {
                int a3 = H.j.a(i5);
                if (a3 == 0) {
                    v2.D(false);
                } else if (a3 == 1) {
                    v2.D(true);
                }
            }
            Integer num2 = c0234f.f2997d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = c0234f.f2999f;
        if (num3 != null && i3 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = c0234f.f3000g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f2465d = c0234f;
    }

    public final void b() {
        this.f2462a.getWindow().getDecorView().setSystemUiVisibility(this.f2466e);
        C0234f c0234f = this.f2465d;
        if (c0234f != null) {
            a(c0234f);
        }
    }
}
