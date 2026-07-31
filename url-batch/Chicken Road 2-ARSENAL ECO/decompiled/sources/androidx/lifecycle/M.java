package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import k5.C0481k;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class M implements T.e {

    /* renamed from: a, reason: collision with root package name */
    public final T.f f3478a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3479b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f3480c;

    /* renamed from: d, reason: collision with root package name */
    public final C0481k f3481d;

    public M(T.f savedStateRegistry, Y y) {
        kotlin.jvm.internal.i.e(savedStateRegistry, "savedStateRegistry");
        this.f3478a = savedStateRegistry;
        this.f3481d = AbstractC0521b.x(new Q.m(4, y));
    }

    @Override // T.e
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3480c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : b().f3482a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a7 = ((I) entry.getValue()).f3471e.a();
            if (!kotlin.jvm.internal.i.a(a7, Bundle.EMPTY)) {
                bundle.putBundle(str, a7);
            }
        }
        this.f3479b = false;
        return bundle;
    }

    public final N b() {
        return (N) this.f3481d.getValue();
    }

    public final void c() {
        if (this.f3479b) {
            return;
        }
        Bundle a7 = this.f3478a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3480c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a7 != null) {
            bundle.putAll(a7);
        }
        this.f3480c = bundle;
        this.f3479b = true;
        b();
    }
}
