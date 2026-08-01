package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class d9 implements Runnable {
    public final /* synthetic */ int f;
    public final int g;
    public final Object h;

    public d9(List list, int i, Throwable th) {
        this.f = 1;
        zo.g(list, "initCallbacks cannot be null");
        this.h = new ArrayList(list);
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        int i2 = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                jw jwVar = (jw) ((mr) obj).f;
                if (jwVar != null) {
                    jwVar.M(i2);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((ih) arrayList.get(i3)).a();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((ih) arrayList.get(i3)).getClass();
                        i3++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((os) obj).f0;
                if (!recyclerView.B) {
                    xy xyVar = recyclerView.r;
                    if (xyVar != null) {
                        xyVar.y0(recyclerView, i2);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ d9(int i, int i2, Object obj) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }
}
