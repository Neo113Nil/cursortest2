package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import f0.I;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253a;

    /* renamed from: b, reason: collision with root package name */
    public final int f254b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f255c;

    public /* synthetic */ b(Object obj, int i, int i2) {
        this.f253a = i2;
        this.f255c = obj;
        this.f254b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f253a) {
            case 0:
                B.b bVar = (B.b) ((C.g) this.f255c).f67b;
                if (bVar != null) {
                    bVar.g(this.f254b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f255c;
                int size = arrayList.size();
                int i = 0;
                if (this.f254b == 1) {
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
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f255c).f1766a0;
                if (!recyclerView.f1573u) {
                    I i2 = recyclerView.f1558l;
                    if (i2 != null) {
                        i2.x0(recyclerView, this.f254b);
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
        this.f253a = 1;
        x1.d.j(list, "initCallbacks cannot be null");
        this.f255c = new ArrayList(list);
        this.f254b = i;
    }
}
