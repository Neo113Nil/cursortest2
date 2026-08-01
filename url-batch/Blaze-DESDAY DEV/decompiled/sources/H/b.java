package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import g0.J;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272a;

    /* renamed from: b, reason: collision with root package name */
    public final int f273b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f274c;

    public /* synthetic */ b(Object obj, int i, int i2) {
        this.f272a = i2;
        this.f274c = obj;
        this.f273b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f272a) {
            case 0:
                B.b bVar = (B.b) ((C.g) this.f274c).f80b;
                if (bVar != null) {
                    bVar.g(this.f273b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f274c;
                int size = arrayList.size();
                int i = 0;
                if (this.f273b == 1) {
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
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f274c).f1822a0;
                if (!recyclerView.f1628w) {
                    J j2 = recyclerView.f1609m;
                    if (j2 != null) {
                        j2.z0(recyclerView, this.f273b);
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
        this.f272a = 1;
        z1.d.q(list, "initCallbacks cannot be null");
        this.f274c = new ArrayList(list);
        this.f273b = i;
    }
}
