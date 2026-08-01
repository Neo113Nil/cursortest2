package y0;

import android.util.Log;
import androidx.fragment.app.k0;
import androidx.fragment.app.u;
import f3.d;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3779a = b.f3778a;

    public static b a(u uVar) {
        while (uVar != null) {
            if (uVar.f552x != null && uVar.f544p) {
                uVar.j();
            }
            uVar = uVar.f554z;
        }
        return f3779a;
    }

    public static void b(a aVar) {
        if (k0.E(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f3777f.getClass().getName()), aVar);
        }
    }

    public static final void c(u uVar, String str) {
        d.e(str, "previousFragmentId");
        b(new a(uVar, "Attempting to reuse fragment " + uVar + " with previous ID " + str));
        a(uVar).getClass();
    }
}
