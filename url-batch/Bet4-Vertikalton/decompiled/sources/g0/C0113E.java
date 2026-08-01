package g0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113E extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((U) ((Observable) this).mObservers.get(size)).f2302a;
            recyclerView.k(null);
            recyclerView.f1570g0.f2314f = true;
            recyclerView.X(true);
            if (!recyclerView.f1565e.j()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            U u2 = (U) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = u2.f2302a;
            recyclerView.k(null);
            C0116b c0116b = recyclerView.f1565e;
            ArrayList arrayList = (ArrayList) c0116b.f2326c;
            arrayList.add(c0116b.l(null, 4, i, 1));
            c0116b.f2324a |= 4;
            if (arrayList.size() == 1) {
                u2.a();
            }
        }
    }

    public final void d(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            U u2 = (U) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = u2.f2302a;
            recyclerView.k(null);
            C0116b c0116b = recyclerView.f1565e;
            ArrayList arrayList = (ArrayList) c0116b.f2326c;
            arrayList.add(c0116b.l(null, 1, i, 1));
            c0116b.f2324a |= 1;
            if (arrayList.size() == 1) {
                u2.a();
            }
        }
    }

    public final void e(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            U u2 = (U) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = u2.f2302a;
            recyclerView.k(null);
            C0116b c0116b = recyclerView.f1565e;
            ArrayList arrayList = (ArrayList) c0116b.f2326c;
            arrayList.add(c0116b.l(null, 2, i, 1));
            c0116b.f2324a |= 2;
            if (arrayList.size() == 1) {
                u2.a();
            }
        }
    }
}
