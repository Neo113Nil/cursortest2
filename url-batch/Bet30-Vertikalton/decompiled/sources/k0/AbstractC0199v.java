package k0;

import android.view.ViewGroup;

/* renamed from: k0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0199v {
    public static int a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void b(ViewGroup viewGroup, boolean z2) {
        viewGroup.suppressLayout(z2);
    }
}
