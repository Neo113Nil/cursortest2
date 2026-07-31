package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.internal.util.JsonUtilsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivActionTypedArrayMutationHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONArray mutate(JSONArray jSONArray, Function1<? super List<Object>, Unit> function1) {
        List mutableList = CollectionsKt.toMutableList((Collection) JsonUtilsKt.asList(jSONArray));
        function1.invoke(mutableList);
        return new JSONArray((Collection) mutableList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVariable(Div2View div2View, String str, ExpressionResolver expressionResolver, Function1<? super JSONArray, ? extends JSONArray> function1) {
        VariableMutationHandler.Companion.setVariable(div2View, str, expressionResolver, new DivActionTypedArrayMutationHandlerKt$updateVariable$1(div2View, function1));
    }
}
