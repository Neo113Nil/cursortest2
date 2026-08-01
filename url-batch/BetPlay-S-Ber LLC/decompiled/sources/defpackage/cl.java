package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class cl {
    public static final bl a = bl.a;

    public static bl a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager().getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return a;
    }

    public static void b(ka0 ka0Var) {
        if (n.G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(ka0Var.f.getClass().getName()), ka0Var);
        }
    }

    public static final void c(Fragment fragment, String str) {
        str.getClass();
        b(new al(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str));
        a(fragment).getClass();
    }
}
