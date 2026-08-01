package h0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0070m;
import androidx.lifecycle.t;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2511a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2512b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2513c;

    public e(f fVar) {
        this.f2511a = fVar;
    }

    public final void a() {
        f fVar = this.f2511a;
        t d = fVar.d();
        if (d.f1476c != EnumC0070m.f1467b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        d.a(new C0136a(0, fVar));
        d dVar = this.f2512b;
        dVar.getClass();
        if (dVar.f2506a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        d.a(new a.e(2, dVar));
        dVar.f2506a = true;
        this.f2513c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2513c) {
            a();
        }
        t d = this.f2511a.d();
        if (d.f1476c.compareTo(EnumC0070m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d.f1476c).toString());
        }
        d dVar = this.f2512b;
        if (!dVar.f2506a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f2507b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f2509e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f2507b = true;
    }

    public final void c(Bundle bundle) {
        e1.d.e(bundle, "outBundle");
        d dVar = this.f2512b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f2509e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) dVar.d;
        fVar.getClass();
        n.d dVar2 = new n.d(fVar);
        fVar.f3196c.put(dVar2, Boolean.FALSE);
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
