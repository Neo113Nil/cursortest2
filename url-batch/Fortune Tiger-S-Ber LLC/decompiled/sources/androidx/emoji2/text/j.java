package androidx.emoji2.text;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import b1.n0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f338f;
    public final int g;
    public final Object h;

    public /* synthetic */ j(int i4, int i5, Object obj) {
        this.f338f = i5;
        this.h = obj;
        this.g = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f338f) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                int i4 = 0;
                if (this.g == 1) {
                    while (i4 < size) {
                        ((i) arrayList.get(i4)).a();
                        i4++;
                    }
                    break;
                } else {
                    while (i4 < size) {
                        ((i) arrayList.get(i4)).getClass();
                        i4++;
                    }
                    break;
                }
            case 1:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.l) this.h).f0;
                if (!recyclerView.B) {
                    n0 n0Var = recyclerView.f653r;
                    if (n0Var != null) {
                        n0Var.y0(recyclerView, this.g);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
            default:
                b0.b bVar = (b0.b) ((a2.e) this.h).g;
                if (bVar != null) {
                    bVar.g(this.g);
                    break;
                }
                break;
        }
    }

    public j(List list, int i4, Throwable th) {
        this.f338f = 0;
        k3.d.h(list, "initCallbacks cannot be null");
        this.h = new ArrayList(list);
        this.g = i4;
    }
}
