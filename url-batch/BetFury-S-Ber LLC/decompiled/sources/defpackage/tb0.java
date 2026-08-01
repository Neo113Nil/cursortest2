package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class tb0 implements rm0 {
    public final Application f;
    public final qm0 g;
    public final Bundle h;
    public final nx i;
    public final i5 j;

    public tb0(Application application, sb0 sb0Var, Bundle bundle) {
        qm0 qm0Var;
        this.j = sb0Var.a();
        this.i = sb0Var.e();
        this.h = bundle;
        this.f = application;
        if (application != null) {
            if (qm0.j == null) {
                qm0.j = new qm0(application);
            }
            qm0Var = qm0.j;
            qm0Var.getClass();
        } else {
            qm0Var = new qm0(null);
        }
        this.g = qm0Var;
    }

    @Override // defpackage.rm0
    public final om0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(canonicalName, cls);
        }
        s9.k("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final om0 b(String str, Class cls) {
        nx nxVar = this.i;
        if (nxVar == null) {
            s9.y("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Application application = this.f;
        Constructor a = (!isAssignableFrom || application == null) ? ub0.a(cls, ub0.b) : ub0.a(cls, ub0.a);
        if (a == null) {
            if (application != null) {
                return this.g.a(cls);
            }
            if (xy.h == null) {
                xy.h = new xy(26);
            }
            xy.h.getClass();
            return d50.m(cls);
        }
        i5 i5Var = this.j;
        i5Var.getClass();
        lb0 l = mv.l(i5Var.g(str), this.h);
        mb0 mb0Var = new mb0(str, l);
        mb0Var.n(i5Var, nxVar);
        gx gxVar = nxVar.c;
        if (gxVar == gx.INITIALIZED || gxVar.isAtLeast(gx.STARTED)) {
            i5Var.O();
        } else {
            nxVar.a(new ri(nxVar, i5Var, 1));
        }
        om0 b = (!isAssignableFrom || application == null) ? ub0.b(cls, a, l) : ub0.b(cls, a, application, l);
        b.addCloseable("androidx.lifecycle.savedstate.vm.tag", mb0Var);
        return b;
    }

    @Override // defpackage.rm0
    public final om0 e(Class cls, a30 a30Var) {
        xy xyVar = mv.n;
        LinkedHashMap linkedHashMap = a30Var.a;
        String str = (String) linkedHashMap.get(xyVar);
        if (str == null) {
            s9.u("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(bi.k) == null || linkedHashMap.get(bi.l) == null) {
            if (this.i != null) {
                return b(str, cls);
            }
            s9.u("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(qm0.k);
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? ub0.a(cls, ub0.b) : ub0.a(cls, ub0.a);
        return a == null ? this.g.e(cls, a30Var) : (!isAssignableFrom || application == null) ? ub0.b(cls, a, bi.v(a30Var)) : ub0.b(cls, a, application, bi.v(a30Var));
    }

    @Override // defpackage.rm0
    public final om0 i(dc dcVar, a30 a30Var) {
        return e(mv.u(dcVar), a30Var);
    }
}
