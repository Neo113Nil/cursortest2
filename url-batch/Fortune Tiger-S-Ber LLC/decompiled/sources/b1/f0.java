package b1;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b(int i4) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((v0) ((Observable) this).mObservers.get(size)).f934a;
            recyclerView.i(null);
            b bVar = recyclerView.f635i;
            ArrayList arrayList = (ArrayList) bVar.f733b;
            arrayList.add(bVar.m(null, 4, i4, 1));
            bVar.f732a |= 4;
            if (arrayList.size() == 1) {
                int[] iArr = RecyclerView.D0;
                if (recyclerView.f665x && recyclerView.f663w) {
                    b0 b0Var = recyclerView.f643m;
                    WeakHashMap weakHashMap = k0.j0.f2752a;
                    recyclerView.postOnAnimation(b0Var);
                } else {
                    recyclerView.E = true;
                    recyclerView.requestLayout();
                }
            }
        }
    }
}
