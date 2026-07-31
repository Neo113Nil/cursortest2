package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class Q implements u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final u1.e f3990a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3991b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f3992c;

    /* renamed from: d, reason: collision with root package name */
    public final L1.o f3993d;

    public Q(u1.e eVar, b0 b0Var) {
        Z1.i.f(eVar, "savedStateRegistry");
        this.f3990a = eVar;
        this.f3993d = I2.d.F(new A2.l(16, b0Var));
    }

    @Override // u1.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3992c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((S) this.f3993d.getValue()).f3994b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a3 = ((M) entry.getValue()).f3982e.a();
            if (!Z1.i.a(a3, Bundle.EMPTY)) {
                bundle.putBundle(str, a3);
            }
        }
        this.f3991b = false;
        return bundle;
    }

    public final void b() {
        if (this.f3991b) {
            return;
        }
        Bundle a3 = this.f3990a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3992c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a3 != null) {
            bundle.putAll(a3);
        }
        this.f3992c = bundle;
        this.f3991b = true;
    }
}
