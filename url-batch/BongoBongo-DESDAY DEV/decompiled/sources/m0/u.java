package m0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class u {
    public static int a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void b(ViewGroup viewGroup, boolean z2) {
        viewGroup.suppressLayout(z2);
    }
}
