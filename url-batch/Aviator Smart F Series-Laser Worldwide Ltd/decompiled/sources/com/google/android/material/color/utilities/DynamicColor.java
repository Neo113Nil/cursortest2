package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final ContrastCurve contrastCurve;
    private final HashMap<DynamicScheme, Hct> hctCache;
    public final boolean isBackground;
    public final String name;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, TonalPalette> palette;
    public final Function<DynamicScheme, DynamicColor> secondBackground;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaPair> toneDeltaPair;

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z7, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z7;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public static double enableLightForeground(double d8) {
        if (!tonePrefersLightForeground(d8) || toneAllowsLightForeground(d8)) {
            return d8;
        }
        return 49.0d;
    }

    public static double foregroundTone(double d8, double d9) {
        double lighterUnsafe = Contrast.lighterUnsafe(d8, d9);
        double darkerUnsafe = Contrast.darkerUnsafe(d8, d9);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d8);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d8);
        if (tonePrefersLightForeground(d8)) {
            return (ratioOfTones >= d9 || ratioOfTones >= ratioOfTones2 || ((Math.abs(ratioOfTones - ratioOfTones2) > 0.1d ? 1 : (Math.abs(ratioOfTones - ratioOfTones2) == 0.1d ? 0 : -1)) < 0 && (ratioOfTones > d9 ? 1 : (ratioOfTones == d9 ? 0 : -1)) < 0 && (ratioOfTones2 > d9 ? 1 : (ratioOfTones2 == d9 ? 0 : -1)) < 0)) ? lighterUnsafe : darkerUnsafe;
        }
        return (ratioOfTones2 >= d9 || ratioOfTones2 >= ratioOfTones) ? darkerUnsafe : lighterUnsafe;
    }

    @NonNull
    public static DynamicColor fromArgb(@NonNull String str, int i8) {
        final Hct fromInt = Hct.fromInt(i8);
        final TonalPalette fromInt2 = TonalPalette.fromInt(i8);
        return fromPalette(str, new Function() { // from class: com.google.android.material.color.utilities.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette lambda$fromArgb$0;
                lambda$fromArgb$0 = DynamicColor.lambda$fromArgb$0(TonalPalette.this, (DynamicScheme) obj);
                return lambda$fromArgb$0;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$fromArgb$1;
                lambda$fromArgb$1 = DynamicColor.lambda$fromArgb$1(Hct.this, (DynamicScheme) obj);
                return lambda$fromArgb$1;
            }
        });
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2) {
        return new DynamicColor(str, function, function2, false, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromArgb$1(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    public static boolean toneAllowsLightForeground(double d8) {
        return Math.round(d8) <= 49;
    }

    public static boolean tonePrefersLightForeground(double d8) {
        return Math.round(d8) < 60;
    }

    public int getArgb(@NonNull DynamicScheme dynamicScheme) {
        Object apply;
        int i8 = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i8;
        }
        apply = function.apply(dynamicScheme);
        return (MathUtils.clampInt(0, 255, (int) Math.round(((Double) apply).doubleValue() * 255.0d)) << 24) | (i8 & ViewCompat.MEASURED_SIZE_MASK);
    }

    @NonNull
    public Hct getHct(@NonNull DynamicScheme dynamicScheme) {
        Object apply;
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        double tone = getTone(dynamicScheme);
        apply = this.palette.apply(dynamicScheme);
        Hct hct2 = ((TonalPalette) apply).getHct(tone);
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, hct2);
        return hct2;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x022b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double getTone(@NonNull DynamicScheme dynamicScheme) {
        Object apply;
        Object apply2;
        double d8;
        Object apply3;
        Object apply4;
        Object apply5;
        Object apply6;
        Object apply7;
        Object apply8;
        double d9;
        boolean z7 = dynamicScheme.contrastLevel < com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        Function<DynamicScheme, ToneDeltaPair> function = this.toneDeltaPair;
        if (function != null) {
            apply5 = function.apply(dynamicScheme);
            ToneDeltaPair toneDeltaPair = (ToneDeltaPair) apply5;
            DynamicColor roleA = toneDeltaPair.getRoleA();
            DynamicColor roleB = toneDeltaPair.getRoleB();
            double delta = toneDeltaPair.getDelta();
            TonePolarity polarity = toneDeltaPair.getPolarity();
            boolean stayTogether = toneDeltaPair.getStayTogether();
            apply6 = this.background.apply(dynamicScheme);
            double tone = ((DynamicColor) apply6).getTone(dynamicScheme);
            boolean z8 = polarity == TonePolarity.NEARER || (polarity == TonePolarity.LIGHTER && !dynamicScheme.isDark) || (polarity == TonePolarity.DARKER && dynamicScheme.isDark);
            DynamicColor dynamicColor = z8 ? roleA : roleB;
            DynamicColor dynamicColor2 = z8 ? roleB : roleA;
            boolean equals = this.name.equals(dynamicColor.name);
            double d10 = dynamicScheme.isDark ? 1.0d : -1.0d;
            double d11 = dynamicColor.contrastCurve.get(dynamicScheme.contrastLevel);
            double d12 = dynamicColor2.contrastCurve.get(dynamicScheme.contrastLevel);
            apply7 = dynamicColor.tone.apply(dynamicScheme);
            double doubleValue = ((Double) apply7).doubleValue();
            if (Contrast.ratioOfTones(tone, doubleValue) < d11) {
                doubleValue = foregroundTone(tone, d11);
            }
            apply8 = dynamicColor2.tone.apply(dynamicScheme);
            double doubleValue2 = ((Double) apply8).doubleValue();
            if (Contrast.ratioOfTones(tone, doubleValue2) < d12) {
                doubleValue2 = foregroundTone(tone, d12);
            }
            if (z7) {
                doubleValue = foregroundTone(tone, d11);
                doubleValue2 = foregroundTone(tone, d12);
            }
            if ((doubleValue2 - doubleValue) * d10 < delta) {
                double d13 = delta * d10;
                doubleValue2 = MathUtils.clampDouble(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, 100.0d, doubleValue + d13);
                if ((doubleValue2 - doubleValue) * d10 < delta) {
                    doubleValue = MathUtils.clampDouble(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, 100.0d, doubleValue2 - d13);
                }
            }
            if (50.0d > doubleValue || doubleValue >= 60.0d) {
                if (50.0d > doubleValue2 || doubleValue2 >= 60.0d) {
                    d9 = doubleValue2;
                } else if (!stayTogether) {
                    d9 = d10 > com.github.mikephil.charting.utils.i.DOUBLE_EPSILON ? 60.0d : 49.0d;
                } else if (d10 > com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                    d9 = Math.max(doubleValue2, (delta * d10) + 60.0d);
                    doubleValue = 60.0d;
                } else {
                    d9 = Math.min(doubleValue2, (delta * d10) + 49.0d);
                    doubleValue = 49.0d;
                }
            } else if (d10 > com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                doubleValue = 60.0d;
                d9 = Math.max(doubleValue2, (delta * d10) + 60.0d);
            } else {
                d9 = Math.min(doubleValue2, (delta * d10) + 49.0d);
                doubleValue = 49.0d;
            }
            return equals ? doubleValue : d9;
        }
        apply = this.tone.apply(dynamicScheme);
        double doubleValue3 = ((Double) apply).doubleValue();
        Function<DynamicScheme, DynamicColor> function2 = this.background;
        if (function2 == null) {
            return doubleValue3;
        }
        apply2 = function2.apply(dynamicScheme);
        double tone2 = ((DynamicColor) apply2).getTone(dynamicScheme);
        double d14 = this.contrastCurve.get(dynamicScheme.contrastLevel);
        if (Contrast.ratioOfTones(tone2, doubleValue3) < d14) {
            doubleValue3 = foregroundTone(tone2, d14);
        }
        if (z7) {
            doubleValue3 = foregroundTone(tone2, d14);
        }
        if (this.isBackground && 50.0d <= doubleValue3) {
            d8 = 60.0d;
            if (doubleValue3 < 60.0d) {
                if (Contrast.ratioOfTones(49.0d, tone2) >= d14) {
                    d8 = 49.0d;
                }
                if (this.secondBackground != null) {
                    return d8;
                }
                apply3 = this.background.apply(dynamicScheme);
                double tone3 = ((DynamicColor) apply3).getTone(dynamicScheme);
                apply4 = this.secondBackground.apply(dynamicScheme);
                double tone4 = ((DynamicColor) apply4).getTone(dynamicScheme);
                double max = Math.max(tone3, tone4);
                double min = Math.min(tone3, tone4);
                if (Contrast.ratioOfTones(max, d8) >= d14 && Contrast.ratioOfTones(min, d8) >= d14) {
                    return d8;
                }
                double lighter = Contrast.lighter(max, d14);
                double darker = Contrast.darker(min, d14);
                ArrayList arrayList = new ArrayList();
                if (lighter != -1.0d) {
                    arrayList.add(Double.valueOf(lighter));
                }
                if (darker != -1.0d) {
                    arrayList.add(Double.valueOf(darker));
                }
                if (!tonePrefersLightForeground(tone3) && !tonePrefersLightForeground(tone4)) {
                    return arrayList.size() == 1 ? ((Double) arrayList.get(0)).doubleValue() : darker == -1.0d ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : darker;
                }
                if (lighter == -1.0d) {
                    return 100.0d;
                }
                return lighter;
            }
        }
        d8 = doubleValue3;
        if (this.secondBackground != null) {
        }
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z7) {
        return new DynamicColor(str, function, function2, z7, null, null, null, null);
    }

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z7, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5, @Nullable Function<DynamicScheme, Double> function6) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z7;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }
}
