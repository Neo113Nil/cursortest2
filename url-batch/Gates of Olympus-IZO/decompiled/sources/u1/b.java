package u1;

import Z1.i;
import android.os.Bundle;
import androidx.lifecycle.EnumC0229n;
import androidx.lifecycle.InterfaceC0224i;
import androidx.lifecycle.InterfaceC0234t;
import androidx.lifecycle.InterfaceC0236v;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.V;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import b.C0249i;
import b.o;
import h1.C0438i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b implements InterfaceC0234t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8510d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8511e;

    public /* synthetic */ b(int i3, Object obj) {
        this.f8510d = i3;
        this.f8511e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0234t
    public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
        switch (this.f8510d) {
            case 0:
                if (enumC0229n != EnumC0229n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0236v.e().f(this);
                f fVar = (f) this.f8511e;
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
                        i.e(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                i.e(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof b0)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                a0 d3 = ((b0) fVar).d();
                                e c3 = fVar.c();
                                LinkedHashMap linkedHashMap = d3.f4007a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    i.f(str2, "key");
                                    V v3 = (V) linkedHashMap.get(str2);
                                    i.c(v3);
                                    P.a(v3, c3, fVar.e());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    c3.d();
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
                InterfaceC0224i[] interfaceC0224iArr = (InterfaceC0224i[]) this.f8511e;
                if (interfaceC0224iArr.length > 0) {
                    InterfaceC0224i interfaceC0224i = interfaceC0224iArr[0];
                    throw null;
                }
                if (interfaceC0224iArr.length <= 0) {
                    return;
                }
                InterfaceC0224i interfaceC0224i2 = interfaceC0224iArr[0];
                throw null;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                if (enumC0229n != EnumC0229n.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0229n).toString());
                }
                interfaceC0236v.e().f(this);
                ((Q) this.f8511e).b();
                return;
            default:
                o oVar = (o) this.f8511e;
                if (oVar.f4181h == null) {
                    C0249i c0249i = (C0249i) oVar.getLastNonConfigurationInstance();
                    if (c0249i != null) {
                        oVar.f4181h = c0249i.f4156a;
                    }
                    if (oVar.f4181h == null) {
                        oVar.f4181h = new a0();
                    }
                }
                oVar.f3274d.f(this);
                return;
        }
    }
}
