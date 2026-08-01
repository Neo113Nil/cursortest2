package I;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import h0.J;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315a;

    /* renamed from: b, reason: collision with root package name */
    public final int f316b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f317c;

    public /* synthetic */ a(Object obj, int i, int i2) {
        this.f315a = i2;
        this.f317c = obj;
        this.f316b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f315a) {
            case 0:
                C.b bVar = (C.b) ((D.g) this.f317c).f122b;
                if (bVar != null) {
                    bVar.g(this.f316b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f317c;
                int size = arrayList.size();
                int i = 0;
                if (this.f316b == 1) {
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
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f317c).f1891a0;
                if (!recyclerView.f1691w) {
                    J j2 = recyclerView.f1672m;
                    if (j2 != null) {
                        j2.z0(recyclerView, this.f316b);
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
        this.f315a = 1;
        A1.m.j(list, "initCallbacks cannot be null");
        this.f317c = new ArrayList(list);
        this.f316b = i;
    }
}
