package defpackage;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandlesVM;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ob0 implements qb0 {
    public final i5 a;
    public boolean b;
    public Bundle c;
    public final wg0 d;

    public ob0(i5 i5Var, tm0 tm0Var) {
        i5Var.getClass();
        this.a = i5Var;
        this.d = new wg0(new h2(8, tm0Var));
    }

    @Override // defpackage.qb0
    public final Bundle a() {
        Bundle j = bi.j((k50[]) Arrays.copyOf(new k50[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            j.putAll(bundle);
        }
        for (Map.Entry<String, lb0> entry : ((SavedStateHandlesVM) this.d.getValue()).getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle a = ((rd) entry.getValue().a.f).a();
            if (!a.isEmpty()) {
                key.getClass();
                j.putBundle(key, a);
            }
        }
        this.b = false;
        return j;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle g = this.a.g("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle j = bi.j((k50[]) Arrays.copyOf(new k50[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            j.putAll(bundle);
        }
        if (g != null) {
            j.putAll(g);
        }
        this.c = j;
        this.b = true;
    }
}
