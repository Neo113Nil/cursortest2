package androidx.savedstate;

import android.os.Bundle;
import defpackage.gq;
import defpackage.j8;
import defpackage.lq;
import defpackage.m90;
import defpackage.nq;
import defpackage.o8;
import defpackage.q90;
import defpackage.r90;
import defpackage.t10;
import defpackage.v10;
import defpackage.x10;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class Recreator implements lq {
    public final x10 a;

    public Recreator(x10 x10Var) {
        this.a = x10Var;
    }

    @Override // defpackage.lq
    public final void b(nq nqVar, gq gqVar) {
        if (gqVar != gq.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        nqVar.getLifecycle().b(this);
        x10 x10Var = this.a;
        Bundle a = x10Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            o8.t("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(t10.class);
                asSubclass.getClass();
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        newInstance.getClass();
                        if (!(x10Var instanceof r90)) {
                            o8.t("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                            return;
                        }
                        q90 viewModelStore = ((r90) x10Var).getViewModelStore();
                        v10 savedStateRegistry = x10Var.getSavedStateRegistry();
                        viewModelStore.getClass();
                        LinkedHashMap linkedHashMap = viewModelStore.a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            str3.getClass();
                            m90 m90Var = (m90) linkedHashMap.get(str3);
                            m90Var.getClass();
                            j8.e(m90Var, savedStateRegistry, x10Var.getLifecycle());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            savedStateRegistry.d();
                        }
                    } catch (Exception e) {
                        o8.p("Failed to instantiate ", str2, e);
                        return;
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("Class " + str2 + " wasn't found", e3);
            }
        }
    }
}
