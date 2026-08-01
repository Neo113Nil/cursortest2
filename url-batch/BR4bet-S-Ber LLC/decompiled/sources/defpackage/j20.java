package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class j20 {
    public final /* synthetic */ RecyclerView a;

    public j20(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        int[] iArr = RecyclerView.D0;
        RecyclerView recyclerView = this.a;
        if (!recyclerView.x || !recyclerView.w) {
            recyclerView.E = true;
            recyclerView.requestLayout();
        } else {
            q10 q10Var = recyclerView.m;
            WeakHashMap weakHashMap = ic0.a;
            recyclerView.postOnAnimation(q10Var);
        }
    }
}
