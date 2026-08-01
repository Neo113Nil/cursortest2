package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class u10 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            j20 j20Var = (j20) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = j20Var.a;
            recyclerView.i(null);
            y1 y1Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) y1Var.c;
            if (i != i2) {
                arrayList.add(y1Var.m(null, 8, i, i2));
                y1Var.a |= 8;
                if (arrayList.size() == 1) {
                    j20Var.a();
                }
            }
        }
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            j20 j20Var = (j20) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = j20Var.a;
            recyclerView.i(null);
            y1 y1Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) y1Var.c;
            if (i2 >= 1) {
                arrayList.add(y1Var.m(null, 4, i, i2));
                y1Var.a |= 4;
                if (arrayList.size() == 1) {
                    j20Var.a();
                }
            }
        }
    }

    public final void d(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            j20 j20Var = (j20) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = j20Var.a;
            recyclerView.i(null);
            y1 y1Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) y1Var.c;
            if (i2 >= 1) {
                arrayList.add(y1Var.m(null, 1, i, i2));
                y1Var.a |= 1;
                if (arrayList.size() == 1) {
                    j20Var.a();
                }
            }
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            j20 j20Var = (j20) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = j20Var.a;
            recyclerView.i(null);
            y1 y1Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) y1Var.c;
            if (i2 >= 1) {
                arrayList.add(y1Var.m(null, 2, i, i2));
                y1Var.a |= 2;
                if (arrayList.size() == 1) {
                    j20Var.a();
                }
            }
        }
    }
}
