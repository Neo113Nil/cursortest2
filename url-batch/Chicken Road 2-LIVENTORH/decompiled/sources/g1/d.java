package g1;

import a.f;
import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import java.util.Map;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f1702a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1703b = new c();

    /* renamed from: c, reason: collision with root package name */
    public boolean f1704c;

    public d(e eVar) {
        this.f1702a = eVar;
    }

    public final void a() {
        e eVar = this.f1702a;
        t e4 = eVar.e();
        if (e4.f630c != m.f618g) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        e4.a(new Recreator(eVar));
        c cVar = this.f1703b;
        cVar.getClass();
        if (cVar.f1697a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        e4.a(new f(2, cVar));
        cVar.f1697a = true;
        this.f1704c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f1704c) {
            a();
        }
        t e4 = this.f1702a.e();
        if (e4.f630c.compareTo(m.i) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e4.f630c).toString());
        }
        c cVar = this.f1703b;
        if (!cVar.f1697a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (cVar.f1698b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        cVar.f1700e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        cVar.f1698b = true;
    }

    public final void c(Bundle bundle) {
        c cVar = this.f1703b;
        cVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) cVar.f1700e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) cVar.d;
        fVar.getClass();
        n.d dVar = new n.d(fVar);
        fVar.f2708h.put(dVar, Boolean.FALSE);
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
