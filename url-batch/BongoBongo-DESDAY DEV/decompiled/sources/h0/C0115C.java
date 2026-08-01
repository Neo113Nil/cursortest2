package h0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115C extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((S) ((Observable) this).mObservers.get(size)).f2425a;
            recyclerView.k(null);
            recyclerView.f1659e0.f2437f = true;
            recyclerView.W(true);
            if (!recyclerView.f1658e.f()) {
                recyclerView.requestLayout();
            }
        }
    }
}
