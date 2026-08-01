package defpackage;

import android.os.Bundle;
import androidx.lifecycle.a;
import androidx.savedstate.Recreator;
import java.util.Map;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class w10 {
    public final x10 a;
    public final v10 b = new v10();
    public boolean c;

    public w10(x10 x10Var) {
        this.a = x10Var;
    }

    public final void a() {
        x10 x10Var = this.a;
        iq lifecycle = x10Var.getLifecycle();
        if (((a) lifecycle).c != hq.g) {
            o8.t("Restarter must be created only during owner's initialization stage");
            return;
        }
        lifecycle.a(new Recreator(x10Var));
        v10 v10Var = this.b;
        v10Var.getClass();
        if (v10Var.b) {
            o8.t("SavedStateRegistry was already attached.");
            return;
        }
        lifecycle.a(new sb(2, v10Var));
        v10Var.b = true;
        this.c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.c) {
            a();
        }
        iq lifecycle = this.a.getLifecycle();
        if (((a) lifecycle).c.compareTo(hq.i) >= 0) {
            o8.s(((a) lifecycle).c, "performRestore cannot be called when owner is ");
            return;
        }
        v10 v10Var = this.b;
        if (!v10Var.b) {
            o8.t("You must call performAttach() before calling performRestore(Bundle).");
        } else if (v10Var.d) {
            o8.t("SavedStateRegistry was already restored.");
        } else {
            v10Var.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            v10Var.d = true;
        }
    }

    public final void c(Bundle bundle) {
        bundle.getClass();
        v10 v10Var = this.b;
        v10Var.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = v10Var.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        p10 p10Var = v10Var.a;
        p10Var.getClass();
        n10 n10Var = new n10(p10Var);
        p10Var.h.put(n10Var, Boolean.FALSE);
        while (n10Var.hasNext()) {
            Map.Entry entry = (Map.Entry) n10Var.next();
            bundle2.putBundle((String) entry.getKey(), ((u10) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
