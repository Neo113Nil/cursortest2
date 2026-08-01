package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class r10 implements u10 {
    public final v10 a;
    public boolean b;
    public Bundle c;
    public final d50 d;

    public r10(v10 v10Var, r90 r90Var) {
        v10Var.getClass();
        this.a = v10Var;
        this.d = new d50(new jn(2, r90Var));
    }

    @Override // defpackage.u10
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((s10) this.d.a()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((q10) entry.getValue()).e.a();
            if (!op.d(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a != null) {
            bundle.putAll(a);
        }
        this.c = bundle;
        this.b = true;
    }
}
