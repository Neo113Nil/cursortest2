package J;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import h0.I;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f353a;

    /* renamed from: b, reason: collision with root package name */
    public final int f354b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f355c;

    public /* synthetic */ a(Object obj, int i, int i2) {
        this.f353a = i2;
        this.f355c = obj;
        this.f354b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f353a) {
            case 0:
                D.b bVar = (D.b) ((E.g) this.f355c).f170b;
                if (bVar != null) {
                    bVar.g(this.f354b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f355c;
                int size = arrayList.size();
                int i = 0;
                if (this.f354b == 1) {
                    while (i < size) {
                        ((V.h) arrayList.get(i)).a();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((V.h) arrayList.get(i)).getClass();
                        i++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f355c).f1876a0;
                if (!recyclerView.f1675u) {
                    I i2 = recyclerView.f1660l;
                    if (i2 != null) {
                        i2.x0(recyclerView, this.f354b);
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
        this.f353a = 1;
        z1.l.q(list, "initCallbacks cannot be null");
        this.f355c = new ArrayList(list);
        this.f354b = i;
    }
}
