package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class vz {
    public final /* synthetic */ RecyclerView a;

    public vz(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        int[] iArr = RecyclerView.D0;
        RecyclerView recyclerView = this.a;
        if (!recyclerView.x || !recyclerView.w) {
            recyclerView.E = true;
            recyclerView.requestLayout();
        } else {
            cz czVar = recyclerView.m;
            WeakHashMap weakHashMap = e90.a;
            recyclerView.postOnAnimation(czVar);
        }
    }
}
