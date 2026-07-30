package k0;

import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC0228t;
import androidx.lifecycle.C0245k;
import androidx.lifecycle.EnumC0248n;
import androidx.lifecycle.InterfaceC0243i;
import androidx.lifecycle.InterfaceC0254u;
import androidx.lifecycle.InterfaceC0256w;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.W;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import d.o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590a implements InterfaceC0254u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6020d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6021e;

    public /* synthetic */ C0590a(int i2, Object obj) {
        this.f6020d = i2;
        this.f6021e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0254u
    public final void a(InterfaceC0256w source, EnumC0248n event) {
        switch (this.f6020d) {
            case 0:
                f owner = (f) this.f6021e;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != EnumC0248n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                source.getLifecycle().b(this);
                Bundle a7 = owner.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a7 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a7.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, C0590a.class.getClassLoader()).asSubclass(InterfaceC0591b.class);
                        Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                                ((C0245k) ((InterfaceC0591b) newInstance)).getClass();
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                if (!(owner instanceof c0)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                b0 viewModelStore = ((c0) owner).getViewModelStore();
                                C0593d savedStateRegistry = owner.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f3894a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    Intrinsics.checkNotNullParameter(key, "key");
                                    W w4 = (W) linkedHashMap.get(key);
                                    Intrinsics.b(w4);
                                    O.a(w4, savedStateRegistry, owner.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e7) {
                                throw new RuntimeException(r4.f.i("Failed to instantiate ", str2), e7);
                            }
                        } catch (NoSuchMethodException e8) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                        }
                    } catch (ClassNotFoundException e9) {
                        throw new RuntimeException(r4.f.d("Class ", str2, " wasn't found"), e9);
                    }
                }
                return;
            case 1:
                if (event == EnumC0248n.ON_STOP) {
                    ((ComponentCallbacksC0228t) this.f6021e).getClass();
                    return;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                new HashMap();
                InterfaceC0243i[] interfaceC0243iArr = (InterfaceC0243i[]) this.f6021e;
                if (interfaceC0243iArr.length > 0) {
                    InterfaceC0243i interfaceC0243i = interfaceC0243iArr[0];
                    throw null;
                }
                if (interfaceC0243iArr.length <= 0) {
                    return;
                }
                InterfaceC0243i interfaceC0243i2 = interfaceC0243iArr[0];
                throw null;
            case 3:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC0248n.ON_CREATE) {
                    source.getLifecycle().b(this);
                    ((P) this.f6021e).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
                }
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                o oVar = (o) this.f6021e;
                o.access$ensureViewModelStore(oVar);
                oVar.getLifecycle().b(this);
                return;
        }
    }

    public C0590a(InterfaceC0243i[] generatedAdapters) {
        this.f6020d = 2;
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f6021e = generatedAdapters;
    }

    public C0590a(f owner) {
        this.f6020d = 0;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f6021e = owner;
    }

    public C0590a(P provider) {
        this.f6020d = 3;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f6021e = provider;
    }
}
