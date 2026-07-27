package a0;

import android.os.Bundle;
import androidx.lifecycle.C0239i;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;

/* renamed from: a0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3825b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f3826c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3827d;

    /* renamed from: e, reason: collision with root package name */
    public C0170a f3828e;

    /* renamed from: a, reason: collision with root package name */
    public final n.f f3824a = new n.f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f3829f = true;

    public final Bundle a(String str) {
        if (!this.f3827d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f3826c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f3826c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3826c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f3826c = null;
        }
        return bundle2;
    }

    public final InterfaceC0174e b() {
        String str;
        InterfaceC0174e interfaceC0174e;
        Iterator it = this.f3824a.iterator();
        do {
            n.b bVar = (n.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) bVar.next();
            i.d(components, "components");
            str = (String) components.getKey();
            interfaceC0174e = (InterfaceC0174e) components.getValue();
        } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0174e;
    }

    public final void c(String str, InterfaceC0174e provider) {
        Object obj;
        i.e(provider, "provider");
        n.f fVar = this.f3824a;
        n.c b6 = fVar.b(str);
        if (b6 != null) {
            obj = b6.f11267b;
        } else {
            n.c cVar = new n.c(str, provider);
            fVar.f11276d++;
            n.c cVar2 = fVar.f11274b;
            if (cVar2 == null) {
                fVar.f11273a = cVar;
                fVar.f11274b = cVar;
            } else {
                cVar2.f11268c = cVar;
                cVar.f11269d = cVar2;
                fVar.f11274b = cVar;
            }
            obj = null;
        }
        if (((InterfaceC0174e) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f3829f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0170a c0170a = this.f3828e;
        if (c0170a == null) {
            c0170a = new C0170a(this);
        }
        this.f3828e = c0170a;
        try {
            C0239i.class.getDeclaredConstructor(null);
            C0170a c0170a2 = this.f3828e;
            if (c0170a2 != null) {
                c0170a2.f3820a.add(C0239i.class.getName());
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + C0239i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }
}
