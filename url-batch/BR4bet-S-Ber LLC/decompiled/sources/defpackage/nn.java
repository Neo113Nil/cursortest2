package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class nn {
    public static final mn a = mn.a;

    public static mn a(pm pmVar) {
        while (pmVar != null) {
            if (pmVar.x != null && pmVar.p) {
                pmVar.j();
            }
            pmVar = pmVar.z;
        }
        return a;
    }

    public static void b(jn jnVar) {
        if (en.G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(jnVar.f.getClass().getName()), jnVar);
        }
    }

    public static final void c(pm pmVar, String str) {
        str.getClass();
        b(new jn(pmVar, "Attempting to reuse fragment " + pmVar + " with previous ID " + str));
        a(pmVar).getClass();
    }
}
