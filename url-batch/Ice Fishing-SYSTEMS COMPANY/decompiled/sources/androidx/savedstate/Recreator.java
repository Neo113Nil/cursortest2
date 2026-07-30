package androidx.savedstate;

import D.y;
import android.os.Bundle;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.InterfaceC0511t;
import androidx.lifecycle.InterfaceC0513v;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.h;
import t0.AbstractC5051n;
import x0.C5202c;
import x0.InterfaceC5200a;
import x0.InterfaceC5204e;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0511t {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5204e f5413n;

    public Recreator(InterfaceC5204e interfaceC5204e) {
        this.f5413n = interfaceC5204e;
    }

    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        if (enumC0506n != EnumC0506n.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0513v.getLifecycle().b(this);
        InterfaceC5204e interfaceC5204e = this.f5413n;
        Bundle a9 = interfaceC5204e.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a9 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a9.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC5200a.class);
                h.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(new Object[0]);
                        h.d(newInstance, "{\n                constr…wInstance()\n            }");
                        if (!(interfaceC5204e instanceof Y)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        X viewModelStore = ((Y) interfaceC5204e).getViewModelStore();
                        C5202c savedStateRegistry = interfaceC5204e.getSavedStateRegistry();
                        viewModelStore.getClass();
                        LinkedHashMap linkedHashMap = viewModelStore.f5265a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String key = (String) it.next();
                            h.e(key, "key");
                            S s3 = (S) linkedHashMap.get(key);
                            h.b(s3);
                            L.a(s3, savedStateRegistry, interfaceC5204e.getLifecycle());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            savedStateRegistry.d();
                        }
                    } catch (Exception e6) {
                        throw new RuntimeException(AbstractC5051n.f("Failed to instantiate ", str), e6);
                    }
                } catch (NoSuchMethodException e9) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(y.k("Class ", str, " wasn't found"), e10);
            }
        }
    }
}
