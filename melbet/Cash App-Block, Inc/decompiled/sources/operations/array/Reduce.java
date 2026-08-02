package operations.array;

import com.nimbusds.jose.util.Base64Codec;
import com.squareup.cash.api.ContextKt;
import evaluation.CommonLogicEvaluator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import operation.FunctionalLogicOperation;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public final class Reduce implements FunctionalLogicOperation, ArrayOperation {
    public static final Reduce INSTANCE = new Reduce();

    @Override // operation.FunctionalLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2, CommonLogicEvaluator commonLogicEvaluator) {
        JsonLogicList asList = AnyUtilsKt.getAsList(obj);
        ArrayOperationInputData createOperationInput = Base64Codec.createOperationInput(INSTANCE, asList, obj2, commonLogicEvaluator);
        Object orNull = CollectionsKt.getOrNull(2, asList);
        List list = createOperationInput.operationData;
        if (list != null) {
            Object obj3 = orNull;
            for (Object obj4 : list) {
                java.util.Map map = createOperationInput.mappingOperation;
                obj3 = map != null ? commonLogicEvaluator.executeExpression(map, MapsKt__MapsKt.mapOf(new Pair("accumulator", obj3), new Pair("current", obj4))) : null;
                if (obj3 == null) {
                    return createOperationInput.operationDefault;
                }
            }
            if (obj3 != null) {
                return obj3;
            }
        }
        return orNull;
    }

    @Override // operations.array.ArrayOperation
    public final Object getOperationDefault(java.util.Map map, JsonLogicList jsonLogicList) {
        if (map == null) {
            return CollectionsKt.getOrNull(1, jsonLogicList);
        }
        return null;
    }

    @Override // unwrap.EvaluatingUnwrapper
    public final List unwrapDataByEvaluation(List list, Object obj, CommonLogicEvaluator commonLogicEvaluator) {
        return ContextKt.unwrapDataByEvaluation((JsonLogicList) list, obj, commonLogicEvaluator);
    }
}
