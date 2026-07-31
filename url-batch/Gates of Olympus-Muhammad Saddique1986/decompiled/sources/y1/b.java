package y1;

import android.os.Bundle;
import androidx.lifecycle.EnumC0285n;
import androidx.lifecycle.InterfaceC0280i;
import androidx.lifecycle.InterfaceC0290t;
import androidx.lifecycle.InterfaceC0292v;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.V;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import b.AbstractActivityC0319o;
import b.C0313i;
import f2.j;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k1.i;

/* loaded from: classes.dex */
public final class b implements InterfaceC0290t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10385d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10386e;

    public /* synthetic */ b(int i3, Object obj) {
        this.f10385d = i3;
        this.f10386e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0290t
    public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
        switch (this.f10385d) {
            case 0:
                if (enumC0285n != EnumC0285n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0292v.e().f(this);
                f fVar = (f) this.f10386e;
                Bundle a3 = fVar.c().a("androidx.savedstate.Restarter");
                if (a3 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a3.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        j.e(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                j.e(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof b0)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                a0 d3 = ((b0) fVar).d();
                                e c2 = fVar.c();
                                LinkedHashMap linkedHashMap = d3.f5208a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    j.f(str2, "key");
                                    V v3 = (V) linkedHashMap.get(str2);
                                    j.c(v3);
                                    P.a(v3, c2, fVar.e());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    c2.d();
                                }
                            } catch (Exception e3) {
                                throw new RuntimeException("Failed to instantiate " + str, e3);
                            }
                        } catch (NoSuchMethodException e4) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                        }
                    } catch (ClassNotFoundException e5) {
                        throw new RuntimeException("Class " + str + " wasn't found", e5);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC0280i[] interfaceC0280iArr = (InterfaceC0280i[]) this.f10386e;
                if (interfaceC0280iArr.length > 0) {
                    InterfaceC0280i interfaceC0280i = interfaceC0280iArr[0];
                    throw null;
                }
                if (interfaceC0280iArr.length <= 0) {
                    return;
                }
                InterfaceC0280i interfaceC0280i2 = interfaceC0280iArr[0];
                throw null;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                if (enumC0285n != EnumC0285n.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0285n).toString());
                }
                interfaceC0292v.e().f(this);
                ((Q) this.f10386e).b();
                return;
            default:
                AbstractActivityC0319o abstractActivityC0319o = (AbstractActivityC0319o) this.f10386e;
                if (abstractActivityC0319o.f5317h == null) {
                    C0313i c0313i = (C0313i) abstractActivityC0319o.getLastNonConfigurationInstance();
                    if (c0313i != null) {
                        abstractActivityC0319o.f5317h = c0313i.f5291a;
                    }
                    if (abstractActivityC0319o.f5317h == null) {
                        abstractActivityC0319o.f5317h = new a0();
                    }
                }
                abstractActivityC0319o.f4509d.f(this);
                return;
        }
    }
}
