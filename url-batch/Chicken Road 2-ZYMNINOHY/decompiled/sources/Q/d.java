package Q;

import android.util.Log;
import androidx.fragment.app.F;
import androidx.fragment.app.f0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2120a = c.f2119a;

    public static c a(F f4) {
        while (f4 != null) {
            if (f4.isAdded()) {
                kotlin.jvm.internal.i.d(f4.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            f4 = f4.getParentFragment();
        }
        return f2120a;
    }

    public static void b(i iVar) {
        if (f0.J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(iVar.f2122a.getClass().getName()), iVar);
        }
    }

    public static final void c(F fragment, String previousFragmentId) {
        kotlin.jvm.internal.i.e(fragment, "fragment");
        kotlin.jvm.internal.i.e(previousFragmentId, "previousFragmentId");
        b(new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).getClass();
    }
}
