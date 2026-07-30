package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s0 implements x3.d {

    /* renamed from: a, reason: collision with root package name */
    public final x3.e f1028a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1029b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1030c;

    /* renamed from: d, reason: collision with root package name */
    public final d6.o f1031d;

    public s0(x3.e eVar, c1 c1Var) {
        r6.k.f(eVar, "savedStateRegistry");
        this.f1028a = eVar;
        this.f1031d = d6.a.d(new r0(0, c1Var));
    }

    @Override // x3.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1030c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((t0) this.f1031d.getValue()).f1032b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a3 = ((n0) entry.getValue()).f1006e.a();
            if (!r6.k.a(a3, Bundle.EMPTY)) {
                bundle.putBundle(str, a3);
            }
        }
        this.f1029b = false;
        return bundle;
    }

    public final void b() {
        if (this.f1029b) {
            return;
        }
        Bundle a3 = this.f1028a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1030c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a3 != null) {
            bundle.putAll(a3);
        }
        this.f1030c = bundle;
        this.f1029b = true;
    }
}
