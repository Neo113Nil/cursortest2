package h0;

import X.AbstractComponentCallbacksC0048q;
import a.h;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0063g;
import androidx.lifecycle.InterfaceC0072p;
import androidx.lifecycle.J;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.r;
import g.AbstractActivityC0125i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129a implements InterfaceC0072p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2368a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2369b;

    public /* synthetic */ C0129a(int i, Object obj) {
        this.f2368a = i;
        this.f2369b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0072p
    public final void e(r rVar, EnumC0068l enumC0068l) {
        View view;
        switch (this.f2368a) {
            case 0:
                if (enumC0068l != EnumC0068l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                rVar.d().f(this);
                InterfaceC0134f interfaceC0134f = (InterfaceC0134f) this.f2369b;
                Bundle c2 = interfaceC0134f.b().c("androidx.savedstate.Restarter");
                if (c2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = c2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C0129a.class.getClassLoader()).asSubclass(InterfaceC0130b.class);
                        X0.d.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                X0.d.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(interfaceC0134f instanceof P)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                O c3 = ((P) interfaceC0134f).c();
                                C0132d b2 = interfaceC0134f.b();
                                c3.getClass();
                                LinkedHashMap linkedHashMap = c3.f1347a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    X0.d.e(str2, "key");
                                    M m2 = (M) linkedHashMap.get(str2);
                                    X0.d.b(m2);
                                    H.c(m2, b2, interfaceC0134f.d());
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
                if (enumC0068l != EnumC0068l.ON_STOP || (view = ((AbstractComponentCallbacksC0048q) this.f2369b).f955E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                AbstractActivityC0125i abstractActivityC0125i = (AbstractActivityC0125i) this.f2369b;
                if (abstractActivityC0125i.f1060e == null) {
                    h hVar = (h) abstractActivityC0125i.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        abstractActivityC0125i.f1060e = hVar.f1044a;
                    }
                    if (abstractActivityC0125i.f1060e == null) {
                        abstractActivityC0125i.f1060e = new O();
                    }
                }
                abstractActivityC0125i.f1057a.f(this);
                return;
            case 3:
                new HashMap();
                InterfaceC0063g[] interfaceC0063gArr = (InterfaceC0063g[]) this.f2369b;
                if (interfaceC0063gArr.length > 0) {
                    InterfaceC0063g interfaceC0063g = interfaceC0063gArr[0];
                    throw null;
                }
                if (interfaceC0063gArr.length <= 0) {
                    return;
                }
                InterfaceC0063g interfaceC0063g2 = interfaceC0063gArr[0];
                throw null;
            default:
                if (enumC0068l != EnumC0068l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0068l).toString());
                }
                rVar.d().f(this);
                J j2 = (J) this.f2369b;
                if (j2.f1343b) {
                    return;
                }
                Bundle c4 = j2.f1342a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = j2.f1344c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c4 != null) {
                    bundle.putAll(c4);
                }
                j2.f1344c = bundle;
                j2.f1343b = true;
                return;
        }
    }
}
