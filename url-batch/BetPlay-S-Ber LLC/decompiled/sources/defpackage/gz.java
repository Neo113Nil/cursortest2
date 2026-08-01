package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class gz extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            vz vzVar = (vz) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = vzVar.a;
            recyclerView.i(null);
            l2 l2Var = recyclerView.i;
            ArrayList arrayList = l2Var.b;
            arrayList.add(l2Var.i(null, 4, i, 1));
            l2Var.a |= 4;
            if (arrayList.size() == 1) {
                vzVar.a();
            }
        }
    }

    public final void c(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            vz vzVar = (vz) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = vzVar.a;
            recyclerView.i(null);
            l2 l2Var = recyclerView.i;
            ArrayList arrayList = l2Var.b;
            arrayList.add(l2Var.i(null, 1, i, 1));
            l2Var.a |= 1;
            if (arrayList.size() == 1) {
                vzVar.a();
            }
        }
    }

    public final void d(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            vz vzVar = (vz) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = vzVar.a;
            recyclerView.i(null);
            l2 l2Var = recyclerView.i;
            ArrayList arrayList = l2Var.b;
            arrayList.add(l2Var.i(null, 2, i, 1));
            l2Var.a |= 2;
            if (arrayList.size() == 1) {
                vzVar.a();
            }
        }
    }
}
