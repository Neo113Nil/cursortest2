package defpackage;

import defpackage.DropMode;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import operation.StandardLogicOperation;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes3.dex */
public final class Drop implements StandardLogicOperation {
    public final /* synthetic */ int $r8$classId;
    public static final Drop INSTANCE$1 = new Drop(1);
    public static final Drop INSTANCE = new Drop(0);
    public static final Drop INSTANCE$2 = new Drop(2);

    public /* synthetic */ Drop(int i) {
        this.$r8$classId = i;
    }

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Object obj3 = DropMode.Last.INSTANCE$2;
                DropMode.Last last = DropMode.Last.INSTANCE;
                DropMode.Last last2 = DropMode.Last.INSTANCE$1;
                JsonLogicList asList = AnyUtilsKt.getAsList(obj);
                Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) asList);
                Object orNull = CollectionsKt.getOrNull(1, asList);
                Object orNull2 = CollectionsKt.getOrNull(2, asList);
                String str = orNull2 instanceof String ? (String) orNull2 : null;
                DropMode.Last last3 = Intrinsics.areEqual(str, "first") ? last2 : Intrinsics.areEqual(str, "last") ? last : obj3;
                Integer num = orNull instanceof Integer ? (Integer) orNull : null;
                if (num == null) {
                    return null;
                }
                int intValue = num.intValue();
                if (firstOrNull instanceof String) {
                    if (last3.equals(last2)) {
                        return StringsKt___StringsKt.drop(intValue, (String) firstOrNull);
                    }
                    if (last3.equals(last)) {
                        return StringsKt___StringsKt.dropLast(intValue, (String) firstOrNull);
                    }
                    if (last3.equals(obj3)) {
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (!(firstOrNull instanceof List)) {
                    return null;
                }
                List list = (List) firstOrNull;
                List list2 = list;
                List list3 = list;
                if (last3.equals(last2)) {
                    return CollectionsKt.drop(list2, intValue);
                }
                if (last3.equals(last)) {
                    return CollectionsKt.dropLast(intValue, list3);
                }
                if (last3.equals(obj3)) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
                return Long.valueOf(System.currentTimeMillis());
            default:
                if (obj instanceof String) {
                    return StringsKt___StringsKt.reversed((String) obj).toString();
                }
                if (obj instanceof List) {
                    return CollectionsKt.reversed((Iterable) obj);
                }
                return null;
        }
    }
}
