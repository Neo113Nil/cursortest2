package R;

import android.view.ViewGroup;
import com.chickyneer.roadway.R;
import g4.AbstractC0465j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f2571a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2572b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2573c;

    public b(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        this.f2571a = container;
        this.f2572b = new ArrayList();
        this.f2573c = new ArrayList();
    }

    public static final b a(ViewGroup container, m fragmentManager) {
        kotlin.jvm.internal.i.e(container, "container");
        kotlin.jvm.internal.i.e(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.i.d(fragmentManager.f2605i, "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof b) {
            return (b) tag;
        }
        b bVar = new b(container);
        container.setTag(R.id.special_effects_controller_view_tag, bVar);
        return bVar;
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = (s) arrayList.get(i2);
            if (!sVar.f2615a) {
                sVar.f2615a = true;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((s) it.next()).getClass();
            kotlin.jvm.internal.i.e(null, "elements");
            arrayList2.addAll(null);
        }
        List S02 = AbstractC0465j.S0(AbstractC0465j.X0(arrayList2));
        int size2 = S02.size();
        for (int i3 = 0; i3 < size2; i3++) {
            r rVar = (r) S02.get(i3);
            rVar.getClass();
            ViewGroup container = this.f2571a;
            kotlin.jvm.internal.i.e(container, "container");
            if (!rVar.f2614a) {
                rVar.b(container);
            }
            rVar.f2614a = true;
        }
    }
}
