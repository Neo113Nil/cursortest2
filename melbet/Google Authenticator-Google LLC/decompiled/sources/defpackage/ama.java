package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ama implements aep {
    private final ame a;

    public ama(ame ameVar) {
        this.a = ameVar;
    }

    @Override // defpackage.aep
    public final void a(aer aerVar, aej aejVar) {
        if (aejVar != aej.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        aerVar.L().c(this);
        ame ameVar = this.a;
        Bundle a = ameVar.aE().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, ama.class.getClassLoader()).asSubclass(amc.class);
                asSubclass.getClass();
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        newInstance.getClass();
                        ((amc) newInstance).a(ameVar);
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(str)), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(a.Z(str, "Class ", " wasn't found"), e3);
            }
        }
    }
}
