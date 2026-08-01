package h0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0072m;
import androidx.lifecycle.t;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2485a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2486b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2487c;

    public e(f fVar) {
        this.f2485a = fVar;
    }

    public final void a() {
        f fVar = this.f2485a;
        t d = fVar.d();
        if (d.f1448c != EnumC0072m.f1439b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        d.a(new a(0, fVar));
        d dVar = this.f2486b;
        dVar.getClass();
        if (dVar.f2480a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        d.a(new a.e(2, dVar));
        dVar.f2480a = true;
        this.f2487c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2487c) {
            a();
        }
        t d = this.f2485a.d();
        if (d.f1448c.compareTo(EnumC0072m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d.f1448c).toString());
        }
        d dVar = this.f2486b;
        if (!dVar.f2480a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f2481b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f2483e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f2481b = true;
    }

    public final void c(Bundle bundle) {
        b1.d.e(bundle, "outBundle");
        d dVar = this.f2486b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f2483e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) dVar.d;
        fVar.getClass();
        n.d dVar2 = new n.d(fVar);
        fVar.f3316c.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
