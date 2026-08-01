package g0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0082o;
import androidx.lifecycle.C0088v;
import androidx.lifecycle.EnumC0081n;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2614a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2615b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2616c;

    public e(f fVar) {
        this.f2614a = fVar;
    }

    public final void a() {
        f fVar = this.f2614a;
        AbstractC0082o lifecycle = fVar.getLifecycle();
        if (((C0088v) lifecycle).f1499c != EnumC0081n.f1489b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C0163a(0, fVar));
        d dVar = this.f2615b;
        dVar.getClass();
        if (dVar.f2609b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new a.e(2, dVar));
        dVar.f2609b = true;
        this.f2616c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2616c) {
            a();
        }
        C0088v c0088v = (C0088v) this.f2614a.getLifecycle();
        if (c0088v.f1499c.compareTo(EnumC0081n.f1491d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0088v.f1499c).toString());
        }
        d dVar = this.f2615b;
        if (!dVar.f2609b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f2611d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f2610c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f2611d = true;
    }

    public final void c(Bundle bundle) {
        X0.f.e(bundle, "outBundle");
        d dVar = this.f2615b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = dVar.f2610c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = dVar.f2608a;
        fVar.getClass();
        n.d dVar2 = new n.d(fVar);
        fVar.f3626c.put(dVar2, Boolean.FALSE);
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
