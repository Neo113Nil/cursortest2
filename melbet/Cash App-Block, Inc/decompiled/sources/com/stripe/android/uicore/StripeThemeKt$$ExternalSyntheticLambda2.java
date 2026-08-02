package com.stripe.android.uicore;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.RippleConfiguration;
import androidx.compose.material.RippleKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.DialogLayout;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.room.util.TableInfoKt;
import coil3.memory.MemoryCacheService;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsh;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.tax.applet.views.TaxesAppletTile$$ExternalSyntheticLambda10;
import com.squareup.util.Strings;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class StripeThemeKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposableLambdaImpl f$0;

    public /* synthetic */ StripeThemeKt$$ExternalSyntheticLambda2(int i, int i2, ComposableLambdaImpl composableLambdaImpl) {
        this.$r8$classId = i2;
        this.f$0 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final Window window;
        int i = this.$r8$classId;
        int i2 = 1;
        ComposableLambdaImpl composableLambdaImpl = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = TextKt.LocalTextStyle;
                    Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(StripeThemeKt.toCompat((TextStyle) gapComposer.consume(dynamicProvidableCompositionLocal))), Expect_jvmKt.rememberComposableLambda(-1470040713, new StripeThemeKt$$ExternalSyntheticLambda2(composableLambdaImpl, 15), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AlphaKt.TooltipContent(composableLambdaImpl, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AlphaKt.TooltipContent(composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer3, (Object) 6);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer4, (Object) 6);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer5, (Object) 6);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1736416039, new TaxesAppletTile$$ExternalSyntheticLambda10(composableLambdaImpl, i2), gapComposer6), gapComposer6, 24576, 15);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                TableInfoKt.NullStateCarouselPageLayout(composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 8:
                ((Integer) obj2).getClass();
                zzsh.WindowBoundLifecycle(composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ListItemKt.LoadingShimmerEffect(composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 10:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer7, (Object) 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                LayoutKt.StripeThemeForConnections(composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 12:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.LocalView;
                    final View view = (View) gapComposer8.consume(staticProvidableCompositionLocal);
                    ViewParent parent = ((View) gapComposer8.consume(staticProvidableCompositionLocal)).getParent();
                    Window window2 = null;
                    DialogLayout dialogLayout = parent instanceof DialogLayout ? (DialogLayout) parent : null;
                    Window window3 = dialogLayout != null ? dialogLayout.window : null;
                    if (window3 == null) {
                        gapComposer8.startReplaceGroup(-839731934);
                        Context context = ((View) gapComposer8.consume(staticProvidableCompositionLocal)).getContext();
                        context.getClass();
                        while (true) {
                            if (context instanceof Activity) {
                                window2 = ((Activity) context).getWindow();
                            } else if (context instanceof ContextWrapper) {
                                context = ((ContextWrapper) context).getBaseContext();
                                context.getClass();
                            }
                        }
                        gapComposer8.end(false);
                        window = window2;
                    } else {
                        gapComposer8.startReplaceGroup(-839734941);
                        gapComposer8.end(false);
                        window = window3;
                    }
                    final long j = ((FinancialConnectionsColors) gapComposer8.consume(ThemeKt.LocalColors)).borderNeutral;
                    gapComposer8.startReplaceGroup(1160592518);
                    final boolean z = !ImageKt.isSystemInDarkTheme(gapComposer8);
                    boolean changedInstance = gapComposer8.changedInstance(window) | gapComposer8.changedInstance(view) | gapComposer8.changed(j) | gapComposer8.changed(z);
                    Object rememberedValue = gapComposer8.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        Function0 function0 = new Function0() { // from class: com.stripe.android.financialconnections.ui.theme.ThemeKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Window window4 = window;
                                if (window4 != null) {
                                    MemoryCacheService memoryCacheService = new MemoryCacheService(view);
                                    int i3 = Build.VERSION.SDK_INT;
                                    Strings impl35 = i3 >= 35 ? new WindowInsetsControllerCompat.Impl35(window4, memoryCacheService) : i3 >= 30 ? new WindowInsetsControllerCompat.Impl30(window4, memoryCacheService) : new WindowInsetsControllerCompat.Impl26(window4, memoryCacheService);
                                    window4.setNavigationBarColor(androidx.compose.ui.graphics.ColorKt.m694toArgb8_81llA(j));
                                    impl35.setAppearanceLightNavigationBars(z);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer8.updateRememberedValue(function0);
                        rememberedValue = function0;
                    }
                    Updater.SideEffect((Function0) rememberedValue, gapComposer8);
                    gapComposer8.end(false);
                    long j2 = Color.Magenta;
                    CardKt.MaterialTheme(new Colors(j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, true), null, null, Expect_jvmKt.rememberComposableLambda(1182787700, new StripeThemeKt$$ExternalSyntheticLambda2(composableLambdaImpl, 13), gapComposer8), gapComposer8, 3072, 6);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ProvidedValue defaultProvidedValue$runtime = TextSelectionColorsKt.LocalTextSelectionColors.defaultProvidedValue$runtime(ThemeKt.getTextSelectionColors(gapComposer9));
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = TextKt.LocalTextStyle;
                    ProvidedValue defaultProvidedValue$runtime2 = dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(ThemeKt.toCompat((TextStyle) gapComposer9.consume(dynamicProvidableCompositionLocal2), true));
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal3 = RippleKt.LocalRippleConfiguration;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ThemeKt.LocalColors;
                    long j3 = ((FinancialConnectionsColors) gapComposer9.consume(staticProvidableCompositionLocal2)).textAction;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ColorsKt.LocalColors;
                    boolean isLight = ((Colors) gapComposer9.consume(staticProvidableCompositionLocal3)).isLight();
                    float m690luminance8_81llA = ColorKt.m690luminance8_81llA(j3);
                    if (!isLight && m690luminance8_81llA < 0.5d) {
                        j3 = Color.White;
                    }
                    Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, defaultProvidedValue$runtime2, dynamicProvidableCompositionLocal3.defaultProvidedValue$runtime(new RippleConfiguration(j3, ((Colors) gapComposer9.consume(staticProvidableCompositionLocal3)).isLight() ? ((double) ColorKt.m690luminance8_81llA(((FinancialConnectionsColors) gapComposer9.consume(staticProvidableCompositionLocal2)).textAction)) > 0.5d ? RippleKt.LightThemeHighContrastRippleAlpha : RippleKt.LightThemeLowContrastRippleAlpha : RippleKt.DarkThemeRippleAlpha))}, Expect_jvmKt.rememberComposableLambda(-2074616908, new StripeThemeKt$$ExternalSyntheticLambda2(composableLambdaImpl, 14), gapComposer9), gapComposer9, 56);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer10, (Object) 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            default:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer11, (Object) 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ StripeThemeKt$$ExternalSyntheticLambda2(ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = composableLambdaImpl;
    }
}
