package a0;

import B0.o;
import android.os.Bundle;
import androidx.lifecycle.EnumC0243m;
import androidx.lifecycle.InterfaceC0237g;
import androidx.lifecycle.InterfaceC0249t;
import androidx.lifecycle.InterfaceC0250u;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import b2.AbstractC0279e;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171b implements InterfaceC0249t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3821a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3822b;

    public /* synthetic */ C0171b(int i2, Object obj) {
        this.f3821a = i2;
        this.f3822b = obj;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [a0.h, androidx.lifecycle.u, java.lang.Object] */
    @Override // androidx.lifecycle.InterfaceC0249t
    public final void a(InterfaceC0250u interfaceC0250u, EnumC0243m enumC0243m) {
        switch (this.f3821a) {
            case 0:
                if (enumC0243m != EnumC0243m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0250u.getLifecycle().b(this);
                ?? r6 = this.f3822b;
                Bundle a6 = r6.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a6 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a6.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C0171b.class.getClassLoader()).asSubclass(InterfaceC0173d.class);
                        i.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                i.d(newInstance, "{\n                constr…wInstance()\n            }");
                                Y viewModelStore = ((Z) r6).getViewModelStore();
                                C0175f savedStateRegistry = r6.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f4563a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    i.e(key, "key");
                                    T t5 = (T) linkedHashMap.get(key);
                                    i.b(t5);
                                    M.a(t5, savedStateRegistry, r6.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e3) {
                                throw new RuntimeException(o.i("Failed to instantiate ", str), e3);
                            }
                        } catch (NoSuchMethodException e6) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
                        }
                    } catch (ClassNotFoundException e7) {
                        throw new RuntimeException(AbstractC0279e.f("Class ", str, " wasn't found"), e7);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC0237g[] interfaceC0237gArr = (InterfaceC0237g[]) this.f3822b;
                if (interfaceC0237gArr.length > 0) {
                    InterfaceC0237g interfaceC0237g = interfaceC0237gArr[0];
                    throw null;
                }
                if (interfaceC0237gArr.length <= 0) {
                    return;
                }
                InterfaceC0237g interfaceC0237g2 = interfaceC0237gArr[0];
                throw null;
            default:
                if (enumC0243m != EnumC0243m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0243m).toString());
                }
                interfaceC0250u.getLifecycle().b(this);
                ((N) this.f3822b).b();
                return;
        }
    }
}
