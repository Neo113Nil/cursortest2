package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import e0.I;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218a;

    /* renamed from: b, reason: collision with root package name */
    public final int f219b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f220c;

    public /* synthetic */ b(Object obj, int i, int i2) {
        this.f218a = i2;
        this.f220c = obj;
        this.f219b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f218a) {
            case 0:
                B.b bVar = (B.b) ((B0.d) this.f220c).f67b;
                if (bVar != null) {
                    bVar.g(this.f219b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f220c;
                int size = arrayList.size();
                int i = 0;
                if (this.f219b == 1) {
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
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f220c).f1884a0;
                if (!recyclerView.f1599u) {
                    I i2 = recyclerView.f1584l;
                    if (i2 != null) {
                        i2.x0(recyclerView, this.f219b);
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
        this.f218a = 1;
        q1.d.h(list, "initCallbacks cannot be null");
        this.f220c = new ArrayList(list);
        this.f219b = i;
    }
}
