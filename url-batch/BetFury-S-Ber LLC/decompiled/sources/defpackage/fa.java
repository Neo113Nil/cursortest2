package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fa implements Runnable {
    public final /* synthetic */ int f;
    public final int g;
    public final Object h;

    public fa(List list, int i, Throwable th) {
        this.f = 1;
        bi.q(list, "initCallbacks cannot be null");
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
                bi biVar = (bi) ((kz) obj).f;
                if (biVar != null) {
                    biVar.N(i2);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((xl) arrayList.get(i3)).a();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((xl) arrayList.get(i3)).getClass();
                        i3++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((s00) obj).f0;
                if (!recyclerView.B) {
                    h80 h80Var = recyclerView.r;
                    if (h80Var != null) {
                        h80Var.y0(recyclerView, i2);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ fa(int i, int i2, Object obj) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }
}
