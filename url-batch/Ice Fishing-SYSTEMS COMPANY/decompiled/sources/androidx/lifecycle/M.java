package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import q7.C4942k;
import x0.C5202c;
import x0.InterfaceC5201b;

/* loaded from: classes.dex */
public final class M implements InterfaceC5201b {

    /* renamed from: a, reason: collision with root package name */
    public final C5202c f5239a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5240b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f5241c;

    /* renamed from: d, reason: collision with root package name */
    public final C4942k f5242d;

    public M(C5202c savedStateRegistry, Y y6) {
        kotlin.jvm.internal.h.e(savedStateRegistry, "savedStateRegistry");
        this.f5239a = savedStateRegistry;
        this.f5242d = com.bumptech.glide.e.q(new X.r(3, y6));
    }

    @Override // x0.InterfaceC5201b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5241c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((N) this.f5242d.getValue()).f5243a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a9 = ((K) entry.getValue()).f5231e.a();
            if (!kotlin.jvm.internal.h.a(a9, Bundle.EMPTY)) {
                bundle.putBundle(str, a9);
            }
        }
        this.f5240b = false;
        return bundle;
    }

    public final void b() {
        if (this.f5240b) {
            return;
        }
        Bundle a9 = this.f5239a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5241c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a9 != null) {
            bundle.putAll(a9);
        }
        this.f5241c = bundle;
        this.f5240b = true;
    }
}
