package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class a80 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            q80 q80Var = (q80) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = q80Var.a;
            recyclerView.i(null);
            f2 f2Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) f2Var.c;
            if (i != i2) {
                arrayList.add(f2Var.m(null, 8, i, i2));
                f2Var.a |= 8;
                if (arrayList.size() == 1) {
                    q80Var.a();
                }
            }
        }
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            q80 q80Var = (q80) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = q80Var.a;
            recyclerView.i(null);
            f2 f2Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) f2Var.c;
            if (i2 >= 1) {
                arrayList.add(f2Var.m(null, 4, i, i2));
                f2Var.a |= 4;
                if (arrayList.size() == 1) {
                    q80Var.a();
                }
            }
        }
    }

    public final void d(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            q80 q80Var = (q80) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = q80Var.a;
            recyclerView.i(null);
            f2 f2Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) f2Var.c;
            if (i2 >= 1) {
                arrayList.add(f2Var.m(null, 1, i, i2));
                f2Var.a |= 1;
                if (arrayList.size() == 1) {
                    q80Var.a();
                }
            }
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            q80 q80Var = (q80) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = q80Var.a;
            recyclerView.i(null);
            f2 f2Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) f2Var.c;
            if (i2 >= 1) {
                arrayList.add(f2Var.m(null, 2, i, i2));
                f2Var.a |= 2;
                if (arrayList.size() == 1) {
                    q80Var.a();
                }
            }
        }
    }
}
