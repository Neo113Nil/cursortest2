package com.withpersona.sdk2.inquiry.steps.ui.styling;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.integrity.internal.ah;
import com.squareup.cash.R;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ColorMapping;
import com.withpersona.sdk2.inquiry.shared.LottieUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class ImageStylingKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void applyStyle(LocalImageComponentStyle localImageComponentStyle, ThemeableLottieAnimationView themeableLottieAnimationView, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        themeableLottieAnimationView.getClass();
        if (themeableLottieAnimationView.isLaidOut()) {
            applyStyle$applyStyles(localImageComponentStyle, themeableLottieAnimationView, strArr, strArr2, strArr3, strArr4);
        } else {
            ah.addOneShotPreDrawListenerAndDiscardFrame(themeableLottieAnimationView, new StateFlowKt$$ExternalSyntheticLambda3(localImageComponentStyle, themeableLottieAnimationView, strArr, strArr2, strArr3, strArr4, 8));
        }
    }

    public static final void applyStyle$applyStyles(LocalImageComponentStyle localImageComponentStyle, ThemeableLottieAnimationView themeableLottieAnimationView, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        Integer num;
        ThemeableLottieAnimationView themeableLottieAnimationView2;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        AttributeStyles.LocalImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f;
        StyleElements.SizeSet marginValue;
        Integer fillColorValue = localImageComponentStyle != null ? localImageComponentStyle.getFillColorValue() : null;
        Integer backgroundColorValue = localImageComponentStyle != null ? localImageComponentStyle.getBackgroundColorValue() : null;
        Integer valueOf = (fillColorValue == null || backgroundColorValue == null) ? null : Integer.valueOf(ColorUtils.blendARGB(0.66f, fillColorValue.intValue(), backgroundColorValue.intValue()));
        if (localImageComponentStyle != null) {
            num = localImageComponentStyle.getStrokeColorValue();
            strArr5 = strArr;
            strArr6 = strArr2;
            strArr7 = strArr3;
            strArr8 = strArr4;
            themeableLottieAnimationView2 = themeableLottieAnimationView;
        } else {
            num = null;
            themeableLottieAnimationView2 = themeableLottieAnimationView;
            strArr5 = strArr;
            strArr6 = strArr2;
            strArr7 = strArr3;
            strArr8 = strArr4;
        }
        replaceColors(themeableLottieAnimationView2, num, fillColorValue, valueOf, backgroundColorValue, strArr5, strArr6, strArr7, strArr8);
        if (localImageComponentStyle != null && (marginValue = localImageComponentStyle.getMarginValue()) != null) {
            ViewUtilsKt.setMargins(themeableLottieAnimationView, marginValue);
        }
        ViewUtilsKt.applyWidth(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getWidthValue() : null);
        ViewUtilsKt.applyHeight(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getHeightValue() : null);
        ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView.getLayoutParams();
        if (localImageComponentStyle != null && (justify = localImageComponentStyle.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int i = WhenMappings.$EnumSwitchMapping$0[base2.ordinal()];
            if (i == 1) {
                f = RecyclerView.DECELERATION_RATE;
            } else if (i == 2) {
                f = 0.5f;
            } else {
                if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                f = 1.0f;
            }
            layoutParams2.horizontalBias = f;
        }
        themeableLottieAnimationView.setLayoutParams(layoutParams);
    }

    public static final String applyStyleToLottieJson(String str, LocalImageComponentStyle localImageComponentStyle, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        str.getClass();
        if (localImageComponentStyle != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Integer strokeColorValue = localImageComponentStyle.getStrokeColorValue();
            Integer fillColorValue = localImageComponentStyle.getFillColorValue();
            Integer backgroundColorValue = localImageComponentStyle.getBackgroundColorValue();
            if (strokeColorValue != null) {
                for (String str2 : strArr) {
                    linkedHashMap.put(Integer.valueOf(Color.parseColor(str2)), strokeColorValue);
                }
            }
            if (fillColorValue != null) {
                for (String str3 : strArr2) {
                    linkedHashMap.put(Integer.valueOf(Color.parseColor(str3)), fillColorValue);
                }
            }
            if (backgroundColorValue != null) {
                for (String str4 : strArr4) {
                    linkedHashMap.put(Integer.valueOf(Color.parseColor(str4)), backgroundColorValue);
                }
            }
            if (fillColorValue != null && backgroundColorValue != null) {
                int blendARGB = ColorUtils.blendARGB(0.66f, fillColorValue.intValue(), backgroundColorValue.intValue());
                for (String str5 : strArr3) {
                    linkedHashMap.put(Integer.valueOf(Color.parseColor(str5)), Integer.valueOf(blendARGB));
                }
            }
            if (!linkedHashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    int intValue2 = ((Number) entry.getValue()).intValue();
                    arrayList.add(new ColorMapping(Color.red(intValue) / 255.0d, Color.green(intValue) / 255.0d, Color.blue(intValue) / 255.0d, Color.red(intValue2) / 255.0d, Color.green(intValue2) / 255.0d, Color.blue(intValue2) / 255.0d));
                }
                JSONObject jSONObject = new JSONObject(str);
                LottieUtilsKt.replaceColorsInObject(jSONObject, arrayList);
                String jSONObject2 = jSONObject.toString();
                jSONObject2.getClass();
                return jSONObject2;
            }
        }
        return str;
    }

    public static final void applyStyleWithDefaults(LocalImageComponentStyle localImageComponentStyle, ThemeableLottieAnimationView themeableLottieAnimationView, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        if (localImageComponentStyle != null) {
            applyStyle(localImageComponentStyle, themeableLottieAnimationView, strArr, strArr2, strArr3, strArr4);
            return;
        }
        Context context = themeableLottieAnimationView.getContext();
        context.getClass();
        int colorFromAttr$default = ResToolsKt.getColorFromAttr$default(context, R.attr.colorPrimaryVariant);
        Context context2 = themeableLottieAnimationView.getContext();
        context2.getClass();
        int colorFromAttr$default2 = ResToolsKt.getColorFromAttr$default(context2, R.attr.colorSecondary);
        Context context3 = themeableLottieAnimationView.getContext();
        context3.getClass();
        int colorFromAttr$default3 = ResToolsKt.getColorFromAttr$default(context3, R.attr.colorSurface);
        replaceColors(themeableLottieAnimationView, Integer.valueOf(colorFromAttr$default), Integer.valueOf(colorFromAttr$default2), Integer.valueOf(ColorUtils.blendARGB(0.66f, colorFromAttr$default2, colorFromAttr$default3)), Integer.valueOf(colorFromAttr$default3), strArr, strArr2, strArr3, strArr4);
    }

    public static final void applyStyles(ImageView imageView, RemoteImage remoteImage) {
        imageView.getClass();
        remoteImage.getClass();
        StyleElements.SizeSet margin = remoteImage.getMargin();
        if (margin != null) {
            ViewUtilsKt.setMargins(imageView, margin);
        }
        ViewUtilsKt.applyWidth(imageView, remoteImage.getWidth());
        ViewUtilsKt.applyHeight(imageView, remoteImage.getHeight());
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StyleElements.PositionType justification = remoteImage.getJustification();
        float f = RecyclerView.DECELERATION_RATE;
        if (justification != null) {
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                int i = WhenMappings.$EnumSwitchMapping$0[justification.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        f = 0.5f;
                    } else {
                        if (i != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        f = 1.0f;
                    }
                }
                layoutParams2.horizontalBias = f;
            }
        } else if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams;
            Context context = imageView.getContext();
            context.getClass();
            if (ResToolsKt.boolFromAttr$default(context, R.attr.personaCenterAlignRemoteAsset)) {
                f = 0.5f;
            }
            layoutParams3.horizontalBias = f;
        }
        imageView.setLayoutParams(layoutParams);
    }

    public static final void replaceColors(ThemeableLottieAnimationView themeableLottieAnimationView, Integer num, Integer num2, Integer num3, Integer num4, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        themeableLottieAnimationView.getClass();
        if (num != null) {
            int intValue = num.intValue();
            for (String str : strArr) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor(str), intValue);
            }
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            for (String str2 : strArr2) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor(str2), intValue2);
            }
        }
        if (num3 != null) {
            int intValue3 = num3.intValue();
            for (String str3 : strArr3) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor(str3), intValue3);
            }
        }
        if (num4 != null) {
            int intValue4 = num4.intValue();
            for (String str4 : strArr4) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor(str4), intValue4);
            }
        }
    }
}
