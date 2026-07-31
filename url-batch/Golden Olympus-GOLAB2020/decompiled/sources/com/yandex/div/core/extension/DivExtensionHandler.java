package com.yandex.div.core.extension;

import O1.InterfaceC0752c3;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface DivExtensionHandler {
    default void beforeBindView(@NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull InterfaceC0752c3 div) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
    }

    void bindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull InterfaceC0752c3 interfaceC0752c3);

    boolean matches(@NotNull InterfaceC0752c3 interfaceC0752c3);

    default void preprocess(@NotNull InterfaceC0752c3 div, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
    }

    void unbindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull InterfaceC0752c3 interfaceC0752c3);
}
