package x3;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f9676b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f9677c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9678d;

    /* renamed from: e, reason: collision with root package name */
    public a f9679e;

    /* renamed from: a, reason: collision with root package name */
    public final h.f f9675a = new h.f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f9680f = true;

    public final Bundle a(String str) {
        k.f(str, "key");
        if (!this.f9678d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f9677c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f9677c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f9677c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f9677c = null;
        return bundle2;
    }

    public final d b() {
        String str;
        d dVar;
        Iterator it = this.f9675a.iterator();
        do {
            h.b bVar = (h.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            k.e(entry, "components");
            str = (String) entry.getKey();
            dVar = (d) entry.getValue();
        } while (!k.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public final void c(String str, d dVar) {
        Object obj;
        k.f(dVar, "provider");
        h.f fVar = this.f9675a;
        h.c a3 = fVar.a(str);
        if (a3 != null) {
            obj = a3.f4577g;
        } else {
            h.c cVar = new h.c(str, dVar);
            fVar.f4586i++;
            h.c cVar2 = fVar.f4584g;
            if (cVar2 == null) {
                fVar.f4583f = cVar;
                fVar.f4584g = cVar;
            } else {
                cVar2.f4578h = cVar;
                cVar.f4579i = cVar2;
                fVar.f4584g = cVar;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f9680f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.f9679e;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f9679e = aVar;
        try {
            androidx.lifecycle.k.class.getDeclaredConstructor(null);
            a aVar2 = this.f9679e;
            if (aVar2 != null) {
                aVar2.f9672a.add(androidx.lifecycle.k.class.getName());
            }
        } catch (NoSuchMethodException e9) {
            throw new IllegalArgumentException("Class " + androidx.lifecycle.k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
        }
    }
}
