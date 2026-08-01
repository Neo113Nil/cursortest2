package z0;

import android.util.Log;
import androidx.fragment.app.k0;
import androidx.fragment.app.u;
import i3.d;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4126a = b.f4125a;

    public static b a(u uVar) {
        while (uVar != null) {
            if (uVar.f660x != null && uVar.f652p) {
                uVar.j();
            }
            uVar = uVar.f662z;
        }
        return f4126a;
    }

    public static void b(a aVar) {
        if (k0.H(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f4124f.getClass().getName()), aVar);
        }
    }

    public static final void c(u uVar, String str) {
        d.e(uVar, "fragment");
        d.e(str, "previousFragmentId");
        b(new a(uVar, "Attempting to reuse fragment " + uVar + " with previous ID " + str));
        a(uVar).getClass();
    }
}
