package V;

import E1.AbstractC0033i;
import O1.k;
import android.os.Bundle;
import androidx.lifecycle.A;
import androidx.lifecycle.B;
import androidx.lifecycle.EnumC0165g;
import androidx.lifecycle.F;
import androidx.lifecycle.G;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import c.i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;
import w0.AbstractC1234c;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1589a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1590b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f1589a = i3;
        this.f1590b = obj;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [V.f, androidx.lifecycle.m, java.lang.Object] */
    @Override // androidx.lifecycle.l
    public final void a(m mVar, EnumC0165g enumC0165g) {
        Object obj;
        switch (this.f1589a) {
            case 0:
                if (enumC0165g != EnumC0165g.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                mVar.e().b(this);
                ?? r7 = this.f1590b;
                Bundle a3 = r7.b().a("androidx.savedstate.Restarter");
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
                        j.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                j.d(newInstance, "{\n                constr…wInstance()\n            }");
                                F d3 = ((G) r7).d();
                                k registry = r7.b();
                                d3.getClass();
                                LinkedHashMap linkedHashMap = d3.f2375a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    j.e(key, "key");
                                    B b3 = (B) linkedHashMap.get(key);
                                    j.b(b3);
                                    o lifecycle = r7.e();
                                    j.e(registry, "registry");
                                    j.e(lifecycle, "lifecycle");
                                    HashMap hashMap = b3.f2370a;
                                    if (hashMap == null) {
                                        obj = null;
                                    } else {
                                        synchronized (hashMap) {
                                            obj = b3.f2370a.get("androidx.lifecycle.savedstate.vm.tag");
                                        }
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    registry.d();
                                }
                            } catch (Exception e3) {
                                throw new RuntimeException(AbstractC0033i.j("Failed to instantiate ", str), e3);
                            }
                        } catch (NoSuchMethodException e4) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                        }
                    } catch (ClassNotFoundException e5) {
                        throw new RuntimeException(AbstractC1234c.a("Class ", str, " wasn't found"), e5);
                    }
                }
                return;
            case 1:
                if (enumC0165g != EnumC0165g.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0165g).toString());
                }
                mVar.e().b(this);
                A a4 = (A) this.f1590b;
                if (a4.f2367b) {
                    return;
                }
                Bundle a5 = a4.f2366a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = a4.f2368c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (a5 != null) {
                    bundle.putAll(a5);
                }
                a4.f2368c = bundle;
                a4.f2367b = true;
                return;
            default:
                c.m mVar2 = (c.m) this.f1590b;
                if (mVar2.f2587e == null) {
                    i iVar = (i) mVar2.getLastNonConfigurationInstance();
                    if (iVar != null) {
                        mVar2.f2587e = iVar.f2570a;
                    }
                    if (mVar2.f2587e == null) {
                        mVar2.f2587e = new F(0);
                    }
                }
                mVar2.f10332a.b(this);
                return;
        }
    }
}
