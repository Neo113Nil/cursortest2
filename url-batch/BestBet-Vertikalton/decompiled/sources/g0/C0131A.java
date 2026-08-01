package g0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131A extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((P) ((Observable) this).mObservers.get(size)).f2751a;
            recyclerView.k(null);
            recyclerView.f1976e0.f2763f = true;
            recyclerView.W(true);
            if (!recyclerView.f1975e.f()) {
                recyclerView.requestLayout();
            }
        }
    }
}
