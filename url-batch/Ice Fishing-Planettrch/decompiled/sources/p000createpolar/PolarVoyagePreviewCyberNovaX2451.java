package p000createpolar;

import java.io.Serializable;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePreviewCyberNovaX2451 implements Serializable {
    public static final PolarVoyagePreviewCyberNovaX2451 PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyagePreviewCyberNovaX2451(new int[0]);
    public final int[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyagePreviewCyberNovaX2451(int[] iArr) {
        int length = iArr.length;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = iArr;
        this.PolarVoyageStrictModeLegendEpic1532 = length;
    }

    public final boolean equals(Object obj) {
        PolarVoyagePreviewCyberNovaX2451 polarVoyagePreviewCyberNovaX2451;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof PolarVoyagePreviewCyberNovaX2451) && (i2 = this.PolarVoyageStrictModeLegendEpic1532) == (i = (polarVoyagePreviewCyberNovaX2451 = (PolarVoyagePreviewCyberNovaX2451) obj).PolarVoyageStrictModeLegendEpic1532)) {
            for (int i3 = 0; i3 < i2; i3++) {
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDisplayMetricsVortexDragon9516(i3, i2);
                int i4 = this.PolarVoyageItemDecorationUltraDeltaEpic7485[i3];
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDisplayMetricsVortexDragon9516(i3, i);
                if (i4 == polarVoyagePreviewCyberNovaX2451.PolarVoyageItemDecorationUltraDeltaEpic7485[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.PolarVoyageStrictModeLegendEpic1532; i2++) {
            i = (i * 31) + this.PolarVoyageItemDecorationUltraDeltaEpic7485[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
