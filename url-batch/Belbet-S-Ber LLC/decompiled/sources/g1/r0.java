package g1;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((i1) ((Observable) this).mObservers.get(size)).f1691a;
            recyclerView.k(null);
            recyclerView.f775l0.f1724f = true;
            recyclerView.Y(true);
            if (!recyclerView.f770j.l()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i, int i4) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            i1 i1Var = (i1) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = i1Var.f1691a;
            recyclerView.k(null);
            com.google.android.material.datepicker.c cVar = recyclerView.f770j;
            ArrayList arrayList = (ArrayList) cVar.f1042c;
            if (i != i4) {
                arrayList.add(cVar.n(null, 8, i, i4));
                cVar.f1040a |= 8;
                if (arrayList.size() == 1) {
                    i1Var.a();
                }
            }
        }
    }

    public final void d(int i, int i4) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            i1 i1Var = (i1) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = i1Var.f1691a;
            recyclerView.k(null);
            com.google.android.material.datepicker.c cVar = recyclerView.f770j;
            ArrayList arrayList = (ArrayList) cVar.f1042c;
            if (i4 >= 1) {
                arrayList.add(cVar.n(null, 4, i, i4));
                cVar.f1040a |= 4;
                if (arrayList.size() == 1) {
                    i1Var.a();
                }
            }
        }
    }

    public final void e(int i, int i4) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            i1 i1Var = (i1) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = i1Var.f1691a;
            recyclerView.k(null);
            com.google.android.material.datepicker.c cVar = recyclerView.f770j;
            ArrayList arrayList = (ArrayList) cVar.f1042c;
            if (i4 >= 1) {
                arrayList.add(cVar.n(null, 1, i, i4));
                cVar.f1040a |= 1;
                if (arrayList.size() == 1) {
                    i1Var.a();
                }
            }
        }
    }

    public final void f(int i, int i4) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            i1 i1Var = (i1) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = i1Var.f1691a;
            recyclerView.k(null);
            com.google.android.material.datepicker.c cVar = recyclerView.f770j;
            ArrayList arrayList = (ArrayList) cVar.f1042c;
            if (i4 >= 1) {
                arrayList.add(cVar.n(null, 2, i, i4));
                cVar.f1040a |= 2;
                if (arrayList.size() == 1) {
                    i1Var.a();
                }
            }
        }
    }
}
