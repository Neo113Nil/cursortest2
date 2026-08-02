package org.apache.commons.imaging.formats.png;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public class GammaCorrection {
    private static final Logger LOGGER = Logger.getLogger(GammaCorrection.class.getName());
    private final int[] lookupTable;

    public GammaCorrection(double d, double d2) {
        Logger logger = LOGGER;
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest("src_gamma: " + d);
            logger.finest("dst_gamma: " + d2);
        }
        this.lookupTable = new int[256];
        int i = 0;
        while (i < 256) {
            GammaCorrection gammaCorrection = this;
            double d3 = d;
            double d4 = d2;
            this.lookupTable[i] = gammaCorrection.correctSample(i, d3, d4);
            Logger logger2 = LOGGER;
            if (logger2.isLoggable(Level.FINEST)) {
                StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "lookup_table[", "]: ");
                m2m.append(gammaCorrection.lookupTable[i]);
                logger2.finest(m2m.toString());
            }
            i++;
            this = gammaCorrection;
            d = d3;
            d2 = d4;
        }
    }

    private int correctSample(int i, double d, double d2) {
        return (int) Math.round(Math.pow(i / 255.0d, d / d2) * 255.0d);
    }

    public int correctARGB(int i) {
        int i2 = (-16777216) & i;
        int correctSample = correctSample((i >> 16) & 255);
        int correctSample2 = correctSample((i >> 8) & 255);
        return (correctSample(i & 255) & 255) | ((correctSample & 255) << 16) | i2 | ((correctSample2 & 255) << 8);
    }

    public int correctSample(int i) {
        return this.lookupTable[i];
    }
}
