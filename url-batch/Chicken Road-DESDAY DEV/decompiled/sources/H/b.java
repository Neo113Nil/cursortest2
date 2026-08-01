package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import f0.I;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200a;

    /* renamed from: b, reason: collision with root package name */
    public final int f201b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f202c;

    public /* synthetic */ b(Object obj, int i, int i2) {
        this.f200a = i2;
        this.f202c = obj;
        this.f201b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f200a) {
            case 0:
                B.b bVar = (B.b) ((C.g) this.f202c).f66b;
                if (bVar != null) {
                    bVar.g(this.f201b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f202c;
                int size = arrayList.size();
                int i = 0;
                if (this.f201b == 1) {
                    while (i < size) {
                        ((T.h) arrayList.get(i)).a();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((T.h) arrayList.get(i)).getClass();
                        i++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f202c).f1729a0;
                if (!recyclerView.f1528u) {
                    I i2 = recyclerView.f1513l;
                    if (i2 != null) {
                        i2.x0(recyclerView, this.f201b);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }

    public b(List list, int i, Throwable th) {
        this.f200a = 1;
        u1.l.k(list, "initCallbacks cannot be null");
        this.f202c = new ArrayList(list);
        this.f201b = i;
    }
}
