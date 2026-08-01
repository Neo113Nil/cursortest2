package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import f0.I;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f270b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f271c;

    public /* synthetic */ b(Object obj, int i, int i2) {
        this.f269a = i2;
        this.f271c = obj;
        this.f270b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f269a) {
            case 0:
                B.b bVar = (B.b) ((C.h) this.f271c).f150b;
                if (bVar != null) {
                    bVar.g(this.f270b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f271c;
                int size = arrayList.size();
                int i = 0;
                if (this.f270b == 1) {
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
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f271c).f1795a0;
                if (!recyclerView.f1544u) {
                    I i2 = recyclerView.f1529l;
                    if (i2 != null) {
                        i2.x0(recyclerView, this.f270b);
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
        this.f269a = 1;
        u1.d.g(list, "initCallbacks cannot be null");
        this.f271c = new ArrayList(list);
        this.f270b = i;
    }
}
