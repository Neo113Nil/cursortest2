package g0;

import android.os.Bundle;
import androidx.lifecycle.C0077j;
import g.C0156i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2609b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2610c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2611d;

    /* renamed from: e, reason: collision with root package name */
    public C0156i f2612e;

    /* renamed from: a, reason: collision with root package name */
    public final n.f f2608a = new n.f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f2613f = true;

    public final Bundle a(String str) {
        if (!this.f2611d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f2610c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f2610c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f2610c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2610c = null;
        }
        return bundle2;
    }

    public final c b() {
        String str;
        c cVar;
        Iterator it = this.f2608a.iterator();
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
        n.f fVar = this.f2608a;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3618b;
        } else {
            n.c cVar2 = new n.c(str, cVar);
            fVar.f3627d++;
            n.c cVar3 = fVar.f3625b;
            if (cVar3 == null) {
                fVar.f3624a = cVar2;
                fVar.f3625b = cVar2;
            } else {
                cVar3.f3619c = cVar2;
                cVar2.f3620d = cVar3;
                fVar.f3625b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f2613f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0156i c0156i = this.f2612e;
        if (c0156i == null) {
            c0156i = new C0156i(this);
        }
        this.f2612e = c0156i;
        try {
            C0077j.class.getDeclaredConstructor(null);
            C0156i c0156i2 = this.f2612e;
            if (c0156i2 != null) {
                ((LinkedHashSet) c0156i2.f2577b).add(C0077j.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0077j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}
