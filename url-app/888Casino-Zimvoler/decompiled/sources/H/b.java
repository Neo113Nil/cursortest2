package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import f0.I;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207a;

    /* renamed from: b, reason: collision with root package name */
    public final int f208b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f209c;

    public /* synthetic */ b(Object obj, int i, int i2) {
        this.f207a = i2;
        this.f209c = obj;
        this.f208b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f207a) {
            case 0:
                B.b bVar = (B.b) ((B0.d) this.f209c).f59b;
                if (bVar != null) {
                    bVar.g(this.f208b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f209c;
                int size = arrayList.size();
                int i = 0;
                if (this.f208b == 1) {
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
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f209c).f1664a0;
                if (!recyclerView.f1465u) {
                    I i2 = recyclerView.f1449l;
                    if (i2 != null) {
                        i2.x0(recyclerView, this.f208b);
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
        this.f207a = 1;
        q1.l.i(list, "initCallbacks cannot be null");
        this.f209c = new ArrayList(list);
        this.f208b = i;
    }
}
