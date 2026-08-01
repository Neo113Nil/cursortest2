package j0;

import a.C0060e;
import android.os.Bundle;
import androidx.lifecycle.EnumC0079m;
import androidx.lifecycle.t;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2665a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2666b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2667c;

    public e(f fVar) {
        this.f2665a = fVar;
    }

    public final void a() {
        f fVar = this.f2665a;
        t d = fVar.d();
        if (d.f1582c != EnumC0079m.f1573b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        d.a(new C0146a(0, fVar));
        d dVar = this.f2666b;
        dVar.getClass();
        if (dVar.f2660a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        d.a(new C0060e(2, dVar));
        dVar.f2660a = true;
        this.f2667c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2667c) {
            a();
        }
        t d = this.f2665a.d();
        if (d.f1582c.compareTo(EnumC0079m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d.f1582c).toString());
        }
        d dVar = this.f2666b;
        if (!dVar.f2660a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f2661b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f2663e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f2661b = true;
    }

    public final void c(Bundle bundle) {
        h1.d.e(bundle, "outBundle");
        d dVar = this.f2666b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f2663e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o.f fVar = (o.f) dVar.d;
        fVar.getClass();
        o.d dVar2 = new o.d(fVar);
        fVar.f3406c.put(dVar2, Boolean.FALSE);
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
