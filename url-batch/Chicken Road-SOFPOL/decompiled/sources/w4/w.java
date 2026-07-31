package w4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f8055a;

    public /* synthetic */ w(RecyclerView recyclerView) {
        this.f8055a = recyclerView;
    }

    public void a(int i) {
        RecyclerView recyclerView = this.f8055a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
