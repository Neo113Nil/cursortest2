package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class GetStoredDictValue extends GetStoredComplexValue<JSONObject> {

    @NotNull
    public static final GetStoredDictValue INSTANCE = new GetStoredDictValue();

    @NotNull
    private static final String name = "getStoredDictValue";

    @NotNull
    private static final EvaluableType resultType = EvaluableType.DICT;

    private GetStoredDictValue() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public EvaluableType getResultType() {
        return resultType;
    }
}
