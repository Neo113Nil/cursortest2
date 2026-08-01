package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class y8 implements Runnable {
    public final /* synthetic */ int f;
    public final int g;
    public final Object h;

    public y8(List list, int i, Throwable th) {
        this.f = 1;
        vw.o(list, "initCallbacks cannot be null");
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
                l70 l70Var = (l70) ((tx) obj).f;
                if (l70Var != null) {
                    l70Var.C(i2);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((ah) arrayList.get(i3)).a();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((ah) arrayList.get(i3)).getClass();
                        i3++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((ct) obj).m;
                if (!recyclerView.B) {
                    nz nzVar = recyclerView.r;
                    if (nzVar != null) {
                        nzVar.y0(recyclerView, i2);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ y8(int i, int i2, Object obj) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }
}
