package com.yandex.div.internal.core;

import O1.Z;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivTreeVisitorKt {
    @NotNull
    public static final BindingContext getChildContext(@NotNull BindingContext bindingContext, @NotNull Z div, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(bindingContext, "<this>");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(bindingContext.getExpressionResolver());
        return asImpl == null ? bindingContext : bindingContext.getFor(asImpl.getRuntimeStore().getOrCreateRuntime$div_release(path.getFullPath$div_release(), div, asImpl).getExpressionResolver());
    }
}
