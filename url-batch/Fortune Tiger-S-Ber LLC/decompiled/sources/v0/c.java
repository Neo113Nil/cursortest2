package v0;

import android.util.Log;
import androidx.fragment.app.k0;
import androidx.fragment.app.u;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3579a = b.f3578a;

    public static b a(u uVar) {
        while (uVar != null) {
            if (uVar.f536x != null && uVar.f528p) {
                uVar.j();
            }
            uVar = uVar.f538z;
        }
        return f3579a;
    }

    public static void b(a aVar) {
        if (k0.G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f3577f.getClass().getName()), aVar);
        }
    }

    public static final void c(u uVar, String str) {
        u2.c.e(str, "previousFragmentId");
        b(new a(uVar, "Attempting to reuse fragment " + uVar + " with previous ID " + str));
        a(uVar).getClass();
    }
}
