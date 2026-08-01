package io.flutter.plugin.platform;

import E.AbstractActivityC0004e;
import a.AbstractC0016a;
import android.os.Build;
import android.view.Window;
import l.r;
import l.s;
import l.t;
import m.AbstractC0068d;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0004e f700a;

    /* renamed from: b, reason: collision with root package name */
    public final A.a f701b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC0004e f702c;

    /* renamed from: d, reason: collision with root package name */
    public B.m f703d;

    /* renamed from: e, reason: collision with root package name */
    public int f704e;

    public e(AbstractActivityC0004e abstractActivityC0004e, A.a aVar, AbstractActivityC0004e abstractActivityC0004e2) {
        io.flutter.plugin.editing.a aVar2 = new io.flutter.plugin.editing.a(1, this);
        this.f700a = abstractActivityC0004e;
        this.f701b = aVar;
        aVar.f4d = aVar2;
        this.f702c = abstractActivityC0004e2;
        this.f704e = 1280;
    }

    public final void a(B.m mVar) {
        Window window = this.f700a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        AbstractC0016a tVar = i2 >= 30 ? new t(window) : i2 >= 26 ? new s(window) : new r(window);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i4 = mVar.f45a;
        if (i4 != 0) {
            int a2 = AbstractC0068d.a(i4);
            if (a2 == 0) {
                tVar.C(false);
            } else if (a2 == 1) {
                tVar.C(true);
            }
        }
        Integer num = (Integer) mVar.f47c;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) mVar.f48d;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = mVar.f46b;
            if (i5 != 0) {
                int a3 = AbstractC0068d.a(i5);
                if (a3 == 0) {
                    tVar.B(false);
                } else if (a3 == 1) {
                    tVar.B(true);
                }
            }
            Integer num2 = (Integer) mVar.f49e;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) mVar.f50f;
        if (num3 != null && i3 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) mVar.f51g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f703d = mVar;
    }

    public final void b() {
        this.f700a.getWindow().getDecorView().setSystemUiVisibility(this.f704e);
        B.m mVar = this.f703d;
        if (mVar != null) {
            a(mVar);
        }
    }
}
