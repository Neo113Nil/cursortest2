package T;

import android.os.Bundle;
import androidx.lifecycle.C0242i;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import m.C0514b;
import m.C0515c;
import m.C0518f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2211b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2212c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2213d;

    /* renamed from: e, reason: collision with root package name */
    public a f2214e;

    /* renamed from: a, reason: collision with root package name */
    public final C0518f f2210a = new C0518f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f2215f = true;

    public final Bundle a(String str) {
        if (!this.f2213d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f2212c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f2212c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f2212c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f2212c = null;
        return bundle2;
    }

    public final e b() {
        String str;
        e eVar;
        Iterator it = this.f2210a.iterator();
        do {
            C0514b c0514b = (C0514b) it;
            if (!c0514b.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) c0514b.next();
            i.d(components, "components");
            str = (String) components.getKey();
            eVar = (e) components.getValue();
        } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return eVar;
    }

    public final void c(String str, e provider) {
        Object obj;
        i.e(provider, "provider");
        C0518f c0518f = this.f2210a;
        C0515c a7 = c0518f.a(str);
        if (a7 != null) {
            obj = a7.f5316g;
        } else {
            C0515c c0515c = new C0515c(str, provider);
            c0518f.f5325i++;
            C0515c c0515c2 = c0518f.f5323g;
            if (c0515c2 == null) {
                c0518f.f5322f = c0515c;
                c0518f.f5323g = c0515c;
            } else {
                c0515c2.f5317h = c0515c;
                c0515c.f5318i = c0515c2;
                c0518f.f5323g = c0515c;
            }
            obj = null;
        }
        if (((e) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f2215f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.f2214e;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f2214e = aVar;
        try {
            C0242i.class.getDeclaredConstructor(null);
            a aVar2 = this.f2214e;
            if (aVar2 != null) {
                aVar2.f2206a.add(C0242i.class.getName());
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + C0242i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }
}
