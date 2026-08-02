package operations.array;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import operation.StandardLogicOperation;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public final class Merge implements StandardLogicOperation {
    public static final Merge INSTANCE = new Merge();

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        JsonLogicList asList = AnyUtilsKt.getAsList(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : asList.items) {
            CollectionsKt__MutableCollectionsKt.addAll(obj3 instanceof List ? (List) obj3 : CollectionsKt__CollectionsJVMKt.listOf(obj3), arrayList);
        }
        return arrayList;
    }
}
