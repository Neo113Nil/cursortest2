package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class il {
    public static final hl a = hl.a;

    public static hl a(mk mkVar) {
        while (mkVar != null) {
            if (mkVar.x != null && mkVar.p) {
                mkVar.j();
            }
            mkVar = mkVar.z;
        }
        return a;
    }

    public static void b(fl flVar) {
        if (bl.G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(flVar.f.getClass().getName()), flVar);
        }
    }

    public static final void c(mk mkVar, String str) {
        str.getClass();
        b(new fl(mkVar, "Attempting to reuse fragment " + mkVar + " with previous ID " + str));
        a(mkVar).getClass();
    }
}
