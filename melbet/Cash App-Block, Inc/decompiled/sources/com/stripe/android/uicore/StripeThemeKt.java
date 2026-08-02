package com.stripe.android.uicore;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import com.stripe.android.uicore.image.LocalImageOptimizerKt;
import com.stripe.android.uicore.image.LocalStripeImageLoaderKt;
import com.stripe.android.uicore.image.NetworkImageDecoder;
import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import kotlin.Result;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public abstract class StripeThemeKt {
    public static final StaticProvidableCompositionLocal LocalColors;
    public static final StaticProvidableCompositionLocal LocalIconStyle;
    public static final StaticProvidableCompositionLocal LocalInstrumentationTest;
    public static final StaticProvidableCompositionLocal LocalSectionSpacing;
    public static final StaticProvidableCompositionLocal LocalSectionStyle;
    public static final StaticProvidableCompositionLocal LocalShapes;
    public static final StaticProvidableCompositionLocal LocalTextFieldInsets;
    public static final StaticProvidableCompositionLocal LocalTypography;

    static {
        ColorKt.Color(4280595582L);
        ColorKt.Color(1090519039);
        LocalColors = new StaticProvidableCompositionLocal(new HCaptchaHtmlKt$$ExternalSyntheticLambda0(9));
        LocalShapes = new StaticProvidableCompositionLocal(new HCaptchaHtmlKt$$ExternalSyntheticLambda0(10));
        LocalTypography = new StaticProvidableCompositionLocal(new HCaptchaHtmlKt$$ExternalSyntheticLambda0(11));
        LocalSectionSpacing = new StaticProvidableCompositionLocal(new HCaptchaHtmlKt$$ExternalSyntheticLambda0(12));
        LocalIconStyle = new StaticProvidableCompositionLocal(new HCaptchaHtmlKt$$ExternalSyntheticLambda0(13));
        LocalInstrumentationTest = new StaticProvidableCompositionLocal(new HCaptchaHtmlKt$$ExternalSyntheticLambda0(14));
        LocalSectionStyle = new StaticProvidableCompositionLocal(new HCaptchaHtmlKt$$ExternalSyntheticLambda0(7));
        LocalTextFieldInsets = new StaticProvidableCompositionLocal(new HCaptchaHtmlKt$$ExternalSyntheticLambda0(8));
    }

    public static final void StripeTheme(StripeColors stripeColors, StripeShapes stripeShapes, StripeTypography stripeTypography, SectionStyle sectionStyle, FormInsets formInsets, IconStyle iconStyle, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Object failure;
        Object obj = Boolean.FALSE;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1364556707);
        int i2 = i | (gapComposer.changed(stripeColors) ? 4 : 2) | (gapComposer.changed(stripeShapes) ? 32 : 16) | (gapComposer.changed(stripeTypography) ? 256 : 128) | (gapComposer.changed((Object) null) ? 2048 : 1024) | (gapComposer.changed(sectionStyle == null ? -1 : sectionStyle.ordinal()) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(formInsets) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(iconStyle != null ? iconStyle.ordinal() : -1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            try {
                Result.Companion companion = Result.Companion;
                failure = obj;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            Object obj2 = Boolean.FALSE;
            if (failure instanceof Result.Failure) {
                failure = obj2;
            }
            boolean booleanValue = ((Boolean) failure).booleanValue();
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = InspectionModeKt.LocalInspectionMode;
            boolean z = ((Boolean) gapComposer.consume(staticProvidableCompositionLocal)).booleanValue() || booleanValue;
            ProvidedValue defaultProvidedValue$runtime = LocalColors.defaultProvidedValue$runtime(stripeColors);
            ProvidedValue defaultProvidedValue$runtime2 = LocalShapes.defaultProvidedValue$runtime(stripeShapes);
            ProvidedValue defaultProvidedValue$runtime3 = LocalTypography.defaultProvidedValue$runtime(stripeTypography);
            ProvidedValue defaultProvidedValue$runtime4 = LocalSectionSpacing.defaultProvidedValue$runtime(null);
            ProvidedValue defaultProvidedValue$runtime5 = LocalSectionStyle.defaultProvidedValue$runtime(sectionStyle);
            ProvidedValue defaultProvidedValue$runtime6 = LocalTextFieldInsets.defaultProvidedValue$runtime(formInsets);
            ProvidedValue defaultProvidedValue$runtime7 = LocalIconStyle.defaultProvidedValue$runtime(iconStyle);
            ProvidedValue defaultProvidedValue$runtime8 = staticProvidableCompositionLocal.defaultProvidedValue$runtime(Boolean.valueOf(z));
            ProvidedValue defaultProvidedValue$runtime9 = LocalInstrumentationTest.defaultProvidedValue$runtime(obj);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = LocalStripeImageLoaderKt.LocalStripeImageLoader;
            Context applicationContext = ((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getApplicationContext();
            applicationContext.getClass();
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, defaultProvidedValue$runtime2, defaultProvidedValue$runtime3, defaultProvidedValue$runtime4, defaultProvidedValue$runtime5, defaultProvidedValue$runtime6, defaultProvidedValue$runtime7, defaultProvidedValue$runtime8, defaultProvidedValue$runtime9, staticProvidableCompositionLocal2.defaultProvidedValue$runtime(new DefaultStripeImageLoader(applicationContext, 30)), LocalImageOptimizerKt.LocalImageOptimizer.defaultProvidedValue$runtime(NetworkImageDecoder.INSTANCE)}, Expect_jvmKt.rememberComposableLambda(330928227, new StripeThemeKt$$ExternalSyntheticLambda0(stripeColors, stripeTypography, stripeShapes, composableLambdaImpl, 0), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetKt$$ExternalSyntheticLambda0(stripeColors, stripeShapes, stripeTypography, sectionStyle, formInsets, iconStyle, composableLambdaImpl, i, 21);
        }
    }

    /* renamed from: getBorderStrokeWidth-6a0pyJM, reason: not valid java name */
    public static final float m4066getBorderStrokeWidth6a0pyJM(boolean z, float f, Composer composer, int i, int i2) {
        float f2;
        if ((i2 & 2) != 0) {
            f = 2.0f;
        }
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalShapes;
        GapComposer gapComposer = (GapComposer) composer;
        if (z) {
            gapComposer.startReplaceGroup(-1363702541);
            f2 = Math.max(((StripeShapes) gapComposer.consume(staticProvidableCompositionLocal)).borderStrokeWidth, f);
        } else {
            gapComposer.startReplaceGroup(-1363699464);
            f2 = ((StripeShapes) gapComposer.consume(staticProvidableCompositionLocal)).borderStrokeWidth;
        }
        gapComposer.end(false);
        return f2;
    }

    public static final StripeColors getStripeColors(Composer composer) {
        return (StripeColors) ((GapComposer) composer).consume(LocalColors);
    }

    public static final TextStyle toCompat(TextStyle textStyle) {
        ParagraphStyle paragraphStyle = TextStyle.Default.paragraphStyle;
        return TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, paragraphStyle.lineHeight, new PlatformTextStyle(true), paragraphStyle.lineHeightStyle, 0, 15073279);
    }
}
