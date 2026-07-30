package defpackage;

import android.view.View;
import com.feathherdashh.dashgame.R;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class hn1 {
    public static void a(View view, br0 br0Var) {
        gn1 gn1Var = br0Var != null ? new gn1(view, br0Var) : null;
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (gn1Var != null) {
            view.setOnApplyWindowInsetsListener(gn1Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
