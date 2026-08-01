package c1;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import java.util.Map;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f1003a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1004b = new d();
    public boolean c;

    public e(f fVar) {
        this.f1003a = fVar;
    }

    public final void a() {
        f fVar = this.f1003a;
        t f4 = fVar.f();
        if (f4.c != m.g) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        f4.a(new Recreator(fVar));
        d dVar = this.f1004b;
        dVar.getClass();
        if (dVar.f998a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        f4.a(new androidx.activity.e(2, dVar));
        dVar.f998a = true;
        this.c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.c) {
            a();
        }
        t f4 = this.f1003a.f();
        if (f4.c.compareTo(m.f591i) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + f4.c).toString());
        }
        d dVar = this.f1004b;
        if (!dVar.f998a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f999b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f1001e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f999b = true;
    }

    public final void c(Bundle bundle) {
        d dVar = this.f1004b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f1001e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.f fVar = (m.f) dVar.f1000d;
        fVar.getClass();
        m.d dVar2 = new m.d(fVar);
        fVar.h.put(dVar2, Boolean.FALSE);
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
