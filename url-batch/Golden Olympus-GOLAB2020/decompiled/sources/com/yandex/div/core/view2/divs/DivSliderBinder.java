package com.yandex.div.core.view2.divs;

import O1.C0754c5;
import O1.C0886jc;
import O1.C1081ua;
import O1.EnumC0779dc;
import O1.EnumC0791e6;
import O1.J4;
import O1.X4;
import O1.Z;
import W1.m;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.core.view.M;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import com.yandex.div.internal.widget.slider.SliderView;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import j2.AbstractC3185a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivSliderBinder extends DivViewBinder<Z.n, C0886jc, DivSliderView> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private ErrorCollector errorCollector;

    @NotNull
    private final ErrorCollectors errorCollectors;
    private final float horizontalInterceptionAngle;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @NotNull
    private final TwoWayIntegerVariableBinder variableBinder;
    private final boolean visualErrorsEnabled;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    static final class Companion {

        @Metadata
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC0779dc.values().length];
                try {
                    iArr[EnumC0779dc.DP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0779dc.SP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC0779dc.PX.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int applyUnit(@NotNull C0754c5 c0754c5, long j4, @NotNull ExpressionResolver resolver, @NotNull DisplayMetrics metrics) {
            Intrinsics.checkNotNullParameter(c0754c5, "<this>");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            return castToUnit(j4, (EnumC0779dc) c0754c5.f5856g.evaluate(resolver), metrics);
        }

        public final int castToUnit(long j4, @NotNull EnumC0779dc unit, @NotNull DisplayMetrics metrics) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            int i4 = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
            if (i4 == 1) {
                return BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j4), metrics);
            }
            if (i4 == 2) {
                return BaseDivViewExtensionsKt.spToPx(Long.valueOf(j4), metrics);
            }
            if (i4 != 3) {
                throw new m();
            }
            long j5 = j4 >> 31;
            if (j5 == 0 || j5 == -1) {
                return (int) j4;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + j4 + "' to Int");
            }
            return j4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        @NotNull
        public final SliderTextStyle toSliderTextStyle(@NotNull C0886jc.d dVar, @NotNull DisplayMetrics metrics, @NotNull DivTypefaceResolver typefaceResolver, @NotNull ExpressionResolver resolver) {
            J4 j4;
            J4 j42;
            int i4;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            Intrinsics.checkNotNullParameter(typefaceResolver, "typefaceResolver");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            long longValue = ((Number) dVar.f6679b.evaluate(resolver)).longValue();
            Expression expression = dVar.f6678a;
            Integer num = null;
            DivTypefaceProvider typefaceProvider = typefaceResolver.getTypefaceProvider(expression != null ? (String) expression.evaluate(resolver) : null);
            String fontVariations = typefaceProvider.isVariable() ? TextViewExtensionsKt.getFontVariations(dVar.f6682e, dVar.f6683f, dVar.f6681d, resolver) : "";
            float fontSizeToPx = BaseDivViewExtensionsKt.fontSizeToPx(longValue, (EnumC0779dc) dVar.f6680c.evaluate(resolver), metrics);
            float doubleValue = ((float) ((Number) dVar.f6684g.evaluate(resolver)).doubleValue()) / longValue;
            EnumC0791e6 enumC0791e6 = (EnumC0791e6) dVar.f6682e.evaluate(resolver);
            Expression expression2 = dVar.f6683f;
            if (expression2 != null) {
                long longValue2 = ((Number) expression2.evaluate(resolver)).longValue();
                long j5 = longValue2 >> 31;
                if (j5 == 0 || j5 == -1) {
                    i4 = (int) longValue2;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue2 + "' to Int");
                    }
                    i4 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                num = Integer.valueOf(i4);
            }
            Typeface typeface = DivTypefaceResolverKt.getTypeface(enumC0791e6, num, typefaceProvider);
            Intrinsics.checkNotNullExpressionValue(typeface, "getTypeface(\n           …rovider\n                )");
            C1081ua c1081ua = dVar.f6685h;
            float f4 = 0.0f;
            float px = (c1081ua == null || (j42 = c1081ua.f8167a) == null) ? 0.0f : BaseDivViewExtensionsKt.toPx(j42, metrics, resolver);
            C1081ua c1081ua2 = dVar.f6685h;
            if (c1081ua2 != null && (j4 = c1081ua2.f8168b) != null) {
                f4 = BaseDivViewExtensionsKt.toPx(j4, metrics, resolver);
            }
            return new SliderTextStyle(fontSizeToPx, doubleValue, typeface, px, f4, ((Number) dVar.f6686i.evaluate(resolver)).intValue(), fontVariations);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivSliderBinder(@NotNull DivBaseBinder baseBinder, @NotNull Div2Logger logger, @NotNull DivTypefaceResolver typefaceResolver, @NotNull TwoWayIntegerVariableBinder variableBinder, @NotNull ErrorCollectors errorCollectors, float f4, boolean z4) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(typefaceResolver, "typefaceResolver");
        Intrinsics.checkNotNullParameter(variableBinder, "variableBinder");
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        this.logger = logger;
        this.typefaceResolver = typefaceResolver;
        this.variableBinder = variableBinder;
        this.errorCollectors = errorCollectors;
        this.horizontalInterceptionAngle = f4;
        this.visualErrorsEnabled = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbSecondaryStyle(SliderView sliderView, ExpressionResolver expressionResolver, X4 x4) {
        DisplayMetrics displayMetrics = sliderView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        sliderView.setThumbSecondaryDrawable(BaseDivViewExtensionsKt.toDrawable(x4, displayMetrics, expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbSecondaryTextStyle(SliderView sliderView, ExpressionResolver expressionResolver, C0886jc.d dVar) {
        TextDrawable textDrawable;
        if (dVar != null) {
            Companion companion = Companion;
            DisplayMetrics displayMetrics = sliderView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            textDrawable = new TextDrawable(companion.toSliderTextStyle(dVar, displayMetrics, this.typefaceResolver, expressionResolver));
        } else {
            textDrawable = null;
        }
        sliderView.setThumbSecondTextDrawable(textDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbStyle(SliderView sliderView, ExpressionResolver expressionResolver, X4 x4) {
        DisplayMetrics displayMetrics = sliderView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        sliderView.setThumbDrawable(BaseDivViewExtensionsKt.toDrawable(x4, displayMetrics, expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbTextStyle(SliderView sliderView, ExpressionResolver expressionResolver, C0886jc.d dVar) {
        TextDrawable textDrawable;
        if (dVar != null) {
            Companion companion = Companion;
            DisplayMetrics displayMetrics = sliderView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            textDrawable = new TextDrawable(companion.toSliderTextStyle(dVar, displayMetrics, this.typefaceResolver, expressionResolver));
        } else {
            textDrawable = null;
        }
        sliderView.setThumbTextDrawable(textDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTickMarkActiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, X4 x4) {
        Drawable drawable;
        if (x4 != null) {
            DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            drawable = BaseDivViewExtensionsKt.toDrawable(x4, displayMetrics, expressionResolver);
        } else {
            drawable = null;
        }
        divSliderView.setActiveTickMarkDrawable(drawable);
        checkSliderTicks(divSliderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTickMarkInactiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, X4 x4) {
        Drawable drawable;
        if (x4 != null) {
            DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            drawable = BaseDivViewExtensionsKt.toDrawable(x4, displayMetrics, expressionResolver);
        } else {
            drawable = null;
        }
        divSliderView.setInactiveTickMarkDrawable(drawable);
        checkSliderTicks(divSliderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTrackActiveStyle(SliderView sliderView, ExpressionResolver expressionResolver, X4 x4) {
        DisplayMetrics displayMetrics = sliderView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        sliderView.setActiveTrackDrawable(BaseDivViewExtensionsKt.toDrawable(x4, displayMetrics, expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTrackInactiveStyle(SliderView sliderView, ExpressionResolver expressionResolver, X4 x4) {
        DisplayMetrics displayMetrics = sliderView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        sliderView.setInactiveTrackDrawable(BaseDivViewExtensionsKt.toDrawable(x4, displayMetrics, expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkSliderTicks(final DivSliderView divSliderView) {
        if (!this.visualErrorsEnabled || this.errorCollector == null) {
            return;
        }
        M.a(divSliderView, new Runnable() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$checkSliderTicks$$inlined$doOnPreDraw$1
            /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
            
                r0 = r3.errorCollector;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                ErrorCollector errorCollector;
                ErrorCollector errorCollector2;
                ErrorCollector errorCollector3;
                if (divSliderView.getActiveTickMarkDrawable() == null && divSliderView.getInactiveTickMarkDrawable() == null) {
                    return;
                }
                float maxValue = divSliderView.getMaxValue() - divSliderView.getMinValue();
                Drawable activeTickMarkDrawable = divSliderView.getActiveTickMarkDrawable();
                boolean z4 = false;
                int intrinsicWidth = activeTickMarkDrawable != null ? activeTickMarkDrawable.getIntrinsicWidth() : 0;
                if (Math.max(intrinsicWidth, divSliderView.getInactiveTickMarkDrawable() != null ? r3.getIntrinsicWidth() : 0) * maxValue > divSliderView.getWidth()) {
                    errorCollector = this.errorCollector;
                    if (errorCollector != null) {
                        errorCollector2 = this.errorCollector;
                        Intrinsics.checkNotNull(errorCollector2);
                        Iterator<Throwable> warnings = errorCollector2.getWarnings();
                        while (warnings.hasNext()) {
                            if (Intrinsics.areEqual(warnings.next().getMessage(), "Slider ticks overlap each other.")) {
                                z4 = true;
                            }
                        }
                        if (z4 || errorCollector3 == null) {
                            return;
                        }
                        errorCollector3.logWarning(new Throwable("Slider ticks overlap each other."));
                    }
                }
            }
        });
    }

    private final void observeThumbSecondaryStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, X4 x4) {
        if (x4 == null) {
            return;
        }
        applyThumbSecondaryStyle(divSliderView, expressionResolver, x4);
        ExpressionSubscribersKt.observeDrawable(divSliderView, x4, expressionResolver, new DivSliderBinder$observeThumbSecondaryStyle$1(this, divSliderView, expressionResolver, x4));
    }

    private final void observeThumbSecondaryTextStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, C0886jc.d dVar) {
        applyThumbSecondaryTextStyle(divSliderView, expressionResolver, dVar);
        if (dVar == null) {
            return;
        }
        divSliderView.addSubscription(dVar.f6686i.observe(expressionResolver, new DivSliderBinder$observeThumbSecondaryTextStyle$1(this, divSliderView, expressionResolver, dVar)));
    }

    private final void observeThumbSecondaryValue(final DivSliderView divSliderView, String str, final BindingContext bindingContext, DivStatePath divStatePath) {
        divSliderView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull final Function1<? super Long, Unit> valueUpdater) {
                Intrinsics.checkNotNullParameter(valueUpdater, "valueUpdater");
                final DivSliderView divSliderView2 = DivSliderView.this;
                final DivSliderBinder divSliderBinder = this;
                final BindingContext bindingContext2 = bindingContext;
                divSliderView2.addOnThumbChangedListener(new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1$setViewStateChangeListener$1
                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public void onThumbSecondaryValueChanged(@Nullable Float f4) {
                        Div2Logger div2Logger;
                        div2Logger = DivSliderBinder.this.logger;
                        div2Logger.logSliderDrag(bindingContext2.getDivView(), divSliderView2, f4);
                        valueUpdater.invoke(Long.valueOf(f4 != null ? AbstractC3185a.e(f4.floatValue()) : 0L));
                    }
                });
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Long l4) {
                DivSliderView.this.setThumbSecondaryValue(l4 != null ? Float.valueOf(l4.longValue()) : null, false);
            }
        }, divStatePath));
    }

    private final void observeThumbStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, X4 x4) {
        applyThumbStyle(divSliderView, expressionResolver, x4);
        ExpressionSubscribersKt.observeDrawable(divSliderView, x4, expressionResolver, new DivSliderBinder$observeThumbStyle$1(this, divSliderView, expressionResolver, x4));
    }

    private final void observeThumbTextStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, C0886jc.d dVar) {
        applyThumbTextStyle(divSliderView, expressionResolver, dVar);
        if (dVar == null) {
            return;
        }
        divSliderView.addSubscription(dVar.f6686i.observe(expressionResolver, new DivSliderBinder$observeThumbTextStyle$1(this, divSliderView, expressionResolver, dVar)));
    }

    private final void observeThumbValue(final DivSliderView divSliderView, C0886jc c0886jc, final BindingContext bindingContext, DivStatePath divStatePath) {
        String str = c0886jc.f6617E;
        if (str == null) {
            return;
        }
        divSliderView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull final Function1<? super Long, Unit> valueUpdater) {
                Intrinsics.checkNotNullParameter(valueUpdater, "valueUpdater");
                final DivSliderView divSliderView2 = DivSliderView.this;
                final DivSliderBinder divSliderBinder = this;
                final BindingContext bindingContext2 = bindingContext;
                divSliderView2.addOnThumbChangedListener(new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1$setViewStateChangeListener$1
                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public void onThumbValueChanged(float f4) {
                        Div2Logger div2Logger;
                        div2Logger = DivSliderBinder.this.logger;
                        div2Logger.logSliderDrag(bindingContext2.getDivView(), divSliderView2, Float.valueOf(f4));
                        valueUpdater.invoke(Long.valueOf(AbstractC3185a.e(f4)));
                    }
                });
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Long l4) {
                DivSliderView.this.setThumbValue(l4 != null ? l4.longValue() : 0.0f, false);
            }
        }, divStatePath));
    }

    private final void observeTickMarkActiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, X4 x4) {
        applyTickMarkActiveStyle(divSliderView, expressionResolver, x4);
        ExpressionSubscribersKt.observeDrawable(divSliderView, x4, expressionResolver, new DivSliderBinder$observeTickMarkActiveStyle$1(this, divSliderView, expressionResolver, x4));
    }

    private final void observeTickMarkInactiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, X4 x4) {
        applyTickMarkInactiveStyle(divSliderView, expressionResolver, x4);
        ExpressionSubscribersKt.observeDrawable(divSliderView, x4, expressionResolver, new DivSliderBinder$observeTickMarkInactiveStyle$1(this, divSliderView, expressionResolver, x4));
    }

    private final void observeTrackActiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, X4 x4) {
        applyTrackActiveStyle(divSliderView, expressionResolver, x4);
        ExpressionSubscribersKt.observeDrawable(divSliderView, x4, expressionResolver, new DivSliderBinder$observeTrackActiveStyle$1(this, divSliderView, expressionResolver, x4));
    }

    private final void observeTrackInactiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, X4 x4) {
        applyTrackInactiveStyle(divSliderView, expressionResolver, x4);
        ExpressionSubscribersKt.observeDrawable(divSliderView, x4, expressionResolver, new DivSliderBinder$observeTrackInactiveStyle$1(this, divSliderView, expressionResolver, x4));
    }

    private final void setupRanges(DivSliderView divSliderView, C0886jc c0886jc, ExpressionResolver expressionResolver) {
        DivSliderView divSliderView2;
        ExpressionResolver expressionResolver2;
        divSliderView.getRanges().clear();
        List<C0886jc.c> list = c0886jc.f6655u;
        if (list == null) {
            return;
        }
        DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
        for (C0886jc.c cVar : list) {
            SliderView.Range range = new SliderView.Range();
            divSliderView.getRanges().add(range);
            Expression expression = cVar.f6666c;
            if (expression == null) {
                expression = c0886jc.f6653s;
            }
            divSliderView.addSubscription(expression.observeAndGet(expressionResolver, new DivSliderBinder$setupRanges$1$1(divSliderView, range)));
            Expression expression2 = cVar.f6664a;
            if (expression2 == null) {
                expression2 = c0886jc.f6652r;
            }
            divSliderView.addSubscription(expression2.observeAndGet(expressionResolver, new DivSliderBinder$setupRanges$1$2(divSliderView, range)));
            C0754c5 c0754c5 = cVar.f6665b;
            if (c0754c5 == null) {
                range.setMarginStart(0);
                range.setMarginEnd(0);
                divSliderView2 = divSliderView;
                expressionResolver2 = expressionResolver;
            } else {
                Expression expression3 = c0754c5.f5854e;
                boolean z4 = (expression3 == null && c0754c5.f5851b == null) ? false : true;
                if (!z4) {
                    expression3 = c0754c5.f5852c;
                }
                Expression expression4 = expression3;
                Expression expression5 = z4 ? c0754c5.f5851b : c0754c5.f5853d;
                if (expression4 != null) {
                    divSliderView2 = divSliderView;
                    DisplayMetrics displayMetrics2 = displayMetrics;
                    ExpressionResolver expressionResolver3 = expressionResolver;
                    DivSliderBinder$setupRanges$1$3$1$1 divSliderBinder$setupRanges$1$3$1$1 = new DivSliderBinder$setupRanges$1$3$1$1(divSliderView2, range, c0754c5, expressionResolver3, displayMetrics2);
                    expressionResolver2 = expressionResolver3;
                    displayMetrics = displayMetrics2;
                    divSliderView2.addSubscription(expression4.observe(expressionResolver2, divSliderBinder$setupRanges$1$3$1$1));
                } else {
                    divSliderView2 = divSliderView;
                    expressionResolver2 = expressionResolver;
                }
                if (expression5 != null) {
                    ExpressionResolver expressionResolver4 = expressionResolver2;
                    DisplayMetrics displayMetrics3 = displayMetrics;
                    DivSliderBinder$setupRanges$1$3$2$1 divSliderBinder$setupRanges$1$3$2$1 = new DivSliderBinder$setupRanges$1$3$2$1(divSliderView2, range, c0754c5, expressionResolver4, displayMetrics3);
                    expressionResolver2 = expressionResolver4;
                    displayMetrics = displayMetrics3;
                    divSliderView2.addSubscription(expression5.observe(expressionResolver2, divSliderBinder$setupRanges$1$3$2$1));
                }
                Expression expression6 = c0754c5.f5856g;
                DisplayMetrics displayMetrics4 = displayMetrics;
                DivSliderBinder$setupRanges$1$3$3 divSliderBinder$setupRanges$1$3$3 = new DivSliderBinder$setupRanges$1$3$3(divSliderView2, expression4, expression5, range, expressionResolver2, displayMetrics4);
                range = range;
                displayMetrics = displayMetrics4;
                expression6.observeAndGet(expressionResolver2, divSliderBinder$setupRanges$1$3$3);
            }
            X4 x4 = cVar.f6667d;
            if (x4 == null) {
                x4 = c0886jc.f6621I;
            }
            X4 x42 = x4;
            DivSliderBinder$setupRanges$1$applyActiveTrackStyle$1 divSliderBinder$setupRanges$1$applyActiveTrackStyle$1 = new DivSliderBinder$setupRanges$1$applyActiveTrackStyle$1(divSliderView2, range, x42, displayMetrics, expressionResolver2);
            Unit unit = Unit.f41027a;
            divSliderBinder$setupRanges$1$applyActiveTrackStyle$1.invoke((Object) unit);
            ExpressionSubscribersKt.observeDrawable(divSliderView2, x42, expressionResolver2, divSliderBinder$setupRanges$1$applyActiveTrackStyle$1);
            X4 x43 = cVar.f6668e;
            if (x43 == null) {
                x43 = c0886jc.f6622J;
            }
            X4 x44 = x43;
            DivSliderBinder$setupRanges$1$applyInactiveTrackStyle$1 divSliderBinder$setupRanges$1$applyInactiveTrackStyle$1 = new DivSliderBinder$setupRanges$1$applyInactiveTrackStyle$1(divSliderView2, range, x44, displayMetrics, expressionResolver2);
            divSliderBinder$setupRanges$1$applyInactiveTrackStyle$1.invoke((Object) unit);
            ExpressionSubscribersKt.observeDrawable(divSliderView2, x44, expressionResolver2, divSliderBinder$setupRanges$1$applyInactiveTrackStyle$1);
            divSliderView = divSliderView2;
            expressionResolver = expressionResolver2;
        }
    }

    private final void setupSecondaryThumb(DivSliderView divSliderView, C0886jc c0886jc, BindingContext bindingContext, DivStatePath divStatePath) {
        String str = c0886jc.f6614B;
        Unit unit = null;
        if (str == null) {
            divSliderView.setThumbSecondaryDrawable(null);
            divSliderView.setThumbSecondaryValue(null, false);
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        observeThumbSecondaryValue(divSliderView, str, bindingContext, divStatePath);
        X4 x4 = c0886jc.f6660z;
        if (x4 != null) {
            observeThumbSecondaryStyle(divSliderView, expressionResolver, x4);
            unit = Unit.f41027a;
        }
        if (unit == null) {
            observeThumbSecondaryStyle(divSliderView, expressionResolver, c0886jc.f6615C);
        }
        observeThumbSecondaryTextStyle(divSliderView, expressionResolver, c0886jc.f6613A);
    }

    private final void setupThumb(DivSliderView divSliderView, C0886jc c0886jc, BindingContext bindingContext, DivStatePath divStatePath) {
        observeThumbValue(divSliderView, c0886jc, bindingContext, divStatePath);
        observeThumbStyle(divSliderView, bindingContext.getExpressionResolver(), c0886jc.f6615C);
        observeThumbTextStyle(divSliderView, bindingContext.getExpressionResolver(), c0886jc.f6616D);
    }

    private final void setupTickMarks(DivSliderView divSliderView, C0886jc c0886jc, ExpressionResolver expressionResolver) {
        observeTickMarkActiveStyle(divSliderView, expressionResolver, c0886jc.f6618F);
        observeTickMarkInactiveStyle(divSliderView, expressionResolver, c0886jc.f6619G);
    }

    private final void setupTrack(DivSliderView divSliderView, C0886jc c0886jc, ExpressionResolver expressionResolver) {
        observeTrackActiveStyle(divSliderView, expressionResolver, c0886jc.f6621I);
        observeTrackInactiveStyle(divSliderView, expressionResolver, c0886jc.f6622J);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivSliderView divSliderView, @NotNull BindingContext bindingContext, @NotNull C0886jc div, @Nullable C0886jc c0886jc, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(divSliderView, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        this.errorCollector = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        divSliderView.setInterceptionAngle(this.horizontalInterceptionAngle);
        divSliderView.addSubscription(div.f6653s.observeAndGet(expressionResolver, new DivSliderBinder$bind$1(divSliderView, this)));
        divSliderView.addSubscription(div.f6652r.observeAndGet(expressionResolver, new DivSliderBinder$bind$2(divSliderView, this)));
        divSliderView.addSubscription(div.f6649o.observeAndGet(expressionResolver, new DivSliderBinder$bind$3(divSliderView)));
        divSliderView.clearOnThumbChangedListener();
        setupThumb(divSliderView, div, bindingContext, path);
        setupSecondaryThumb(divSliderView, div, bindingContext, path);
        setupTrack(divSliderView, div, expressionResolver);
        setupTickMarks(divSliderView, div, expressionResolver);
        setupRanges(divSliderView, div, expressionResolver);
    }
}
