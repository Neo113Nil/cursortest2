package org.apache.commons.imaging.palette;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
class ColorGroup {
    final int alphaDiff;
    final int blueDiff;
    private final List<ColorCount> colorCounts;
    ColorGroupCut cut;
    final int diffTotal;
    final int greenDiff;
    final boolean ignoreAlpha;
    int maxAlpha;
    int maxBlue;
    final int maxDiff;
    int maxGreen;
    int maxRed;
    int minAlpha;
    int minBlue;
    int minGreen;
    int minRed;
    int paletteIndex = -1;
    final int redDiff;
    final int totalPoints;

    public ColorGroup(List<ColorCount> list, boolean z) {
        this.minRed = Integer.MAX_VALUE;
        this.maxRed = PKIFailureInfo.systemUnavail;
        this.minGreen = Integer.MAX_VALUE;
        this.maxGreen = PKIFailureInfo.systemUnavail;
        this.minBlue = Integer.MAX_VALUE;
        this.maxBlue = PKIFailureInfo.systemUnavail;
        this.minAlpha = Integer.MAX_VALUE;
        this.maxAlpha = PKIFailureInfo.systemUnavail;
        this.colorCounts = list;
        this.ignoreAlpha = z;
        if (list.isEmpty()) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("empty color_group");
            throw null;
        }
        int i = 0;
        for (ColorCount colorCount : list) {
            i += colorCount.count;
            this.minAlpha = Math.min(this.minAlpha, colorCount.alpha);
            this.maxAlpha = Math.max(this.maxAlpha, colorCount.alpha);
            this.minRed = Math.min(this.minRed, colorCount.red);
            this.maxRed = Math.max(this.maxRed, colorCount.red);
            this.minGreen = Math.min(this.minGreen, colorCount.green);
            this.maxGreen = Math.max(this.maxGreen, colorCount.green);
            this.minBlue = Math.min(this.minBlue, colorCount.blue);
            this.maxBlue = Math.max(this.maxBlue, colorCount.blue);
        }
        this.totalPoints = i;
        int i2 = this.maxAlpha - this.minAlpha;
        this.alphaDiff = i2;
        int i3 = this.maxRed - this.minRed;
        this.redDiff = i3;
        int i4 = this.maxGreen - this.minGreen;
        this.greenDiff = i4;
        int i5 = this.maxBlue - this.minBlue;
        this.blueDiff = i5;
        this.maxDiff = Math.max(z ? i3 : Math.max(i2, i3), Math.max(i4, i5));
        this.diffTotal = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(z ? 0 : i2, i3, i4, i5);
    }

    public boolean contains(int i) {
        int i2 = (i >> 24) & 255;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 8) & 255;
        int i5 = i & 255;
        return (this.ignoreAlpha || (i2 >= this.minAlpha && i2 <= this.maxAlpha)) && i3 >= this.minRed && i3 <= this.maxRed && i4 >= this.minGreen && i4 <= this.maxGreen && i5 >= this.minBlue && i5 <= this.maxBlue;
    }

    public List<ColorCount> getColorCounts() {
        return new ArrayList(this.colorCounts);
    }

    public int getMedianValue() {
        Iterator<ColorCount> it = this.colorCounts.iterator();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (it.hasNext()) {
            j += it.next().count;
            j2 += r11.alpha * r12;
            j3 += r11.red * r12;
            j4 += r11.green * r12;
            j5 += r12 * r11.blue;
        }
        double d = j;
        return ((this.ignoreAlpha ? 255 : (int) Math.round(j2 / j)) << 24) | (((int) Math.round(j3 / d)) << 16) | (((int) Math.round(j4 / d)) << 8) | ((int) Math.round(j5 / d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ColorGroup. minRed: ");
        NavAction$$ExternalSyntheticOutline0.m(this.minRed, ", maxRed: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.maxRed, ", minGreen: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.minGreen, ", maxGreen: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.maxGreen, ", minBlue: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.minBlue, ", maxBlue: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.maxBlue, ", minAlpha: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.minAlpha, ", maxAlpha: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.maxAlpha, ", maxDiff: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.maxDiff, ", diffTotal: ", sb);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.diffTotal, "}", sb);
    }
}
