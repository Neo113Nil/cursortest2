package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qy extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            gz gzVar = (gz) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = gzVar.a;
            recyclerView.i(null);
            x1 x1Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) x1Var.c;
            if (i != i2) {
                arrayList.add(x1Var.m(null, 8, i, i2));
                x1Var.a |= 8;
                if (arrayList.size() == 1) {
                    gzVar.a();
                }
            }
        }
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            gz gzVar = (gz) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = gzVar.a;
            recyclerView.i(null);
            x1 x1Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) x1Var.c;
            if (i2 >= 1) {
                arrayList.add(x1Var.m(null, 4, i, i2));
                x1Var.a |= 4;
                if (arrayList.size() == 1) {
                    gzVar.a();
                }
            }
        }
    }

    public final void d(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            gz gzVar = (gz) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = gzVar.a;
            recyclerView.i(null);
            x1 x1Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) x1Var.c;
            if (i2 >= 1) {
                arrayList.add(x1Var.m(null, 1, i, i2));
                x1Var.a |= 1;
                if (arrayList.size() == 1) {
                    gzVar.a();
                }
            }
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            gz gzVar = (gz) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = gzVar.a;
            recyclerView.i(null);
            x1 x1Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) x1Var.c;
            if (i2 >= 1) {
                arrayList.add(x1Var.m(null, 2, i, i2));
                x1Var.a |= 2;
                if (arrayList.size() == 1) {
                    gzVar.a();
                }
            }
        }
    }
}
