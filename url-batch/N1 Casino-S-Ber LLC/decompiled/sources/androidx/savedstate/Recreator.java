package androidx.savedstate;

import android.os.Bundle;
import defpackage.aq;
import defpackage.d10;
import defpackage.f90;
import defpackage.g10;
import defpackage.i3;
import defpackage.i90;
import defpackage.j90;
import defpackage.jw;
import defpackage.t8;
import defpackage.up;
import defpackage.yp;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class Recreator implements yp {
    public final g10 a;

    public Recreator(g10 g10Var) {
        this.a = g10Var;
    }

    @Override // defpackage.yp
    public final void b(aq aqVar, up upVar) {
        if (upVar != up.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        aqVar.e().f(this);
        g10 g10Var = this.a;
        Bundle c = g10Var.a().c("androidx.savedstate.Restarter");
        if (c == null) {
            return;
        }
        ArrayList<String> stringArrayList = c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            t8.t("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(d10.class);
                asSubclass.getClass();
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        newInstance.getClass();
                        if (!(g10Var instanceof j90)) {
                            t8.t("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                            return;
                        }
                        i90 d = ((j90) g10Var).d();
                        i3 a = g10Var.a();
                        d.getClass();
                        LinkedHashMap linkedHashMap = d.a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            str3.getClass();
                            f90 f90Var = (f90) linkedHashMap.get(str3);
                            f90Var.getClass();
                            jw.h(f90Var, a, g10Var.e());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            a.f();
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate " + str2, e);
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
