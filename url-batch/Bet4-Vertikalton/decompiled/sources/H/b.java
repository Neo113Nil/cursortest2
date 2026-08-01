package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import g0.L;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255a;

    /* renamed from: b, reason: collision with root package name */
    public final int f256b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f257c;

    public /* synthetic */ b(int i, int i2, Object obj) {
        this.f255a = i2;
        this.f257c = obj;
        this.f256b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f255a) {
            case 0:
                B.b bVar = (B.b) ((C.g) this.f257c).f115b;
                if (bVar != null) {
                    bVar.g(this.f256b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f257c;
                int size = arrayList.size();
                int i = 0;
                if (this.f256b == 1) {
                    while (i < size) {
                        ((U.h) arrayList.get(i)).a();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((U.h) arrayList.get(i)).getClass();
                        i++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f257c).f1791a0;
                if (!recyclerView.f1599x) {
                    L l2 = recyclerView.f1580n;
                    if (l2 != null) {
                        l2.z0(recyclerView, this.f256b);
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
        this.f255a = 1;
        w1.d.l(list, "initCallbacks cannot be null");
        this.f257c = new ArrayList(list);
        this.f256b = i;
    }
}
