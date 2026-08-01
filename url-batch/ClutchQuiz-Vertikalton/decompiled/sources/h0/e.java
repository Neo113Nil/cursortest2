package h0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0072m;
import androidx.lifecycle.v;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2579a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2580b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2581c;

    public e(f fVar) {
        this.f2579a = fVar;
    }

    public final void a() {
        f fVar = this.f2579a;
        v d = fVar.d();
        if (d.d != EnumC0072m.f1504b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        d.a(new C0141a(0, fVar));
        d dVar = this.f2580b;
        dVar.getClass();
        if (dVar.f2574a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        d.a(new a.e(2, dVar));
        dVar.f2574a = true;
        this.f2581c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2581c) {
            a();
        }
        v d = this.f2579a.d();
        if (d.d.compareTo(EnumC0072m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d.d).toString());
        }
        d dVar = this.f2580b;
        if (!dVar.f2574a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f2575b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f2577e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f2575b = true;
    }

    public final void c(Bundle bundle) {
        g1.f.e(bundle, "outBundle");
        d dVar = this.f2580b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f2577e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) dVar.d;
        fVar.getClass();
        n.d dVar2 = new n.d(fVar);
        fVar.f3114c.put(dVar2, Boolean.FALSE);
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
