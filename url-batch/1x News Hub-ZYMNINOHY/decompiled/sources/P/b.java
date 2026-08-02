package P;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1214a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1215b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1216c;

    public b(ViewGroup container) {
        kotlin.jvm.internal.j.e(container, "container");
        this.f1214a = container;
        this.f1215b = new ArrayList();
        this.f1216c = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            if (!pVar.f1253a) {
                pVar.f1253a = true;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).getClass();
            c2.k.O(arrayList2, null);
        }
        List Y2 = c2.e.Y(c2.e.a0(arrayList2));
        int size2 = Y2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            o oVar = (o) Y2.get(i4);
            oVar.getClass();
            ViewGroup container = this.f1214a;
            kotlin.jvm.internal.j.e(container, "container");
            if (!oVar.f1252a) {
                oVar.b(container);
            }
            oVar.f1252a = true;
        }
    }
}
