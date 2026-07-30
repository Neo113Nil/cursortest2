package V5;

import S.j;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.n0;
import s6.w;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2758d;

    public /* synthetic */ a(int i2) {
        this.f2758d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.c cVar;
        switch (this.f2758d) {
            case 0:
                String acc = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 1:
                CoroutineContext acc2 = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc2, "acc");
                Intrinsics.checkNotNullParameter(element2, "element");
                CoroutineContext B7 = acc2.B(element2.getKey());
                g gVar = g.f6146d;
                if (B7 == gVar) {
                    return element2;
                }
                c cVar2 = kotlin.coroutines.d.f6145f;
                kotlin.coroutines.d dVar = (kotlin.coroutines.d) B7.g(cVar2);
                if (dVar == null) {
                    cVar = new kotlin.coroutines.c(element2, B7);
                } else {
                    CoroutineContext B8 = B7.B(cVar2);
                    if (B8 == gVar) {
                        return new kotlin.coroutines.c(dVar, element2);
                    }
                    cVar = new kotlin.coroutines.c(dVar, new kotlin.coroutines.c(element2, B8));
                }
                return cVar;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                return ((CoroutineContext) obj).j((CoroutineContext.Element) obj2);
            case 4:
                return ((CoroutineContext) obj).j((CoroutineContext.Element) obj2);
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 6:
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                if (!(element3 instanceof n0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? element3 : Integer.valueOf(intValue + 1);
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                n0 n0Var = (n0) obj;
                CoroutineContext.Element element4 = (CoroutineContext.Element) obj2;
                if (n0Var != null) {
                    return n0Var;
                }
                if (element4 instanceof n0) {
                    return (n0) element4;
                }
                return null;
            default:
                return (w) obj;
        }
    }
}
