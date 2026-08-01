package h0;

import X.AbstractComponentCallbacksC0048q;
import a.h;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0072l;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0067g;
import androidx.lifecycle.InterfaceC0076p;
import androidx.lifecycle.J;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.r;
import g.AbstractActivityC0133i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137a implements InterfaceC0076p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2439a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2440b;

    public /* synthetic */ C0137a(int i, Object obj) {
        this.f2439a = i;
        this.f2440b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0076p
    public final void g(r rVar, EnumC0072l enumC0072l) {
        View view;
        switch (this.f2439a) {
            case 0:
                if (enumC0072l != EnumC0072l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                rVar.d().f(this);
                f fVar = (f) this.f2440b;
                Bundle c2 = fVar.b().c("androidx.savedstate.Restarter");
                if (c2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = c2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C0137a.class.getClassLoader()).asSubclass(b.class);
                        b1.d.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                b1.d.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof P)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                O c3 = ((P) fVar).c();
                                d b2 = fVar.b();
                                c3.getClass();
                                LinkedHashMap linkedHashMap = c3.f1408a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    b1.d.e(str2, "key");
                                    M m2 = (M) linkedHashMap.get(str2);
                                    b1.d.b(m2);
                                    H.c(m2, b2, fVar.d());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    b2.f();
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException("Failed to instantiate " + str, e2);
                            }
                        } catch (NoSuchMethodException e3) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException("Class " + str + " wasn't found", e4);
                    }
                }
                return;
            case 1:
                if (enumC0072l != EnumC0072l.ON_STOP || (view = ((AbstractComponentCallbacksC0048q) this.f2440b).f1027E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                AbstractActivityC0133i abstractActivityC0133i = (AbstractActivityC0133i) this.f2440b;
                if (abstractActivityC0133i.f1121e == null) {
                    h hVar = (h) abstractActivityC0133i.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        abstractActivityC0133i.f1121e = hVar.f1105a;
                    }
                    if (abstractActivityC0133i.f1121e == null) {
                        abstractActivityC0133i.f1121e = new O();
                    }
                }
                abstractActivityC0133i.f1118a.f(this);
                return;
            case 3:
                new HashMap();
                InterfaceC0067g[] interfaceC0067gArr = (InterfaceC0067g[]) this.f2440b;
                if (interfaceC0067gArr.length > 0) {
                    InterfaceC0067g interfaceC0067g = interfaceC0067gArr[0];
                    throw null;
                }
                if (interfaceC0067gArr.length <= 0) {
                    return;
                }
                InterfaceC0067g interfaceC0067g2 = interfaceC0067gArr[0];
                throw null;
            default:
                if (enumC0072l != EnumC0072l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0072l).toString());
                }
                rVar.d().f(this);
                J j2 = (J) this.f2440b;
                if (j2.f1404b) {
                    return;
                }
                Bundle c4 = j2.f1403a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = j2.f1405c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c4 != null) {
                    bundle.putAll(c4);
                }
                j2.f1405c = bundle;
                j2.f1404b = true;
                return;
        }
    }
}
