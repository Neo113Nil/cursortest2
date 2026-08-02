package com.stripe.android.financialconnections.ui.theme;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.navigation.Navigator;
import androidx.room.Room;
import com.squareup.cash.ui.drawable.RippleDrawableKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes8.dex */
public abstract class ThemeKt {
    public static final FinancialConnectionsColors Colors;
    public static final FinancialConnectionsColors DarkThemeColors;
    public static final FinancialConnectionsColors InstantDebitsColors;
    public static final FinancialConnectionsColors InstantDebitsDarkModeColors;
    public static final StaticProvidableCompositionLocal LocalColors;
    public static final StaticProvidableCompositionLocal LocalTypography;
    public static final FinancialConnectionsTypography Typography;

    static {
        long j = ColorKt.Neutral0;
        long j2 = ColorKt.Neutral25;
        long j3 = ColorKt.Neutral50;
        long j4 = ColorKt.Neutral800;
        long j5 = ColorKt.Neutral600;
        long j6 = ColorKt.FeedbackCritical600;
        long j7 = ColorKt.Neutral700;
        long j8 = ColorKt.Neutral100;
        long j9 = ColorKt.Neutral200;
        long j10 = ColorKt.Attention50;
        long j11 = ColorKt.Attention300;
        long j12 = ColorKt.Brand500;
        long j13 = ColorKt.Brand600;
        Colors = new FinancialConnectionsColors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j, j13, j13, j13, j12, ColorKt.Brand25, j12, j13);
        long j14 = ColorKt.Neutral0Dark;
        long j15 = ColorKt.Neutral25Dark;
        long j16 = ColorKt.Neutral50Dark;
        long j17 = ColorKt.Neutral800Dark;
        long j18 = ColorKt.Neutral100Dark;
        long j19 = ColorKt.Attention100Dark;
        DarkThemeColors = new FinancialConnectionsColors(j14, j15, j16, j2, j17, j6, j2, j18, j9, j19, j11, j12, j, j12, j13, j, j12, ColorKt.Brand25Dark, j12, j13);
        long j20 = ColorKt.LinkGreen200;
        long j21 = ColorKt.LinkGreen900;
        long j22 = ColorKt.LinkGreen500;
        InstantDebitsColors = new FinancialConnectionsColors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j20, j21, j22, j20, j21, j22, ColorKt.LinkGreen50, j20, j20);
        InstantDebitsDarkModeColors = new FinancialConnectionsColors(j14, j15, j16, j2, j17, j6, j2, j18, j9, j19, j11, j20, j21, j20, j13, j, j22, ColorKt.LinkGreen50Dark, j20, j20);
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.Center, 0, 0);
        long sp = Room.getSp(28);
        long sp2 = Room.getSp(36);
        long sp3 = Room.getSp(0.38d);
        FontWeight fontWeight = FontWeight.W700;
        TextStyle compat = toCompat(new TextStyle(0L, sp, fontWeight, null, sp3, 0L, 0, 0, sp2, lineHeightStyle, 15597433), false);
        long sp4 = Room.getSp(28);
        long sp5 = Room.getSp(36);
        long sp6 = Room.getSp(0.38d);
        FontWeight fontWeight2 = FontWeight.W400;
        TextStyle compat2 = toCompat(new TextStyle(0L, sp4, fontWeight2, null, sp6, 0L, 0, 0, sp5, lineHeightStyle, 15597433), false);
        TextStyle compat3 = toCompat(new TextStyle(0L, Room.getSp(24), fontWeight, null, Room.getSp(0.3d), 0L, 0, 0, Room.getSp(32), lineHeightStyle, 15597433), false);
        TextStyle compat4 = toCompat(new TextStyle(0L, Room.getSp(20), fontWeight, null, Room.getSp(0.3d), 0L, 0, 0, Room.getSp(28), lineHeightStyle, 15597433), false);
        long sp7 = Room.getSp(16);
        long sp8 = Room.getSp(24);
        FontWeight fontWeight3 = FontWeight.W600;
        Typography = new FinancialConnectionsTypography(compat, compat2, compat3, compat4, toCompat(new TextStyle(0L, sp7, fontWeight3, null, 0L, 0L, 0, 0, sp8, lineHeightStyle, 15597561), false), toCompat(new TextStyle(0L, Room.getSp(16), fontWeight2, null, 0L, 0L, 0, 0, Room.getSp(24), lineHeightStyle, 15597561), false), toCompat(new TextStyle(0L, Room.getSp(14), fontWeight2, null, 0L, 0L, 0, 0, Room.getSp(20), lineHeightStyle, 15597561), false), toCompat(new TextStyle(0L, Room.getSp(16), fontWeight3, null, 0L, 0L, 0, 0, Room.getSp(24), lineHeightStyle, 15597561), false), toCompat(new TextStyle(0L, Room.getSp(16), fontWeight2, null, 0L, 0L, 0, 0, Room.getSp(24), lineHeightStyle, 15597561), false), toCompat(new TextStyle(0L, Room.getSp(14), fontWeight3, null, 0L, 0L, 0, 0, Room.getSp(20), lineHeightStyle, 15597561), false), toCompat(new TextStyle(0L, Room.getSp(14), fontWeight2, null, 0L, 0L, 0, 0, Room.getSp(20), lineHeightStyle, 15597561), false), toCompat(new TextStyle(0L, Room.getSp(12), fontWeight2, null, 0L, 0L, 0, 0, Room.getSp(16), lineHeightStyle, 15597561), false));
        LocalTypography = new StaticProvidableCompositionLocal(new ConsumerSession$$ExternalSyntheticLambda0(24));
        LocalColors = new StaticProvidableCompositionLocal(new ConsumerSession$$ExternalSyntheticLambda0(25));
    }

    public static final void FinancialConnectionsTheme(Theme theme, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        FinancialConnectionsColors financialConnectionsColors;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1762717984);
        int i2 = (gapComposer.changed(theme == null ? -1 : theme.ordinal()) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ProvidedValue defaultProvidedValue$runtime = FinancialConnectionsSheetNativeActivityKt.LocalNavHostController.defaultProvidedValue$runtime(RippleDrawableKt.rememberNavController(new Navigator[0], gapComposer));
            ProvidedValue defaultProvidedValue$runtime2 = LocalTypography.defaultProvidedValue$runtime(Typography);
            int ordinal = theme.ordinal();
            if (ordinal == 0) {
                financialConnectionsColors = ImageKt.isSystemInDarkTheme(gapComposer) ? DarkThemeColors : Colors;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                financialConnectionsColors = ImageKt.isSystemInDarkTheme(gapComposer) ? InstantDebitsDarkModeColors : InstantDebitsColors;
            }
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, defaultProvidedValue$runtime2, LocalColors.defaultProvidedValue$runtime(financialConnectionsColors)}, Expect_jvmKt.rememberComposableLambda(759526304, new StripeThemeKt$$ExternalSyntheticLambda2(composableLambdaImpl, 12), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(theme, composableLambdaImpl, i, 28);
        }
    }

    public static final TextSelectionColors getTextSelectionColors(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalColors;
        return new TextSelectionColors(((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textDefault, Color.m675copywmQWz5c$default(0.4f, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textDefault, 14));
    }

    public static final TextStyle toCompat(TextStyle textStyle, boolean z) {
        TextStyle textStyle2;
        long j;
        if (z) {
            j = TextStyle.Default.paragraphStyle.lineHeight;
            textStyle2 = textStyle;
        } else {
            textStyle2 = textStyle;
            j = textStyle2.paragraphStyle.lineHeight;
        }
        return TextStyle.m994copyp1EtxEg$default(textStyle2, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, j, new PlatformTextStyle(true), TextStyle.Default.paragraphStyle.lineHeightStyle, 0, 15073279);
    }
}
