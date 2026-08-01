package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import f0.I;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193a;

    /* renamed from: b, reason: collision with root package name */
    public final int f194b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f195c;

    public /* synthetic */ b(Object obj, int i, int i2) {
        this.f193a = i2;
        this.f195c = obj;
        this.f194b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f193a) {
            case 0:
                B.b bVar = (B.b) ((C.g) this.f195c).f64b;
                if (bVar != null) {
                    bVar.g(this.f194b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f195c;
                int size = arrayList.size();
                int i = 0;
                if (this.f194b == 1) {
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
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f195c).f1699a0;
                if (!recyclerView.f1502u) {
                    I i2 = recyclerView.f1487l;
                    if (i2 != null) {
                        i2.x0(recyclerView, this.f194b);
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
        this.f193a = 1;
        s1.l.i(list, "initCallbacks cannot be null");
        this.f195c = new ArrayList(list);
        this.f194b = i;
    }
}
