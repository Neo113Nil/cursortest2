package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
final class Recreator implements g {

    /* renamed from: f, reason: collision with root package name */
    private final b f1356f;

    Recreator(b bVar) {
        this.f1356f = bVar;
    }

    private void g(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a) declaredConstructor.newInstance(new Object[0])).a(this.f1356f);
                } catch (Exception e7) {
                    throw new RuntimeException("Failed to instantiate " + str, e7);
                }
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
            }
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("Class " + str + " wasn't found", e9);
        }
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.b bVar) {
        if (bVar != e.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        iVar.a().c(this);
        Bundle a7 = this.f1356f.i().a("androidx.savedstate.Restarter");
        if (a7 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a7.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
    }
}
