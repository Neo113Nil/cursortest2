package n3;

import android.view.ViewGroup;
import e6.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f6509a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6510b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6511c;

    public b(ViewGroup viewGroup) {
        r6.k.f(viewGroup, "container");
        this.f6509a = viewGroup;
        this.f6510b = new ArrayList();
        this.f6511c = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            p pVar = (p) arrayList.get(i7);
            pVar.getClass();
            if (!pVar.f6554a) {
                pVar.f6554a = true;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj = arrayList.get(i8);
            i8++;
            ((p) obj).getClass();
            r.c0(null, arrayList2);
        }
        List w02 = e6.l.w0(e6.l.z0(arrayList2));
        int size3 = w02.size();
        for (int i9 = 0; i9 < size3; i9++) {
            o oVar = (o) w02.get(i9);
            oVar.getClass();
            ViewGroup viewGroup = this.f6509a;
            r6.k.f(viewGroup, "container");
            if (!oVar.f6553a) {
                oVar.b(viewGroup);
            }
            oVar.f6553a = true;
        }
    }
}
