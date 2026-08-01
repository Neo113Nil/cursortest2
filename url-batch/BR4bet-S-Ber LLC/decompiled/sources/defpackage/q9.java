package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class q9 implements Runnable {
    public final /* synthetic */ int f;
    public final int g;
    public final Object h;

    public q9(List list, int i, Throwable th) {
        this.f = 1;
        b9.f(list, "initCallbacks cannot be null");
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
                b9 b9Var = (b9) ((pw) obj).f;
                if (b9Var != null) {
                    b9Var.z(i2);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((jj) arrayList.get(i3)).a();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((jj) arrayList.get(i3)).getClass();
                        i3++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((pv) obj).f0;
                if (!recyclerView.B) {
                    b20 b20Var = recyclerView.r;
                    if (b20Var != null) {
                        b20Var.y0(recyclerView, i2);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ q9(int i, int i2, Object obj) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }
}
