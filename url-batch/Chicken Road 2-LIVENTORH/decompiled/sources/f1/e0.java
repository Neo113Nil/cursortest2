package f1;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((u0) ((Observable) this).mObservers.get(size)).f1510a;
            recyclerView.i(null);
            b bVar = recyclerView.i;
            ArrayList arrayList = (ArrayList) bVar.f1304c;
            arrayList.add(bVar.l(null, 4, i, 1));
            bVar.f1302a |= 4;
            if (arrayList.size() == 1) {
                int[] iArr = RecyclerView.D0;
                if (recyclerView.f697x && recyclerView.f695w) {
                    a0 a0Var = recyclerView.f675m;
                    WeakHashMap weakHashMap = n0.l0.f2757a;
                    recyclerView.postOnAnimation(a0Var);
                } else {
                    recyclerView.E = true;
                    recyclerView.requestLayout();
                }
            }
        }
    }
}
