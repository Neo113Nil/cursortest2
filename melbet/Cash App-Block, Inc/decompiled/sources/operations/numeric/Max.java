package operations.numeric;

import _COROUTINE.ArtificialStackFrames;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import operation.StandardLogicOperation;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public final class Max implements StandardLogicOperation {
    public final /* synthetic */ int $r8$classId;
    public static final Max INSTANCE$1 = new Max(1);
    public static final Max INSTANCE$2 = new Max(2);
    public static final Max INSTANCE = new Max(0);
    public static final Max INSTANCE$3 = new Max(3);
    public static final Max INSTANCE$4 = new Max(4);
    public static final Max INSTANCE$5 = new Max(5);
    public static final Max INSTANCE$6 = new Max(6);

    public /* synthetic */ Max(int i) {
        this.$r8$classId = i;
    }

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ArrayList asDoubleList = obj != null ? AnyUtilsKt.getAsDoubleList(obj) : null;
                ArrayList filterNotNull = asDoubleList != null ? CollectionsKt.filterNotNull(asDoubleList) : null;
                if (!Intrinsics.areEqual(filterNotNull != null ? Integer.valueOf(filterNotNull.size()) : null, asDoubleList != null ? Integer.valueOf(asDoubleList.size()) : null) || asDoubleList == null) {
                    return null;
                }
                return CollectionsKt.m4122maxOrNull((Iterable) CollectionsKt.filterNotNull(asDoubleList));
            case 1:
                ArrayList asDoubleList2 = AnyUtilsKt.getAsDoubleList(ArtificialStackFrames.unwrapValue(obj));
                if (Integer.valueOf(CollectionsKt.filterNotNull(asDoubleList2).size()).equals(Integer.valueOf(asDoubleList2.size()))) {
                    return Double.valueOf(CollectionsKt.sumOfDouble(CollectionsKt.filterNotNull(asDoubleList2)));
                }
                return null;
            case 2:
                ArrayList unwrapValueAsDouble = JsonLogicResult.unwrapValueAsDouble(obj);
                if (unwrapValueAsDouble.size() < 2) {
                    unwrapValueAsDouble = null;
                }
                if (unwrapValueAsDouble == null) {
                    return null;
                }
                Double d = (Double) unwrapValueAsDouble.get(1);
                Double d2 = (Double) CollectionsKt.first((List) unwrapValueAsDouble);
                if (d2 == null || d == null || Intrinsics.areEqual(d)) {
                    return null;
                }
                return Double.valueOf(d2.doubleValue() / d.doubleValue());
            case 3:
                ArrayList asDoubleList3 = obj != null ? AnyUtilsKt.getAsDoubleList(obj) : null;
                ArrayList filterNotNull2 = asDoubleList3 != null ? CollectionsKt.filterNotNull(asDoubleList3) : null;
                if (!Intrinsics.areEqual(filterNotNull2 != null ? Integer.valueOf(filterNotNull2.size()) : null, asDoubleList3 != null ? Integer.valueOf(asDoubleList3.size()) : null) || asDoubleList3 == null) {
                    return null;
                }
                return CollectionsKt.m4124minOrNull((Iterable) CollectionsKt.filterNotNull(asDoubleList3));
            case 4:
                ArrayList unwrapValueAsDouble2 = JsonLogicResult.unwrapValueAsDouble(obj);
                if (unwrapValueAsDouble2.size() < 2) {
                    unwrapValueAsDouble2 = null;
                }
                if (unwrapValueAsDouble2 == null) {
                    return null;
                }
                Double d3 = (Double) unwrapValueAsDouble2.get(1);
                Double d4 = (Double) CollectionsKt.first((List) unwrapValueAsDouble2);
                if (d4 == null || d3 == null || Intrinsics.areEqual(d3)) {
                    return null;
                }
                return Double.valueOf(d4.doubleValue() % d3.doubleValue());
            case 5:
                JsonLogicList asList = AnyUtilsKt.getAsList(obj);
                int size = asList.items.size();
                if (size == 0) {
                    return null;
                }
                if (size == 1) {
                    return CollectionsKt.first((List) asList);
                }
                ArrayList asDoubleList4 = AnyUtilsKt.getAsDoubleList(ArtificialStackFrames.unwrapValue(obj));
                if (!Intrinsics.areEqual(Integer.valueOf(CollectionsKt.filterNotNull(asDoubleList4).size()), Integer.valueOf(asDoubleList4.size()))) {
                    return null;
                }
                Iterator it = CollectionsKt.filterNotNull(asDoubleList4).iterator();
                if (!it.hasNext()) {
                    a$$ExternalSyntheticBUOutline0.m("Empty collection can't be reduced.");
                    return null;
                }
                Object next = it.next();
                while (it.hasNext()) {
                    next = Double.valueOf(((Number) next).doubleValue() * ((Number) it.next()).doubleValue());
                }
                return (Double) next;
            default:
                ArrayList unwrapValueAsDouble3 = JsonLogicResult.unwrapValueAsDouble(obj);
                int size2 = unwrapValueAsDouble3.size();
                if (size2 == 0) {
                    return null;
                }
                if (size2 == 1) {
                    Double d5 = (Double) CollectionsKt.first((List) unwrapValueAsDouble3);
                    if (d5 != null) {
                        return Double.valueOf(-d5.doubleValue());
                    }
                    return null;
                }
                Double d6 = (Double) CollectionsKt.first((List) unwrapValueAsDouble3);
                Double d7 = (Double) unwrapValueAsDouble3.get(1);
                if (d6 == null || d7 == null) {
                    return null;
                }
                return Double.valueOf(d6.doubleValue() - d7.doubleValue());
        }
    }
}
