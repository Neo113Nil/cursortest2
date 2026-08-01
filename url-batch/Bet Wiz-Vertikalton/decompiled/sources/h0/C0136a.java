package h0;

import X.AbstractComponentCallbacksC0048q;
import a.h;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0064g;
import androidx.lifecycle.InterfaceC0073p;
import androidx.lifecycle.J;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.r;
import g.AbstractActivityC0132i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136a implements InterfaceC0073p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2504a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2505b;

    public /* synthetic */ C0136a(int i, Object obj) {
        this.f2504a = i;
        this.f2505b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void g(r rVar, EnumC0069l enumC0069l) {
        View view;
        switch (this.f2504a) {
            case 0:
                if (enumC0069l != EnumC0069l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                rVar.d().f(this);
                f fVar = (f) this.f2505b;
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
                        Class<? extends U> asSubclass = Class.forName(str, false, C0136a.class.getClassLoader()).asSubclass(b.class);
                        e1.d.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                e1.d.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof P)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                O c3 = ((P) fVar).c();
                                d b2 = fVar.b();
                                c3.getClass();
                                LinkedHashMap linkedHashMap = c3.f1453a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    e1.d.e(str2, "key");
                                    M m2 = (M) linkedHashMap.get(str2);
                                    e1.d.b(m2);
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
                if (enumC0069l != EnumC0069l.ON_STOP || (view = ((AbstractComponentCallbacksC0048q) this.f2505b).f1067E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                AbstractActivityC0132i abstractActivityC0132i = (AbstractActivityC0132i) this.f2505b;
                if (abstractActivityC0132i.f1165e == null) {
                    h hVar = (h) abstractActivityC0132i.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        abstractActivityC0132i.f1165e = hVar.f1149a;
                    }
                    if (abstractActivityC0132i.f1165e == null) {
                        abstractActivityC0132i.f1165e = new O();
                    }
                }
                abstractActivityC0132i.f1162a.f(this);
                return;
            case 3:
                new HashMap();
                InterfaceC0064g[] interfaceC0064gArr = (InterfaceC0064g[]) this.f2505b;
                if (interfaceC0064gArr.length > 0) {
                    InterfaceC0064g interfaceC0064g = interfaceC0064gArr[0];
                    throw null;
                }
                if (interfaceC0064gArr.length <= 0) {
                    return;
                }
                InterfaceC0064g interfaceC0064g2 = interfaceC0064gArr[0];
                throw null;
            default:
                if (enumC0069l != EnumC0069l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0069l).toString());
                }
                rVar.d().f(this);
                J j2 = (J) this.f2505b;
                if (j2.f1449b) {
                    return;
                }
                Bundle c4 = j2.f1448a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = j2.f1450c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c4 != null) {
                    bundle.putAll(c4);
                }
                j2.f1450c = bundle;
                j2.f1449b = true;
                return;
        }
    }
}
