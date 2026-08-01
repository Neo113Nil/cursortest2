package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class q80 {
    public final /* synthetic */ RecyclerView a;

    public q80(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        int[] iArr = RecyclerView.E0;
        RecyclerView recyclerView = this.a;
        if (!recyclerView.x || !recyclerView.w) {
            recyclerView.E = true;
            recyclerView.requestLayout();
        } else {
            v70 v70Var = recyclerView.m;
            WeakHashMap weakHashMap = hm0.a;
            recyclerView.postOnAnimation(v70Var);
        }
    }
}
