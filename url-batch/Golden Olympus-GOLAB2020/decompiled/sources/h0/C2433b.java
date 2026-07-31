package h0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.InterfaceC1351q;
import androidx.lifecycle.InterfaceC1354u;
import h0.C2435d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2433b implements InterfaceC1351q {

    /* renamed from: c, reason: collision with root package name */
    public static final a f36685c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2437f f36686b;

    /* renamed from: h0.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: h0.b$b, reason: collision with other inner class name */
    public static final class C0218b implements C2435d.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f36687a;

        public C0218b(C2435d registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.f36687a = new LinkedHashSet();
            registry.h("androidx.savedstate.Restarter", this);
        }

        @Override // h0.C2435d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f36687a));
            return bundle;
        }

        public final void b(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f36687a.add(className);
        }
    }

    public C2433b(InterfaceC2437f owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f36686b = owner;
    }

    private final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, C2433b.class.getClassLoader()).asSubclass(C2435d.a.class);
            Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C2435d.a) newInstance).a(this.f36686b);
                } catch (Exception e4) {
                    throw new RuntimeException("Failed to instantiate " + str, e4);
                }
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("Class " + str + " wasn't found", e6);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1351q
    public void onStateChanged(InterfaceC1354u source, AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC1346l.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().removeObserver(this);
        Bundle b4 = this.f36686b.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (b4 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b4.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i4 = 0;
        while (i4 < size) {
            String str = stringArrayList.get(i4);
            i4++;
            a(str);
        }
    }
}
