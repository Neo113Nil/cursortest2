package defpackage;

import android.os.Bundle;
import androidx.lifecycle.a;
import androidx.savedstate.Recreator;
import java.util.Map;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class f10 {
    public final g10 a;
    public final i3 b = new i3();
    public boolean c;

    public f10(g10 g10Var) {
        this.a = g10Var;
    }

    public final void a() {
        g10 g10Var = this.a;
        a e = g10Var.e();
        if (e.c != vp.g) {
            t8.t("Restarter must be created only during owner's initialization stage");
            return;
        }
        e.a(new Recreator(g10Var));
        i3 i3Var = this.b;
        i3Var.getClass();
        if (i3Var.c) {
            t8.t("SavedStateRegistry was already attached.");
            return;
        }
        e.a(new pb(2, i3Var));
        i3Var.c = true;
        this.c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.c) {
            a();
        }
        a e = this.a.e();
        if (e.c.compareTo(vp.i) >= 0) {
            t8.s(e.c, "performRestore cannot be called when owner is ");
            return;
        }
        i3 i3Var = this.b;
        if (!i3Var.c) {
            t8.t("You must call performAttach() before calling performRestore(Bundle).");
        } else if (i3Var.d) {
            t8.t("SavedStateRegistry was already restored.");
        } else {
            i3Var.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            i3Var.d = true;
        }
    }

    public final void c(Bundle bundle) {
        i3 i3Var = this.b;
        i3Var.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) i3Var.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        z00 z00Var = (z00) i3Var.f;
        z00Var.getClass();
        x00 x00Var = new x00(z00Var);
        z00Var.h.put(x00Var, Boolean.FALSE);
        while (x00Var.hasNext()) {
            Map.Entry entry = (Map.Entry) x00Var.next();
            bundle2.putBundle((String) entry.getKey(), ((e10) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
