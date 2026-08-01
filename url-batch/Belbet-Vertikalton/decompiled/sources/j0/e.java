package j0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0078m;
import androidx.lifecycle.v;
import b.C0092e;
import j1.h;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f3166a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3167b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3168c;

    public e(f fVar) {
        this.f3166a = fVar;
    }

    public final void a() {
        f fVar = this.f3166a;
        v e = fVar.e();
        if (e.f1949d != EnumC0078m.f1935b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        e.a(new C0196a(0, fVar));
        d dVar = this.f3167b;
        dVar.getClass();
        if (dVar.f3161a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        e.a(new C0092e(2, dVar));
        dVar.f3161a = true;
        this.f3168c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f3168c) {
            a();
        }
        v e = this.f3166a.e();
        if (e.f1949d.compareTo(EnumC0078m.f1937d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e.f1949d).toString());
        }
        d dVar = this.f3167b;
        if (!dVar.f3161a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f3162b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f3162b = true;
    }

    public final void c(Bundle bundle) {
        h.e(bundle, "outBundle");
        d dVar = this.f3167b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        p.f fVar = (p.f) dVar.f3164d;
        fVar.getClass();
        p.d dVar2 = new p.d(fVar);
        fVar.f3787c.put(dVar2, Boolean.FALSE);
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
