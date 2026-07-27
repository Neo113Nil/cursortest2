package v1;

import A.AbstractC0017m;
import android.os.Bundle;
import androidx.lifecycle.C0471k;
import androidx.lifecycle.EnumC0474n;
import androidx.lifecycle.InterfaceC0469i;
import androidx.lifecycle.InterfaceC0479t;
import androidx.lifecycle.InterfaceC0481v;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import b.j;
import b.o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1245b implements InterfaceC0479t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10977d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10978e;

    public C1245b(InterfaceC0469i[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f10978e = generatedAdapters;
    }

    @Override // androidx.lifecycle.InterfaceC0479t
    public final void b(InterfaceC0481v source, EnumC0474n event) {
        switch (this.f10977d) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != EnumC0474n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                source.e().f(this);
                InterfaceC1249f owner = (InterfaceC1249f) this.f10978e;
                Bundle a4 = owner.c().a("androidx.savedstate.Restarter");
                if (a4 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a4.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C1245b.class.getClassLoader()).asSubclass(InterfaceC1246c.class);
                        Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                                ((C0471k) ((InterfaceC1246c) newInstance)).getClass();
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                if (!(owner instanceof Z)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                Y d4 = ((Z) owner).d();
                                C1248e c4 = owner.c();
                                d4.getClass();
                                LinkedHashMap linkedHashMap = d4.f5462a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    Intrinsics.checkNotNullParameter(key, "key");
                                    T t4 = (T) linkedHashMap.get(key);
                                    Intrinsics.c(t4);
                                    M.a(t4, c4, owner.e());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    c4.d();
                                }
                            } catch (Exception e4) {
                                throw new RuntimeException("Failed to instantiate " + str, e4);
                            }
                        } catch (NoSuchMethodException e5) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                        }
                    } catch (ClassNotFoundException e6) {
                        throw new RuntimeException(AbstractC0017m.j("Class ", str, " wasn't found"), e6);
                    }
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                new HashMap();
                InterfaceC0469i[] interfaceC0469iArr = (InterfaceC0469i[]) this.f10978e;
                if (interfaceC0469iArr.length > 0) {
                    InterfaceC0469i interfaceC0469i = interfaceC0469iArr[0];
                    throw null;
                }
                if (interfaceC0469iArr.length <= 0) {
                    return;
                }
                InterfaceC0469i interfaceC0469i2 = interfaceC0469iArr[0];
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != EnumC0474n.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
                }
                source.e().f(this);
                ((N) this.f10978e).b();
                return;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                o oVar = (o) this.f10978e;
                if (oVar.f5565k == null) {
                    j jVar = (j) oVar.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        oVar.f5565k = jVar.f5541a;
                    }
                    if (oVar.f5565k == null) {
                        oVar.f5565k = new Y();
                    }
                }
                oVar.f5561d.f(this);
                return;
        }
    }

    public C1245b(InterfaceC1249f owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f10978e = owner;
    }

    public C1245b(N provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f10978e = provider;
    }

    public C1245b(o oVar) {
        this.f10978e = oVar;
    }
}
