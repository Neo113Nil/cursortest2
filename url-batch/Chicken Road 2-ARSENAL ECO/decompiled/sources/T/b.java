package T;

import W4.o;
import android.os.Bundle;
import androidx.lifecycle.EnumC0246m;
import androidx.lifecycle.InterfaceC0240g;
import androidx.lifecycle.InterfaceC0252t;
import androidx.lifecycle.InterfaceC0253u;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.S;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements InterfaceC0252t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2207f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2208g;

    public /* synthetic */ b(int i7, Object obj) {
        this.f2207f = i7;
        this.f2208g = obj;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [T.h, androidx.lifecycle.u, java.lang.Object] */
    @Override // androidx.lifecycle.InterfaceC0252t
    public final void a(InterfaceC0253u interfaceC0253u, EnumC0246m enumC0246m) {
        switch (this.f2207f) {
            case 0:
                if (enumC0246m != EnumC0246m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0253u.getLifecycle().b(this);
                ?? r9 = this.f2208g;
                Bundle a7 = r9.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a7 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a7.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    String str = stringArrayList.get(i7);
                    i7++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(d.class);
                        i.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                i.d(newInstance, "{\n                constr…wInstance()\n            }");
                                X viewModelStore = ((Y) r9).getViewModelStore();
                                f savedStateRegistry = r9.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f3498a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    i.e(key, "key");
                                    S s6 = (S) linkedHashMap.get(key);
                                    i.b(s6);
                                    L.a(s6, savedStateRegistry, r9.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e4) {
                                throw new RuntimeException(C1.c.h("Failed to instantiate ", str2), e4);
                            }
                        } catch (NoSuchMethodException e7) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                        }
                    } catch (ClassNotFoundException e8) {
                        throw new RuntimeException(o.e("Class ", str2, " wasn't found"), e8);
                    }
                }
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                new HashMap();
                InterfaceC0240g[] interfaceC0240gArr = (InterfaceC0240g[]) this.f2208g;
                if (interfaceC0240gArr.length > 0) {
                    InterfaceC0240g interfaceC0240g = interfaceC0240gArr[0];
                    throw null;
                }
                if (interfaceC0240gArr.length <= 0) {
                    return;
                }
                InterfaceC0240g interfaceC0240g2 = interfaceC0240gArr[0];
                throw null;
            default:
                if (enumC0246m == EnumC0246m.ON_CREATE) {
                    interfaceC0253u.getLifecycle().b(this);
                    ((M) this.f2208g).c();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0246m).toString());
                }
        }
    }
}
