package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public enum se0 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static se0 from(int i) {
        if (i == 0) {
            return VISIBLE;
        }
        if (i == 4) {
            return INVISIBLE;
        }
        if (i == 8) {
            return GONE;
        }
        s9.k(r7.b("Unknown visibility ", i));
        return null;
    }

    public void applyState(View view) {
        int i = pe0.a[ordinal()];
        if (i == 1) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (c.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i == 2) {
            if (c.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (i == 3) {
            if (c.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i != 4) {
            return;
        }
        if (c.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static se0 from(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return INVISIBLE;
        }
        return from(view.getVisibility());
    }
}
