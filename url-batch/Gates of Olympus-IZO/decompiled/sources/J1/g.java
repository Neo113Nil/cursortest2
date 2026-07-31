package J1;

import L1.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n2.C0692Q;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class g implements InterfaceC0701g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f2605e;

    public /* synthetic */ g(k kVar, int i3) {
        this.f2604d = i3;
        this.f2605e = kVar;
    }

    @Override // n2.InterfaceC0701g
    public final Object emit(Object obj, P1.d dVar) {
        C0692Q c0692q;
        Object value;
        Object value2;
        switch (this.f2604d) {
            case 0:
                Set set = (Set) obj;
                k kVar = this.f2605e;
                List<com.gates.olympus.miruv.data.b> allJoints = kVar.f2613b.getAllJoints();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : allJoints) {
                    if (set.contains(((com.gates.olympus.miruv.data.b) obj2).getId())) {
                        arrayList.add(obj2);
                    }
                }
                do {
                    c0692q = kVar.f2614c;
                    value = c0692q.getValue();
                } while (!c0692q.i(value, f.a((f) value, arrayList, null, null, 6)));
            default:
                Map map = (Map) obj;
                C0692Q c0692q2 = this.f2605e.f2614c;
                do {
                    value2 = c0692q2.getValue();
                } while (!c0692q2.i(value2, f.a((f) value2, null, (com.gates.olympus.miruv.data.a) map.get("guess"), (com.gates.olympus.miruv.data.a) map.get("match"), 1)));
        }
        return z.f2729a;
    }
}
