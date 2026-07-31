package N;

import android.view.ViewGroup;
import com.strategylink.Row.Five.R;
import java.util.ArrayList;
import java.util.List;
import l5.AbstractC0506j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1639a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1640b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1641c;

    public b(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        this.f1639a = container;
        this.f1640b = new ArrayList();
        this.f1641c = new ArrayList();
    }

    public static final b a(ViewGroup container, F3.g fragmentManager) {
        kotlin.jvm.internal.i.e(container, "container");
        kotlin.jvm.internal.i.e(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.i.d((R0.g) fragmentManager.f740n, "fragmentManager.specialEffectsControllerFactory");
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
        for (int i7 = 0; i7 < size; i7++) {
            o oVar = (o) arrayList.get(i7);
            oVar.getClass();
            if (!oVar.f1676a) {
                oVar.f1676a = true;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj = arrayList.get(i8);
            i8++;
            ((o) obj).getClass();
            AbstractC0506j.D(null, arrayList2);
        }
        List P6 = AbstractC0506j.P(AbstractC0506j.T(arrayList2));
        int size3 = P6.size();
        for (int i9 = 0; i9 < size3; i9++) {
            n nVar = (n) P6.get(i9);
            nVar.getClass();
            ViewGroup container = this.f1639a;
            kotlin.jvm.internal.i.e(container, "container");
            if (!nVar.f1675a) {
                nVar.b(container);
            }
            nVar.f1675a = true;
        }
    }
}
