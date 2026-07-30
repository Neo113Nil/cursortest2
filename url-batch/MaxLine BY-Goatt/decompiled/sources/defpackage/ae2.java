package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ae2 extends s53 implements q53 {
    public final Application a;
    public final p53 b;
    public final Bundle c;
    public final ad1 d;
    public final wd2 e;

    public ae2(Application application, zd2 zd2Var, Bundle bundle) {
        p53 p53Var;
        this.e = zd2Var.getSavedStateRegistry();
        this.d = zd2Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (p53.c == null) {
                p53.c = new p53(application);
            }
            p53Var = p53.c;
            p53Var.getClass();
        } else {
            p53Var = new p53(null);
        }
        this.b = p53Var;
    }

    @Override // defpackage.q53
    public final n53 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(cls, canonicalName);
        }
        lh.e("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.q53
    public final n53 b(Class cls, wm1 wm1Var) {
        dq2 dq2Var = ar0.p;
        LinkedHashMap linkedHashMap = wm1Var.a;
        String str = (String) linkedHashMap.get(dq2Var);
        if (str == null) {
            lh.g("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(z71.v) == null || linkedHashMap.get(z71.w) == null) {
            if (this.d != null) {
                return e(cls, str);
            }
            lh.g("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(p53.d);
        boolean isAssignableFrom = dc.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? be2.a(cls, be2.b) : be2.a(cls, be2.a);
        return a == null ? this.b.b(cls, wm1Var) : (!isAssignableFrom || application == null) ? be2.b(cls, a, z71.m(wm1Var)) : be2.b(cls, a, application, z71.m(wm1Var));
    }

    @Override // defpackage.q53
    public final n53 c(gu guVar, wm1 wm1Var) {
        return b(yj1.y(guVar), wm1Var);
    }

    @Override // defpackage.s53
    public final void d(n53 n53Var) {
        ad1 ad1Var = this.d;
        if (ad1Var != null) {
            wd2 wd2Var = this.e;
            wd2Var.getClass();
            ap.q(n53Var, wd2Var, ad1Var);
        }
    }

    public final n53 e(Class cls, String str) {
        ad1 ad1Var = this.d;
        if (ad1Var == null) {
            ch2.h("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom = dc.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor a = (!isAssignableFrom || application == null) ? be2.a(cls, be2.b) : be2.a(cls, be2.a);
        if (a == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (r53.a == null) {
                r53.a = new r53();
            }
            r53.a.getClass();
            return iv1.s(cls);
        }
        wd2 wd2Var = this.e;
        wd2Var.getClass();
        qd2 t = ap.t(wd2Var, ad1Var, str, this.c);
        pd2 pd2Var = t.n;
        n53 b = (!isAssignableFrom || application == null) ? be2.b(cls, a, pd2Var) : be2.b(cls, a, application, pd2Var);
        b.a("androidx.lifecycle.savedstate.vm.tag", t);
        return b;
    }
}
