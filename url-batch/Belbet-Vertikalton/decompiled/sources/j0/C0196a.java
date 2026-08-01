package j0;

import Z.AbstractComponentCallbacksC0053q;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0077l;
import androidx.lifecycle.InterfaceC0072g;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import b.C0095h;
import h.AbstractActivityC0132i;
import j1.h;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3159a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3160b;

    public /* synthetic */ C0196a(int i, Object obj) {
        this.f3159a = i;
        this.f3160b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0077l enumC0077l) {
        View view;
        switch (this.f3159a) {
            case 0:
                if (enumC0077l != EnumC0077l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                tVar.e().f(this);
                f fVar = (f) this.f3160b;
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
                        Class<? extends U> asSubclass = Class.forName(str, false, C0196a.class.getClassLoader()).asSubclass(b.class);
                        h.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                h.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof S)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                Q c3 = ((S) fVar).c();
                                d b2 = fVar.b();
                                c3.getClass();
                                LinkedHashMap linkedHashMap = c3.f1921a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    h.e(str2, "key");
                                    O o2 = (O) linkedHashMap.get(str2);
                                    h.b(o2);
                                    J.c(o2, b2, fVar.e());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    b2.f();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException("Failed to instantiate " + str, e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException("Class " + str + " wasn't found", e3);
                    }
                }
                return;
            case 1:
                if (enumC0077l != EnumC0077l.ON_STOP || (view = ((AbstractComponentCallbacksC0053q) this.f3160b).f1595E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                new HashMap();
                InterfaceC0072g[] interfaceC0072gArr = (InterfaceC0072g[]) this.f3160b;
                if (interfaceC0072gArr.length > 0) {
                    InterfaceC0072g interfaceC0072g = interfaceC0072gArr[0];
                    throw null;
                }
                if (interfaceC0072gArr.length <= 0) {
                    return;
                }
                InterfaceC0072g interfaceC0072g2 = interfaceC0072gArr[0];
                throw null;
            case 3:
                if (enumC0077l != EnumC0077l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0077l).toString());
                }
                tVar.e().f(this);
                L l2 = (L) this.f3160b;
                if (l2.f1916b) {
                    return;
                }
                Bundle c4 = l2.f1915a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = l2.f1917c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c4 != null) {
                    bundle.putAll(c4);
                }
                l2.f1917c = bundle;
                l2.f1916b = true;
                return;
            default:
                AbstractActivityC0132i abstractActivityC0132i = (AbstractActivityC0132i) this.f3160b;
                if (abstractActivityC0132i.e == null) {
                    C0095h c0095h = (C0095h) abstractActivityC0132i.getLastNonConfigurationInstance();
                    if (c0095h != null) {
                        abstractActivityC0132i.e = c0095h.f2163a;
                    }
                    if (abstractActivityC0132i.e == null) {
                        abstractActivityC0132i.e = new Q();
                    }
                }
                abstractActivityC0132i.f2177a.f(this);
                return;
        }
    }
}
