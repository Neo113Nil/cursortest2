package j0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0070m;
import androidx.lifecycle.t;
import java.util.Map;
import n.C0243d;
import n.C0245f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2685a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2686b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2687c;

    public e(f fVar) {
        this.f2685a = fVar;
    }

    public final void a() {
        f fVar = this.f2685a;
        t f2 = fVar.f();
        if (f2.f1578c != EnumC0070m.f1569b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        f2.a(new C0157a(0, fVar));
        d dVar = this.f2686b;
        dVar.getClass();
        if (dVar.f2680a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        f2.a(new a.e(2, dVar));
        dVar.f2680a = true;
        this.f2687c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2687c) {
            a();
        }
        t f2 = this.f2685a.f();
        if (f2.f1578c.compareTo(EnumC0070m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + f2.f1578c).toString());
        }
        d dVar = this.f2686b;
        if (!dVar.f2680a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f2681b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f2683e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f2681b = true;
    }

    public final void c(Bundle bundle) {
        g1.d.e(bundle, "outBundle");
        d dVar = this.f2686b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f2683e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0245f c0245f = (C0245f) dVar.d;
        c0245f.getClass();
        C0243d c0243d = new C0243d(c0245f);
        c0245f.f3225c.put(c0243d, Boolean.FALSE);
        while (c0243d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0243d.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
