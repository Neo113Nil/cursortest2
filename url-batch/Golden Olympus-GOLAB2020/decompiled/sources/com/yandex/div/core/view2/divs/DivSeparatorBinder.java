package com.yandex.div.core.view2.divs;

import O1.Ab;
import O1.Z;
import com.yandex.div.R$dimen;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivSeparatorBinder extends DivViewBinder<Z.m, Ab, DivSeparatorView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivSeparatorBinder(@NotNull DivBaseBinder baseBinder) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(DivSeparatorView divSeparatorView, Ab.c cVar, ExpressionResolver expressionResolver) {
        if (cVar == null) {
            divSeparatorView.setDividerColor(335544320);
            divSeparatorView.setHorizontal(true);
        } else {
            divSeparatorView.setDividerColor(((Number) cVar.f1386a.evaluate(expressionResolver)).intValue());
            divSeparatorView.setHorizontal(((Ab.c.EnumC0024c) cVar.f1387b.evaluate(expressionResolver)) == Ab.c.EnumC0024c.HORIZONTAL);
        }
    }

    private final void bindStyle(DivSeparatorView divSeparatorView, Ab.c cVar, Ab.c cVar2, ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(cVar != null ? cVar.f1386a : null, cVar2 != null ? cVar2.f1386a : null)) {
            if (ExpressionsKt.equalsToConstant(cVar != null ? cVar.f1387b : null, cVar2 != null ? cVar2.f1387b : null)) {
                return;
            }
        }
        applyStyle(divSeparatorView, cVar, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(cVar != null ? cVar.f1386a : null)) {
            if (ExpressionsKt.isConstantOrNull(cVar != null ? cVar.f1387b : null)) {
                return;
            }
        }
        DivSeparatorBinder$bindStyle$callback$1 divSeparatorBinder$bindStyle$callback$1 = new DivSeparatorBinder$bindStyle$callback$1(this, divSeparatorView, cVar, expressionResolver);
        divSeparatorView.addSubscription((cVar == null || (expression2 = cVar.f1386a) == null) ? null : expression2.observe(expressionResolver, divSeparatorBinder$bindStyle$callback$1));
        if (cVar != null && (expression = cVar.f1387b) != null) {
            disposable = expression.observe(expressionResolver, divSeparatorBinder$bindStyle$callback$1);
        }
        divSeparatorView.addSubscription(disposable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivSeparatorView divSeparatorView, @NotNull BindingContext bindingContext, @NotNull Ab div, @Nullable Ab ab) {
        Intrinsics.checkNotNullParameter(divSeparatorView, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        BaseDivViewExtensionsKt.applyDivActions(divSeparatorView, bindingContext, div.f1356b, div.f1358d, div.f1378x, div.f1369o, div.f1375u, div.f1374t, div.f1338B, div.f1337A, div.f1357c, div.d(), div.f1365k);
        bindStyle(divSeparatorView, div.f1367m, ab != null ? ab.f1367m : null, bindingContext.getExpressionResolver());
        divSeparatorView.setDividerHeightResource(R$dimen.div_separator_delimiter_height);
        divSeparatorView.setDividerGravity(17);
    }
}
