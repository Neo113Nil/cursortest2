package io.flutter.plugin.platform;

import I.w0;
import I.x0;
import I.y0;
import I.z0;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import h4.AbstractActivityC0488c;
import h4.InterfaceC0491f;
import z1.AbstractC1053a;

/* renamed from: io.flutter.plugin.platform.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560f {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f5697a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.e f5698b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0491f f5699c;

    /* renamed from: d, reason: collision with root package name */
    public S1.a f5700d;

    /* renamed from: e, reason: collision with root package name */
    public int f5701e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5702f = false;

    public C0560f(AbstractActivityC0488c abstractActivityC0488c, P0.e eVar, AbstractActivityC0488c abstractActivityC0488c2) {
        q qVar = new q(1, this);
        this.f5697a = abstractActivityC0488c;
        this.f5698b = eVar;
        eVar.f2195i = qVar;
        this.f5699c = abstractActivityC0488c2;
        this.f5701e = 1280;
    }

    public final void a(S1.a aVar) {
        Window window = this.f5697a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        P0.f z0Var = i2 >= 35 ? new z0(window) : i2 >= 30 ? new y0(window) : i2 >= 26 ? new x0(window) : new w0(window);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i7 = aVar.f2458a;
        if (i7 != 0) {
            int b7 = S.i.b(i7);
            if (b7 == 0) {
                z0Var.I(false);
            } else if (b7 == 1) {
                z0Var.I(true);
            }
        }
        Integer num = (Integer) aVar.f2460c;
        if (num != null && i5 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) aVar.f2461d;
        if (bool != null && i5 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i5 >= 26) {
            int i8 = aVar.f2459b;
            if (i8 != 0) {
                int b8 = S.i.b(i8);
                if (b8 == 0) {
                    z0Var.H(false);
                } else if (b8 == 1) {
                    z0Var.H(true);
                }
            }
            Integer num2 = (Integer) aVar.f2462e;
            if (num2 != null && i5 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) aVar.f2463f;
        if (num3 != null && i5 >= 28 && i5 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) aVar.f2464g;
        if (bool2 != null && i5 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f5700d = aVar;
    }

    public final void b() {
        boolean z7 = this.f5702f;
        Activity activity = this.f5697a;
        if (z7) {
            AbstractC1053a.E(activity.getWindow(), false);
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(this.f5701e);
        }
        S1.a aVar = this.f5700d;
        if (aVar != null) {
            a(aVar);
        }
    }
}
