package h0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0069m;
import androidx.lifecycle.t;
import java.util.Map;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0134f f2373a;

    /* renamed from: b, reason: collision with root package name */
    public final C0132d f2374b = new C0132d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2375c;

    public C0133e(InterfaceC0134f interfaceC0134f) {
        this.f2373a = interfaceC0134f;
    }

    public final void a() {
        InterfaceC0134f interfaceC0134f = this.f2373a;
        t d = interfaceC0134f.d();
        if (d.f1368c != EnumC0069m.f1359b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        d.a(new C0129a(0, interfaceC0134f));
        C0132d c0132d = this.f2374b;
        c0132d.getClass();
        if (c0132d.f2368a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        d.a(new a.e(2, c0132d));
        c0132d.f2368a = true;
        this.f2375c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2375c) {
            a();
        }
        t d = this.f2373a.d();
        if (d.f1368c.compareTo(EnumC0069m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d.f1368c).toString());
        }
        C0132d c0132d = this.f2374b;
        if (!c0132d.f2368a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0132d.f2369b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0132d.f2371e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0132d.f2369b = true;
    }

    public final void c(Bundle bundle) {
        X0.e.e(bundle, "outBundle");
        C0132d c0132d = this.f2374b;
        c0132d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0132d.f2371e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) c0132d.d;
        fVar.getClass();
        n.d dVar = new n.d(fVar);
        fVar.f3258c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0131c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
