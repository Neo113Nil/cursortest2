package f1;

import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class x {
    public static int a(ViewGroup viewGroup, int i4) {
        return viewGroup.getChildDrawingOrder(i4);
    }

    public static void b(ViewGroup viewGroup, boolean z3) {
        viewGroup.suppressLayout(z3);
    }
}
