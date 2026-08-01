package g0;

import a.p;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractActivityC0064v;
import androidx.fragment.app.AbstractComponentCallbacksC0060q;
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.InterfaceC0075h;
import androidx.lifecycle.InterfaceC0086t;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.P;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.r;
import com.luckyarcade.spinthrow.GameConfig;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2610a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2611b;

    public /* synthetic */ C0164a(int i, Object obj) {
        this.f2610a = i;
        this.f2611b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void g(InterfaceC0086t interfaceC0086t, EnumC0080m enumC0080m) {
        View view;
        switch (this.f2610a) {
            case 0:
                if (enumC0080m != EnumC0080m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0086t.getLifecycle().b(this);
                f fVar = (f) this.f2611b;
                Bundle a2 = fVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C0164a.class.getClassLoader()).asSubclass(b.class);
                        X0.f.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                X0.f.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof V)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                U viewModelStore = ((V) fVar).getViewModelStore();
                                d savedStateRegistry = fVar.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f1476a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    X0.f.e(str2, "key");
                                    P p2 = (P) linkedHashMap.get(str2);
                                    X0.f.b(p2);
                                    J.a(p2, savedStateRegistry, fVar.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
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
                AbstractActivityC0064v abstractActivityC0064v = (AbstractActivityC0064v) this.f2611b;
                p.access$ensureViewModelStore(abstractActivityC0064v);
                abstractActivityC0064v.getLifecycle().b(this);
                return;
            case 2:
                if (enumC0080m != EnumC0080m.ON_STOP || (view = ((AbstractComponentCallbacksC0060q) this.f2611b).f1382E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case GameConfig.COMBO_EVERY /* 3 */:
                new HashMap();
                InterfaceC0075h[] interfaceC0075hArr = (InterfaceC0075h[]) this.f2611b;
                if (interfaceC0075hArr.length > 0) {
                    InterfaceC0075h interfaceC0075h = interfaceC0075hArr[0];
                    throw null;
                }
                if (interfaceC0075hArr.length <= 0) {
                    return;
                }
                InterfaceC0075h interfaceC0075h2 = interfaceC0075hArr[0];
                throw null;
            default:
                if (enumC0080m != EnumC0080m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0080m).toString());
                }
                interfaceC0086t.getLifecycle().b(this);
                ((L) this.f2611b).b();
                return;
        }
    }
}
