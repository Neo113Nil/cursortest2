package k0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0250p;
import androidx.lifecycle.C0258y;
import androidx.lifecycle.EnumC0249o;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p.C0814d;
import p.C0816f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f6028a;

    /* renamed from: b, reason: collision with root package name */
    public final C0593d f6029b = new C0593d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f6030c;

    public e(f fVar) {
        this.f6028a = fVar;
    }

    public final void a() {
        f fVar = this.f6028a;
        AbstractC0250p lifecycle = fVar.getLifecycle();
        if (((C0258y) lifecycle).f3922d != EnumC0249o.f3907e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C0590a(fVar));
        C0593d c0593d = this.f6029b;
        c0593d.getClass();
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (c0593d.f6023b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new d.e(2, c0593d));
        c0593d.f6023b = true;
        this.f6030c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f6030c) {
            a();
        }
        C0258y c0258y = (C0258y) this.f6028a.getLifecycle();
        if (c0258y.f3922d.a(EnumC0249o.f3909l)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0258y.f3922d).toString());
        }
        C0593d c0593d = this.f6029b;
        if (!c0593d.f6023b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0593d.f6025d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0593d.f6024c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0593d.f6025d = true;
    }

    public final void c(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        C0593d c0593d = this.f6029b;
        c0593d.getClass();
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0593d.f6024c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C0816f c0816f = c0593d.f6022a;
        c0816f.getClass();
        C0814d c0814d = new C0814d(c0816f);
        c0816f.f7149i.put(c0814d, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(c0814d, "this.components.iteratorWithAdditions()");
        while (c0814d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0814d.next();
            bundle.putBundle((String) entry.getKey(), ((InterfaceC0592c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}
