package W2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4292d;

    public /* synthetic */ r(int i2) {
        this.f4292d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f4292d) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((CoroutineContext) obj).s((CoroutineContext.Element) obj2);
            case 2:
                return ((CoroutineContext) obj).s((CoroutineContext.Element) obj2);
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof t0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? element : Integer.valueOf(intValue + 1);
            case 5:
                t0 t0Var = (t0) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (t0Var != null) {
                    return t0Var;
                }
                if (element2 instanceof t0) {
                    return (t0) element2;
                }
                return null;
            default:
                return (b3.x) obj;
        }
    }
}
