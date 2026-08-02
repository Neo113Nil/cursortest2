package com.withpersona.sdk2.inquiry.steps.ui.styling;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.play.integrity.internal.ak;
import com.plaid.internal.EnumC0170g;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.FontDownloader;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;

/* loaded from: classes9.dex */
public abstract class TextStylingKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StyleElements.FontWeight.values().length];
            try {
                iArr[StyleElements.FontWeight.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.FontWeight.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.FontWeight.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StyleElements.FontWeight.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StyleElements.FontWeight.HEAVY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StyleElements.PositionType.values().length];
            try {
                iArr2[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void setTypeface(TextView textView, String str, StyleElements.FontWeight fontWeight, Function1 function1) {
        int i;
        String str2;
        String str3;
        textView.getClass();
        if (str == null) {
            return;
        }
        if (fontWeight == null) {
            fontWeight = StyleElements.FontWeight.NORMAL;
        }
        Context context = textView.getContext();
        context.getClass();
        Typeface typeface = ak.getTypeface(context, str);
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        fontWeight.getClass();
        int i2 = WhenMappings.$EnumSwitchMapping$0[fontWeight.ordinal()];
        int i3 = 3;
        if (i2 == 1) {
            i = EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE;
        } else if (i2 == 2) {
            i = 400;
        } else if (i2 == 3) {
            i = 500;
        } else if (i2 == 4) {
            i = 700;
        } else {
            if (i2 != 5) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i = 800;
        }
        Typeface create = Typeface.create(textView.getTypeface(), i, false);
        create.getClass();
        textView.setTypeface(create);
        FontDownloader fontDownloader = FontDownloader.Companion._instance;
        fontDownloader.getClass();
        RealFontDownloader realFontDownloader = (RealFontDownloader) fontDownloader;
        Map map = realFontDownloader.fontDownloaderMapping;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map map2 = (Map) CollectionsKt.firstOrNull(linkedHashMap.values());
        Continuation continuation = null;
        if (map2 == null || (str3 = (String) map2.get(fontWeight)) == null) {
            if (map2 == null) {
                str2 = null;
                if (str2 == null) {
                    BlurEffectKt$$ExternalSyntheticLambda1 blurEffectKt$$ExternalSyntheticLambda1 = new BlurEffectKt$$ExternalSyntheticLambda1(i3, textView, function1);
                    LinkedHashMap linkedHashMap2 = realFontDownloader.fontCache;
                    RealFontDownloader.FontState fontState = (RealFontDownloader.FontState) linkedHashMap2.get(str2);
                    if (fontState instanceof RealFontDownloader.FontState.Cached) {
                        blurEffectKt$$ExternalSyntheticLambda1.invoke(((RealFontDownloader.FontState.Cached) fontState).typeface);
                        return;
                    }
                    RealFontDownloader.FontState.Downloading downloading = RealFontDownloader.FontState.Downloading.INSTANCE;
                    if (Intrinsics.areEqual(fontState, downloading)) {
                        realFontDownloader.onFontDownloadedCallbacks.add(new RealFontDownloader.FontDownloadedCallback(str2, blurEffectKt$$ExternalSyntheticLambda1));
                        return;
                    } else if (fontState != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    } else {
                        linkedHashMap2.put(str2, downloading);
                        JobKt.launch$default(realFontDownloader.coroutineScope, null, null, new FlowKt__LimitKt$transformWhile$1(realFontDownloader, str2, blurEffectKt$$ExternalSyntheticLambda1, continuation, 9), 3);
                        return;
                    }
                }
                return;
            }
            str3 = (String) map2.get(StyleElements.FontWeight.NORMAL);
        }
        str2 = str3;
        if (str2 == null) {
        }
    }

    public static final void style(TextView textView, TextViewStyle textViewStyle, Set set) {
        StyleElements.SizeSet marginValue;
        textView.getClass();
        textViewStyle.getClass();
        set.getClass();
        if (!set.contains(TextStyleElements.Margin) && (marginValue = textViewStyle.getMarginValue()) != null) {
            ViewUtilsKt.setMargins(textView, marginValue);
        }
        Integer textColorValue = textViewStyle.getTextColorValue();
        if (textColorValue != null) {
            textView.setTextColor(textColorValue.intValue());
        }
        Integer textColorHighlightValue = textViewStyle.getTextColorHighlightValue();
        if (textColorHighlightValue != null) {
            textView.setLinkTextColor(textColorHighlightValue.intValue());
        }
        Double fontSizeValue = textViewStyle.getFontSizeValue();
        int i = 1;
        if (fontSizeValue != null) {
            double doubleValue = fontSizeValue.doubleValue();
            textView.setTextSize((float) doubleValue);
            if (textView.getAutoSizeTextType() == 1) {
                int autoSizeMinTextSize = textView.getAutoSizeMinTextSize();
                int autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                float f = ExtensionsKt.displayMetrics.scaledDensity;
                int i2 = (int) (f * doubleValue);
                if (autoSizeMinTextSize <= 0) {
                    autoSizeMinTextSize = (int) (12.0d * f);
                }
                if (autoSizeStepGranularity <= 0) {
                    autoSizeStepGranularity = 1;
                }
                if (autoSizeMinTextSize > i2) {
                    autoSizeMinTextSize = i2;
                }
                textView.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, i2, autoSizeStepGranularity, 0);
            }
            Double lineHeightValue = textViewStyle.getLineHeightValue();
            if (lineHeightValue != null) {
                if (set.contains(TextStyleElements.LineHeight)) {
                    lineHeightValue = null;
                }
                if (lineHeightValue != null) {
                    textView.setLineSpacing((float) (ExtensionsKt.getDpToPx(lineHeightValue.doubleValue()) - ExtensionsKt.getDpToPx(doubleValue)), 1.0f);
                }
            }
        }
        Double letterSpacingValue = textViewStyle.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            textView.setLetterSpacing((float) (letterSpacingValue.doubleValue() / textView.getTextSize()));
        }
        String fontNameValue = textViewStyle.getFontNameValue();
        StyleElements.FontWeight fontWeightValue = textViewStyle.getFontWeightValue();
        if (fontWeightValue == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        setTypeface(textView, fontNameValue, fontWeightValue, new InstantKt$$ExternalSyntheticLambda0(3));
        StyleElements.PositionType justificationValue = textViewStyle.getJustificationValue();
        if (justificationValue != null) {
            StyleElements.PositionType positionType = set.contains(TextStyleElements.Justification) ? null : justificationValue;
            if (positionType != null) {
                int gravity = textView.getGravity() & 112;
                int i3 = WhenMappings.$EnumSwitchMapping$1[positionType.ordinal()];
                if (i3 == 1) {
                    i = 8388611;
                } else if (i3 != 2) {
                    if (i3 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    i = 8388613;
                }
                textView.setGravity(i);
                textView.setGravity(gravity | (textView.getGravity() & (-113)));
            }
        }
    }
}
