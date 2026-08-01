package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class m40 {
    public final n40 a;
    public final s3 b = new s3();
    public boolean c;

    public m40(n40 n40Var) {
        this.a = n40Var;
    }

    public final void a() {
        n40 n40Var = this.a;
        os e = n40Var.e();
        if (e.c != hs.g) {
            g9.s("Restarter must be created only during owner's initialization stage");
            return;
        }
        e.a(new p10(0, n40Var));
        s3 s3Var = this.b;
        s3Var.getClass();
        if (s3Var.c) {
            g9.s("SavedStateRegistry was already attached.");
            return;
        }
        e.a(new pc(2, s3Var));
        s3Var.c = true;
        this.c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.c) {
            a();
        }
        os e = this.a.e();
        if (e.c.compareTo(hs.i) >= 0) {
            g9.t(e.c, "performRestore cannot be called when owner is ");
            return;
        }
        s3 s3Var = this.b;
        if (!s3Var.c) {
            g9.s("You must call performAttach() before calling performRestore(Bundle).");
        } else if (s3Var.d) {
            g9.s("SavedStateRegistry was already restored.");
        } else {
            s3Var.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            s3Var.d = true;
        }
    }

    public final void c(Bundle bundle) {
        s3 s3Var = this.b;
        s3Var.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) s3Var.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        e40 e40Var = (e40) s3Var.f;
        e40Var.getClass();
        c40 c40Var = new c40(e40Var);
        e40Var.h.put(c40Var, Boolean.FALSE);
        while (c40Var.hasNext()) {
            Map.Entry entry = (Map.Entry) c40Var.next();
            bundle2.putBundle((String) entry.getKey(), ((l40) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
