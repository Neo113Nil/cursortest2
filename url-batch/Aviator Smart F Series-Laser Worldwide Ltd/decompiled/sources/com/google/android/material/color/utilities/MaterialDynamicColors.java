package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.function.Function;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class MaterialDynamicColors {
    private final boolean isExtendedFidelity;

    public MaterialDynamicColors() {
        this.isExtendedFidelity = false;
    }

    static double findDesiredChromaByTone(double d8, double d9, double d10, boolean z7) {
        Hct from = Hct.from(d8, d9, d10);
        if (from.getChroma() >= d9) {
            return d10;
        }
        Hct hct = from;
        double chroma = from.getChroma();
        double d11 = d10;
        while (hct.getChroma() < d9) {
            double d12 = d11 + (z7 ? -1.0d : 1.0d);
            Hct from2 = Hct.from(d8, d9, d12);
            if (chroma > from2.getChroma() || Math.abs(from2.getChroma() - d9) < 0.4d) {
                return d12;
            }
            if (Math.abs(from2.getChroma() - d9) < Math.abs(hct.getChroma() - d9)) {
                hct = from2;
            }
            chroma = Math.max(chroma, from2.getChroma());
            d11 = d12;
        }
        return d11;
    }

    private boolean isFidelity(DynamicScheme dynamicScheme) {
        Variant variant;
        Variant variant2;
        return !(!this.isExtendedFidelity || (variant2 = dynamicScheme.variant) == Variant.MONOCHROME || variant2 == Variant.NEUTRAL) || (variant = dynamicScheme.variant) == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    private static boolean isMonochrome(DynamicScheme dynamicScheme) {
        return dynamicScheme.variant == Variant.MONOCHROME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$background$11(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlActivated$146(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$150(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$151(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 0.2d : 0.12d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlNormal$148(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$error$92(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$error$93(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(errorContainer(), error(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$errorContainer$98(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$errorContainer$99(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(errorContainer(), error(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseOnSurface$40(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 95.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inverseOnSurface$41(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inversePrimary$65(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 40.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inversePrimary$66(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseSurface$38(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 20.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralPaletteKeyColor$7(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralVariantPaletteKeyColor$9(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralVariantPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onBackground$13(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onBackground$14(DynamicScheme dynamicScheme) {
        return background();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onError$95(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onError$96(DynamicScheme dynamicScheme) {
        return error();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onErrorContainer$101(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onErrorContainer$102(DynamicScheme dynamicScheme) {
        return errorContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimary$56(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimary$57(DynamicScheme dynamicScheme) {
        return primary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onPrimaryContainer$62(DynamicScheme dynamicScheme) {
        Object apply;
        if (isFidelity(dynamicScheme)) {
            apply = primaryContainer().tone.apply(dynamicScheme);
            return Double.valueOf(DynamicColor.foregroundTone(((Double) apply).doubleValue(), 4.5d));
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryContainer$63(DynamicScheme dynamicScheme) {
        return primaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixed$110(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 100.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$111(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$112(DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixedVariant$114(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$115(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$116(DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondary$71(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondary$72(DynamicScheme dynamicScheme) {
        return secondary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onSecondaryContainer$77(DynamicScheme dynamicScheme) {
        Object apply;
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
        }
        if (!isFidelity(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 30.0d);
        }
        apply = secondaryContainer().tone.apply(dynamicScheme);
        return Double.valueOf(DynamicColor.foregroundTone(((Double) apply).doubleValue(), 4.5d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryContainer$78(DynamicScheme dynamicScheme) {
        return secondaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixed$124(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$125(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$126(DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixedVariant$128(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 25.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$129(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$130(DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurface$32(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurfaceVariant$36(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiary$83(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiary$84(DynamicScheme dynamicScheme) {
        return tertiary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onTertiaryContainer$89(DynamicScheme dynamicScheme) {
        Object apply;
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : 100.0d);
        }
        if (!isFidelity(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 30.0d);
        }
        apply = tertiaryContainer().tone.apply(dynamicScheme);
        return Double.valueOf(DynamicColor.foregroundTone(((Double) apply).doubleValue(), 4.5d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryContainer$90(DynamicScheme dynamicScheme) {
        return tertiaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixed$138(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 100.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$139(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$140(DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixedVariant$142(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$143(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$144(DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outline$43(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 60.0d : 50.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outlineVariant$45(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primary$53(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 100.0d : com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primary$54(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryContainer(), primary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$primaryContainer$59(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.sourceColorHct.getTone());
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 85.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryContainer$60(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryContainer(), primary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixed$104(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 40.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryFixed$105(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixedDim$107(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryFixedDim$108(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryPaletteKeyColor$1(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.primaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$scrim$49(DynamicScheme dynamicScheme) {
        return Double.valueOf(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondary$68(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondary$69(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryContainer(), secondary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$secondaryContainer$74(DynamicScheme dynamicScheme) {
        double d8 = dynamicScheme.isDark ? 30.0d : 90.0d;
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 30.0d : 85.0d);
        }
        return !isFidelity(dynamicScheme) ? Double.valueOf(d8) : Double.valueOf(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d8, !dynamicScheme.isDark));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryContainer$75(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryContainer(), secondary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixed$118(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 80.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryFixed$119(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixedDim$121(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 70.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryFixedDim$122(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryPaletteKeyColor$3(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.secondaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$shadow$47(DynamicScheme dynamicScheme) {
        return Double.valueOf(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surface$16(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceBright$20(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(24.0d, 24.0d, 29.0d, 34.0d).get(dynamicScheme.contrastLevel) : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainer$26(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(12.0d, 12.0d, 16.0d, 20.0d).get(dynamicScheme.contrastLevel) : new ContrastCurve(94.0d, 94.0d, 92.0d, 90.0d).get(dynamicScheme.contrastLevel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHigh$28(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(17.0d, 17.0d, 21.0d, 25.0d).get(dynamicScheme.contrastLevel) : new ContrastCurve(92.0d, 92.0d, 88.0d, 85.0d).get(dynamicScheme.contrastLevel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHighest$30(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(22.0d, 22.0d, 26.0d, 30.0d).get(dynamicScheme.contrastLevel) : new ContrastCurve(90.0d, 90.0d, 84.0d, 80.0d).get(dynamicScheme.contrastLevel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLow$24(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(10.0d, 10.0d, 11.0d, 12.0d).get(dynamicScheme.contrastLevel) : new ContrastCurve(96.0d, 96.0d, 96.0d, 95.0d).get(dynamicScheme.contrastLevel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLowest$22(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? new ContrastCurve(4.0d, 4.0d, 2.0d, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON).get(dynamicScheme.contrastLevel) : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceDim$18(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : new ContrastCurve(87.0d, 87.0d, 80.0d, 75.0d).get(dynamicScheme.contrastLevel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceTint$51(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceVariant$34(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiary$80(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiary$81(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryContainer(), tertiary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$tertiaryContainer$86(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 60.0d : 49.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone())).getTone());
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryContainer$87(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryContainer(), tertiary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixed$132(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 40.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryFixed$133(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixedDim$135(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryFixedDim$136(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryPaletteKeyColor$5(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.tertiaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textHintInverse$161(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverse$153(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverseDisableOnly$157(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverse$155(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverseDisabled$159(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    @NonNull
    public DynamicColor background() {
        return new DynamicColor("background", new Function() { // from class: com.google.android.material.color.utilities.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$background$11;
                lambda$background$11 = MaterialDynamicColors.lambda$background$11((DynamicScheme) obj);
                return lambda$background$11;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor controlActivated() {
        return DynamicColor.fromPalette("control_activated", new Function() { // from class: com.google.android.material.color.utilities.w2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.x2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$controlActivated$146;
                lambda$controlActivated$146 = MaterialDynamicColors.lambda$controlActivated$146((DynamicScheme) obj);
                return lambda$controlActivated$146;
            }
        });
    }

    @NonNull
    public DynamicColor controlHighlight() {
        return new DynamicColor("control_highlight", new Function() { // from class: com.google.android.material.color.utilities.w4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.y4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$controlHighlight$150;
                lambda$controlHighlight$150 = MaterialDynamicColors.lambda$controlHighlight$150((DynamicScheme) obj);
                return lambda$controlHighlight$150;
            }
        }, false, null, null, null, null, new Function() { // from class: com.google.android.material.color.utilities.z4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$controlHighlight$151;
                lambda$controlHighlight$151 = MaterialDynamicColors.lambda$controlHighlight$151((DynamicScheme) obj);
                return lambda$controlHighlight$151;
            }
        });
    }

    @NonNull
    public DynamicColor controlNormal() {
        return DynamicColor.fromPalette("control_normal", new Function() { // from class: com.google.android.material.color.utilities.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$controlNormal$148;
                lambda$controlNormal$148 = MaterialDynamicColors.lambda$controlNormal$148((DynamicScheme) obj);
                return lambda$controlNormal$148;
            }
        });
    }

    @NonNull
    public DynamicColor error() {
        return new DynamicColor("error", new Function() { // from class: com.google.android.material.color.utilities.g2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).errorPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.h2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$error$92;
                lambda$error$92 = MaterialDynamicColors.lambda$error$92((DynamicScheme) obj);
                return lambda$error$92;
            }
        }, true, new j2(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.i2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$error$93;
                lambda$error$93 = MaterialDynamicColors.this.lambda$error$93((DynamicScheme) obj);
                return lambda$error$93;
            }
        });
    }

    @NonNull
    public DynamicColor errorContainer() {
        return new DynamicColor("error_container", new Function() { // from class: com.google.android.material.color.utilities.y0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).errorPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.z0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$errorContainer$98;
                lambda$errorContainer$98 = MaterialDynamicColors.lambda$errorContainer$98((DynamicScheme) obj);
                return lambda$errorContainer$98;
            }
        }, true, new j2(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.a1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$errorContainer$99;
                lambda$errorContainer$99 = MaterialDynamicColors.this.lambda$errorContainer$99((DynamicScheme) obj);
                return lambda$errorContainer$99;
            }
        });
    }

    @NonNull
    public DynamicColor highestSurface(@NonNull DynamicScheme dynamicScheme) {
        return dynamicScheme.isDark ? surfaceBright() : surfaceDim();
    }

    @NonNull
    public DynamicColor inverseOnSurface() {
        return new DynamicColor("inverse_on_surface", new Function() { // from class: com.google.android.material.color.utilities.o0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$inverseOnSurface$40;
                lambda$inverseOnSurface$40 = MaterialDynamicColors.lambda$inverseOnSurface$40((DynamicScheme) obj);
                return lambda$inverseOnSurface$40;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.q0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$inverseOnSurface$41;
                lambda$inverseOnSurface$41 = MaterialDynamicColors.this.lambda$inverseOnSurface$41((DynamicScheme) obj);
                return lambda$inverseOnSurface$41;
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor inversePrimary() {
        return new DynamicColor("inverse_primary", new Function() { // from class: com.google.android.material.color.utilities.o2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$inversePrimary$65;
                lambda$inversePrimary$65 = MaterialDynamicColors.lambda$inversePrimary$65((DynamicScheme) obj);
                return lambda$inversePrimary$65;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.q2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$inversePrimary$66;
                lambda$inversePrimary$66 = MaterialDynamicColors.this.lambda$inversePrimary$66((DynamicScheme) obj);
                return lambda$inversePrimary$66;
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), null);
    }

    @NonNull
    public DynamicColor inverseSurface() {
        return new DynamicColor("inverse_surface", new Function() { // from class: com.google.android.material.color.utilities.e2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.f2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$inverseSurface$38;
                lambda$inverseSurface$38 = MaterialDynamicColors.lambda$inverseSurface$38((DynamicScheme) obj);
                return lambda$inverseSurface$38;
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public DynamicColor neutralPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.l0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$neutralPaletteKeyColor$7;
                lambda$neutralPaletteKeyColor$7 = MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj);
                return lambda$neutralPaletteKeyColor$7;
            }
        });
    }

    @NonNull
    public DynamicColor neutralVariantPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_variant_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.m3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.n3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$neutralVariantPaletteKeyColor$9;
                lambda$neutralVariantPaletteKeyColor$9 = MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9((DynamicScheme) obj);
                return lambda$neutralVariantPaletteKeyColor$9;
            }
        });
    }

    @NonNull
    public DynamicColor onBackground() {
        return new DynamicColor("on_background", new Function() { // from class: com.google.android.material.color.utilities.j1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onBackground$13;
                lambda$onBackground$13 = MaterialDynamicColors.lambda$onBackground$13((DynamicScheme) obj);
                return lambda$onBackground$13;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.l1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onBackground$14;
                lambda$onBackground$14 = MaterialDynamicColors.this.lambda$onBackground$14((DynamicScheme) obj);
                return lambda$onBackground$14;
            }
        }, null, new ContrastCurve(3.0d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public DynamicColor onError() {
        return new DynamicColor("on_error", new Function() { // from class: com.google.android.material.color.utilities.c4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).errorPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.d4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onError$95;
                lambda$onError$95 = MaterialDynamicColors.lambda$onError$95((DynamicScheme) obj);
                return lambda$onError$95;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.e4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onError$96;
                lambda$onError$96 = MaterialDynamicColors.this.lambda$onError$96((DynamicScheme) obj);
                return lambda$onError$96;
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onErrorContainer() {
        return new DynamicColor("on_error_container", new Function() { // from class: com.google.android.material.color.utilities.u1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).errorPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onErrorContainer$101;
                lambda$onErrorContainer$101 = MaterialDynamicColors.lambda$onErrorContainer$101((DynamicScheme) obj);
                return lambda$onErrorContainer$101;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.w1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onErrorContainer$102;
                lambda$onErrorContainer$102 = MaterialDynamicColors.this.lambda$onErrorContainer$102((DynamicScheme) obj);
                return lambda$onErrorContainer$102;
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onPrimary() {
        return new DynamicColor("on_primary", new Function() { // from class: com.google.android.material.color.utilities.e3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onPrimary$56;
                lambda$onPrimary$56 = MaterialDynamicColors.lambda$onPrimary$56((DynamicScheme) obj);
                return lambda$onPrimary$56;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.h3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onPrimary$57;
                lambda$onPrimary$57 = MaterialDynamicColors.this.lambda$onPrimary$57((DynamicScheme) obj);
                return lambda$onPrimary$57;
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryContainer() {
        return new DynamicColor("on_primary_container", new Function() { // from class: com.google.android.material.color.utilities.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.h1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onPrimaryContainer$62;
                lambda$onPrimaryContainer$62 = MaterialDynamicColors.this.lambda$onPrimaryContainer$62((DynamicScheme) obj);
                return lambda$onPrimaryContainer$62;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.i1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onPrimaryContainer$63;
                lambda$onPrimaryContainer$63 = MaterialDynamicColors.this.lambda$onPrimaryContainer$63((DynamicScheme) obj);
                return lambda$onPrimaryContainer$63;
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryFixed() {
        return new DynamicColor("on_primary_fixed", new Function() { // from class: com.google.android.material.color.utilities.r3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onPrimaryFixed$110;
                lambda$onPrimaryFixed$110 = MaterialDynamicColors.lambda$onPrimaryFixed$110((DynamicScheme) obj);
                return lambda$onPrimaryFixed$110;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.t3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onPrimaryFixed$111;
                lambda$onPrimaryFixed$111 = MaterialDynamicColors.this.lambda$onPrimaryFixed$111((DynamicScheme) obj);
                return lambda$onPrimaryFixed$111;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.u3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onPrimaryFixed$112;
                lambda$onPrimaryFixed$112 = MaterialDynamicColors.this.lambda$onPrimaryFixed$112((DynamicScheme) obj);
                return lambda$onPrimaryFixed$112;
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryFixedVariant() {
        return new DynamicColor("on_primary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.g5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.h5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onPrimaryFixedVariant$114;
                lambda$onPrimaryFixedVariant$114 = MaterialDynamicColors.lambda$onPrimaryFixedVariant$114((DynamicScheme) obj);
                return lambda$onPrimaryFixedVariant$114;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onPrimaryFixedVariant$115;
                lambda$onPrimaryFixedVariant$115 = MaterialDynamicColors.this.lambda$onPrimaryFixedVariant$115((DynamicScheme) obj);
                return lambda$onPrimaryFixedVariant$115;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onPrimaryFixedVariant$116;
                lambda$onPrimaryFixedVariant$116 = MaterialDynamicColors.this.lambda$onPrimaryFixedVariant$116((DynamicScheme) obj);
                return lambda$onPrimaryFixedVariant$116;
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onSecondary() {
        return new DynamicColor("on_secondary", new Function() { // from class: com.google.android.material.color.utilities.h4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onSecondary$71;
                lambda$onSecondary$71 = MaterialDynamicColors.lambda$onSecondary$71((DynamicScheme) obj);
                return lambda$onSecondary$71;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.j4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onSecondary$72;
                lambda$onSecondary$72 = MaterialDynamicColors.this.lambda$onSecondary$72((DynamicScheme) obj);
                return lambda$onSecondary$72;
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryContainer() {
        return new DynamicColor("on_secondary_container", new Function() { // from class: com.google.android.material.color.utilities.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onSecondaryContainer$77;
                lambda$onSecondaryContainer$77 = MaterialDynamicColors.this.lambda$onSecondaryContainer$77((DynamicScheme) obj);
                return lambda$onSecondaryContainer$77;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.t1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onSecondaryContainer$78;
                lambda$onSecondaryContainer$78 = MaterialDynamicColors.this.lambda$onSecondaryContainer$78((DynamicScheme) obj);
                return lambda$onSecondaryContainer$78;
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryFixed() {
        return new DynamicColor("on_secondary_fixed", new Function() { // from class: com.google.android.material.color.utilities.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onSecondaryFixed$124;
                lambda$onSecondaryFixed$124 = MaterialDynamicColors.lambda$onSecondaryFixed$124((DynamicScheme) obj);
                return lambda$onSecondaryFixed$124;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.f1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onSecondaryFixed$125;
                lambda$onSecondaryFixed$125 = MaterialDynamicColors.this.lambda$onSecondaryFixed$125((DynamicScheme) obj);
                return lambda$onSecondaryFixed$125;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onSecondaryFixed$126;
                lambda$onSecondaryFixed$126 = MaterialDynamicColors.this.lambda$onSecondaryFixed$126((DynamicScheme) obj);
                return lambda$onSecondaryFixed$126;
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryFixedVariant() {
        return new DynamicColor("on_secondary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.t0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onSecondaryFixedVariant$128;
                lambda$onSecondaryFixedVariant$128 = MaterialDynamicColors.lambda$onSecondaryFixedVariant$128((DynamicScheme) obj);
                return lambda$onSecondaryFixedVariant$128;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.w0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onSecondaryFixedVariant$129;
                lambda$onSecondaryFixedVariant$129 = MaterialDynamicColors.this.lambda$onSecondaryFixedVariant$129((DynamicScheme) obj);
                return lambda$onSecondaryFixedVariant$129;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.x0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onSecondaryFixedVariant$130;
                lambda$onSecondaryFixedVariant$130 = MaterialDynamicColors.this.lambda$onSecondaryFixedVariant$130((DynamicScheme) obj);
                return lambda$onSecondaryFixedVariant$130;
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onSurface() {
        return new DynamicColor("on_surface", new Function() { // from class: com.google.android.material.color.utilities.t2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onSurface$32;
                lambda$onSurface$32 = MaterialDynamicColors.lambda$onSurface$32((DynamicScheme) obj);
                return lambda$onSurface$32;
            }
        }, false, new j2(this), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSurfaceVariant() {
        return new DynamicColor("on_surface_variant", new Function() { // from class: com.google.android.material.color.utilities.f4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onSurfaceVariant$36;
                lambda$onSurfaceVariant$36 = MaterialDynamicColors.lambda$onSurfaceVariant$36((DynamicScheme) obj);
                return lambda$onSurfaceVariant$36;
            }
        }, false, new j2(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onTertiary() {
        return new DynamicColor("on_tertiary", new Function() { // from class: com.google.android.material.color.utilities.p4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onTertiary$83;
                lambda$onTertiary$83 = MaterialDynamicColors.lambda$onTertiary$83((DynamicScheme) obj);
                return lambda$onTertiary$83;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.r4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onTertiary$84;
                lambda$onTertiary$84 = MaterialDynamicColors.this.lambda$onTertiary$84((DynamicScheme) obj);
                return lambda$onTertiary$84;
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryContainer() {
        return new DynamicColor("on_tertiary_container", new Function() { // from class: com.google.android.material.color.utilities.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onTertiaryContainer$89;
                lambda$onTertiaryContainer$89 = MaterialDynamicColors.this.lambda$onTertiaryContainer$89((DynamicScheme) obj);
                return lambda$onTertiaryContainer$89;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onTertiaryContainer$90;
                lambda$onTertiaryContainer$90 = MaterialDynamicColors.this.lambda$onTertiaryContainer$90((DynamicScheme) obj);
                return lambda$onTertiaryContainer$90;
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryFixed() {
        return new DynamicColor("on_tertiary_fixed", new Function() { // from class: com.google.android.material.color.utilities.k4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.l4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onTertiaryFixed$138;
                lambda$onTertiaryFixed$138 = MaterialDynamicColors.lambda$onTertiaryFixed$138((DynamicScheme) obj);
                return lambda$onTertiaryFixed$138;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.n4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onTertiaryFixed$139;
                lambda$onTertiaryFixed$139 = MaterialDynamicColors.this.lambda$onTertiaryFixed$139((DynamicScheme) obj);
                return lambda$onTertiaryFixed$139;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onTertiaryFixed$140;
                lambda$onTertiaryFixed$140 = MaterialDynamicColors.this.lambda$onTertiaryFixed$140((DynamicScheme) obj);
                return lambda$onTertiaryFixed$140;
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryFixedVariant() {
        return new DynamicColor("on_tertiary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.b1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$onTertiaryFixedVariant$142;
                lambda$onTertiaryFixedVariant$142 = MaterialDynamicColors.lambda$onTertiaryFixedVariant$142((DynamicScheme) obj);
                return lambda$onTertiaryFixedVariant$142;
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onTertiaryFixedVariant$143;
                lambda$onTertiaryFixedVariant$143 = MaterialDynamicColors.this.lambda$onTertiaryFixedVariant$143((DynamicScheme) obj);
                return lambda$onTertiaryFixedVariant$143;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DynamicColor lambda$onTertiaryFixedVariant$144;
                lambda$onTertiaryFixedVariant$144 = MaterialDynamicColors.this.lambda$onTertiaryFixedVariant$144((DynamicScheme) obj);
                return lambda$onTertiaryFixedVariant$144;
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor outline() {
        return new DynamicColor("outline", new Function() { // from class: com.google.android.material.color.utilities.m0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$outline$43;
                lambda$outline$43 = MaterialDynamicColors.lambda$outline$43((DynamicScheme) obj);
                return lambda$outline$43;
            }
        }, false, new j2(this), null, new ContrastCurve(1.5d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public DynamicColor outlineVariant() {
        return new DynamicColor("outline_variant", new Function() { // from class: com.google.android.material.color.utilities.v3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.w3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$outlineVariant$45;
                lambda$outlineVariant$45 = MaterialDynamicColors.lambda$outlineVariant$45((DynamicScheme) obj);
                return lambda$outlineVariant$45;
            }
        }, false, new j2(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), null);
    }

    @NonNull
    public DynamicColor primary() {
        return new DynamicColor("primary", new Function() { // from class: com.google.android.material.color.utilities.b3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$primary$53;
                lambda$primary$53 = MaterialDynamicColors.lambda$primary$53((DynamicScheme) obj);
                return lambda$primary$53;
            }
        }, true, new j2(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.d3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$primary$54;
                lambda$primary$54 = MaterialDynamicColors.this.lambda$primary$54((DynamicScheme) obj);
                return lambda$primary$54;
            }
        });
    }

    @NonNull
    public DynamicColor primaryContainer() {
        return new DynamicColor("primary_container", new Function() { // from class: com.google.android.material.color.utilities.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.y1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$primaryContainer$59;
                lambda$primaryContainer$59 = MaterialDynamicColors.this.lambda$primaryContainer$59((DynamicScheme) obj);
                return lambda$primaryContainer$59;
            }
        }, true, new j2(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.u2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$primaryContainer$60;
                lambda$primaryContainer$60 = MaterialDynamicColors.this.lambda$primaryContainer$60((DynamicScheme) obj);
                return lambda$primaryContainer$60;
            }
        });
    }

    @NonNull
    public DynamicColor primaryFixed() {
        return new DynamicColor("primary_fixed", new Function() { // from class: com.google.android.material.color.utilities.x1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.z1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$primaryFixed$104;
                lambda$primaryFixed$104 = MaterialDynamicColors.lambda$primaryFixed$104((DynamicScheme) obj);
                return lambda$primaryFixed$104;
            }
        }, true, new j2(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.a2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$primaryFixed$105;
                lambda$primaryFixed$105 = MaterialDynamicColors.this.lambda$primaryFixed$105((DynamicScheme) obj);
                return lambda$primaryFixed$105;
            }
        });
    }

    @NonNull
    public DynamicColor primaryFixedDim() {
        return new DynamicColor("primary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.y2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.z2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$primaryFixedDim$107;
                lambda$primaryFixedDim$107 = MaterialDynamicColors.lambda$primaryFixedDim$107((DynamicScheme) obj);
                return lambda$primaryFixedDim$107;
            }
        }, true, new j2(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.a3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$primaryFixedDim$108;
                lambda$primaryFixedDim$108 = MaterialDynamicColors.this.lambda$primaryFixedDim$108((DynamicScheme) obj);
                return lambda$primaryFixedDim$108;
            }
        });
    }

    @NonNull
    public DynamicColor primaryPaletteKeyColor() {
        return DynamicColor.fromPalette("primary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.r2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$primaryPaletteKeyColor$1;
                lambda$primaryPaletteKeyColor$1 = MaterialDynamicColors.lambda$primaryPaletteKeyColor$1((DynamicScheme) obj);
                return lambda$primaryPaletteKeyColor$1;
            }
        });
    }

    @NonNull
    public DynamicColor scrim() {
        return new DynamicColor("scrim", new Function() { // from class: com.google.android.material.color.utilities.o3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$scrim$49;
                lambda$scrim$49 = MaterialDynamicColors.lambda$scrim$49((DynamicScheme) obj);
                return lambda$scrim$49;
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public DynamicColor secondary() {
        return new DynamicColor("secondary", new Function() { // from class: com.google.android.material.color.utilities.b4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$secondary$68;
                lambda$secondary$68 = MaterialDynamicColors.lambda$secondary$68((DynamicScheme) obj);
                return lambda$secondary$68;
            }
        }, true, new j2(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.x4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$secondary$69;
                lambda$secondary$69 = MaterialDynamicColors.this.lambda$secondary$69((DynamicScheme) obj);
                return lambda$secondary$69;
            }
        });
    }

    @NonNull
    public DynamicColor secondaryContainer() {
        return new DynamicColor("secondary_container", new Function() { // from class: com.google.android.material.color.utilities.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.u
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$secondaryContainer$74;
                lambda$secondaryContainer$74 = MaterialDynamicColors.this.lambda$secondaryContainer$74((DynamicScheme) obj);
                return lambda$secondaryContainer$74;
            }
        }, true, new j2(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$secondaryContainer$75;
                lambda$secondaryContainer$75 = MaterialDynamicColors.this.lambda$secondaryContainer$75((DynamicScheme) obj);
                return lambda$secondaryContainer$75;
            }
        });
    }

    @NonNull
    public DynamicColor secondaryFixed() {
        return new DynamicColor("secondary_fixed", new Function() { // from class: com.google.android.material.color.utilities.i5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$secondaryFixed$118;
                lambda$secondaryFixed$118 = MaterialDynamicColors.lambda$secondaryFixed$118((DynamicScheme) obj);
                return lambda$secondaryFixed$118;
            }
        }, true, new j2(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$secondaryFixed$119;
                lambda$secondaryFixed$119 = MaterialDynamicColors.this.lambda$secondaryFixed$119((DynamicScheme) obj);
                return lambda$secondaryFixed$119;
            }
        });
    }

    @NonNull
    public DynamicColor secondaryFixedDim() {
        return new DynamicColor("secondary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.b2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$secondaryFixedDim$121;
                lambda$secondaryFixedDim$121 = MaterialDynamicColors.lambda$secondaryFixedDim$121((DynamicScheme) obj);
                return lambda$secondaryFixedDim$121;
            }
        }, true, new j2(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.d2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$secondaryFixedDim$122;
                lambda$secondaryFixedDim$122 = MaterialDynamicColors.this.lambda$secondaryFixedDim$122((DynamicScheme) obj);
                return lambda$secondaryFixedDim$122;
            }
        });
    }

    @NonNull
    public DynamicColor secondaryPaletteKeyColor() {
        return DynamicColor.fromPalette("secondary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.k2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.l2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$secondaryPaletteKeyColor$3;
                lambda$secondaryPaletteKeyColor$3 = MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3((DynamicScheme) obj);
                return lambda$secondaryPaletteKeyColor$3;
            }
        });
    }

    @NonNull
    public DynamicColor shadow() {
        return new DynamicColor("shadow", new Function() { // from class: com.google.android.material.color.utilities.s4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.t4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$shadow$47;
                lambda$shadow$47 = MaterialDynamicColors.lambda$shadow$47((DynamicScheme) obj);
                return lambda$shadow$47;
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public DynamicColor surface() {
        return new DynamicColor("surface", new Function() { // from class: com.google.android.material.color.utilities.f0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$surface$16;
                lambda$surface$16 = MaterialDynamicColors.lambda$surface$16((DynamicScheme) obj);
                return lambda$surface$16;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceBright() {
        return new DynamicColor("surface_bright", new Function() { // from class: com.google.android.material.color.utilities.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$surfaceBright$20;
                lambda$surfaceBright$20 = MaterialDynamicColors.lambda$surfaceBright$20((DynamicScheme) obj);
                return lambda$surfaceBright$20;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainer() {
        return new DynamicColor("surface_container", new Function() { // from class: com.google.android.material.color.utilities.z3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.a4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$surfaceContainer$26;
                lambda$surfaceContainer$26 = MaterialDynamicColors.lambda$surfaceContainer$26((DynamicScheme) obj);
                return lambda$surfaceContainer$26;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerHigh() {
        return new DynamicColor("surface_container_high", new Function() { // from class: com.google.android.material.color.utilities.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.a0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$surfaceContainerHigh$28;
                lambda$surfaceContainerHigh$28 = MaterialDynamicColors.lambda$surfaceContainerHigh$28((DynamicScheme) obj);
                return lambda$surfaceContainerHigh$28;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerHighest() {
        return new DynamicColor("surface_container_highest", new Function() { // from class: com.google.android.material.color.utilities.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$surfaceContainerHighest$30;
                lambda$surfaceContainerHighest$30 = MaterialDynamicColors.lambda$surfaceContainerHighest$30((DynamicScheme) obj);
                return lambda$surfaceContainerHighest$30;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerLow() {
        return new DynamicColor("surface_container_low", new Function() { // from class: com.google.android.material.color.utilities.x3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.y3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$surfaceContainerLow$24;
                lambda$surfaceContainerLow$24 = MaterialDynamicColors.lambda$surfaceContainerLow$24((DynamicScheme) obj);
                return lambda$surfaceContainerLow$24;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerLowest() {
        return new DynamicColor("surface_container_lowest", new Function() { // from class: com.google.android.material.color.utilities.i3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.j3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$surfaceContainerLowest$22;
                lambda$surfaceContainerLowest$22 = MaterialDynamicColors.lambda$surfaceContainerLowest$22((DynamicScheme) obj);
                return lambda$surfaceContainerLowest$22;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceDim() {
        return new DynamicColor("surface_dim", new Function() { // from class: com.google.android.material.color.utilities.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$surfaceDim$18;
                lambda$surfaceDim$18 = MaterialDynamicColors.lambda$surfaceDim$18((DynamicScheme) obj);
                return lambda$surfaceDim$18;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceTint() {
        return new DynamicColor("surface_tint", new Function() { // from class: com.google.android.material.color.utilities.m2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.n2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$surfaceTint$51;
                lambda$surfaceTint$51 = MaterialDynamicColors.lambda$surfaceTint$51((DynamicScheme) obj);
                return lambda$surfaceTint$51;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceVariant() {
        return new DynamicColor("surface_variant", new Function() { // from class: com.google.android.material.color.utilities.o1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$surfaceVariant$34;
                lambda$surfaceVariant$34 = MaterialDynamicColors.lambda$surfaceVariant$34((DynamicScheme) obj);
                return lambda$surfaceVariant$34;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public DynamicColor tertiary() {
        return new DynamicColor("tertiary", new Function() { // from class: com.google.android.material.color.utilities.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$tertiary$80;
                lambda$tertiary$80 = MaterialDynamicColors.lambda$tertiary$80((DynamicScheme) obj);
                return lambda$tertiary$80;
            }
        }, true, new j2(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$tertiary$81;
                lambda$tertiary$81 = MaterialDynamicColors.this.lambda$tertiary$81((DynamicScheme) obj);
                return lambda$tertiary$81;
            }
        });
    }

    @NonNull
    public DynamicColor tertiaryContainer() {
        return new DynamicColor("tertiary_container", new Function() { // from class: com.google.android.material.color.utilities.d5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$tertiaryContainer$86;
                lambda$tertiaryContainer$86 = MaterialDynamicColors.this.lambda$tertiaryContainer$86((DynamicScheme) obj);
                return lambda$tertiaryContainer$86;
            }
        }, true, new j2(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.f5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$tertiaryContainer$87;
                lambda$tertiaryContainer$87 = MaterialDynamicColors.this.lambda$tertiaryContainer$87((DynamicScheme) obj);
                return lambda$tertiaryContainer$87;
            }
        });
    }

    @NonNull
    public DynamicColor tertiaryFixed() {
        return new DynamicColor("tertiary_fixed", new Function() { // from class: com.google.android.material.color.utilities.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$tertiaryFixed$132;
                lambda$tertiaryFixed$132 = MaterialDynamicColors.lambda$tertiaryFixed$132((DynamicScheme) obj);
                return lambda$tertiaryFixed$132;
            }
        }, true, new j2(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$tertiaryFixed$133;
                lambda$tertiaryFixed$133 = MaterialDynamicColors.this.lambda$tertiaryFixed$133((DynamicScheme) obj);
                return lambda$tertiaryFixed$133;
            }
        });
    }

    @NonNull
    public DynamicColor tertiaryFixedDim() {
        return new DynamicColor("tertiary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.a5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$tertiaryFixedDim$135;
                lambda$tertiaryFixedDim$135 = MaterialDynamicColors.lambda$tertiaryFixedDim$135((DynamicScheme) obj);
                return lambda$tertiaryFixedDim$135;
            }
        }, true, new j2(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: com.google.android.material.color.utilities.c5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ToneDeltaPair lambda$tertiaryFixedDim$136;
                lambda$tertiaryFixedDim$136 = MaterialDynamicColors.this.lambda$tertiaryFixedDim$136((DynamicScheme) obj);
                return lambda$tertiaryFixedDim$136;
            }
        });
    }

    @NonNull
    public DynamicColor tertiaryPaletteKeyColor() {
        return DynamicColor.fromPalette("tertiary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.m1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.n1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$tertiaryPaletteKeyColor$5;
                lambda$tertiaryPaletteKeyColor$5 = MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5((DynamicScheme) obj);
                return lambda$tertiaryPaletteKeyColor$5;
            }
        });
    }

    @NonNull
    public DynamicColor textHintInverse() {
        return DynamicColor.fromPalette("text_hint_inverse", new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$textHintInverse$161;
                lambda$textHintInverse$161 = MaterialDynamicColors.lambda$textHintInverse$161((DynamicScheme) obj);
                return lambda$textHintInverse$161;
            }
        });
    }

    @NonNull
    public DynamicColor textPrimaryInverse() {
        return DynamicColor.fromPalette("text_primary_inverse", new Function() { // from class: com.google.android.material.color.utilities.k3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.l3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$textPrimaryInverse$153;
                lambda$textPrimaryInverse$153 = MaterialDynamicColors.lambda$textPrimaryInverse$153((DynamicScheme) obj);
                return lambda$textPrimaryInverse$153;
            }
        });
    }

    @NonNull
    public DynamicColor textPrimaryInverseDisableOnly() {
        return DynamicColor.fromPalette("text_primary_inverse_disable_only", new Function() { // from class: com.google.android.material.color.utilities.r0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$textPrimaryInverseDisableOnly$157;
                lambda$textPrimaryInverseDisableOnly$157 = MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157((DynamicScheme) obj);
                return lambda$textPrimaryInverseDisableOnly$157;
            }
        });
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverse() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse", new Function() { // from class: com.google.android.material.color.utilities.f3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$textSecondaryAndTertiaryInverse$155;
                lambda$textSecondaryAndTertiaryInverse$155 = MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155((DynamicScheme) obj);
                return lambda$textSecondaryAndTertiaryInverse$155;
            }
        });
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse_disabled", new Function() { // from class: com.google.android.material.color.utilities.u4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette tonalPalette;
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$textSecondaryAndTertiaryInverseDisabled$159;
                lambda$textSecondaryAndTertiaryInverseDisabled$159 = MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$159((DynamicScheme) obj);
                return lambda$textSecondaryAndTertiaryInverseDisabled$159;
            }
        });
    }

    public MaterialDynamicColors(boolean z7) {
        this.isExtendedFidelity = z7;
    }
}
