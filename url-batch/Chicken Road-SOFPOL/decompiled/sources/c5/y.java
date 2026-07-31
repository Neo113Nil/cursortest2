package c5;

import android.view.ViewGroup;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class y {
    public static int a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void b(ViewGroup viewGroup, boolean z3) {
        viewGroup.suppressLayout(z3);
    }
}
