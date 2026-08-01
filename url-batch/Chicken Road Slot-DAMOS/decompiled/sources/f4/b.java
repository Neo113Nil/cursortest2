package f4;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f4070a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4071b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4072c;

    public b(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f4070a = viewGroup;
        this.f4071b = new ArrayList();
        this.f4072c = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = (o) arrayList.get(i3);
            oVar.getClass();
            if (!oVar.f4105a) {
                oVar.f4105a = true;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o) obj).getClass();
            d0.l(arrayList2, null);
        }
        List Q = CollectionsKt.Q(CollectionsKt.T(arrayList2));
        int size3 = Q.size();
        for (int i11 = 0; i11 < size3; i11++) {
            n nVar = (n) Q.get(i11);
            nVar.getClass();
            ViewGroup viewGroup = this.f4070a;
            viewGroup.getClass();
            if (!nVar.f4104a) {
                nVar.b(viewGroup);
            }
            nVar.f4104a = true;
        }
    }
}
