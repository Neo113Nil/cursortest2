package com.yandex.div.core.view2.divs;

import O1.C0939mb;
import O1.Z;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.animations.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivSelectBinder extends DivViewBinder<Z.l, C0939mb, DivSelectView> {

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @NotNull
    private final TwoWayStringVariableBinder variableBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivSelectBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivTypefaceResolver typefaceResolver, @NotNull TwoWayStringVariableBinder variableBinder, @NotNull ErrorCollectors errorCollectors) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(typefaceResolver, "typefaceResolver");
        Intrinsics.checkNotNullParameter(variableBinder, "variableBinder");
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        this.typefaceResolver = typefaceResolver;
        this.variableBinder = variableBinder;
        this.errorCollectors = errorCollectors;
    }

    private final void applyOptions(DivSelectView divSelectView, C0939mb c0939mb, BindingContext bindingContext) {
        BaseDivViewExtensionsKt.setAnimatedTouchListener(divSelectView, bindingContext, UtilsKt.getDEFAULT_CLICK_ANIMATION(), null);
        List<String> createObservedItemList = createObservedItemList(divSelectView, c0939mb, bindingContext.getExpressionResolver());
        divSelectView.setItems(createObservedItemList);
        divSelectView.setOnItemSelectedListener(new DivSelectBinder$applyOptions$1(divSelectView, createObservedItemList, c0939mb, bindingContext));
    }

    private final List<String> createObservedItemList(DivSelectView divSelectView, C0939mb c0939mb, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj : c0939mb.f7041A) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C0939mb.c cVar = (C0939mb.c) obj;
            Expression expression = cVar.f7090a;
            if (expression == null) {
                expression = cVar.f7091b;
            }
            arrayList.add(expression.evaluate(expressionResolver));
            expression.observe(expressionResolver, new DivSelectBinder$createObservedItemList$1$1(arrayList, i4, divSelectView));
            i4 = i5;
        }
        return arrayList;
    }

    private final void observeBaseTextProperties(DivSelectView divSelectView, C0939mb c0939mb, C0939mb c0939mb2, ExpressionResolver expressionResolver) {
        Expression expression;
        DivSelectBinder divSelectBinder;
        Expression expression2;
        Expression expression3 = c0939mb.f7073m;
        Expression expression4 = c0939mb.f7074n;
        Expression expression5 = c0939mb.f7084x;
        Expression expression6 = c0939mb.f7046F;
        Expression expression7 = c0939mb.f7085y;
        Expression expression8 = c0939mb.f7072l;
        Expression expression9 = c0939mb.f7076p;
        Expression expression10 = c0939mb.f7077q;
        Expression expression11 = c0939mb.f7075o;
        Expression expression12 = c0939mb2 != null ? c0939mb2.f7073m : null;
        Expression expression13 = c0939mb2 != null ? c0939mb2.f7074n : null;
        Expression expression14 = c0939mb2 != null ? c0939mb2.f7084x : null;
        Expression expression15 = c0939mb2 != null ? c0939mb2.f7046F : null;
        Expression expression16 = c0939mb2 != null ? c0939mb2.f7085y : null;
        Expression expression17 = c0939mb2 != null ? c0939mb2.f7072l : null;
        Expression expression18 = c0939mb2 != null ? c0939mb2.f7076p : null;
        Expression expression19 = c0939mb2 != null ? c0939mb2.f7077q : null;
        if (c0939mb2 != null) {
            expression = c0939mb2.f7075o;
            expression2 = expression19;
            divSelectBinder = this;
        } else {
            expression = null;
            divSelectBinder = this;
            expression2 = expression19;
        }
        TextViewExtensionsKt.observeBaseTextProperties(divSelectView, expression3, expression4, expression5, expression6, expression7, expression8, expression9, expression10, expression11, expression12, expression13, expression14, expression15, expression16, expression17, expression18, expression2, expression, divSelectBinder.typefaceResolver, expressionResolver);
    }

    private final void observeHintColor(DivSelectView divSelectView, C0939mb c0939mb, ExpressionResolver expressionResolver) {
        divSelectView.addSubscription(c0939mb.f7080t.observeAndGet(expressionResolver, new DivSelectBinder$observeHintColor$1(divSelectView)));
    }

    private final void observeHintText(DivSelectView divSelectView, C0939mb c0939mb, ExpressionResolver expressionResolver) {
        Expression expression = c0939mb.f7081u;
        if (expression == null) {
            return;
        }
        divSelectView.addSubscription(expression.observeAndGet(expressionResolver, new DivSelectBinder$observeHintText$1(divSelectView)));
    }

    private final void observeVariable(final DivSelectView divSelectView, final C0939mb c0939mb, BindingContext bindingContext, DivStatePath divStatePath) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        divSelectView.addSubscription(this.variableBinder.bindVariable(bindingContext, c0939mb.f7053M, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$subscription$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull Function1<? super String, Unit> valueUpdater) {
                Intrinsics.checkNotNullParameter(valueUpdater, "valueUpdater");
                divSelectView.setValueUpdater(valueUpdater);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable String str) {
                CharSequence charSequence;
                Iterator it = k.p(CollectionsKt.asSequence(C0939mb.this.f7041A), new DivSelectBinder$observeVariable$subscription$1$onVariableChanged$matchingOptionsSequence$1(expressionResolver, str)).iterator();
                DivSelectView divSelectView2 = divSelectView;
                if (it.hasNext()) {
                    C0939mb.c cVar = (C0939mb.c) it.next();
                    if (it.hasNext()) {
                        orCreate.logWarning(new Throwable("Multiple options found with value = \"" + str + "\", selecting first one"));
                    }
                    Expression expression = cVar.f7090a;
                    if (expression == null) {
                        expression = cVar.f7091b;
                    }
                    charSequence = (CharSequence) expression.evaluate(expressionResolver);
                } else {
                    orCreate.logWarning(new Throwable("No option found with value = \"" + str + '\"'));
                    charSequence = "";
                }
                divSelectView2.setText(charSequence);
            }
        }, divStatePath));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivSelectView divSelectView, @NotNull BindingContext bindingContext, @NotNull C0939mb div, @Nullable C0939mb c0939mb, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(divSelectView, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divSelectView.setTextAlignment(5);
        divSelectView.setFocusTracker(divView.getInputFocusTracker$div_release());
        applyOptions(divSelectView, div, bindingContext);
        observeVariable(divSelectView, div, bindingContext, path);
        observeBaseTextProperties(divSelectView, div, c0939mb, expressionResolver);
        observeHintText(divSelectView, div, expressionResolver);
        observeHintColor(divSelectView, div, expressionResolver);
    }
}
