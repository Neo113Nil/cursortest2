package x0;

import android.os.Bundle;
import androidx.activity.C0463e;
import androidx.lifecycle.AbstractC0508p;
import androidx.lifecycle.C0515x;
import androidx.lifecycle.EnumC0507o;
import androidx.savedstate.Recreator;
import java.util.Map;
import o.C4821d;
import o.C4823f;

/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5203d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5204e f41772a;

    /* renamed from: b, reason: collision with root package name */
    public final C5202c f41773b = new C5202c();

    /* renamed from: c, reason: collision with root package name */
    public boolean f41774c;

    public C5203d(InterfaceC5204e interfaceC5204e) {
        this.f41772a = interfaceC5204e;
    }

    public final void a() {
        InterfaceC5204e interfaceC5204e = this.f41772a;
        AbstractC0508p lifecycle = interfaceC5204e.getLifecycle();
        if (((C0515x) lifecycle).f5290d != EnumC0507o.f5277u) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(interfaceC5204e));
        C5202c c5202c = this.f41773b;
        c5202c.getClass();
        if (c5202c.f41767b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new C0463e(2, c5202c));
        c5202c.f41767b = true;
        this.f41774c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f41774c) {
            a();
        }
        C0515x c0515x = (C0515x) this.f41772a.getLifecycle();
        if (c0515x.f5290d.compareTo(EnumC0507o.f5279w) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0515x.f5290d).toString());
        }
        C5202c c5202c = this.f41773b;
        if (!c5202c.f41767b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c5202c.f41769d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c5202c.f41768c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c5202c.f41769d = true;
    }

    public final void c(Bundle bundle) {
        C5202c c5202c = this.f41773b;
        c5202c.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c5202c.f41768c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C4823f c4823f = c5202c.f41766a;
        c4823f.getClass();
        C4821d c4821d = new C4821d(c4823f);
        c4823f.f39672v.put(c4821d, Boolean.FALSE);
        while (c4821d.hasNext()) {
            Map.Entry entry = (Map.Entry) c4821d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC5201b) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
