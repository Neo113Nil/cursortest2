package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class Q implements y1.d {

    /* renamed from: a, reason: collision with root package name */
    public final y1.e f5191a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5192b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f5193c;

    /* renamed from: d, reason: collision with root package name */
    public final R1.n f5194d;

    public Q(y1.e eVar, b0 b0Var) {
        f2.j.f(eVar, "savedStateRegistry");
        this.f5191a = eVar;
        this.f5194d = R1.a.d(new A.h(18, b0Var));
    }

    @Override // y1.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5193c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((S) this.f5194d.getValue()).f5195b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a3 = ((M) entry.getValue()).f5183e.a();
            if (!f2.j.a(a3, Bundle.EMPTY)) {
                bundle.putBundle(str, a3);
            }
        }
        this.f5192b = false;
        return bundle;
    }

    public final void b() {
        if (this.f5192b) {
            return;
        }
        Bundle a3 = this.f5191a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5193c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a3 != null) {
            bundle.putAll(a3);
        }
        this.f5193c = bundle;
        this.f5192b = true;
    }
}
