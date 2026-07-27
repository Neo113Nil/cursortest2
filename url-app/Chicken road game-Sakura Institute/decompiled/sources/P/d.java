package P;

import M2.p;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import z2.C1412P;

/* loaded from: classes.dex */
public final class d extends p implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public static final d f3647e = new d(2, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final d f3648i = new d(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i4) {
        super(i2);
        this.f3649d = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f3649d) {
            case 0:
                i iVar = (i) obj2;
                LinkedHashMap j4 = C1412P.j(iVar.f3665a);
                for (f fVar : iVar.f3666b.values()) {
                    if (fVar.f3654b) {
                        Map a4 = fVar.f3655c.a();
                        boolean isEmpty = a4.isEmpty();
                        Object obj3 = fVar.f3653a;
                        if (isEmpty) {
                            j4.remove(obj3);
                        } else {
                            j4.put(obj3, a4);
                        }
                    }
                }
                if (j4.isEmpty()) {
                    return null;
                }
                return j4;
            default:
                return obj2;
        }
    }
}
