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
import c1.b;
import c1.d;
import c1.f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import u2.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class Recreator implements p {

    /* renamed from: a, reason: collision with root package name */
    public final f f682a;

    public Recreator(f fVar) {
        this.f682a = fVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        Object obj;
        f fVar = this.f682a;
        if (lVar != l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        rVar.f().f(this);
        Bundle c = fVar.a().c("androidx.savedstate.Restarter");
        if (c == null) {
            return;
        }
        ArrayList<String> stringArrayList = c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i4 = 0;
        while (i4 < size) {
            String str = stringArrayList.get(i4);
            i4++;
            String str2 = str;
            try {
                Class<? extends U> asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(b.class);
                c.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        c.d(newInstance, "{\n                constr…wInstance()\n            }");
                        if (!(fVar instanceof p0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        o0 e4 = ((p0) fVar).e();
                        final d a4 = fVar.a();
                        e4.getClass();
                        LinkedHashMap linkedHashMap = e4.f597a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            c.e(str3, "key");
                            l0 l0Var = (l0) linkedHashMap.get(str3);
                            c.b(l0Var);
                            final t f4 = fVar.f();
                            c.e(a4, "registry");
                            c.e(f4, "lifecycle");
                            HashMap hashMap = l0Var.f588a;
                            if (hashMap == null) {
                                obj = null;
                            } else {
                                synchronized (hashMap) {
                                    obj = l0Var.f588a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !savedStateHandleController.f565a) {
                                savedStateHandleController.getClass();
                                c.e(a4, "registry");
                                c.e(f4, "lifecycle");
                                if (savedStateHandleController.f565a) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f565a = true;
                                f4.a(savedStateHandleController);
                                a4.e(null, null);
                                m mVar = f4.c;
                                if (mVar == m.g || mVar.compareTo(m.f591i) >= 0) {
                                    a4.f();
                                } else {
                                    f4.a(new p() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                                        @Override // androidx.lifecycle.p
                                        public final void a(r rVar2, l lVar2) {
                                            if (lVar2 == l.ON_START) {
                                                t.this.f(this);
                                                a4.f();
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            a4.f();
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
