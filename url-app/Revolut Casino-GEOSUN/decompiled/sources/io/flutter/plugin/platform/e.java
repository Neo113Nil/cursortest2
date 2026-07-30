package io.flutter.plugin.platform;

import L.Q;
import android.os.Build;
import android.view.Window;
import c0.AbstractActivityC0104f;
import m0.C0196f;
import w.T;
import w.U;
import w.W;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0104f f2458a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f2459b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC0104f f2460c;

    /* renamed from: d, reason: collision with root package name */
    public C0196f f2461d;

    /* renamed from: e, reason: collision with root package name */
    public int f2462e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2463f = false;

    public e(AbstractActivityC0104f abstractActivityC0104f, Q q2, AbstractActivityC0104f abstractActivityC0104f2) {
        A.j jVar = new A.j(25, this);
        this.f2458a = abstractActivityC0104f;
        this.f2459b = q2;
        q2.f516g = jVar;
        this.f2460c = abstractActivityC0104f2;
        this.f2462e = 1280;
    }

    public final void a(C0196f c0196f) {
        Window window = this.f2458a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        o.g w2 = i2 >= 30 ? new W(window) : i2 >= 26 ? new U(window) : new T(window);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i4 = c0196f.f2715b;
        if (i4 != 0) {
            int b2 = F.j.b(i4);
            if (b2 == 0) {
                w2.x(false);
            } else if (b2 == 1) {
                w2.x(true);
            }
        }
        Integer num = c0196f.f2714a;
        if (num != null && i3 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = c0196f.f2716c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = c0196f.f2718e;
            if (i5 != 0) {
                int b3 = F.j.b(i5);
                if (b3 == 0) {
                    w2.w(false);
                } else if (b3 == 1) {
                    w2.w(true);
                }
            }
            Integer num2 = c0196f.f2717d;
            if (num2 != null && i3 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = c0196f.f2719f;
        if (num3 != null && i3 >= 28 && i3 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = c0196f.f2720g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f2461d = c0196f;
    }

    public final void b() {
        boolean z2 = this.f2463f;
        AbstractActivityC0104f abstractActivityC0104f = this.f2458a;
        if (z2) {
            o.g.y(abstractActivityC0104f.getWindow(), false);
        } else {
            abstractActivityC0104f.getWindow().getDecorView().setSystemUiVisibility(this.f2462e);
        }
        C0196f c0196f = this.f2461d;
        if (c0196f != null) {
            a(c0196f);
        }
    }
}
