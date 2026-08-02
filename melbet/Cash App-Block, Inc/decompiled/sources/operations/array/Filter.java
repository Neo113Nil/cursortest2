package operations.array;

import com.nimbusds.jose.util.Base64Codec;
import com.squareup.cash.api.ContextKt;
import evaluation.CommonLogicEvaluator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import operation.FunctionalLogicOperation;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public final class Filter implements FunctionalLogicOperation, ArrayOperation {
    public static final Filter INSTANCE = new Filter();

    @Override // operation.FunctionalLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2, CommonLogicEvaluator commonLogicEvaluator) {
        return new Map$evaluateLogic$1(2, this, Filter.class, "filterOrEmptyList", "filterOrEmptyList(Loperations/array/ArrayOperationInputData;LLogicEvaluator;)Ljava/util/List;", 0, 8).invoke(Base64Codec.createOperationInput(this, AnyUtilsKt.getAsList(obj), obj2, commonLogicEvaluator), commonLogicEvaluator);
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
