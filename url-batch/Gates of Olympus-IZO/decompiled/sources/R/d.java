package R;

import M1.B;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends Z1.j implements Y1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final d f3136f = new d(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final d f3137g = new d(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i4) {
        super(i3);
        this.f3138e = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f3138e) {
            case 0:
                i iVar = (i) obj2;
                LinkedHashMap R2 = B.R(iVar.f3154a);
                for (f fVar : iVar.f3155b.values()) {
                    if (fVar.f3143b) {
                        Map b2 = fVar.f3144c.b();
                        boolean isEmpty = b2.isEmpty();
                        Object obj3 = fVar.f3142a;
                        if (isEmpty) {
                            R2.remove(obj3);
                        } else {
                            R2.put(obj3, b2);
                        }
                    }
                }
                if (R2.isEmpty()) {
                    return null;
                }
                return R2;
            default:
                return obj2;
        }
    }
}
