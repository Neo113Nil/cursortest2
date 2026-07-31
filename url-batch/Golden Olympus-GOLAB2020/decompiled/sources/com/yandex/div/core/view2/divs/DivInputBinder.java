package com.yandex.div.core.view2.divs;

import O1.AbstractC0775d8;
import O1.AbstractC1078u7;
import O1.C0847h8;
import O1.C0950n4;
import O1.C0954n8;
import O1.C1060t7;
import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.L5;
import O1.T7;
import O1.U7;
import O1.Z;
import W1.m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.util.inputfilter.InputFiltersHolder;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.validator.ExpressionValidator;
import com.yandex.div.core.util.validator.RegexValidator;
import com.yandex.div.core.util.validator.ValidatorItemData;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivInputBinder extends DivViewBinder<Z.j, C1060t7, DivInputView> {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;

    @NotNull
    private final DivActionBinder actionBinder;

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @NotNull
    private final TwoWayStringVariableBinder variableBinder;

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[EnumC1091v2.values().length];
            try {
                iArr[EnumC1091v2.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1091v2.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1091v2.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1091v2.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1091v2.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[C1060t7.e.values().length];
            try {
                iArr2[C1060t7.e.SINGLE_LINE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[C1060t7.e.MULTI_LINE_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[C1060t7.e.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[C1060t7.e.URI.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[C1060t7.e.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[C1060t7.e.PHONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[C1060t7.e.PASSWORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[C1060t7.d.values().length];
            try {
                iArr3[C1060t7.d.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[C1060t7.d.SEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[C1060t7.d.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[C1060t7.d.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[C1060t7.d.GO.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[C1060t7.a.values().length];
            try {
                iArr4[C1060t7.a.SENTENCES.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[C1060t7.a.WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[C1060t7.a.ALL_CHARACTERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivInputBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivTypefaceResolver typefaceResolver, @NotNull TwoWayStringVariableBinder variableBinder, @NotNull DivActionBinder actionBinder, @NotNull AccessibilityStateProvider accessibilityStateProvider, @NotNull ErrorCollectors errorCollectors) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(typefaceResolver, "typefaceResolver");
        Intrinsics.checkNotNullParameter(variableBinder, "variableBinder");
        Intrinsics.checkNotNullParameter(actionBinder, "actionBinder");
        Intrinsics.checkNotNullParameter(accessibilityStateProvider, "accessibilityStateProvider");
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        this.baseBinder = baseBinder;
        this.typefaceResolver = typefaceResolver;
        this.variableBinder = variableBinder;
        this.actionBinder = actionBinder;
        this.accessibilityStateProvider = accessibilityStateProvider;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyNativeBackgroundColor(DivInputView divInputView, BindingContext bindingContext, C1060t7 c1060t7, C1060t7 c1060t72) {
        Drawable nativeBackground$div_release;
        Drawable drawable;
        Expression expression;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        C1060t7.f fVar = c1060t7.f8009K;
        int intValue = (fVar == null || (expression = fVar.f8100a) == null) ? 0 : ((Number) expression.evaluate(expressionResolver)).intValue();
        if (intValue == 0 || (nativeBackground$div_release = divInputView.getNativeBackground$div_release()) == null) {
            drawable = null;
        } else {
            nativeBackground$div_release.setTint(intValue);
            drawable = nativeBackground$div_release;
        }
        this.baseBinder.bindBackground$div_release(bindingContext, divInputView, c1060t7, c1060t72, ReleasablesKt.getExpressionSubscriber(divInputView), drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextAlignment(DivInputView divInputView, EnumC1091v2 enumC1091v2, EnumC1109w2 enumC1109w2) {
        divInputView.setGravity(BaseDivViewExtensionsKt.evaluateGravity(enumC1091v2, enumC1109w2));
        int i4 = enumC1091v2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC1091v2.ordinal()];
        int i5 = 5;
        if (i4 != 1) {
            if (i4 == 2) {
                i5 = 4;
            } else if (i4 == 3 || (i4 != 4 && i4 == 5)) {
                i5 = 6;
            }
        }
        divInputView.setTextAlignment(i5);
    }

    private final void attachAccessibility(final ValidatorItemData validatorItemData, Div2View div2View, final DivInputView divInputView, final boolean z4) {
        final IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't find label with id '" + validatorItemData.getLabelId() + '\'');
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final DivViewIdProvider viewIdProvider = div2View.getViewComponent$div_release().getViewIdProvider();
        if (!divInputView.isLaidOut() || divInputView.isLayoutRequested()) {
            divInputView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$attachAccessibility$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    view.removeOnLayoutChangeListener(this);
                    int viewId = DivViewIdProvider.this.getViewId(validatorItemData.getLabelId());
                    if (viewId == -1) {
                        orCreate.logError(illegalArgumentException);
                        return;
                    }
                    View findViewById = divInputView.getRootView().findViewById(viewId);
                    if (findViewById != null) {
                        findViewById.setLabelFor(z4 ? -1 : divInputView.getId());
                    } else {
                        orCreate.logError(illegalArgumentException);
                    }
                }
            });
            return;
        }
        int viewId = viewIdProvider.getViewId(validatorItemData.getLabelId());
        if (viewId == -1) {
            orCreate.logError(illegalArgumentException);
            return;
        }
        View findViewById = divInputView.getRootView().findViewById(viewId);
        if (findViewById != null) {
            findViewById.setLabelFor(z4 ? -1 : divInputView.getId());
        } else {
            orCreate.logError(illegalArgumentException);
        }
    }

    private final DivInputBinder$createCallbacks$1 createCallbacks(DivInputView divInputView, BaseInputMask baseInputMask, InputFiltersHolder inputFiltersHolder, Div2View div2View, String str) {
        return new DivInputBinder$createCallbacks$1(baseInputMask, inputFiltersHolder, divInputView, str, div2View);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCapitalization(C1060t7 c1060t7, ExpressionResolver expressionResolver) {
        int i4 = WhenMappings.$EnumSwitchMapping$3[((C1060t7.a) c1060t7.f8035f.evaluate(expressionResolver)).ordinal()];
        if (i4 == 1) {
            return 16384;
        }
        if (i4 == 2) {
            return 8192;
        }
        if (i4 != 3) {
            return 0;
        }
        return Base64Utils.IO_BUFFER_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getImeAction(C1060t7.d dVar) {
        int i4 = WhenMappings.$EnumSwitchMapping$2[dVar.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 4;
        }
        if (i4 == 3) {
            return 6;
        }
        if (i4 == 4) {
            return 3;
        }
        if (i4 == 5) {
            return 2;
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getKeyboardType(C1060t7.e eVar) {
        switch (WhenMappings.$EnumSwitchMapping$1[eVar.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 131073;
            case 3:
                return 33;
            case 4:
                return 17;
            case 5:
                return 12290;
            case 6:
                return 3;
            case 7:
                return 129;
            default:
                throw new m();
        }
    }

    private final void observeBackground(DivInputView divInputView, BindingContext bindingContext, C1060t7 c1060t7, C1060t7 c1060t72, ExpressionResolver expressionResolver) {
        DivInputView divInputView2;
        Expression expression;
        Disposable disposable = null;
        if (DivDataExtensionsKt.equalsToConstant(c1060t7.f8009K, c1060t72 != null ? c1060t72.f8009K : null)) {
            return;
        }
        applyNativeBackgroundColor(divInputView, bindingContext, c1060t7, c1060t72);
        if (DivDataExtensionsKt.isConstant(c1060t7.f8009K)) {
            return;
        }
        C1060t7.f fVar = c1060t7.f8009K;
        if (fVar == null || (expression = fVar.f8100a) == null) {
            divInputView2 = divInputView;
        } else {
            divInputView2 = divInputView;
            disposable = expression.observeAndGet(expressionResolver, new DivInputBinder$observeBackground$1(this, divInputView2, bindingContext, c1060t7, c1060t72));
        }
        divInputView2.addSubscription(disposable);
    }

    private final void observeBaseTextProperties(DivInputView divInputView, C1060t7 c1060t7, C1060t7 c1060t72, ExpressionResolver expressionResolver) {
        Expression expression;
        DivInputBinder divInputBinder;
        Expression expression2;
        Expression expression3 = c1060t7.f8049q;
        Expression expression4 = c1060t7.f8050r;
        Expression expression5 = c1060t7.f8003E;
        Expression expression6 = c1060t7.f8017S;
        Expression expression7 = c1060t7.f8004F;
        Expression expression8 = c1060t7.f8048p;
        Expression expression9 = c1060t7.f8052t;
        Expression expression10 = c1060t7.f8053u;
        Expression expression11 = c1060t7.f8051s;
        Expression expression12 = c1060t72 != null ? c1060t72.f8049q : null;
        Expression expression13 = c1060t72 != null ? c1060t72.f8050r : null;
        Expression expression14 = c1060t72 != null ? c1060t72.f8003E : null;
        Expression expression15 = c1060t72 != null ? c1060t72.f8017S : null;
        Expression expression16 = c1060t72 != null ? c1060t72.f8004F : null;
        Expression expression17 = c1060t72 != null ? c1060t72.f8048p : null;
        Expression expression18 = c1060t72 != null ? c1060t72.f8052t : null;
        Expression expression19 = c1060t72 != null ? c1060t72.f8053u : null;
        if (c1060t72 != null) {
            expression = c1060t72.f8051s;
            expression2 = expression19;
            divInputBinder = this;
        } else {
            expression = null;
            divInputBinder = this;
            expression2 = expression19;
        }
        TextViewExtensionsKt.observeBaseTextProperties(divInputView, expression3, expression4, expression5, expression6, expression7, expression8, expression9, expression10, expression11, expression12, expression13, expression14, expression15, expression16, expression17, expression18, expression2, expression, divInputBinder.typefaceResolver, expressionResolver);
    }

    private final void observeEnterTypeAndActions(DivInputView divInputView, C1060t7 c1060t7, BindingContext bindingContext, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(c1060t7.f8044l.observeAndGet(expressionResolver, new DivInputBinder$observeEnterTypeAndActions$callback$1(c1060t7, expressionResolver, divInputView, this, bindingContext)));
    }

    private final void observeFilters(DivInputView divInputView, C1060t7 c1060t7, BindingContext bindingContext, Function1<? super InputFiltersHolder, Unit> function1) {
        if (c1060t7.f8006H != null) {
            return;
        }
        List<AbstractC1078u7> list = c1060t7.f8046n;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivInputBinder$observeFilters$updateFiltersData$1 divInputBinder$observeFilters$updateFiltersData$1 = new DivInputBinder$observeFilters$updateFiltersData$1(list, function1, expressionResolver, this, bindingContext);
        for (AbstractC1078u7 abstractC1078u7 : list) {
            if (abstractC1078u7 instanceof AbstractC1078u7.d) {
                divInputView.addSubscription(((AbstractC1078u7.d) abstractC1078u7).c().f2460a.observe(expressionResolver, divInputBinder$observeFilters$updateFiltersData$1));
            } else {
                boolean z4 = abstractC1078u7 instanceof AbstractC1078u7.c;
            }
        }
        divInputBinder$observeFilters$updateFiltersData$1.invoke((Object) Unit.f41027a);
    }

    private final void observeHighlightColor(DivInputView divInputView, C1060t7 c1060t7, ExpressionResolver expressionResolver) {
        Expression expression = c1060t7.f8056x;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new DivInputBinder$observeHighlightColor$callback$1(divInputView, expression, expressionResolver)));
    }

    private final void observeHintColor(DivInputView divInputView, C1060t7 c1060t7, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(c1060t7.f8057y.observeAndGet(expressionResolver, new DivInputBinder$observeHintColor$callback$1(divInputView, c1060t7, expressionResolver)));
    }

    private final void observeHintText(DivInputView divInputView, C1060t7 c1060t7, ExpressionResolver expressionResolver) {
        Expression expression = c1060t7.f8058z;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new DivInputBinder$observeHintText$callback$1(divInputView, expression, expressionResolver)));
    }

    private final void observeIsEnabled(DivInputView divInputView, C1060t7 c1060t7, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(c1060t7.f8000B.observeAndGet(expressionResolver, new DivInputBinder$observeIsEnabled$callback$1(divInputView)));
    }

    private final void observeKeyboardTypeAndCapitalization(DivInputView divInputView, C1060t7 c1060t7, ExpressionResolver expressionResolver) {
        DivInputBinder$observeKeyboardTypeAndCapitalization$callback$1 divInputBinder$observeKeyboardTypeAndCapitalization$callback$1 = new DivInputBinder$observeKeyboardTypeAndCapitalization$callback$1(c1060t7, expressionResolver, divInputView, this);
        divInputView.addSubscription(c1060t7.f8001C.observe(expressionResolver, divInputBinder$observeKeyboardTypeAndCapitalization$callback$1));
        divInputView.addSubscription(c1060t7.f8035f.observeAndGet(expressionResolver, divInputBinder$observeKeyboardTypeAndCapitalization$callback$1));
    }

    private final void observeMask(DivInputView divInputView, C1060t7 c1060t7, ExpressionResolver expressionResolver, Div2View div2View, Function1<? super BaseInputMask, Unit> function1) {
        Expression expression;
        Disposable observe;
        G g4 = new G();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        DivInputBinder$observeMask$updateMaskData$1 divInputBinder$observeMask$updateMaskData$1 = new DivInputBinder$observeMask$updateMaskData$1(c1060t7, g4, divInputView, divInputView.getKeyListener(), expressionResolver, function1, new DivInputBinder$observeMask$catchCommonMaskException$1(orCreate), orCreate);
        T7 t7 = c1060t7.f8006H;
        U7 b4 = t7 != null ? t7.b() : null;
        if (b4 instanceof L5) {
            L5 l5 = (L5) b4;
            divInputView.addSubscription(l5.f3683b.observe(expressionResolver, divInputBinder$observeMask$updateMaskData$1));
            for (L5.c cVar : l5.f3684c) {
                divInputView.addSubscription(cVar.f3691a.observe(expressionResolver, divInputBinder$observeMask$updateMaskData$1));
                Expression expression2 = cVar.f3693c;
                if (expression2 != null) {
                    divInputView.addSubscription(expression2.observe(expressionResolver, divInputBinder$observeMask$updateMaskData$1));
                }
                divInputView.addSubscription(cVar.f3692b.observe(expressionResolver, divInputBinder$observeMask$updateMaskData$1));
            }
            divInputView.addSubscription(l5.f3682a.observe(expressionResolver, divInputBinder$observeMask$updateMaskData$1));
        } else if ((b4 instanceof C0950n4) && (expression = ((C0950n4) b4).f7144a) != null && (observe = expression.observe(expressionResolver, divInputBinder$observeMask$updateMaskData$1)) != null) {
            divInputView.addSubscription(observe);
        }
        divInputBinder$observeMask$updateMaskData$1.invoke((Object) Unit.f41027a);
    }

    private final void observeMaxLength(DivInputView divInputView, C1060t7 c1060t7, ExpressionResolver expressionResolver) {
        Expression expression = c1060t7.f8007I;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new DivInputBinder$observeMaxLength$callback$1(divInputView, expression, expressionResolver)));
    }

    private final void observeMaxVisibleLines(DivInputView divInputView, C1060t7 c1060t7, ExpressionResolver expressionResolver) {
        Expression expression = c1060t7.f8008J;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new DivInputBinder$observeMaxVisibleLines$callback$1(divInputView, expression, expressionResolver)));
    }

    private final void observeSelectAllOnFocus(DivInputView divInputView, C1060t7 c1060t7, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(c1060t7.f8013O.observeAndGet(expressionResolver, new DivInputBinder$observeSelectAllOnFocus$callback$1(divInputView, c1060t7, expressionResolver)));
    }

    private final void observeText(DivInputView divInputView, C1060t7 c1060t7, BindingContext bindingContext, DivStatePath divStatePath) {
        String str;
        String str2;
        U7 b4;
        Div2View divView = bindingContext.getDivView();
        divInputView.removeAfterTextChangeListener();
        G g4 = new G();
        observeMask(divInputView, c1060t7, bindingContext.getExpressionResolver(), divView, new DivInputBinder$observeText$1(g4, divInputView));
        G g5 = new G();
        observeFilters(divInputView, c1060t7, bindingContext, new DivInputBinder$observeText$2(g5, divInputView));
        T7 t7 = c1060t7.f8006H;
        if (t7 == null) {
            str = c1060t7.f8018T;
            str2 = null;
        } else if (t7 == null || (b4 = t7.b()) == null || (str = b4.a()) == null) {
            return;
        } else {
            str2 = c1060t7.f8018T;
        }
        divInputView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, createCallbacks(divInputView, (BaseInputMask) g4.f41132b, (InputFiltersHolder) g5.f41132b, divView, str2), divStatePath));
        observeValidators(divInputView, c1060t7, bindingContext.getExpressionResolver(), divView);
    }

    private final void observeTextAlignment(DivInputView divInputView, Expression<EnumC1091v2> expression, Expression<EnumC1109w2> expression2, ExpressionResolver expressionResolver) {
        applyTextAlignment(divInputView, expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver));
        DivInputBinder$observeTextAlignment$callback$1 divInputBinder$observeTextAlignment$callback$1 = new DivInputBinder$observeTextAlignment$callback$1(this, divInputView, expression, expressionResolver, expression2);
        divInputView.addSubscription(expression.observe(expressionResolver, divInputBinder$observeTextAlignment$callback$1));
        divInputView.addSubscription(expression2.observe(expressionResolver, divInputBinder$observeTextAlignment$callback$1));
    }

    private final void observeValidators(final DivInputView divInputView, C1060t7 c1060t7, final ExpressionResolver expressionResolver, final Div2View div2View) {
        final ArrayList arrayList = new ArrayList();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        DivInputBinder$observeValidators$revalidateExpressionValidator$1 divInputBinder$observeValidators$revalidateExpressionValidator$1 = new DivInputBinder$observeValidators$revalidateExpressionValidator$1(this, arrayList, divInputView, div2View, expressionResolver);
        divInputView.addTextChangedListener(new TextWatcher() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                if (editable != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.validate((ValidatorItemData) it.next(), String.valueOf(divInputView.getText()), divInputView, div2View, expressionResolver);
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
        DivInputBinder$observeValidators$callback$1 divInputBinder$observeValidators$callback$1 = new DivInputBinder$observeValidators$callback$1(arrayList, c1060t7, this, expressionResolver, orCreate, divInputView, div2View);
        List list = c1060t7.f8026a0;
        if (list != null) {
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                AbstractC0775d8 abstractC0775d8 = (AbstractC0775d8) obj;
                if (abstractC0775d8 instanceof AbstractC0775d8.d) {
                    AbstractC0775d8.d dVar = (AbstractC0775d8.d) abstractC0775d8;
                    divInputView.addSubscription(dVar.c().f7219c.observe(expressionResolver, divInputBinder$observeValidators$callback$1));
                    divInputView.addSubscription(dVar.c().f7218b.observe(expressionResolver, divInputBinder$observeValidators$callback$1));
                    divInputView.addSubscription(dVar.c().f7217a.observe(expressionResolver, divInputBinder$observeValidators$callback$1));
                } else {
                    if (!(abstractC0775d8 instanceof AbstractC0775d8.c)) {
                        throw new m();
                    }
                    AbstractC0775d8.c cVar = (AbstractC0775d8.c) abstractC0775d8;
                    divInputView.addSubscription(cVar.c().f6377b.observe(expressionResolver, new DivInputBinder$observeValidators$2$1(divInputBinder$observeValidators$revalidateExpressionValidator$1, i4)));
                    divInputView.addSubscription(cVar.c().f6378c.observe(expressionResolver, divInputBinder$observeValidators$callback$1));
                    divInputView.addSubscription(cVar.c().f6376a.observe(expressionResolver, divInputBinder$observeValidators$callback$1));
                }
                i4 = i5;
            }
        }
        divInputBinder$observeValidators$callback$1.invoke((Object) Unit.f41027a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValidatorItemData toValidatorDataItem(AbstractC0775d8 abstractC0775d8, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (!(abstractC0775d8 instanceof AbstractC0775d8.d)) {
            if (!(abstractC0775d8 instanceof AbstractC0775d8.c)) {
                throw new m();
            }
            C0847h8 c4 = ((AbstractC0775d8.c) abstractC0775d8).c();
            return new ValidatorItemData(new ExpressionValidator(((Boolean) c4.f6376a.evaluate(expressionResolver)).booleanValue(), new DivInputBinder$toValidatorDataItem$1(c4, expressionResolver)), c4.f6379d, (String) c4.f6378c.evaluate(expressionResolver));
        }
        C0954n8 c5 = ((AbstractC0775d8.d) abstractC0775d8).c();
        try {
            return new ValidatorItemData(new RegexValidator(new Regex((String) c5.f7219c.evaluate(expressionResolver)), ((Boolean) c5.f7217a.evaluate(expressionResolver)).booleanValue()), c5.f7220d, (String) c5.f7218b.evaluate(expressionResolver));
        } catch (PatternSyntaxException e4) {
            errorCollector.logError(new IllegalArgumentException("Invalid regex pattern '" + e4.getPattern() + '\'', e4));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validate(ValidatorItemData validatorItemData, String str, DivInputView divInputView, Div2View div2View, ExpressionResolver expressionResolver) {
        boolean validate = validatorItemData.getValidator().validate(str);
        VariableMutationHandler.Companion.setVariable(div2View, validatorItemData.getVariableName(), String.valueOf(validate), expressionResolver);
        attachAccessibility(validatorItemData, div2View, divInputView, validate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivInputView divInputView, @NotNull BindingContext bindingContext, @NotNull C1060t7 div, @Nullable C1060t7 c1060t7, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(divInputView, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divInputView.setFocusable(true);
        divInputView.setFocusableInTouchMode(true);
        divInputView.setTextAlignment(5);
        AccessibilityStateProvider accessibilityStateProvider = this.accessibilityStateProvider;
        Context context = divInputView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        divInputView.setAccessibilityEnabled$div_release(accessibilityStateProvider.isAccessibilityEnabled(context));
        observeBackground(divInputView, bindingContext, div, c1060t7, expressionResolver);
        observeBaseTextProperties(divInputView, div, c1060t7, expressionResolver);
        observeTextAlignment(divInputView, div.f8015Q, div.f8016R, expressionResolver);
        observeMaxVisibleLines(divInputView, div, expressionResolver);
        observeMaxLength(divInputView, div, expressionResolver);
        observeHintText(divInputView, div, expressionResolver);
        observeHintColor(divInputView, div, expressionResolver);
        observeHighlightColor(divInputView, div, expressionResolver);
        observeEnterTypeAndActions(divInputView, div, bindingContext, expressionResolver);
        observeSelectAllOnFocus(divInputView, div, expressionResolver);
        observeIsEnabled(divInputView, div, expressionResolver);
        observeText(divInputView, div, bindingContext, path);
        observeKeyboardTypeAndCapitalization(divInputView, div, expressionResolver);
        divInputView.setFocusTracker$div_release(bindingContext.getDivView().getInputFocusTracker$div_release());
        InputFocusTracker focusTracker$div_release = divInputView.getFocusTracker$div_release();
        if (focusTracker$div_release != null) {
            focusTracker$div_release.requestFocusIfNeeded(divInputView);
        }
    }
}
