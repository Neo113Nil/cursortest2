package i0;

import Y.AbstractComponentCallbacksC0051q;
import a.h;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0066g;
import androidx.lifecycle.InterfaceC0075p;
import androidx.lifecycle.J;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.r;
import g.AbstractActivityC0106i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141a implements InterfaceC0075p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2527a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2528b;

    public /* synthetic */ C0141a(int i, Object obj) {
        this.f2527a = i;
        this.f2528b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0075p
    public final void g(r rVar, EnumC0071l enumC0071l) {
        View view;
        switch (this.f2527a) {
            case 0:
                if (enumC0071l != EnumC0071l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                rVar.d().f(this);
                f fVar = (f) this.f2528b;
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
                        Class<? extends U> asSubclass = Class.forName(str, false, C0141a.class.getClassLoader()).asSubclass(b.class);
                        d1.d.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                d1.d.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof P)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                O c3 = ((P) fVar).c();
                                d b2 = fVar.b();
                                c3.getClass();
                                LinkedHashMap linkedHashMap = c3.f1467a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    d1.d.e(str2, "key");
                                    M m2 = (M) linkedHashMap.get(str2);
                                    d1.d.b(m2);
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
                if (enumC0071l != EnumC0071l.ON_STOP || (view = ((AbstractComponentCallbacksC0051q) this.f2528b).f1087E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                AbstractActivityC0106i abstractActivityC0106i = (AbstractActivityC0106i) this.f2528b;
                if (abstractActivityC0106i.f1178e == null) {
                    h hVar = (h) abstractActivityC0106i.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        abstractActivityC0106i.f1178e = hVar.f1162a;
                    }
                    if (abstractActivityC0106i.f1178e == null) {
                        abstractActivityC0106i.f1178e = new O();
                    }
                }
                abstractActivityC0106i.f1175a.f(this);
                return;
            case 3:
                new HashMap();
                InterfaceC0066g[] interfaceC0066gArr = (InterfaceC0066g[]) this.f2528b;
                if (interfaceC0066gArr.length > 0) {
                    InterfaceC0066g interfaceC0066g = interfaceC0066gArr[0];
                    throw null;
                }
                if (interfaceC0066gArr.length <= 0) {
                    return;
                }
                InterfaceC0066g interfaceC0066g2 = interfaceC0066gArr[0];
                throw null;
            default:
                if (enumC0071l != EnumC0071l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0071l).toString());
                }
                rVar.d().f(this);
                J j2 = (J) this.f2528b;
                if (j2.f1463b) {
                    return;
                }
                Bundle c4 = j2.f1462a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = j2.f1464c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c4 != null) {
                    bundle.putAll(c4);
                }
                j2.f1464c = bundle;
                j2.f1463b = true;
                return;
        }
    }
}
