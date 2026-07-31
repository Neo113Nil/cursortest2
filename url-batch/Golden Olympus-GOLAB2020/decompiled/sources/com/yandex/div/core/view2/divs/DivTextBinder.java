package com.yandex.div.core.view2.divs;

import O1.A8;
import O1.Aa;
import O1.AbstractC0853he;
import O1.C0933m5;
import O1.C0942me;
import O1.C1081ua;
import O1.C1119wc;
import O1.C1171za;
import O1.EnumC1091v2;
import O1.EnumC1109w2;
import O1.EnumC1169z8;
import O1.Ib;
import O1.J4;
import O1.Kd;
import O1.Na;
import O1.Pd;
import O1.Qc;
import O1.Xa;
import O1.Z;
import W1.m;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.ShadowData;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.div.internal.widget.TextViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivTextBinder extends DivViewBinder<Z.r, Kd, DivLineHeightTextView> {
    private final boolean isHyphenationEnabled;

    @NotNull
    private final SpannedTextBuilder spannedTextBuilder;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

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
            int[] iArr2 = new int[EnumC1169z8.values().length];
            try {
                iArr2[EnumC1169z8.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC1169z8.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Xa.c.values().length];
            try {
                iArr3[Xa.c.FARTHEST_CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Xa.c.NEAREST_CORNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Xa.c.FARTHEST_SIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Xa.c.NEAREST_SIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Kd.f.values().length];
            try {
                iArr4[Kd.f.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[Kd.f.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[Kd.f.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[Kd.f.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivTextBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivTypefaceResolver typefaceResolver, @NotNull SpannedTextBuilder spannedTextBuilder, boolean z4) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(typefaceResolver, "typefaceResolver");
        Intrinsics.checkNotNullParameter(spannedTextBuilder, "spannedTextBuilder");
        this.typefaceResolver = typefaceResolver;
        this.spannedTextBuilder = spannedTextBuilder;
        this.isHyphenationEnabled = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if ((r6 != null ? ((java.lang.Boolean) r6.evaluate(r7)).booleanValue() : false) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyEllipsize(DivLineHeightTextView divLineHeightTextView, Kd kd, ExpressionResolver expressionResolver) {
        TextUtils.TruncateAt truncateAt;
        Kd.f fVar = (Kd.f) kd.f3495j0.evaluate(expressionResolver);
        int i4 = WhenMappings.$EnumSwitchMapping$3[fVar.ordinal()];
        boolean z4 = true;
        if (i4 == 1) {
            truncateAt = null;
        } else if (i4 == 2) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i4 == 3) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else {
            if (i4 != 4) {
                throw new m();
            }
            truncateAt = TextUtils.TruncateAt.END;
        }
        divLineHeightTextView.setEllipsisLocation(truncateAt);
        if (fVar != Kd.f.NONE) {
            Expression expression = kd.f3492i;
        }
        z4 = false;
        divLineHeightTextView.setAutoEllipsize(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:
    
        if ((!kotlin.text.StringsKt.z(r4)) == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyFontFeatureSettings(TextView textView, String it) {
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
        }
        it = null;
        textView.setFontFeatureSettings(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHyphenation(TextView textView, String str) {
        if (TextViewsKt.checkHyphenationSupported()) {
            int hyphenationFrequency = textView.getHyphenationFrequency();
            int i4 = 0;
            if (this.isHyphenationEnabled && StringsKt.O(str, (char) 173, false, 2, null)) {
                i4 = 1;
            }
            if (hyphenationFrequency != i4) {
                textView.setHyphenationFrequency(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLinearTextGradientColor(final TextView textView, final long j4, final Colormap colormap) {
        if (!ViewsKt.isActuallyLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyLinearTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(LinearGradientDrawable.Companion.createLinearGradient(j4, colormap.getColors(), colormap.getPositions(), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        } else {
            textView.getPaint().setShader(LinearGradientDrawable.Companion.createLinearGradient(j4, colormap.getColors(), colormap.getPositions(), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMaxLines(DivLineHeightTextView divLineHeightTextView, Long l4, Long l5) {
        int i4;
        AdaptiveMaxLines adaptiveMaxLines$div_release = divLineHeightTextView.getAdaptiveMaxLines$div_release();
        if (adaptiveMaxLines$div_release != null) {
            adaptiveMaxLines$div_release.reset();
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        if (l4 == null || l5 == null) {
            if (l4 != null) {
                long longValue = l4.longValue();
                long j4 = longValue >> 31;
                if (j4 == 0 || j4 == -1) {
                    i5 = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue + "' to Int");
                    }
                    if (longValue > 0) {
                        i5 = Integer.MAX_VALUE;
                    }
                }
                i6 = i5;
            }
            divLineHeightTextView.setMaxLines(i6);
            return;
        }
        AdaptiveMaxLines adaptiveMaxLines = new AdaptiveMaxLines(divLineHeightTextView);
        long longValue2 = l4.longValue();
        long j5 = longValue2 >> 31;
        if (j5 == 0 || j5 == -1) {
            i4 = (int) longValue2;
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue2 + "' to Int");
            }
            i4 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue3 = l5.longValue();
        long j6 = longValue3 >> 31;
        if (j6 == 0 || j6 == -1) {
            i5 = (int) longValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue3 + "' to Int");
            }
            if (longValue3 > 0) {
                i5 = Integer.MAX_VALUE;
            }
        }
        adaptiveMaxLines.apply(new AdaptiveMaxLines.Params(i4, i5));
        divLineHeightTextView.setAdaptiveMaxLines$div_release(adaptiveMaxLines);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainEllipsis(DivLineHeightTextView divLineHeightTextView, String str) {
        if (str == null) {
            str = "…";
        }
        divLineHeightTextView.setEllipsis(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainText(TextView textView, BindingContext bindingContext, Kd kd) {
        textView.setText(this.spannedTextBuilder.buildPlainText(bindingContext, textView, kd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRadialTextGradientColor(final TextView textView, final RadialGradientDrawable.Radius radius, final RadialGradientDrawable.Center center, final RadialGradientDrawable.Center center2, final List<Integer> list) {
        if (!ViewsKt.isActuallyLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRadialTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(RadialGradientDrawable.Companion.createRadialGradient(radius, center, center2, CollectionsKt.toIntArray(list), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        } else {
            textView.getPaint().setShader(RadialGradientDrawable.Companion.createRadialGradient(radius, center, center2, CollectionsKt.toIntArray(list), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichEllipsis(EllipsizedTextView ellipsizedTextView, BindingContext bindingContext, Kd kd) {
        Kd.c cVar = kd.f3506p;
        if (cVar == null) {
            ellipsizedTextView.setEllipsis("…");
        } else {
            this.spannedTextBuilder.buildEllipsis(bindingContext, ellipsizedTextView, kd, cVar, new DivTextBinder$applyRichEllipsis$1(ellipsizedTextView));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichText(TextView textView, BindingContext bindingContext, Kd kd) {
        this.spannedTextBuilder.buildText(bindingContext, textView, kd, new DivTextBinder$applyRichText$1(textView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySelectable(TextView textView, boolean z4) {
        textView.setTextIsSelectable(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStrikethrough(TextView textView, EnumC1169z8 enumC1169z8) {
        int i4 = WhenMappings.$EnumSwitchMapping$1[enumC1169z8.ordinal()];
        if (i4 == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        } else {
            if (i4 != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextAlignment(TextView textView, EnumC1091v2 enumC1091v2, EnumC1109w2 enumC1109w2) {
        textView.setGravity(BaseDivViewExtensionsKt.evaluateGravity(enumC1091v2, enumC1109w2));
        int i4 = WhenMappings.$EnumSwitchMapping$0[enumC1091v2.ordinal()];
        int i5 = 5;
        if (i4 != 1) {
            if (i4 == 2) {
                i5 = 4;
            } else if (i4 == 3 || (i4 != 4 && i4 == 5)) {
                i5 = 6;
            }
        }
        textView.setTextAlignment(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextColor(TextView textView, int i4, Integer num) {
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[0]}, new int[]{num != null ? num.intValue() : i4, i4}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextShadow(TextView textView, ShadowData shadowData) {
        DivViewWrapper divViewWrapper;
        if (shadowData == null) {
            ViewParent parent = textView.getParent();
            divViewWrapper = parent instanceof DivViewWrapper ? (DivViewWrapper) parent : null;
            if (divViewWrapper != null) {
                divViewWrapper.setClipChildren(true);
                divViewWrapper.setClipToPadding(true);
            }
            textView.setClipToOutline(true);
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            return;
        }
        ViewParent parent2 = textView.getParent();
        divViewWrapper = parent2 instanceof DivViewWrapper ? (DivViewWrapper) parent2 : null;
        if (divViewWrapper != null) {
            divViewWrapper.setClipChildren(false);
            divViewWrapper.setClipToPadding(false);
        }
        textView.setClipToOutline(false);
        textView.setShadowLayer(shadowData.getRadius(), shadowData.getOffsetX(), shadowData.getOffsetY(), shadowData.getColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTightenWidth(DivLineHeightTextView divLineHeightTextView, boolean z4) {
        divLineHeightTextView.setTightenWidth(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyUnderline(TextView textView, EnumC1169z8 enumC1169z8) {
        int i4 = WhenMappings.$EnumSwitchMapping$1[enumC1169z8.ordinal()];
        if (i4 == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        } else {
            if (i4 != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
        }
    }

    private final void bindEllipsis(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, Kd kd, Kd kd2) {
        Kd.c cVar = kd.f3506p;
        if ((cVar != null ? cVar.f3525c : null) == null) {
            if ((cVar != null ? cVar.f3524b : null) == null) {
                if ((cVar != null ? cVar.f3523a : null) == null) {
                    bindPlainEllipsis(divLineHeightTextView, cVar, kd2 != null ? kd2.f3506p : null, bindingContext.getExpressionResolver());
                    return;
                }
            }
        }
        bindRichEllipsis(divLineHeightTextView, bindingContext, kd);
    }

    private final void bindEllipsize(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(kd.f3492i, kd2 != null ? kd2.f3492i : null)) {
            if (ExpressionsKt.equalsToConstant(kd.f3495j0, kd2 != null ? kd2.f3495j0 : null)) {
                return;
            }
        }
        applyEllipsize(divLineHeightTextView, kd, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(kd.f3492i) && ExpressionsKt.isConstant(kd.f3495j0)) {
            return;
        }
        DivTextBinder$bindEllipsize$callback$1 divTextBinder$bindEllipsize$callback$1 = new DivTextBinder$bindEllipsize$callback$1(this, divLineHeightTextView, kd, expressionResolver);
        Expression expression = kd.f3492i;
        if (expression != null) {
            divLineHeightTextView.addSubscription(expression.observe(expressionResolver, divTextBinder$bindEllipsize$callback$1));
        }
        divLineHeightTextView.addSubscription(kd.f3495j0.observe(expressionResolver, divTextBinder$bindEllipsize$callback$1));
    }

    private final void bindFontFeatureSettings(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(kd.f3514u, kd2 != null ? kd2.f3514u : null)) {
            return;
        }
        Expression expression = kd.f3514u;
        applyFontFeatureSettings(divLineHeightTextView, expression != null ? (String) expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(kd.f3514u)) {
            return;
        }
        DivTextBinder$bindFontFeatureSettings$callback$1 divTextBinder$bindFontFeatureSettings$callback$1 = new DivTextBinder$bindFontFeatureSettings$callback$1(this, divLineHeightTextView, kd, expressionResolver);
        Expression expression2 = kd.f3514u;
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, divTextBinder$bindFontFeatureSettings$callback$1) : null);
    }

    private final void bindFontSize(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeFontSize(divLineHeightTextView, kd.f3515v, kd.f3516w, kd2 != null ? kd2.f3515v : null, kd2 != null ? kd2.f3516w : null, expressionResolver, divLineHeightTextView);
    }

    private final void bindLetterSpacing(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeLetterSpacing(divLineHeightTextView, kd.f3457H, kd.f3515v, kd2 != null ? kd2.f3457H : null, kd2 != null ? kd2.f3515v : null, expressionResolver, divLineHeightTextView);
    }

    private final void bindLinearTextGradient(DivLineHeightTextView divLineHeightTextView, Div2View div2View, A8 a8, Pd pd, ExpressionResolver expressionResolver) {
        if (pd instanceof Pd.c) {
            Pd.c cVar = (Pd.c) pd;
            if (ExpressionsKt.equalsToConstant(a8.f1312a, cVar.c().f1312a) && ExpressionsKt.equalsToConstant(a8.f1314c, cVar.c().f1314c)) {
                List list = a8.f1313b;
                List list2 = cVar.c().f1313b;
                if (list == null && list2 == null) {
                    return;
                }
                if (list != null && list2 != null && list.size() == list2.size()) {
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (DivDataExtensionsKt.equalsToConstant((A8.a) obj, (A8.a) list2.get(i4))) {
                            i4 = i5;
                        }
                    }
                    return;
                }
            }
        }
        applyLinearTextGradientColor(divLineHeightTextView, ((Number) a8.f1312a.evaluate(expressionResolver)).longValue(), ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(a8, expressionResolver), div2View));
        if (ExpressionsKt.isConstant(a8.f1312a) && ExpressionsKt.isConstantOrNull(a8.f1314c)) {
            List list3 = a8.f1313b;
            if (list3 != null) {
                List list4 = list3;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    return;
                }
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    if (!DivDataExtensionsKt.isConstant((A8.a) it.next())) {
                    }
                }
                return;
            }
            return;
        }
        DivTextBinder$bindLinearTextGradient$callback$1 divTextBinder$bindLinearTextGradient$callback$1 = new DivTextBinder$bindLinearTextGradient$callback$1(this, divLineHeightTextView, a8, expressionResolver, div2View);
        divLineHeightTextView.addSubscription(a8.f1312a.observe(expressionResolver, divTextBinder$bindLinearTextGradient$callback$1));
        ExpressionList expressionList = a8.f1314c;
        divLineHeightTextView.addSubscription(expressionList != null ? expressionList.observe(expressionResolver, divTextBinder$bindLinearTextGradient$callback$1) : null);
        List list5 = a8.f1313b;
        if (list5 != null) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                ExpressionSubscribersKt.observeColorPoint(divLineHeightTextView, (A8.a) it2.next(), expressionResolver, divTextBinder$bindLinearTextGradient$callback$1);
            }
        }
    }

    private final void bindMaxLines(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(kd.f3461L, kd2 != null ? kd2.f3461L : null)) {
            if (ExpressionsKt.equalsToConstant(kd.f3462M, kd2 != null ? kd2.f3462M : null)) {
                return;
            }
        }
        Expression expression = kd.f3461L;
        Long l4 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = kd.f3462M;
        applyMaxLines(divLineHeightTextView, l4, expression2 != null ? (Long) expression2.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(kd.f3461L) && ExpressionsKt.isConstantOrNull(kd.f3462M)) {
            return;
        }
        DivTextBinder$bindMaxLines$callback$1 divTextBinder$bindMaxLines$callback$1 = new DivTextBinder$bindMaxLines$callback$1(this, divLineHeightTextView, kd, expressionResolver);
        Expression expression3 = kd.f3461L;
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, divTextBinder$bindMaxLines$callback$1) : null);
        Expression expression4 = kd.f3462M;
        divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, divTextBinder$bindMaxLines$callback$1) : null);
    }

    private final void bindPlainEllipsis(DivLineHeightTextView divLineHeightTextView, Kd.c cVar, Kd.c cVar2, ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(cVar != null ? cVar.f3526d : null, cVar2 != null ? cVar2.f3526d : null)) {
            return;
        }
        applyPlainEllipsis(divLineHeightTextView, (cVar == null || (expression2 = cVar.f3526d) == null) ? null : (String) expression2.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(cVar != null ? cVar.f3526d : null)) {
            if (ExpressionsKt.isConstantOrNull(cVar != null ? cVar.f3526d : null)) {
                return;
            }
        }
        if (cVar != null && (expression = cVar.f3526d) != null) {
            disposable = expression.observe(expressionResolver, new DivTextBinder$bindPlainEllipsis$1(this, divLineHeightTextView));
        }
        divLineHeightTextView.addSubscription(disposable);
    }

    private final void bindPlainText(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, Kd kd, Kd kd2) {
        if (ExpressionsKt.equalsToConstant(kd.f3472W, kd2 != null ? kd2.f3472W : null)) {
            if (ExpressionsKt.equalsToConstant(kd.f3458I, kd2 != null ? kd2.f3458I : null)) {
                if (ExpressionsKt.equalsToConstant(kd.f3516w, kd2 != null ? kd2.f3516w : null)) {
                    List extensions = kd.getExtensions();
                    List extensions2 = kd2 != null ? kd2.getExtensions() : null;
                    if (extensions == null && extensions2 == null) {
                        return;
                    }
                    if (extensions != null && extensions2 != null && extensions.size() == extensions2.size()) {
                        int i4 = 0;
                        for (Object obj : extensions) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (Intrinsics.areEqual(((C0933m5) obj).f6988a, ((C0933m5) extensions2.get(i4)).f6988a)) {
                                i4 = i5;
                            }
                        }
                        return;
                    }
                }
            }
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        String str = (String) kd.f3472W.evaluate(expressionResolver);
        applyPlainText(divLineHeightTextView, bindingContext, kd);
        applyHyphenation(divLineHeightTextView, str);
        if (ExpressionsKt.isConstant(kd.f3472W) && ExpressionsKt.isConstantOrNull(kd.f3458I) && ExpressionsKt.isConstantOrNull(kd.f3516w)) {
            return;
        }
        DivTextBinder$bindPlainText$callback$1 divTextBinder$bindPlainText$callback$1 = new DivTextBinder$bindPlainText$callback$1(kd, expressionResolver, this, divLineHeightTextView, bindingContext);
        divLineHeightTextView.addSubscription(kd.f3472W.observe(expressionResolver, divTextBinder$bindPlainText$callback$1));
        Expression expression = kd.f3458I;
        divLineHeightTextView.addSubscription(expression != null ? expression.observe(expressionResolver, divTextBinder$bindPlainText$callback$1) : null);
        divLineHeightTextView.addSubscription(kd.f3516w.observe(expressionResolver, divTextBinder$bindPlainText$callback$1));
    }

    private final void bindRadialTextGradient(DivLineHeightTextView divLineHeightTextView, C1171za c1171za, Pd pd, ExpressionResolver expressionResolver) {
        List<Integer> emptyList;
        if (pd instanceof Pd.d) {
            Pd.d dVar = (Pd.d) pd;
            if (Intrinsics.areEqual(c1171za.f8813e, dVar.c().f8813e) && Intrinsics.areEqual(c1171za.f8809a, dVar.c().f8809a) && Intrinsics.areEqual(c1171za.f8810b, dVar.c().f8810b) && ExpressionsKt.equalsToConstant(c1171za.f8812d, dVar.c().f8812d)) {
                return;
            }
        }
        DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        Na na = c1171za.f8813e;
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
        RadialGradientDrawable.Radius radialGradientDrawableRadius = toRadialGradientDrawableRadius(na, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter = toRadialGradientDrawableCenter(c1171za.f8809a, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter2 = toRadialGradientDrawableCenter(c1171za.f8810b, displayMetrics, expressionResolver);
        ExpressionList expressionList = c1171za.f8812d;
        if (expressionList == null || (emptyList = expressionList.evaluate(expressionResolver)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        applyRadialTextGradientColor(divLineHeightTextView, radialGradientDrawableRadius, radialGradientDrawableCenter, radialGradientDrawableCenter2, emptyList);
        if (ExpressionsKt.isConstantOrNull(c1171za.f8812d)) {
            return;
        }
        ExpressionList expressionList2 = c1171za.f8812d;
        divLineHeightTextView.addSubscription(expressionList2 != null ? expressionList2.observe(expressionResolver, new DivTextBinder$bindRadialTextGradient$1(this, divLineHeightTextView, c1171za, displayMetrics, expressionResolver)) : null);
    }

    private final void bindRichEllipsis(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, Kd kd) {
        Qc qc;
        Expression expression;
        Qc qc2;
        Expression expression2;
        applyRichEllipsis(divLineHeightTextView, bindingContext, kd);
        Kd.c cVar = kd.f3506p;
        if (cVar == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivTextBinder$bindRichEllipsis$callback$1 divTextBinder$bindRichEllipsis$callback$1 = new DivTextBinder$bindRichEllipsis$callback$1(this, divLineHeightTextView, bindingContext, kd);
        divLineHeightTextView.addSubscription(cVar.f3526d.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1));
        List<Kd.e> list = cVar.f3525c;
        if (list != null) {
            for (Kd.e eVar : list) {
                divLineHeightTextView.addSubscription(eVar.f3598q.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1));
                Expression expression3 = eVar.f3587f;
                divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                Expression expression4 = eVar.f3583b;
                divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                divLineHeightTextView.addSubscription(eVar.f3585d.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1));
                Expression expression5 = eVar.f3590i;
                divLineHeightTextView.addSubscription(expression5 != null ? expression5.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                divLineHeightTextView.addSubscription(eVar.f3591j.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1));
                Expression expression6 = eVar.f3588g;
                divLineHeightTextView.addSubscription(expression6 != null ? expression6.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                Expression expression7 = eVar.f3593l;
                divLineHeightTextView.addSubscription(expression7 != null ? expression7.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                Expression expression8 = eVar.f3594m;
                divLineHeightTextView.addSubscription(expression8 != null ? expression8.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                Expression expression9 = eVar.f3589h;
                divLineHeightTextView.addSubscription(expression9 != null ? expression9.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                Expression expression10 = eVar.f3595n;
                divLineHeightTextView.addSubscription(expression10 != null ? expression10.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                Expression expression11 = eVar.f3596o;
                divLineHeightTextView.addSubscription(expression11 != null ? expression11.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                Expression expression12 = eVar.f3599r;
                divLineHeightTextView.addSubscription(expression12 != null ? expression12.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                Expression expression13 = eVar.f3600s;
                divLineHeightTextView.addSubscription(expression13 != null ? expression13.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                Expression expression14 = eVar.f3602u;
                divLineHeightTextView.addSubscription(expression14 != null ? expression14.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                Expression expression15 = eVar.f3603v;
                divLineHeightTextView.addSubscription(expression15 != null ? expression15.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                AbstractC0853he abstractC0853he = eVar.f3584c;
                Object b4 = abstractC0853he != null ? abstractC0853he.b() : null;
                if (b4 instanceof C1119wc) {
                    divLineHeightTextView.addSubscription(((C1119wc) b4).f8341a.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1));
                }
                C0942me c0942me = eVar.f3586e;
                divLineHeightTextView.addSubscription((c0942me == null || (qc2 = c0942me.f7097b) == null || (expression2 = qc2.f4476a) == null) ? null : expression2.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1));
                C0942me c0942me2 = eVar.f3586e;
                divLineHeightTextView.addSubscription((c0942me2 == null || (qc = c0942me2.f7097b) == null || (expression = qc.f4479d) == null) ? null : expression.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1));
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression expression16 = eVar.f3592k;
                    divLineHeightTextView.addSubscription(expression16 != null ? expression16.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                }
            }
        }
        List<Kd.d> list2 = cVar.f3524b;
        if (list2 != null) {
            for (Kd.d dVar : list2) {
                divLineHeightTextView.addSubscription(dVar.f3542f.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1));
                divLineHeightTextView.addSubscription(dVar.f3545i.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1));
                Expression expression17 = dVar.f3543g;
                divLineHeightTextView.addSubscription(expression17 != null ? expression17.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1) : null);
                divLineHeightTextView.addSubscription(dVar.f3546j.f4715b.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1));
                divLineHeightTextView.addSubscription(dVar.f3546j.f4714a.observe(expressionResolver, divTextBinder$bindRichEllipsis$callback$1));
            }
        }
    }

    private final void bindRichText(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, Kd kd) {
        Qc qc;
        Expression expression;
        Qc qc2;
        Expression expression2;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyRichText(divLineHeightTextView, bindingContext, kd);
        applyHyphenation(divLineHeightTextView, (String) kd.f3472W.evaluate(expressionResolver));
        divLineHeightTextView.addSubscription(kd.f3472W.observe(expressionResolver, new DivTextBinder$bindRichText$1(this, divLineHeightTextView, bindingContext, kd)));
        DivTextBinder$bindRichText$callback$1 divTextBinder$bindRichText$callback$1 = new DivTextBinder$bindRichText$callback$1(this, divLineHeightTextView, bindingContext, kd);
        divLineHeightTextView.addSubscription(kd.f3515v.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
        divLineHeightTextView.addSubscription(kd.f3516w.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
        Expression expression3 = kd.f3513t;
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
        Expression expression4 = kd.f3458I;
        divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
        List<Kd.e> list = kd.f3466Q;
        if (list != null) {
            for (Kd.e eVar : list) {
                divLineHeightTextView.addSubscription(eVar.f3598q.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
                Expression expression5 = eVar.f3587f;
                divLineHeightTextView.addSubscription(expression5 != null ? expression5.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                Expression expression6 = eVar.f3583b;
                divLineHeightTextView.addSubscription(expression6 != null ? expression6.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                divLineHeightTextView.addSubscription(eVar.f3585d.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
                Expression expression7 = eVar.f3590i;
                divLineHeightTextView.addSubscription(expression7 != null ? expression7.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                divLineHeightTextView.addSubscription(eVar.f3591j.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
                Expression expression8 = eVar.f3588g;
                divLineHeightTextView.addSubscription(expression8 != null ? expression8.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                Expression expression9 = eVar.f3593l;
                divLineHeightTextView.addSubscription(expression9 != null ? expression9.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                Expression expression10 = eVar.f3594m;
                divLineHeightTextView.addSubscription(expression10 != null ? expression10.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                Expression expression11 = eVar.f3589h;
                divLineHeightTextView.addSubscription(expression11 != null ? expression11.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                Expression expression12 = eVar.f3595n;
                divLineHeightTextView.addSubscription(expression12 != null ? expression12.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                Expression expression13 = eVar.f3596o;
                divLineHeightTextView.addSubscription(expression13 != null ? expression13.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                Expression expression14 = eVar.f3599r;
                divLineHeightTextView.addSubscription(expression14 != null ? expression14.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                Expression expression15 = eVar.f3600s;
                divLineHeightTextView.addSubscription(expression15 != null ? expression15.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                Expression expression16 = eVar.f3602u;
                divLineHeightTextView.addSubscription(expression16 != null ? expression16.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                Expression expression17 = eVar.f3603v;
                divLineHeightTextView.addSubscription(expression17 != null ? expression17.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                AbstractC0853he abstractC0853he = eVar.f3584c;
                Object b4 = abstractC0853he != null ? abstractC0853he.b() : null;
                if (b4 instanceof C1119wc) {
                    divLineHeightTextView.addSubscription(((C1119wc) b4).f8341a.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
                }
                C0942me c0942me = eVar.f3586e;
                divLineHeightTextView.addSubscription((c0942me == null || (qc2 = c0942me.f7097b) == null || (expression2 = qc2.f4476a) == null) ? null : expression2.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
                C0942me c0942me2 = eVar.f3586e;
                divLineHeightTextView.addSubscription((c0942me2 == null || (qc = c0942me2.f7097b) == null || (expression = qc.f4479d) == null) ? null : expression.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression expression18 = eVar.f3592k;
                    divLineHeightTextView.addSubscription(expression18 != null ? expression18.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                }
            }
        }
        List<Kd.d> list2 = kd.f3455F;
        if (list2 != null) {
            for (Kd.d dVar : list2) {
                divLineHeightTextView.addSubscription(dVar.f3542f.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
                divLineHeightTextView.addSubscription(dVar.f3540d.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
                divLineHeightTextView.addSubscription(dVar.f3545i.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
                divLineHeightTextView.addSubscription(dVar.f3538b.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
                Expression expression19 = dVar.f3543g;
                divLineHeightTextView.addSubscription(expression19 != null ? expression19.observe(expressionResolver, divTextBinder$bindRichText$callback$1) : null);
                divLineHeightTextView.addSubscription(dVar.f3546j.f4715b.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
                divLineHeightTextView.addSubscription(dVar.f3546j.f4714a.observe(expressionResolver, divTextBinder$bindRichText$callback$1));
            }
        }
    }

    private final void bindSelectable(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(kd.f3469T, kd2 != null ? kd2.f3469T : null)) {
            return;
        }
        applySelectable(divLineHeightTextView, ((Boolean) kd.f3469T.evaluate(expressionResolver)).booleanValue());
        if (ExpressionsKt.isConstant(kd.f3469T)) {
            return;
        }
        divLineHeightTextView.addSubscription(kd.f3469T.observe(expressionResolver, new DivTextBinder$bindSelectable$1(this, divLineHeightTextView)));
    }

    private final void bindStrikethrough(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(kd.f3471V, kd2 != null ? kd2.f3471V : null)) {
            return;
        }
        applyStrikethrough(divLineHeightTextView, (EnumC1169z8) kd.f3471V.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(kd.f3471V)) {
            return;
        }
        divLineHeightTextView.addSubscription(kd.f3471V.observe(expressionResolver, new DivTextBinder$bindStrikethrough$1(this, divLineHeightTextView)));
    }

    private final void bindText(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, Kd kd, Kd kd2) {
        if (kd.f3466Q == null && kd.f3455F == null) {
            bindPlainText(divLineHeightTextView, bindingContext, kd, kd2);
        } else {
            bindRichText(divLineHeightTextView, bindingContext, kd);
        }
    }

    private final void bindTextAlignment(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(kd.f3473X, kd2 != null ? kd2.f3473X : null)) {
            if (ExpressionsKt.equalsToConstant(kd.f3474Y, kd2 != null ? kd2.f3474Y : null)) {
                return;
            }
        }
        applyTextAlignment(divLineHeightTextView, (EnumC1091v2) kd.f3473X.evaluate(expressionResolver), (EnumC1109w2) kd.f3474Y.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(kd.f3473X) && ExpressionsKt.isConstant(kd.f3474Y)) {
            return;
        }
        DivTextBinder$bindTextAlignment$callback$1 divTextBinder$bindTextAlignment$callback$1 = new DivTextBinder$bindTextAlignment$callback$1(this, divLineHeightTextView, kd, expressionResolver);
        divLineHeightTextView.addSubscription(kd.f3473X.observe(expressionResolver, divTextBinder$bindTextAlignment$callback$1));
        divLineHeightTextView.addSubscription(kd.f3474Y.observe(expressionResolver, divTextBinder$bindTextAlignment$callback$1));
    }

    private final void bindTextColor(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(kd.f3475Z, kd2 != null ? kd2.f3475Z : null)) {
            if (ExpressionsKt.equalsToConstant(kd.f3512s, kd2 != null ? kd2.f3512s : null)) {
                return;
            }
        }
        int intValue = ((Number) kd.f3475Z.evaluate(expressionResolver)).intValue();
        Expression expression = kd.f3512s;
        applyTextColor(divLineHeightTextView, intValue, expression != null ? (Integer) expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstant(kd.f3475Z) && ExpressionsKt.isConstantOrNull(kd.f3512s)) {
            return;
        }
        DivTextBinder$bindTextColor$callback$1 divTextBinder$bindTextColor$callback$1 = new DivTextBinder$bindTextColor$callback$1(this, divLineHeightTextView, kd, expressionResolver);
        divLineHeightTextView.addSubscription(kd.f3475Z.observe(expressionResolver, divTextBinder$bindTextColor$callback$1));
        Expression expression2 = kd.f3512s;
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, divTextBinder$bindTextColor$callback$1) : null);
    }

    private final void bindTextGradient(DivLineHeightTextView divLineHeightTextView, Div2View div2View, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        Pd pd = kd.f3477a0;
        if (pd == null) {
            divLineHeightTextView.getPaint().setShader(null);
        } else if (pd instanceof Pd.c) {
            bindLinearTextGradient(divLineHeightTextView, div2View, ((Pd.c) pd).c(), kd2 != null ? kd2.f3477a0 : null, expressionResolver);
        } else if (pd instanceof Pd.d) {
            bindRadialTextGradient(divLineHeightTextView, ((Pd.d) pd).c(), kd2 != null ? kd2.f3477a0 : null, expressionResolver);
        }
    }

    private final void bindTextShadow(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        ShadowData shadowData;
        C1081ua c1081ua;
        J4 j4;
        Expression expression;
        C1081ua c1081ua2;
        J4 j42;
        Expression expression2;
        C1081ua c1081ua3;
        J4 j43;
        Expression expression3;
        C1081ua c1081ua4;
        J4 j44;
        Expression expression4;
        Expression expression5;
        Expression expression6;
        Expression expression7;
        C1081ua c1081ua5;
        J4 j45;
        C1081ua c1081ua6;
        J4 j46;
        C1081ua c1081ua7;
        J4 j47;
        C1081ua c1081ua8;
        J4 j48;
        Ib ib;
        C1081ua c1081ua9;
        J4 j49;
        C1081ua c1081ua10;
        J4 j410;
        Ib ib2;
        C1081ua c1081ua11;
        J4 j411;
        C1081ua c1081ua12;
        J4 j412;
        Ib ib3;
        C1081ua c1081ua13;
        J4 j413;
        C1081ua c1081ua14;
        J4 j414;
        Ib ib4;
        C1081ua c1081ua15;
        J4 j415;
        C1081ua c1081ua16;
        J4 j416;
        Ib ib5;
        Ib ib6;
        Ib ib7;
        Ib ib8 = kd.f3479b0;
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(ib8 != null ? ib8.f3161a : null, (kd2 == null || (ib7 = kd2.f3479b0) == null) ? null : ib7.f3161a)) {
            Ib ib9 = kd.f3479b0;
            if (ExpressionsKt.equalsToConstant(ib9 != null ? ib9.f3162b : null, (kd2 == null || (ib6 = kd2.f3479b0) == null) ? null : ib6.f3162b)) {
                Ib ib10 = kd.f3479b0;
                if (ExpressionsKt.equalsToConstant(ib10 != null ? ib10.f3163c : null, (kd2 == null || (ib5 = kd2.f3479b0) == null) ? null : ib5.f3163c)) {
                    Ib ib11 = kd.f3479b0;
                    if (ExpressionsKt.equalsToConstant((ib11 == null || (c1081ua16 = ib11.f3164d) == null || (j416 = c1081ua16.f8167a) == null) ? null : j416.f3318b, (kd2 == null || (ib4 = kd2.f3479b0) == null || (c1081ua15 = ib4.f3164d) == null || (j415 = c1081ua15.f8167a) == null) ? null : j415.f3318b)) {
                        Ib ib12 = kd.f3479b0;
                        if (ExpressionsKt.equalsToConstant((ib12 == null || (c1081ua14 = ib12.f3164d) == null || (j414 = c1081ua14.f8167a) == null) ? null : j414.f3317a, (kd2 == null || (ib3 = kd2.f3479b0) == null || (c1081ua13 = ib3.f3164d) == null || (j413 = c1081ua13.f8167a) == null) ? null : j413.f3317a)) {
                            Ib ib13 = kd.f3479b0;
                            if (ExpressionsKt.equalsToConstant((ib13 == null || (c1081ua12 = ib13.f3164d) == null || (j412 = c1081ua12.f8168b) == null) ? null : j412.f3318b, (kd2 == null || (ib2 = kd2.f3479b0) == null || (c1081ua11 = ib2.f3164d) == null || (j411 = c1081ua11.f8168b) == null) ? null : j411.f3318b)) {
                                Ib ib14 = kd.f3479b0;
                                if (ExpressionsKt.equalsToConstant((ib14 == null || (c1081ua10 = ib14.f3164d) == null || (j410 = c1081ua10.f8168b) == null) ? null : j410.f3317a, (kd2 == null || (ib = kd2.f3479b0) == null || (c1081ua9 = ib.f3164d) == null || (j49 = c1081ua9.f8168b) == null) ? null : j49.f3317a)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        Ib ib15 = kd.f3479b0;
        DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        if (ib15 != null) {
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
            shadowData = getShadowData(ib15, expressionResolver, displayMetrics, ((Number) kd.f3475Z.evaluate(expressionResolver)).intValue());
        } else {
            shadowData = null;
        }
        applyTextShadow(divLineHeightTextView, shadowData);
        Ib ib16 = kd.f3479b0;
        if (ExpressionsKt.isConstantOrNull(ib16 != null ? ib16.f3161a : null)) {
            Ib ib17 = kd.f3479b0;
            if (ExpressionsKt.isConstantOrNull(ib17 != null ? ib17.f3162b : null)) {
                Ib ib18 = kd.f3479b0;
                if (ExpressionsKt.isConstantOrNull(ib18 != null ? ib18.f3163c : null)) {
                    Ib ib19 = kd.f3479b0;
                    if (ExpressionsKt.isConstantOrNull((ib19 == null || (c1081ua8 = ib19.f3164d) == null || (j48 = c1081ua8.f8167a) == null) ? null : j48.f3318b)) {
                        Ib ib20 = kd.f3479b0;
                        if (ExpressionsKt.isConstantOrNull((ib20 == null || (c1081ua7 = ib20.f3164d) == null || (j47 = c1081ua7.f8167a) == null) ? null : j47.f3317a)) {
                            Ib ib21 = kd.f3479b0;
                            if (ExpressionsKt.isConstantOrNull((ib21 == null || (c1081ua6 = ib21.f3164d) == null || (j46 = c1081ua6.f8168b) == null) ? null : j46.f3318b)) {
                                Ib ib22 = kd.f3479b0;
                                if (ExpressionsKt.isConstantOrNull((ib22 == null || (c1081ua5 = ib22.f3164d) == null || (j45 = c1081ua5.f8168b) == null) ? null : j45.f3317a)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        DivTextBinder$bindTextShadow$callback$1 divTextBinder$bindTextShadow$callback$1 = new DivTextBinder$bindTextShadow$callback$1(this, divLineHeightTextView, ib15, expressionResolver, displayMetrics, kd);
        divLineHeightTextView.addSubscription((ib15 == null || (expression7 = ib15.f3161a) == null) ? null : expression7.observe(expressionResolver, divTextBinder$bindTextShadow$callback$1));
        divLineHeightTextView.addSubscription((ib15 == null || (expression6 = ib15.f3163c) == null) ? null : expression6.observe(expressionResolver, divTextBinder$bindTextShadow$callback$1));
        divLineHeightTextView.addSubscription((ib15 == null || (expression5 = ib15.f3162b) == null) ? null : expression5.observe(expressionResolver, divTextBinder$bindTextShadow$callback$1));
        divLineHeightTextView.addSubscription((ib15 == null || (c1081ua4 = ib15.f3164d) == null || (j44 = c1081ua4.f8167a) == null || (expression4 = j44.f3318b) == null) ? null : expression4.observe(expressionResolver, divTextBinder$bindTextShadow$callback$1));
        divLineHeightTextView.addSubscription((ib15 == null || (c1081ua3 = ib15.f3164d) == null || (j43 = c1081ua3.f8167a) == null || (expression3 = j43.f3317a) == null) ? null : expression3.observe(expressionResolver, divTextBinder$bindTextShadow$callback$1));
        divLineHeightTextView.addSubscription((ib15 == null || (c1081ua2 = ib15.f3164d) == null || (j42 = c1081ua2.f8168b) == null || (expression2 = j42.f3318b) == null) ? null : expression2.observe(expressionResolver, divTextBinder$bindTextShadow$callback$1));
        if (ib15 != null && (c1081ua = ib15.f3164d) != null && (j4 = c1081ua.f8168b) != null && (expression = j4.f3317a) != null) {
            disposable = expression.observe(expressionResolver, divTextBinder$bindTextShadow$callback$1);
        }
        divLineHeightTextView.addSubscription(disposable);
    }

    private final void bindTightenWidth(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(kd.f3481c0, kd2 != null ? kd2.f3481c0 : null)) {
            return;
        }
        applyTightenWidth(divLineHeightTextView, ((Boolean) kd.f3481c0.evaluate(expressionResolver)).booleanValue());
        if (ExpressionsKt.isConstant(kd.f3481c0)) {
            return;
        }
        divLineHeightTextView.addSubscription(kd.f3481c0.observe(expressionResolver, new DivTextBinder$bindTightenWidth$1(this, divLineHeightTextView)));
    }

    private final void bindTypeface(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeTypeface(divLineHeightTextView, kd.f3513t, kd.f3518y, kd.f3519z, kd.f3517x, kd2 != null ? kd2.f3513t : null, kd2 != null ? kd2.f3518y : null, kd2 != null ? kd2.f3519z : null, kd2 != null ? kd2.f3517x : null, this.typefaceResolver, expressionResolver);
    }

    private final void bindUnderline(DivLineHeightTextView divLineHeightTextView, Kd kd, Kd kd2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(kd.f3497k0, kd2 != null ? kd2.f3497k0 : null)) {
            return;
        }
        applyUnderline(divLineHeightTextView, (EnumC1169z8) kd.f3497k0.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(kd.f3497k0)) {
            return;
        }
        divLineHeightTextView.addSubscription(kd.f3497k0.observe(expressionResolver, new DivTextBinder$bindUnderline$1(this, divLineHeightTextView)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRealTextWidth(TextView textView) {
        return Math.min((textView.getWidth() - textView.getPaddingRight()) - textView.getPaddingLeft(), (int) textView.getPaint().measureText(textView.getText().toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShadowData getShadowData(Ib ib, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics, int i4) {
        float dpToPxF = BaseDivViewExtensionsKt.dpToPxF((Number) ib.f3162b.evaluate(expressionResolver), displayMetrics);
        float px = BaseDivViewExtensionsKt.toPx(ib.f3164d.f8167a, displayMetrics, expressionResolver);
        float px2 = BaseDivViewExtensionsKt.toPx(ib.f3164d.f8168b, displayMetrics, expressionResolver);
        Paint paint = new Paint();
        paint.setColor(((Number) ib.f3163c.evaluate(expressionResolver)).intValue());
        paint.setAlpha((int) (((Number) ib.f3161a.evaluate(expressionResolver)).doubleValue() * (i4 >>> 24)));
        return new ShadowData(px, px2, dpToPxF, paint.getColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Center toRadialGradientDrawableCenter(Aa aa, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (aa instanceof Aa.c) {
            return new RadialGradientDrawable.Center.Fixed(BaseDivViewExtensionsKt.dpToPxF((Number) ((Aa.c) aa).c().f2990b.evaluate(expressionResolver), displayMetrics));
        }
        if (aa instanceof Aa.d) {
            return new RadialGradientDrawable.Center.Relative((float) ((Number) ((Aa.d) aa).c().f4787a.evaluate(expressionResolver)).doubleValue());
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius(Na na, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        RadialGradientDrawable.Radius.Relative.Type type;
        if (na instanceof Na.c) {
            return new RadialGradientDrawable.Radius.Fixed(BaseDivViewExtensionsKt.dpToPxF((Number) ((Na.c) na).c().f4715b.evaluate(expressionResolver), displayMetrics));
        }
        if (!(na instanceof Na.d)) {
            throw new m();
        }
        int i4 = WhenMappings.$EnumSwitchMapping$2[((Xa.c) ((Na.d) na).c().f5269a.evaluate(expressionResolver)).ordinal()];
        if (i4 == 1) {
            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
        } else if (i4 == 2) {
            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
        } else if (i4 == 3) {
            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
        } else {
            if (i4 != 4) {
                throw new m();
            }
            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
        }
        return new RadialGradientDrawable.Radius.Relative(type);
    }

    private final void updateFocusableState(View view, Kd kd) {
        view.setFocusable(view.isFocusable() || kd.f3512s != null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivLineHeightTextView divLineHeightTextView, @NotNull BindingContext bindingContext, @NotNull Kd div, @Nullable Kd kd) {
        Intrinsics.checkNotNullParameter(divLineHeightTextView, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        BaseDivViewExtensionsKt.applyDivActions(divLineHeightTextView, bindingContext, div.f3478b, div.f3482d, div.f3459J, div.f3504o, div.f3453D, div.f3452C, div.f3465P, div.f3464O, div.f3480c, div.d(), div.f3498l);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        bindTypeface(divLineHeightTextView, div, kd, expressionResolver);
        bindTextAlignment(divLineHeightTextView, div, kd, expressionResolver);
        bindFontSize(divLineHeightTextView, div, kd, expressionResolver);
        bindLetterSpacing(divLineHeightTextView, div, kd, expressionResolver);
        bindFontFeatureSettings(divLineHeightTextView, div, kd, expressionResolver);
        bindTextColor(divLineHeightTextView, div, kd, expressionResolver);
        bindUnderline(divLineHeightTextView, div, kd, expressionResolver);
        bindStrikethrough(divLineHeightTextView, div, kd, expressionResolver);
        bindMaxLines(divLineHeightTextView, div, kd, expressionResolver);
        bindText(divLineHeightTextView, bindingContext, div, kd);
        bindEllipsis(divLineHeightTextView, bindingContext, div, kd);
        bindEllipsize(divLineHeightTextView, div, kd, expressionResolver);
        bindTextGradient(divLineHeightTextView, bindingContext.getDivView(), div, kd, expressionResolver);
        bindTextShadow(divLineHeightTextView, div, kd, expressionResolver);
        bindSelectable(divLineHeightTextView, div, kd, expressionResolver);
        bindTightenWidth(divLineHeightTextView, div, kd, expressionResolver);
        updateFocusableState(divLineHeightTextView, div);
    }
}
