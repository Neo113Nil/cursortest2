package x4;

import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import q6.i;
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8655a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8656b;

    public e(z4.a aVar, int i) {
        switch (i) {
            case 1:
                this.f8655a = aVar;
                this.f8656b = new e(aVar, 0);
                break;
            default:
                this.f8655a = aVar;
                break;
        }
    }

    public Bundle a(String str) {
        i.e(str, "key");
        z4.a aVar = (z4.a) this.f8655a;
        if (!aVar.f9176g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = aVar.f9175f;
        if (bundle == null) {
            return null;
        }
        Bundle M = bundle.containsKey(str) ? o.M(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            aVar.f9175f = null;
        }
        return M;
    }

    public d b() {
        d dVar;
        z4.a aVar = (z4.a) this.f8655a;
        synchronized (aVar.f9172c) {
            Iterator it = aVar.f9173d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                d dVar2 = (d) entry.getValue();
                if (i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public void c() {
        ((z4.a) this.f8655a).a();
    }

    public void d(Bundle bundle) {
        z4.a aVar = (z4.a) this.f8655a;
        f fVar = aVar.f9170a;
        if (!aVar.f9174e) {
            aVar.a();
        }
        if (fVar.g().f871c.compareTo(p.f850g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + fVar.g().f871c).toString());
        }
        if (aVar.f9176g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = o.M("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        aVar.f9175f = bundle2;
        aVar.f9176g = true;
    }

    public void e(Bundle bundle) {
        z4.a aVar = (z4.a) this.f8655a;
        Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
        Bundle bundle2 = aVar.f9175f;
        if (bundle2 != null) {
            j7.putAll(bundle2);
        }
        synchronized (aVar.f9172c) {
            for (Map.Entry entry : aVar.f9173d.entrySet()) {
                o.f0(j7, (String) entry.getKey(), ((d) entry.getValue()).a());
            }
        }
        if (j7.isEmpty()) {
            return;
        }
        o.f0(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", j7);
    }

    public void f(String str, d dVar) {
        i.e(dVar, "provider");
        z4.a aVar = (z4.a) this.f8655a;
        synchronized (aVar.f9172c) {
            if (aVar.f9173d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f9173d.put(str, dVar);
        }
    }

    public void g() {
        if (!((z4.a) this.f8655a).f9177h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = (a) this.f8656b;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f8656b = aVar;
        try {
            l.class.getDeclaredConstructor(null);
            a aVar2 = (a) this.f8656b;
            if (aVar2 != null) {
                aVar2.f8652a.add(l.class.getName());
            }
        } catch (NoSuchMethodException e8) {
            throw new IllegalArgumentException("Class " + l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
        }
    }

    public e(p6.c cVar, u0.c cVar2) {
        this.f8655a = cVar;
        this.f8656b = cVar2;
    }
}
