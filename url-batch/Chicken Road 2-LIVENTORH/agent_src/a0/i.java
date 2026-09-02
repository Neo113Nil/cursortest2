package a0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f1.o;
import java.util.Comparator;
import java.util.WeakHashMap;
import n0.d0;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99a;

    public /* synthetic */ i(int i) {
        this.f99a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int top;
        int top2;
        switch (this.f99a) {
            case 0:
                WeakHashMap weakHashMap = l0.f2757a;
                float f2 = d0.f((View) obj);
                float f4 = d0.f((View) obj2);
                if (f2 > f4) {
                    return -1;
                }
                return f2 < f4 ? 1 : 0;
            case 1:
                top = ((View) obj).getTop();
                top2 = ((View) obj2).getTop();
                break;
            case 2:
                o oVar = (o) obj;
                o oVar2 = (o) obj2;
                RecyclerView recyclerView = oVar.d;
                if ((recyclerView == null) == (oVar2.d == null)) {
                    boolean z3 = oVar.f1463a;
                    if (z3 == oVar2.f1463a) {
                        int i = oVar2.f1464b - oVar.f1464b;
                        if (i != 0) {
                            return i;
                        }
                        int i4 = oVar.f1465c - oVar2.f1465c;
                        if (i4 != 0) {
                            return i4;
                        }
                        return 0;
                    }
                    if (!z3) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            default:
                top = ((t.f) obj).f3263g;
                top2 = ((t.f) obj2).f3263g;
                break;
        }
        return top - top2;
    }
}
