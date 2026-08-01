package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.a;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class y10 implements p90 {
    public final Application f;
    public final o90 g;
    public final Bundle h;
    public final iq i;
    public final v10 j;

    public y10(Application application, x10 x10Var, Bundle bundle) {
        o90 o90Var;
        this.j = x10Var.getSavedStateRegistry();
        this.i = x10Var.getLifecycle();
        this.h = bundle;
        this.f = application;
        if (application != null) {
            if (o90.j == null) {
                o90.j = new o90(application);
            }
            o90Var = o90.j;
            o90Var.getClass();
        } else {
            o90Var = new o90(null);
        }
        this.g = o90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m90 a(String str, Class cls) {
        Object obj;
        Application application;
        iq iqVar = this.i;
        if (iqVar == null) {
            o8.w("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom = f3.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || this.f == null) ? z10.a(cls, z10.b) : z10.a(cls, z10.a);
        if (a == null) {
            if (this.f != null) {
                return this.g.c(cls);
            }
            if (ix.h == null) {
                ix.h = new ix(17);
            }
            ix ixVar = ix.h;
            ixVar.getClass();
            return ixVar.c(cls);
        }
        v10 v10Var = this.j;
        v10Var.getClass();
        Bundle bundle = this.h;
        Bundle a2 = v10Var.a(str);
        Class[] clsArr = q10.f;
        q10 h = j8.h(a2, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, h);
        savedStateHandleController.c(iqVar, v10Var);
        hq hqVar = ((a) iqVar).c;
        if (hqVar == hq.g || hqVar.compareTo(hq.i) >= 0) {
            v10Var.d();
        } else {
            iqVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(iqVar, v10Var));
        }
        m90 b = (!isAssignableFrom || (application = this.f) == null) ? z10.b(cls, a, h) : z10.b(cls, a, application, h);
        synchronized (b.a) {
            try {
                obj = b.a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == 0) {
                    b.a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            savedStateHandleController = obj;
        }
        if (b.c) {
            m90.a(savedStateHandleController);
        }
        return b;
    }

    @Override // defpackage.p90
    public final m90 c(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(canonicalName, cls);
        }
        o8.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.p90
    public final m90 i(Class cls, ev evVar) {
        vg vgVar = vg.o;
        LinkedHashMap linkedHashMap = evVar.a;
        String str = (String) linkedHashMap.get(vgVar);
        if (str == null) {
            o8.t("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(j8.e) == null || linkedHashMap.get(j8.f) == null) {
            if (this.i != null) {
                return a(str, cls);
            }
            o8.t("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(vg.n);
        boolean isAssignableFrom = f3.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? z10.a(cls, z10.b) : z10.a(cls, z10.a);
        return a == null ? this.g.i(cls, evVar) : (!isAssignableFrom || application == null) ? z10.b(cls, a, j8.j(evVar)) : z10.b(cls, a, application, j8.j(evVar));
    }
}
