package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.l;
import androidx.lifecycle.l0;
import androidx.lifecycle.m;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import h1.a;
import h1.c;
import h1.e;
import i3.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class Recreator implements p {

    /* renamed from: a, reason: collision with root package name */
    public final e f815a;

    public Recreator(e eVar) {
        this.f815a = eVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        Object obj;
        e eVar = this.f815a;
        if (lVar != l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        rVar.f().f(this);
        Bundle c5 = eVar.a().c("androidx.savedstate.Restarter");
        if (c5 == null) {
            return;
        }
        ArrayList<String> stringArrayList = c5.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(a.class);
                d.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        d.d(newInstance, "{\n                constr…wInstance()\n            }");
                        if (!(eVar instanceof p0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        o0 e4 = ((p0) eVar).e();
                        final c a5 = eVar.a();
                        e4.getClass();
                        LinkedHashMap linkedHashMap = e4.f729a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            d.e(str3, "key");
                            l0 l0Var = (l0) linkedHashMap.get(str3);
                            d.b(l0Var);
                            final t f5 = eVar.f();
                            d.e(a5, "registry");
                            d.e(f5, "lifecycle");
                            HashMap hashMap = l0Var.f720a;
                            if (hashMap == null) {
                                obj = null;
                            } else {
                                synchronized (hashMap) {
                                    obj = l0Var.f720a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !savedStateHandleController.f692a) {
                                savedStateHandleController.getClass();
                                d.e(a5, "registry");
                                d.e(f5, "lifecycle");
                                if (savedStateHandleController.f692a) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f692a = true;
                                f5.a(savedStateHandleController);
                                a5.e(null, null);
                                m mVar = f5.f734c;
                                if (mVar == m.f723g || mVar.compareTo(m.i) >= 0) {
                                    a5.f();
                                } else {
                                    f5.a(new p() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                                        @Override // androidx.lifecycle.p
                                        public final void a(r rVar2, l lVar2) {
                                            if (lVar2 == l.ON_START) {
                                                t.this.f(this);
                                                a5.f();
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            a5.f();
                        }
                    } catch (Exception e5) {
                        throw new RuntimeException("Failed to instantiate " + str2, e5);
                    }
                } catch (NoSuchMethodException e6) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("Class " + str2 + " wasn't found", e7);
            }
        }
    }
}
