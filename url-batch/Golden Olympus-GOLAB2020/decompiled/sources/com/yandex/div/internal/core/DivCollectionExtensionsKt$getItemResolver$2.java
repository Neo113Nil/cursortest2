package com.yandex.div.internal.core;

import O1.H3;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
final class DivCollectionExtensionsKt$getItemResolver$2 extends s implements Function0<ExpressionResolver> {
    final /* synthetic */ int $index;
    final /* synthetic */ String $pathSegment;
    final /* synthetic */ ExpressionResolverImpl $resolverImpl;
    final /* synthetic */ H3 $this_getItemResolver;
    final /* synthetic */ JSONObject $validElement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivCollectionExtensionsKt$getItemResolver$2(H3 h32, JSONObject jSONObject, int i4, ExpressionResolverImpl expressionResolverImpl, String str) {
        super(0);
        this.$this_getItemResolver = h32;
        this.$validElement = jSONObject;
        this.$index = i4;
        this.$resolverImpl = expressionResolverImpl;
        this.$pathSegment = str;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ExpressionResolver invoke() {
        return this.$resolverImpl.withConstants$div_release(this.$pathSegment, new ConstantsProvider(MapsKt.mapOf(TuplesKt.to(this.$this_getItemResolver.f2948b, this.$validElement), TuplesKt.to(FirebaseAnalytics.Param.INDEX, Long.valueOf(this.$index)))));
    }
}
