package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f61 implements wn1 {
    public final Application a;
    public final vn1 b;
    public final Bundle c;
    public final xg0 d;
    public final c51 e;

    public f61(Application application, wj wjVar, Bundle bundle) {
        vn1 vn1Var;
        this.e = (c51) wjVar.i.g;
        this.d = wjVar.h;
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (vn1.e == null) {
                vn1.e = new vn1(application);
            }
            vn1Var = vn1.e;
            vn1Var.getClass();
        } else {
            vn1Var = new vn1(null);
        }
        this.b = vn1Var;
    }

    @Override // defpackage.wn1
    public final tn1 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        dd0.e("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.wn1
    public final tn1 b(Class cls, bn0 bn0Var) {
        tc1 tc1Var = s40.k;
        LinkedHashMap linkedHashMap = bn0Var.a;
        String str = (String) linkedHashMap.get(tc1Var);
        if (str == null) {
            dd0.j("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(uq1.l) == null || linkedHashMap.get(uq1.m) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            dd0.j("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(vn1.f);
        boolean isAssignableFrom = d7.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? g61.a(cls, g61.b) : g61.a(cls, g61.a);
        return a == null ? this.b.b(cls, bn0Var) : (!isAssignableFrom || application == null) ? g61.b(cls, a, uq1.z(bn0Var)) : g61.b(cls, a, application, uq1.z(bn0Var));
    }

    @Override // defpackage.wn1
    public final tn1 c(yg ygVar, bn0 bn0Var) {
        Class cls = ygVar.a;
        cls.getClass();
        return b(cls, bn0Var);
    }

    public final tn1 d(Class cls, String str) {
        xg0 xg0Var = this.d;
        if (xg0Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = d7.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor a = (!isAssignableFrom || application == null) ? g61.a(cls, g61.b) : g61.a(cls, g61.a);
        if (a == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (sc1.c == null) {
                sc1.c = new sc1(5);
            }
            sc1.c.getClass();
            return ca0.i(cls);
        }
        c51 c51Var = this.e;
        c51Var.getClass();
        x51 h = ca0.h(c51Var.d(str), this.c);
        y51 y51Var = new y51(str, h);
        y51Var.d(xg0Var, c51Var);
        og0 og0Var = xg0Var.c;
        if (og0Var == og0.e || og0Var.compareTo(og0.h) >= 0) {
            c51Var.l();
        } else {
            xg0Var.a(new kq(xg0Var, c51Var));
        }
        tn1 b = (!isAssignableFrom || application == null) ? g61.b(cls, a, h) : g61.b(cls, a, application, h);
        b.a("androidx.lifecycle.savedstate.vm.tag", y51Var);
        return b;
    }
}
