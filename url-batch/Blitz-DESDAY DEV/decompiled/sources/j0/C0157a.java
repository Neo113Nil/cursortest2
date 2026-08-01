package j0;

import Z.AbstractComponentCallbacksC0047q;
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
import g.AbstractActivityC0110i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157a implements InterfaceC0073p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2678a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2679b;

    public /* synthetic */ C0157a(int i, Object obj) {
        this.f2678a = i;
        this.f2679b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void g(r rVar, EnumC0069l enumC0069l) {
        View view;
        switch (this.f2678a) {
            case 0:
                if (enumC0069l != EnumC0069l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                rVar.f().f(this);
                f fVar = (f) this.f2679b;
                Bundle c2 = fVar.c().c("androidx.savedstate.Restarter");
                if (c2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = c2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C0157a.class.getClassLoader()).asSubclass(b.class);
                        g1.d.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                g1.d.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof P)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                O d = ((P) fVar).d();
                                d c3 = fVar.c();
                                d.getClass();
                                LinkedHashMap linkedHashMap = d.f1555a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    g1.d.e(str2, "key");
                                    M m2 = (M) linkedHashMap.get(str2);
                                    g1.d.b(m2);
                                    H.c(m2, c3, fVar.f());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    c3.f();
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
                if (enumC0069l != EnumC0069l.ON_STOP || (view = ((AbstractComponentCallbacksC0047q) this.f2679b).f1176E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                AbstractActivityC0110i abstractActivityC0110i = (AbstractActivityC0110i) this.f2679b;
                if (abstractActivityC0110i.f1263e == null) {
                    h hVar = (h) abstractActivityC0110i.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        abstractActivityC0110i.f1263e = hVar.f1247a;
                    }
                    if (abstractActivityC0110i.f1263e == null) {
                        abstractActivityC0110i.f1263e = new O();
                    }
                }
                abstractActivityC0110i.f1260a.f(this);
                return;
            case 3:
                new HashMap();
                InterfaceC0064g[] interfaceC0064gArr = (InterfaceC0064g[]) this.f2679b;
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
                rVar.f().f(this);
                J j2 = (J) this.f2679b;
                if (j2.f1551b) {
                    return;
                }
                Bundle c4 = j2.f1550a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = j2.f1552c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c4 != null) {
                    bundle.putAll(c4);
                }
                j2.f1552c = bundle;
                j2.f1551b = true;
                return;
        }
    }
}
