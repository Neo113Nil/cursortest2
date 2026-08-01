package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ri implements jx {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public ri(kx kxVar) {
        this.f = 3;
        this.g = kxVar;
        gc gcVar = gc.c;
        Class<?> cls = kxVar.getClass();
        ec ecVar = (ec) gcVar.a.get(cls);
        this.h = ecVar == null ? gcVar.a(cls, null) : ecVar;
    }

    @Override // defpackage.jx
    public final void i(lx lxVar, fx fxVar) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                am amVar = (am) obj;
                switch (qi.a[fxVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 3:
                        (Build.VERSION.SDK_INT >= 28 ? ce.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new dm(), 500L);
                        amVar.f.f(amVar);
                        break;
                    case 7:
                        s9.k("ON_ANY must not been send by anybody");
                        return;
                    default:
                        throw new md();
                }
                jx jxVar = (jx) obj2;
                if (jxVar != null) {
                    jxVar.i(lxVar, fxVar);
                    return;
                }
                return;
            case 1:
                if (fxVar == fx.ON_START) {
                    ((nx) obj).f(this);
                    ((i5) obj2).O();
                    return;
                }
                return;
            case 2:
                t40 t40Var = (t40) obj;
                int i2 = x40.a[fxVar.ordinal()];
                if (i2 == 1) {
                    t40Var.b(true);
                    return;
                }
                if (i2 == 2) {
                    t40Var.b(false);
                    return;
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    t40Var.a();
                    ((nx) obj2).f(this);
                    return;
                }
            default:
                kx kxVar = (kx) obj;
                HashMap hashMap = ((ec) obj2).a;
                ec.a((List) hashMap.get(fxVar), lxVar, fxVar, kxVar);
                ec.a((List) hashMap.get(fx.ON_ANY), lxVar, fxVar, kxVar);
                return;
        }
    }

    public /* synthetic */ ri(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public ri(t40 t40Var, y40 y40Var, nx nxVar) {
        this.f = 2;
        this.g = t40Var;
        this.h = nxVar;
    }
}
