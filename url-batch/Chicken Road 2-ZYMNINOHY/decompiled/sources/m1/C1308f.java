package m1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0231j;
import androidx.lifecycle.C0237p;
import androidx.lifecycle.EnumC0230i;
import b.C0244e;
import java.util.Map;
import m.C1276d;
import m.C1278f;

/* renamed from: m1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1308f {

    /* renamed from: a, reason: collision with root package name */
    public final g f14494a;

    /* renamed from: b, reason: collision with root package name */
    public final C1307e f14495b = new C1307e();

    /* renamed from: c, reason: collision with root package name */
    public boolean f14496c;

    public C1308f(g gVar) {
        this.f14494a = gVar;
    }

    public final void a() {
        g gVar = this.f14494a;
        AbstractC0231j lifecycle = gVar.getLifecycle();
        if (((C0237p) lifecycle).f5052c != EnumC0230i.f5042b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C1304b(0, gVar));
        C1307e c1307e = this.f14495b;
        c1307e.getClass();
        if (c1307e.f14489b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new C0244e(2, c1307e));
        c1307e.f14489b = true;
        this.f14496c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f14496c) {
            a();
        }
        C0237p c0237p = (C0237p) this.f14494a.getLifecycle();
        if (c0237p.f5052c.compareTo(EnumC0230i.f5044d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0237p.f5052c).toString());
        }
        C1307e c1307e = this.f14495b;
        if (!c1307e.f14489b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c1307e.f14491d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c1307e.f14490c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c1307e.f14491d = true;
    }

    public final void c(Bundle bundle) {
        C1307e c1307e = this.f14495b;
        c1307e.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c1307e.f14490c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1278f c1278f = c1307e.f14488a;
        c1278f.getClass();
        C1276d c1276d = new C1276d(c1278f);
        c1278f.f14290c.put(c1276d, Boolean.FALSE);
        while (c1276d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1276d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC1306d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
