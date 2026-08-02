package m1;

import E.AbstractC0005f;
import android.os.Bundle;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0234m;
import androidx.lifecycle.InterfaceC0235n;
import androidx.lifecycle.J;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import b.AbstractActivityC0253n;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;
import x.AbstractC1514c;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1304b implements InterfaceC0234m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14486a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14487b;

    public /* synthetic */ C1304b(int i4, Object obj) {
        this.f14486a = i4;
        this.f14487b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0234m
    public final void a(InterfaceC0235n interfaceC0235n, EnumC0229h enumC0229h) {
        switch (this.f14486a) {
            case 0:
                g gVar = (g) this.f14487b;
                if (enumC0229h != EnumC0229h.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0235n.getLifecycle().b(this);
                Bundle a3 = gVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a3 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a3.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    String str = stringArrayList.get(i4);
                    i4++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, C1304b.class.getClassLoader()).asSubclass(InterfaceC1305c.class);
                        i.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                i.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(gVar instanceof P)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                O viewModelStore = ((P) gVar).getViewModelStore();
                                C1307e savedStateRegistry = gVar.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f5037a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    i.e(key, "key");
                                    J j4 = (J) linkedHashMap.get(key);
                                    i.b(j4);
                                    E.a(j4, savedStateRegistry, gVar.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e4) {
                                throw new RuntimeException(AbstractC0005f.n("Failed to instantiate ", str2), e4);
                            }
                        } catch (NoSuchMethodException e5) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                        }
                    } catch (ClassNotFoundException e6) {
                        throw new RuntimeException(AbstractC1514c.a("Class ", str2, " wasn't found"), e6);
                    }
                }
                return;
            case 1:
                if (enumC0229h == EnumC0229h.ON_CREATE) {
                    interfaceC0235n.getLifecycle().b(this);
                    ((F) this.f14487b).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0229h).toString());
                }
            default:
                AbstractActivityC0253n abstractActivityC0253n = (AbstractActivityC0253n) this.f14487b;
                AbstractActivityC0253n.access$ensureViewModelStore(abstractActivityC0253n);
                abstractActivityC0253n.getLifecycle().b(this);
                return;
        }
    }
}
