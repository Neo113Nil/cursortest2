package j5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements BiFunction {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        ArrayList arrayList = new ArrayList((List) obj);
        arrayList.addAll((List) obj2);
        return arrayList;
    }
}
