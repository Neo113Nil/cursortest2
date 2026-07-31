package com.yandex.div.core.view2.divs;

import O1.C1165z4;
import O1.InterfaceC0752c3;
import O1.S5;
import O1.Yb;
import O1.Z;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivLayoutProviderVariablesHolder extends DivTreeVisitor<Unit> implements ExpressionSubscriber {

    @NotNull
    private final List<String> changedVariables;

    @NotNull
    private final List<Disposable> subscriptions;

    /* JADX WARN: Multi-variable type inference failed */
    public DivLayoutProviderVariablesHolder() {
        super(null, 1, 0 == true ? 1 : 0);
        this.changedVariables = new ArrayList();
        this.subscriptions = new ArrayList();
    }

    private final void observe(Yb yb, ExpressionResolver expressionResolver) {
        Object b4 = yb.b();
        S5 s5 = b4 instanceof S5 ? (S5) b4 : null;
        if (s5 == null) {
            return;
        }
        Expression expression = s5.f4715b;
        Expression.MutableExpression mutableExpression = expression instanceof Expression.MutableExpression ? (Expression.MutableExpression) expression : null;
        if (mutableExpression == null) {
            return;
        }
        addSubscription(mutableExpression.observe(expressionResolver, new DivLayoutProviderVariablesHolder$observe$1(this, mutableExpression, expressionResolver)));
    }

    private final void observeSize(InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver) {
        observe(interfaceC0752c3.getWidth(), expressionResolver);
        observe(interfaceC0752c3.getHeight(), expressionResolver);
    }

    public final void clear() {
        this.changedVariables.clear();
    }

    public final boolean contains(@NotNull String variable) {
        Intrinsics.checkNotNullParameter(variable, "variable");
        return this.changedVariables.contains(variable);
    }

    @Override // com.yandex.div.internal.core.DivTreeVisitor
    public /* bridge */ /* synthetic */ Unit defaultVisit(Z z4, BindingContext bindingContext, DivStatePath divStatePath) {
        defaultVisit2(z4, bindingContext, divStatePath);
        return Unit.f41027a;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final void observeDivData(@NotNull C1165z4 data, @NotNull BindingContext context) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        for (C1165z4.c cVar : data.f8711c) {
            visit(cVar.f8721a, context, DivStatePath.Companion.fromState$div_release(cVar));
        }
    }

    /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
    protected void defaultVisit2(@NotNull Z data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        observeSize(data.b(), context.getExpressionResolver());
    }
}
