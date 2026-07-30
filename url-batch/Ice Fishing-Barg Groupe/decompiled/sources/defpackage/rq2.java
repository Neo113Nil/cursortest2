package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.ice.fishing.grenza.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class rq2 {
    public static final /* synthetic */ int PxuCJdSBwIXG = 0;

    static {
        new WeakHashMap();
    }

    public static void PxuCJdSBwIXG(View view, ns2 ns2Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(ns2Var != null ? new us2(ns2Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = ss2.e9gEMXR7LXtO;
        View.OnApplyWindowInsetsListener rs2Var = ns2Var != null ? new rs2(view, ns2Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, rs2Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(rs2Var);
        }
    }
}
