package g1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1691a;

    public i1(RecyclerView recyclerView) {
        this.f1691a = recyclerView;
    }

    public final void a() {
        RecyclerView recyclerView = this.f1691a;
        if (!recyclerView.f800y || !recyclerView.f798x) {
            recyclerView.F = true;
            recyclerView.requestLayout();
        } else {
            n0 n0Var = recyclerView.f778n;
            WeakHashMap weakHashMap = n0.p0.f2816a;
            recyclerView.postOnAnimation(n0Var);
        }
    }
}
