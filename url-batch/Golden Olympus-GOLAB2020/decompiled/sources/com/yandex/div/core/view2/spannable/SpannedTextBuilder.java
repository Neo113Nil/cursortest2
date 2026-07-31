package com.yandex.div.core.view2.spannable;

import O1.AbstractC0853he;
import O1.C0892k0;
import O1.C0942me;
import O1.EnumC0770d3;
import O1.EnumC0779dc;
import O1.EnumC0791e6;
import O1.EnumC1169z8;
import O1.Ib;
import O1.Kd;
import O1.Ld;
import O1.S5;
import V1.a;
import W1.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AbstractC1281a0;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextViewKt;
import com.yandex.div.core.view2.spannable.ImageSpan;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.spannable.LetterSpacingSpan;
import com.yandex.div.internal.spannable.NoStrikethroughSpan;
import com.yandex.div.internal.spannable.NoUnderlineSpan;
import com.yandex.div.internal.spannable.TextColorSpan;
import com.yandex.div.internal.spannable.TypefaceSpan;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.T;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class SpannedTextBuilder {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean debugFontMetrics;

    @NotNull
    private final DivImageLoader imageLoader;

    @NotNull
    private final Paint tempPaint;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    private static final class ImageDownloadCallbackImpl extends DivIdLoggingImageDownloadCallback {

        @NotNull
        private final BindingContext bindingContext;

        @NotNull
        private final Kd.d image;

        @NotNull
        private final ImageSpan imageSpan;

        @NotNull
        private final Spanned spannedText;

        @Nullable
        private final Function1<Spanned, Unit> textConsumer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ImageDownloadCallbackImpl(@NotNull BindingContext bindingContext, @NotNull Kd.d image, @NotNull ImageSpan imageSpan, @NotNull Spanned spannedText, @Nullable Function1<? super Spanned, Unit> function1) {
            super(bindingContext.getDivView());
            Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(imageSpan, "imageSpan");
            Intrinsics.checkNotNullParameter(spannedText, "spannedText");
            this.bindingContext = bindingContext;
            this.image = image;
            this.imageSpan = imageSpan;
            this.spannedText = spannedText;
            this.textConsumer = function1;
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
            Intrinsics.checkNotNullParameter(cachedBitmap, "cachedBitmap");
            super.onSuccess(cachedBitmap);
            Resources resources = this.bindingContext.getDivView().getResources();
            ExpressionResolver expressionResolver = this.bindingContext.getExpressionResolver();
            Expression expression = this.image.f3543g;
            Integer num = expression != null ? (Integer) expression.evaluate(expressionResolver) : null;
            PorterDuff.Mode porterDuffMode = BaseDivViewExtensionsKt.toPorterDuffMode((EnumC0770d3) this.image.f3544h.evaluate(expressionResolver));
            Bitmap bitmap = cachedBitmap.getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "cachedBitmap.bitmap");
            Intrinsics.checkNotNullExpressionValue(resources, "resources");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
            if (num != null) {
                bitmapDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), porterDuffMode));
            }
            this.imageSpan.setImage(bitmapDrawable);
            Function1<Spanned, Unit> function1 = this.textConsumer;
            if (function1 != null) {
                function1.invoke(this.spannedText);
            }
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Kd.d.EnumC0031d.values().length];
            try {
                iArr[Kd.d.EnumC0031d.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kd.d.EnumC0031d.REVERSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC1169z8.values().length];
            try {
                iArr2[EnumC1169z8.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC1169z8.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Kd.d.a.c.values().length];
            try {
                iArr3[Kd.d.a.c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Kd.d.a.c.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Kd.d.a.c.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Kd.d.a.c.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Kd.d.a.c.AUTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public SpannedTextBuilder(@NotNull DivTypefaceResolver typefaceResolver, @NotNull DivImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(typefaceResolver, "typefaceResolver");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.typefaceResolver = typefaceResolver;
        this.imageLoader = imageLoader;
        this.tempPaint = new Paint();
    }

    private final void addActionSpan(BindingContext bindingContext, TextView textView, Spannable spannable, int i4, int i5, List<C0892k0> list, boolean z4) {
        List<C0892k0> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        spannable.setSpan(new PerformActionSpan(bindingContext, list), i4, i5, 33);
        if (z4) {
            AbstractC1281a0.k(textView);
        }
    }

    static /* synthetic */ void addActionSpan$default(SpannedTextBuilder spannedTextBuilder, BindingContext bindingContext, TextView textView, Spannable spannable, int i4, int i5, List list, boolean z4, int i6, Object obj) {
        spannedTextBuilder.addActionSpan(bindingContext, textView, spannable, i4, i5, list, (i6 & 64) != 0 ? true : z4);
    }

    private final void addDecorationSpan(BindingContext bindingContext, TextView textView, Spannable spannable, int i4, int i5, C0942me c0942me, AbstractC0853he abstractC0853he) {
        if (c0942me == null && abstractC0853he == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivBackgroundSpan divBackgroundSpan = new DivBackgroundSpan(c0942me, abstractC0853he);
        if (textView instanceof DivLineHeightTextView) {
            DivLineHeightTextView divLineHeightTextView = (DivLineHeightTextView) textView;
            if (DivLineHeightTextViewKt.hasBackgroundSpan(divLineHeightTextView, spannable, divBackgroundSpan, i4, i5, expressionResolver)) {
                return;
            }
            spannable.setSpan(divBackgroundSpan, i4, i5, 33);
            DivTextRangesBackgroundHelper textRoundedBgHelper$div_release = divLineHeightTextView.getTextRoundedBgHelper$div_release();
            if (textRoundedBgHelper$div_release != null) {
                textRoundedBgHelper$div_release.addBackgroundSpan$div_release(divBackgroundSpan);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ImageSpan addImageSpan(final BindingContext bindingContext, final TextView textView, Spannable spannable, TextData textData, Kd.d dVar) {
        ImageSpan.Accessibility accessibility;
        String str;
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        final Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int imagePosition = imagePosition(textData.getTextLength(), dVar, expressionResolver);
        S5 s5 = dVar.f3546j;
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
        int px = BaseDivViewExtensionsKt.toPx(s5, displayMetrics, expressionResolver);
        int px2 = BaseDivViewExtensionsKt.toPx(dVar.f3539c, displayMetrics, expressionResolver);
        Integer lineHeight = textData.getLineHeight();
        int intValue = lineHeight != null ? lineHeight.intValue() : 0;
        TextVerticalAlignment textVerticalAlignment = BaseDivViewExtensionsKt.toTextVerticalAlignment((Ld) dVar.f3538b.evaluate(expressionResolver));
        Kd.d.a aVar = dVar.f3537a;
        if (aVar != null) {
            int i4 = WhenMappings.$EnumSwitchMapping$2[aVar.f3552b.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    str = H.b(Button.class).c();
                } else if (i4 == 3) {
                    str = H.b(ImageView.class).c();
                } else if (i4 == 4) {
                    str = H.b(TextView.class).c();
                } else if (i4 == 5) {
                    str = H.b(ImageView.class).c();
                }
                Expression expression = aVar.f3551a;
                String str2 = expression == null ? (String) expression.evaluate(expressionResolver) : null;
                final List<C0892k0> actionsForPosition = getActionsForPosition(bindingContext, spannable, imagePosition);
                accessibility = new ImageSpan.Accessibility(str, str2, actionsForPosition == null ? new ImageSpan.OnAccessibilityClickAction() { // from class: B1.c
                    @Override // com.yandex.div.core.view2.spannable.ImageSpan.OnAccessibilityClickAction
                    public final void perform() {
                        SpannedTextBuilder.addImageSpan$lambda$21$lambda$20$lambda$19(Div2View.this, bindingContext, textView, actionsForPosition);
                    }
                } : null);
            }
            str = null;
            Expression expression2 = aVar.f3551a;
            if (expression2 == null) {
            }
            final List actionsForPosition2 = getActionsForPosition(bindingContext, spannable, imagePosition);
            accessibility = new ImageSpan.Accessibility(str, str2, actionsForPosition2 == null ? new ImageSpan.OnAccessibilityClickAction() { // from class: B1.c
                @Override // com.yandex.div.core.view2.spannable.ImageSpan.OnAccessibilityClickAction
                public final void perform() {
                    SpannedTextBuilder.addImageSpan$lambda$21$lambda$20$lambda$19(Div2View.this, bindingContext, textView, actionsForPosition2);
                }
            } : null);
        } else {
            accessibility = null;
        }
        ImageSpan imageSpan = new ImageSpan(null, px, px2, intValue, textVerticalAlignment, accessibility);
        spannable.setSpan(imageSpan, imagePosition, imagePosition + 1, 33);
        DivLineHeightTextView divLineHeightTextView = textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null;
        if (divLineHeightTextView != null) {
            divLineHeightTextView.addImageSpan$div_release(imageSpan);
        }
        return imageSpan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addImageSpan$lambda$21$lambda$20$lambda$19(Div2View divView, BindingContext bindingContext, TextView textView, List actions) {
        Intrinsics.checkNotNullParameter(divView, "$divView");
        Intrinsics.checkNotNullParameter(bindingContext, "$bindingContext");
        Intrinsics.checkNotNullParameter(textView, "$textView");
        Intrinsics.checkNotNullParameter(actions, "$actions");
        DivActionBinder actionBinder = divView.getDiv2Component$div_release().getActionBinder();
        Intrinsics.checkNotNullExpressionValue(actionBinder, "divView.div2Component.actionBinder");
        actionBinder.handleTapClick$div_release(bindingContext, textView, actions);
    }

    private final void addSpan(final TextView textView, Spannable spannable, TextData textData, SpanData spanData) {
        int start = spanData.getStart();
        int end = spanData.getEnd();
        if (start > end) {
            return;
        }
        Ld alignmentVertical = spanData.getAlignmentVertical();
        if (alignmentVertical == null) {
            alignmentVertical = Ld.BASELINE;
        }
        int baselineOffset = spanData.getBaselineOffset();
        if (baselineOffset != 0) {
            Integer lineHeight = spanData.getLineHeight();
            spannable.setSpan(new BaselineShiftSpan(baselineOffset, (lineHeight == null && (lineHeight = textData.getLineHeight()) == null) ? 0 : lineHeight.intValue()), start, end, 33);
        } else if (alignmentVertical != Ld.BASELINE) {
            Integer fontSize = spanData.getFontSize();
            spannable.setSpan(new VerticalAlignmentSpan(fontSize != null ? fontSize.intValue() : 0, BaseDivViewExtensionsKt.toTextVerticalAlignment(alignmentVertical), new a() { // from class: B1.b
                @Override // V1.a
                public final Object get() {
                    Layout addSpan$lambda$11;
                    addSpan$lambda$11 = SpannedTextBuilder.addSpan$lambda$11(textView);
                    return addSpan$lambda$11;
                }
            }), start, end, 33);
        }
        Integer fontSize2 = spanData.getFontSize();
        if (fontSize2 != null) {
            int intValue = fontSize2.intValue();
            Integer lineHeight2 = spanData.getLineHeight();
            spannable.setSpan(new FontSizeSpan(intValue, (lineHeight2 == null && (lineHeight2 = textData.getLineHeight()) == null) ? 0 : lineHeight2.intValue()), start, end, 33);
        }
        String fontFeatureSettings = spanData.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            spannable.setSpan(new FontFeatureSpan(fontFeatureSettings), start, end, 33);
        }
        Integer textColor = spanData.getTextColor();
        if (textColor != null) {
            spannable.setSpan(new TextColorSpan(textColor.intValue()), start, end, 33);
        }
        Double letterSpacing = spanData.getLetterSpacing();
        if (letterSpacing != null) {
            spannable.setSpan(new LetterSpacingSpan((float) letterSpacing.doubleValue()), start, end, 33);
        }
        EnumC1169z8 strike = spanData.getStrike();
        if (strike != null) {
            int i4 = WhenMappings.$EnumSwitchMapping$1[strike.ordinal()];
            if (i4 == 1) {
                spannable.setSpan(new StrikethroughSpan(), start, end, 33);
            } else if (i4 == 2) {
                spannable.setSpan(new NoStrikethroughSpan(), start, end, 33);
            }
        }
        EnumC1169z8 underline = spanData.getUnderline();
        if (underline != null) {
            int i5 = WhenMappings.$EnumSwitchMapping$1[underline.ordinal()];
            if (i5 == 1) {
                spannable.setSpan(new UnderlineSpan(), start, end, 33);
            } else if (i5 == 2) {
                spannable.setSpan(new NoUnderlineSpan(), start, end, 33);
            }
        }
        DivTypefaceResolver divTypefaceResolver = this.typefaceResolver;
        String fontFamily = spanData.getFontFamily();
        if (fontFamily == null) {
            fontFamily = textData.getFontFamily();
        }
        DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(fontFamily);
        if (spanData.getFontFamily() != null || spanData.getFontWeight() != null || spanData.getFontWeightValue() != null) {
            Typeface typeface = DivTypefaceResolverKt.getTypeface((spanData.getFontWeight() == null && spanData.getFontWeightValue() == null) ? DivTypefaceResolverKt.getTypefaceValue(textData.getFontWeight(), textData.getFontWeightValue()) : DivTypefaceResolverKt.getTypefaceValue(spanData.getFontWeight(), spanData.getFontWeightValue()), typefaceProvider);
            Intrinsics.checkNotNullExpressionValue(typeface, "getTypeface(fontWeightValue, typefaceProvider)");
            spannable.setSpan(new TypefaceSpan(typeface), start, end, 33);
        }
        if (TextViewExtensionsKt.getSupportFontVariations() && typefaceProvider.isVariable() && (spanData.getFontWeight() != null || spanData.getFontWeightValue() != null || spanData.getFontVariationSettings() != null)) {
            spannable.setSpan(new FontVariationSpan(TextViewExtensionsKt.getFontVariations(spanData.getFontWeight(), spanData.getFontWeightValue(), spanData.getFontVariationSettings())), start, end, 33);
        }
        if (spanData.getLineHeight() != null || spanData.getTopOffset() != null) {
            int i6 = Intrinsics.areEqual(spanData.getLineHeight(), textData.getLineHeight()) ? 18 : 33;
            Integer topOffset = spanData.getTopOffset();
            int intValue2 = topOffset != null ? topOffset.intValue() : 0;
            Integer lineHeight3 = spanData.getLineHeight();
            int intValue3 = lineHeight3 != null ? lineHeight3.intValue() : 0;
            Integer topOffsetStart = spanData.getTopOffsetStart();
            int intValue4 = topOffsetStart != null ? topOffsetStart.intValue() : start;
            Integer topOffsetEnd = spanData.getTopOffsetEnd();
            spannable.setSpan(new LineHeightWithTopOffsetSpan(intValue2, intValue3, intValue4, topOffsetEnd != null ? topOffsetEnd.intValue() : end), start, end, i6);
        }
        ShadowData textShadow = spanData.getTextShadow();
        if (textShadow != null) {
            spannable.setSpan(new ShadowSpan(textShadow), start, end, 33);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Layout addSpan$lambda$11(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "$textView");
        return textView.getLayout();
    }

    private final ShadowData createShadowData(Context context, BindingContext bindingContext, Ib ib, int i4) {
        if (ib == null) {
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Number number = (Number) ib.f3162b.evaluate(expressionResolver);
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
        float dpToPxF = BaseDivViewExtensionsKt.dpToPxF(number, displayMetrics);
        float px = BaseDivViewExtensionsKt.toPx(ib.f3164d.f8167a, displayMetrics, expressionResolver);
        float px2 = BaseDivViewExtensionsKt.toPx(ib.f3164d.f8168b, displayMetrics, expressionResolver);
        Paint paint = this.tempPaint;
        paint.setColor(((Number) ib.f3163c.evaluate(expressionResolver)).intValue());
        paint.setAlpha((int) (((Number) ib.f3161a.evaluate(expressionResolver)).doubleValue() * (i4 >>> 24)));
        return new ShadowData(px, px2, dpToPxF, paint.getColor());
    }

    private final SpanData createSpanData(Context context, BindingContext bindingContext, TextData textData, Kd.e eVar, int i4, int i5) {
        Integer num;
        Integer num2;
        Double d4;
        Integer num3;
        int i6;
        int i7;
        int i8;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int fontSizeValue = textData.getFontSizeValue();
        Expression expression = eVar.f3590i;
        if (expression != null) {
            long longValue = ((Number) expression.evaluate(expressionResolver)).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i8 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i8 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i8);
        } else {
            num = null;
        }
        EnumC0779dc enumC0779dc = (EnumC0779dc) eVar.f3591j.evaluate(expressionResolver);
        Expression expression2 = eVar.f3583b;
        Ld ld = expression2 != null ? (Ld) expression2.evaluate(expressionResolver) : null;
        Number number = (Number) eVar.f3585d.evaluate(expressionResolver);
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
        int unitToPx = BaseDivViewExtensionsKt.unitToPx(number, displayMetrics, enumC0779dc);
        Expression expression3 = eVar.f3588g;
        String str = expression3 != null ? (String) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = eVar.f3589h;
        String str2 = expression4 != null ? (String) expression4.evaluate(expressionResolver) : null;
        Integer valueOf = num != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(num, displayMetrics, enumC0779dc)) : null;
        Expression expression5 = eVar.f3593l;
        EnumC0791e6 enumC0791e6 = expression5 != null ? (EnumC0791e6) expression5.evaluate(expressionResolver) : null;
        Expression expression6 = eVar.f3594m;
        if (expression6 != null) {
            long longValue2 = ((Number) expression6.evaluate(expressionResolver)).longValue();
            long j5 = longValue2 >> 31;
            if (j5 == 0 || j5 == -1) {
                i7 = (int) longValue2;
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue2 + "' to Int");
                }
                i7 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num2 = Integer.valueOf(i7);
        } else {
            num2 = null;
        }
        Expression expression7 = eVar.f3592k;
        JSONObject jSONObject = expression7 != null ? (JSONObject) expression7.evaluate(expressionResolver) : null;
        Expression expression8 = eVar.f3595n;
        if (expression8 != null) {
            double doubleValue = ((Number) expression8.evaluate(expressionResolver)).doubleValue();
            if (num != null) {
                fontSizeValue = num.intValue();
            }
            d4 = Double.valueOf(doubleValue / fontSizeValue);
        } else {
            d4 = null;
        }
        Expression expression9 = eVar.f3596o;
        Integer valueOf2 = expression9 != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression9.evaluate(expressionResolver)).longValue()), displayMetrics, enumC0779dc)) : null;
        Expression expression10 = eVar.f3599r;
        EnumC1169z8 enumC1169z8 = expression10 != null ? (EnumC1169z8) expression10.evaluate(expressionResolver) : null;
        Expression expression11 = eVar.f3600s;
        Integer num4 = expression11 != null ? (Integer) expression11.evaluate(expressionResolver) : null;
        ShadowData createShadowData = createShadowData(context, bindingContext, eVar.f3601t, textData.getTextColor());
        Expression expression12 = eVar.f3602u;
        if (expression12 != null) {
            long longValue3 = ((Number) expression12.evaluate(expressionResolver)).longValue();
            long j6 = longValue3 >> 31;
            if (j6 == 0 || j6 == -1) {
                i6 = (int) longValue3;
            } else {
                KAssert kAssert3 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue3 + "' to Int");
                }
                i6 = longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num3 = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i6), displayMetrics, enumC0779dc));
        } else {
            num3 = null;
        }
        Integer valueOf3 = eVar.f3602u != null ? Integer.valueOf(i4) : null;
        Integer valueOf4 = eVar.f3602u != null ? Integer.valueOf(i5) : null;
        Expression expression13 = eVar.f3603v;
        return new SpanData(i4, i5, ld, unitToPx, str, str2, valueOf, enumC0779dc, enumC0791e6, num2, jSONObject, d4, valueOf2, enumC1169z8, num4, createShadowData, num3, valueOf3, valueOf4, expression13 != null ? (EnumC1169z8) expression13.evaluate(expressionResolver) : null);
    }

    private final TextData createTextData(Context context, BindingContext bindingContext, Kd kd, String str) {
        int i4;
        char c4;
        Integer num;
        Integer num2;
        int i5;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        long longValue = ((Number) kd.f3515v.evaluate(expressionResolver)).longValue();
        long j4 = longValue >> 31;
        int i6 = Integer.MIN_VALUE;
        if (j4 == 0 || j4 == -1) {
            i4 = (int) longValue;
        } else {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue + "' to Int");
            }
            i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        int i7 = i4;
        EnumC0779dc enumC0779dc = (EnumC0779dc) kd.f3516w.evaluate(expressionResolver);
        Integer valueOf = Integer.valueOf(i7);
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
        int unitToPx = BaseDivViewExtensionsKt.unitToPx(valueOf, displayMetrics, enumC0779dc);
        EnumC0791e6 enumC0791e6 = (EnumC0791e6) kd.f3518y.evaluate(expressionResolver);
        Expression expression = kd.f3519z;
        if (expression != null) {
            c4 = 31;
            long longValue2 = ((Number) expression.evaluate(expressionResolver)).longValue();
            long j5 = longValue2 >> 31;
            if (j5 == 0 || j5 == -1) {
                i5 = (int) longValue2;
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue2 + "' to Int");
                }
                i5 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i5);
        } else {
            c4 = 31;
            num = null;
        }
        Expression expression2 = kd.f3513t;
        String str2 = expression2 != null ? (String) expression2.evaluate(expressionResolver) : null;
        Expression expression3 = kd.f3458I;
        if (expression3 != null) {
            long longValue3 = ((Number) expression3.evaluate(expressionResolver)).longValue();
            long j6 = longValue3 >> c4;
            if (j6 == 0 || j6 == -1) {
                i6 = (int) longValue3;
            } else {
                KAssert kAssert3 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue3 + "' to Int");
                }
                if (longValue3 > 0) {
                    i6 = Integer.MAX_VALUE;
                }
            }
            num2 = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i6), displayMetrics, enumC0779dc));
        } else {
            num2 = null;
        }
        return new TextData(str, unitToPx, i7, enumC0779dc, str2, enumC0791e6, num, num2, ((Number) kd.f3475Z.evaluate(expressionResolver)).intValue());
    }

    private final List<C0892k0> getActionsForPosition(BindingContext bindingContext, Spannable spannable, int i4) {
        PerformActionSpan[] performActionSpanArr = (PerformActionSpan[]) spannable.getSpans(i4, i4 + 1, PerformActionSpan.class);
        if (performActionSpanArr.length > 1) {
            DivActionTypedUtilsKt.logWarning(bindingContext.getDivView(), new Throwable("Two or more clickable ranges intersect."));
        }
        PerformActionSpan performActionSpan = (PerformActionSpan) AbstractC3219i.H(performActionSpanArr);
        if (performActionSpan != null) {
            return performActionSpan.getActions();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int imagePosition(int i4, Kd.d dVar, ExpressionResolver expressionResolver) {
        long longValue = ((Number) dVar.f3542f.evaluate(expressionResolver)).longValue();
        int i5 = WhenMappings.$EnumSwitchMapping$0[((Kd.d.EnumC0031d) dVar.f3540d.evaluate(expressionResolver)).ordinal()];
        if (i5 == 1) {
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                return (int) longValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue + "' to Int");
            }
            return longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (i5 != 2) {
            throw new m();
        }
        long j5 = i4 - longValue;
        long j6 = j5 >> 31;
        if (j6 == 0 || j6 == -1) {
            return (int) j5;
        }
        KAssert kAssert2 = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable convert '" + j5 + "' to Int");
        }
        return j5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    private final List<Kd.d> preprocessImages(final TextData textData, List<Kd.d> list, final ExpressionResolver expressionResolver) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Number) ((Kd.d) obj).f3542f.evaluate(expressionResolver)).longValue() <= textData.getTextLength()) {
                    arrayList.add(obj);
                }
            }
            List<Kd.d> sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.yandex.div.core.view2.spannable.SpannedTextBuilder$preprocessImages$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t4, T t5) {
                    int imagePosition;
                    int imagePosition2;
                    imagePosition = SpannedTextBuilder.this.imagePosition(textData.getTextLength(), (Kd.d) t4, expressionResolver);
                    Integer valueOf = Integer.valueOf(imagePosition);
                    imagePosition2 = SpannedTextBuilder.this.imagePosition(textData.getTextLength(), (Kd.d) t5, expressionResolver);
                    return Z1.a.d(valueOf, Integer.valueOf(imagePosition2));
                }
            });
            if (sortedWith != null) {
                return sortedWith;
            }
        }
        return CollectionsKt.emptyList();
    }

    private final List<SpanData> preprocessSpans(Context context, BindingContext bindingContext, TextData textData, List<Kd.e> list) {
        int i4;
        int i5;
        int i6;
        List<Kd.e> list2;
        if (textData.getLineHeight() == null && ((list2 = list) == null || list2.isEmpty())) {
            return CollectionsKt.emptyList();
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int textLength = textData.getTextLength();
        int i7 = 0;
        int size = list != null ? list.size() : 0;
        TreeSet d4 = T.d(new Integer[0]);
        ArrayList arrayList = new ArrayList(size + 1);
        if (list != null) {
            for (Kd.e eVar : list) {
                long longValue = ((Number) eVar.f3598q.evaluate(expressionResolver)).longValue();
                long j4 = longValue >> 31;
                if (j4 == 0 || j4 == -1) {
                    i4 = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue + "' to Int");
                    }
                    i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                int g4 = g.g(i4, textLength);
                Expression expression = eVar.f3587f;
                if (expression != null) {
                    long longValue2 = ((Number) expression.evaluate(expressionResolver)).longValue();
                    long j5 = longValue2 >> 31;
                    if (j5 == 0 || j5 == -1) {
                        i6 = (int) longValue2;
                    } else {
                        KAssert kAssert2 = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Unable convert '" + longValue2 + "' to Int");
                        }
                        i6 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    i5 = g.g(i6, textLength);
                } else {
                    i5 = textLength;
                }
                if (g4 < i5) {
                    SpanData createSpanData = createSpanData(context, bindingContext, textData, eVar, g4, i5);
                    if (!createSpanData.isEmpty()) {
                        d4.add(Integer.valueOf(g4));
                        d4.add(Integer.valueOf(i5));
                        arrayList.add(createSpanData);
                    }
                }
            }
        }
        CollectionsKt.sort(arrayList);
        Integer lineHeight = textData.getLineHeight();
        if (lineHeight != null) {
            int intValue = lineHeight.intValue();
            d4.add(0);
            d4.add(Integer.valueOf(textLength));
            arrayList.add(0, SpanData.Companion.lineHeight$div_release(0, textLength, intValue));
        }
        if (arrayList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List list3 = CollectionsKt.toList(d4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int intValue2 = ((Number) CollectionsKt.first(list3)).intValue();
        if (list3.size() == 1) {
            SpanData empty$div_release = SpanData.Companion.empty$div_release(intValue2, intValue2);
            int size2 = arrayList.size();
            while (i7 < size2) {
                Object obj = arrayList.get(i7);
                i7++;
                empty$div_release = empty$div_release.mergeWith((SpanData) obj, intValue2, intValue2);
            }
            arrayList2.add(empty$div_release);
            return arrayList2;
        }
        int size3 = list3.size();
        int i8 = 1;
        while (i8 < size3) {
            int intValue3 = ((Number) list3.get(i8)).intValue();
            int size4 = arrayList.size();
            for (int i9 = 0; i9 < size4; i9++) {
                Object obj2 = arrayList.get(i9);
                Intrinsics.checkNotNullExpressionValue(obj2, "overlappingSpans[j]");
                SpanData spanData = (SpanData) obj2;
                if (intValue3 < spanData.getStart()) {
                    break;
                }
                if (intValue3 > spanData.getStart() && intValue3 <= spanData.getEnd()) {
                    arrayList3.add(spanData);
                }
            }
            if (!arrayList3.isEmpty()) {
                SpanData empty$div_release2 = SpanData.Companion.empty$div_release(intValue2, intValue3);
                int size5 = arrayList3.size();
                int i10 = 0;
                while (i10 < size5) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    empty$div_release2 = empty$div_release2.mergeWith((SpanData) obj3, intValue2, intValue3);
                }
                arrayList2.add(empty$div_release2);
            }
            arrayList3.clear();
            i8++;
            intValue2 = intValue3;
        }
        return arrayList2;
    }

    @NotNull
    public final Spanned buildEllipsis(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull Kd divText, @NotNull Kd.c ellipsis, @Nullable Function1<? super Spanned, Unit> function1) {
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(divText, "divText");
        Intrinsics.checkNotNullParameter(ellipsis, "ellipsis");
        return buildText(bindingContext, textView, divText, (String) ellipsis.f3526d.evaluate(bindingContext.getExpressionResolver()), ellipsis.f3525c, ellipsis.f3524b, ellipsis.f3523a, function1);
    }

    @NotNull
    public final Spanned buildPlainText(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull Kd divText) {
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(divText, "divText");
        return buildText(bindingContext, textView, divText, (String) divText.f3472W.evaluate(bindingContext.getExpressionResolver()), null, null, null, null);
    }

    @NotNull
    public final Spanned buildText(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull Kd divText, @Nullable Function1<? super Spanned, Unit> function1) {
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(divText, "divText");
        return buildText(bindingContext, textView, divText, (String) divText.f3472W.evaluate(bindingContext.getExpressionResolver()), divText.f3466Q, divText.f3455F, null, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        r17 = r32.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        if (r17.hasNext() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        r3 = (O1.Kd.e) r17.next();
        r4 = ((java.lang.Number) r3.f3598q.evaluate(r12)).longValue();
        r18 = r4 >> 31;
        r22 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e4, code lost:
    
        if (r18 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        if (r18 != (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
    
        r9 = com.yandex.div.internal.KAssert.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
    
        if (com.yandex.div.internal.Assert.isEnabled() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f3, code lost:
    
        com.yandex.div.internal.Assert.fail("Unable convert '" + r4 + "' to Int");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        if (r4 <= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:
    
        r4 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0113, code lost:
    
        r4 = kotlin.ranges.g.g(r4, r14);
        r5 = r3.f3587f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        if (r5 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011b, code lost:
    
        r19 = r11;
        r10 = ((java.lang.Number) r5.evaluate(r12)).longValue();
        r25 = r10 >> 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012d, code lost:
    
        if (r25 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0131, code lost:
    
        if (r25 != (-1)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0134, code lost:
    
        r5 = com.yandex.div.internal.KAssert.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013a, code lost:
    
        if (com.yandex.div.internal.Assert.isEnabled() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013c, code lost:
    
        com.yandex.div.internal.Assert.fail("Unable convert '" + r10 + "' to Int");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0153, code lost:
    
        if (r10 <= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0156, code lost:
    
        r22 = Integer.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0158, code lost:
    
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015c, code lost:
    
        r5 = kotlin.ranges.g.g(r5, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0160, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0168, code lost:
    
        addActionSpan$default(r0, r1, r2, r7, r4, r5, r3.f3582a, false, 64, null);
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r0.addDecorationSpan(r1, r2, r7, r4, r5, r3.f3586e, r3.f3584c);
        r6 = r7;
        r7 = false;
        r11 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015b, code lost:
    
        r5 = (int) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0162, code lost:
    
        r19 = r11;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
    
        r4 = Integer.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0112, code lost:
    
        r4 = (int) r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Spanned buildText(BindingContext bindingContext, TextView textView, Kd kd, String str, List<Kd.e> list, List<Kd.d> list2, List<C0892k0> list3, Function1<? super Spanned, Unit> function1) {
        Function1<? super Spanned, Unit> function12;
        SpannedTextBuilder spannedTextBuilder = this;
        BindingContext bindingContext2 = bindingContext;
        TextView textView2 = textView;
        Context context = textView2.getContext();
        Div2View divView = bindingContext2.getDivView();
        ExpressionResolver expressionResolver = bindingContext2.getExpressionResolver();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.length() == 0 ? "\u200b" : str);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        TextData createTextData = spannedTextBuilder.createTextData(context, bindingContext2, kd, str);
        int textLength = createTextData.getTextLength();
        List<SpanData> preprocessSpans = spannedTextBuilder.preprocessSpans(context, bindingContext2, createTextData, list);
        List<Kd.d> preprocessImages = spannedTextBuilder.preprocessImages(createTextData, list2, expressionResolver);
        boolean z4 = false;
        if (spannedTextBuilder.debugFontMetrics) {
            spannableStringBuilder.setSpan(new LineMetricsSpan(), 0, spannableStringBuilder.length(), 33);
        }
        DivLineHeightTextView divLineHeightTextView = textView2 instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView2 : null;
        if (divLineHeightTextView != null) {
            divLineHeightTextView.clearImageSpans$div_release();
            DivTextRangesBackgroundHelper textRoundedBgHelper$div_release = divLineHeightTextView.getTextRoundedBgHelper$div_release();
            if (textRoundedBgHelper$div_release != null) {
                textRoundedBgHelper$div_release.invalidateSpansCache$div_release();
            }
        }
        Iterator<T> it = preprocessSpans.iterator();
        while (it.hasNext()) {
            spannedTextBuilder.addSpan(textView2, spannableStringBuilder, createTextData, (SpanData) it.next());
        }
        if (list != null) {
            List<Kd.e> list4 = list;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                for (Kd.e eVar : list4) {
                    if (eVar.f3582a != null || eVar.f3584c != null || eVar.f3586e != null) {
                    }
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        boolean z5 = z4;
        Div2View div2View = divView;
        SpannedTextBuilder spannedTextBuilder2 = this;
        spannedTextBuilder2.addActionSpan(bindingContext, textView, spannableStringBuilder2, 0, spannableStringBuilder2.length(), list3, false);
        int size = preprocessImages.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                Kd.d dVar = preprocessImages.get(size);
                int imagePosition = spannedTextBuilder2.imagePosition(createTextData.getTextLength(), dVar, expressionResolver);
                int imagePosition2 = size > 0 ? spannedTextBuilder2.imagePosition(createTextData.getTextLength(), preprocessImages.get(size - 1), expressionResolver) : Integer.MIN_VALUE;
                spannableStringBuilder2.insert(imagePosition, (CharSequence) "#");
                TextData textData = createTextData;
                ImageSpan addImageSpan = spannedTextBuilder2.addImageSpan(bindingContext, textView, spannableStringBuilder2, textData, dVar);
                SpannedTextBuilder spannedTextBuilder3 = spannedTextBuilder2;
                boolean z6 = imagePosition2 + 1 == imagePosition ? true : z5;
                boolean z7 = (imagePosition <= 0 || CharsKt.b(spannableStringBuilder2.charAt(imagePosition + (-1)))) ? z5 : true;
                if (!z6 && z7) {
                    spannableStringBuilder2.insert(imagePosition, (CharSequence) "\u2060");
                }
                function12 = function1;
                SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                spannableStringBuilder2 = spannableStringBuilder3;
                LoadReference loadImage = spannedTextBuilder3.imageLoader.loadImage(((Uri) dVar.f3545i.evaluate(expressionResolver)).toString(), new ImageDownloadCallbackImpl(bindingContext, dVar, addImageSpan, spannableStringBuilder3, function12));
                Intrinsics.checkNotNullExpressionValue(loadImage, "imageLoader.loadImage(\n …xtConsumer)\n            )");
                Div2View div2View2 = div2View;
                div2View2.addLoadReference(loadImage, textView);
                if (i4 < 0) {
                    break;
                }
                div2View = div2View2;
                size = i4;
                spannedTextBuilder2 = spannedTextBuilder3;
                createTextData = textData;
            }
        } else {
            function12 = function1;
        }
        if (function12 != null) {
            function12.invoke(spannableStringBuilder2);
        }
        return spannableStringBuilder2;
    }
}
