package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class gz {
    public final /* synthetic */ RecyclerView a;

    public gz(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        int[] iArr = RecyclerView.E0;
        RecyclerView recyclerView = this.a;
        if (!recyclerView.x || !recyclerView.w) {
            recyclerView.E = true;
            recyclerView.requestLayout();
        } else {
            ny nyVar = recyclerView.m;
            WeakHashMap weakHashMap = x80.a;
            recyclerView.postOnAnimation(nyVar);
        }
    }
}
