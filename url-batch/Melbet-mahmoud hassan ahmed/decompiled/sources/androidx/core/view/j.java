package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class j {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(i.c.Q);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && h.g(viewGroup) == null) ? false : true;
    }
}
