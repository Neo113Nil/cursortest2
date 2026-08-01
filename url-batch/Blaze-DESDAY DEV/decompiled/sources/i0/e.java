package i0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0073m;
import androidx.lifecycle.t;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2565a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2566b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2567c;

    public e(f fVar) {
        this.f2565a = fVar;
    }

    public final void a() {
        f fVar = this.f2565a;
        t e2 = fVar.e();
        if (e2.f1521c != EnumC0073m.f1512b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        e2.a(new C0143a(0, fVar));
        d dVar = this.f2566b;
        dVar.getClass();
        if (dVar.f2560a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        e2.a(new a.e(2, dVar));
        dVar.f2560a = true;
        this.f2567c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2567c) {
            a();
        }
        t e2 = this.f2565a.e();
        if (e2.f1521c.compareTo(EnumC0073m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e2.f1521c).toString());
        }
        d dVar = this.f2566b;
        if (!dVar.f2560a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f2561b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f2563e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f2561b = true;
    }

    public final void c(Bundle bundle) {
        g1.d.e(bundle, "outBundle");
        d dVar = this.f2566b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f2563e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) dVar.d;
        fVar.getClass();
        n.d dVar2 = new n.d(fVar);
        fVar.f3234c.put(dVar2, Boolean.FALSE);
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
