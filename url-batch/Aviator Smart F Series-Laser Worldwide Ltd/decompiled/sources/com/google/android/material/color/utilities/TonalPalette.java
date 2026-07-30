package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    private static final class KeyColor {
        private static final double MAX_CHROMA_VALUE = 200.0d;
        private final Map<Integer, Double> chromaCache = new HashMap();
        private final double hue;
        private final double requestedChroma;

        public KeyColor(double d8, double d9) {
            this.hue = d8;
            this.requestedChroma = d9;
        }

        private double maxChroma(int i8) {
            Double valueOf;
            if (this.chromaCache.get(Integer.valueOf(i8)) == null && (valueOf = Double.valueOf(Hct.from(this.hue, 200.0d, i8).getChroma())) != null) {
                this.chromaCache.put(Integer.valueOf(i8), valueOf);
            }
            return this.chromaCache.get(Integer.valueOf(i8)).doubleValue();
        }

        public Hct create() {
            int i8 = 100;
            int i9 = 0;
            while (i9 < i8) {
                int i10 = (i9 + i8) / 2;
                int i11 = i10 + 1;
                boolean z7 = maxChroma(i10) < maxChroma(i11);
                if (maxChroma(i10) >= this.requestedChroma - 0.01d) {
                    if (Math.abs(i9 - 50) < Math.abs(i8 - 50)) {
                        i8 = i10;
                    } else {
                        if (i9 == i10) {
                            return Hct.from(this.hue, this.requestedChroma, i9);
                        }
                        i9 = i10;
                    }
                } else if (z7) {
                    i9 = i11;
                } else {
                    i8 = i10;
                }
            }
            return Hct.from(this.hue, this.requestedChroma, i9);
        }
    }

    private TonalPalette(double d8, double d9, Hct hct) {
        this.hue = d8;
        this.chroma = d9;
        this.keyColor = hct;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d8, double d9) {
        return new TonalPalette(d8, d9, new KeyColor(d8, d9).create());
    }

    public static TonalPalette fromInt(int i8) {
        return fromHct(Hct.fromInt(i8));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d8) {
        return Hct.from(this.hue, this.chroma, d8);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i8) {
        Integer num = this.cache.get(Integer.valueOf(i8));
        if (num == null) {
            num = Integer.valueOf(Hct.from(this.hue, this.chroma, i8).toInt());
            this.cache.put(Integer.valueOf(i8), num);
        }
        return num.intValue();
    }
}
