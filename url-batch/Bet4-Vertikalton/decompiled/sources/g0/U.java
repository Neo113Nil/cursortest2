package g0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2302a;

    public U(RecyclerView recyclerView) {
        this.f2302a = recyclerView;
    }

    public final void a() {
        boolean z2 = RecyclerView.E0;
        RecyclerView recyclerView = this.f2302a;
        if (z2 && recyclerView.f1591t && recyclerView.f1589s) {
            WeakHashMap weakHashMap = K.T.f423a;
            recyclerView.postOnAnimation(recyclerView.i);
        } else {
            recyclerView.f1536A = true;
            recyclerView.requestLayout();
        }
    }
}
