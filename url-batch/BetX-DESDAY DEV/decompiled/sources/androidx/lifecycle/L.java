package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class L implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final g0.d f1459a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1460b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1461c;

    /* renamed from: d, reason: collision with root package name */
    public final N0.e f1462d;

    public L(g0.d dVar, V v2) {
        X0.f.e(dVar, "savedStateRegistry");
        this.f1459a = dVar;
        this.f1462d = new N0.e(new K(0, v2));
    }

    @Override // g0.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1461c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((M) this.f1462d.a()).f1463b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((G) entry.getValue()).f1450e.a();
            if (!X0.f.a(a2, Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.f1460b = false;
        return bundle;
    }

    public final void b() {
        if (this.f1460b) {
            return;
        }
        Bundle a2 = this.f1459a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1461c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a2 != null) {
            bundle.putAll(a2);
        }
        this.f1461c = bundle;
        this.f1460b = true;
    }
}
