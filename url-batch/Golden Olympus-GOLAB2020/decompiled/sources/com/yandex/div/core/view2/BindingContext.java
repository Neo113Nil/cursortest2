package com.yandex.div.core.view2;

import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class BindingContext {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Div2View divView;

    @NotNull
    private final ExpressionResolver expressionResolver;

    @Nullable
    private final RuntimeStore runtimeStore;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BindingContext createEmpty(@NotNull Div2View divView) {
            Intrinsics.checkNotNullParameter(divView, "divView");
            return new BindingContext(divView, ExpressionResolver.EMPTY, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BindingContext(Div2View div2View, ExpressionResolver expressionResolver, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2View, expressionResolver);
    }

    @NotNull
    public final Div2View getDivView() {
        return this.divView;
    }

    @NotNull
    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    @NotNull
    public final BindingContext getFor(@NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return Intrinsics.areEqual(this.expressionResolver, resolver) ? this : new BindingContext(this.divView, resolver);
    }

    @Nullable
    public final RuntimeStore getRuntimeStore() {
        return this.runtimeStore;
    }

    private BindingContext(Div2View div2View, ExpressionResolver expressionResolver) {
        this.divView = div2View;
        this.expressionResolver = expressionResolver;
        ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(expressionResolver);
        this.runtimeStore = asImpl != null ? asImpl.getRuntimeStore() : null;
    }
}
