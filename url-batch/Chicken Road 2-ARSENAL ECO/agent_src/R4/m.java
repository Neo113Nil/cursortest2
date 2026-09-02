package R4;

import W4.v;
import W4.w;
import c5.C0290a;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d5.C0332b;
import e5.C0354i;
import g5.C0399b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2126b;

    public /* synthetic */ m(int i7, Object obj) {
        this.f2125a = i7;
        this.f2126b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2125a) {
            case 0:
                n nVar = (n) this.f2126b;
                O4.a aVar = (O4.a) obj;
                h hVar = nVar.f2128f;
                nVar.f2131i.apply(aVar);
                boolean z5 = l.f2122c;
                V4.a aVar2 = V4.a.f2724a;
                return z5 ? new e(hVar, aVar, aVar2) : new l(hVar, aVar, aVar2);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                List list = (List) this.f2126b;
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getValue() == null) {
                    return new C0290a(new C0354i(new ArrayList(list)));
                }
                throw new ClassCastException();
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                w wVar = (w) this.f2126b;
                O4.a aVar3 = (O4.a) obj;
                C0332b c0332b = wVar.f2845i;
                List list2 = wVar.f2843g;
                wVar.f2848l.apply(aVar3);
                return new v(c0332b, aVar3, list2, X4.a.f2868a);
            default:
                ((g5.h) this.f2126b).f4299h.apply((O4.a) obj);
                return g5.g.f4295a ? new C0399b() : new g5.g();
        }
    }
}
