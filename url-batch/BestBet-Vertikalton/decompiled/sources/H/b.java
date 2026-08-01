package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import g0.H;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f477a;

    /* renamed from: b, reason: collision with root package name */
    public final int f478b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f479c;

    public /* synthetic */ b(Object obj, int i, int i2) {
        this.f477a = i2;
        this.f479c = obj;
        this.f478b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f477a) {
            case 0:
                B.b bVar = (B.b) ((A0.c) this.f479c).f6b;
                if (bVar != null) {
                    bVar.g(this.f478b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f479c;
                int size = arrayList.size();
                int i = 0;
                if (this.f478b == 1) {
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
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f479c).f2271a0;
                if (!recyclerView.f2007w) {
                    H h = recyclerView.f1989m;
                    if (h != null) {
                        h.z0(recyclerView, this.f478b);
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
        this.f477a = 1;
        H1.d.j(list, "initCallbacks cannot be null");
        this.f479c = new ArrayList(list);
        this.f478b = i;
    }
}
