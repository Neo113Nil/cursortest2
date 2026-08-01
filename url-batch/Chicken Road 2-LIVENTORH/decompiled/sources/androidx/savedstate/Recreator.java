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
import f3.d;
import g1.a;
import g1.c;
import g1.e;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class Recreator implements p {

    /* renamed from: f, reason: collision with root package name */
    public final e f714f;

    public Recreator(e eVar) {
        this.f714f = eVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        Object obj;
        e eVar = this.f714f;
        if (lVar != l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        rVar.e().f(this);
        Bundle c4 = eVar.b().c("androidx.savedstate.Restarter");
        if (c4 == null) {
            return;
        }
        ArrayList<String> stringArrayList = c4.getStringArrayList("classes_to_restore");
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
                        o0 d = ((p0) eVar).d();
                        final c b4 = eVar.b();
                        d.getClass();
                        LinkedHashMap linkedHashMap = d.f625a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            d.e(str3, "key");
                            l0 l0Var = (l0) linkedHashMap.get(str3);
                            d.b(l0Var);
                            final t e4 = eVar.e();
                            d.e(b4, "registry");
                            d.e(e4, "lifecycle");
                            HashMap hashMap = l0Var.f615a;
                            if (hashMap == null) {
                                obj = null;
                            } else {
                                synchronized (hashMap) {
                                    obj = l0Var.f615a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !savedStateHandleController.f587f) {
                                savedStateHandleController.getClass();
                                d.e(b4, "registry");
                                d.e(e4, "lifecycle");
                                if (savedStateHandleController.f587f) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f587f = true;
                                e4.a(savedStateHandleController);
                                b4.e(null, null);
                                m mVar = e4.f630c;
                                if (mVar == m.f618g || mVar.compareTo(m.i) >= 0) {
                                    b4.f();
                                } else {
                                    e4.a(new p() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                                        @Override // androidx.lifecycle.p
                                        public final void b(r rVar2, l lVar2) {
                                            if (lVar2 == l.ON_START) {
                                                t.this.f(this);
                                                b4.f();
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            b4.f();
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
