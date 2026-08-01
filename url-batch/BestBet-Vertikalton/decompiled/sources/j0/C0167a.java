package j0;

import Y.AbstractComponentCallbacksC0050q;
import a.h;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.InterfaceC0066g;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import g.AbstractActivityC0128i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3076a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3077b;

    public /* synthetic */ C0167a(int i, Object obj) {
        this.f3076a = i;
        this.f3077b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0071l enumC0071l) {
        View view;
        switch (this.f3076a) {
            case 0:
                if (enumC0071l != EnumC0071l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                tVar.e().f(this);
                f fVar = (f) this.f3077b;
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
                        Class<? extends U> asSubclass = Class.forName(str, false, C0167a.class.getClassLoader()).asSubclass(InterfaceC0168b.class);
                        k1.e.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                k1.e.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof S)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                Q c3 = ((S) fVar).c();
                                d b2 = fVar.b();
                                c3.getClass();
                                LinkedHashMap linkedHashMap = c3.f1871a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    k1.e.e(str2, "key");
                                    O o2 = (O) linkedHashMap.get(str2);
                                    k1.e.b(o2);
                                    J.c(o2, b2, fVar.e());
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
                if (enumC0071l != EnumC0071l.ON_STOP || (view = ((AbstractComponentCallbacksC0050q) this.f3077b).f1446E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                AbstractActivityC0128i abstractActivityC0128i = (AbstractActivityC0128i) this.f3077b;
                if (abstractActivityC0128i.f1582e == null) {
                    h hVar = (h) abstractActivityC0128i.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        abstractActivityC0128i.f1582e = hVar.f1566a;
                    }
                    if (abstractActivityC0128i.f1582e == null) {
                        abstractActivityC0128i.f1582e = new Q();
                    }
                }
                abstractActivityC0128i.f1579a.f(this);
                return;
            case 3:
                new HashMap();
                InterfaceC0066g[] interfaceC0066gArr = (InterfaceC0066g[]) this.f3077b;
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
                tVar.e().f(this);
                L l2 = (L) this.f3077b;
                if (l2.f1867b) {
                    return;
                }
                Bundle c4 = l2.f1866a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = l2.f1868c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c4 != null) {
                    bundle.putAll(c4);
                }
                l2.f1868c = bundle;
                l2.f1867b = true;
                return;
        }
    }
}
