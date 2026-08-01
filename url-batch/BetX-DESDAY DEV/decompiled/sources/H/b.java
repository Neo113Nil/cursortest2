package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import e0.I;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f218b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f219c;

    public /* synthetic */ b(Object obj, int i, int i2) {
        this.f217a = i2;
        this.f219c = obj;
        this.f218b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f217a) {
            case 0:
                B.b bVar = (B.b) ((B0.d) this.f219c).f66b;
                if (bVar != null) {
                    bVar.g(this.f218b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f219c;
                int size = arrayList.size();
                int i = 0;
                if (this.f218b == 1) {
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
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f219c).f1862a0;
                if (!recyclerView.f1600u) {
                    I i2 = recyclerView.f1585l;
                    if (i2 != null) {
                        i2.x0(recyclerView, this.f218b);
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
        this.f217a = 1;
        q1.d.h(list, "initCallbacks cannot be null");
        this.f219c = new ArrayList(list);
        this.f218b = i;
    }
}
