package v1;

import android.os.Bundle;
import androidx.lifecycle.C0471k;
import h.C0641b;
import h.C0642c;
import h.C0645f;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f10980b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f10981c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10982d;

    /* renamed from: e, reason: collision with root package name */
    public C1244a f10983e;

    /* renamed from: a, reason: collision with root package name */
    public final C0645f f10979a = new C0645f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f10984f = true;

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f10982d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f10981c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        Bundle bundle3 = this.f10981c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f10981c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f10981c = null;
        }
        return bundle2;
    }

    public final InterfaceC1247d b() {
        String str;
        InterfaceC1247d interfaceC1247d;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        Iterator it = this.f10979a.iterator();
        do {
            C0641b c0641b = (C0641b) it;
            if (!c0641b.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) c0641b.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            str = (String) components.getKey();
            interfaceC1247d = (InterfaceC1247d) components.getValue();
        } while (!Intrinsics.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC1247d;
    }

    public final void c(String key, InterfaceC1247d provider) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        C0645f c0645f = this.f10979a;
        C0642c e4 = c0645f.e(key);
        if (e4 != null) {
            obj = e4.f6816e;
        } else {
            C0642c c0642c = new C0642c(key, provider);
            c0645f.f6825j++;
            C0642c c0642c2 = c0645f.f6823e;
            if (c0642c2 == null) {
                c0645f.f6822d = c0642c;
                c0645f.f6823e = c0642c;
            } else {
                c0642c2.f6817i = c0642c;
                c0642c.f6818j = c0642c2;
                c0645f.f6823e = c0642c;
            }
            obj = null;
        }
        if (((InterfaceC1247d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(C0471k.class, "clazz");
        if (!this.f10984f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C1244a c1244a = this.f10983e;
        if (c1244a == null) {
            c1244a = new C1244a(this);
        }
        this.f10983e = c1244a;
        try {
            C0471k.class.getDeclaredConstructor(null);
            C1244a c1244a2 = this.f10983e;
            if (c1244a2 != null) {
                String className = C0471k.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "clazz.name");
                Intrinsics.checkNotNullParameter(className, "className");
                c1244a2.f10976a.add(className);
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + C0471k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }
}
