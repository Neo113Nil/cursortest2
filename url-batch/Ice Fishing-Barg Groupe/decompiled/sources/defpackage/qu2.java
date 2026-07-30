package defpackage;

import android.view.View;
import com.ice.fishing.grenza.R;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class qu2 {
    public static final v81 PxuCJdSBwIXG;

    static {
        long[] jArr = c02.PxuCJdSBwIXG;
        PxuCJdSBwIXG = new v81();
    }

    public static final up PxuCJdSBwIXG(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof up) {
            return (up) tag;
        }
        return null;
    }
}
