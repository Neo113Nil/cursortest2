package com.yandex.div.core.view2.divs;

import O1.C0765cg;
import O1.C0839h0;
import O1.C0892k0;
import O1.C1079u8;
import O1.C1165z4;
import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.InterfaceC0752c3;
import O1.Se;
import O1.Vf;
import O1.W5;
import O1.X2;
import O1.Yb;
import O1.Z;
import W1.m;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1281a0;
import com.yandex.div.R$id;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.AbstractC3204l;
import k0.AbstractC3206n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivBaseBinder {

    @NotNull
    private final DivAccessibilityBinder divAccessibilityBinder;

    @NotNull
    private final DivBackgroundBinder divBackgroundBinder;

    @NotNull
    private final DivFocusBinder divFocusBinder;

    @NotNull
    private final DivTooltipController tooltipController;

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Vf.values().length];
            try {
                iArr[Vf.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Vf.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Vf.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivBaseBinder(@NotNull DivBackgroundBinder divBackgroundBinder, @NotNull DivTooltipController tooltipController, @NotNull DivFocusBinder divFocusBinder, @NotNull DivAccessibilityBinder divAccessibilityBinder) {
        Intrinsics.checkNotNullParameter(divBackgroundBinder, "divBackgroundBinder");
        Intrinsics.checkNotNullParameter(tooltipController, "tooltipController");
        Intrinsics.checkNotNullParameter(divFocusBinder, "divFocusBinder");
        Intrinsics.checkNotNullParameter(divAccessibilityBinder, "divAccessibilityBinder");
        this.divBackgroundBinder = divBackgroundBinder;
        this.tooltipController = tooltipController;
        this.divFocusBinder = divFocusBinder;
        this.divAccessibilityBinder = divAccessibilityBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyAccessibilityDescriptionAndHint(View view, String str, String str2) {
        if (str == null) {
            str = str2;
        } else if (str2 != null) {
            str = str + '\n' + str2;
        }
        view.setContentDescription(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyAccessibilityMode(View view, Div2View div2View, InterfaceC0752c3 interfaceC0752c3, C0839h0.c cVar) {
        this.divAccessibilityBinder.bindAccessibilityMode(view, div2View, cVar, interfaceC0752c3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyAccessibilityStateDescription(View view, String str) {
        AbstractC1281a0.J0(view, str);
    }

    private final void applyFocusableState(View view, InterfaceC0752c3 interfaceC0752c3) {
        view.setFocusable(interfaceC0752c3.x() != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyVisibility(View view, Div2View div2View, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver, boolean z4) {
        int i4;
        DivTransitionHandler divTransitionHandler$div_release = div2View.getDivTransitionHandler$div_release();
        int i5 = WhenMappings.$EnumSwitchMapping$0[((Vf) interfaceC0752c3.getVisibility().evaluate(expressionResolver)).ordinal()];
        if (i5 == 1) {
            i4 = 0;
        } else if (i5 == 2) {
            i4 = 4;
        } else {
            if (i5 != 3) {
                throw new m();
            }
            i4 = 8;
        }
        if (i4 != 0) {
            view.clearAnimation();
        }
        int visibility = view.getVisibility();
        List j4 = interfaceC0752c3.j();
        AbstractC3204l abstractC3204l = null;
        if (j4 == null || DivTransitionsKt.allowsTransitionsOnVisibilityChange(j4)) {
            DivTransitionHandler.ChangeType.Visibility lastChange = divTransitionHandler$div_release.getLastChange(view);
            if (lastChange != null) {
                visibility = lastChange.getNew();
            }
            DivTransitionBuilder transitionBuilder = div2View.getViewComponent$div_release().getTransitionBuilder();
            if ((visibility == 4 || visibility == 8) && i4 == 0) {
                abstractC3204l = transitionBuilder.createAndroidTransition(interfaceC0752c3.t(), 1, expressionResolver);
            } else if ((i4 == 4 || i4 == 8) && visibility == 0 && !z4) {
                abstractC3204l = transitionBuilder.createAndroidTransition(interfaceC0752c3.y(), 2, expressionResolver);
            } else if (lastChange != null) {
                AbstractC3206n.c(div2View);
            }
            if (abstractC3204l != null) {
                abstractC3204l.addTarget(view);
            }
        }
        if (abstractC3204l != null) {
            divTransitionHandler$div_release.putTransition(abstractC3204l, view, new DivTransitionHandler.ChangeType.Visibility(i4));
        } else {
            view.setVisibility(i4);
        }
        div2View.trackChildrenVisibility();
    }

    private final void bind(View view, BindingContext bindingContext, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Div2View divView = bindingContext.getDivView();
        ExpressionSubscriber expressionSubscriber = ReleasablesKt.getExpressionSubscriber(view);
        if (Build.VERSION.SDK_INT >= 26) {
            view.setDefaultFocusHighlightEnabled(false);
        }
        bindId(view, divView, interfaceC0752c3, interfaceC0752c32);
        bindLayoutParams(view, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
        bindLayoutProvider(view, bindingContext, interfaceC0752c3, interfaceC0752c32);
        bindAccessibility(view, divView, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
        bindAlpha(view, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
        bindBackground$default(this, view, bindingContext, interfaceC0752c3, interfaceC0752c32, expressionSubscriber, null, 16, null);
        bindBorder(view, bindingContext, interfaceC0752c3);
        bindPaddings(view, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
        bindNextFocus(view, divView, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
        W5 x4 = interfaceC0752c3.x();
        List<C0892k0> list = x4 != null ? x4.f5103e : null;
        W5 x5 = interfaceC0752c3.x();
        bindFocusActions(view, bindingContext, list, x5 != null ? x5.f5102d : null);
        bindVisibility(view, divView, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
        bindTransform(view, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
        List<Se> p4 = interfaceC0752c3.p();
        if (p4 != null) {
            this.tooltipController.mapTooltip(view, p4);
        }
        if (this.divAccessibilityBinder.getEnabled()) {
            return;
        }
        applyFocusableState(view, interfaceC0752c3);
    }

    private final void bindAccessibility(View view, Div2View div2View, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (interfaceC0752c3.d() == null) {
            if ((interfaceC0752c32 != null ? interfaceC0752c32.d() : null) == null) {
                applyAccessibilityMode(view, div2View, interfaceC0752c3, null);
                this.divAccessibilityBinder.bindType(view, interfaceC0752c3, C0839h0.d.AUTO, expressionResolver);
                return;
            }
        }
        bindAccessibilityType(view, interfaceC0752c3, interfaceC0752c32, expressionResolver);
        bindAccessibilityDescriptionAndHint(view, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
        bindAccessibilityMode(view, div2View, interfaceC0752c3, expressionResolver, expressionSubscriber);
        bindAccessibilityStateDescription(view, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
    }

    private final void bindAccessibilityDescriptionAndHint(View view, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        C0839h0 d4;
        C0839h0 d5;
        C0839h0 d6 = interfaceC0752c3.d();
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(d6 != null ? d6.f6315a : null, (interfaceC0752c32 == null || (d5 = interfaceC0752c32.d()) == null) ? null : d5.f6315a)) {
            C0839h0 d7 = interfaceC0752c3.d();
            if (ExpressionsKt.equalsToConstant(d7 != null ? d7.f6316b : null, (interfaceC0752c32 == null || (d4 = interfaceC0752c32.d()) == null) ? null : d4.f6316b)) {
                return;
            }
        }
        C0839h0 d8 = interfaceC0752c3.d();
        String str = (d8 == null || (expression4 = d8.f6315a) == null) ? null : (String) expression4.evaluate(expressionResolver);
        C0839h0 d9 = interfaceC0752c3.d();
        applyAccessibilityDescriptionAndHint(view, str, (d9 == null || (expression3 = d9.f6316b) == null) ? null : (String) expression3.evaluate(expressionResolver));
        C0839h0 d10 = interfaceC0752c3.d();
        if (ExpressionsKt.isConstantOrNull(d10 != null ? d10.f6315a : null)) {
            C0839h0 d11 = interfaceC0752c3.d();
            if (ExpressionsKt.isConstantOrNull(d11 != null ? d11.f6316b : null)) {
                return;
            }
        }
        DivBaseBinder$bindAccessibilityDescriptionAndHint$callback$1 divBaseBinder$bindAccessibilityDescriptionAndHint$callback$1 = new DivBaseBinder$bindAccessibilityDescriptionAndHint$callback$1(this, view, interfaceC0752c3, expressionResolver);
        C0839h0 d12 = interfaceC0752c3.d();
        expressionSubscriber.addSubscription((d12 == null || (expression2 = d12.f6315a) == null) ? null : expression2.observe(expressionResolver, divBaseBinder$bindAccessibilityDescriptionAndHint$callback$1));
        C0839h0 d13 = interfaceC0752c3.d();
        if (d13 != null && (expression = d13.f6316b) != null) {
            disposable = expression.observe(expressionResolver, divBaseBinder$bindAccessibilityDescriptionAndHint$callback$1);
        }
        expressionSubscriber.addSubscription(disposable);
    }

    private final void bindAccessibilityMode(View view, Div2View div2View, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression expression;
        Expression expression2;
        C0839h0 d4 = interfaceC0752c3.d();
        Disposable disposable = null;
        applyAccessibilityMode(view, div2View, interfaceC0752c3, (d4 == null || (expression2 = d4.f6318d) == null) ? null : (C0839h0.c) expression2.evaluate(expressionResolver));
        C0839h0 d5 = interfaceC0752c3.d();
        if (ExpressionsKt.isConstantOrNull(d5 != null ? d5.f6318d : null)) {
            return;
        }
        C0839h0 d6 = interfaceC0752c3.d();
        if (d6 != null && (expression = d6.f6318d) != null) {
            disposable = expression.observe(expressionResolver, new DivBaseBinder$bindAccessibilityMode$1(this, view, div2View, interfaceC0752c3, expressionResolver));
        }
        expressionSubscriber.addSubscription(disposable);
    }

    private final void bindAccessibilityStateDescription(View view, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression expression;
        Expression expression2;
        C0839h0 d4;
        C0839h0 d5 = interfaceC0752c3.d();
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(d5 != null ? d5.f6320f : null, (interfaceC0752c32 == null || (d4 = interfaceC0752c32.d()) == null) ? null : d4.f6320f)) {
            return;
        }
        C0839h0 d6 = interfaceC0752c3.d();
        applyAccessibilityStateDescription(view, (d6 == null || (expression2 = d6.f6320f) == null) ? null : (String) expression2.evaluate(expressionResolver));
        C0839h0 d7 = interfaceC0752c3.d();
        if (ExpressionsKt.isConstantOrNull(d7 != null ? d7.f6320f : null)) {
            return;
        }
        C0839h0 d8 = interfaceC0752c3.d();
        if (d8 != null && (expression = d8.f6320f) != null) {
            disposable = expression.observe(expressionResolver, new DivBaseBinder$bindAccessibilityStateDescription$1(this, view));
        }
        expressionSubscriber.addSubscription(disposable);
    }

    private final void bindAccessibilityType(View view, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver) {
        C0839h0.d dVar;
        if (interfaceC0752c32 != null) {
            C0839h0 d4 = interfaceC0752c3.d();
            C0839h0.d dVar2 = d4 != null ? d4.f6321g : null;
            C0839h0 d5 = interfaceC0752c32.d();
            if (dVar2 == (d5 != null ? d5.f6321g : null)) {
                return;
            }
        }
        DivAccessibilityBinder divAccessibilityBinder = this.divAccessibilityBinder;
        C0839h0 d6 = interfaceC0752c3.d();
        if (d6 == null || (dVar = d6.f6321g) == null) {
            dVar = C0839h0.d.AUTO;
        }
        divAccessibilityBinder.bindType(view, interfaceC0752c3, dVar, expressionResolver);
    }

    private final void bindAlignment(View view, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(interfaceC0752c3.l(), interfaceC0752c32 != null ? interfaceC0752c32.l() : null)) {
            if (ExpressionsKt.equalsToConstant(interfaceC0752c3.s(), interfaceC0752c32 != null ? interfaceC0752c32.s() : null)) {
                return;
            }
        }
        Expression l4 = interfaceC0752c3.l();
        EnumC1091v2 enumC1091v2 = l4 != null ? (EnumC1091v2) l4.evaluate(expressionResolver) : null;
        Expression s4 = interfaceC0752c3.s();
        BaseDivViewExtensionsKt.applyAlignment(view, enumC1091v2, s4 != null ? (EnumC1109w2) s4.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(interfaceC0752c3.l()) && ExpressionsKt.isConstantOrNull(interfaceC0752c3.s())) {
            return;
        }
        DivBaseBinder$bindAlignment$callback$1 divBaseBinder$bindAlignment$callback$1 = new DivBaseBinder$bindAlignment$callback$1(view, interfaceC0752c3, expressionResolver);
        Expression l5 = interfaceC0752c3.l();
        expressionSubscriber.addSubscription(l5 != null ? l5.observe(expressionResolver, divBaseBinder$bindAlignment$callback$1) : null);
        Expression s5 = interfaceC0752c3.s();
        expressionSubscriber.addSubscription(s5 != null ? s5.observe(expressionResolver, divBaseBinder$bindAlignment$callback$1) : null);
    }

    private final void bindAlpha(View view, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(interfaceC0752c3.v(), interfaceC0752c32 != null ? interfaceC0752c32.v() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyAlpha(view, ((Number) interfaceC0752c3.v().evaluate(expressionResolver)).doubleValue());
        if (ExpressionsKt.isConstant(interfaceC0752c3.v())) {
            return;
        }
        expressionSubscriber.addSubscription(interfaceC0752c3.v().observe(expressionResolver, new DivBaseBinder$bindAlpha$1(view)));
    }

    private final void bindBackground(View view, BindingContext bindingContext, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionSubscriber expressionSubscriber, Drawable drawable) {
        W5 x4;
        DivBackgroundBinder divBackgroundBinder = this.divBackgroundBinder;
        List<? extends X2> background = interfaceC0752c3.getBackground();
        List<? extends X2> list = null;
        List<? extends X2> background2 = interfaceC0752c32 != null ? interfaceC0752c32.getBackground() : null;
        W5 x5 = interfaceC0752c3.x();
        List<? extends X2> list2 = x5 != null ? x5.f5099a : null;
        if (interfaceC0752c32 != null && (x4 = interfaceC0752c32.x()) != null) {
            list = x4.f5099a;
        }
        divBackgroundBinder.bindBackground(bindingContext, view, background, background2, list2, list, expressionSubscriber, drawable);
    }

    static /* synthetic */ void bindBackground$default(DivBaseBinder divBaseBinder, View view, BindingContext bindingContext, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionSubscriber expressionSubscriber, Drawable drawable, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            drawable = null;
        }
        divBaseBinder.bindBackground(view, bindingContext, interfaceC0752c3, interfaceC0752c32, expressionSubscriber, drawable);
    }

    private final void bindBorder(View view, BindingContext bindingContext, InterfaceC0752c3 interfaceC0752c3) {
        DivFocusBinder divFocusBinder = this.divFocusBinder;
        W5 x4 = interfaceC0752c3.x();
        divFocusBinder.bindDivBorder(view, bindingContext, x4 != null ? x4.f5100b : null, interfaceC0752c3.w());
    }

    private final void bindFocusActions(View view, BindingContext bindingContext, List<C0892k0> list, List<C0892k0> list2) {
        this.divFocusBinder.bindDivFocusActions(view, bindingContext, list, list2);
    }

    private final void bindHeight(View view, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(interfaceC0752c3.getHeight(), interfaceC0752c32 != null ? interfaceC0752c32.getHeight() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyHeight(view, interfaceC0752c3, expressionResolver);
        BaseDivViewExtensionsKt.applyVerticalWeightValue(view, BaseDivViewExtensionsKt.getWeight(interfaceC0752c3.getHeight(), expressionResolver));
        BaseDivViewExtensionsKt.applyMinHeight(view, getMinSize(interfaceC0752c3.getHeight()), expressionResolver);
        BaseDivViewExtensionsKt.applyMaxHeight(view, getMaxSize(interfaceC0752c3.getHeight()), expressionResolver);
        if (DivDataExtensionsKt.isConstant(interfaceC0752c3.getHeight())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, interfaceC0752c3.getHeight(), expressionResolver, new DivBaseBinder$bindHeight$1(view, interfaceC0752c3, expressionResolver, this));
    }

    private final void bindId(View view, Div2View div2View, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32) {
        if (Intrinsics.areEqual(interfaceC0752c3.getId(), interfaceC0752c32 != null ? interfaceC0752c32.getId() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyId(view, interfaceC0752c3.getId(), div2View.getViewComponent$div_release().getViewIdProvider().getViewId(interfaceC0752c3.getId()));
    }

    private final void bindLayoutParams(View view, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (view.getLayoutParams() == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("LayoutParams should be initialized before view binding");
            }
            view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        }
        bindWidth(view, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
        bindHeight(view, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
        bindMargins(view, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
        bindAlignment(view, interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionSubscriber);
    }

    private final void bindLayoutProvider(final View view, final BindingContext bindingContext, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32) {
        C1079u8 m4;
        C1079u8 m5;
        C1079u8 m6;
        final Div2View divView = bindingContext.getDivView();
        C1165z4 divData = divView.getDivData();
        if (divData == null || (m4 = interfaceC0752c3.m()) == null) {
            return;
        }
        if (StringsKt.x(m4.f8146b, (interfaceC0752c32 == null || (m6 = interfaceC0752c32.m()) == null) ? null : m6.f8146b, false, 2, null)) {
            if (StringsKt.x(m4.f8145a, (interfaceC0752c32 == null || (m5 = interfaceC0752c32.m()) == null) ? null : m5.f8145a, false, 2, null)) {
                return;
            }
        }
        if ((interfaceC0752c32 != null ? interfaceC0752c32.m() : null) != null) {
            clearLayoutProviderVariables(view);
        }
        final String str = m4.f8146b;
        final String str2 = m4.f8145a;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            DivActionTypedUtilsKt.logError(divView, new Throwable("Neither width_variable_name nor height_variable_name found."));
            return;
        }
        DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder = divView.getVariablesHolders$div_release().get(divData);
        if (divLayoutProviderVariablesHolder == null) {
            divLayoutProviderVariablesHolder = new DivLayoutProviderVariablesHolder();
            divLayoutProviderVariablesHolder.observeDivData(divData, bindingContext);
            divView.getVariablesHolders$div_release().put(divData, divLayoutProviderVariablesHolder);
        }
        final DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder2 = divLayoutProviderVariablesHolder;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: y1.l
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                DivBaseBinder.bindLayoutProvider$lambda$5(view, this, divView, str, divLayoutProviderVariablesHolder2, bindingContext, str2, view2, i4, i5, i6, i7, i8, i9, i10, i11);
            }
        };
        if (view.getWidth() > 0 || view.getHeight() > 0) {
            onLayoutChangeListener.onLayoutChange(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), 0, 0, 0, 0);
        }
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        view.setTag(R$id.div_layout_provider_listener_id, onLayoutChangeListener);
        if (divView.getClearVariablesListener$div_release() != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: y1.m
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean bindLayoutProvider$lambda$8;
                bindLayoutProvider$lambda$8 = DivBaseBinder.bindLayoutProvider$lambda$8(DivLayoutProviderVariablesHolder.this, divView);
                return bindLayoutProvider$lambda$8;
            }
        };
        divView.setClearVariablesListener$div_release(onPreDrawListener);
        divView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindLayoutProvider$lambda$5(View this_bindLayoutProvider, DivBaseBinder this$0, Div2View divView, String str, DivLayoutProviderVariablesHolder variablesHolder, BindingContext bindingContext, String str2, View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this_bindLayoutProvider, "$this_bindLayoutProvider");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(divView, "$divView");
        Intrinsics.checkNotNullParameter(variablesHolder, "$variablesHolder");
        Intrinsics.checkNotNullParameter(bindingContext, "$bindingContext");
        DisplayMetrics metrics = this_bindLayoutProvider.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
        this$0.updateSizeVariable(divView, metrics, str, variablesHolder, i4, i6, i8, i10, bindingContext.getExpressionResolver());
        this$0.updateSizeVariable(divView, metrics, str2, variablesHolder, i5, i7, i9, i11, bindingContext.getExpressionResolver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLayoutProvider$lambda$8(DivLayoutProviderVariablesHolder variablesHolder, Div2View divView) {
        Intrinsics.checkNotNullParameter(variablesHolder, "$variablesHolder");
        Intrinsics.checkNotNullParameter(divView, "$divView");
        variablesHolder.clear();
        for (Map.Entry<ExpressionResolver, Map<String, Integer>> entry : divView.getLayoutSizes$div_release().entrySet()) {
            ExpressionResolver key = entry.getKey();
            for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                VariableMutationHandler.Companion.setVariable(divView, entry2.getKey(), String.valueOf(entry2.getValue().intValue()), key);
            }
        }
        divView.getLayoutSizes$div_release().clear();
        return true;
    }

    private final void bindMargins(View view, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(interfaceC0752c3.g(), interfaceC0752c32 != null ? interfaceC0752c32.g() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyMargins(view, interfaceC0752c3.g(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(interfaceC0752c3.g())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, interfaceC0752c3.g(), expressionResolver, new DivBaseBinder$bindMargins$1(view, interfaceC0752c3, expressionResolver));
    }

    private final void bindNextFocus(View view, Div2View div2View, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        W5 x4;
        W5.c cVar;
        W5.c cVar2;
        W5 x5;
        W5.c cVar3;
        W5.c cVar4;
        W5 x6;
        W5.c cVar5;
        W5.c cVar6;
        W5 x7;
        W5.c cVar7;
        W5.c cVar8;
        W5 x8;
        W5.c cVar9;
        W5.c cVar10;
        DivViewIdProvider viewIdProvider = div2View.getViewComponent$div_release().getViewIdProvider();
        W5 x9 = interfaceC0752c3.x();
        Expression expression = (x9 == null || (cVar10 = x9.f5101c) == null) ? null : cVar10.f5109b;
        if (!ExpressionsKt.equalsToConstant(expression, (interfaceC0752c32 == null || (x8 = interfaceC0752c32.x()) == null || (cVar9 = x8.f5101c) == null) ? null : cVar9.f5109b)) {
            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
            view.setNextFocusForwardId(viewIdProvider.getViewId(str));
            view.setAccessibilityTraversalBefore(viewIdProvider.getViewId(str));
            if (!ExpressionsKt.isConstantOrNull(expression)) {
                expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$1(view, viewIdProvider)) : null);
            }
        }
        W5 x10 = interfaceC0752c3.x();
        Expression expression2 = (x10 == null || (cVar8 = x10.f5101c) == null) ? null : cVar8.f5110c;
        if (!ExpressionsKt.equalsToConstant(expression2, (interfaceC0752c32 == null || (x7 = interfaceC0752c32.x()) == null || (cVar7 = x7.f5101c) == null) ? null : cVar7.f5110c)) {
            view.setNextFocusLeftId(viewIdProvider.getViewId(expression2 != null ? (String) expression2.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression2)) {
                expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, new DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$2(view, viewIdProvider)) : null);
            }
        }
        W5 x11 = interfaceC0752c3.x();
        Expression expression3 = (x11 == null || (cVar6 = x11.f5101c) == null) ? null : cVar6.f5111d;
        if (!ExpressionsKt.equalsToConstant(expression3, (interfaceC0752c32 == null || (x6 = interfaceC0752c32.x()) == null || (cVar5 = x6.f5101c) == null) ? null : cVar5.f5111d)) {
            view.setNextFocusRightId(viewIdProvider.getViewId(expression3 != null ? (String) expression3.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression3)) {
                expressionSubscriber.addSubscription(expression3 != null ? expression3.observe(expressionResolver, new DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$3(view, viewIdProvider)) : null);
            }
        }
        W5 x12 = interfaceC0752c3.x();
        Expression expression4 = (x12 == null || (cVar4 = x12.f5101c) == null) ? null : cVar4.f5112e;
        if (!ExpressionsKt.equalsToConstant(expression4, (interfaceC0752c32 == null || (x5 = interfaceC0752c32.x()) == null || (cVar3 = x5.f5101c) == null) ? null : cVar3.f5112e)) {
            view.setNextFocusUpId(viewIdProvider.getViewId(expression4 != null ? (String) expression4.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression4)) {
                expressionSubscriber.addSubscription(expression4 != null ? expression4.observe(expressionResolver, new DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$4(view, viewIdProvider)) : null);
            }
        }
        W5 x13 = interfaceC0752c3.x();
        Expression expression5 = (x13 == null || (cVar2 = x13.f5101c) == null) ? null : cVar2.f5108a;
        if (ExpressionsKt.equalsToConstant(expression5, (interfaceC0752c32 == null || (x4 = interfaceC0752c32.x()) == null || (cVar = x4.f5101c) == null) ? null : cVar.f5108a)) {
            return;
        }
        view.setNextFocusDownId(viewIdProvider.getViewId(expression5 != null ? (String) expression5.evaluate(expressionResolver) : null));
        if (ExpressionsKt.isConstantOrNull(expression5)) {
            return;
        }
        expressionSubscriber.addSubscription(expression5 != null ? expression5.observe(expressionResolver, new DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$5(view, viewIdProvider)) : null);
    }

    private final void bindPaddings(View view, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (view instanceof DivPagerView) {
            return;
        }
        if (DivDataExtensionsKt.equalsToConstant(interfaceC0752c3.i(), interfaceC0752c32 != null ? interfaceC0752c32.i() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyPaddings(view, interfaceC0752c3.i(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(interfaceC0752c3.i())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, interfaceC0752c3.i(), expressionResolver, new DivBaseBinder$bindPaddings$1(view, interfaceC0752c3, expressionResolver));
    }

    private final void bindTransform(View view, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(interfaceC0752c3.b(), interfaceC0752c32 != null ? interfaceC0752c32.b() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyTransform(view, interfaceC0752c3.b(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(interfaceC0752c3.b())) {
            return;
        }
        ExpressionSubscribersKt.observeTransform(expressionSubscriber, interfaceC0752c3.b(), expressionResolver, new DivBaseBinder$bindTransform$1(view, interfaceC0752c3, expressionResolver));
    }

    private final void bindVisibility(View view, Div2View div2View, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(interfaceC0752c3.getVisibility(), interfaceC0752c32 != null ? interfaceC0752c32.getVisibility() : null)) {
            return;
        }
        applyVisibility(view, div2View, interfaceC0752c3, expressionResolver, interfaceC0752c32 == null);
        if (ExpressionsKt.isConstant(interfaceC0752c3.getVisibility())) {
            return;
        }
        expressionSubscriber.addSubscription(interfaceC0752c3.getVisibility().observe(expressionResolver, new DivBaseBinder$bindVisibility$1(this, view, div2View, interfaceC0752c3, expressionResolver)));
    }

    private final void bindWidth(View view, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(interfaceC0752c3.getWidth(), interfaceC0752c32 != null ? interfaceC0752c32.getWidth() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyWidth(view, interfaceC0752c3, expressionResolver);
        BaseDivViewExtensionsKt.applyHorizontalWeightValue(view, BaseDivViewExtensionsKt.getWeight(interfaceC0752c3.getWidth(), expressionResolver));
        BaseDivViewExtensionsKt.applyMinWidth(view, getMinSize(interfaceC0752c3.getWidth()), expressionResolver);
        BaseDivViewExtensionsKt.applyMaxWidth(view, getMaxSize(interfaceC0752c3.getWidth()), expressionResolver);
        if (DivDataExtensionsKt.isConstant(interfaceC0752c3.getWidth())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, interfaceC0752c3.getWidth(), expressionResolver, new DivBaseBinder$bindWidth$1(view, interfaceC0752c3, expressionResolver, this));
    }

    private final void clearLayoutProviderVariables(View view) {
        Object tag = view.getTag(R$id.div_layout_provider_listener_id);
        view.removeOnLayoutChangeListener(tag instanceof View.OnLayoutChangeListener ? (View.OnLayoutChangeListener) tag : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0765cg.c getMaxSize(Yb yb) {
        C0765cg c4;
        Yb.e eVar = yb instanceof Yb.e ? (Yb.e) yb : null;
        if (eVar == null || (c4 = eVar.c()) == null) {
            return null;
        }
        return c4.f5971b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0765cg.c getMinSize(Yb yb) {
        C0765cg c4;
        Yb.e eVar = yb instanceof Yb.e ? (Yb.e) yb : null;
        if (eVar == null || (c4 = eVar.c()) == null) {
            return null;
        }
        return c4.f5972c;
    }

    private final void updateSizeVariable(Div2View div2View, DisplayMetrics displayMetrics, String str, DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder, int i4, int i5, int i6, int i7, ExpressionResolver expressionResolver) {
        int i8;
        if (str == null || str.length() == 0 || (i8 = i5 - i4) == i7 - i6) {
            return;
        }
        if (divLayoutProviderVariablesHolder.contains(str)) {
            DivActionTypedUtilsKt.logError(div2View, new Throwable("Size subscriber affects original view size. Relayout was prevented."));
            return;
        }
        Map<ExpressionResolver, Map<String, Integer>> layoutSizes$div_release = div2View.getLayoutSizes$div_release();
        Map<String, Integer> map = layoutSizes$div_release.get(expressionResolver);
        if (map == null) {
            map = new LinkedHashMap<>();
            layoutSizes$div_release.put(expressionResolver, map);
        }
        map.put(str, Integer.valueOf(BaseDivViewExtensionsKt.pxToDp(Integer.valueOf(i8), displayMetrics)));
    }

    public final void bindBackground$div_release(@NotNull BindingContext context, @NotNull View target, @NotNull InterfaceC0752c3 newDiv, @Nullable InterfaceC0752c3 interfaceC0752c3, @NotNull ExpressionSubscriber subscriber, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(newDiv, "newDiv");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        bindBackground(target, context, newDiv, interfaceC0752c3, subscriber, drawable);
        bindPaddings(target, newDiv, interfaceC0752c3, context.getExpressionResolver(), subscriber);
    }

    public final void bindId$div_release(@NotNull Div2View divView, @NotNull View target, @Nullable String str) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(target, "target");
        BaseDivViewExtensionsKt.applyId(target, str, str == null ? -1 : divView.getViewComponent$div_release().getViewIdProvider().getViewId(str));
    }

    public final void bindLayoutParams$div_release(@NotNull View target, @NotNull InterfaceC0752c3 newDiv, @Nullable InterfaceC0752c3 interfaceC0752c3, @NotNull ExpressionResolver resolver, @NotNull ExpressionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(newDiv, "newDiv");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        bindLayoutParams(target, newDiv, interfaceC0752c3, resolver, subscriber);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindView(@NotNull BindingContext context, @NotNull View view, @NotNull Z div, @Nullable Z z4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        DivHolderView divHolderView = (DivHolderView) view;
        divHolderView.closeAllSubscription();
        divHolderView.setDiv(div);
        divHolderView.setBindingContext(context);
        bind(view, context, div.b(), z4 != null ? z4.b() : null);
    }
}
