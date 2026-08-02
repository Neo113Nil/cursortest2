package m1;

import android.os.Bundle;
import androidx.lifecycle.C0225d;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import m.C1274b;
import m.C1275c;
import m.C1278f;

/* renamed from: m1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f14489b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f14490c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14491d;

    /* renamed from: e, reason: collision with root package name */
    public C1303a f14492e;

    /* renamed from: a, reason: collision with root package name */
    public final C1278f f14488a = new C1278f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f14493f = true;

    public final Bundle a(String str) {
        if (!this.f14491d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f14490c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f14490c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f14490c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f14490c = null;
        return bundle2;
    }

    public final InterfaceC1306d b() {
        String str;
        InterfaceC1306d interfaceC1306d;
        Iterator it = this.f14488a.iterator();
        do {
            C1274b c1274b = (C1274b) it;
            if (!c1274b.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) c1274b.next();
            i.d(components, "components");
            str = (String) components.getKey();
            interfaceC1306d = (InterfaceC1306d) components.getValue();
        } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC1306d;
    }

    public final void c(String str, InterfaceC1306d provider) {
        Object obj;
        i.e(provider, "provider");
        C1278f c1278f = this.f14488a;
        C1275c b4 = c1278f.b(str);
        if (b4 != null) {
            obj = b4.f14282b;
        } else {
            C1275c c1275c = new C1275c(str, provider);
            c1278f.f14291d++;
            C1275c c1275c2 = c1278f.f14289b;
            if (c1275c2 == null) {
                c1278f.f14288a = c1275c;
                c1278f.f14289b = c1275c;
            } else {
                c1275c2.f14283c = c1275c;
                c1275c.f14284d = c1275c2;
                c1278f.f14289b = c1275c;
            }
            obj = null;
        }
        if (((InterfaceC1306d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f14493f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C1303a c1303a = this.f14492e;
        if (c1303a == null) {
            c1303a = new C1303a(this);
        }
        this.f14492e = c1303a;
        try {
            C0225d.class.getDeclaredConstructor(null);
            C1303a c1303a2 = this.f14492e;
            if (c1303a2 != null) {
                c1303a2.f14485a.add(C0225d.class.getName());
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + C0225d.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }
}
