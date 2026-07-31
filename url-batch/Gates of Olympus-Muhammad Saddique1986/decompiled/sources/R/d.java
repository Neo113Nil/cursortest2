package R;

import S1.B;
import e2.InterfaceC0426e;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends f2.k implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public static final d f4009f = new d(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final d f4010g = new d(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4011e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i4) {
        super(i3);
        this.f4011e = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f4011e) {
            case 0:
                i iVar = (i) obj2;
                LinkedHashMap N3 = B.N(iVar.f4027a);
                for (f fVar : iVar.f4028b.values()) {
                    if (fVar.f4016b) {
                        Map a3 = fVar.f4017c.a();
                        boolean isEmpty = a3.isEmpty();
                        Object obj3 = fVar.f4015a;
                        if (isEmpty) {
                            N3.remove(obj3);
                        } else {
                            N3.put(obj3, a3);
                        }
                    }
                }
                if (N3.isEmpty()) {
                    return null;
                }
                return N3;
            default:
                return obj2;
        }
    }
}
