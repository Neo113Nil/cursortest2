package h1;

import a.f;
import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f1971a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1972b = new c();

    /* renamed from: c, reason: collision with root package name */
    public boolean f1973c;

    public d(e eVar) {
        this.f1971a = eVar;
    }

    public final void a() {
        e eVar = this.f1971a;
        t f5 = eVar.f();
        if (f5.f734c != m.f723g) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        f5.a(new Recreator(eVar));
        c cVar = this.f1972b;
        cVar.getClass();
        if (cVar.f1966a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        f5.a(new f(2, cVar));
        cVar.f1966a = true;
        this.f1973c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f1973c) {
            a();
        }
        t f5 = this.f1971a.f();
        if (f5.f734c.compareTo(m.i) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + f5.f734c).toString());
        }
        c cVar = this.f1972b;
        if (!cVar.f1966a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (cVar.f1967b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        cVar.f1969e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        cVar.f1967b = true;
    }

    public final void c(Bundle bundle) {
        c cVar = this.f1972b;
        cVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) cVar.f1969e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) cVar.d;
        fVar.getClass();
        n.d dVar = new n.d(fVar);
        fVar.h.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
