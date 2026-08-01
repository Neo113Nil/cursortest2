package j0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0072m;
import androidx.lifecycle.v;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f3083a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3084b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3085c;

    public e(f fVar) {
        this.f3083a = fVar;
    }

    public final void a() {
        f fVar = this.f3083a;
        v e2 = fVar.e();
        if (e2.d != EnumC0072m.f1885b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        e2.a(new C0167a(0, fVar));
        d dVar = this.f3084b;
        dVar.getClass();
        if (dVar.f3078a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        e2.a(new a.e(2, dVar));
        dVar.f3078a = true;
        this.f3085c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f3085c) {
            a();
        }
        v e2 = this.f3083a.e();
        if (e2.d.compareTo(EnumC0072m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e2.d).toString());
        }
        d dVar = this.f3084b;
        if (!dVar.f3078a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f3079b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f3081e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f3079b = true;
    }

    public final void c(Bundle bundle) {
        k1.e.e(bundle, "outBundle");
        d dVar = this.f3084b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f3081e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) dVar.d;
        fVar.getClass();
        n.d dVar2 = new n.d(fVar);
        fVar.f3553c.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0169c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
