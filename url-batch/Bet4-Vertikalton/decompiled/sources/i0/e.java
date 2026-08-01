package i0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0072m;
import androidx.lifecycle.t;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2534a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2535b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2536c;

    public e(f fVar) {
        this.f2534a = fVar;
    }

    public final void a() {
        f fVar = this.f2534a;
        t d = fVar.d();
        if (d.f1490c != EnumC0072m.f1481b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        d.a(new C0141a(0, fVar));
        d dVar = this.f2535b;
        dVar.getClass();
        if (dVar.f2529a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        d.a(new a.e(2, dVar));
        dVar.f2529a = true;
        this.f2536c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2536c) {
            a();
        }
        t d = this.f2534a.d();
        if (d.f1490c.compareTo(EnumC0072m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d.f1490c).toString());
        }
        d dVar = this.f2535b;
        if (!dVar.f2529a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f2530b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f2532e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f2530b = true;
    }

    public final void c(Bundle bundle) {
        d1.d.e(bundle, "outBundle");
        d dVar = this.f2535b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f2532e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) dVar.d;
        fVar.getClass();
        n.d dVar2 = new n.d(fVar);
        fVar.f3201c.put(dVar2, Boolean.FALSE);
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
