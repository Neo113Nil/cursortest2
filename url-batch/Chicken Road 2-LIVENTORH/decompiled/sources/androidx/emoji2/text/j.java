package androidx.emoji2.text;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import f1.m0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f328f;

    /* renamed from: g, reason: collision with root package name */
    public final int f329g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f330h;

    public /* synthetic */ j(int i, int i4, Object obj) {
        this.f328f = i4;
        this.f330h = obj;
        this.f329g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f328f) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f330h;
                int size = arrayList.size();
                int i = 0;
                if (this.f329g == 1) {
                    while (i < size) {
                        ((i) arrayList.get(i)).a();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((i) arrayList.get(i)).getClass();
                        i++;
                    }
                    break;
                }
            case 1:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.m) this.f330h).f927f0;
                if (!recyclerView.B) {
                    m0 m0Var = recyclerView.f685r;
                    if (m0Var != null) {
                        m0Var.y0(recyclerView, this.f329g);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
            case 2:
                ((g2.f) this.f330h).k(this.f329g);
                break;
            default:
                e0.b bVar = (e0.b) ((a0.a) this.f330h).f81g;
                if (bVar != null) {
                    bVar.g(this.f329g);
                    break;
                }
                break;
        }
    }

    public j(List list, int i, Throwable th) {
        this.f328f = 0;
        h.a.m(list, "initCallbacks cannot be null");
        this.f330h = new ArrayList(list);
        this.f329g = i;
    }
}
