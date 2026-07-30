package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import k0.C0593d;
import k0.InterfaceC0592c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class P implements InterfaceC0592c {

    /* renamed from: a, reason: collision with root package name */
    public final C0593d f3872a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3873b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f3874c;

    /* renamed from: d, reason: collision with root package name */
    public final R5.q f3875d;

    public P(C0593d savedStateRegistry, c0 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f3872a = savedStateRegistry;
        this.f3875d = R5.i.b(new P.V(2, viewModelStoreOwner));
    }

    @Override // k0.InterfaceC0592c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3874c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((Q) this.f3875d.getValue()).f3876a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a7 = ((L) entry.getValue()).f3865e.a();
            if (!Intrinsics.a(a7, Bundle.EMPTY)) {
                bundle.putBundle(str, a7);
            }
        }
        this.f3873b = false;
        return bundle;
    }

    public final void b() {
        if (this.f3873b) {
            return;
        }
        Bundle a7 = this.f3872a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3874c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a7 != null) {
            bundle.putAll(a7);
        }
        this.f3874c = bundle;
        this.f3873b = true;
    }
}
