package h0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0071m;
import androidx.lifecycle.t;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2458a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2459b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2460c;

    public e(f fVar) {
        this.f2458a = fVar;
    }

    public final void a() {
        f fVar = this.f2458a;
        t d = fVar.d();
        if (d.f1406c != EnumC0071m.f1397b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        d.a(new C0135a(0, fVar));
        d dVar = this.f2459b;
        dVar.getClass();
        if (dVar.f2453a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        d.a(new a.e(2, dVar));
        dVar.f2453a = true;
        this.f2460c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2460c) {
            a();
        }
        t d = this.f2458a.d();
        if (d.f1406c.compareTo(EnumC0071m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d.f1406c).toString());
        }
        d dVar = this.f2459b;
        if (!dVar.f2453a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f2454b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f2456e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f2454b = true;
    }

    public final void c(Bundle bundle) {
        Z0.d.e(bundle, "outBundle");
        d dVar = this.f2459b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f2456e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) dVar.d;
        fVar.getClass();
        n.d dVar2 = new n.d(fVar);
        fVar.f3280c.put(dVar2, Boolean.FALSE);
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
