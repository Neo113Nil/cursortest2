package h0;

import X.AbstractComponentCallbacksC0048q;
import a.h;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0070l;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0065g;
import androidx.lifecycle.InterfaceC0074p;
import androidx.lifecycle.J;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.r;
import g.AbstractActivityC0131i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135a implements InterfaceC0074p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2451a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2452b;

    public /* synthetic */ C0135a(int i, Object obj) {
        this.f2451a = i;
        this.f2452b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0074p
    public final void f(r rVar, EnumC0070l enumC0070l) {
        View view;
        switch (this.f2451a) {
            case 0:
                if (enumC0070l != EnumC0070l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                rVar.d().f(this);
                f fVar = (f) this.f2452b;
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
                        Class<? extends U> asSubclass = Class.forName(str, false, C0135a.class.getClassLoader()).asSubclass(b.class);
                        Z0.d.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                Z0.d.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof P)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                O c3 = ((P) fVar).c();
                                d b2 = fVar.b();
                                c3.getClass();
                                LinkedHashMap linkedHashMap = c3.f1383a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    Z0.d.e(str2, "key");
                                    M m2 = (M) linkedHashMap.get(str2);
                                    Z0.d.b(m2);
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
                if (enumC0070l != EnumC0070l.ON_STOP || (view = ((AbstractComponentCallbacksC0048q) this.f2452b).f995E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                AbstractActivityC0131i abstractActivityC0131i = (AbstractActivityC0131i) this.f2452b;
                if (abstractActivityC0131i.f1096e == null) {
                    h hVar = (h) abstractActivityC0131i.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        abstractActivityC0131i.f1096e = hVar.f1080a;
                    }
                    if (abstractActivityC0131i.f1096e == null) {
                        abstractActivityC0131i.f1096e = new O();
                    }
                }
                abstractActivityC0131i.f1093a.f(this);
                return;
            case 3:
                new HashMap();
                InterfaceC0065g[] interfaceC0065gArr = (InterfaceC0065g[]) this.f2452b;
                if (interfaceC0065gArr.length > 0) {
                    InterfaceC0065g interfaceC0065g = interfaceC0065gArr[0];
                    throw null;
                }
                if (interfaceC0065gArr.length <= 0) {
                    return;
                }
                InterfaceC0065g interfaceC0065g2 = interfaceC0065gArr[0];
                throw null;
            default:
                if (enumC0070l != EnumC0070l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0070l).toString());
                }
                rVar.d().f(this);
                J j2 = (J) this.f2452b;
                if (j2.f1379b) {
                    return;
                }
                Bundle c4 = j2.f1378a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = j2.f1380c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c4 != null) {
                    bundle.putAll(c4);
                }
                j2.f1380c = bundle;
                j2.f1379b = true;
                return;
        }
    }
}
