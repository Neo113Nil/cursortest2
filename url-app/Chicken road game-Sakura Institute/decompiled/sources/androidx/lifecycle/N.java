package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import v1.C1248e;
import v1.InterfaceC1247d;
import y2.C1336k;
import y2.InterfaceC1335j;

/* loaded from: classes.dex */
public final class N implements InterfaceC1247d {

    /* renamed from: a, reason: collision with root package name */
    public final C1248e f5445a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5446b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f5447c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1335j f5448d;

    public N(C1248e savedStateRegistry, Z viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f5445a = savedStateRegistry;
        this.f5448d = C1336k.a(new A3.e(12, viewModelStoreOwner));
    }

    @Override // v1.InterfaceC1247d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5447c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((O) this.f5448d.getValue()).f5449b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a4 = ((J) entry.getValue()).f5438e.a();
            if (!Intrinsics.a(a4, Bundle.EMPTY)) {
                bundle.putBundle(str, a4);
            }
        }
        this.f5446b = false;
        return bundle;
    }

    public final void b() {
        if (this.f5446b) {
            return;
        }
        Bundle a4 = this.f5445a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5447c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a4 != null) {
            bundle.putAll(a4);
        }
        this.f5447c = bundle;
        this.f5446b = true;
    }
}
