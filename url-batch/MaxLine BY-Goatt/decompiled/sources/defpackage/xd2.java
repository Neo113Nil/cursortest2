package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xd2 {
    public final yd2 a;
    public final wd2 b;

    public xd2(yd2 yd2Var) {
        this.a = yd2Var;
        this.b = new wd2(yd2Var);
    }

    public final void a(Bundle bundle) {
        yd2 yd2Var = this.a;
        zd2 zd2Var = yd2Var.a;
        if (!yd2Var.e) {
            yd2Var.a();
        }
        if (zd2Var.getLifecycle().b().compareTo(zc1.p) >= 0) {
            b71.u(zd2Var.getLifecycle().b(), "performRestore cannot be called when owner is ");
            return;
        }
        if (yd2Var.g) {
            lh.g("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = zm3.A(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        yd2Var.f = bundle2;
        yd2Var.g = true;
    }

    public final void b(Bundle bundle) {
        bundle.getClass();
        yd2 yd2Var = this.a;
        mi1.c();
        Bundle o = iv1.o((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = yd2Var.f;
        if (bundle2 != null) {
            o.putAll(bundle2);
        }
        synchronized (yd2Var.c) {
            try {
                for (Map.Entry entry : yd2Var.d.entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle a = ((vd2) entry.getValue()).a();
                    str.getClass();
                    o.putBundle(str, a);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", o);
    }
}
