package com.yandex.div.core.view2;

import O1.Z;
import android.view.View;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class Div2Builder {

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final DivBinder viewBinder;

    @NotNull
    private final DivViewCreator viewCreator;

    public Div2Builder(@NotNull DivViewCreator viewCreator, @NotNull DivBinder viewBinder, @NotNull DivRuntimeVisitor runtimeVisitor) {
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(runtimeVisitor, "runtimeVisitor");
        this.viewCreator = viewCreator;
        this.viewBinder = viewBinder;
        this.runtimeVisitor = runtimeVisitor;
    }

    @NotNull
    public View buildView(@NotNull Z data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        View createView = createView(data, context, path);
        this.viewBinder.bind(context, createView, data, path);
        return createView;
    }

    @NotNull
    public View createView(@NotNull Z data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        this.runtimeVisitor.createAndAttachRuntimes(data, path, context.getDivView());
        View create = this.viewCreator.create(data, expressionResolver);
        create.setLayoutParams(new DivLayoutParams(-1, -2));
        return create;
    }
}
