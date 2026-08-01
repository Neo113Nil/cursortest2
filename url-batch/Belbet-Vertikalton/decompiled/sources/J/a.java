package J;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import h0.AbstractC0141G;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f620a;

    /* renamed from: b, reason: collision with root package name */
    public final int f621b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f622c;

    public /* synthetic */ a(Object obj, int i, int i2) {
        this.f620a = i2;
        this.f622c = obj;
        this.f621b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f620a) {
            case 0:
                D.b bVar = (D.b) ((C1.d) this.f622c).f145b;
                if (bVar != null) {
                    bVar.g(this.f621b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f622c;
                int size = arrayList.size();
                int i = 0;
                if (this.f621b == 1) {
                    while (i < size) {
                        ((V.h) arrayList.get(i)).b();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((V.h) arrayList.get(i)).a();
                        i++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f622c).f2384a0;
                if (!recyclerView.f2046u) {
                    AbstractC0141G abstractC0141G = recyclerView.f2031l;
                    if (abstractC0141G != null) {
                        abstractC0141G.x0(recyclerView, this.f621b);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }

    public a(List list, int i, Throwable th) {
        this.f620a = 1;
        H1.d.l(list, "initCallbacks cannot be null");
        this.f622c = new ArrayList(list);
        this.f621b = i;
    }
}
