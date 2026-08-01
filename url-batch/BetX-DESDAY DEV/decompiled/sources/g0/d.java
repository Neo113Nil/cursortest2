package g0;

import android.os.Bundle;
import androidx.lifecycle.C0077j;
import g.C0157i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2613b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2614c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2615d;

    /* renamed from: e, reason: collision with root package name */
    public C0157i f2616e;

    /* renamed from: a, reason: collision with root package name */
    public final n.f f2612a = new n.f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f2617f = true;

    public final Bundle a(String str) {
        if (!this.f2615d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f2614c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f2614c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f2614c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2614c = null;
        }
        return bundle2;
    }

    public final c b() {
        String str;
        c cVar;
        Iterator it = this.f2612a.iterator();
        do {
            n.b bVar = (n.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            X0.f.d(entry, "components");
            str = (String) entry.getKey();
            cVar = (c) entry.getValue();
        } while (!X0.f.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cVar;
    }

    public final void c(String str, c cVar) {
        Object obj;
        X0.f.e(cVar, "provider");
        n.f fVar = this.f2612a;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3622b;
        } else {
            n.c cVar2 = new n.c(str, cVar);
            fVar.f3631d++;
            n.c cVar3 = fVar.f3629b;
            if (cVar3 == null) {
                fVar.f3628a = cVar2;
                fVar.f3629b = cVar2;
            } else {
                cVar3.f3623c = cVar2;
                cVar2.f3624d = cVar3;
                fVar.f3629b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f2617f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0157i c0157i = this.f2616e;
        if (c0157i == null) {
            c0157i = new C0157i(this);
        }
        this.f2616e = c0157i;
        try {
            C0077j.class.getDeclaredConstructor(null);
            C0157i c0157i2 = this.f2616e;
            if (c0157i2 != null) {
                ((LinkedHashSet) c0157i2.f2581b).add(C0077j.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0077j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}
