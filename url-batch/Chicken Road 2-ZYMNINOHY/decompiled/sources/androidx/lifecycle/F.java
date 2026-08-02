package androidx.lifecycle;

import android.os.Bundle;
import c3.C0295g;
import java.util.Map;
import m1.C1307e;
import m1.InterfaceC1306d;

/* loaded from: classes.dex */
public final class F implements InterfaceC1306d {

    /* renamed from: a, reason: collision with root package name */
    public final C1307e f5017a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5018b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f5019c;

    /* renamed from: d, reason: collision with root package name */
    public final C0295g f5020d;

    public F(C1307e savedStateRegistry, P p2) {
        kotlin.jvm.internal.i.e(savedStateRegistry, "savedStateRegistry");
        this.f5017a = savedStateRegistry;
        this.f5020d = new C0295g(new G3.k(5, p2));
    }

    @Override // m1.InterfaceC1306d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5019c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((G) this.f5020d.a()).f5021d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a3 = ((B) entry.getValue()).f5010e.a();
            if (!kotlin.jvm.internal.i.a(a3, Bundle.EMPTY)) {
                bundle.putBundle(str, a3);
            }
        }
        this.f5018b = false;
        return bundle;
    }

    public final void b() {
        if (this.f5018b) {
            return;
        }
        Bundle a3 = this.f5017a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5019c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a3 != null) {
            bundle.putAll(a3);
        }
        this.f5019c = bundle;
        this.f5018b = true;
    }
}
