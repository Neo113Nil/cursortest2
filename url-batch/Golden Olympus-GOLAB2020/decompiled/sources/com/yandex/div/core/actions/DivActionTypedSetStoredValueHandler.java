package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import O1.AbstractC1086uf;
import O1.L1;
import W1.m;
import android.net.Uri;
import com.yandex.div.core.expression.storedvalues.StoredValuesActionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedSetStoredValueHandler implements DivActionTypedHandler {
    private final StoredValue createStoredValue(AbstractC1086uf abstractC1086uf, String str, ExpressionResolver expressionResolver) {
        if (abstractC1086uf instanceof AbstractC1086uf.i) {
            return new StoredValue.StringStoredValue(str, (String) ((AbstractC1086uf.i) abstractC1086uf).c().f5287a.evaluate(expressionResolver));
        }
        if (abstractC1086uf instanceof AbstractC1086uf.g) {
            return new StoredValue.IntegerStoredValue(str, ((Number) ((AbstractC1086uf.g) abstractC1086uf).c().f7953a.evaluate(expressionResolver)).longValue());
        }
        if (abstractC1086uf instanceof AbstractC1086uf.b) {
            return new StoredValue.BooleanStoredValue(str, ((Boolean) ((AbstractC1086uf.b) abstractC1086uf).c().f6746a.evaluate(expressionResolver)).booleanValue());
        }
        if (abstractC1086uf instanceof AbstractC1086uf.h) {
            return new StoredValue.DoubleStoredValue(str, ((Number) ((AbstractC1086uf.h) abstractC1086uf).c().f2483a.evaluate(expressionResolver)).doubleValue());
        }
        if (abstractC1086uf instanceof AbstractC1086uf.c) {
            return new StoredValue.ColorStoredValue(str, Color.m211constructorimpl(((Number) ((AbstractC1086uf.c) abstractC1086uf).c().f8120a.evaluate(expressionResolver)).intValue()), null);
        }
        if (abstractC1086uf instanceof AbstractC1086uf.j) {
            Url.Companion companion = Url.Companion;
            String uri = ((Uri) ((AbstractC1086uf.j) abstractC1086uf).c().f6418a.evaluate(expressionResolver)).toString();
            Intrinsics.checkNotNullExpressionValue(uri, "value.value.value.evaluate(resolver).toString()");
            return new StoredValue.UrlStoredValue(str, companion.m228fromVcSV9u8(uri), null);
        }
        if (abstractC1086uf instanceof AbstractC1086uf.a) {
            return new StoredValue.ArrayStoredValue(str, (JSONArray) ((AbstractC1086uf.a) abstractC1086uf).c().f5571a.evaluate(expressionResolver));
        }
        if (abstractC1086uf instanceof AbstractC1086uf.f) {
            return new StoredValue.DictStoredValue(str, (JSONObject) ((AbstractC1086uf.f) abstractC1086uf).c().f4181a.evaluate(expressionResolver));
        }
        throw new m();
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(action instanceof AbstractC0948n2.q)) {
            return false;
        }
        handleAction(((AbstractC0948n2.q) action).c(), view, resolver);
        return true;
    }

    private final void handleAction(L1 l12, Div2View div2View, ExpressionResolver expressionResolver) {
        String str = (String) l12.f3655b.evaluate(expressionResolver);
        long longValue = ((Number) l12.f3654a.evaluate(expressionResolver)).longValue();
        StoredValuesActionHandler.INSTANCE.executeAction(createStoredValue(l12.f3656c, str, expressionResolver), longValue, div2View);
    }
}
