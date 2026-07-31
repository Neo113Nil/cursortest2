package io.flutter.plugin.platform;

import D.AbstractActivityC0005f;
import android.os.Build;
import android.view.Window;
import l.s;
import l.t;
import n.AbstractC0077d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0005f f647a;

    /* renamed from: b, reason: collision with root package name */
    public final B.a f648b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractActivityC0005f f649c;

    /* renamed from: d, reason: collision with root package name */
    public M.f f650d;

    /* renamed from: e, reason: collision with root package name */
    public int f651e;

    public f(AbstractActivityC0005f abstractActivityC0005f, B.a aVar, AbstractActivityC0005f abstractActivityC0005f2) {
        c cVar = new c(0, this);
        this.f647a = abstractActivityC0005f;
        this.f648b = aVar;
        aVar.f4d = cVar;
        this.f649c = abstractActivityC0005f2;
        this.f651e = 1280;
    }

    public final void a(M.f fVar) {
        Window window = this.f647a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        a.a tVar = i2 >= 30 ? new t(window) : i2 >= 26 ? new s(window) : new l.r(window);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i4 = fVar.f276b;
        if (i4 != 0) {
            int a2 = AbstractC0077d.a(i4);
            if (a2 == 0) {
                tVar.z(false);
            } else if (a2 == 1) {
                tVar.z(true);
            }
        }
        Integer num = fVar.f275a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = fVar.f277c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = fVar.f279e;
            if (i5 != 0) {
                int a3 = AbstractC0077d.a(i5);
                if (a3 == 0) {
                    tVar.y(false);
                } else if (a3 == 1) {
                    tVar.y(true);
                }
            }
            Integer num2 = fVar.f278d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = fVar.f280f;
        if (num3 != null && i3 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = fVar.f281g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f650d = fVar;
    }

    public final void b() {
        this.f647a.getWindow().getDecorView().setSystemUiVisibility(this.f651e);
        M.f fVar = this.f650d;
        if (fVar != null) {
            a(fVar);
        }
    }
}
