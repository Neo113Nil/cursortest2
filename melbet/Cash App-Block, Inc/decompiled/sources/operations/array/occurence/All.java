package operations.array.occurence;

import com.nimbusds.jose.util.Base64Codec;
import com.squareup.cash.api.ContextKt;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import evaluation.CommonLogicEvaluator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import operation.FunctionalLogicOperation;
import operations.array.ArrayOperation;
import operations.array.ArrayOperationInputData;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public final class All implements FunctionalLogicOperation, ArrayOperation {
    public static final All INSTANCE = new All(0);
    public static final All INSTANCE$1 = new All(1);
    public static final All INSTANCE$2 = new All(2);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ All(int i) {
        this.$r8$classId = i;
    }

    public final ArrayOperationInputData createOperationInput(List list, Object obj, CommonLogicEvaluator commonLogicEvaluator) {
        switch (this.$r8$classId) {
        }
        return Base64Codec.createOperationInput(this, (JsonLogicList) list, obj, commonLogicEvaluator);
    }

    @Override // operation.FunctionalLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2, CommonLogicEvaluator commonLogicEvaluator) {
        int i = 22;
        switch (this.$r8$classId) {
        }
        return invokeArrayOperation(obj, obj2, commonLogicEvaluator, new FieldBinding$$ExternalSyntheticLambda5(this, i));
    }

    @Override // operations.array.ArrayOperation
    public final Object getOperationDefault(Map map, JsonLogicList jsonLogicList) {
        switch (this.$r8$classId) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return Boolean.TRUE;
            default:
                return Boolean.FALSE;
        }
    }

    public final Object invokeArrayOperation(Object obj, Object obj2, CommonLogicEvaluator commonLogicEvaluator, Function2 function2) {
        switch (this.$r8$classId) {
        }
        return ((FieldBinding$$ExternalSyntheticLambda5) function2).invoke(createOperationInput(AnyUtilsKt.getAsList(obj), obj2, commonLogicEvaluator), commonLogicEvaluator);
    }

    @Override // unwrap.EvaluatingUnwrapper
    public final List unwrapDataByEvaluation(List list, Object obj, CommonLogicEvaluator commonLogicEvaluator) {
        switch (this.$r8$classId) {
        }
        return ContextKt.unwrapDataByEvaluation((JsonLogicList) list, obj, commonLogicEvaluator);
    }
}
