package operations.data;

import com.squareup.wire.OneOf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import operation.StandardLogicOperation;
import type.JsonLogicList;
import utils.AnyUtilsKt;
import utils.StringUtilsKt;

/* loaded from: classes9.dex */
public final class Var implements StandardLogicOperation {
    public final /* synthetic */ int $r8$classId;
    public static final Var INSTANCE$1 = new Var(1);
    public static final Var INSTANCE$2 = new Var(2);
    public static final Var INSTANCE = new Var(0);

    public /* synthetic */ Var(int i) {
        this.$r8$classId = i;
    }

    public static Object getRecursive(List list, List list2) {
        String str = (String) CollectionsKt.firstOrNull(list);
        if (str == null) {
            return null;
        }
        Object orNull = CollectionsKt.getOrNull((int) StringUtilsKt.getDoubleOrZero(str), list2);
        return orNull instanceof List ? getRecursive(list.subList(1, list.size()), (List) orNull) : CollectionsKt.getOrNull((int) StringUtilsKt.getDoubleOrZero(str), list2);
    }

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        List split$default;
        String obj3;
        Object firstOrNull;
        String obj4;
        int i = this.$r8$classId;
        Var var = INSTANCE;
        switch (i) {
            case 0:
                Object unwrapNestedValue = OneOf.unwrapNestedValue(AnyUtilsKt.getAsList(obj));
                if (unwrapNestedValue instanceof List) {
                    split$default = null;
                } else {
                    split$default = (unwrapNestedValue == null || (obj3 = unwrapNestedValue.toString()) == null) ? null : StringsKt__StringsKt.split$default(obj3, new String[]{"."}, false, 0, 6, null);
                    if (split$default == null) {
                        split$default = EmptyList.INSTANCE;
                    }
                }
                if (split$default == null) {
                    return null;
                }
                if (!split$default.isEmpty()) {
                    if (obj2 instanceof List) {
                        if (split$default.size() == 1) {
                            String str = (String) CollectionsKt.first(split$default);
                            str.getClass();
                            obj2 = ((List) obj2).get((int) StringUtilsKt.getDoubleOrZero(str));
                        } else {
                            obj2 = getRecursive(split$default, (List) obj2);
                        }
                    } else if (obj2 instanceof Map) {
                        obj2 = ((Map) obj2).get(CollectionsKt.first(split$default));
                        for (String str2 : CollectionsKt.drop(split$default, 1)) {
                            Map map = obj2 instanceof Map ? (Map) obj2 : null;
                            obj2 = map != null ? map.get(str2) : null;
                        }
                    }
                }
                if ((Intrinsics.areEqual(obj2, obj) || obj2 == null) && (obj instanceof List)) {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        return CollectionsKt.getOrNull(1, list);
                    }
                }
                return obj2;
            case 1:
                JsonLogicList asList = AnyUtilsKt.getAsList(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : asList.items) {
                    Object evaluateLogic = var.evaluateLogic(obj5, obj2);
                    if (evaluateLogic != null && (!(evaluateLogic instanceof String) || ((CharSequence) evaluateLogic).length() != 0)) {
                        obj5 = null;
                    }
                    if (obj5 != null) {
                        arrayList.add(obj5);
                    }
                }
                return arrayList;
            default:
                boolean z = obj instanceof List;
                List list2 = z ? (List) obj : null;
                long doubleOrZero = (list2 == null || (firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) list2)) == null || (obj4 = firstOrNull.toString()) == null) ? 0L : (long) StringUtilsKt.getDoubleOrZero(obj4);
                List list3 = z ? (List) obj : null;
                Object orNull = list3 != null ? CollectionsKt.getOrNull(1, list3) : null;
                List list4 = orNull instanceof List ? (List) orNull : null;
                if (list4 == null) {
                    list4 = EmptyList.INSTANCE;
                }
                JsonLogicList asList2 = AnyUtilsKt.getAsList(list4);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : asList2.items) {
                    Object evaluateLogic2 = var.evaluateLogic(obj6, obj2);
                    if (evaluateLogic2 != null && (!(evaluateLogic2 instanceof String) || ((CharSequence) evaluateLogic2).length() != 0)) {
                        obj6 = null;
                    }
                    if (obj6 != null) {
                        arrayList2.add(obj6);
                    }
                }
                ArrayList arrayList3 = ((long) (list4.size() - arrayList2.size())) < doubleOrZero ? arrayList2 : null;
                return arrayList3 == null ? EmptyList.INSTANCE : arrayList3;
        }
    }
}
